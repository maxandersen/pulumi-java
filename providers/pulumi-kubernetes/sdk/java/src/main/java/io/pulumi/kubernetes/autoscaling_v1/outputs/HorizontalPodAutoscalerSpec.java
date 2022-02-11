// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v1.outputs.CrossVersionObjectReference;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HorizontalPodAutoscalerSpec {
    private final Integer maxReplicas;
    private final @Nullable Integer minReplicas;
    private final CrossVersionObjectReference scaleTargetRef;
    private final @Nullable Integer targetCPUUtilizationPercentage;

    @OutputCustomType.Constructor({"maxReplicas","minReplicas","scaleTargetRef","targetCPUUtilizationPercentage"})
    private HorizontalPodAutoscalerSpec(
        Integer maxReplicas,
        @Nullable Integer minReplicas,
        CrossVersionObjectReference scaleTargetRef,
        @Nullable Integer targetCPUUtilizationPercentage) {
        this.maxReplicas = Objects.requireNonNull(maxReplicas);
        this.minReplicas = minReplicas;
        this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }

    public Integer getMaxReplicas() {
        return this.maxReplicas;
    }
    public Optional<Integer> getMinReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }
    public CrossVersionObjectReference getScaleTargetRef() {
        return this.scaleTargetRef;
    }
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
