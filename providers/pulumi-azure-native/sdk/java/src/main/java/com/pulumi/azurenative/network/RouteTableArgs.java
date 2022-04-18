// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.RouteArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteTableArgs Empty = new RouteTableArgs();

    /**
     * Whether to disable the routes learned by BGP on that route table. True means disable.
     * 
     */
    @Import(name="disableBgpRoutePropagation")
      private final @Nullable Output<Boolean> disableBgpRoutePropagation;

    public Output<Boolean> disableBgpRoutePropagation() {
        return this.disableBgpRoutePropagation == null ? Codegen.empty() : this.disableBgpRoutePropagation;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the route table.
     * 
     */
    @Import(name="routeTableName")
      private final @Nullable Output<String> routeTableName;

    public Output<String> routeTableName() {
        return this.routeTableName == null ? Codegen.empty() : this.routeTableName;
    }

    /**
     * Collection of routes contained within a route table.
     * 
     */
    @Import(name="routes")
      private final @Nullable Output<List<RouteArgs>> routes;

    public Output<List<RouteArgs>> routes() {
        return this.routes == null ? Codegen.empty() : this.routes;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public RouteTableArgs(
        @Nullable Output<Boolean> disableBgpRoutePropagation,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> routeTableName,
        @Nullable Output<List<RouteArgs>> routes,
        @Nullable Output<Map<String,String>> tags) {
        this.disableBgpRoutePropagation = disableBgpRoutePropagation;
        this.id = id;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routeTableName = routeTableName;
        this.routes = routes;
        this.tags = tags;
    }

    private RouteTableArgs() {
        this.disableBgpRoutePropagation = Codegen.empty();
        this.id = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.routeTableName = Codegen.empty();
        this.routes = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableBgpRoutePropagation;
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> routeTableName;
        private @Nullable Output<List<RouteArgs>> routes;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableBgpRoutePropagation = defaults.disableBgpRoutePropagation;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routeTableName = defaults.routeTableName;
    	      this.routes = defaults.routes;
    	      this.tags = defaults.tags;
        }

        public Builder disableBgpRoutePropagation(@Nullable Output<Boolean> disableBgpRoutePropagation) {
            this.disableBgpRoutePropagation = disableBgpRoutePropagation;
            return this;
        }
        public Builder disableBgpRoutePropagation(@Nullable Boolean disableBgpRoutePropagation) {
            this.disableBgpRoutePropagation = Codegen.ofNullable(disableBgpRoutePropagation);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder routeTableName(@Nullable Output<String> routeTableName) {
            this.routeTableName = routeTableName;
            return this;
        }
        public Builder routeTableName(@Nullable String routeTableName) {
            this.routeTableName = Codegen.ofNullable(routeTableName);
            return this;
        }
        public Builder routes(@Nullable Output<List<RouteArgs>> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(@Nullable List<RouteArgs> routes) {
            this.routes = Codegen.ofNullable(routes);
            return this;
        }
        public Builder routes(RouteArgs... routes) {
            return routes(List.of(routes));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public RouteTableArgs build() {
            return new RouteTableArgs(disableBgpRoutePropagation, id, location, resourceGroupName, routeTableName, routes, tags);
        }
    }
}
