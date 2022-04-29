// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetPolicyExemptionArgs extends InvokeArgs {

    public static final GetPolicyExemptionArgs Empty = new GetPolicyExemptionArgs();

    /**
     * The name of the policy exemption to delete.
     * 
     */
    @Import(name="policyExemptionName", required=true)
    private String policyExemptionName;

    /**
     * @return The name of the policy exemption to delete.
     * 
     */
    public String policyExemptionName() {
        return this.policyExemptionName;
    }

    /**
     * The scope of the policy exemption. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    /**
     * @return The scope of the policy exemption. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
     * 
     */
    public String scope() {
        return this.scope;
    }

    private GetPolicyExemptionArgs() {}

    private GetPolicyExemptionArgs(GetPolicyExemptionArgs $) {
        this.policyExemptionName = $.policyExemptionName;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyExemptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyExemptionArgs $;

        public Builder() {
            $ = new GetPolicyExemptionArgs();
        }

        public Builder(GetPolicyExemptionArgs defaults) {
            $ = new GetPolicyExemptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyExemptionName The name of the policy exemption to delete.
         * 
         * @return builder
         * 
         */
        public Builder policyExemptionName(String policyExemptionName) {
            $.policyExemptionName = policyExemptionName;
            return this;
        }

        /**
         * @param scope The scope of the policy exemption. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        public GetPolicyExemptionArgs build() {
            $.policyExemptionName = Objects.requireNonNull($.policyExemptionName, "expected parameter 'policyExemptionName' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
