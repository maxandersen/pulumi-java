// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.PrivateEndpointResponse;
import io.pulumi.azurenative.synapse.inputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private Endpoint Connection For Private Link Hub - Basic
 * 
 */
public final class PrivateEndpointConnectionForPrivateLinkHubBasicResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionForPrivateLinkHubBasicResponse Empty = new PrivateEndpointConnectionForPrivateLinkHubBasicResponse();

    /**
     * identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The private endpoint which the connection belongs to.
     * 
     */
    @Import(name="privateEndpoint")
      private final @Nullable PrivateEndpointResponse privateEndpoint;

    public Optional<PrivateEndpointResponse> privateEndpoint() {
        return this.privateEndpoint == null ? Optional.empty() : Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Connection state of the private endpoint connection.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
      private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    public Optional<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    public PrivateEndpointConnectionForPrivateLinkHubBasicResponse(
        String id,
        @Nullable PrivateEndpointResponse privateEndpoint,
        @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private PrivateEndpointConnectionForPrivateLinkHubBasicResponse() {
        this.id = null;
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionForPrivateLinkHubBasicResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionForPrivateLinkHubBasicResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public PrivateEndpointConnectionForPrivateLinkHubBasicResponse build() {
            return new PrivateEndpointConnectionForPrivateLinkHubBasicResponse(id, privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
