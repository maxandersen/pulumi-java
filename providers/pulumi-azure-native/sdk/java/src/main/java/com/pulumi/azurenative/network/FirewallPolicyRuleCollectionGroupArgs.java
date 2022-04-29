// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.FirewallPolicyFilterRuleCollectionArgs;
import com.pulumi.azurenative.network.inputs.FirewallPolicyNatRuleCollectionArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleCollectionGroupArgs extends ResourceArgs {

    public static final FirewallPolicyRuleCollectionGroupArgs Empty = new FirewallPolicyRuleCollectionGroupArgs();

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
     * Priority of the Firewall Policy Rule Collection Group resource.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority of the Firewall Policy Rule Collection Group resource.
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
     * The name of the FirewallPolicyRuleCollectionGroup.
     * 
     */
    @Import(name="ruleCollectionGroupName")
    private @Nullable Output<String> ruleCollectionGroupName;

    /**
     * @return The name of the FirewallPolicyRuleCollectionGroup.
     * 
     */
    public Optional<Output<String>> ruleCollectionGroupName() {
        return Optional.ofNullable(this.ruleCollectionGroupName);
    }

    /**
     * Group of Firewall Policy rule collections.
     * 
     */
    @Import(name="ruleCollections")
    private @Nullable Output<List<Either<FirewallPolicyFilterRuleCollectionArgs,FirewallPolicyNatRuleCollectionArgs>>> ruleCollections;

    /**
     * @return Group of Firewall Policy rule collections.
     * 
     */
    public Optional<Output<List<Either<FirewallPolicyFilterRuleCollectionArgs,FirewallPolicyNatRuleCollectionArgs>>>> ruleCollections() {
        return Optional.ofNullable(this.ruleCollections);
    }

    private FirewallPolicyRuleCollectionGroupArgs() {}

    private FirewallPolicyRuleCollectionGroupArgs(FirewallPolicyRuleCollectionGroupArgs $) {
        this.firewallPolicyName = $.firewallPolicyName;
        this.id = $.id;
        this.name = $.name;
        this.priority = $.priority;
        this.resourceGroupName = $.resourceGroupName;
        this.ruleCollectionGroupName = $.ruleCollectionGroupName;
        this.ruleCollections = $.ruleCollections;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleCollectionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleCollectionGroupArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleCollectionGroupArgs();
        }

        public Builder(FirewallPolicyRuleCollectionGroupArgs defaults) {
            $ = new FirewallPolicyRuleCollectionGroupArgs(Objects.requireNonNull(defaults));
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
         * @param priority Priority of the Firewall Policy Rule Collection Group resource.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority of the Firewall Policy Rule Collection Group resource.
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
         * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
         * 
         * @return builder
         * 
         */
        public Builder ruleCollectionGroupName(@Nullable Output<String> ruleCollectionGroupName) {
            $.ruleCollectionGroupName = ruleCollectionGroupName;
            return this;
        }

        /**
         * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
         * 
         * @return builder
         * 
         */
        public Builder ruleCollectionGroupName(String ruleCollectionGroupName) {
            return ruleCollectionGroupName(Output.of(ruleCollectionGroupName));
        }

        /**
         * @param ruleCollections Group of Firewall Policy rule collections.
         * 
         * @return builder
         * 
         */
        public Builder ruleCollections(@Nullable Output<List<Either<FirewallPolicyFilterRuleCollectionArgs,FirewallPolicyNatRuleCollectionArgs>>> ruleCollections) {
            $.ruleCollections = ruleCollections;
            return this;
        }

        /**
         * @param ruleCollections Group of Firewall Policy rule collections.
         * 
         * @return builder
         * 
         */
        public Builder ruleCollections(List<Either<FirewallPolicyFilterRuleCollectionArgs,FirewallPolicyNatRuleCollectionArgs>> ruleCollections) {
            return ruleCollections(Output.of(ruleCollections));
        }

        /**
         * @param ruleCollections Group of Firewall Policy rule collections.
         * 
         * @return builder
         * 
         */
        public Builder ruleCollections(Either<FirewallPolicyFilterRuleCollectionArgs,FirewallPolicyNatRuleCollectionArgs>... ruleCollections) {
            return ruleCollections(List.of(ruleCollections));
        }

        public FirewallPolicyRuleCollectionGroupArgs build() {
            $.firewallPolicyName = Objects.requireNonNull($.firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
