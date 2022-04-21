// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.RouteArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteTableArgs Empty = new RouteTableArgs();

    /**
     * Whether to disable the routes learned by BGP on that route table. True means disable.
     * 
     */
    @Import(name="disableBgpRoutePropagation")
    private @Nullable Output<Boolean> disableBgpRoutePropagation;

    public Optional<Output<Boolean>> disableBgpRoutePropagation() {
        return Optional.ofNullable(this.disableBgpRoutePropagation);
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
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the route table.
     * 
     */
    @Import(name="routeTableName")
    private @Nullable Output<String> routeTableName;

    public Optional<Output<String>> routeTableName() {
        return Optional.ofNullable(this.routeTableName);
    }

    /**
     * Collection of routes contained within a route table.
     * 
     */
    @Import(name="routes")
    private @Nullable Output<List<RouteArgs>> routes;

    public Optional<Output<List<RouteArgs>>> routes() {
        return Optional.ofNullable(this.routes);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private RouteTableArgs() {}

    private RouteTableArgs(RouteTableArgs $) {
        this.disableBgpRoutePropagation = $.disableBgpRoutePropagation;
        this.id = $.id;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.routeTableName = $.routeTableName;
        this.routes = $.routes;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteTableArgs $;

        public Builder() {
            $ = new RouteTableArgs();
        }

        public Builder(RouteTableArgs defaults) {
            $ = new RouteTableArgs(Objects.requireNonNull(defaults));
        }

        public Builder disableBgpRoutePropagation(@Nullable Output<Boolean> disableBgpRoutePropagation) {
            $.disableBgpRoutePropagation = disableBgpRoutePropagation;
            return this;
        }

        public Builder disableBgpRoutePropagation(Boolean disableBgpRoutePropagation) {
            return disableBgpRoutePropagation(Output.of(disableBgpRoutePropagation));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
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

        public Builder routes(@Nullable Output<List<RouteArgs>> routes) {
            $.routes = routes;
            return this;
        }

        public Builder routes(List<RouteArgs> routes) {
            return routes(Output.of(routes));
        }

        public Builder routes(RouteArgs... routes) {
            return routes(List.of(routes));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public RouteTableArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
