// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.awsnative.ec2.outputs.SpotFleetClassicLoadBalancersConfig;
import com.pulumi.awsnative.ec2.outputs.SpotFleetTargetGroupsConfig;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotFleetLoadBalancersConfig {
    private final @Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig;
    private final @Nullable SpotFleetTargetGroupsConfig targetGroupsConfig;

    @CustomType.Constructor
    private SpotFleetLoadBalancersConfig(
        @CustomType.Parameter("classicLoadBalancersConfig") @Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig,
        @CustomType.Parameter("targetGroupsConfig") @Nullable SpotFleetTargetGroupsConfig targetGroupsConfig) {
        this.classicLoadBalancersConfig = classicLoadBalancersConfig;
        this.targetGroupsConfig = targetGroupsConfig;
    }

    public Optional<SpotFleetClassicLoadBalancersConfig> classicLoadBalancersConfig() {
        return Optional.ofNullable(this.classicLoadBalancersConfig);
    }
    public Optional<SpotFleetTargetGroupsConfig> targetGroupsConfig() {
        return Optional.ofNullable(this.targetGroupsConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetLoadBalancersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig;
        private @Nullable SpotFleetTargetGroupsConfig targetGroupsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetLoadBalancersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classicLoadBalancersConfig = defaults.classicLoadBalancersConfig;
    	      this.targetGroupsConfig = defaults.targetGroupsConfig;
        }

        public Builder classicLoadBalancersConfig(@Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig) {
            this.classicLoadBalancersConfig = classicLoadBalancersConfig;
            return this;
        }
        public Builder targetGroupsConfig(@Nullable SpotFleetTargetGroupsConfig targetGroupsConfig) {
            this.targetGroupsConfig = targetGroupsConfig;
            return this;
        }        public SpotFleetLoadBalancersConfig build() {
            return new SpotFleetLoadBalancersConfig(classicLoadBalancersConfig, targetGroupsConfig);
        }
    }
}
