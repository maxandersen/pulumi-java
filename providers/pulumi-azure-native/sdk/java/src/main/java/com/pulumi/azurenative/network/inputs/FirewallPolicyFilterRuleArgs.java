// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ApplicationRuleConditionArgs;
import com.pulumi.azurenative.network.inputs.FirewallPolicyFilterRuleActionArgs;
import com.pulumi.azurenative.network.inputs.NatRuleConditionArgs;
import com.pulumi.azurenative.network.inputs.NetworkRuleConditionArgs;
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
 * Firewall Policy Filter Rule.
 * 
 */
public final class FirewallPolicyFilterRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFilterRuleArgs Empty = new FirewallPolicyFilterRuleArgs();

    /**
     * The action type of a Filter rule.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<FirewallPolicyFilterRuleActionArgs> action;

    public Output<FirewallPolicyFilterRuleActionArgs> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Priority of the Firewall Policy Rule resource.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * Collection of rule conditions used by a rule.
     * 
     */
    @Import(name="ruleConditions")
      private final @Nullable Output<List<Object>> ruleConditions;

    public Output<List<Object>> ruleConditions() {
        return this.ruleConditions == null ? Codegen.empty() : this.ruleConditions;
    }

    /**
     * The type of the rule.
     * Expected value is &#39;FirewallPolicyFilterRule&#39;.
     * 
     */
    @Import(name="ruleType", required=true)
      private final Output<String> ruleType;

    public Output<String> ruleType() {
        return this.ruleType;
    }

    public FirewallPolicyFilterRuleArgs(
        @Nullable Output<FirewallPolicyFilterRuleActionArgs> action,
        @Nullable Output<String> name,
        @Nullable Output<Integer> priority,
        @Nullable Output<List<Object>> ruleConditions,
        Output<String> ruleType) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleConditions = ruleConditions;
        this.ruleType = Codegen.stringProp("ruleType").output().arg(ruleType).require();
    }

    private FirewallPolicyFilterRuleArgs() {
        this.action = Codegen.empty();
        this.name = Codegen.empty();
        this.priority = Codegen.empty();
        this.ruleConditions = Codegen.empty();
        this.ruleType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FirewallPolicyFilterRuleActionArgs> action;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<List<Object>> ruleConditions;
        private Output<String> ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFilterRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleConditions = defaults.ruleConditions;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder action(@Nullable Output<FirewallPolicyFilterRuleActionArgs> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable FirewallPolicyFilterRuleActionArgs action) {
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
        public Builder ruleConditions(@Nullable Output<List<Object>> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public Builder ruleConditions(@Nullable List<Object> ruleConditions) {
            this.ruleConditions = Codegen.ofNullable(ruleConditions);
            return this;
        }
        public Builder ruleConditions(Object... ruleConditions) {
            return ruleConditions(List.of(ruleConditions));
        }
        public Builder ruleType(Output<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Output.of(Objects.requireNonNull(ruleType));
            return this;
        }        public FirewallPolicyFilterRuleArgs build() {
            return new FirewallPolicyFilterRuleArgs(action, name, priority, ruleConditions, ruleType);
        }
    }
}
