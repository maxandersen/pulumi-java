// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.ExpressRoutePeeringState;
import com.pulumi.azurenative.network.enums.ExpressRoutePeeringType;
import com.pulumi.azurenative.network.inputs.ExpressRouteCircuitConnectionArgs;
import com.pulumi.azurenative.network.inputs.ExpressRouteCircuitPeeringConfigArgs;
import com.pulumi.azurenative.network.inputs.ExpressRouteCircuitStatsArgs;
import com.pulumi.azurenative.network.inputs.Ipv6ExpressRouteCircuitPeeringConfigArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Peering in an ExpressRouteCircuit resource.
 * 
 */
public final class ExpressRouteCircuitPeeringArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitPeeringArgs Empty = new ExpressRouteCircuitPeeringArgs();

    /**
     * The Azure ASN.
     * 
     */
    @Import(name="azureASN")
      private final @Nullable Output<Integer> azureASN;

    public Output<Integer> azureASN() {
        return this.azureASN == null ? Codegen.empty() : this.azureASN;
    }

    /**
     * The list of circuit connections associated with Azure Private Peering for this circuit.
     * 
     */
    @Import(name="connections")
      private final @Nullable Output<List<ExpressRouteCircuitConnectionArgs>> connections;

    public Output<List<ExpressRouteCircuitConnectionArgs>> connections() {
        return this.connections == null ? Codegen.empty() : this.connections;
    }

    /**
     * The GatewayManager Etag.
     * 
     */
    @Import(name="gatewayManagerEtag")
      private final @Nullable Output<String> gatewayManagerEtag;

    public Output<String> gatewayManagerEtag() {
        return this.gatewayManagerEtag == null ? Codegen.empty() : this.gatewayManagerEtag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The IPv6 peering configuration.
     * 
     */
    @Import(name="ipv6PeeringConfig")
      private final @Nullable Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig;

    public Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig() {
        return this.ipv6PeeringConfig == null ? Codegen.empty() : this.ipv6PeeringConfig;
    }

    /**
     * The Microsoft peering configuration.
     * 
     */
    @Import(name="microsoftPeeringConfig")
      private final @Nullable Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig;

    public Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig() {
        return this.microsoftPeeringConfig == null ? Codegen.empty() : this.microsoftPeeringConfig;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The peer ASN.
     * 
     */
    @Import(name="peerASN")
      private final @Nullable Output<Double> peerASN;

    public Output<Double> peerASN() {
        return this.peerASN == null ? Codegen.empty() : this.peerASN;
    }

    /**
     * The peering type.
     * 
     */
    @Import(name="peeringType")
      private final @Nullable Output<Either<String,ExpressRoutePeeringType>> peeringType;

    public Output<Either<String,ExpressRoutePeeringType>> peeringType() {
        return this.peeringType == null ? Codegen.empty() : this.peeringType;
    }

    /**
     * The primary port.
     * 
     */
    @Import(name="primaryAzurePort")
      private final @Nullable Output<String> primaryAzurePort;

    public Output<String> primaryAzurePort() {
        return this.primaryAzurePort == null ? Codegen.empty() : this.primaryAzurePort;
    }

    /**
     * The primary address prefix.
     * 
     */
    @Import(name="primaryPeerAddressPrefix")
      private final @Nullable Output<String> primaryPeerAddressPrefix;

    public Output<String> primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix == null ? Codegen.empty() : this.primaryPeerAddressPrefix;
    }

    /**
     * The reference to the RouteFilter resource.
     * 
     */
    @Import(name="routeFilter")
      private final @Nullable Output<SubResourceArgs> routeFilter;

    public Output<SubResourceArgs> routeFilter() {
        return this.routeFilter == null ? Codegen.empty() : this.routeFilter;
    }

    /**
     * The secondary port.
     * 
     */
    @Import(name="secondaryAzurePort")
      private final @Nullable Output<String> secondaryAzurePort;

    public Output<String> secondaryAzurePort() {
        return this.secondaryAzurePort == null ? Codegen.empty() : this.secondaryAzurePort;
    }

    /**
     * The secondary address prefix.
     * 
     */
    @Import(name="secondaryPeerAddressPrefix")
      private final @Nullable Output<String> secondaryPeerAddressPrefix;

    public Output<String> secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix == null ? Codegen.empty() : this.secondaryPeerAddressPrefix;
    }

    /**
     * The shared key.
     * 
     */
    @Import(name="sharedKey")
      private final @Nullable Output<String> sharedKey;

    public Output<String> sharedKey() {
        return this.sharedKey == null ? Codegen.empty() : this.sharedKey;
    }

    /**
     * The peering state.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,ExpressRoutePeeringState>> state;

    public Output<Either<String,ExpressRoutePeeringState>> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * The peering stats of express route circuit.
     * 
     */
    @Import(name="stats")
      private final @Nullable Output<ExpressRouteCircuitStatsArgs> stats;

    public Output<ExpressRouteCircuitStatsArgs> stats() {
        return this.stats == null ? Codegen.empty() : this.stats;
    }

    /**
     * The VLAN ID.
     * 
     */
    @Import(name="vlanId")
      private final @Nullable Output<Integer> vlanId;

    public Output<Integer> vlanId() {
        return this.vlanId == null ? Codegen.empty() : this.vlanId;
    }

    public ExpressRouteCircuitPeeringArgs(
        @Nullable Output<Integer> azureASN,
        @Nullable Output<List<ExpressRouteCircuitConnectionArgs>> connections,
        @Nullable Output<String> gatewayManagerEtag,
        @Nullable Output<String> id,
        @Nullable Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig,
        @Nullable Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig,
        @Nullable Output<String> name,
        @Nullable Output<Double> peerASN,
        @Nullable Output<Either<String,ExpressRoutePeeringType>> peeringType,
        @Nullable Output<String> primaryAzurePort,
        @Nullable Output<String> primaryPeerAddressPrefix,
        @Nullable Output<SubResourceArgs> routeFilter,
        @Nullable Output<String> secondaryAzurePort,
        @Nullable Output<String> secondaryPeerAddressPrefix,
        @Nullable Output<String> sharedKey,
        @Nullable Output<Either<String,ExpressRoutePeeringState>> state,
        @Nullable Output<ExpressRouteCircuitStatsArgs> stats,
        @Nullable Output<Integer> vlanId) {
        this.azureASN = azureASN;
        this.connections = connections;
        this.gatewayManagerEtag = gatewayManagerEtag;
        this.id = id;
        this.ipv6PeeringConfig = ipv6PeeringConfig;
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        this.name = name;
        this.peerASN = peerASN;
        this.peeringType = peeringType;
        this.primaryAzurePort = primaryAzurePort;
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        this.routeFilter = routeFilter;
        this.secondaryAzurePort = secondaryAzurePort;
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        this.sharedKey = sharedKey;
        this.state = state;
        this.stats = stats;
        this.vlanId = vlanId;
    }

    private ExpressRouteCircuitPeeringArgs() {
        this.azureASN = Codegen.empty();
        this.connections = Codegen.empty();
        this.gatewayManagerEtag = Codegen.empty();
        this.id = Codegen.empty();
        this.ipv6PeeringConfig = Codegen.empty();
        this.microsoftPeeringConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.peerASN = Codegen.empty();
        this.peeringType = Codegen.empty();
        this.primaryAzurePort = Codegen.empty();
        this.primaryPeerAddressPrefix = Codegen.empty();
        this.routeFilter = Codegen.empty();
        this.secondaryAzurePort = Codegen.empty();
        this.secondaryPeerAddressPrefix = Codegen.empty();
        this.sharedKey = Codegen.empty();
        this.state = Codegen.empty();
        this.stats = Codegen.empty();
        this.vlanId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> azureASN;
        private @Nullable Output<List<ExpressRouteCircuitConnectionArgs>> connections;
        private @Nullable Output<String> gatewayManagerEtag;
        private @Nullable Output<String> id;
        private @Nullable Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig;
        private @Nullable Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<Double> peerASN;
        private @Nullable Output<Either<String,ExpressRoutePeeringType>> peeringType;
        private @Nullable Output<String> primaryAzurePort;
        private @Nullable Output<String> primaryPeerAddressPrefix;
        private @Nullable Output<SubResourceArgs> routeFilter;
        private @Nullable Output<String> secondaryAzurePort;
        private @Nullable Output<String> secondaryPeerAddressPrefix;
        private @Nullable Output<String> sharedKey;
        private @Nullable Output<Either<String,ExpressRoutePeeringState>> state;
        private @Nullable Output<ExpressRouteCircuitStatsArgs> stats;
        private @Nullable Output<Integer> vlanId;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureASN = defaults.azureASN;
    	      this.connections = defaults.connections;
    	      this.gatewayManagerEtag = defaults.gatewayManagerEtag;
    	      this.id = defaults.id;
    	      this.ipv6PeeringConfig = defaults.ipv6PeeringConfig;
    	      this.microsoftPeeringConfig = defaults.microsoftPeeringConfig;
    	      this.name = defaults.name;
    	      this.peerASN = defaults.peerASN;
    	      this.peeringType = defaults.peeringType;
    	      this.primaryAzurePort = defaults.primaryAzurePort;
    	      this.primaryPeerAddressPrefix = defaults.primaryPeerAddressPrefix;
    	      this.routeFilter = defaults.routeFilter;
    	      this.secondaryAzurePort = defaults.secondaryAzurePort;
    	      this.secondaryPeerAddressPrefix = defaults.secondaryPeerAddressPrefix;
    	      this.sharedKey = defaults.sharedKey;
    	      this.state = defaults.state;
    	      this.stats = defaults.stats;
    	      this.vlanId = defaults.vlanId;
        }

        public Builder azureASN(@Nullable Output<Integer> azureASN) {
            this.azureASN = azureASN;
            return this;
        }
        public Builder azureASN(@Nullable Integer azureASN) {
            this.azureASN = Codegen.ofNullable(azureASN);
            return this;
        }
        public Builder connections(@Nullable Output<List<ExpressRouteCircuitConnectionArgs>> connections) {
            this.connections = connections;
            return this;
        }
        public Builder connections(@Nullable List<ExpressRouteCircuitConnectionArgs> connections) {
            this.connections = Codegen.ofNullable(connections);
            return this;
        }
        public Builder connections(ExpressRouteCircuitConnectionArgs... connections) {
            return connections(List.of(connections));
        }
        public Builder gatewayManagerEtag(@Nullable Output<String> gatewayManagerEtag) {
            this.gatewayManagerEtag = gatewayManagerEtag;
            return this;
        }
        public Builder gatewayManagerEtag(@Nullable String gatewayManagerEtag) {
            this.gatewayManagerEtag = Codegen.ofNullable(gatewayManagerEtag);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder ipv6PeeringConfig(@Nullable Output<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig) {
            this.ipv6PeeringConfig = ipv6PeeringConfig;
            return this;
        }
        public Builder ipv6PeeringConfig(@Nullable Ipv6ExpressRouteCircuitPeeringConfigArgs ipv6PeeringConfig) {
            this.ipv6PeeringConfig = Codegen.ofNullable(ipv6PeeringConfig);
            return this;
        }
        public Builder microsoftPeeringConfig(@Nullable Output<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig) {
            this.microsoftPeeringConfig = microsoftPeeringConfig;
            return this;
        }
        public Builder microsoftPeeringConfig(@Nullable ExpressRouteCircuitPeeringConfigArgs microsoftPeeringConfig) {
            this.microsoftPeeringConfig = Codegen.ofNullable(microsoftPeeringConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder peerASN(@Nullable Output<Double> peerASN) {
            this.peerASN = peerASN;
            return this;
        }
        public Builder peerASN(@Nullable Double peerASN) {
            this.peerASN = Codegen.ofNullable(peerASN);
            return this;
        }
        public Builder peeringType(@Nullable Output<Either<String,ExpressRoutePeeringType>> peeringType) {
            this.peeringType = peeringType;
            return this;
        }
        public Builder peeringType(@Nullable Either<String,ExpressRoutePeeringType> peeringType) {
            this.peeringType = Codegen.ofNullable(peeringType);
            return this;
        }
        public Builder primaryAzurePort(@Nullable Output<String> primaryAzurePort) {
            this.primaryAzurePort = primaryAzurePort;
            return this;
        }
        public Builder primaryAzurePort(@Nullable String primaryAzurePort) {
            this.primaryAzurePort = Codegen.ofNullable(primaryAzurePort);
            return this;
        }
        public Builder primaryPeerAddressPrefix(@Nullable Output<String> primaryPeerAddressPrefix) {
            this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            return this;
        }
        public Builder primaryPeerAddressPrefix(@Nullable String primaryPeerAddressPrefix) {
            this.primaryPeerAddressPrefix = Codegen.ofNullable(primaryPeerAddressPrefix);
            return this;
        }
        public Builder routeFilter(@Nullable Output<SubResourceArgs> routeFilter) {
            this.routeFilter = routeFilter;
            return this;
        }
        public Builder routeFilter(@Nullable SubResourceArgs routeFilter) {
            this.routeFilter = Codegen.ofNullable(routeFilter);
            return this;
        }
        public Builder secondaryAzurePort(@Nullable Output<String> secondaryAzurePort) {
            this.secondaryAzurePort = secondaryAzurePort;
            return this;
        }
        public Builder secondaryAzurePort(@Nullable String secondaryAzurePort) {
            this.secondaryAzurePort = Codegen.ofNullable(secondaryAzurePort);
            return this;
        }
        public Builder secondaryPeerAddressPrefix(@Nullable Output<String> secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return this;
        }
        public Builder secondaryPeerAddressPrefix(@Nullable String secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = Codegen.ofNullable(secondaryPeerAddressPrefix);
            return this;
        }
        public Builder sharedKey(@Nullable Output<String> sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }
        public Builder sharedKey(@Nullable String sharedKey) {
            this.sharedKey = Codegen.ofNullable(sharedKey);
            return this;
        }
        public Builder state(@Nullable Output<Either<String,ExpressRoutePeeringState>> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable Either<String,ExpressRoutePeeringState> state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder stats(@Nullable Output<ExpressRouteCircuitStatsArgs> stats) {
            this.stats = stats;
            return this;
        }
        public Builder stats(@Nullable ExpressRouteCircuitStatsArgs stats) {
            this.stats = Codegen.ofNullable(stats);
            return this;
        }
        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public Builder vlanId(@Nullable Integer vlanId) {
            this.vlanId = Codegen.ofNullable(vlanId);
            return this;
        }        public ExpressRouteCircuitPeeringArgs build() {
            return new ExpressRouteCircuitPeeringArgs(azureASN, connections, gatewayManagerEtag, id, ipv6PeeringConfig, microsoftPeeringConfig, name, peerASN, peeringType, primaryAzurePort, primaryPeerAddressPrefix, routeFilter, secondaryAzurePort, secondaryPeerAddressPrefix, sharedKey, state, stats, vlanId);
        }
    }
}
