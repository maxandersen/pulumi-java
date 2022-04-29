// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetRouteArgs extends InvokeArgs {

    public static final GetRouteArgs Empty = new GetRouteArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the route.
     * 
     */
    @Import(name="routeName", required=true)
    private String routeName;

    /**
     * @return The name of the route.
     * 
     */
    public String routeName() {
        return this.routeName;
    }

    /**
     * The name of the route table.
     * 
     */
    @Import(name="routeTableName", required=true)
    private String routeTableName;

    /**
     * @return The name of the route table.
     * 
     */
    public String routeTableName() {
        return this.routeTableName;
    }

    private GetRouteArgs() {}

    private GetRouteArgs(GetRouteArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.routeName = $.routeName;
        this.routeTableName = $.routeTableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteArgs $;

        public Builder() {
            $ = new GetRouteArgs();
        }

        public Builder(GetRouteArgs defaults) {
            $ = new GetRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param routeName The name of the route.
         * 
         * @return builder
         * 
         */
        public Builder routeName(String routeName) {
            $.routeName = routeName;
            return this;
        }

        /**
         * @param routeTableName The name of the route table.
         * 
         * @return builder
         * 
         */
        public Builder routeTableName(String routeTableName) {
            $.routeTableName = routeTableName;
            return this;
        }

        public GetRouteArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.routeName = Objects.requireNonNull($.routeName, "expected parameter 'routeName' to be non-null");
            $.routeTableName = Objects.requireNonNull($.routeTableName, "expected parameter 'routeTableName' to be non-null");
            return $;
        }
    }

}
