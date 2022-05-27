// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.PointToPointVpnGatewayConnectionConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PointToPointVpnGatewayState extends com.pulumi.resources.ResourceArgs {

    public static final PointToPointVpnGatewayState Empty = new PointToPointVpnGatewayState();

    /**
     * A `connection_configuration` block as defined below.
     * 
     */
    @Import(name="connectionConfiguration")
    private @Nullable Output<PointToPointVpnGatewayConnectionConfigurationArgs> connectionConfiguration;

    /**
     * @return A `connection_configuration` block as defined below.
     * 
     */
    public Optional<Output<PointToPointVpnGatewayConnectionConfigurationArgs>> connectionConfiguration() {
        return Optional.ofNullable(this.connectionConfiguration);
    }

    /**
     * A list of IP Addresses of DNS Servers for the Point-to-Site VPN Gateway.
     * 
     */
    @Import(name="dnsServers")
    private @Nullable Output<List<String>> dnsServers;

    /**
     * @return A list of IP Addresses of DNS Servers for the Point-to-Site VPN Gateway.
     * 
     */
    public Optional<Output<List<String>>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Point-to-Site VPN Gateway. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Point-to-Site VPN Gateway. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the Point-to-Site VPN Gateway. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Point-to-Site VPN Gateway. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The [Scale Unit](https://docs.microsoft.com/en-us/azure/virtual-wan/virtual-wan-faq#what-is-a-virtual-wan-gateway-scale-unit) for this Point-to-Site VPN Gateway.
     * 
     */
    @Import(name="scaleUnit")
    private @Nullable Output<Integer> scaleUnit;

    /**
     * @return The [Scale Unit](https://docs.microsoft.com/en-us/azure/virtual-wan/virtual-wan-faq#what-is-a-virtual-wan-gateway-scale-unit) for this Point-to-Site VPN Gateway.
     * 
     */
    public Optional<Output<Integer>> scaleUnit() {
        return Optional.ofNullable(this.scaleUnit);
    }

    /**
     * A mapping of tags to assign to the Point-to-Site VPN Gateway.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Point-to-Site VPN Gateway.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the Virtual Hub where this Point-to-Site VPN Gateway should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualHubId")
    private @Nullable Output<String> virtualHubId;

    /**
     * @return The ID of the Virtual Hub where this Point-to-Site VPN Gateway should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> virtualHubId() {
        return Optional.ofNullable(this.virtualHubId);
    }

    /**
     * The ID of the VPN Server Configuration which this Point-to-Site VPN Gateway should use. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="vpnServerConfigurationId")
    private @Nullable Output<String> vpnServerConfigurationId;

    /**
     * @return The ID of the VPN Server Configuration which this Point-to-Site VPN Gateway should use. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> vpnServerConfigurationId() {
        return Optional.ofNullable(this.vpnServerConfigurationId);
    }

    private PointToPointVpnGatewayState() {}

    private PointToPointVpnGatewayState(PointToPointVpnGatewayState $) {
        this.connectionConfiguration = $.connectionConfiguration;
        this.dnsServers = $.dnsServers;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.scaleUnit = $.scaleUnit;
        this.tags = $.tags;
        this.virtualHubId = $.virtualHubId;
        this.vpnServerConfigurationId = $.vpnServerConfigurationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PointToPointVpnGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PointToPointVpnGatewayState $;

        public Builder() {
            $ = new PointToPointVpnGatewayState();
        }

        public Builder(PointToPointVpnGatewayState defaults) {
            $ = new PointToPointVpnGatewayState(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionConfiguration A `connection_configuration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionConfiguration(@Nullable Output<PointToPointVpnGatewayConnectionConfigurationArgs> connectionConfiguration) {
            $.connectionConfiguration = connectionConfiguration;
            return this;
        }

        /**
         * @param connectionConfiguration A `connection_configuration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionConfiguration(PointToPointVpnGatewayConnectionConfigurationArgs connectionConfiguration) {
            return connectionConfiguration(Output.of(connectionConfiguration));
        }

        /**
         * @param dnsServers A list of IP Addresses of DNS Servers for the Point-to-Site VPN Gateway.
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        /**
         * @param dnsServers A list of IP Addresses of DNS Servers for the Point-to-Site VPN Gateway.
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(List<String> dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        /**
         * @param dnsServers A list of IP Addresses of DNS Servers for the Point-to-Site VPN Gateway.
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Point-to-Site VPN Gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Point-to-Site VPN Gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Point-to-Site VPN Gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Point-to-Site VPN Gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scaleUnit The [Scale Unit](https://docs.microsoft.com/en-us/azure/virtual-wan/virtual-wan-faq#what-is-a-virtual-wan-gateway-scale-unit) for this Point-to-Site VPN Gateway.
         * 
         * @return builder
         * 
         */
        public Builder scaleUnit(@Nullable Output<Integer> scaleUnit) {
            $.scaleUnit = scaleUnit;
            return this;
        }

        /**
         * @param scaleUnit The [Scale Unit](https://docs.microsoft.com/en-us/azure/virtual-wan/virtual-wan-faq#what-is-a-virtual-wan-gateway-scale-unit) for this Point-to-Site VPN Gateway.
         * 
         * @return builder
         * 
         */
        public Builder scaleUnit(Integer scaleUnit) {
            return scaleUnit(Output.of(scaleUnit));
        }

        /**
         * @param tags A mapping of tags to assign to the Point-to-Site VPN Gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the Point-to-Site VPN Gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param virtualHubId The ID of the Virtual Hub where this Point-to-Site VPN Gateway should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubId(@Nullable Output<String> virtualHubId) {
            $.virtualHubId = virtualHubId;
            return this;
        }

        /**
         * @param virtualHubId The ID of the Virtual Hub where this Point-to-Site VPN Gateway should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubId(String virtualHubId) {
            return virtualHubId(Output.of(virtualHubId));
        }

        /**
         * @param vpnServerConfigurationId The ID of the VPN Server Configuration which this Point-to-Site VPN Gateway should use. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vpnServerConfigurationId(@Nullable Output<String> vpnServerConfigurationId) {
            $.vpnServerConfigurationId = vpnServerConfigurationId;
            return this;
        }

        /**
         * @param vpnServerConfigurationId The ID of the VPN Server Configuration which this Point-to-Site VPN Gateway should use. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vpnServerConfigurationId(String vpnServerConfigurationId) {
            return vpnServerConfigurationId(Output.of(vpnServerConfigurationId));
        }

        public PointToPointVpnGatewayState build() {
            return $;
        }
    }

}
