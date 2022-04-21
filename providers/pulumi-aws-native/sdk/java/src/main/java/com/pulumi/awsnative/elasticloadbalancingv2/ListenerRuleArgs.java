// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2;

import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleActionArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleRuleConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ListenerRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleArgs Empty = new ListenerRuleArgs();

    @Import(name="actions", required=true)
    private Output<List<ListenerRuleActionArgs>> actions;

    public Output<List<ListenerRuleActionArgs>> actions() {
        return this.actions;
    }

    @Import(name="conditions", required=true)
    private Output<List<ListenerRuleRuleConditionArgs>> conditions;

    public Output<List<ListenerRuleRuleConditionArgs>> conditions() {
        return this.conditions;
    }

    @Import(name="listenerArn", required=true)
    private Output<String> listenerArn;

    public Output<String> listenerArn() {
        return this.listenerArn;
    }

    @Import(name="priority", required=true)
    private Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    private ListenerRuleArgs() {}

    private ListenerRuleArgs(ListenerRuleArgs $) {
        this.actions = $.actions;
        this.conditions = $.conditions;
        this.listenerArn = $.listenerArn;
        this.priority = $.priority;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleArgs $;

        public Builder() {
            $ = new ListenerRuleArgs();
        }

        public Builder(ListenerRuleArgs defaults) {
            $ = new ListenerRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder actions(Output<List<ListenerRuleActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        public Builder actions(List<ListenerRuleActionArgs> actions) {
            return actions(Output.of(actions));
        }

        public Builder actions(ListenerRuleActionArgs... actions) {
            return actions(List.of(actions));
        }

        public Builder conditions(Output<List<ListenerRuleRuleConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<ListenerRuleRuleConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(ListenerRuleRuleConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder listenerArn(Output<String> listenerArn) {
            $.listenerArn = listenerArn;
            return this;
        }

        public Builder listenerArn(String listenerArn) {
            return listenerArn(Output.of(listenerArn));
        }

        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public ListenerRuleArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            $.listenerArn = Objects.requireNonNull($.listenerArn, "expected parameter 'listenerArn' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            return $;
        }
    }

}
