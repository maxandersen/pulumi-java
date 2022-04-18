// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.AllocationSpecificSKUAllocationReservedInstancePropertiesResponse;
import java.lang.String;
import java.util.Objects;


public final class FutureReservationSpecificSKUPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final FutureReservationSpecificSKUPropertiesResponse Empty = new FutureReservationSpecificSKUPropertiesResponse();

    /**
     * Properties of the SKU instances being reserved.
     * 
     */
    @Import(name="instanceProperties", required=true)
      private final AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties;

    public AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties() {
        return this.instanceProperties;
    }

    /**
     * Total number of instances for which capacity assurance is requested at a future time period.
     * 
     */
    @Import(name="totalCount", required=true)
      private final String totalCount;

    public String totalCount() {
        return this.totalCount;
    }

    public FutureReservationSpecificSKUPropertiesResponse(
        AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties,
        String totalCount) {
        this.instanceProperties = Objects.requireNonNull(instanceProperties, "expected parameter 'instanceProperties' to be non-null");
        this.totalCount = Objects.requireNonNull(totalCount, "expected parameter 'totalCount' to be non-null");
    }

    private FutureReservationSpecificSKUPropertiesResponse() {
        this.instanceProperties = null;
        this.totalCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FutureReservationSpecificSKUPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties;
        private String totalCount;

        public Builder() {
    	      // Empty
        }

        public Builder(FutureReservationSpecificSKUPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceProperties = defaults.instanceProperties;
    	      this.totalCount = defaults.totalCount;
        }

        public Builder instanceProperties(AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties) {
            this.instanceProperties = Objects.requireNonNull(instanceProperties);
            return this;
        }
        public Builder totalCount(String totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }        public FutureReservationSpecificSKUPropertiesResponse build() {
            return new FutureReservationSpecificSKUPropertiesResponse(instanceProperties, totalCount);
        }
    }
}
