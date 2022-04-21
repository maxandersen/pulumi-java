// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration options for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the existing pods.
 * 
 */
public final class HorizontalPodAutoscalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalingArgs Empty = new HorizontalPodAutoscalingArgs();

    /**
     * Whether the Horizontal Pod Autoscaling feature is enabled in the cluster. When enabled, it ensures that metrics are collected into Stackdriver Monitoring.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    private HorizontalPodAutoscalingArgs() {}

    private HorizontalPodAutoscalingArgs(HorizontalPodAutoscalingArgs $) {
        this.disabled = $.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HorizontalPodAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HorizontalPodAutoscalingArgs $;

        public Builder() {
            $ = new HorizontalPodAutoscalingArgs();
        }

        public Builder(HorizontalPodAutoscalingArgs defaults) {
            $ = new HorizontalPodAutoscalingArgs(Objects.requireNonNull(defaults));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public HorizontalPodAutoscalingArgs build() {
            return $;
        }
    }

}
