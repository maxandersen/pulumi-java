// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetPolicyArgs extends InvokeArgs {

    public static final GetPolicyArgs Empty = new GetPolicyArgs();

    /**
     * The name of the CdnWebApplicationFirewallPolicy.
     * 
     */
    @Import(name="policyName", required=true)
    private String policyName;

    /**
     * @return The name of the CdnWebApplicationFirewallPolicy.
     * 
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPolicyArgs() {}

    private GetPolicyArgs(GetPolicyArgs $) {
        this.policyName = $.policyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyArgs $;

        public Builder() {
            $ = new GetPolicyArgs();
        }

        public Builder(GetPolicyArgs defaults) {
            $ = new GetPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyName The name of the CdnWebApplicationFirewallPolicy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPolicyArgs build() {
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
