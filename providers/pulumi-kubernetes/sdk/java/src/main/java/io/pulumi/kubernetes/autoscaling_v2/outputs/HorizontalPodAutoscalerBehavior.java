// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.HPAScalingRules;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HorizontalPodAutoscalerBehavior {
    private final @Nullable HPAScalingRules scaleDown;
    private final @Nullable HPAScalingRules scaleUp;

    @OutputCustomType.Constructor({"scaleDown","scaleUp"})
    private HorizontalPodAutoscalerBehavior(
        @Nullable HPAScalingRules scaleDown,
        @Nullable HPAScalingRules scaleUp) {
        this.scaleDown = scaleDown;
        this.scaleUp = scaleUp;
    }

    public Optional<HPAScalingRules> getScaleDown() {
        return Optional.ofNullable(this.scaleDown);
    }
    public Optional<HPAScalingRules> getScaleUp() {
        return Optional.ofNullable(this.scaleUp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerBehavior defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HPAScalingRules scaleDown;
        private @Nullable HPAScalingRules scaleUp;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerBehavior defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scaleDown = defaults.scaleDown;
    	      this.scaleUp = defaults.scaleUp;
        }

        public Builder setScaleDown(@Nullable HPAScalingRules scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }

        public Builder setScaleUp(@Nullable HPAScalingRules scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }

        public HorizontalPodAutoscalerBehavior build() {
            return new HorizontalPodAutoscalerBehavior(scaleDown, scaleUp);
        }
    }
}
