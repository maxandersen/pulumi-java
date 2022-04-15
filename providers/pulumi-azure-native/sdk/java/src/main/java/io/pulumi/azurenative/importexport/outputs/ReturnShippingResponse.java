// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReturnShippingResponse {
    /**
     * The customer's account number with the carrier.
     * 
     */
    private final String carrierAccountNumber;
    /**
     * The carrier's name.
     * 
     */
    private final String carrierName;

    @CustomType.Constructor
    private ReturnShippingResponse(
        @CustomType.Parameter("carrierAccountNumber") String carrierAccountNumber,
        @CustomType.Parameter("carrierName") String carrierName) {
        this.carrierAccountNumber = carrierAccountNumber;
        this.carrierName = carrierName;
    }

    /**
     * The customer's account number with the carrier.
     * 
    */
    public String carrierAccountNumber() {
        return this.carrierAccountNumber;
    }
    /**
     * The carrier's name.
     * 
    */
    public String carrierName() {
        return this.carrierName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReturnShippingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierAccountNumber;
        private String carrierName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReturnShippingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierAccountNumber = defaults.carrierAccountNumber;
    	      this.carrierName = defaults.carrierName;
        }

        public Builder carrierAccountNumber(String carrierAccountNumber) {
            this.carrierAccountNumber = Objects.requireNonNull(carrierAccountNumber);
            return this;
        }
        public Builder carrierName(String carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }        public ReturnShippingResponse build() {
            return new ReturnShippingResponse(carrierAccountNumber, carrierName);
        }
    }
}
