// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v1.inputs.CrossVersionObjectReferenceArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HorizontalPodAutoscalerSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerSpecArgs Empty = new HorizontalPodAutoscalerSpecArgs();

    @InputImport(name="maxReplicas", required=true)
    private final Input<Integer> maxReplicas;

    public Input<Integer> getMaxReplicas() {
        return this.maxReplicas;
    }

    @InputImport(name="minReplicas")
    private final @Nullable Input<Integer> minReplicas;

    public Input<Integer> getMinReplicas() {
        return this.minReplicas == null ? Input.empty() : this.minReplicas;
    }

    @InputImport(name="scaleTargetRef", required=true)
    private final Input<CrossVersionObjectReferenceArgs> scaleTargetRef;

    public Input<CrossVersionObjectReferenceArgs> getScaleTargetRef() {
        return this.scaleTargetRef;
    }

    @InputImport(name="targetCPUUtilizationPercentage")
    private final @Nullable Input<Integer> targetCPUUtilizationPercentage;

    public Input<Integer> getTargetCPUUtilizationPercentage() {
        return this.targetCPUUtilizationPercentage == null ? Input.empty() : this.targetCPUUtilizationPercentage;
    }

    public HorizontalPodAutoscalerSpecArgs(
        Input<Integer> maxReplicas,
        @Nullable Input<Integer> minReplicas,
        Input<CrossVersionObjectReferenceArgs> scaleTargetRef,
        @Nullable Input<Integer> targetCPUUtilizationPercentage) {
        this.maxReplicas = Objects.requireNonNull(maxReplicas, "expected parameter 'maxReplicas' to be non-null");
        this.minReplicas = minReplicas;
        this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef, "expected parameter 'scaleTargetRef' to be non-null");
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }

    private HorizontalPodAutoscalerSpecArgs() {
        this.maxReplicas = Input.empty();
        this.minReplicas = Input.empty();
        this.scaleTargetRef = Input.empty();
        this.targetCPUUtilizationPercentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxReplicas;
        private @Nullable Input<Integer> minReplicas;
        private Input<CrossVersionObjectReferenceArgs> scaleTargetRef;
        private @Nullable Input<Integer> targetCPUUtilizationPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
    	      this.scaleTargetRef = defaults.scaleTargetRef;
    	      this.targetCPUUtilizationPercentage = defaults.targetCPUUtilizationPercentage;
        }

        public Builder setMaxReplicas(Input<Integer> maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }

        public Builder setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = Input.of(Objects.requireNonNull(maxReplicas));
            return this;
        }

        public Builder setMinReplicas(@Nullable Input<Integer> minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        public Builder setMinReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = Input.ofNullable(minReplicas);
            return this;
        }

        public Builder setScaleTargetRef(Input<CrossVersionObjectReferenceArgs> scaleTargetRef) {
            this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
            return this;
        }

        public Builder setScaleTargetRef(CrossVersionObjectReferenceArgs scaleTargetRef) {
            this.scaleTargetRef = Input.of(Objects.requireNonNull(scaleTargetRef));
            return this;
        }

        public Builder setTargetCPUUtilizationPercentage(@Nullable Input<Integer> targetCPUUtilizationPercentage) {
            this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
            return this;
        }

        public Builder setTargetCPUUtilizationPercentage(@Nullable Integer targetCPUUtilizationPercentage) {
            this.targetCPUUtilizationPercentage = Input.ofNullable(targetCPUUtilizationPercentage);
            return this;
        }

        public HorizontalPodAutoscalerSpecArgs build() {
            return new HorizontalPodAutoscalerSpecArgs(maxReplicas, minReplicas, scaleTargetRef, targetCPUUtilizationPercentage);
        }
    }
}
