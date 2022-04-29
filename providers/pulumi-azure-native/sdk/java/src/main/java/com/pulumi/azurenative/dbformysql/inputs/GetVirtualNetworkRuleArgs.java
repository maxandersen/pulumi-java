// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformysql.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkRuleArgs extends InvokeArgs {

    public static final GetVirtualNetworkRuleArgs Empty = new GetVirtualNetworkRuleArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private String serverName;

    /**
     * @return The name of the server.
     * 
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * The name of the virtual network rule.
     * 
     */
    @Import(name="virtualNetworkRuleName", required=true)
    private String virtualNetworkRuleName;

    /**
     * @return The name of the virtual network rule.
     * 
     */
    public String virtualNetworkRuleName() {
        return this.virtualNetworkRuleName;
    }

    private GetVirtualNetworkRuleArgs() {}

    private GetVirtualNetworkRuleArgs(GetVirtualNetworkRuleArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.virtualNetworkRuleName = $.virtualNetworkRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkRuleArgs $;

        public Builder() {
            $ = new GetVirtualNetworkRuleArgs();
        }

        public Builder(GetVirtualNetworkRuleArgs defaults) {
            $ = new GetVirtualNetworkRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param virtualNetworkRuleName The name of the virtual network rule.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRuleName(String virtualNetworkRuleName) {
            $.virtualNetworkRuleName = virtualNetworkRuleName;
            return this;
        }

        public GetVirtualNetworkRuleArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.virtualNetworkRuleName = Objects.requireNonNull($.virtualNetworkRuleName, "expected parameter 'virtualNetworkRuleName' to be non-null");
            return $;
        }
    }

}
