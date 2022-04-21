// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs Empty = new InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs();

    /**
     * The ID of the Capacity Reservation in which to run the instance.
     * 
     */
    @Import(name="capacityReservationId")
    private @Nullable Output<String> capacityReservationId;

    public Optional<Output<String>> capacityReservationId() {
        return Optional.ofNullable(this.capacityReservationId);
    }

    private InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs() {}

    private InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs(InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs $) {
        this.capacityReservationId = $.capacityReservationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs $;

        public Builder() {
            $ = new InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs();
        }

        public Builder(InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs defaults) {
            $ = new InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacityReservationId(@Nullable Output<String> capacityReservationId) {
            $.capacityReservationId = capacityReservationId;
            return this;
        }

        public Builder capacityReservationId(String capacityReservationId) {
            return capacityReservationId(Output.of(capacityReservationId));
        }

        public InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs build() {
            return $;
        }
    }

}
