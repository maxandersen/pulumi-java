// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class Pav2MeterDetailsResponse {
    /**
     * Represents billing type.
     * Expected value is 'Pav2'.
     * 
     */
    private final String billingType;
    /**
     * Charging type.
     * 
     */
    private final String chargingType;
    /**
     * Validation status of requested data center and transport.
     * 
     */
    private final String meterGuid;
    /**
     * Billing unit applicable for Pav2 billing
     * 
     */
    private final Double multiplier;

    @CustomType.Constructor
    private Pav2MeterDetailsResponse(
        @CustomType.Parameter("billingType") String billingType,
        @CustomType.Parameter("chargingType") String chargingType,
        @CustomType.Parameter("meterGuid") String meterGuid,
        @CustomType.Parameter("multiplier") Double multiplier) {
        this.billingType = billingType;
        this.chargingType = chargingType;
        this.meterGuid = meterGuid;
        this.multiplier = multiplier;
    }

    /**
     * Represents billing type.
     * Expected value is 'Pav2'.
     * 
    */
    public String billingType() {
        return this.billingType;
    }
    /**
     * Charging type.
     * 
    */
    public String chargingType() {
        return this.chargingType;
    }
    /**
     * Validation status of requested data center and transport.
     * 
    */
    public String meterGuid() {
        return this.meterGuid;
    }
    /**
     * Billing unit applicable for Pav2 billing
     * 
    */
    public Double multiplier() {
        return this.multiplier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Pav2MeterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingType;
        private String chargingType;
        private String meterGuid;
        private Double multiplier;

        public Builder() {
    	      // Empty
        }

        public Builder(Pav2MeterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingType = defaults.billingType;
    	      this.chargingType = defaults.chargingType;
    	      this.meterGuid = defaults.meterGuid;
    	      this.multiplier = defaults.multiplier;
        }

        public Builder billingType(String billingType) {
            this.billingType = Objects.requireNonNull(billingType);
            return this;
        }
        public Builder chargingType(String chargingType) {
            this.chargingType = Objects.requireNonNull(chargingType);
            return this;
        }
        public Builder meterGuid(String meterGuid) {
            this.meterGuid = Objects.requireNonNull(meterGuid);
            return this;
        }
        public Builder multiplier(Double multiplier) {
            this.multiplier = Objects.requireNonNull(multiplier);
            return this;
        }        public Pav2MeterDetailsResponse build() {
            return new Pav2MeterDetailsResponse(billingType, chargingType, meterGuid, multiplier);
        }
    }
}
