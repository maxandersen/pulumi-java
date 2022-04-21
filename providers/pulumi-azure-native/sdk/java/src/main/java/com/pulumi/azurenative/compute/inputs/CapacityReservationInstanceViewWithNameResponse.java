// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.CapacityReservationUtilizationResponse;
import com.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The instance view of a capacity reservation that includes the name of the capacity reservation. It is used for the response to the instance view of a capacity reservation group.
 * 
 */
public final class CapacityReservationInstanceViewWithNameResponse extends com.pulumi.resources.InvokeArgs {

    public static final CapacityReservationInstanceViewWithNameResponse Empty = new CapacityReservationInstanceViewWithNameResponse();

    /**
     * The name of the capacity reservation.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The resource status information.
     * 
     */
    @Import(name="statuses")
    private @Nullable List<InstanceViewStatusResponse> statuses;

    public Optional<List<InstanceViewStatusResponse>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    /**
     * Unutilized capacity of the capacity reservation.
     * 
     */
    @Import(name="utilizationInfo")
    private @Nullable CapacityReservationUtilizationResponse utilizationInfo;

    public Optional<CapacityReservationUtilizationResponse> utilizationInfo() {
        return Optional.ofNullable(this.utilizationInfo);
    }

    private CapacityReservationInstanceViewWithNameResponse() {}

    private CapacityReservationInstanceViewWithNameResponse(CapacityReservationInstanceViewWithNameResponse $) {
        this.name = $.name;
        this.statuses = $.statuses;
        this.utilizationInfo = $.utilizationInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CapacityReservationInstanceViewWithNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CapacityReservationInstanceViewWithNameResponse $;

        public Builder() {
            $ = new CapacityReservationInstanceViewWithNameResponse();
        }

        public Builder(CapacityReservationInstanceViewWithNameResponse defaults) {
            $ = new CapacityReservationInstanceViewWithNameResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder statuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            $.statuses = statuses;
            return this;
        }

        public Builder statuses(InstanceViewStatusResponse... statuses) {
            return statuses(List.of(statuses));
        }

        public Builder utilizationInfo(@Nullable CapacityReservationUtilizationResponse utilizationInfo) {
            $.utilizationInfo = utilizationInfo;
            return this;
        }

        public CapacityReservationInstanceViewWithNameResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
