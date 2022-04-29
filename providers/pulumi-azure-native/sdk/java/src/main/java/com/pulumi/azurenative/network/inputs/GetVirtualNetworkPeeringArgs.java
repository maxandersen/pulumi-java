// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkPeeringArgs extends InvokeArgs {

    public static final GetVirtualNetworkPeeringArgs Empty = new GetVirtualNetworkPeeringArgs();

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
     * The name of the virtual network.
     * 
     */
    @Import(name="virtualNetworkName", required=true)
    private String virtualNetworkName;

    /**
     * @return The name of the virtual network.
     * 
     */
    public String virtualNetworkName() {
        return this.virtualNetworkName;
    }

    /**
     * The name of the virtual network peering.
     * 
     */
    @Import(name="virtualNetworkPeeringName", required=true)
    private String virtualNetworkPeeringName;

    /**
     * @return The name of the virtual network peering.
     * 
     */
    public String virtualNetworkPeeringName() {
        return this.virtualNetworkPeeringName;
    }

    private GetVirtualNetworkPeeringArgs() {}

    private GetVirtualNetworkPeeringArgs(GetVirtualNetworkPeeringArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.virtualNetworkName = $.virtualNetworkName;
        this.virtualNetworkPeeringName = $.virtualNetworkPeeringName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkPeeringArgs $;

        public Builder() {
            $ = new GetVirtualNetworkPeeringArgs();
        }

        public Builder(GetVirtualNetworkPeeringArgs defaults) {
            $ = new GetVirtualNetworkPeeringArgs(Objects.requireNonNull(defaults));
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
         * @param virtualNetworkName The name of the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(String virtualNetworkName) {
            $.virtualNetworkName = virtualNetworkName;
            return this;
        }

        /**
         * @param virtualNetworkPeeringName The name of the virtual network peering.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkPeeringName(String virtualNetworkPeeringName) {
            $.virtualNetworkPeeringName = virtualNetworkPeeringName;
            return this;
        }

        public GetVirtualNetworkPeeringArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkName = Objects.requireNonNull($.virtualNetworkName, "expected parameter 'virtualNetworkName' to be non-null");
            $.virtualNetworkPeeringName = Objects.requireNonNull($.virtualNetworkPeeringName, "expected parameter 'virtualNetworkPeeringName' to be non-null");
            return $;
        }
    }

}
