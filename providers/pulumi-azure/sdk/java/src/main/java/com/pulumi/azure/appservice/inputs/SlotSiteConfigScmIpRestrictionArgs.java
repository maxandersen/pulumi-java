// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.SlotSiteConfigScmIpRestrictionHeadersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SlotSiteConfigScmIpRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlotSiteConfigScmIpRestrictionArgs Empty = new SlotSiteConfigScmIpRestrictionArgs();

    /**
     * Does this restriction `Allow` or `Deny` access for this IP range. Defaults to `Allow`.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return Does this restriction `Allow` or `Deny` access for this IP range. Defaults to `Allow`.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The headers for this specific `ip_restriction` as defined below. The HTTP header filters are evaluated after the rule itself and both conditions must be true for the rule to apply.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<SlotSiteConfigScmIpRestrictionHeadersArgs> headers;

    /**
     * @return The headers for this specific `ip_restriction` as defined below. The HTTP header filters are evaluated after the rule itself and both conditions must be true for the rule to apply.
     * 
     */
    public Optional<Output<SlotSiteConfigScmIpRestrictionHeadersArgs>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * The IP Address used for this IP Restriction in CIDR notation.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The IP Address used for this IP Restriction in CIDR notation.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Specifies the name of the App Service Slot component. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the App Service Slot component. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The priority for this IP Restriction. Restrictions are enforced in priority order. By default, priority is set to 65000 if not specified.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority for this IP Restriction. Restrictions are enforced in priority order. By default, priority is set to 65000 if not specified.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The Service Tag used for this IP Restriction.
     * 
     */
    @Import(name="serviceTag")
    private @Nullable Output<String> serviceTag;

    /**
     * @return The Service Tag used for this IP Restriction.
     * 
     */
    public Optional<Output<String>> serviceTag() {
        return Optional.ofNullable(this.serviceTag);
    }

    /**
     * The Virtual Network Subnet ID used for this IP Restriction.
     * 
     */
    @Import(name="virtualNetworkSubnetId")
    private @Nullable Output<String> virtualNetworkSubnetId;

    /**
     * @return The Virtual Network Subnet ID used for this IP Restriction.
     * 
     */
    public Optional<Output<String>> virtualNetworkSubnetId() {
        return Optional.ofNullable(this.virtualNetworkSubnetId);
    }

    private SlotSiteConfigScmIpRestrictionArgs() {}

    private SlotSiteConfigScmIpRestrictionArgs(SlotSiteConfigScmIpRestrictionArgs $) {
        this.action = $.action;
        this.headers = $.headers;
        this.ipAddress = $.ipAddress;
        this.name = $.name;
        this.priority = $.priority;
        this.serviceTag = $.serviceTag;
        this.virtualNetworkSubnetId = $.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlotSiteConfigScmIpRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlotSiteConfigScmIpRestrictionArgs $;

        public Builder() {
            $ = new SlotSiteConfigScmIpRestrictionArgs();
        }

        public Builder(SlotSiteConfigScmIpRestrictionArgs defaults) {
            $ = new SlotSiteConfigScmIpRestrictionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Does this restriction `Allow` or `Deny` access for this IP range. Defaults to `Allow`.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Does this restriction `Allow` or `Deny` access for this IP range. Defaults to `Allow`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param headers The headers for this specific `ip_restriction` as defined below. The HTTP header filters are evaluated after the rule itself and both conditions must be true for the rule to apply.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<SlotSiteConfigScmIpRestrictionHeadersArgs> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers The headers for this specific `ip_restriction` as defined below. The HTTP header filters are evaluated after the rule itself and both conditions must be true for the rule to apply.
         * 
         * @return builder
         * 
         */
        public Builder headers(SlotSiteConfigScmIpRestrictionHeadersArgs headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param ipAddress The IP Address used for this IP Restriction in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP Address used for this IP Restriction in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param name Specifies the name of the App Service Slot component. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the App Service Slot component. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority The priority for this IP Restriction. Restrictions are enforced in priority order. By default, priority is set to 65000 if not specified.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority for this IP Restriction. Restrictions are enforced in priority order. By default, priority is set to 65000 if not specified.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param serviceTag The Service Tag used for this IP Restriction.
         * 
         * @return builder
         * 
         */
        public Builder serviceTag(@Nullable Output<String> serviceTag) {
            $.serviceTag = serviceTag;
            return this;
        }

        /**
         * @param serviceTag The Service Tag used for this IP Restriction.
         * 
         * @return builder
         * 
         */
        public Builder serviceTag(String serviceTag) {
            return serviceTag(Output.of(serviceTag));
        }

        /**
         * @param virtualNetworkSubnetId The Virtual Network Subnet ID used for this IP Restriction.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkSubnetId(@Nullable Output<String> virtualNetworkSubnetId) {
            $.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }

        /**
         * @param virtualNetworkSubnetId The Virtual Network Subnet ID used for this IP Restriction.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkSubnetId(String virtualNetworkSubnetId) {
            return virtualNetworkSubnetId(Output.of(virtualNetworkSubnetId));
        }

        public SlotSiteConfigScmIpRestrictionArgs build() {
            return $;
        }
    }

}
