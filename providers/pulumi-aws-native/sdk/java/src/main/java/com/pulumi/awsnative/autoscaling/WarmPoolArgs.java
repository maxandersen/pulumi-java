// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.autoscaling;

import com.pulumi.awsnative.autoscaling.inputs.WarmPoolInstanceReusePolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WarmPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final WarmPoolArgs Empty = new WarmPoolArgs();

    @Import(name="autoScalingGroupName", required=true)
    private Output<String> autoScalingGroupName;

    public Output<String> autoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    @Import(name="instanceReusePolicy")
    private @Nullable Output<WarmPoolInstanceReusePolicyArgs> instanceReusePolicy;

    public Optional<Output<WarmPoolInstanceReusePolicyArgs>> instanceReusePolicy() {
        return Optional.ofNullable(this.instanceReusePolicy);
    }

    @Import(name="maxGroupPreparedCapacity")
    private @Nullable Output<Integer> maxGroupPreparedCapacity;

    public Optional<Output<Integer>> maxGroupPreparedCapacity() {
        return Optional.ofNullable(this.maxGroupPreparedCapacity);
    }

    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    @Import(name="poolState")
    private @Nullable Output<String> poolState;

    public Optional<Output<String>> poolState() {
        return Optional.ofNullable(this.poolState);
    }

    private WarmPoolArgs() {}

    private WarmPoolArgs(WarmPoolArgs $) {
        this.autoScalingGroupName = $.autoScalingGroupName;
        this.instanceReusePolicy = $.instanceReusePolicy;
        this.maxGroupPreparedCapacity = $.maxGroupPreparedCapacity;
        this.minSize = $.minSize;
        this.poolState = $.poolState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WarmPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WarmPoolArgs $;

        public Builder() {
            $ = new WarmPoolArgs();
        }

        public Builder(WarmPoolArgs defaults) {
            $ = new WarmPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoScalingGroupName(Output<String> autoScalingGroupName) {
            $.autoScalingGroupName = autoScalingGroupName;
            return this;
        }

        public Builder autoScalingGroupName(String autoScalingGroupName) {
            return autoScalingGroupName(Output.of(autoScalingGroupName));
        }

        public Builder instanceReusePolicy(@Nullable Output<WarmPoolInstanceReusePolicyArgs> instanceReusePolicy) {
            $.instanceReusePolicy = instanceReusePolicy;
            return this;
        }

        public Builder instanceReusePolicy(WarmPoolInstanceReusePolicyArgs instanceReusePolicy) {
            return instanceReusePolicy(Output.of(instanceReusePolicy));
        }

        public Builder maxGroupPreparedCapacity(@Nullable Output<Integer> maxGroupPreparedCapacity) {
            $.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
            return this;
        }

        public Builder maxGroupPreparedCapacity(Integer maxGroupPreparedCapacity) {
            return maxGroupPreparedCapacity(Output.of(maxGroupPreparedCapacity));
        }

        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        public Builder poolState(@Nullable Output<String> poolState) {
            $.poolState = poolState;
            return this;
        }

        public Builder poolState(String poolState) {
            return poolState(Output.of(poolState));
        }

        public WarmPoolArgs build() {
            $.autoScalingGroupName = Objects.requireNonNull($.autoScalingGroupName, "expected parameter 'autoScalingGroupName' to be non-null");
            return $;
        }
    }

}
