// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.azurenative.sql.inputs.PrivateEndpointPropertyResponse;
import com.pulumi.azurenative.sql.inputs.PrivateLinkServiceConnectionStatePropertyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a private endpoint connection.
 * 
 */
public final class PrivateEndpointConnectionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionPropertiesResponse Empty = new PrivateEndpointConnectionPropertiesResponse();

    /**
     * Private endpoint which the connection belongs to.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable PrivateEndpointPropertyResponse privateEndpoint;

    public Optional<PrivateEndpointPropertyResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Connection state of the private endpoint connection.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;

    public Optional<PrivateLinkServiceConnectionStatePropertyResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * State of the private endpoint connection.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    private PrivateEndpointConnectionPropertiesResponse() {}

    private PrivateEndpointConnectionPropertiesResponse(PrivateEndpointConnectionPropertiesResponse $) {
        this.privateEndpoint = $.privateEndpoint;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionPropertiesResponse $;

        public Builder() {
            $ = new PrivateEndpointConnectionPropertiesResponse();
        }

        public Builder(PrivateEndpointConnectionPropertiesResponse defaults) {
            $ = new PrivateEndpointConnectionPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder privateEndpoint(@Nullable PrivateEndpointPropertyResponse privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public PrivateEndpointConnectionPropertiesResponse build() {
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
