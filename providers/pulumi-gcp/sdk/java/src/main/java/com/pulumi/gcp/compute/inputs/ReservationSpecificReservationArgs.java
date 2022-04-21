// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservationSpecificReservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationSpecificReservationArgs Empty = new ReservationSpecificReservationArgs();

    /**
     * The number of resources that are allocated.
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    public Output<Integer> count() {
        return this.count;
    }

    /**
     * - 
     * How many instances are in use.
     * 
     */
    @Import(name="inUseCount")
    private @Nullable Output<Integer> inUseCount;

    public Optional<Output<Integer>> inUseCount() {
        return Optional.ofNullable(this.inUseCount);
    }

    /**
     * The instance properties for the reservation.
     * Structure is documented below.
     * 
     */
    @Import(name="instanceProperties", required=true)
    private Output<ReservationSpecificReservationInstancePropertiesArgs> instanceProperties;

    public Output<ReservationSpecificReservationInstancePropertiesArgs> instanceProperties() {
        return this.instanceProperties;
    }

    private ReservationSpecificReservationArgs() {}

    private ReservationSpecificReservationArgs(ReservationSpecificReservationArgs $) {
        this.count = $.count;
        this.inUseCount = $.inUseCount;
        this.instanceProperties = $.instanceProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationSpecificReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationSpecificReservationArgs $;

        public Builder() {
            $ = new ReservationSpecificReservationArgs();
        }

        public Builder(ReservationSpecificReservationArgs defaults) {
            $ = new ReservationSpecificReservationArgs(Objects.requireNonNull(defaults));
        }

        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public Builder inUseCount(@Nullable Output<Integer> inUseCount) {
            $.inUseCount = inUseCount;
            return this;
        }

        public Builder inUseCount(Integer inUseCount) {
            return inUseCount(Output.of(inUseCount));
        }

        public Builder instanceProperties(Output<ReservationSpecificReservationInstancePropertiesArgs> instanceProperties) {
            $.instanceProperties = instanceProperties;
            return this;
        }

        public Builder instanceProperties(ReservationSpecificReservationInstancePropertiesArgs instanceProperties) {
            return instanceProperties(Output.of(instanceProperties));
        }

        public ReservationSpecificReservationArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.instanceProperties = Objects.requireNonNull($.instanceProperties, "expected parameter 'instanceProperties' to be non-null");
            return $;
        }
    }

}
