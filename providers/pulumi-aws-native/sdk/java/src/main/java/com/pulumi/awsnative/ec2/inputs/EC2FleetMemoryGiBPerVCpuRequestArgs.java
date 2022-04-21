// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EC2FleetMemoryGiBPerVCpuRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final EC2FleetMemoryGiBPerVCpuRequestArgs Empty = new EC2FleetMemoryGiBPerVCpuRequestArgs();

    @Import(name="max")
    private @Nullable Output<Double> max;

    public Optional<Output<Double>> max() {
        return Optional.ofNullable(this.max);
    }

    @Import(name="min")
    private @Nullable Output<Double> min;

    public Optional<Output<Double>> min() {
        return Optional.ofNullable(this.min);
    }

    private EC2FleetMemoryGiBPerVCpuRequestArgs() {}

    private EC2FleetMemoryGiBPerVCpuRequestArgs(EC2FleetMemoryGiBPerVCpuRequestArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EC2FleetMemoryGiBPerVCpuRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EC2FleetMemoryGiBPerVCpuRequestArgs $;

        public Builder() {
            $ = new EC2FleetMemoryGiBPerVCpuRequestArgs();
        }

        public Builder(EC2FleetMemoryGiBPerVCpuRequestArgs defaults) {
            $ = new EC2FleetMemoryGiBPerVCpuRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder max(@Nullable Output<Double> max) {
            $.max = max;
            return this;
        }

        public Builder max(Double max) {
            return max(Output.of(max));
        }

        public Builder min(@Nullable Output<Double> min) {
            $.min = min;
            return this;
        }

        public Builder min(Double min) {
            return min(Output.of(min));
        }

        public EC2FleetMemoryGiBPerVCpuRequestArgs build() {
            return $;
        }
    }

}
