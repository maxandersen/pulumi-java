// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v1.outputs.CrossVersionObjectReference;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HorizontalPodAutoscalerSpec {
    /**
     * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
     * 
     */
    private final Integer maxReplicas;
    /**
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
     * 
     */
    private final @Nullable Integer minReplicas;
    /**
     * reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
     * 
     */
    private final CrossVersionObjectReference scaleTargetRef;
    /**
     * target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
     * 
     */
    private final @Nullable Integer targetCPUUtilizationPercentage;

    @OutputCustomType.Constructor
    private HorizontalPodAutoscalerSpec(
        @OutputCustomType.Parameter("maxReplicas") Integer maxReplicas,
        @OutputCustomType.Parameter("minReplicas") @Nullable Integer minReplicas,
        @OutputCustomType.Parameter("scaleTargetRef") CrossVersionObjectReference scaleTargetRef,
        @OutputCustomType.Parameter("targetCPUUtilizationPercentage") @Nullable Integer targetCPUUtilizationPercentage) {
        this.maxReplicas = maxReplicas;
        this.minReplicas = minReplicas;
        this.scaleTargetRef = scaleTargetRef;
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }

    /**
     * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
     * 
    */
    public Integer getMaxReplicas() {
        return this.maxReplicas;
    }
    /**
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
     * 
    */
    public Optional<Integer> getMinReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }
    /**
     * reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
     * 
    */
    public CrossVersionObjectReference getScaleTargetRef() {
        return this.scaleTargetRef;
    }
    /**
     * target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
     * 
    */
    public Optional<Integer> getTargetCPUUtilizationPercentage() {
        return Optional.ofNullable(this.targetCPUUtilizationPercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxReplicas;
        private @Nullable Integer minReplicas;
        private CrossVersionObjectReference scaleTargetRef;
        private @Nullable Integer targetCPUUtilizationPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
    	      this.scaleTargetRef = defaults.scaleTargetRef;
    	      this.targetCPUUtilizationPercentage = defaults.targetCPUUtilizationPercentage;
        }

        public Builder setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }

        public Builder setMinReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        public Builder setScaleTargetRef(CrossVersionObjectReference scaleTargetRef) {
            this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
            return this;
        }

        public Builder setTargetCPUUtilizationPercentage(@Nullable Integer targetCPUUtilizationPercentage) {
            this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
            return this;
        }
        public HorizontalPodAutoscalerSpec build() {
            return new HorizontalPodAutoscalerSpec(maxReplicas, minReplicas, scaleTargetRef, targetCPUUtilizationPercentage);
        }
    }
}
