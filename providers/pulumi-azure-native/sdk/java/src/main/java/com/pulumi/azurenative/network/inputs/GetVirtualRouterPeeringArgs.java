// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualRouterPeeringArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualRouterPeeringArgs Empty = new GetVirtualRouterPeeringArgs();

    /**
     * The name of the Virtual Router Peering.
     * 
     */
    @Import(name="peeringName", required=true)
    private String peeringName;

    /**
     * @return The name of the Virtual Router Peering.
     * 
     */
    public String peeringName() {
        return this.peeringName;
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
     * The name of the Virtual Router.
     * 
     */
    @Import(name="virtualRouterName", required=true)
    private String virtualRouterName;

    /**
     * @return The name of the Virtual Router.
     * 
     */
    public String virtualRouterName() {
        return this.virtualRouterName;
    }

    private GetVirtualRouterPeeringArgs() {}

    private GetVirtualRouterPeeringArgs(GetVirtualRouterPeeringArgs $) {
        this.peeringName = $.peeringName;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualRouterName = $.virtualRouterName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualRouterPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualRouterPeeringArgs $;

        public Builder() {
            $ = new GetVirtualRouterPeeringArgs();
        }

        public Builder(GetVirtualRouterPeeringArgs defaults) {
            $ = new GetVirtualRouterPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peeringName The name of the Virtual Router Peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(String peeringName) {
            $.peeringName = peeringName;
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
         * @param virtualRouterName The name of the Virtual Router.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterName(String virtualRouterName) {
            $.virtualRouterName = virtualRouterName;
            return this;
        }

        public GetVirtualRouterPeeringArgs build() {
            $.peeringName = Objects.requireNonNull($.peeringName, "expected parameter 'peeringName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualRouterName = Objects.requireNonNull($.virtualRouterName, "expected parameter 'virtualRouterName' to be non-null");
            return $;
        }
    }

}
