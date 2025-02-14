// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.outputs;

import com.pulumi.azurenative.servicebus.outputs.ConnectionStateResponse;
import com.pulumi.azurenative.servicebus.outputs.PrivateEndpointResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrivateEndpointConnectionResult {
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return The Private Endpoint resource for this Connection.
     * 
     */
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    /**
     * @return Details about the state of the connection.
     * 
     */
    private final @Nullable ConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * @return Provisioning state of the Private Endpoint Connection.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * @return Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPrivateEndpointConnectionResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpoint") @Nullable PrivateEndpointResponse privateEndpoint,
        @CustomType.Parameter("privateLinkServiceConnectionState") @Nullable ConnectionStateResponse privateLinkServiceConnectionState,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Private Endpoint resource for this Connection.
     * 
     */
    public Optional<PrivateEndpointResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * @return Details about the state of the connection.
     * 
     */
    public Optional<ConnectionStateResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * @return Provisioning state of the Private Endpoint Connection.
     * 
     */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private @Nullable ConnectionStateResponse privateLinkServiceConnectionState;
        private @Nullable String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable ConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetPrivateEndpointConnectionResult build() {
            return new GetPrivateEndpointConnectionResult(id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, type);
        }
    }
}
