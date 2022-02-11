// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HorizontalPodAutoscalerStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerStatusArgs Empty = new HorizontalPodAutoscalerStatusArgs();

    @InputImport(name="currentCPUUtilizationPercentage")
    private final @Nullable Input<Integer> currentCPUUtilizationPercentage;

    public Input<Integer> getCurrentCPUUtilizationPercentage() {
        return this.currentCPUUtilizationPercentage == null ? Input.empty() : this.currentCPUUtilizationPercentage;
    }

    @InputImport(name="currentReplicas", required=true)
    private final Input<Integer> currentReplicas;

    public Input<Integer> getCurrentReplicas() {
        return this.currentReplicas;
    }

    @InputImport(name="desiredReplicas", required=true)
    private final Input<Integer> desiredReplicas;

    public Input<Integer> getDesiredReplicas() {
        return this.desiredReplicas;
    }

    @InputImport(name="lastScaleTime")
    private final @Nullable Input<String> lastScaleTime;

    public Input<String> getLastScaleTime() {
        return this.lastScaleTime == null ? Input.empty() : this.lastScaleTime;
    }

    @InputImport(name="observedGeneration")
    private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    public HorizontalPodAutoscalerStatusArgs(
        @Nullable Input<Integer> currentCPUUtilizationPercentage,
        Input<Integer> currentReplicas,
        Input<Integer> desiredReplicas,
        @Nullable Input<String> lastScaleTime,
        @Nullable Input<Integer> observedGeneration) {
        this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
        this.currentReplicas = Objects.requireNonNull(currentReplicas, "expected parameter 'currentReplicas' to be non-null");
        this.desiredReplicas = Objects.requireNonNull(desiredReplicas, "expected parameter 'desiredReplicas' to be non-null");
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    private HorizontalPodAutoscalerStatusArgs() {
        this.currentCPUUtilizationPercentage = Input.empty();
        this.currentReplicas = Input.empty();
        this.desiredReplicas = Input.empty();
        this.lastScaleTime = Input.empty();
        this.observedGeneration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> currentCPUUtilizationPercentage;
        private Input<Integer> currentReplicas;
        private Input<Integer> desiredReplicas;
        private @Nullable Input<String> lastScaleTime;
        private @Nullable Input<Integer> observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentCPUUtilizationPercentage = defaults.currentCPUUtilizationPercentage;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.desiredReplicas = defaults.desiredReplicas;
    	      this.lastScaleTime = defaults.lastScaleTime;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder setCurrentCPUUtilizationPercentage(@Nullable Input<Integer> currentCPUUtilizationPercentage) {
            this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
            return this;
        }

        public Builder setCurrentCPUUtilizationPercentage(@Nullable Integer currentCPUUtilizationPercentage) {
            this.currentCPUUtilizationPercentage = Input.ofNullable(currentCPUUtilizationPercentage);
            return this;
        }

        public Builder setCurrentReplicas(Input<Integer> currentReplicas) {
            this.currentReplicas = Objects.requireNonNull(currentReplicas);
            return this;
        }

        public Builder setCurrentReplicas(Integer currentReplicas) {
            this.currentReplicas = Input.of(Objects.requireNonNull(currentReplicas));
            return this;
        }

        public Builder setDesiredReplicas(Input<Integer> desiredReplicas) {
            this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
            return this;
        }

        public Builder setDesiredReplicas(Integer desiredReplicas) {
            this.desiredReplicas = Input.of(Objects.requireNonNull(desiredReplicas));
            return this;
        }

        public Builder setLastScaleTime(@Nullable Input<String> lastScaleTime) {
            this.lastScaleTime = lastScaleTime;
            return this;
        }

        public Builder setLastScaleTime(@Nullable String lastScaleTime) {
            this.lastScaleTime = Input.ofNullable(lastScaleTime);
            return this;
        }

        public Builder setObservedGeneration(@Nullable Input<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Input.ofNullable(observedGeneration);
            return this;
        }

        public HorizontalPodAutoscalerStatusArgs build() {
            return new HorizontalPodAutoscalerStatusArgs(currentCPUUtilizationPercentage, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
        }
    }
}
