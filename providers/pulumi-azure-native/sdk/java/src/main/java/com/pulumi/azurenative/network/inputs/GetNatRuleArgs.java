// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetNatRuleArgs extends InvokeArgs {

    public static final GetNatRuleArgs Empty = new GetNatRuleArgs();

    /**
     * The name of the gateway.
     * 
     */
    @Import(name="gatewayName", required=true)
    private String gatewayName;

    /**
     * @return The name of the gateway.
     * 
     */
    public String gatewayName() {
        return this.gatewayName;
    }

    /**
     * The name of the nat rule.
     * 
     */
    @Import(name="natRuleName", required=true)
    private String natRuleName;

    /**
     * @return The name of the nat rule.
     * 
     */
    public String natRuleName() {
        return this.natRuleName;
    }

    /**
     * The resource group name of the VpnGateway.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name of the VpnGateway.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNatRuleArgs() {}

    private GetNatRuleArgs(GetNatRuleArgs $) {
        this.gatewayName = $.gatewayName;
        this.natRuleName = $.natRuleName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNatRuleArgs $;

        public Builder() {
            $ = new GetNatRuleArgs();
        }

        public Builder(GetNatRuleArgs defaults) {
            $ = new GetNatRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayName The name of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(String gatewayName) {
            $.gatewayName = gatewayName;
            return this;
        }

        /**
         * @param natRuleName The name of the nat rule.
         * 
         * @return builder
         * 
         */
        public Builder natRuleName(String natRuleName) {
            $.natRuleName = natRuleName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name of the VpnGateway.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetNatRuleArgs build() {
            $.gatewayName = Objects.requireNonNull($.gatewayName, "expected parameter 'gatewayName' to be non-null");
            $.natRuleName = Objects.requireNonNull($.natRuleName, "expected parameter 'natRuleName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
