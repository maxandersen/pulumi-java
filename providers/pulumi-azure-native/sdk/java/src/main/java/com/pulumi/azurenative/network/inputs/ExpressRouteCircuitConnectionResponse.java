// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.Ipv6CircuitConnectionConfigResponse;
import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
 * 
 */
public final class ExpressRouteCircuitConnectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExpressRouteCircuitConnectionResponse Empty = new ExpressRouteCircuitConnectionResponse();

    /**
     * /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    @Import(name="addressPrefix")
      private final @Nullable String addressPrefix;

    public Optional<String> addressPrefix() {
        return this.addressPrefix == null ? Optional.empty() : Optional.ofNullable(this.addressPrefix);
    }

    /**
     * The authorization key.
     * 
     */
    @Import(name="authorizationKey")
      private final @Nullable String authorizationKey;

    public Optional<String> authorizationKey() {
        return this.authorizationKey == null ? Optional.empty() : Optional.ofNullable(this.authorizationKey);
    }

    /**
     * Express Route Circuit connection state.
     * 
     */
    @Import(name="circuitConnectionStatus", required=true)
      private final String circuitConnectionStatus;

    public String circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     * 
     */
    @Import(name="expressRouteCircuitPeering")
      private final @Nullable SubResourceResponse expressRouteCircuitPeering;

    public Optional<SubResourceResponse> expressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering == null ? Optional.empty() : Optional.ofNullable(this.expressRouteCircuitPeering);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * IPv6 Address PrefixProperties of the express route circuit connection.
     * 
     */
    @Import(name="ipv6CircuitConnectionConfig")
      private final @Nullable Ipv6CircuitConnectionConfigResponse ipv6CircuitConnectionConfig;

    public Optional<Ipv6CircuitConnectionConfigResponse> ipv6CircuitConnectionConfig() {
        return this.ipv6CircuitConnectionConfig == null ? Optional.empty() : Optional.ofNullable(this.ipv6CircuitConnectionConfig);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    @Import(name="peerExpressRouteCircuitPeering")
      private final @Nullable SubResourceResponse peerExpressRouteCircuitPeering;

    public Optional<SubResourceResponse> peerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering == null ? Optional.empty() : Optional.ofNullable(this.peerExpressRouteCircuitPeering);
    }

    /**
     * The provisioning state of the express route circuit connection resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ExpressRouteCircuitConnectionResponse(
        @Nullable String addressPrefix,
        @Nullable String authorizationKey,
        String circuitConnectionStatus,
        String etag,
        @Nullable SubResourceResponse expressRouteCircuitPeering,
        @Nullable String id,
        @Nullable Ipv6CircuitConnectionConfigResponse ipv6CircuitConnectionConfig,
        @Nullable String name,
        @Nullable SubResourceResponse peerExpressRouteCircuitPeering,
        String provisioningState,
        String type) {
        this.addressPrefix = addressPrefix;
        this.authorizationKey = authorizationKey;
        this.circuitConnectionStatus = Objects.requireNonNull(circuitConnectionStatus, "expected parameter 'circuitConnectionStatus' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        this.id = id;
        this.ipv6CircuitConnectionConfig = ipv6CircuitConnectionConfig;
        this.name = name;
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ExpressRouteCircuitConnectionResponse() {
        this.addressPrefix = null;
        this.authorizationKey = null;
        this.circuitConnectionStatus = null;
        this.etag = null;
        this.expressRouteCircuitPeering = null;
        this.id = null;
        this.ipv6CircuitConnectionConfig = null;
        this.name = null;
        this.peerExpressRouteCircuitPeering = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private @Nullable String authorizationKey;
        private String circuitConnectionStatus;
        private String etag;
        private @Nullable SubResourceResponse expressRouteCircuitPeering;
        private @Nullable String id;
        private @Nullable Ipv6CircuitConnectionConfigResponse ipv6CircuitConnectionConfig;
        private @Nullable String name;
        private @Nullable SubResourceResponse peerExpressRouteCircuitPeering;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.circuitConnectionStatus = defaults.circuitConnectionStatus;
    	      this.etag = defaults.etag;
    	      this.expressRouteCircuitPeering = defaults.expressRouteCircuitPeering;
    	      this.id = defaults.id;
    	      this.ipv6CircuitConnectionConfig = defaults.ipv6CircuitConnectionConfig;
    	      this.name = defaults.name;
    	      this.peerExpressRouteCircuitPeering = defaults.peerExpressRouteCircuitPeering;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder addressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }
        public Builder authorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }
        public Builder circuitConnectionStatus(String circuitConnectionStatus) {
            this.circuitConnectionStatus = Objects.requireNonNull(circuitConnectionStatus);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder expressRouteCircuitPeering(@Nullable SubResourceResponse expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = expressRouteCircuitPeering;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ipv6CircuitConnectionConfig(@Nullable Ipv6CircuitConnectionConfigResponse ipv6CircuitConnectionConfig) {
            this.ipv6CircuitConnectionConfig = ipv6CircuitConnectionConfig;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder peerExpressRouteCircuitPeering(@Nullable SubResourceResponse peerExpressRouteCircuitPeering) {
            this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ExpressRouteCircuitConnectionResponse build() {
            return new ExpressRouteCircuitConnectionResponse(addressPrefix, authorizationKey, circuitConnectionStatus, etag, expressRouteCircuitPeering, id, ipv6CircuitConnectionConfig, name, peerExpressRouteCircuitPeering, provisioningState, type);
        }
    }
}
