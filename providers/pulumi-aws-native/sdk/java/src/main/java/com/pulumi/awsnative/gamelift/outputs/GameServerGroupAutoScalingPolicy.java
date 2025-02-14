// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift.outputs;

import com.pulumi.awsnative.gamelift.outputs.GameServerGroupTargetTrackingConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GameServerGroupAutoScalingPolicy {
    private final @Nullable Double estimatedInstanceWarmup;
    private final GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration;

    @CustomType.Constructor
    private GameServerGroupAutoScalingPolicy(
        @CustomType.Parameter("estimatedInstanceWarmup") @Nullable Double estimatedInstanceWarmup,
        @CustomType.Parameter("targetTrackingConfiguration") GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        this.targetTrackingConfiguration = targetTrackingConfiguration;
    }

    public Optional<Double> estimatedInstanceWarmup() {
        return Optional.ofNullable(this.estimatedInstanceWarmup);
    }
    public GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration() {
        return this.targetTrackingConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerGroupAutoScalingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double estimatedInstanceWarmup;
        private GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerGroupAutoScalingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.estimatedInstanceWarmup = defaults.estimatedInstanceWarmup;
    	      this.targetTrackingConfiguration = defaults.targetTrackingConfiguration;
        }

        public Builder estimatedInstanceWarmup(@Nullable Double estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }
        public Builder targetTrackingConfiguration(GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration) {
            this.targetTrackingConfiguration = Objects.requireNonNull(targetTrackingConfiguration);
            return this;
        }        public GameServerGroupAutoScalingPolicy build() {
            return new GameServerGroupAutoScalingPolicy(estimatedInstanceWarmup, targetTrackingConfiguration);
        }
    }
}
