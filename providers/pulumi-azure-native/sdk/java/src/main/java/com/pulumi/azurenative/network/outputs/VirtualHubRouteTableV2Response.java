// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.VirtualHubRouteV2Response;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualHubRouteTableV2Response {
    /**
     * @return List of all connections attached to this route table v2.
     * 
     */
    private final @Nullable List<String> attachedConnections;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The provisioning state of the virtual hub route table v2 resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return List of all routes.
     * 
     */
    private final @Nullable List<VirtualHubRouteV2Response> routes;

    @CustomType.Constructor
    private VirtualHubRouteTableV2Response(
        @CustomType.Parameter("attachedConnections") @Nullable List<String> attachedConnections,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("routes") @Nullable List<VirtualHubRouteV2Response> routes) {
        this.attachedConnections = attachedConnections;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.routes = routes;
    }

    /**
     * @return List of all connections attached to this route table v2.
     * 
     */
    public List<String> attachedConnections() {
        return this.attachedConnections == null ? List.of() : this.attachedConnections;
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The provisioning state of the virtual hub route table v2 resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return List of all routes.
     * 
     */
    public List<VirtualHubRouteV2Response> routes() {
        return this.routes == null ? List.of() : this.routes;
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
