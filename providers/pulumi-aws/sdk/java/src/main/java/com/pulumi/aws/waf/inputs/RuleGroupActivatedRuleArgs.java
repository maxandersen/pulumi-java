// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.aws.waf.inputs.RuleGroupActivatedRuleActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupActivatedRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupActivatedRuleArgs Empty = new RuleGroupActivatedRuleArgs();

    /**
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.
     * 
     */
    @Import(name="action", required=true)
      private final Output<RuleGroupActivatedRuleActionArgs> action;

    public Output<RuleGroupActivatedRuleActionArgs> action() {
        return this.action;
    }

    /**
     * Specifies the order in which the rules are evaluated. Rules with a lower value are evaluated before rules with a higher value.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * The ID of a `waf_rule`
     * 
     */
    @Import(name="ruleId", required=true)
      private final Output<String> ruleId;

    public Output<String> ruleId() {
        return this.ruleId;
    }

    /**
     * The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public RuleGroupActivatedRuleArgs(
        Output<RuleGroupActivatedRuleActionArgs> action,
        Output<Integer> priority,
        Output<String> ruleId,
        @Nullable Output<String> type) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
        this.type = type;
    }

    private RuleGroupActivatedRuleArgs() {
        this.action = Codegen.empty();
        this.priority = Codegen.empty();
        this.ruleId = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupActivatedRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RuleGroupActivatedRuleActionArgs> action;
        private Output<Integer> priority;
        private Output<String> ruleId;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupActivatedRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.priority = defaults.priority;
    	      this.ruleId = defaults.ruleId;
    	      this.type = defaults.type;
        }

        public Builder action(Output<RuleGroupActivatedRuleActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(RuleGroupActivatedRuleActionArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }
        public Builder ruleId(Output<String> ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }
        public Builder ruleId(String ruleId) {
            this.ruleId = Output.of(Objects.requireNonNull(ruleId));
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public RuleGroupActivatedRuleArgs build() {
            return new RuleGroupActivatedRuleArgs(action, priority, ruleId, type);
        }
    }
}
