// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceManagementPrivateLinkEndpointConnectionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceManagementPrivateLinkEndpointConnectionsResponse Empty = new ResourceManagementPrivateLinkEndpointConnectionsResponse();

    /**
     * The private endpoint connections.
     * 
     */
    @Import(name="privateEndpointConnections")
      private final @Nullable List<String> privateEndpointConnections;

    public List<String> privateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }

    public ResourceManagementPrivateLinkEndpointConnectionsResponse(@Nullable List<String> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
    }

    private ResourceManagementPrivateLinkEndpointConnectionsResponse() {
        this.privateEndpointConnections = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceManagementPrivateLinkEndpointConnectionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> privateEndpointConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceManagementPrivateLinkEndpointConnectionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
        }

        public Builder privateEndpointConnections(@Nullable List<String> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }
        public Builder privateEndpointConnections(String... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }        public ResourceManagementPrivateLinkEndpointConnectionsResponse build() {
            return new ResourceManagementPrivateLinkEndpointConnectionsResponse(privateEndpointConnections);
        }
    }
}
