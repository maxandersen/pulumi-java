// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_beta.outputs.AllocationSpecificSKUAllocationReservedInstancePropertiesResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AllocationSpecificSKUReservationResponse {
    /**
     * Indicates how many instances are actually usable currently.
     * 
     */
    private final String assuredCount;
    /**
     * Specifies the number of resources that are allocated.
     * 
     */
    private final String count;
    /**
     * Indicates how many instances are in use.
     * 
     */
    private final String inUseCount;
    /**
     * The instance properties for the reservation.
     * 
     */
    private final AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties;

    @CustomType.Constructor
    private AllocationSpecificSKUReservationResponse(
        @CustomType.Parameter("assuredCount") String assuredCount,
        @CustomType.Parameter("count") String count,
        @CustomType.Parameter("inUseCount") String inUseCount,
        @CustomType.Parameter("instanceProperties") AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties) {
        this.assuredCount = assuredCount;
        this.count = count;
        this.inUseCount = inUseCount;
        this.instanceProperties = instanceProperties;
    }

    /**
     * Indicates how many instances are actually usable currently.
     * 
    */
    public String assuredCount() {
        return this.assuredCount;
    }
    /**
     * Specifies the number of resources that are allocated.
     * 
    */
    public String count() {
        return this.count;
    }
    /**
     * Indicates how many instances are in use.
     * 
    */
    public String inUseCount() {
        return this.inUseCount;
    }
    /**
     * The instance properties for the reservation.
     * 
    */
    public AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties() {
        return this.instanceProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationSpecificSKUReservationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assuredCount;
        private String count;
        private String inUseCount;
        private AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(AllocationSpecificSKUReservationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assuredCount = defaults.assuredCount;
    	      this.count = defaults.count;
    	      this.inUseCount = defaults.inUseCount;
    	      this.instanceProperties = defaults.instanceProperties;
        }

        public Builder assuredCount(String assuredCount) {
            this.assuredCount = Objects.requireNonNull(assuredCount);
            return this;
        }
        public Builder count(String count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder inUseCount(String inUseCount) {
            this.inUseCount = Objects.requireNonNull(inUseCount);
            return this;
        }
        public Builder instanceProperties(AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties) {
            this.instanceProperties = Objects.requireNonNull(instanceProperties);
            return this;
        }        public AllocationSpecificSKUReservationResponse build() {
            return new AllocationSpecificSKUReservationResponse(assuredCount, count, inUseCount, instanceProperties);
        }
    }
}
