// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.VirtualHubRouteV2Response;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VirtualHubRouteTableV2 Resource.
 * 
 */
public final class VirtualHubRouteTableV2Response extends com.pulumi.resources.InvokeArgs {

    public static final VirtualHubRouteTableV2Response Empty = new VirtualHubRouteTableV2Response();

    /**
     * List of all connections attached to this route table v2.
     * 
     */
    @Import(name="attachedConnections")
      private final @Nullable List<String> attachedConnections;

    public List<String> attachedConnections() {
        return this.attachedConnections == null ? List.of() : this.attachedConnections;
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
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
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
     * The provisioning state of the virtual hub route table v2 resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * List of all routes.
     * 
     */
    @Import(name="routes")
      private final @Nullable List<VirtualHubRouteV2Response> routes;

    public List<VirtualHubRouteV2Response> routes() {
        return this.routes == null ? List.of() : this.routes;
    }

    public VirtualHubRouteTableV2Response(
        @Nullable List<String> attachedConnections,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable List<VirtualHubRouteV2Response> routes) {
        this.attachedConnections = attachedConnections;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.routes = routes;
    }

    private VirtualHubRouteTableV2Response() {
        this.attachedConnections = List.of();
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.routes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubRouteTableV2Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> attachedConnections;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable List<VirtualHubRouteV2Response> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubRouteTableV2Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedConnections = defaults.attachedConnections;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routes = defaults.routes;
        }

        public Builder attachedConnections(@Nullable List<String> attachedConnections) {
            this.attachedConnections = attachedConnections;
            return this;
        }
        public Builder attachedConnections(String... attachedConnections) {
            return attachedConnections(List.of(attachedConnections));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder routes(@Nullable List<VirtualHubRouteV2Response> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(VirtualHubRouteV2Response... routes) {
            return routes(List.of(routes));
        }        public VirtualHubRouteTableV2Response build() {
            return new VirtualHubRouteTableV2Response(attachedConnections, etag, id, name, provisioningState, routes);
        }
    }
}
