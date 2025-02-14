// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetP2sVpnServerConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetP2sVpnServerConfigurationArgs Empty = new GetP2sVpnServerConfigurationArgs();

    /**
     * The name of the P2SVpnServerConfiguration.
     * 
     */
    @Import(name="p2SVpnServerConfigurationName", required=true)
    private String p2SVpnServerConfigurationName;

    /**
     * @return The name of the P2SVpnServerConfiguration.
     * 
     */
    public String p2SVpnServerConfigurationName() {
        return this.p2SVpnServerConfigurationName;
    }

    /**
     * The resource group name of the P2SVpnServerConfiguration.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name of the P2SVpnServerConfiguration.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VirtualWan.
     * 
     */
    @Import(name="virtualWanName", required=true)
    private String virtualWanName;

    /**
     * @return The name of the VirtualWan.
     * 
     */
    public String virtualWanName() {
        return this.virtualWanName;
    }

    private GetP2sVpnServerConfigurationArgs() {}

    private GetP2sVpnServerConfigurationArgs(GetP2sVpnServerConfigurationArgs $) {
        this.p2SVpnServerConfigurationName = $.p2SVpnServerConfigurationName;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualWanName = $.virtualWanName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetP2sVpnServerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetP2sVpnServerConfigurationArgs $;

        public Builder() {
            $ = new GetP2sVpnServerConfigurationArgs();
        }

        public Builder(GetP2sVpnServerConfigurationArgs defaults) {
            $ = new GetP2sVpnServerConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder p2SVpnServerConfigurationName(String p2SVpnServerConfigurationName) {
            $.p2SVpnServerConfigurationName = p2SVpnServerConfigurationName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param virtualWanName The name of the VirtualWan.
         * 
         * @return builder
         * 
         */
        public Builder virtualWanName(String virtualWanName) {
            $.virtualWanName = virtualWanName;
            return this;
        }

        public GetP2sVpnServerConfigurationArgs build() {
            $.p2SVpnServerConfigurationName = Objects.requireNonNull($.p2SVpnServerConfigurationName, "expected parameter 'p2SVpnServerConfigurationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualWanName = Objects.requireNonNull($.virtualWanName, "expected parameter 'virtualWanName' to be non-null");
            return $;
        }
    }

}
