// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.enums.CapacityProviderManagedScalingStatus;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The managed scaling settings for the Auto Scaling group capacity provider.
 * 
 */
public final class CapacityProviderManagedScaling extends com.pulumi.resources.InvokeArgs {

    public static final CapacityProviderManagedScaling Empty = new CapacityProviderManagedScaling();

    @Import(name="instanceWarmupPeriod")
      private final @Nullable Integer instanceWarmupPeriod;

    public Optional<Integer> instanceWarmupPeriod() {
        return this.instanceWarmupPeriod == null ? Optional.empty() : Optional.ofNullable(this.instanceWarmupPeriod);
    }

    @Import(name="maximumScalingStepSize")
      private final @Nullable Integer maximumScalingStepSize;

    public Optional<Integer> maximumScalingStepSize() {
        return this.maximumScalingStepSize == null ? Optional.empty() : Optional.ofNullable(this.maximumScalingStepSize);
    }

    @Import(name="minimumScalingStepSize")
      private final @Nullable Integer minimumScalingStepSize;

    public Optional<Integer> minimumScalingStepSize() {
        return this.minimumScalingStepSize == null ? Optional.empty() : Optional.ofNullable(this.minimumScalingStepSize);
    }

    @Import(name="status")
      private final @Nullable CapacityProviderManagedScalingStatus status;

    public Optional<CapacityProviderManagedScalingStatus> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    @Import(name="targetCapacity")
      private final @Nullable Integer targetCapacity;

    public Optional<Integer> targetCapacity() {
        return this.targetCapacity == null ? Optional.empty() : Optional.ofNullable(this.targetCapacity);
    }

    public CapacityProviderManagedScaling(
        @Nullable Integer instanceWarmupPeriod,
        @Nullable Integer maximumScalingStepSize,
        @Nullable Integer minimumScalingStepSize,
        @Nullable CapacityProviderManagedScalingStatus status,
        @Nullable Integer targetCapacity) {
        this.instanceWarmupPeriod = instanceWarmupPeriod;
        this.maximumScalingStepSize = maximumScalingStepSize;
        this.minimumScalingStepSize = minimumScalingStepSize;
        this.status = status;
        this.targetCapacity = targetCapacity;
    }

    private CapacityProviderManagedScaling() {
        this.instanceWarmupPeriod = null;
        this.maximumScalingStepSize = null;
        this.minimumScalingStepSize = null;
        this.status = null;
        this.targetCapacity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderManagedScaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instanceWarmupPeriod;
        private @Nullable Integer maximumScalingStepSize;
        private @Nullable Integer minimumScalingStepSize;
        private @Nullable CapacityProviderManagedScalingStatus status;
        private @Nullable Integer targetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderManagedScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceWarmupPeriod = defaults.instanceWarmupPeriod;
    	      this.maximumScalingStepSize = defaults.maximumScalingStepSize;
    	      this.minimumScalingStepSize = defaults.minimumScalingStepSize;
    	      this.status = defaults.status;
    	      this.targetCapacity = defaults.targetCapacity;
        }

        public Builder instanceWarmupPeriod(@Nullable Integer instanceWarmupPeriod) {
            this.instanceWarmupPeriod = instanceWarmupPeriod;
            return this;
        }
        public Builder maximumScalingStepSize(@Nullable Integer maximumScalingStepSize) {
            this.maximumScalingStepSize = maximumScalingStepSize;
            return this;
        }
        public Builder minimumScalingStepSize(@Nullable Integer minimumScalingStepSize) {
            this.minimumScalingStepSize = minimumScalingStepSize;
            return this;
        }
        public Builder status(@Nullable CapacityProviderManagedScalingStatus status) {
            this.status = status;
            return this;
        }
        public Builder targetCapacity(@Nullable Integer targetCapacity) {
            this.targetCapacity = targetCapacity;
            return this;
        }        public CapacityProviderManagedScaling build() {
            return new CapacityProviderManagedScaling(instanceWarmupPeriod, maximumScalingStepSize, minimumScalingStepSize, status, targetCapacity);
        }
    }
}
