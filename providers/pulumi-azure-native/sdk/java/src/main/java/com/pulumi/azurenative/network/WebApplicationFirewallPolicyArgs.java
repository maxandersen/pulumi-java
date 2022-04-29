// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.ManagedRulesDefinitionArgs;
import com.pulumi.azurenative.network.inputs.PolicySettingsArgs;
import com.pulumi.azurenative.network.inputs.WebApplicationFirewallCustomRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebApplicationFirewallPolicyArgs extends ResourceArgs {

    public static final WebApplicationFirewallPolicyArgs Empty = new WebApplicationFirewallPolicyArgs();

    /**
     * The custom rules inside the policy.
     * 
     */
    @Import(name="customRules")
    private @Nullable Output<List<WebApplicationFirewallCustomRuleArgs>> customRules;

    /**
     * @return The custom rules inside the policy.
     * 
     */
    public Optional<Output<List<WebApplicationFirewallCustomRuleArgs>>> customRules() {
        return Optional.ofNullable(this.customRules);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Describes the managedRules structure.
     * 
     */
    @Import(name="managedRules", required=true)
    private Output<ManagedRulesDefinitionArgs> managedRules;

    /**
     * @return Describes the managedRules structure.
     * 
     */
    public Output<ManagedRulesDefinitionArgs> managedRules() {
        return this.managedRules;
    }

    /**
     * The name of the policy.
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return The name of the policy.
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * The PolicySettings for policy.
     * 
     */
    @Import(name="policySettings")
    private @Nullable Output<PolicySettingsArgs> policySettings;

    /**
     * @return The PolicySettings for policy.
     * 
     */
    public Optional<Output<PolicySettingsArgs>> policySettings() {
        return Optional.ofNullable(this.policySettings);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private WebApplicationFirewallPolicyArgs() {}

    private WebApplicationFirewallPolicyArgs(WebApplicationFirewallPolicyArgs $) {
        this.customRules = $.customRules;
        this.id = $.id;
        this.location = $.location;
        this.managedRules = $.managedRules;
        this.policyName = $.policyName;
        this.policySettings = $.policySettings;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebApplicationFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebApplicationFirewallPolicyArgs $;

        public Builder() {
            $ = new WebApplicationFirewallPolicyArgs();
        }

        public Builder(WebApplicationFirewallPolicyArgs defaults) {
            $ = new WebApplicationFirewallPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customRules The custom rules inside the policy.
         * 
         * @return builder
         * 
         */
        public Builder customRules(@Nullable Output<List<WebApplicationFirewallCustomRuleArgs>> customRules) {
            $.customRules = customRules;
            return this;
        }

        /**
         * @param customRules The custom rules inside the policy.
         * 
         * @return builder
         * 
         */
        public Builder customRules(List<WebApplicationFirewallCustomRuleArgs> customRules) {
            return customRules(Output.of(customRules));
        }

        /**
         * @param customRules The custom rules inside the policy.
         * 
         * @return builder
         * 
         */
        public Builder customRules(WebApplicationFirewallCustomRuleArgs... customRules) {
            return customRules(List.of(customRules));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedRules Describes the managedRules structure.
         * 
         * @return builder
         * 
         */
        public Builder managedRules(Output<ManagedRulesDefinitionArgs> managedRules) {
            $.managedRules = managedRules;
            return this;
        }

        /**
         * @param managedRules Describes the managedRules structure.
         * 
         * @return builder
         * 
         */
        public Builder managedRules(ManagedRulesDefinitionArgs managedRules) {
            return managedRules(Output.of(managedRules));
        }

        /**
         * @param policyName The name of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName The name of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param policySettings The PolicySettings for policy.
         * 
         * @return builder
         * 
         */
        public Builder policySettings(@Nullable Output<PolicySettingsArgs> policySettings) {
            $.policySettings = policySettings;
            return this;
        }

        /**
         * @param policySettings The PolicySettings for policy.
         * 
         * @return builder
         * 
         */
        public Builder policySettings(PolicySettingsArgs policySettings) {
            return policySettings(Output.of(policySettings));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public WebApplicationFirewallPolicyArgs build() {
            $.managedRules = Objects.requireNonNull($.managedRules, "expected parameter 'managedRules' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
