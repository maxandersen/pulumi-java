// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupCustomActionArgs;
import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupStatelessRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupStatelessRulesAndCustomActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupStatelessRulesAndCustomActionsArgs Empty = new RuleGroupStatelessRulesAndCustomActionsArgs();

    @Import(name="customActions")
    private @Nullable Output<List<RuleGroupCustomActionArgs>> customActions;

    public Optional<Output<List<RuleGroupCustomActionArgs>>> customActions() {
        return Optional.ofNullable(this.customActions);
    }

    @Import(name="statelessRules", required=true)
    private Output<List<RuleGroupStatelessRuleArgs>> statelessRules;

    public Output<List<RuleGroupStatelessRuleArgs>> statelessRules() {
        return this.statelessRules;
    }

    private RuleGroupStatelessRulesAndCustomActionsArgs() {}

    private RuleGroupStatelessRulesAndCustomActionsArgs(RuleGroupStatelessRulesAndCustomActionsArgs $) {
        this.customActions = $.customActions;
        this.statelessRules = $.statelessRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupStatelessRulesAndCustomActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupStatelessRulesAndCustomActionsArgs $;

        public Builder() {
            $ = new RuleGroupStatelessRulesAndCustomActionsArgs();
        }

        public Builder(RuleGroupStatelessRulesAndCustomActionsArgs defaults) {
            $ = new RuleGroupStatelessRulesAndCustomActionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder customActions(@Nullable Output<List<RuleGroupCustomActionArgs>> customActions) {
            $.customActions = customActions;
            return this;
        }

        public Builder customActions(List<RuleGroupCustomActionArgs> customActions) {
            return customActions(Output.of(customActions));
        }

        public Builder customActions(RuleGroupCustomActionArgs... customActions) {
            return customActions(List.of(customActions));
        }

        public Builder statelessRules(Output<List<RuleGroupStatelessRuleArgs>> statelessRules) {
            $.statelessRules = statelessRules;
            return this;
        }

        public Builder statelessRules(List<RuleGroupStatelessRuleArgs> statelessRules) {
            return statelessRules(Output.of(statelessRules));
        }

        public Builder statelessRules(RuleGroupStatelessRuleArgs... statelessRules) {
            return statelessRules(List.of(statelessRules));
        }

        public RuleGroupStatelessRulesAndCustomActionsArgs build() {
            $.statelessRules = Objects.requireNonNull($.statelessRules, "expected parameter 'statelessRules' to be non-null");
            return $;
        }
    }

}
