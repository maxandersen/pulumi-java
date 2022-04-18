// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupRuleVariables;
import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupRulesSource;
import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupStatefulRuleOptions;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroup extends com.pulumi.resources.InvokeArgs {

    public static final RuleGroup Empty = new RuleGroup();

    @Import(name="ruleVariables")
      private final @Nullable RuleGroupRuleVariables ruleVariables;

    public Optional<RuleGroupRuleVariables> ruleVariables() {
        return this.ruleVariables == null ? Optional.empty() : Optional.ofNullable(this.ruleVariables);
    }

    @Import(name="rulesSource", required=true)
      private final RuleGroupRulesSource rulesSource;

    public RuleGroupRulesSource rulesSource() {
        return this.rulesSource;
    }

    @Import(name="statefulRuleOptions")
      private final @Nullable RuleGroupStatefulRuleOptions statefulRuleOptions;

    public Optional<RuleGroupStatefulRuleOptions> statefulRuleOptions() {
        return this.statefulRuleOptions == null ? Optional.empty() : Optional.ofNullable(this.statefulRuleOptions);
    }

    public RuleGroup(
        @Nullable RuleGroupRuleVariables ruleVariables,
        RuleGroupRulesSource rulesSource,
        @Nullable RuleGroupStatefulRuleOptions statefulRuleOptions) {
        this.ruleVariables = ruleVariables;
        this.rulesSource = Objects.requireNonNull(rulesSource, "expected parameter 'rulesSource' to be non-null");
        this.statefulRuleOptions = statefulRuleOptions;
    }

    private RuleGroup() {
        this.ruleVariables = null;
        this.rulesSource = null;
        this.statefulRuleOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleVariables ruleVariables;
        private RuleGroupRulesSource rulesSource;
        private @Nullable RuleGroupStatefulRuleOptions statefulRuleOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleVariables = defaults.ruleVariables;
    	      this.rulesSource = defaults.rulesSource;
    	      this.statefulRuleOptions = defaults.statefulRuleOptions;
        }

        public Builder ruleVariables(@Nullable RuleGroupRuleVariables ruleVariables) {
            this.ruleVariables = ruleVariables;
            return this;
        }
        public Builder rulesSource(RuleGroupRulesSource rulesSource) {
            this.rulesSource = Objects.requireNonNull(rulesSource);
            return this;
        }
        public Builder statefulRuleOptions(@Nullable RuleGroupStatefulRuleOptions statefulRuleOptions) {
            this.statefulRuleOptions = statefulRuleOptions;
            return this;
        }        public RuleGroup build() {
            return new RuleGroup(ruleVariables, rulesSource, statefulRuleOptions);
        }
    }
}
