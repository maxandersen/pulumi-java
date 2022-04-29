// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.VirtualNetworkGatewayConnectionProtocol;
import com.pulumi.azurenative.network.inputs.IpsecPolicyArgs;
import com.pulumi.azurenative.network.inputs.RoutingConfigurationArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.azurenative.network.inputs.TrafficSelectorPolicyArgs;
import com.pulumi.azurenative.network.inputs.VpnSiteLinkConnectionArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VpnConnection Resource.
 * 
 */
public final class VpnConnectionArgs extends ResourceArgs {

    public static final VpnConnectionArgs Empty = new VpnConnectionArgs();

    /**
     * Expected bandwidth in MBPS.
     * 
     */
    @Import(name="connectionBandwidth")
    private @Nullable Output<Integer> connectionBandwidth;

    /**
     * @return Expected bandwidth in MBPS.
     * 
     */
    public Optional<Output<Integer>> connectionBandwidth() {
        return Optional.ofNullable(this.connectionBandwidth);
    }

    /**
     * DPD timeout in seconds for vpn connection.
     * 
     */
    @Import(name="dpdTimeoutSeconds")
    private @Nullable Output<Integer> dpdTimeoutSeconds;

    /**
     * @return DPD timeout in seconds for vpn connection.
     * 
     */
    public Optional<Output<Integer>> dpdTimeoutSeconds() {
        return Optional.ofNullable(this.dpdTimeoutSeconds);
    }

    /**
     * EnableBgp flag.
     * 
     */
    @Import(name="enableBgp")
    private @Nullable Output<Boolean> enableBgp;

    /**
     * @return EnableBgp flag.
     * 
     */
    public Optional<Output<Boolean>> enableBgp() {
        return Optional.ofNullable(this.enableBgp);
    }

    /**
     * Enable internet security.
     * 
     */
    @Import(name="enableInternetSecurity")
    private @Nullable Output<Boolean> enableInternetSecurity;

    /**
     * @return Enable internet security.
     * 
     */
    public Optional<Output<Boolean>> enableInternetSecurity() {
        return Optional.ofNullable(this.enableInternetSecurity);
    }

    /**
     * EnableBgp flag.
     * 
     */
    @Import(name="enableRateLimiting")
    private @Nullable Output<Boolean> enableRateLimiting;

    /**
     * @return EnableBgp flag.
     * 
     */
    public Optional<Output<Boolean>> enableRateLimiting() {
        return Optional.ofNullable(this.enableRateLimiting);
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
     * The IPSec Policies to be considered by this connection.
     * 
     */
    @Import(name="ipsecPolicies")
    private @Nullable Output<List<IpsecPolicyArgs>> ipsecPolicies;

    /**
     * @return The IPSec Policies to be considered by this connection.
     * 
     */
    public Optional<Output<List<IpsecPolicyArgs>>> ipsecPolicies() {
        return Optional.ofNullable(this.ipsecPolicies);
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

    /**
     * Id of the connected vpn site.
     * 
     */
    @Import(name="remoteVpnSite")
    private @Nullable Output<SubResourceArgs> remoteVpnSite;

    /**
     * @return Id of the connected vpn site.
     * 
     */
    public Optional<Output<SubResourceArgs>> remoteVpnSite() {
        return Optional.ofNullable(this.remoteVpnSite);
    }

    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @Import(name="routingConfiguration")
    private @Nullable Output<RoutingConfigurationArgs> routingConfiguration;

    /**
     * @return The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    public Optional<Output<RoutingConfigurationArgs>> routingConfiguration() {
        return Optional.ofNullable(this.routingConfiguration);
    }

    /**
     * Routing weight for vpn connection.
     * 
     */
    @Import(name="routingWeight")
    private @Nullable Output<Integer> routingWeight;

    /**
     * @return Routing weight for vpn connection.
     * 
     */
    public Optional<Output<Integer>> routingWeight() {
        return Optional.ofNullable(this.routingWeight);
    }

    /**
     * SharedKey for the vpn connection.
     * 
     */
    @Import(name="sharedKey")
    private @Nullable Output<String> sharedKey;

    /**
     * @return SharedKey for the vpn connection.
     * 
     */
    public Optional<Output<String>> sharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }

    /**
     * The Traffic Selector Policies to be considered by this connection.
     * 
     */
    @Import(name="trafficSelectorPolicies")
    private @Nullable Output<List<TrafficSelectorPolicyArgs>> trafficSelectorPolicies;

    /**
     * @return The Traffic Selector Policies to be considered by this connection.
     * 
     */
    public Optional<Output<List<TrafficSelectorPolicyArgs>>> trafficSelectorPolicies() {
        return Optional.ofNullable(this.trafficSelectorPolicies);
    }

    /**
     * Use local azure ip to initiate connection.
     * 
     */
    @Import(name="useLocalAzureIpAddress")
    private @Nullable Output<Boolean> useLocalAzureIpAddress;

    /**
     * @return Use local azure ip to initiate connection.
     * 
     */
    public Optional<Output<Boolean>> useLocalAzureIpAddress() {
        return Optional.ofNullable(this.useLocalAzureIpAddress);
    }

    /**
     * Enable policy-based traffic selectors.
     * 
     */
    @Import(name="usePolicyBasedTrafficSelectors")
    private @Nullable Output<Boolean> usePolicyBasedTrafficSelectors;

    /**
     * @return Enable policy-based traffic selectors.
     * 
     */
    public Optional<Output<Boolean>> usePolicyBasedTrafficSelectors() {
        return Optional.ofNullable(this.usePolicyBasedTrafficSelectors);
    }

    /**
     * Connection protocol used for this connection.
     * 
     */
    @Import(name="vpnConnectionProtocolType")
    private @Nullable Output<Either<String,VirtualNetworkGatewayConnectionProtocol>> vpnConnectionProtocolType;

    /**
     * @return Connection protocol used for this connection.
     * 
     */
    public Optional<Output<Either<String,VirtualNetworkGatewayConnectionProtocol>>> vpnConnectionProtocolType() {
        return Optional.ofNullable(this.vpnConnectionProtocolType);
    }

    /**
     * List of all vpn site link connections to the gateway.
     * 
     */
    @Import(name="vpnLinkConnections")
    private @Nullable Output<List<VpnSiteLinkConnectionArgs>> vpnLinkConnections;

    /**
     * @return List of all vpn site link connections to the gateway.
     * 
     */
    public Optional<Output<List<VpnSiteLinkConnectionArgs>>> vpnLinkConnections() {
        return Optional.ofNullable(this.vpnLinkConnections);
    }

    private VpnConnectionArgs() {}

    private VpnConnectionArgs(VpnConnectionArgs $) {
        this.connectionBandwidth = $.connectionBandwidth;
        this.dpdTimeoutSeconds = $.dpdTimeoutSeconds;
        this.enableBgp = $.enableBgp;
        this.enableInternetSecurity = $.enableInternetSecurity;
        this.enableRateLimiting = $.enableRateLimiting;
        this.id = $.id;
        this.ipsecPolicies = $.ipsecPolicies;
        this.name = $.name;
        this.remoteVpnSite = $.remoteVpnSite;
        this.routingConfiguration = $.routingConfiguration;
        this.routingWeight = $.routingWeight;
        this.sharedKey = $.sharedKey;
        this.trafficSelectorPolicies = $.trafficSelectorPolicies;
        this.useLocalAzureIpAddress = $.useLocalAzureIpAddress;
        this.usePolicyBasedTrafficSelectors = $.usePolicyBasedTrafficSelectors;
        this.vpnConnectionProtocolType = $.vpnConnectionProtocolType;
        this.vpnLinkConnections = $.vpnLinkConnections;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnConnectionArgs $;

        public Builder() {
            $ = new VpnConnectionArgs();
        }

        public Builder(VpnConnectionArgs defaults) {
            $ = new VpnConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionBandwidth Expected bandwidth in MBPS.
         * 
         * @return builder
         * 
         */
        public Builder connectionBandwidth(@Nullable Output<Integer> connectionBandwidth) {
            $.connectionBandwidth = connectionBandwidth;
            return this;
        }

        /**
         * @param connectionBandwidth Expected bandwidth in MBPS.
         * 
         * @return builder
         * 
         */
        public Builder connectionBandwidth(Integer connectionBandwidth) {
            return connectionBandwidth(Output.of(connectionBandwidth));
        }

        /**
         * @param dpdTimeoutSeconds DPD timeout in seconds for vpn connection.
         * 
         * @return builder
         * 
         */
        public Builder dpdTimeoutSeconds(@Nullable Output<Integer> dpdTimeoutSeconds) {
            $.dpdTimeoutSeconds = dpdTimeoutSeconds;
            return this;
        }

        /**
         * @param dpdTimeoutSeconds DPD timeout in seconds for vpn connection.
         * 
         * @return builder
         * 
         */
        public Builder dpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
            return dpdTimeoutSeconds(Output.of(dpdTimeoutSeconds));
        }

        /**
         * @param enableBgp EnableBgp flag.
         * 
         * @return builder
         * 
         */
        public Builder enableBgp(@Nullable Output<Boolean> enableBgp) {
            $.enableBgp = enableBgp;
            return this;
        }

        /**
         * @param enableBgp EnableBgp flag.
         * 
         * @return builder
         * 
         */
        public Builder enableBgp(Boolean enableBgp) {
            return enableBgp(Output.of(enableBgp));
        }

        /**
         * @param enableInternetSecurity Enable internet security.
         * 
         * @return builder
         * 
         */
        public Builder enableInternetSecurity(@Nullable Output<Boolean> enableInternetSecurity) {
            $.enableInternetSecurity = enableInternetSecurity;
            return this;
        }

        /**
         * @param enableInternetSecurity Enable internet security.
         * 
         * @return builder
         * 
         */
        public Builder enableInternetSecurity(Boolean enableInternetSecurity) {
            return enableInternetSecurity(Output.of(enableInternetSecurity));
        }

        /**
         * @param enableRateLimiting EnableBgp flag.
         * 
         * @return builder
         * 
         */
        public Builder enableRateLimiting(@Nullable Output<Boolean> enableRateLimiting) {
            $.enableRateLimiting = enableRateLimiting;
            return this;
        }

        /**
         * @param enableRateLimiting EnableBgp flag.
         * 
         * @return builder
         * 
         */
        public Builder enableRateLimiting(Boolean enableRateLimiting) {
            return enableRateLimiting(Output.of(enableRateLimiting));
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
         * @param ipsecPolicies The IPSec Policies to be considered by this connection.
         * 
         * @return builder
         * 
         */
        public Builder ipsecPolicies(@Nullable Output<List<IpsecPolicyArgs>> ipsecPolicies) {
            $.ipsecPolicies = ipsecPolicies;
            return this;
        }

        /**
         * @param ipsecPolicies The IPSec Policies to be considered by this connection.
         * 
         * @return builder
         * 
         */
        public Builder ipsecPolicies(List<IpsecPolicyArgs> ipsecPolicies) {
            return ipsecPolicies(Output.of(ipsecPolicies));
        }

        /**
         * @param ipsecPolicies The IPSec Policies to be considered by this connection.
         * 
         * @return builder
         * 
         */
        public Builder ipsecPolicies(IpsecPolicyArgs... ipsecPolicies) {
            return ipsecPolicies(List.of(ipsecPolicies));
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

        /**
         * @param remoteVpnSite Id of the connected vpn site.
         * 
         * @return builder
         * 
         */
        public Builder remoteVpnSite(@Nullable Output<SubResourceArgs> remoteVpnSite) {
            $.remoteVpnSite = remoteVpnSite;
            return this;
        }

        /**
         * @param remoteVpnSite Id of the connected vpn site.
         * 
         * @return builder
         * 
         */
        public Builder remoteVpnSite(SubResourceArgs remoteVpnSite) {
            return remoteVpnSite(Output.of(remoteVpnSite));
        }

        /**
         * @param routingConfiguration The Routing Configuration indicating the associated and propagated route tables on this connection.
         * 
         * @return builder
         * 
         */
        public Builder routingConfiguration(@Nullable Output<RoutingConfigurationArgs> routingConfiguration) {
            $.routingConfiguration = routingConfiguration;
            return this;
        }

        /**
         * @param routingConfiguration The Routing Configuration indicating the associated and propagated route tables on this connection.
         * 
         * @return builder
         * 
         */
        public Builder routingConfiguration(RoutingConfigurationArgs routingConfiguration) {
            return routingConfiguration(Output.of(routingConfiguration));
        }

        /**
         * @param routingWeight Routing weight for vpn connection.
         * 
         * @return builder
         * 
         */
        public Builder routingWeight(@Nullable Output<Integer> routingWeight) {
            $.routingWeight = routingWeight;
            return this;
        }

        /**
         * @param routingWeight Routing weight for vpn connection.
         * 
         * @return builder
         * 
         */
        public Builder routingWeight(Integer routingWeight) {
            return routingWeight(Output.of(routingWeight));
        }

        /**
         * @param sharedKey SharedKey for the vpn connection.
         * 
         * @return builder
         * 
         */
        public Builder sharedKey(@Nullable Output<String> sharedKey) {
            $.sharedKey = sharedKey;
            return this;
        }

        /**
         * @param sharedKey SharedKey for the vpn connection.
         * 
         * @return builder
         * 
         */
        public Builder sharedKey(String sharedKey) {
            return sharedKey(Output.of(sharedKey));
        }

        /**
         * @param trafficSelectorPolicies The Traffic Selector Policies to be considered by this connection.
         * 
         * @return builder
         * 
         */
        public Builder trafficSelectorPolicies(@Nullable Output<List<TrafficSelectorPolicyArgs>> trafficSelectorPolicies) {
            $.trafficSelectorPolicies = trafficSelectorPolicies;
            return this;
        }

        /**
         * @param trafficSelectorPolicies The Traffic Selector Policies to be considered by this connection.
         * 
         * @return builder
         * 
         */
        public Builder trafficSelectorPolicies(List<TrafficSelectorPolicyArgs> trafficSelectorPolicies) {
            return trafficSelectorPolicies(Output.of(trafficSelectorPolicies));
        }

        /**
         * @param trafficSelectorPolicies The Traffic Selector Policies to be considered by this connection.
         * 
         * @return builder
         * 
         */
        public Builder trafficSelectorPolicies(TrafficSelectorPolicyArgs... trafficSelectorPolicies) {
            return trafficSelectorPolicies(List.of(trafficSelectorPolicies));
        }

        /**
         * @param useLocalAzureIpAddress Use local azure ip to initiate connection.
         * 
         * @return builder
         * 
         */
        public Builder useLocalAzureIpAddress(@Nullable Output<Boolean> useLocalAzureIpAddress) {
            $.useLocalAzureIpAddress = useLocalAzureIpAddress;
            return this;
        }

        /**
         * @param useLocalAzureIpAddress Use local azure ip to initiate connection.
         * 
         * @return builder
         * 
         */
        public Builder useLocalAzureIpAddress(Boolean useLocalAzureIpAddress) {
            return useLocalAzureIpAddress(Output.of(useLocalAzureIpAddress));
        }

        /**
         * @param usePolicyBasedTrafficSelectors Enable policy-based traffic selectors.
         * 
         * @return builder
         * 
         */
        public Builder usePolicyBasedTrafficSelectors(@Nullable Output<Boolean> usePolicyBasedTrafficSelectors) {
            $.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
            return this;
        }

        /**
         * @param usePolicyBasedTrafficSelectors Enable policy-based traffic selectors.
         * 
         * @return builder
         * 
         */
        public Builder usePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
            return usePolicyBasedTrafficSelectors(Output.of(usePolicyBasedTrafficSelectors));
        }

        /**
         * @param vpnConnectionProtocolType Connection protocol used for this connection.
         * 
         * @return builder
         * 
         */
        public Builder vpnConnectionProtocolType(@Nullable Output<Either<String,VirtualNetworkGatewayConnectionProtocol>> vpnConnectionProtocolType) {
            $.vpnConnectionProtocolType = vpnConnectionProtocolType;
            return this;
        }

        /**
         * @param vpnConnectionProtocolType Connection protocol used for this connection.
         * 
         * @return builder
         * 
         */
        public Builder vpnConnectionProtocolType(Either<String,VirtualNetworkGatewayConnectionProtocol> vpnConnectionProtocolType) {
            return vpnConnectionProtocolType(Output.of(vpnConnectionProtocolType));
        }

        /**
         * @param vpnConnectionProtocolType Connection protocol used for this connection.
         * 
         * @return builder
         * 
         */
        public Builder vpnConnectionProtocolType(String vpnConnectionProtocolType) {
            return vpnConnectionProtocolType(Either.ofLeft(vpnConnectionProtocolType));
        }

        /**
         * @param vpnConnectionProtocolType Connection protocol used for this connection.
         * 
         * @return builder
         * 
         */
        public Builder vpnConnectionProtocolType(VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType) {
            return vpnConnectionProtocolType(Either.ofRight(vpnConnectionProtocolType));
        }

        /**
         * @param vpnLinkConnections List of all vpn site link connections to the gateway.
         * 
         * @return builder
         * 
         */
        public Builder vpnLinkConnections(@Nullable Output<List<VpnSiteLinkConnectionArgs>> vpnLinkConnections) {
            $.vpnLinkConnections = vpnLinkConnections;
            return this;
        }

        /**
         * @param vpnLinkConnections List of all vpn site link connections to the gateway.
         * 
         * @return builder
         * 
         */
        public Builder vpnLinkConnections(List<VpnSiteLinkConnectionArgs> vpnLinkConnections) {
            return vpnLinkConnections(Output.of(vpnLinkConnections));
        }

        /**
         * @param vpnLinkConnections List of all vpn site link connections to the gateway.
         * 
         * @return builder
         * 
         */
        public Builder vpnLinkConnections(VpnSiteLinkConnectionArgs... vpnLinkConnections) {
            return vpnLinkConnections(List.of(vpnLinkConnections));
        }

        public VpnConnectionArgs build() {
            return $;
        }
    }

}
