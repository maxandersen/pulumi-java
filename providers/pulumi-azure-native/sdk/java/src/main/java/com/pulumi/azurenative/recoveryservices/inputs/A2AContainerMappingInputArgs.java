// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.AgentAutoUpdateStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A2A container mapping input.
 * 
 */
public final class A2AContainerMappingInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final A2AContainerMappingInputArgs Empty = new A2AContainerMappingInputArgs();

    /**
     * A value indicating whether the auto update is enabled.
     * 
     */
    @Import(name="agentAutoUpdateStatus")
    private @Nullable Output<Either<String,AgentAutoUpdateStatus>> agentAutoUpdateStatus;

    public Optional<Output<Either<String,AgentAutoUpdateStatus>>> agentAutoUpdateStatus() {
        return Optional.ofNullable(this.agentAutoUpdateStatus);
    }

    /**
     * The automation account arm id.
     * 
     */
    @Import(name="automationAccountArmId")
    private @Nullable Output<String> automationAccountArmId;

    public Optional<Output<String>> automationAccountArmId() {
        return Optional.ofNullable(this.automationAccountArmId);
    }

    /**
     * The class type.
     * Expected value is &#39;A2A&#39;.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    private A2AContainerMappingInputArgs() {}

    private A2AContainerMappingInputArgs(A2AContainerMappingInputArgs $) {
        this.agentAutoUpdateStatus = $.agentAutoUpdateStatus;
        this.automationAccountArmId = $.automationAccountArmId;
        this.instanceType = $.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(A2AContainerMappingInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private A2AContainerMappingInputArgs $;

        public Builder() {
            $ = new A2AContainerMappingInputArgs();
        }

        public Builder(A2AContainerMappingInputArgs defaults) {
            $ = new A2AContainerMappingInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentAutoUpdateStatus(@Nullable Output<Either<String,AgentAutoUpdateStatus>> agentAutoUpdateStatus) {
            $.agentAutoUpdateStatus = agentAutoUpdateStatus;
            return this;
        }

        public Builder agentAutoUpdateStatus(Either<String,AgentAutoUpdateStatus> agentAutoUpdateStatus) {
            return agentAutoUpdateStatus(Output.of(agentAutoUpdateStatus));
        }

        public Builder automationAccountArmId(@Nullable Output<String> automationAccountArmId) {
            $.automationAccountArmId = automationAccountArmId;
            return this;
        }

        public Builder automationAccountArmId(String automationAccountArmId) {
            return automationAccountArmId(Output.of(automationAccountArmId));
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public A2AContainerMappingInputArgs build() {
            $.instanceType = Codegen.stringProp("instanceType").output().arg($.instanceType).getNullable();
            return $;
        }
    }

}
