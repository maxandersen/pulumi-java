// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.outputs;

import com.pulumi.azurenative.edgeorder.outputs.Pav2MeterDetailsResponse;
import com.pulumi.azurenative.edgeorder.outputs.PurchaseMeterDetailsResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BillingMeterDetailsResponse {
    /**
     * Frequency of recurrence
     * 
     */
    private final String frequency;
    /**
     * Represents MeterDetails
     * 
     */
    private final Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails;
    /**
     * Represents Metering type (eg one-time or recurrent)
     * 
     */
    private final String meteringType;
    /**
     * Represents Billing type name
     * 
     */
    private final String name;

    @CustomType.Constructor
    private BillingMeterDetailsResponse(
        @CustomType.Parameter("frequency") String frequency,
        @CustomType.Parameter("meterDetails") Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails,
        @CustomType.Parameter("meteringType") String meteringType,
        @CustomType.Parameter("name") String name) {
        this.frequency = frequency;
        this.meterDetails = meterDetails;
        this.meteringType = meteringType;
        this.name = name;
    }

    /**
     * Frequency of recurrence
     * 
    */
    public String frequency() {
        return this.frequency;
    }
    /**
     * Represents MeterDetails
     * 
    */
    public Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails() {
        return this.meterDetails;
    }
    /**
     * Represents Metering type (eg one-time or recurrent)
     * 
    */
    public String meteringType() {
        return this.meteringType;
    }
    /**
     * Represents Billing type name
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingMeterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frequency;
        private Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails;
        private String meteringType;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingMeterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.meterDetails = defaults.meterDetails;
    	      this.meteringType = defaults.meteringType;
    	      this.name = defaults.name;
        }

        public Builder frequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }
        public Builder meterDetails(Either<Pav2MeterDetailsResponse,PurchaseMeterDetailsResponse> meterDetails) {
            this.meterDetails = Objects.requireNonNull(meterDetails);
            return this;
        }
        public Builder meteringType(String meteringType) {
            this.meteringType = Objects.requireNonNull(meteringType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public BillingMeterDetailsResponse build() {
            return new BillingMeterDetailsResponse(frequency, meterDetails, meteringType, name);
        }
    }
}
