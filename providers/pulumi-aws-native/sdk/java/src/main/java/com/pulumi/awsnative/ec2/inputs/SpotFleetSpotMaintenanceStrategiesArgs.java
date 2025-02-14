// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.awsnative.ec2.inputs.SpotFleetSpotCapacityRebalanceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetSpotMaintenanceStrategiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetSpotMaintenanceStrategiesArgs Empty = new SpotFleetSpotMaintenanceStrategiesArgs();

    @Import(name="capacityRebalance")
    private @Nullable Output<SpotFleetSpotCapacityRebalanceArgs> capacityRebalance;

    public Optional<Output<SpotFleetSpotCapacityRebalanceArgs>> capacityRebalance() {
        return Optional.ofNullable(this.capacityRebalance);
    }

    private SpotFleetSpotMaintenanceStrategiesArgs() {}

    private SpotFleetSpotMaintenanceStrategiesArgs(SpotFleetSpotMaintenanceStrategiesArgs $) {
        this.capacityRebalance = $.capacityRebalance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetSpotMaintenanceStrategiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetSpotMaintenanceStrategiesArgs $;

        public Builder() {
            $ = new SpotFleetSpotMaintenanceStrategiesArgs();
        }

        public Builder(SpotFleetSpotMaintenanceStrategiesArgs defaults) {
            $ = new SpotFleetSpotMaintenanceStrategiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacityRebalance(@Nullable Output<SpotFleetSpotCapacityRebalanceArgs> capacityRebalance) {
            $.capacityRebalance = capacityRebalance;
            return this;
        }

        public Builder capacityRebalance(SpotFleetSpotCapacityRebalanceArgs capacityRebalance) {
            return capacityRebalance(Output.of(capacityRebalance));
        }

        public SpotFleetSpotMaintenanceStrategiesArgs build() {
            return $;
        }
    }

}
