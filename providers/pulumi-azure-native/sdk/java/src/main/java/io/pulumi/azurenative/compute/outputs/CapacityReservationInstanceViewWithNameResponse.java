// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CapacityReservationUtilizationResponse;
import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CapacityReservationInstanceViewWithNameResponse {
    /**
     * The name of the capacity reservation.
     * 
     */
    private final String name;
    /**
     * The resource status information.
     * 
     */
    private final @Nullable List<InstanceViewStatusResponse> statuses;
    /**
     * Unutilized capacity of the capacity reservation.
     * 
     */
    private final @Nullable CapacityReservationUtilizationResponse utilizationInfo;

    @CustomType.Constructor
    private CapacityReservationInstanceViewWithNameResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("statuses") @Nullable List<InstanceViewStatusResponse> statuses,
        @CustomType.Parameter("utilizationInfo") @Nullable CapacityReservationUtilizationResponse utilizationInfo) {
        this.name = name;
        this.statuses = statuses;
        this.utilizationInfo = utilizationInfo;
    }

    /**
     * The name of the capacity reservation.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The resource status information.
     * 
    */
    public List<InstanceViewStatusResponse> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * Unutilized capacity of the capacity reservation.
     * 
    */
    public Optional<CapacityReservationUtilizationResponse> utilizationInfo() {
        return Optional.ofNullable(this.utilizationInfo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationInstanceViewWithNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable List<InstanceViewStatusResponse> statuses;
        private @Nullable CapacityReservationUtilizationResponse utilizationInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationInstanceViewWithNameResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.statuses = defaults.statuses;
    	      this.utilizationInfo = defaults.utilizationInfo;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder statuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(InstanceViewStatusResponse... statuses) {
            return statuses(List.of(statuses));
        }
        public Builder utilizationInfo(@Nullable CapacityReservationUtilizationResponse utilizationInfo) {
            this.utilizationInfo = utilizationInfo;
            return this;
        }        public CapacityReservationInstanceViewWithNameResponse build() {
            return new CapacityReservationInstanceViewWithNameResponse(name, statuses, utilizationInfo);
        }
    }
}
