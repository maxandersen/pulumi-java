// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.AutoscalingPolicyCpuUtilizationPredictiveMethod;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CPU utilization policy.
 * 
 */
public final class AutoscalingPolicyCpuUtilizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyCpuUtilizationArgs Empty = new AutoscalingPolicyCpuUtilizationArgs();

    /**
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * 
     */
    @Import(name="predictiveMethod")
      private final @Nullable Output<AutoscalingPolicyCpuUtilizationPredictiveMethod> predictiveMethod;

    public Output<AutoscalingPolicyCpuUtilizationPredictiveMethod> predictiveMethod() {
        return this.predictiveMethod == null ? Codegen.empty() : this.predictiveMethod;
    }

    /**
     * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
     * 
     */
    @Import(name="utilizationTarget")
      private final @Nullable Output<Double> utilizationTarget;

    public Output<Double> utilizationTarget() {
        return this.utilizationTarget == null ? Codegen.empty() : this.utilizationTarget;
    }

    public AutoscalingPolicyCpuUtilizationArgs(
        @Nullable Output<AutoscalingPolicyCpuUtilizationPredictiveMethod> predictiveMethod,
        @Nullable Output<Double> utilizationTarget) {
        this.predictiveMethod = predictiveMethod;
        this.utilizationTarget = utilizationTarget;
    }

    private AutoscalingPolicyCpuUtilizationArgs() {
        this.predictiveMethod = Codegen.empty();
        this.utilizationTarget = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyCpuUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoscalingPolicyCpuUtilizationPredictiveMethod> predictiveMethod;
        private @Nullable Output<Double> utilizationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyCpuUtilizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predictiveMethod = defaults.predictiveMethod;
    	      this.utilizationTarget = defaults.utilizationTarget;
        }

        public Builder predictiveMethod(@Nullable Output<AutoscalingPolicyCpuUtilizationPredictiveMethod> predictiveMethod) {
            this.predictiveMethod = predictiveMethod;
            return this;
        }
        public Builder predictiveMethod(@Nullable AutoscalingPolicyCpuUtilizationPredictiveMethod predictiveMethod) {
            this.predictiveMethod = Codegen.ofNullable(predictiveMethod);
            return this;
        }
        public Builder utilizationTarget(@Nullable Output<Double> utilizationTarget) {
            this.utilizationTarget = utilizationTarget;
            return this;
        }
        public Builder utilizationTarget(@Nullable Double utilizationTarget) {
            this.utilizationTarget = Codegen.ofNullable(utilizationTarget);
            return this;
        }        public AutoscalingPolicyCpuUtilizationArgs build() {
            return new AutoscalingPolicyCpuUtilizationArgs(predictiveMethod, utilizationTarget);
        }
    }
}
