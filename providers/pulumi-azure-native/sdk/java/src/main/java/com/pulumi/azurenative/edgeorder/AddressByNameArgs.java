// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder;

import com.pulumi.azurenative.edgeorder.inputs.ContactDetailsArgs;
import com.pulumi.azurenative.edgeorder.inputs.ShippingAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AddressByNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final AddressByNameArgs Empty = new AddressByNameArgs();

    /**
     * The name of the address Resource within the specified resource group. address names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @Import(name="addressName")
    private @Nullable Output<String> addressName;

    /**
     * @return The name of the address Resource within the specified resource group. address names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    public Optional<Output<String>> addressName() {
        return Optional.ofNullable(this.addressName);
    }

    /**
     * Contact details for the address
     * 
     */
    @Import(name="contactDetails", required=true)
    private Output<ContactDetailsArgs> contactDetails;

    /**
     * @return Contact details for the address
     * 
     */
    public Output<ContactDetailsArgs> contactDetails() {
        return this.contactDetails;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Shipping details for the address
     * 
     */
    @Import(name="shippingAddress")
    private @Nullable Output<ShippingAddressArgs> shippingAddress;

    /**
     * @return Shipping details for the address
     * 
     */
    public Optional<Output<ShippingAddressArgs>> shippingAddress() {
        return Optional.ofNullable(this.shippingAddress);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AddressByNameArgs() {}

    private AddressByNameArgs(AddressByNameArgs $) {
        this.addressName = $.addressName;
        this.contactDetails = $.contactDetails;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.shippingAddress = $.shippingAddress;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddressByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressByNameArgs $;

        public Builder() {
            $ = new AddressByNameArgs();
        }

        public Builder(AddressByNameArgs defaults) {
            $ = new AddressByNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressName The name of the address Resource within the specified resource group. address names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
         * 
         * @return builder
         * 
         */
        public Builder addressName(@Nullable Output<String> addressName) {
            $.addressName = addressName;
            return this;
        }

        /**
         * @param addressName The name of the address Resource within the specified resource group. address names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
         * 
         * @return builder
         * 
         */
        public Builder addressName(String addressName) {
            return addressName(Output.of(addressName));
        }

        /**
         * @param contactDetails Contact details for the address
         * 
         * @return builder
         * 
         */
        public Builder contactDetails(Output<ContactDetailsArgs> contactDetails) {
            $.contactDetails = contactDetails;
            return this;
        }

        /**
         * @param contactDetails Contact details for the address
         * 
         * @return builder
         * 
         */
        public Builder contactDetails(ContactDetailsArgs contactDetails) {
            return contactDetails(Output.of(contactDetails));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param shippingAddress Shipping details for the address
         * 
         * @return builder
         * 
         */
        public Builder shippingAddress(@Nullable Output<ShippingAddressArgs> shippingAddress) {
            $.shippingAddress = shippingAddress;
            return this;
        }

        /**
         * @param shippingAddress Shipping details for the address
         * 
         * @return builder
         * 
         */
        public Builder shippingAddress(ShippingAddressArgs shippingAddress) {
            return shippingAddress(Output.of(shippingAddress));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public AddressByNameArgs build() {
            $.contactDetails = Objects.requireNonNull($.contactDetails, "expected parameter 'contactDetails' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
