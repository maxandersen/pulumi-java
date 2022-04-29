// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkGatewayConnectionArgs extends InvokeArgs {

    public static final GetVirtualNetworkGatewayConnectionArgs Empty = new GetVirtualNetworkGatewayConnectionArgs();

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
     * The name of the virtual network gateway connection.
     * 
     */
    @Import(name="virtualNetworkGatewayConnectionName", required=true)
    private String virtualNetworkGatewayConnectionName;

    /**
     * @return The name of the virtual network gateway connection.
     * 
     */
    public String virtualNetworkGatewayConnectionName() {
        return this.virtualNetworkGatewayConnectionName;
    }

    private GetVirtualNetworkGatewayConnectionArgs() {}

    private GetVirtualNetworkGatewayConnectionArgs(GetVirtualNetworkGatewayConnectionArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.virtualNetworkGatewayConnectionName = $.virtualNetworkGatewayConnectionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkGatewayConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkGatewayConnectionArgs $;

        public Builder() {
            $ = new GetVirtualNetworkGatewayConnectionArgs();
        }

        public Builder(GetVirtualNetworkGatewayConnectionArgs defaults) {
            $ = new GetVirtualNetworkGatewayConnectionArgs(Objects.requireNonNull(defaults));
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
         * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkGatewayConnectionName(String virtualNetworkGatewayConnectionName) {
            $.virtualNetworkGatewayConnectionName = virtualNetworkGatewayConnectionName;
            return this;
        }

        public GetVirtualNetworkGatewayConnectionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkGatewayConnectionName = Objects.requireNonNull($.virtualNetworkGatewayConnectionName, "expected parameter 'virtualNetworkGatewayConnectionName' to be non-null");
            return $;
        }
    }

}
