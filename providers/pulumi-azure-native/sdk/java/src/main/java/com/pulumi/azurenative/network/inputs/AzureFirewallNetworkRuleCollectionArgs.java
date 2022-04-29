// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.AzureFirewallNetworkRuleArgs;
import com.pulumi.azurenative.network.inputs.AzureFirewallRCActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network rule collection resource.
 * 
 */
public final class AzureFirewallNetworkRuleCollectionArgs extends ResourceArgs {

    public static final AzureFirewallNetworkRuleCollectionArgs Empty = new AzureFirewallNetworkRuleCollectionArgs();

    /**
     * The action type of a rule collection.
     * 
     */
    @Import(name="action")
    private @Nullable Output<AzureFirewallRCActionArgs> action;

    /**
     * @return The action type of a rule collection.
     * 
     */
    public Optional<Output<AzureFirewallRCActionArgs>> action() {
        return Optional.ofNullable(this.action);
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
     * The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Priority of the network rule collection resource.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority of the network rule collection resource.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Collection of rules used by a network rule collection.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<AzureFirewallNetworkRuleArgs>> rules;

    /**
     * @return Collection of rules used by a network rule collection.
     * 
     */
    public Optional<Output<List<AzureFirewallNetworkRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private AzureFirewallNetworkRuleCollectionArgs() {}

    private AzureFirewallNetworkRuleCollectionArgs(AzureFirewallNetworkRuleCollectionArgs $) {
        this.action = $.action;
        this.id = $.id;
        this.name = $.name;
        this.priority = $.priority;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallNetworkRuleCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallNetworkRuleCollectionArgs $;

        public Builder() {
            $ = new AzureFirewallNetworkRuleCollectionArgs();
        }

        public Builder(AzureFirewallNetworkRuleCollectionArgs defaults) {
            $ = new AzureFirewallNetworkRuleCollectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action type of a rule collection.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<AzureFirewallRCActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action type of a rule collection.
         * 
         * @return builder
         * 
         */
        public Builder action(AzureFirewallRCActionArgs action) {
            return action(Output.of(action));
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
         * @param name The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority Priority of the network rule collection resource.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority of the network rule collection resource.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param rules Collection of rules used by a network rule collection.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<AzureFirewallNetworkRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Collection of rules used by a network rule collection.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<AzureFirewallNetworkRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Collection of rules used by a network rule collection.
         * 
         * @return builder
         * 
         */
        public Builder rules(AzureFirewallNetworkRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public AzureFirewallNetworkRuleCollectionArgs build() {
            return $;
        }
    }

}
