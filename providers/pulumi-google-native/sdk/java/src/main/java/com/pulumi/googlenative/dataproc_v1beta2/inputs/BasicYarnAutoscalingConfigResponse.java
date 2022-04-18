// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Basic autoscaling configurations for YARN.
 * 
 */
public final class BasicYarnAutoscalingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final BasicYarnAutoscalingConfigResponse Empty = new BasicYarnAutoscalingConfigResponse();

    /**
     * Timeout for YARN graceful decommissioning of Node Managers. Specifies the duration to wait for jobs to complete before forcefully removing workers (and potentially interrupting jobs). Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    @Import(name="gracefulDecommissionTimeout", required=true)
      private final String gracefulDecommissionTimeout;

    public String gracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }

    /**
     * Fraction of average YARN pending memory in the last cooldown period for which to remove workers. A scale-down factor of 1 will result in scaling down so that there is no available memory remaining after the update (more aggressive scaling). A scale-down factor of 0 disables removing workers, which can be beneficial for autoscaling a single job. See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    @Import(name="scaleDownFactor", required=true)
      private final Double scaleDownFactor;

    public Double scaleDownFactor() {
        return this.scaleDownFactor;
    }

    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @Import(name="scaleDownMinWorkerFraction", required=true)
      private final Double scaleDownMinWorkerFraction;

    public Double scaleDownMinWorkerFraction() {
        return this.scaleDownMinWorkerFraction;
    }

    /**
     * Fraction of average YARN pending memory in the last cooldown period for which to add workers. A scale-up factor of 1.0 will result in scaling up so that there is no pending memory remaining after the update (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling). See How autoscaling works for more information.Bounds: 0.0, 1.0.
     * 
     */
    @Import(name="scaleUpFactor", required=true)
      private final Double scaleUpFactor;

    public Double scaleUpFactor() {
        return this.scaleUpFactor;
    }

    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @Import(name="scaleUpMinWorkerFraction", required=true)
      private final Double scaleUpMinWorkerFraction;

    public Double scaleUpMinWorkerFraction() {
        return this.scaleUpMinWorkerFraction;
    }

    public BasicYarnAutoscalingConfigResponse(
        String gracefulDecommissionTimeout,
        Double scaleDownFactor,
        Double scaleDownMinWorkerFraction,
        Double scaleUpFactor,
        Double scaleUpMinWorkerFraction) {
        this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout, "expected parameter 'gracefulDecommissionTimeout' to be non-null");
        this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor, "expected parameter 'scaleDownFactor' to be non-null");
        this.scaleDownMinWorkerFraction = Objects.requireNonNull(scaleDownMinWorkerFraction, "expected parameter 'scaleDownMinWorkerFraction' to be non-null");
        this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor, "expected parameter 'scaleUpFactor' to be non-null");
        this.scaleUpMinWorkerFraction = Objects.requireNonNull(scaleUpMinWorkerFraction, "expected parameter 'scaleUpMinWorkerFraction' to be non-null");
    }

    private BasicYarnAutoscalingConfigResponse() {
        this.gracefulDecommissionTimeout = null;
        this.scaleDownFactor = null;
        this.scaleDownMinWorkerFraction = null;
        this.scaleUpFactor = null;
        this.scaleUpMinWorkerFraction = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicYarnAutoscalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gracefulDecommissionTimeout;
        private Double scaleDownFactor;
        private Double scaleDownMinWorkerFraction;
        private Double scaleUpFactor;
        private Double scaleUpMinWorkerFraction;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicYarnAutoscalingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gracefulDecommissionTimeout = defaults.gracefulDecommissionTimeout;
    	      this.scaleDownFactor = defaults.scaleDownFactor;
    	      this.scaleDownMinWorkerFraction = defaults.scaleDownMinWorkerFraction;
    	      this.scaleUpFactor = defaults.scaleUpFactor;
    	      this.scaleUpMinWorkerFraction = defaults.scaleUpMinWorkerFraction;
        }

        public Builder gracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout);
            return this;
        }
        public Builder scaleDownFactor(Double scaleDownFactor) {
            this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor);
            return this;
        }
        public Builder scaleDownMinWorkerFraction(Double scaleDownMinWorkerFraction) {
            this.scaleDownMinWorkerFraction = Objects.requireNonNull(scaleDownMinWorkerFraction);
            return this;
        }
        public Builder scaleUpFactor(Double scaleUpFactor) {
            this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor);
            return this;
        }
        public Builder scaleUpMinWorkerFraction(Double scaleUpMinWorkerFraction) {
            this.scaleUpMinWorkerFraction = Objects.requireNonNull(scaleUpMinWorkerFraction);
            return this;
        }        public BasicYarnAutoscalingConfigResponse build() {
            return new BasicYarnAutoscalingConfigResponse(gracefulDecommissionTimeout, scaleDownFactor, scaleDownMinWorkerFraction, scaleUpFactor, scaleUpMinWorkerFraction);
        }
    }
}
