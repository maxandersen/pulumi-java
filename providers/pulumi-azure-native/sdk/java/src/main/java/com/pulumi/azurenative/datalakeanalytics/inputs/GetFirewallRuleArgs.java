// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakeanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallRuleArgs Empty = new GetFirewallRuleArgs();

    /**
     * The name of the Data Lake Analytics account.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the firewall rule to retrieve.
     * 
     */
    @Import(name="firewallRuleName", required=true)
      private final String firewallRuleName;

    public String firewallRuleName() {
        return this.firewallRuleName;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetFirewallRuleArgs(
        String accountName,
        String firewallRuleName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.firewallRuleName = Objects.requireNonNull(firewallRuleName, "expected parameter 'firewallRuleName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetFirewallRuleArgs() {
        this.accountName = null;
        this.firewallRuleName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String firewallRuleName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.firewallRuleName = defaults.firewallRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder firewallRuleName(String firewallRuleName) {
            this.firewallRuleName = Objects.requireNonNull(firewallRuleName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetFirewallRuleArgs build() {
            return new GetFirewallRuleArgs(accountName, firewallRuleName, resourceGroupName);
        }
    }
}
