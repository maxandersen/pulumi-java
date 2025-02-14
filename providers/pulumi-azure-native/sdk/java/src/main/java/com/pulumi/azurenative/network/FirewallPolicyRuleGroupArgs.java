// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.FirewallPolicyFilterRuleArgs;
import com.pulumi.azurenative.network.inputs.FirewallPolicyNatRuleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleGroupArgs Empty = new FirewallPolicyRuleGroupArgs();

    /**
     * The name of the Firewall Policy.
     * 
     */
    @Import(name="firewallPolicyName", required=true)
    private Output<String> firewallPolicyName;

    /**
     * @return The name of the Firewall Policy.
     * 
     */
    public Output<String> firewallPolicyName() {
        return this.firewallPolicyName;
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Priority of the Firewall Policy Rule Group resource.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority of the Firewall Policy Rule Group resource.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
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
     * The name of the FirewallPolicyRuleGroup.
     * 
     */
    @Import(name="ruleGroupName")
    private @Nullable Output<String> ruleGroupName;

    /**
     * @return The name of the FirewallPolicyRuleGroup.
     * 
     */
    public Optional<Output<String>> ruleGroupName() {
        return Optional.ofNullable(this.ruleGroupName);
    }

    /**
     * Group of Firewall Policy rules.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<Either<FirewallPolicyFilterRuleArgs,FirewallPolicyNatRuleArgs>>> rules;

    /**
     * @return Group of Firewall Policy rules.
     * 
     */
    public Optional<Output<List<Either<FirewallPolicyFilterRuleArgs,FirewallPolicyNatRuleArgs>>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private FirewallPolicyRuleGroupArgs() {}

    private FirewallPolicyRuleGroupArgs(FirewallPolicyRuleGroupArgs $) {
        this.firewallPolicyName = $.firewallPolicyName;
        this.id = $.id;
        this.name = $.name;
        this.priority = $.priority;
        this.resourceGroupName = $.resourceGroupName;
        this.ruleGroupName = $.ruleGroupName;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleGroupArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleGroupArgs();
        }

        public Builder(FirewallPolicyRuleGroupArgs defaults) {
            $ = new FirewallPolicyRuleGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param firewallPolicyName The name of the Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyName(Output<String> firewallPolicyName) {
            $.firewallPolicyName = firewallPolicyName;
            return this;
        }

        /**
         * @param firewallPolicyName The name of the Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyName(String firewallPolicyName) {
            return firewallPolicyName(Output.of(firewallPolicyName));
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
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority Priority of the Firewall Policy Rule Group resource.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority of the Firewall Policy Rule Group resource.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
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
         * @param ruleGroupName The name of the FirewallPolicyRuleGroup.
         * 
         * @return builder
         * 
         */
        public Builder ruleGroupName(@Nullable Output<String> ruleGroupName) {
            $.ruleGroupName = ruleGroupName;
            return this;
        }

        /**
         * @param ruleGroupName The name of the FirewallPolicyRuleGroup.
         * 
         * @return builder
         * 
         */
        public Builder ruleGroupName(String ruleGroupName) {
            return ruleGroupName(Output.of(ruleGroupName));
        }

        /**
         * @param rules Group of Firewall Policy rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<Either<FirewallPolicyFilterRuleArgs,FirewallPolicyNatRuleArgs>>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Group of Firewall Policy rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<Either<FirewallPolicyFilterRuleArgs,FirewallPolicyNatRuleArgs>> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Group of Firewall Policy rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(Either<FirewallPolicyFilterRuleArgs,FirewallPolicyNatRuleArgs>... rules) {
            return rules(List.of(rules));
        }

        public FirewallPolicyRuleGroupArgs build() {
            $.firewallPolicyName = Objects.requireNonNull($.firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
