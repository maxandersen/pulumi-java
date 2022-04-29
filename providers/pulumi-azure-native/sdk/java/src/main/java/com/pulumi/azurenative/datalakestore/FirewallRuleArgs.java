// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * The name of the Data Lake Store account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the Data Lake Store account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @Import(name="endIpAddress", required=true)
    private Output<String> endIpAddress;

    /**
     * @return The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    public Output<String> endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * The name of the firewall rule to create or update.
     * 
     */
    @Import(name="firewallRuleName")
    private @Nullable Output<String> firewallRuleName;

    /**
     * @return The name of the firewall rule to create or update.
     * 
     */
    public Optional<Output<String>> firewallRuleName() {
        return Optional.ofNullable(this.firewallRuleName);
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Azure resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @Import(name="startIpAddress", required=true)
    private Output<String> startIpAddress;

    /**
     * @return The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    public Output<String> startIpAddress() {
        return this.startIpAddress;
    }

    private FirewallRuleArgs() {}

    private FirewallRuleArgs(FirewallRuleArgs $) {
        this.accountName = $.accountName;
        this.endIpAddress = $.endIpAddress;
        this.firewallRuleName = $.firewallRuleName;
        this.resourceGroupName = $.resourceGroupName;
        this.startIpAddress = $.startIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRuleArgs $;

        public Builder() {
            $ = new FirewallRuleArgs();
        }

        public Builder(FirewallRuleArgs defaults) {
            $ = new FirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Data Lake Store account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the Data Lake Store account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(Output<String> endIpAddress) {
            $.endIpAddress = endIpAddress;
            return this;
        }

        /**
         * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(String endIpAddress) {
            return endIpAddress(Output.of(endIpAddress));
        }

        /**
         * @param firewallRuleName The name of the firewall rule to create or update.
         * 
         * @return builder
         * 
         */
        public Builder firewallRuleName(@Nullable Output<String> firewallRuleName) {
            $.firewallRuleName = firewallRuleName;
            return this;
        }

        /**
         * @param firewallRuleName The name of the firewall rule to create or update.
         * 
         * @return builder
         * 
         */
        public Builder firewallRuleName(String firewallRuleName) {
            return firewallRuleName(Output.of(firewallRuleName));
        }

        /**
         * @param resourceGroupName The name of the Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(Output<String> startIpAddress) {
            $.startIpAddress = startIpAddress;
            return this;
        }

        /**
         * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(String startIpAddress) {
            return startIpAddress(Output.of(startIpAddress));
        }

        public FirewallRuleArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.endIpAddress = Objects.requireNonNull($.endIpAddress, "expected parameter 'endIpAddress' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.startIpAddress = Objects.requireNonNull($.startIpAddress, "expected parameter 'startIpAddress' to be non-null");
            return $;
        }
    }

}
