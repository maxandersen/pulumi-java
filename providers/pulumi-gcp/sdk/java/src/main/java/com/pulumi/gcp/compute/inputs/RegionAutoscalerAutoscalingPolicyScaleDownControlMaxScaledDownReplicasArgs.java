// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs Empty = new RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs();

    /**
     * Specifies a fixed number of VM instances. This must be a positive
     * integer.
     * 
     */
    @Import(name="fixed")
    private @Nullable Output<Integer> fixed;

    public Optional<Output<Integer>> fixed() {
        return Optional.ofNullable(this.fixed);
    }

    /**
     * Specifies a percentage of instances between 0 to 100%, inclusive.
     * For example, specify 80 for 80%.
     * 
     */
    @Import(name="percent")
    private @Nullable Output<Integer> percent;

    public Optional<Output<Integer>> percent() {
        return Optional.ofNullable(this.percent);
    }

    private RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs() {}

    private RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs(RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs $) {
        this.fixed = $.fixed;
        this.percent = $.percent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs $;

        public Builder() {
            $ = new RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs();
        }

        public Builder(RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs defaults) {
            $ = new RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs(Objects.requireNonNull(defaults));
        }

        public Builder fixed(@Nullable Output<Integer> fixed) {
            $.fixed = fixed;
            return this;
        }

        public Builder fixed(Integer fixed) {
            return fixed(Output.of(fixed));
        }

        public Builder percent(@Nullable Output<Integer> percent) {
            $.percent = percent;
            return this;
        }

        public Builder percent(Integer percent) {
            return percent(Output.of(percent));
        }

        public RegionAutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs build() {
            return $;
        }
    }

}
