// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.AllocationSpecificSKUAllocationReservedInstancePropertiesResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
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

    @OutputCustomType.Constructor
    private AllocationSpecificSKUReservationResponse(
        @OutputCustomType.Parameter("assuredCount") String assuredCount,
        @OutputCustomType.Parameter("count") String count,
        @OutputCustomType.Parameter("inUseCount") String inUseCount,
        @OutputCustomType.Parameter("instanceProperties") AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties) {
        this.assuredCount = assuredCount;
        this.count = count;
        this.inUseCount = inUseCount;
        this.instanceProperties = instanceProperties;
    }

    /**
     * Indicates how many instances are actually usable currently.
     * 
    */
    public String getAssuredCount() {
        return this.assuredCount;
    }
    /**
     * Specifies the number of resources that are allocated.
     * 
    */
    public String getCount() {
        return this.count;
    }
    /**
     * Indicates how many instances are in use.
     * 
    */
    public String getInUseCount() {
        return this.inUseCount;
    }
    /**
     * The instance properties for the reservation.
     * 
    */
    public AllocationSpecificSKUAllocationReservedInstancePropertiesResponse getInstanceProperties() {
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

        public Builder setAssuredCount(String assuredCount) {
            this.assuredCount = Objects.requireNonNull(assuredCount);
            return this;
        }

        public Builder setCount(String count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setInUseCount(String inUseCount) {
            this.inUseCount = Objects.requireNonNull(inUseCount);
            return this;
        }

        public Builder setInstanceProperties(AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties) {
            this.instanceProperties = Objects.requireNonNull(instanceProperties);
            return this;
        }
        public AllocationSpecificSKUReservationResponse build() {
            return new AllocationSpecificSKUReservationResponse(assuredCount, count, inUseCount, instanceProperties);
        }
    }
}
