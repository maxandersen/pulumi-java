// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.aws.waf.inputs.WebAclRuleActionGetArgs;
import com.pulumi.aws.waf.inputs.WebAclRuleOverrideActionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleGetArgs Empty = new WebAclRuleGetArgs();

    /**
     * The action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule. Not used if `type` is `GROUP`.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<WebAclRuleActionGetArgs> action;

    public Output<WebAclRuleActionGetArgs> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * Override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule. Only used if `type` is `GROUP`.
     * 
     */
    @Import(name="overrideAction")
      private final @Nullable Output<WebAclRuleOverrideActionGetArgs> overrideAction;

    public Output<WebAclRuleOverrideActionGetArgs> overrideAction() {
        return this.overrideAction == null ? Codegen.empty() : this.overrideAction;
    }

    /**
     * Specifies the order in which the rules in a WebACL are evaluated.
     * Rules with a lower value are evaluated before rules with a higher value.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * ID of the associated WAF (Global) rule (e.g. `aws.waf.Rule`). WAF (Regional) rules cannot be used.
     * 
     */
    @Import(name="ruleId", required=true)
      private final Output<String> ruleId;

    public Output<String> ruleId() {
        return this.ruleId;
    }

    /**
     * The rule type, either `REGULAR`, as defined by [Rule](http://docs.aws.amazon.com/waf/latest/APIReference/API_Rule.html), `RATE_BASED`, as defined by [RateBasedRule](http://docs.aws.amazon.com/waf/latest/APIReference/API_RateBasedRule.html), or `GROUP`, as defined by [RuleGroup](https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleGroup.html). The default is REGULAR. If you add a RATE_BASED rule, you need to set `type` as `RATE_BASED`. If you add a GROUP rule, you need to set `type` as `GROUP`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public WebAclRuleGetArgs(
        @Nullable Output<WebAclRuleActionGetArgs> action,
        @Nullable Output<WebAclRuleOverrideActionGetArgs> overrideAction,
        Output<Integer> priority,
        Output<String> ruleId,
        @Nullable Output<String> type) {
        this.action = action;
        this.overrideAction = overrideAction;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
        this.type = type;
    }

    private WebAclRuleGetArgs() {
        this.action = Codegen.empty();
        this.overrideAction = Codegen.empty();
        this.priority = Codegen.empty();
        this.ruleId = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleActionGetArgs> action;
        private @Nullable Output<WebAclRuleOverrideActionGetArgs> overrideAction;
        private Output<Integer> priority;
        private Output<String> ruleId;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.overrideAction = defaults.overrideAction;
    	      this.priority = defaults.priority;
    	      this.ruleId = defaults.ruleId;
    	      this.type = defaults.type;
        }

        public Builder action(@Nullable Output<WebAclRuleActionGetArgs> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable WebAclRuleActionGetArgs action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder overrideAction(@Nullable Output<WebAclRuleOverrideActionGetArgs> overrideAction) {
            this.overrideAction = overrideAction;
            return this;
        }
        public Builder overrideAction(@Nullable WebAclRuleOverrideActionGetArgs overrideAction) {
            this.overrideAction = Codegen.ofNullable(overrideAction);
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
        }        public WebAclRuleGetArgs build() {
            return new WebAclRuleGetArgs(action, overrideAction, priority, ruleId, type);
        }
    }
}
