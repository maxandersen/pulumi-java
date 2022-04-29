// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The shipping address of the customer.
 * 
 */
public final class AddressArgs extends ResourceArgs {

    public static final AddressArgs Empty = new AddressArgs();

    /**
     * The address line1.
     * 
     */
    @Import(name="addressLine1")
    private @Nullable Output<String> addressLine1;

    /**
     * @return The address line1.
     * 
     */
    public Optional<Output<String>> addressLine1() {
        return Optional.ofNullable(this.addressLine1);
    }

    /**
     * The address line2.
     * 
     */
    @Import(name="addressLine2")
    private @Nullable Output<String> addressLine2;

    /**
     * @return The address line2.
     * 
     */
    public Optional<Output<String>> addressLine2() {
        return Optional.ofNullable(this.addressLine2);
    }

    /**
     * The address line3.
     * 
     */
    @Import(name="addressLine3")
    private @Nullable Output<String> addressLine3;

    /**
     * @return The address line3.
     * 
     */
    public Optional<Output<String>> addressLine3() {
        return Optional.ofNullable(this.addressLine3);
    }

    /**
     * The city name.
     * 
     */
    @Import(name="city")
    private @Nullable Output<String> city;

    /**
     * @return The city name.
     * 
     */
    public Optional<Output<String>> city() {
        return Optional.ofNullable(this.city);
    }

    /**
     * The country name.
     * 
     */
    @Import(name="country", required=true)
    private Output<String> country;

    /**
     * @return The country name.
     * 
     */
    public Output<String> country() {
        return this.country;
    }

    /**
     * The postal code.
     * 
     */
    @Import(name="postalCode")
    private @Nullable Output<String> postalCode;

    /**
     * @return The postal code.
     * 
     */
    public Optional<Output<String>> postalCode() {
        return Optional.ofNullable(this.postalCode);
    }

    /**
     * The state name.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state name.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private AddressArgs() {}

    private AddressArgs(AddressArgs $) {
        this.addressLine1 = $.addressLine1;
        this.addressLine2 = $.addressLine2;
        this.addressLine3 = $.addressLine3;
        this.city = $.city;
        this.country = $.country;
        this.postalCode = $.postalCode;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressArgs $;

        public Builder() {
            $ = new AddressArgs();
        }

        public Builder(AddressArgs defaults) {
            $ = new AddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressLine1 The address line1.
         * 
         * @return builder
         * 
         */
        public Builder addressLine1(@Nullable Output<String> addressLine1) {
            $.addressLine1 = addressLine1;
            return this;
        }

        /**
         * @param addressLine1 The address line1.
         * 
         * @return builder
         * 
         */
        public Builder addressLine1(String addressLine1) {
            return addressLine1(Output.of(addressLine1));
        }

        /**
         * @param addressLine2 The address line2.
         * 
         * @return builder
         * 
         */
        public Builder addressLine2(@Nullable Output<String> addressLine2) {
            $.addressLine2 = addressLine2;
            return this;
        }

        /**
         * @param addressLine2 The address line2.
         * 
         * @return builder
         * 
         */
        public Builder addressLine2(String addressLine2) {
            return addressLine2(Output.of(addressLine2));
        }

        /**
         * @param addressLine3 The address line3.
         * 
         * @return builder
         * 
         */
        public Builder addressLine3(@Nullable Output<String> addressLine3) {
            $.addressLine3 = addressLine3;
            return this;
        }

        /**
         * @param addressLine3 The address line3.
         * 
         * @return builder
         * 
         */
        public Builder addressLine3(String addressLine3) {
            return addressLine3(Output.of(addressLine3));
        }

        /**
         * @param city The city name.
         * 
         * @return builder
         * 
         */
        public Builder city(@Nullable Output<String> city) {
            $.city = city;
            return this;
        }

        /**
         * @param city The city name.
         * 
         * @return builder
         * 
         */
        public Builder city(String city) {
            return city(Output.of(city));
        }

        /**
         * @param country The country name.
         * 
         * @return builder
         * 
         */
        public Builder country(Output<String> country) {
            $.country = country;
            return this;
        }

        /**
         * @param country The country name.
         * 
         * @return builder
         * 
         */
        public Builder country(String country) {
            return country(Output.of(country));
        }

        /**
         * @param postalCode The postal code.
         * 
         * @return builder
         * 
         */
        public Builder postalCode(@Nullable Output<String> postalCode) {
            $.postalCode = postalCode;
            return this;
        }

        /**
         * @param postalCode The postal code.
         * 
         * @return builder
         * 
         */
        public Builder postalCode(String postalCode) {
            return postalCode(Output.of(postalCode));
        }

        /**
         * @param state The state name.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state name.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public AddressArgs build() {
            $.country = Objects.requireNonNull($.country, "expected parameter 'country' to be non-null");
            return $;
        }
    }

}
