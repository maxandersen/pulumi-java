// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetVpnServerConfigurationArgs extends InvokeArgs {

    public static final GetVpnServerConfigurationArgs Empty = new GetVpnServerConfigurationArgs();

    /**
     * The resource group name of the VpnServerConfiguration.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name of the VpnServerConfiguration.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VpnServerConfiguration being retrieved.
     * 
     */
    @Import(name="vpnServerConfigurationName", required=true)
    private String vpnServerConfigurationName;

    /**
     * @return The name of the VpnServerConfiguration being retrieved.
     * 
     */
    public String vpnServerConfigurationName() {
        return this.vpnServerConfigurationName;
    }

    private GetVpnServerConfigurationArgs() {}

    private GetVpnServerConfigurationArgs(GetVpnServerConfigurationArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.vpnServerConfigurationName = $.vpnServerConfigurationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpnServerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpnServerConfigurationArgs $;

        public Builder() {
            $ = new GetVpnServerConfigurationArgs();
        }

        public Builder(GetVpnServerConfigurationArgs defaults) {
            $ = new GetVpnServerConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The resource group name of the VpnServerConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vpnServerConfigurationName The name of the VpnServerConfiguration being retrieved.
         * 
         * @return builder
         * 
         */
        public Builder vpnServerConfigurationName(String vpnServerConfigurationName) {
            $.vpnServerConfigurationName = vpnServerConfigurationName;
            return this;
        }

        public GetVpnServerConfigurationArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vpnServerConfigurationName = Objects.requireNonNull($.vpnServerConfigurationName, "expected parameter 'vpnServerConfigurationName' to be non-null");
            return $;
        }
    }

}
