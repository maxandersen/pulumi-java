// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualNetworkGatewayBgpPeerStatusArgs extends InvokeArgs {

    public static final GetVirtualNetworkGatewayBgpPeerStatusArgs Empty = new GetVirtualNetworkGatewayBgpPeerStatusArgs();

    /**
     * The IP address of the peer to retrieve the status of.
     * 
     */
    @Import(name="peer")
    private @Nullable String peer;

    /**
     * @return The IP address of the peer to retrieve the status of.
     * 
     */
    public Optional<String> peer() {
        return Optional.ofNullable(this.peer);
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
     * The name of the virtual network gateway.
     * 
     */
    @Import(name="virtualNetworkGatewayName", required=true)
    private String virtualNetworkGatewayName;

    /**
     * @return The name of the virtual network gateway.
     * 
     */
    public String virtualNetworkGatewayName() {
        return this.virtualNetworkGatewayName;
    }

    private GetVirtualNetworkGatewayBgpPeerStatusArgs() {}

    private GetVirtualNetworkGatewayBgpPeerStatusArgs(GetVirtualNetworkGatewayBgpPeerStatusArgs $) {
        this.peer = $.peer;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualNetworkGatewayName = $.virtualNetworkGatewayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkGatewayBgpPeerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkGatewayBgpPeerStatusArgs $;

        public Builder() {
            $ = new GetVirtualNetworkGatewayBgpPeerStatusArgs();
        }

        public Builder(GetVirtualNetworkGatewayBgpPeerStatusArgs defaults) {
            $ = new GetVirtualNetworkGatewayBgpPeerStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peer The IP address of the peer to retrieve the status of.
         * 
         * @return builder
         * 
         */
        public Builder peer(@Nullable String peer) {
            $.peer = peer;
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
         * @param virtualNetworkGatewayName The name of the virtual network gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkGatewayName(String virtualNetworkGatewayName) {
            $.virtualNetworkGatewayName = virtualNetworkGatewayName;
            return this;
        }

        public GetVirtualNetworkGatewayBgpPeerStatusArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkGatewayName = Objects.requireNonNull($.virtualNetworkGatewayName, "expected parameter 'virtualNetworkGatewayName' to be non-null");
            return $;
        }
    }

}
