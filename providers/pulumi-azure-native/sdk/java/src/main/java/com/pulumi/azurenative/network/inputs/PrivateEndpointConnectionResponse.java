// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.PrivateEndpointResponse;
import com.pulumi.azurenative.network.inputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PrivateEndpointConnection resource.
 * 
 */
public final class PrivateEndpointConnectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionResponse Empty = new PrivateEndpointConnectionResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The consumer link id.
     * 
     */
    @Import(name="linkIdentifier", required=true)
    private String linkIdentifier;

    public String linkIdentifier() {
        return this.linkIdentifier;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource of private end point.
     * 
     */
    @Import(name="privateEndpoint", required=true)
    private PrivateEndpointResponse privateEndpoint;

    public PrivateEndpointResponse privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    public Optional<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * The provisioning state of the private endpoint connection resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private PrivateEndpointConnectionResponse() {}

    private PrivateEndpointConnectionResponse(PrivateEndpointConnectionResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.linkIdentifier = $.linkIdentifier;
        this.name = $.name;
        this.privateEndpoint = $.privateEndpoint;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.provisioningState = $.provisioningState;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionResponse $;

        public Builder() {
            $ = new PrivateEndpointConnectionResponse();
        }

        public Builder(PrivateEndpointConnectionResponse defaults) {
            $ = new PrivateEndpointConnectionResponse(Objects.requireNonNull(defaults));
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder linkIdentifier(String linkIdentifier) {
            $.linkIdentifier = linkIdentifier;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder privateEndpoint(PrivateEndpointResponse privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public PrivateEndpointConnectionResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.linkIdentifier = Objects.requireNonNull($.linkIdentifier, "expected parameter 'linkIdentifier' to be non-null");
            $.privateEndpoint = Objects.requireNonNull($.privateEndpoint, "expected parameter 'privateEndpoint' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
