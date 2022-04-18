// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.RuleGroupCaptchaConfig;
import com.pulumi.awsnative.wafv2.outputs.RuleGroupLabel;
import com.pulumi.awsnative.wafv2.outputs.RuleGroupRuleAction;
import com.pulumi.awsnative.wafv2.outputs.RuleGroupStatement;
import com.pulumi.awsnative.wafv2.outputs.RuleGroupVisibilityConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRule {
    private final @Nullable RuleGroupRuleAction action;
    private final @Nullable RuleGroupCaptchaConfig captchaConfig;
    private final String name;
    private final Integer priority;
    /**
     * Collection of Rule Labels.
     * 
     */
    private final @Nullable List<RuleGroupLabel> ruleLabels;
    private final RuleGroupStatement statement;
    private final RuleGroupVisibilityConfig visibilityConfig;

    @CustomType.Constructor
    private RuleGroupRule(
        @CustomType.Parameter("action") @Nullable RuleGroupRuleAction action,
        @CustomType.Parameter("captchaConfig") @Nullable RuleGroupCaptchaConfig captchaConfig,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("ruleLabels") @Nullable List<RuleGroupLabel> ruleLabels,
        @CustomType.Parameter("statement") RuleGroupStatement statement,
        @CustomType.Parameter("visibilityConfig") RuleGroupVisibilityConfig visibilityConfig) {
        this.action = action;
        this.captchaConfig = captchaConfig;
        this.name = name;
        this.priority = priority;
        this.ruleLabels = ruleLabels;
        this.statement = statement;
        this.visibilityConfig = visibilityConfig;
    }

    public Optional<RuleGroupRuleAction> action() {
        return Optional.ofNullable(this.action);
    }
    public Optional<RuleGroupCaptchaConfig> captchaConfig() {
        return Optional.ofNullable(this.captchaConfig);
    }
    public String name() {
        return this.name;
    }
    public Integer priority() {
        return this.priority;
    }
    /**
     * Collection of Rule Labels.
     * 
    */
    public List<RuleGroupLabel> ruleLabels() {
        return this.ruleLabels == null ? List.of() : this.ruleLabels;
    }
    public RuleGroupStatement statement() {
        return this.statement;
    }
    public RuleGroupVisibilityConfig visibilityConfig() {
        return this.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleAction action;
        private @Nullable RuleGroupCaptchaConfig captchaConfig;
        private String name;
        private Integer priority;
        private @Nullable List<RuleGroupLabel> ruleLabels;
        private RuleGroupStatement statement;
        private RuleGroupVisibilityConfig visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.captchaConfig = defaults.captchaConfig;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder action(@Nullable RuleGroupRuleAction action) {
            this.action = action;
            return this;
        }
        public Builder captchaConfig(@Nullable RuleGroupCaptchaConfig captchaConfig) {
            this.captchaConfig = captchaConfig;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder ruleLabels(@Nullable List<RuleGroupLabel> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }
        public Builder ruleLabels(RuleGroupLabel... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }
        public Builder statement(RuleGroupStatement statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }
        public Builder visibilityConfig(RuleGroupVisibilityConfig visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }        public RuleGroupRule build() {
            return new RuleGroupRule(action, captchaConfig, name, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
