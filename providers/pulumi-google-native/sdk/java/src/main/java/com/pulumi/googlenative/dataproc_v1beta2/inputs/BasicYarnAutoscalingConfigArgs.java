// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Basic autoscaling configurations for YARN.
 * 
 */
public final class BasicYarnAutoscalingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BasicYarnAutoscalingConfigArgs Empty = new BasicYarnAutoscalingConfigArgs();

    /**
     * Timeout for YARN graceful decommissioning of Node Managers. Specifies the duration to wait for jobs to complete before forcefully removing workers (and potentially interrupting jobs). Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    @Import(name="gracefulDecommissionTimeout", required=true)
    private Output<String> gracefulDecommissionTimeout;

    public Output<String> gracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }

    /**
     * Fraction of average YARN pending memory in the last cooldown period for which to remove workers. A scale-down factor of 1 will result in scaling down so that there is no available memory remaining after the update (more aggressive scaling). A scale-down factor of 0 disables removing workers, which can be beneficial for autoscaling a single job. See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    @Import(name="scaleDownFactor", required=true)
    private Output<Double> scaleDownFactor;

    public Output<Double> scaleDownFactor() {
        return this.scaleDownFactor;
    }

    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @Import(name="scaleDownMinWorkerFraction")
    private @Nullable Output<Double> scaleDownMinWorkerFraction;

    public Optional<Output<Double>> scaleDownMinWorkerFraction() {
        return Optional.ofNullable(this.scaleDownMinWorkerFraction);
    }

    /**
     * Fraction of average YARN pending memory in the last cooldown period for which to add workers. A scale-up factor of 1.0 will result in scaling up so that there is no pending memory remaining after the update (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling). See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    @Import(name="scaleUpFactor", required=true)
    private Output<Double> scaleUpFactor;

    public Output<Double> scaleUpFactor() {
        return this.scaleUpFactor;
    }

    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @Import(name="scaleUpMinWorkerFraction")
    private @Nullable Output<Double> scaleUpMinWorkerFraction;

    public Optional<Output<Double>> scaleUpMinWorkerFraction() {
        return Optional.ofNullable(this.scaleUpMinWorkerFraction);
    }

    private BasicYarnAutoscalingConfigArgs() {}

    private BasicYarnAutoscalingConfigArgs(BasicYarnAutoscalingConfigArgs $) {
        this.gracefulDecommissionTimeout = $.gracefulDecommissionTimeout;
        this.scaleDownFactor = $.scaleDownFactor;
        this.scaleDownMinWorkerFraction = $.scaleDownMinWorkerFraction;
        this.scaleUpFactor = $.scaleUpFactor;
        this.scaleUpMinWorkerFraction = $.scaleUpMinWorkerFraction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicYarnAutoscalingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicYarnAutoscalingConfigArgs $;

        public Builder() {
            $ = new BasicYarnAutoscalingConfigArgs();
        }

        public Builder(BasicYarnAutoscalingConfigArgs defaults) {
            $ = new BasicYarnAutoscalingConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder gracefulDecommissionTimeout(Output<String> gracefulDecommissionTimeout) {
            $.gracefulDecommissionTimeout = gracefulDecommissionTimeout;
            return this;
        }

        public Builder gracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            return gracefulDecommissionTimeout(Output.of(gracefulDecommissionTimeout));
        }

        public Builder scaleDownFactor(Output<Double> scaleDownFactor) {
            $.scaleDownFactor = scaleDownFactor;
            return this;
        }

        public Builder scaleDownFactor(Double scaleDownFactor) {
            return scaleDownFactor(Output.of(scaleDownFactor));
        }

        public Builder scaleDownMinWorkerFraction(@Nullable Output<Double> scaleDownMinWorkerFraction) {
            $.scaleDownMinWorkerFraction = scaleDownMinWorkerFraction;
            return this;
        }

        public Builder scaleDownMinWorkerFraction(Double scaleDownMinWorkerFraction) {
            return scaleDownMinWorkerFraction(Output.of(scaleDownMinWorkerFraction));
        }

        public Builder scaleUpFactor(Output<Double> scaleUpFactor) {
            $.scaleUpFactor = scaleUpFactor;
            return this;
        }

        public Builder scaleUpFactor(Double scaleUpFactor) {
            return scaleUpFactor(Output.of(scaleUpFactor));
        }

        public Builder scaleUpMinWorkerFraction(@Nullable Output<Double> scaleUpMinWorkerFraction) {
            $.scaleUpMinWorkerFraction = scaleUpMinWorkerFraction;
            return this;
        }

        public Builder scaleUpMinWorkerFraction(Double scaleUpMinWorkerFraction) {
            return scaleUpMinWorkerFraction(Output.of(scaleUpMinWorkerFraction));
        }

        public BasicYarnAutoscalingConfigArgs build() {
            $.gracefulDecommissionTimeout = Objects.requireNonNull($.gracefulDecommissionTimeout, "expected parameter 'gracefulDecommissionTimeout' to be non-null");
            $.scaleDownFactor = Objects.requireNonNull($.scaleDownFactor, "expected parameter 'scaleDownFactor' to be non-null");
            $.scaleUpFactor = Objects.requireNonNull($.scaleUpFactor, "expected parameter 'scaleUpFactor' to be non-null");
            return $;
        }
    }

}
