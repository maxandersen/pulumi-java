package com.pulumi.resources;

import com.pulumi.core.Output;
import com.pulumi.core.OutputTests;
import com.pulumi.core.Tuples;
import com.pulumi.core.Tuples.Tuple2;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.internal.Internal;
import com.pulumi.deployment.MocksTest;
import com.pulumi.deployment.internal.TestOptions;
import com.pulumi.exceptions.RunException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.Map;
import java.util.function.Supplier;

import static com.pulumi.deployment.internal.DeploymentTests.DeploymentMockBuilder;
import static com.pulumi.deployment.internal.DeploymentTests.cleanupDeploymentMocks;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

class StackTest {

    private static class ValidStack extends Stack {

        @Export(name = "foo", type = String.class)
        private final Output<String> explicitName;

        @Export(type = String.class)
        private final Output<String> implicitName;

        public ValidStack() {
            this.explicitName = Output.of("bar");
            this.implicitName = Output.of("buzz");
        }
    }

    @Test
    void testValidStackInstantiationSucceeds() {
        var result = run(ValidStack::new);
        assertThat(result.t2).hasSize(3);
        assertThat(result.t2).containsKey("foo");
        assertThat(
                OutputTests.waitFor(result.t1.explicitName)
        ).isSameAs(
                OutputTests.waitFor(result.t2.get("foo"))
        );

        assertThat(result.t2).containsKey("implicitName");
        assertThat(
                OutputTests.waitFor(result.t1.implicitName)
        ).isSameAs(
                OutputTests.waitFor(result.t2.get("implicitName"))
        );
    }

    private static class NullOutputStack extends Stack {
        @SuppressWarnings("unused")
        @Export(name = "foo", type = String.class)
        public Output<String> foo = null;
    }

    @Test
    void testStackWithNullOutputsThrows() {
        assertThatThrownBy(() -> run(NullOutputStack::new))
                .isInstanceOf(RunException.class)
                .hasMessageContaining("Output(s) 'foo' have no value assigned");
    }

    private static class InvalidOutputTypeStack extends Stack {
        @Export(name = "foo", type = String.class)
        public String foo;

        public InvalidOutputTypeStack() {
            this.foo = "bar";
        }
    }

    @Test
    void testStackWithInvalidOutputTypeThrows() {
        assertThatThrownBy(() -> run(InvalidOutputTypeStack::new))
                .isInstanceOf(RunException.class)
                .hasMessageContaining("Output field(s) 'foo' have incorrect type");
    }

    private <T extends Stack> Tuple2<T, Map<String, Output<?>>> run(Supplier<T> factory) {
        var mock = DeploymentMockBuilder.builder()
                .setMocks(new MocksTest.MyMocks())
                .setOptions(new TestOptions("TestProject", "TestStack"))
                .setSpyGlobalInstance();

        var stack = factory.get();
        Internal.from(stack).registerPropertyOutputs();

        //noinspection unchecked
        ArgumentCaptor<Output<Map<String, Output<?>>>> outputsCaptor = ArgumentCaptor.forClass(Output.class);

        // TODO: is this OK that we're called twice?
        verify(mock.deployment, atLeastOnce()).registerResourceOutputs(any(Resource.class), outputsCaptor.capture());

        var values = OutputTests.waitFor(outputsCaptor.getValue()).getValueNullable();
        return Tuples.of(stack, values);
    }

    @AfterEach
    void cleanup() {
        cleanupDeploymentMocks();
    }
}
