// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouteFilterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouteFilterArgs Empty = new GetRouteFilterArgs();

    /**
     * Expands referenced express route bgp peering resources.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return Expands referenced express route bgp peering resources.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

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
     * The name of the route filter.
     * 
     */
    @Import(name="routeFilterName", required=true)
    private String routeFilterName;

    /**
     * @return The name of the route filter.
     * 
     */
    public String routeFilterName() {
        return this.routeFilterName;
    }

    private GetRouteFilterArgs() {}

    private GetRouteFilterArgs(GetRouteFilterArgs $) {
        this.expand = $.expand;
        this.resourceGroupName = $.resourceGroupName;
        this.routeFilterName = $.routeFilterName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteFilterArgs $;

        public Builder() {
            $ = new GetRouteFilterArgs();
        }

        public Builder(GetRouteFilterArgs defaults) {
            $ = new GetRouteFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand Expands referenced express route bgp peering resources.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
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
         * @param routeFilterName The name of the route filter.
         * 
         * @return builder
         * 
         */
        public Builder routeFilterName(String routeFilterName) {
            $.routeFilterName = routeFilterName;
            return this;
        }

        public GetRouteFilterArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.routeFilterName = Objects.requireNonNull($.routeFilterName, "expected parameter 'routeFilterName' to be non-null");
            return $;
        }
    }

}
