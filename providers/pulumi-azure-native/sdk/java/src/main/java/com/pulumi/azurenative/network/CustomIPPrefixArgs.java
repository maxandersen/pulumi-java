// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.CommissionedState;
import com.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomIPPrefixArgs extends ResourceArgs {

    public static final CustomIPPrefixArgs Empty = new CustomIPPrefixArgs();

    /**
     * The prefix range in CIDR notation. Should include the start address and the prefix length.
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    /**
     * @return The prefix range in CIDR notation. Should include the start address and the prefix length.
     * 
     */
    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * The commissioned state of the Custom IP Prefix.
     * 
     */
    @Import(name="commissionedState")
    private @Nullable Output<Either<String,CommissionedState>> commissionedState;

    /**
     * @return The commissioned state of the Custom IP Prefix.
     * 
     */
    public Optional<Output<Either<String,CommissionedState>>> commissionedState() {
        return Optional.ofNullable(this.commissionedState);
    }

    /**
     * The name of the custom IP prefix.
     * 
     */
    @Import(name="customIpPrefixName")
    private @Nullable Output<String> customIpPrefixName;

    /**
     * @return The name of the custom IP prefix.
     * 
     */
    public Optional<Output<String>> customIpPrefixName() {
        return Optional.ofNullable(this.customIpPrefixName);
    }

    /**
     * The extended location of the custom IP prefix.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    /**
     * @return The extended location of the custom IP prefix.
     * 
     */
    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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

    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private CustomIPPrefixArgs() {}

    private CustomIPPrefixArgs(CustomIPPrefixArgs $) {
        this.cidr = $.cidr;
        this.commissionedState = $.commissionedState;
        this.customIpPrefixName = $.customIpPrefixName;
        this.extendedLocation = $.extendedLocation;
        this.id = $.id;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomIPPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomIPPrefixArgs $;

        public Builder() {
            $ = new CustomIPPrefixArgs();
        }

        public Builder(CustomIPPrefixArgs defaults) {
            $ = new CustomIPPrefixArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr The prefix range in CIDR notation. Should include the start address and the prefix length.
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr The prefix range in CIDR notation. Should include the start address and the prefix length.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param commissionedState The commissioned state of the Custom IP Prefix.
         * 
         * @return builder
         * 
         */
        public Builder commissionedState(@Nullable Output<Either<String,CommissionedState>> commissionedState) {
            $.commissionedState = commissionedState;
            return this;
        }

        /**
         * @param commissionedState The commissioned state of the Custom IP Prefix.
         * 
         * @return builder
         * 
         */
        public Builder commissionedState(Either<String,CommissionedState> commissionedState) {
            return commissionedState(Output.of(commissionedState));
        }

        /**
         * @param commissionedState The commissioned state of the Custom IP Prefix.
         * 
         * @return builder
         * 
         */
        public Builder commissionedState(String commissionedState) {
            return commissionedState(Either.ofLeft(commissionedState));
        }

        /**
         * @param commissionedState The commissioned state of the Custom IP Prefix.
         * 
         * @return builder
         * 
         */
        public Builder commissionedState(CommissionedState commissionedState) {
            return commissionedState(Either.ofRight(commissionedState));
        }

        /**
         * @param customIpPrefixName The name of the custom IP prefix.
         * 
         * @return builder
         * 
         */
        public Builder customIpPrefixName(@Nullable Output<String> customIpPrefixName) {
            $.customIpPrefixName = customIpPrefixName;
            return this;
        }

        /**
         * @param customIpPrefixName The name of the custom IP prefix.
         * 
         * @return builder
         * 
         */
        public Builder customIpPrefixName(String customIpPrefixName) {
            return customIpPrefixName(Output.of(customIpPrefixName));
        }

        /**
         * @param extendedLocation The extended location of the custom IP prefix.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        /**
         * @param extendedLocation The extended location of the custom IP prefix.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
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

        /**
         * @param zones A list of availability zones denoting the IP allocated for the resource needs to come from.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones A list of availability zones denoting the IP allocated for the resource needs to come from.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones A list of availability zones denoting the IP allocated for the resource needs to come from.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public CustomIPPrefixArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
