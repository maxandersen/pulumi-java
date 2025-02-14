// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.awsnative.networkfirewall.enums.RuleGroupStatefulRuleAction;
import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupHeaderArgs;
import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupRuleOptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class RuleGroupStatefulRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupStatefulRuleArgs Empty = new RuleGroupStatefulRuleArgs();

    @Import(name="action", required=true)
    private Output<RuleGroupStatefulRuleAction> action;

    public Output<RuleGroupStatefulRuleAction> action() {
        return this.action;
    }

    @Import(name="header", required=true)
    private Output<RuleGroupHeaderArgs> header;

    public Output<RuleGroupHeaderArgs> header() {
        return this.header;
    }

    @Import(name="ruleOptions", required=true)
    private Output<List<RuleGroupRuleOptionArgs>> ruleOptions;

    public Output<List<RuleGroupRuleOptionArgs>> ruleOptions() {
        return this.ruleOptions;
    }

    private RuleGroupStatefulRuleArgs() {}

    private RuleGroupStatefulRuleArgs(RuleGroupStatefulRuleArgs $) {
        this.action = $.action;
        this.header = $.header;
        this.ruleOptions = $.ruleOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupStatefulRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupStatefulRuleArgs $;

        public Builder() {
            $ = new RuleGroupStatefulRuleArgs();
        }

        public Builder(RuleGroupStatefulRuleArgs defaults) {
            $ = new RuleGroupStatefulRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(Output<RuleGroupStatefulRuleAction> action) {
            $.action = action;
            return this;
        }

        public Builder action(RuleGroupStatefulRuleAction action) {
            return action(Output.of(action));
        }

        public Builder header(Output<RuleGroupHeaderArgs> header) {
            $.header = header;
            return this;
        }

        public Builder header(RuleGroupHeaderArgs header) {
            return header(Output.of(header));
        }

        public Builder ruleOptions(Output<List<RuleGroupRuleOptionArgs>> ruleOptions) {
            $.ruleOptions = ruleOptions;
            return this;
        }

        public Builder ruleOptions(List<RuleGroupRuleOptionArgs> ruleOptions) {
            return ruleOptions(Output.of(ruleOptions));
        }

        public Builder ruleOptions(RuleGroupRuleOptionArgs... ruleOptions) {
            return ruleOptions(List.of(ruleOptions));
        }

        public RuleGroupStatefulRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.header = Objects.requireNonNull($.header, "expected parameter 'header' to be non-null");
            $.ruleOptions = Objects.requireNonNull($.ruleOptions, "expected parameter 'ruleOptions' to be non-null");
            return $;
        }
    }

}
