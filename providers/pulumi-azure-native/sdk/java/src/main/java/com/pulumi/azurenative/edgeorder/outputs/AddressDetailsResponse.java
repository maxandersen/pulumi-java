// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.outputs;

import com.pulumi.azurenative.edgeorder.outputs.AddressPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class AddressDetailsResponse {
    /**
     * Customer address and contact details. It should be address resource
     * 
     */
    private final AddressPropertiesResponse forwardAddress;
    /**
     * Return shipping address
     * 
     */
    private final AddressPropertiesResponse returnAddress;

    @CustomType.Constructor
    private AddressDetailsResponse(
        @CustomType.Parameter("forwardAddress") AddressPropertiesResponse forwardAddress,
        @CustomType.Parameter("returnAddress") AddressPropertiesResponse returnAddress) {
        this.forwardAddress = forwardAddress;
        this.returnAddress = returnAddress;
    }

    /**
     * Customer address and contact details. It should be address resource
     * 
    */
    public AddressPropertiesResponse forwardAddress() {
        return this.forwardAddress;
    }
    /**
     * Return shipping address
     * 
    */
    public AddressPropertiesResponse returnAddress() {
        return this.returnAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressPropertiesResponse forwardAddress;
        private AddressPropertiesResponse returnAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardAddress = defaults.forwardAddress;
    	      this.returnAddress = defaults.returnAddress;
        }

        public Builder forwardAddress(AddressPropertiesResponse forwardAddress) {
            this.forwardAddress = Objects.requireNonNull(forwardAddress);
            return this;
        }
        public Builder returnAddress(AddressPropertiesResponse returnAddress) {
            this.returnAddress = Objects.requireNonNull(returnAddress);
            return this;
        }        public AddressDetailsResponse build() {
            return new AddressDetailsResponse(forwardAddress, returnAddress);
        }
    }
}
