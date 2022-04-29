// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.VpnLinkBgpSettingsArgs;
import com.pulumi.azurenative.network.inputs.VpnLinkProviderPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VpnSiteLink Resource.
 * 
 */
public final class VpnSiteLinkArgs extends ResourceArgs {

    public static final VpnSiteLinkArgs Empty = new VpnSiteLinkArgs();

    /**
     * The set of bgp properties.
     * 
     */
    @Import(name="bgpProperties")
    private @Nullable Output<VpnLinkBgpSettingsArgs> bgpProperties;

    /**
     * @return The set of bgp properties.
     * 
     */
    public Optional<Output<VpnLinkBgpSettingsArgs>> bgpProperties() {
        return Optional.ofNullable(this.bgpProperties);
    }

    /**
     * FQDN of vpn-site-link.
     * 
     */
    @Import(name="fqdn")
    private @Nullable Output<String> fqdn;

    /**
     * @return FQDN of vpn-site-link.
     * 
     */
    public Optional<Output<String>> fqdn() {
        return Optional.ofNullable(this.fqdn);
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
     * The ip-address for the vpn-site-link.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The ip-address for the vpn-site-link.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The link provider properties.
     * 
     */
    @Import(name="linkProperties")
    private @Nullable Output<VpnLinkProviderPropertiesArgs> linkProperties;

    /**
     * @return The link provider properties.
     * 
     */
    public Optional<Output<VpnLinkProviderPropertiesArgs>> linkProperties() {
        return Optional.ofNullable(this.linkProperties);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private VpnSiteLinkArgs() {}

    private VpnSiteLinkArgs(VpnSiteLinkArgs $) {
        this.bgpProperties = $.bgpProperties;
        this.fqdn = $.fqdn;
        this.id = $.id;
        this.ipAddress = $.ipAddress;
        this.linkProperties = $.linkProperties;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnSiteLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnSiteLinkArgs $;

        public Builder() {
            $ = new VpnSiteLinkArgs();
        }

        public Builder(VpnSiteLinkArgs defaults) {
            $ = new VpnSiteLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bgpProperties The set of bgp properties.
         * 
         * @return builder
         * 
         */
        public Builder bgpProperties(@Nullable Output<VpnLinkBgpSettingsArgs> bgpProperties) {
            $.bgpProperties = bgpProperties;
            return this;
        }

        /**
         * @param bgpProperties The set of bgp properties.
         * 
         * @return builder
         * 
         */
        public Builder bgpProperties(VpnLinkBgpSettingsArgs bgpProperties) {
            return bgpProperties(Output.of(bgpProperties));
        }

        /**
         * @param fqdn FQDN of vpn-site-link.
         * 
         * @return builder
         * 
         */
        public Builder fqdn(@Nullable Output<String> fqdn) {
            $.fqdn = fqdn;
            return this;
        }

        /**
         * @param fqdn FQDN of vpn-site-link.
         * 
         * @return builder
         * 
         */
        public Builder fqdn(String fqdn) {
            return fqdn(Output.of(fqdn));
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
         * @param ipAddress The ip-address for the vpn-site-link.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The ip-address for the vpn-site-link.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param linkProperties The link provider properties.
         * 
         * @return builder
         * 
         */
        public Builder linkProperties(@Nullable Output<VpnLinkProviderPropertiesArgs> linkProperties) {
            $.linkProperties = linkProperties;
            return this;
        }

        /**
         * @param linkProperties The link provider properties.
         * 
         * @return builder
         * 
         */
        public Builder linkProperties(VpnLinkProviderPropertiesArgs linkProperties) {
            return linkProperties(Output.of(linkProperties));
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public VpnSiteLinkArgs build() {
            return $;
        }
    }

}
