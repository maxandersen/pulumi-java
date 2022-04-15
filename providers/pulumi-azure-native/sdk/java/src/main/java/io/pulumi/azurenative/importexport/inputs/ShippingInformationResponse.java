// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about the Microsoft datacenter to which the drives should be shipped.
 * 
 */
public final class ShippingInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShippingInformationResponse Empty = new ShippingInformationResponse();

    /**
     * Additional shipping information for customer, specific to datacenter to which customer should send their disks.
     * 
     */
    @Import(name="additionalInformation", required=true)
      private final String additionalInformation;

    public String additionalInformation() {
        return this.additionalInformation;
    }

    /**
     * The city name to use when returning the drives.
     * 
     */
    @Import(name="city")
      private final @Nullable String city;

    public Optional<String> city() {
        return this.city == null ? Optional.empty() : Optional.ofNullable(this.city);
    }

    /**
     * The country or region to use when returning the drives.
     * 
     */
    @Import(name="countryOrRegion")
      private final @Nullable String countryOrRegion;

    public Optional<String> countryOrRegion() {
        return this.countryOrRegion == null ? Optional.empty() : Optional.ofNullable(this.countryOrRegion);
    }

    /**
     * Phone number of the recipient of the returned drives.
     * 
     */
    @Import(name="phone")
      private final @Nullable String phone;

    public Optional<String> phone() {
        return this.phone == null ? Optional.empty() : Optional.ofNullable(this.phone);
    }

    /**
     * The postal code to use when returning the drives.
     * 
     */
    @Import(name="postalCode")
      private final @Nullable String postalCode;

    public Optional<String> postalCode() {
        return this.postalCode == null ? Optional.empty() : Optional.ofNullable(this.postalCode);
    }

    /**
     * The name of the recipient who will receive the hard drives when they are returned.
     * 
     */
    @Import(name="recipientName")
      private final @Nullable String recipientName;

    public Optional<String> recipientName() {
        return this.recipientName == null ? Optional.empty() : Optional.ofNullable(this.recipientName);
    }

    /**
     * The state or province to use when returning the drives.
     * 
     */
    @Import(name="stateOrProvince")
      private final @Nullable String stateOrProvince;

    public Optional<String> stateOrProvince() {
        return this.stateOrProvince == null ? Optional.empty() : Optional.ofNullable(this.stateOrProvince);
    }

    /**
     * The first line of the street address to use when returning the drives.
     * 
     */
    @Import(name="streetAddress1")
      private final @Nullable String streetAddress1;

    public Optional<String> streetAddress1() {
        return this.streetAddress1 == null ? Optional.empty() : Optional.ofNullable(this.streetAddress1);
    }

    /**
     * The second line of the street address to use when returning the drives.
     * 
     */
    @Import(name="streetAddress2")
      private final @Nullable String streetAddress2;

    public Optional<String> streetAddress2() {
        return this.streetAddress2 == null ? Optional.empty() : Optional.ofNullable(this.streetAddress2);
    }

    public ShippingInformationResponse(
        String additionalInformation,
        @Nullable String city,
        @Nullable String countryOrRegion,
        @Nullable String phone,
        @Nullable String postalCode,
        @Nullable String recipientName,
        @Nullable String stateOrProvince,
        @Nullable String streetAddress1,
        @Nullable String streetAddress2) {
        this.additionalInformation = Objects.requireNonNull(additionalInformation, "expected parameter 'additionalInformation' to be non-null");
        this.city = city;
        this.countryOrRegion = countryOrRegion;
        this.phone = phone;
        this.postalCode = postalCode;
        this.recipientName = recipientName;
        this.stateOrProvince = stateOrProvince;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
    }

    private ShippingInformationResponse() {
        this.additionalInformation = null;
        this.city = null;
        this.countryOrRegion = null;
        this.phone = null;
        this.postalCode = null;
        this.recipientName = null;
        this.stateOrProvince = null;
        this.streetAddress1 = null;
        this.streetAddress2 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShippingInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String additionalInformation;
        private @Nullable String city;
        private @Nullable String countryOrRegion;
        private @Nullable String phone;
        private @Nullable String postalCode;
        private @Nullable String recipientName;
        private @Nullable String stateOrProvince;
        private @Nullable String streetAddress1;
        private @Nullable String streetAddress2;

        public Builder() {
    	      // Empty
        }

        public Builder(ShippingInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInformation = defaults.additionalInformation;
    	      this.city = defaults.city;
    	      this.countryOrRegion = defaults.countryOrRegion;
    	      this.phone = defaults.phone;
    	      this.postalCode = defaults.postalCode;
    	      this.recipientName = defaults.recipientName;
    	      this.stateOrProvince = defaults.stateOrProvince;
    	      this.streetAddress1 = defaults.streetAddress1;
    	      this.streetAddress2 = defaults.streetAddress2;
        }

        public Builder additionalInformation(String additionalInformation) {
            this.additionalInformation = Objects.requireNonNull(additionalInformation);
            return this;
        }
        public Builder city(@Nullable String city) {
            this.city = city;
            return this;
        }
        public Builder countryOrRegion(@Nullable String countryOrRegion) {
            this.countryOrRegion = countryOrRegion;
            return this;
        }
        public Builder phone(@Nullable String phone) {
            this.phone = phone;
            return this;
        }
        public Builder postalCode(@Nullable String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder recipientName(@Nullable String recipientName) {
            this.recipientName = recipientName;
            return this;
        }
        public Builder stateOrProvince(@Nullable String stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }
        public Builder streetAddress1(@Nullable String streetAddress1) {
            this.streetAddress1 = streetAddress1;
            return this;
        }
        public Builder streetAddress2(@Nullable String streetAddress2) {
            this.streetAddress2 = streetAddress2;
            return this;
        }        public ShippingInformationResponse build() {
            return new ShippingInformationResponse(additionalInformation, city, countryOrRegion, phone, postalCode, recipientName, stateOrProvince, streetAddress1, streetAddress2);
        }
    }
}
