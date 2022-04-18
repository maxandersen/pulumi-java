// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.awsnative.ec2.outputs.SpotFleetSpotCapacityRebalance;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotFleetSpotMaintenanceStrategies {
    private final @Nullable SpotFleetSpotCapacityRebalance capacityRebalance;

    @CustomType.Constructor
    private SpotFleetSpotMaintenanceStrategies(@CustomType.Parameter("capacityRebalance") @Nullable SpotFleetSpotCapacityRebalance capacityRebalance) {
        this.capacityRebalance = capacityRebalance;
    }

    public Optional<SpotFleetSpotCapacityRebalance> capacityRebalance() {
        return Optional.ofNullable(this.capacityRebalance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetSpotMaintenanceStrategies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SpotFleetSpotCapacityRebalance capacityRebalance;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetSpotMaintenanceStrategies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityRebalance = defaults.capacityRebalance;
        }

        public Builder capacityRebalance(@Nullable SpotFleetSpotCapacityRebalance capacityRebalance) {
            this.capacityRebalance = capacityRebalance;
            return this;
        }        public SpotFleetSpotMaintenanceStrategies build() {
            return new SpotFleetSpotMaintenanceStrategies(capacityRebalance);
        }
    }
}
