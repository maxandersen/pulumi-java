package com.pulumi.resources;

import com.pulumi.Log;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Internal;
import com.pulumi.deployment.internal.DeploymentTests;
import org.junit.jupiter.api.Test;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

import static com.pulumi.core.OutputTests.waitFor;
import static org.assertj.core.api.Assertions.assertThat;

class ResourceArgsTest {

    private final static Log log = DeploymentTests.mockLog();

    public static class ComplexResourceArgs1 extends ResourceArgs {
        @Import
        @Nullable
        public Output<String> s = null;

        @Import(name = "array")
        @Nullable
        private Output<List<Boolean>> array = null;

        public Output<List<Boolean>> getArray() {
            return this.array == null ? Output.ofList() : this.array;
        }

        public void setArray(@Nullable Output<List<Boolean>> value) {
            this.array = value;
        }
    }

    @Test
    void testComplexResourceArgs1_emptyValues() {
        var args = new ComplexResourceArgs1();
        var map = Internal.from(args).toMapAsync(log).join();

        assertThat(map).containsKey("s");
        assertThat(map).containsKey("array");

        assertThat(waitFor(map.get("s")).getValueNullable()).isNull();
        assertThat(waitFor(map.get("array")).getValueNullable()).isNull();
    }

    @Test
    void testComplexResourceArgs1_simpleValues() {
        var args = new ComplexResourceArgs1();
        args.s = Output.of("s");
        args.array = Output.of(List.of(true, false));
        var map = Internal.from(args).toMapAsync(log).join();

        assertThat(map).containsKey("s");
        assertThat(map).containsKey("array");

        assertThat(waitFor(map.get("s")).getValueNullable()).isEqualTo("s");
        assertThat(waitFor(map.get("array")).getValueNullable()).isEqualTo(List.of(true, false));
    }

    public static class JsonResourceArgs1 extends ResourceArgs {
        @Import(name = "array", json = true)
        @Nullable
        private Output<List<Boolean>> array = null;

        @Import(name = "map", json = true)
        @Nullable
        private Output<Map<String, Integer>> map = null;

        public Output<List<Boolean>> getArray() {
            return this.array == null ? Output.ofList() : this.array;
        }

        public void setArray(@Nullable Output<List<Boolean>> value) {
            this.array = value;
        }

        public Output<Map<String, Integer>> getMap() {
            return this.map == null ? Output.ofMap() : this.map;
        }

        public void setMap(@Nullable Output<Map<String, Integer>> value) {
            this.map = value;
        }
    }

    @Test
    void testJsonMap() {
        var args = new JsonResourceArgs1();
        args.setArray(Output.ofList(true, false));
        args.setMap(Output.ofMap("k1", 1, "k2", 2));
        var map = Internal.from(args).toMapAsync(log).join();

        assertThat(map).containsKey("array");
        assertThat(map).containsKey("map");

        assertThat(waitFor(map.get("array")).getValueNullable()).isNotNull().isEqualTo("[true,false]");
        assertThat(waitFor(map.get("map")).getValueNullable()).isNotNull().isEqualTo("{\"k1\":1.0,\"k2\":2.0}");
    }
}