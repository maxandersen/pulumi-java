// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderManagedScalingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityProviderAutoScalingGroupProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final CapacityProviderAutoScalingGroupProviderArgs Empty = new CapacityProviderAutoScalingGroupProviderArgs();

    /**
     * - ARN of the associated auto scaling group.
     * 
     */
    @Import(name="autoScalingGroupArn", required=true)
      private final Output<String> autoScalingGroupArn;

    public Output<String> autoScalingGroupArn() {
        return this.autoScalingGroupArn;
    }

    /**
     * - Configuration block defining the parameters of the auto scaling. Detailed below.
     * 
     */
    @Import(name="managedScaling")
      private final @Nullable Output<CapacityProviderAutoScalingGroupProviderManagedScalingArgs> managedScaling;

    public Output<CapacityProviderAutoScalingGroupProviderManagedScalingArgs> managedScaling() {
        return this.managedScaling == null ? Codegen.empty() : this.managedScaling;
    }

    /**
     * - Enables or disables container-aware termination of instances in the auto scaling group when scale-in happens. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    @Import(name="managedTerminationProtection")
      private final @Nullable Output<String> managedTerminationProtection;

    public Output<String> managedTerminationProtection() {
        return this.managedTerminationProtection == null ? Codegen.empty() : this.managedTerminationProtection;
    }

    public CapacityProviderAutoScalingGroupProviderArgs(
        Output<String> autoScalingGroupArn,
        @Nullable Output<CapacityProviderAutoScalingGroupProviderManagedScalingArgs> managedScaling,
        @Nullable Output<String> managedTerminationProtection) {
        this.autoScalingGroupArn = Objects.requireNonNull(autoScalingGroupArn, "expected parameter 'autoScalingGroupArn' to be non-null");
        this.managedScaling = managedScaling;
        this.managedTerminationProtection = managedTerminationProtection;
    }

    private CapacityProviderAutoScalingGroupProviderArgs() {
        this.autoScalingGroupArn = Codegen.empty();
        this.managedScaling = Codegen.empty();
        this.managedTerminationProtection = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderAutoScalingGroupProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> autoScalingGroupArn;
        private @Nullable Output<CapacityProviderAutoScalingGroupProviderManagedScalingArgs> managedScaling;
        private @Nullable Output<String> managedTerminationProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderAutoScalingGroupProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupArn = defaults.autoScalingGroupArn;
    	      this.managedScaling = defaults.managedScaling;
    	      this.managedTerminationProtection = defaults.managedTerminationProtection;
        }

        public Builder autoScalingGroupArn(Output<String> autoScalingGroupArn) {
            this.autoScalingGroupArn = Objects.requireNonNull(autoScalingGroupArn);
            return this;
        }
        public Builder autoScalingGroupArn(String autoScalingGroupArn) {
            this.autoScalingGroupArn = Output.of(Objects.requireNonNull(autoScalingGroupArn));
            return this;
        }
        public Builder managedScaling(@Nullable Output<CapacityProviderAutoScalingGroupProviderManagedScalingArgs> managedScaling) {
            this.managedScaling = managedScaling;
            return this;
        }
        public Builder managedScaling(@Nullable CapacityProviderAutoScalingGroupProviderManagedScalingArgs managedScaling) {
            this.managedScaling = Codegen.ofNullable(managedScaling);
            return this;
        }
        public Builder managedTerminationProtection(@Nullable Output<String> managedTerminationProtection) {
            this.managedTerminationProtection = managedTerminationProtection;
            return this;
        }
        public Builder managedTerminationProtection(@Nullable String managedTerminationProtection) {
            this.managedTerminationProtection = Codegen.ofNullable(managedTerminationProtection);
            return this;
        }        public CapacityProviderAutoScalingGroupProviderArgs build() {
            return new CapacityProviderAutoScalingGroupProviderArgs(autoScalingGroupArn, managedScaling, managedTerminationProtection);
        }
    }
}
