// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleActionGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleRuleLabelGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleVisibilityConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleGetArgs Empty = new WebAclRuleGetArgs();

    /**
     * The action that AWS WAF should take on a web request when it matches the rule's statement. This is used only for rules whose **statements do not reference a rule group**. See Action below for details.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<WebAclRuleActionGetArgs> action;

    public Output<WebAclRuleActionGetArgs> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * A friendly name of the rule.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The override action to apply to the rules in a rule group. Used only for rule **statements that reference a rule group**, like `rule_group_reference_statement` and `managed_rule_group_statement`. See Override Action below for details.
     * 
     */
    @Import(name="overrideAction")
      private final @Nullable Output<WebAclRuleOverrideActionGetArgs> overrideAction;

    public Output<WebAclRuleOverrideActionGetArgs> overrideAction() {
        return this.overrideAction == null ? Codegen.empty() : this.overrideAction;
    }

    /**
     * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
     */
    @Import(name="ruleLabels")
      private final @Nullable Output<List<WebAclRuleRuleLabelGetArgs>> ruleLabels;

    public Output<List<WebAclRuleRuleLabelGetArgs>> ruleLabels() {
        return this.ruleLabels == null ? Codegen.empty() : this.ruleLabels;
    }

    /**
     * The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
     */
    @Import(name="statement", required=true)
      private final Output<WebAclRuleStatementGetArgs> statement;

    public Output<WebAclRuleStatementGetArgs> statement() {
        return this.statement;
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Import(name="visibilityConfig", required=true)
      private final Output<WebAclRuleVisibilityConfigGetArgs> visibilityConfig;

    public Output<WebAclRuleVisibilityConfigGetArgs> visibilityConfig() {
        return this.visibilityConfig;
    }

    public WebAclRuleGetArgs(
        @Nullable Output<WebAclRuleActionGetArgs> action,
        Output<String> name,
        @Nullable Output<WebAclRuleOverrideActionGetArgs> overrideAction,
        Output<Integer> priority,
        @Nullable Output<List<WebAclRuleRuleLabelGetArgs>> ruleLabels,
        Output<WebAclRuleStatementGetArgs> statement,
        Output<WebAclRuleVisibilityConfigGetArgs> visibilityConfig) {
        this.action = action;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.overrideAction = overrideAction;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private WebAclRuleGetArgs() {
        this.action = Codegen.empty();
        this.name = Codegen.empty();
        this.overrideAction = Codegen.empty();
        this.priority = Codegen.empty();
        this.ruleLabels = Codegen.empty();
        this.statement = Codegen.empty();
        this.visibilityConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleActionGetArgs> action;
        private Output<String> name;
        private @Nullable Output<WebAclRuleOverrideActionGetArgs> overrideAction;
        private Output<Integer> priority;
        private @Nullable Output<List<WebAclRuleRuleLabelGetArgs>> ruleLabels;
        private Output<WebAclRuleStatementGetArgs> statement;
        private Output<WebAclRuleVisibilityConfigGetArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.overrideAction = defaults.overrideAction;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder action(@Nullable Output<WebAclRuleActionGetArgs> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable WebAclRuleActionGetArgs action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
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
        public Builder ruleLabels(@Nullable Output<List<WebAclRuleRuleLabelGetArgs>> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }
        public Builder ruleLabels(@Nullable List<WebAclRuleRuleLabelGetArgs> ruleLabels) {
            this.ruleLabels = Codegen.ofNullable(ruleLabels);
            return this;
        }
        public Builder ruleLabels(WebAclRuleRuleLabelGetArgs... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }
        public Builder statement(Output<WebAclRuleStatementGetArgs> statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public Builder statement(WebAclRuleStatementGetArgs statement) {
            this.statement = Output.of(Objects.requireNonNull(statement));
            return this;
        }
        public Builder visibilityConfig(Output<WebAclRuleVisibilityConfigGetArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }
        public Builder visibilityConfig(WebAclRuleVisibilityConfigGetArgs visibilityConfig) {
            this.visibilityConfig = Output.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }        public WebAclRuleGetArgs build() {
            return new WebAclRuleGetArgs(action, name, overrideAction, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
