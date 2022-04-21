// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.VirtualHubRouteV2Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualHubRouteTableV2Args extends com.pulumi.resources.ResourceArgs {

    public static final VirtualHubRouteTableV2Args Empty = new VirtualHubRouteTableV2Args();

    /**
     * List of all connections attached to this route table v2.
     * 
     */
    @Import(name="attachedConnections")
    private @Nullable Output<List<String>> attachedConnections;

    public Optional<Output<List<String>>> attachedConnections() {
        return Optional.ofNullable(this.attachedConnections);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource group name of the VirtualHub.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VirtualHubRouteTableV2.
     * 
     */
    @Import(name="routeTableName")
    private @Nullable Output<String> routeTableName;

    public Optional<Output<String>> routeTableName() {
        return Optional.ofNullable(this.routeTableName);
    }

    /**
     * List of all routes.
     * 
     */
    @Import(name="routes")
    private @Nullable Output<List<VirtualHubRouteV2Args>> routes;

    public Optional<Output<List<VirtualHubRouteV2Args>>> routes() {
        return Optional.ofNullable(this.routes);
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @Import(name="virtualHubName", required=true)
    private Output<String> virtualHubName;

    public Output<String> virtualHubName() {
        return this.virtualHubName;
    }

    private VirtualHubRouteTableV2Args() {}

    private VirtualHubRouteTableV2Args(VirtualHubRouteTableV2Args $) {
        this.attachedConnections = $.attachedConnections;
        this.id = $.id;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.routeTableName = $.routeTableName;
        this.routes = $.routes;
        this.virtualHubName = $.virtualHubName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualHubRouteTableV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualHubRouteTableV2Args $;

        public Builder() {
            $ = new VirtualHubRouteTableV2Args();
        }

        public Builder(VirtualHubRouteTableV2Args defaults) {
            $ = new VirtualHubRouteTableV2Args(Objects.requireNonNull(defaults));
        }

        public Builder attachedConnections(@Nullable Output<List<String>> attachedConnections) {
            $.attachedConnections = attachedConnections;
            return this;
        }

        public Builder attachedConnections(List<String> attachedConnections) {
            return attachedConnections(Output.of(attachedConnections));
        }

        public Builder attachedConnections(String... attachedConnections) {
            return attachedConnections(List.of(attachedConnections));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder routeTableName(@Nullable Output<String> routeTableName) {
            $.routeTableName = routeTableName;
            return this;
        }

        public Builder routeTableName(String routeTableName) {
            return routeTableName(Output.of(routeTableName));
        }

        public Builder routes(@Nullable Output<List<VirtualHubRouteV2Args>> routes) {
            $.routes = routes;
            return this;
        }

        public Builder routes(List<VirtualHubRouteV2Args> routes) {
            return routes(Output.of(routes));
        }

        public Builder routes(VirtualHubRouteV2Args... routes) {
            return routes(List.of(routes));
        }

        public Builder virtualHubName(Output<String> virtualHubName) {
            $.virtualHubName = virtualHubName;
            return this;
        }

        public Builder virtualHubName(String virtualHubName) {
            return virtualHubName(Output.of(virtualHubName));
        }

        public VirtualHubRouteTableV2Args build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualHubName = Objects.requireNonNull($.virtualHubName, "expected parameter 'virtualHubName' to be non-null");
            return $;
        }
    }

}
