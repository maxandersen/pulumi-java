// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.ContactDetailsResponse;
import io.pulumi.azurenative.edgeorder.inputs.ShippingAddressResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Address Properties
 * 
 */
public final class AddressPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AddressPropertiesResponse Empty = new AddressPropertiesResponse();

    /**
     * Status of address validation
     * 
     */
    @Import(name="addressValidationStatus", required=true)
      private final String addressValidationStatus;

    public String addressValidationStatus() {
        return this.addressValidationStatus;
    }

    /**
     * Contact details for the address
     * 
     */
    @Import(name="contactDetails", required=true)
      private final ContactDetailsResponse contactDetails;

    public ContactDetailsResponse contactDetails() {
        return this.contactDetails;
    }

    /**
     * Shipping details for the address
     * 
     */
    @Import(name="shippingAddress")
      private final @Nullable ShippingAddressResponse shippingAddress;

    public Optional<ShippingAddressResponse> shippingAddress() {
        return this.shippingAddress == null ? Optional.empty() : Optional.ofNullable(this.shippingAddress);
    }

    public AddressPropertiesResponse(
        String addressValidationStatus,
        ContactDetailsResponse contactDetails,
        @Nullable ShippingAddressResponse shippingAddress) {
        this.addressValidationStatus = Objects.requireNonNull(addressValidationStatus, "expected parameter 'addressValidationStatus' to be non-null");
        this.contactDetails = Objects.requireNonNull(contactDetails, "expected parameter 'contactDetails' to be non-null");
        this.shippingAddress = shippingAddress;
    }

    private AddressPropertiesResponse() {
        this.addressValidationStatus = null;
        this.contactDetails = null;
        this.shippingAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressValidationStatus;
        private ContactDetailsResponse contactDetails;
        private @Nullable ShippingAddressResponse shippingAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressValidationStatus = defaults.addressValidationStatus;
    	      this.contactDetails = defaults.contactDetails;
    	      this.shippingAddress = defaults.shippingAddress;
        }

        public Builder addressValidationStatus(String addressValidationStatus) {
            this.addressValidationStatus = Objects.requireNonNull(addressValidationStatus);
            return this;
        }
        public Builder contactDetails(ContactDetailsResponse contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }
        public Builder shippingAddress(@Nullable ShippingAddressResponse shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }        public AddressPropertiesResponse build() {
            return new AddressPropertiesResponse(addressValidationStatus, contactDetails, shippingAddress);
        }
    }
}
