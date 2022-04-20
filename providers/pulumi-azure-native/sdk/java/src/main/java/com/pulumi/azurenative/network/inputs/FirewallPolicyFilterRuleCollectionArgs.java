// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ApplicationRuleArgs;
import com.pulumi.azurenative.network.inputs.FirewallPolicyFilterRuleCollectionActionArgs;
import com.pulumi.azurenative.network.inputs.NatRuleArgs;
import com.pulumi.azurenative.network.inputs.NetworkRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Firewall Policy Filter Rule Collection.
 * 
 */
public final class FirewallPolicyFilterRuleCollectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFilterRuleCollectionArgs Empty = new FirewallPolicyFilterRuleCollectionArgs();

    /**
     * The action type of a Filter rule collection.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<FirewallPolicyFilterRuleCollectionActionArgs> action;

    public Output<FirewallPolicyFilterRuleCollectionActionArgs> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * The name of the rule collection.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Priority of the Firewall Policy Rule Collection resource.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * The type of the rule collection.
     * Expected value is &#39;FirewallPolicyFilterRuleCollection&#39;.
     * 
     */
    @Import(name="ruleCollectionType", required=true)
      private final Output<String> ruleCollectionType;

    public Output<String> ruleCollectionType() {
        return this.ruleCollectionType;
    }

    /**
     * List of rules included in a rule collection.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<Object>> rules;

    public Output<List<Object>> rules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    public FirewallPolicyFilterRuleCollectionArgs(
        @Nullable Output<FirewallPolicyFilterRuleCollectionActionArgs> action,
        @Nullable Output<String> name,
        @Nullable Output<Integer> priority,
        Output<String> ruleCollectionType,
        @Nullable Output<List<Object>> rules) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleCollectionType = Codegen.stringProp("ruleCollectionType").output().arg(ruleCollectionType).require();
        this.rules = rules;
    }

    private FirewallPolicyFilterRuleCollectionArgs() {
        this.action = Codegen.empty();
        this.name = Codegen.empty();
        this.priority = Codegen.empty();
        this.ruleCollectionType = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFilterRuleCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FirewallPolicyFilterRuleCollectionActionArgs> action;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> priority;
        private Output<String> ruleCollectionType;
        private @Nullable Output<List<Object>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFilterRuleCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleCollectionType = defaults.ruleCollectionType;
    	      this.rules = defaults.rules;
        }

        public Builder action(@Nullable Output<FirewallPolicyFilterRuleCollectionActionArgs> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable FirewallPolicyFilterRuleCollectionActionArgs action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder ruleCollectionType(Output<String> ruleCollectionType) {
            this.ruleCollectionType = Objects.requireNonNull(ruleCollectionType);
            return this;
        }
        public Builder ruleCollectionType(String ruleCollectionType) {
            this.ruleCollectionType = Output.of(Objects.requireNonNull(ruleCollectionType));
            return this;
        }
        public Builder rules(@Nullable Output<List<Object>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<Object> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(Object... rules) {
            return rules(List.of(rules));
        }        public FirewallPolicyFilterRuleCollectionArgs build() {
            return new FirewallPolicyFilterRuleCollectionArgs(action, name, priority, ruleCollectionType, rules);
        }
    }
}
