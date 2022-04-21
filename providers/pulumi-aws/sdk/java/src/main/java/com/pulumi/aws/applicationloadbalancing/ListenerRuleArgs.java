// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing;

import com.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionArgs;
import com.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleArgs Empty = new ListenerRuleArgs();

    /**
     * An Action block. Action blocks are documented below.
     * 
     */
    @Import(name="actions", required=true)
    private Output<List<ListenerRuleActionArgs>> actions;

    public Output<List<ListenerRuleActionArgs>> actions() {
        return this.actions;
    }

    /**
     * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * 
     */
    @Import(name="conditions", required=true)
    private Output<List<ListenerRuleConditionArgs>> conditions;

    public Output<List<ListenerRuleConditionArgs>> conditions() {
        return this.conditions;
    }

    /**
     * The ARN of the listener to which to attach the rule.
     * 
     */
    @Import(name="listenerArn", required=true)
    private Output<String> listenerArn;

    public Output<String> listenerArn() {
        return this.listenerArn;
    }

    /**
     * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can&#39;t have multiple rules with the same priority.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ListenerRuleArgs() {}

    private ListenerRuleArgs(ListenerRuleArgs $) {
        this.actions = $.actions;
        this.conditions = $.conditions;
        this.listenerArn = $.listenerArn;
        this.priority = $.priority;
        this.tags = $.tags;
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

        public Builder conditions(Output<List<ListenerRuleConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<ListenerRuleConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(ListenerRuleConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder listenerArn(Output<String> listenerArn) {
            $.listenerArn = listenerArn;
            return this;
        }

        public Builder listenerArn(String listenerArn) {
            return listenerArn(Output.of(listenerArn));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ListenerRuleArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            $.listenerArn = Objects.requireNonNull($.listenerArn, "expected parameter 'listenerArn' to be non-null");
            return $;
        }
    }

}
