// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Basic autoscaling configurations for Spark Standalone.
 * 
 */
public final class SparkStandaloneAutoscalingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SparkStandaloneAutoscalingConfigResponse Empty = new SparkStandaloneAutoscalingConfigResponse();

    /**
     * Timeout for Spark graceful decommissioning of spark workers. Specifies the duration to wait for spark worker to complete spark decomissioning tasks before forcefully removing workers. Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    @Import(name="gracefulDecommissionTimeout", required=true)
    private String gracefulDecommissionTimeout;

    public String gracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }

    /**
     * Fraction of required executors to remove from Spark Serverless clusters. A scale-down factor of 1.0 will result in scaling down so that there are no more executors for the Spark Job.(more aggressive scaling). A scale-down factor closer to 0 will result in a smaller magnitude of scaling donw (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    @Import(name="scaleDownFactor", required=true)
    private Double scaleDownFactor;

    public Double scaleDownFactor() {
        return this.scaleDownFactor;
    }

    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @Import(name="scaleDownMinWorkerFraction", required=true)
    private Double scaleDownMinWorkerFraction;

    public Double scaleDownMinWorkerFraction() {
        return this.scaleDownMinWorkerFraction;
    }

    /**
     * Fraction of required workers to add to Spark Standalone clusters. A scale-up factor of 1.0 will result in scaling up so that there are no more required workers for the Spark Job (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    @Import(name="scaleUpFactor", required=true)
    private Double scaleUpFactor;

    public Double scaleUpFactor() {
        return this.scaleUpFactor;
    }

    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @Import(name="scaleUpMinWorkerFraction", required=true)
    private Double scaleUpMinWorkerFraction;

    public Double scaleUpMinWorkerFraction() {
        return this.scaleUpMinWorkerFraction;
    }

    private SparkStandaloneAutoscalingConfigResponse() {}

    private SparkStandaloneAutoscalingConfigResponse(SparkStandaloneAutoscalingConfigResponse $) {
        this.gracefulDecommissionTimeout = $.gracefulDecommissionTimeout;
        this.scaleDownFactor = $.scaleDownFactor;
        this.scaleDownMinWorkerFraction = $.scaleDownMinWorkerFraction;
        this.scaleUpFactor = $.scaleUpFactor;
        this.scaleUpMinWorkerFraction = $.scaleUpMinWorkerFraction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkStandaloneAutoscalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkStandaloneAutoscalingConfigResponse $;

        public Builder() {
            $ = new SparkStandaloneAutoscalingConfigResponse();
        }

        public Builder(SparkStandaloneAutoscalingConfigResponse defaults) {
            $ = new SparkStandaloneAutoscalingConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder gracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            $.gracefulDecommissionTimeout = gracefulDecommissionTimeout;
            return this;
        }

        public Builder scaleDownFactor(Double scaleDownFactor) {
            $.scaleDownFactor = scaleDownFactor;
            return this;
        }

        public Builder scaleDownMinWorkerFraction(Double scaleDownMinWorkerFraction) {
            $.scaleDownMinWorkerFraction = scaleDownMinWorkerFraction;
            return this;
        }

        public Builder scaleUpFactor(Double scaleUpFactor) {
            $.scaleUpFactor = scaleUpFactor;
            return this;
        }

        public Builder scaleUpMinWorkerFraction(Double scaleUpMinWorkerFraction) {
            $.scaleUpMinWorkerFraction = scaleUpMinWorkerFraction;
            return this;
        }

        public SparkStandaloneAutoscalingConfigResponse build() {
            $.gracefulDecommissionTimeout = Objects.requireNonNull($.gracefulDecommissionTimeout, "expected parameter 'gracefulDecommissionTimeout' to be non-null");
            $.scaleDownFactor = Objects.requireNonNull($.scaleDownFactor, "expected parameter 'scaleDownFactor' to be non-null");
            $.scaleDownMinWorkerFraction = Objects.requireNonNull($.scaleDownMinWorkerFraction, "expected parameter 'scaleDownMinWorkerFraction' to be non-null");
            $.scaleUpFactor = Objects.requireNonNull($.scaleUpFactor, "expected parameter 'scaleUpFactor' to be non-null");
            $.scaleUpMinWorkerFraction = Objects.requireNonNull($.scaleUpMinWorkerFraction, "expected parameter 'scaleUpMinWorkerFraction' to be non-null");
            return $;
        }
    }

}
