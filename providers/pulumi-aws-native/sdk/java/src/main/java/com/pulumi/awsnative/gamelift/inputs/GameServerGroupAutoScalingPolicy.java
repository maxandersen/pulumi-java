// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift.inputs;

import com.pulumi.awsnative.gamelift.inputs.GameServerGroupTargetTrackingConfiguration;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting
 * 
 */
public final class GameServerGroupAutoScalingPolicy extends com.pulumi.resources.InvokeArgs {

    public static final GameServerGroupAutoScalingPolicy Empty = new GameServerGroupAutoScalingPolicy();

    @Import(name="estimatedInstanceWarmup")
      private final @Nullable Double estimatedInstanceWarmup;

    public Optional<Double> estimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup == null ? Optional.empty() : Optional.ofNullable(this.estimatedInstanceWarmup);
    }

    @Import(name="targetTrackingConfiguration", required=true)
      private final GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration;

    public GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration() {
        return this.targetTrackingConfiguration;
    }

    public GameServerGroupAutoScalingPolicy(
        @Nullable Double estimatedInstanceWarmup,
        GameServerGroupTargetTrackingConfiguration targetTrackingConfiguration) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        this.targetTrackingConfiguration = Objects.requireNonNull(targetTrackingConfiguration, "expected parameter 'targetTrackingConfiguration' to be non-null");
    }

    private GameServerGroupAutoScalingPolicy() {
        this.estimatedInstanceWarmup = null;
        this.targetTrackingConfiguration = null;
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
