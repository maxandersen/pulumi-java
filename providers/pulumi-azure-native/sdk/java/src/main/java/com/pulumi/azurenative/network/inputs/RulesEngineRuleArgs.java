// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.MatchProcessingBehavior;
import com.pulumi.azurenative.network.inputs.RulesEngineActionArgs;
import com.pulumi.azurenative.network.inputs.RulesEngineMatchConditionArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains a list of match conditions, and an action on how to modify the request/response. If multiple rules match, the actions from one rule that conflict with a previous rule overwrite for a singular action, or append in the case of headers manipulation.
 * 
 */
public final class RulesEngineRuleArgs extends ResourceArgs {

    public static final RulesEngineRuleArgs Empty = new RulesEngineRuleArgs();

    /**
     * Actions to perform on the request and response if all of the match conditions are met.
     * 
     */
    @Import(name="action", required=true)
    private Output<RulesEngineActionArgs> action;

    /**
     * @return Actions to perform on the request and response if all of the match conditions are met.
     * 
     */
    public Output<RulesEngineActionArgs> action() {
        return this.action;
    }

    /**
     * A list of match conditions that must meet in order for the actions of this rule to run. Having no match conditions means the actions will always run.
     * 
     */
    @Import(name="matchConditions")
    private @Nullable Output<List<RulesEngineMatchConditionArgs>> matchConditions;

    /**
     * @return A list of match conditions that must meet in order for the actions of this rule to run. Having no match conditions means the actions will always run.
     * 
     */
    public Optional<Output<List<RulesEngineMatchConditionArgs>>> matchConditions() {
        return Optional.ofNullable(this.matchConditions);
    }

    /**
     * If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    @Import(name="matchProcessingBehavior")
    private @Nullable Output<Either<String,MatchProcessingBehavior>> matchProcessingBehavior;

    /**
     * @return If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    public Optional<Output<Either<String,MatchProcessingBehavior>>> matchProcessingBehavior() {
        return Optional.ofNullable(this.matchProcessingBehavior);
    }

    /**
     * A name to refer to this specific rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A name to refer to this specific rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A priority assigned to this rule.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return A priority assigned to this rule.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    private RulesEngineRuleArgs() {}

    private RulesEngineRuleArgs(RulesEngineRuleArgs $) {
        this.action = $.action;
        this.matchConditions = $.matchConditions;
        this.matchProcessingBehavior = $.matchProcessingBehavior;
        this.name = $.name;
        this.priority = $.priority;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesEngineRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesEngineRuleArgs $;

        public Builder() {
            $ = new RulesEngineRuleArgs();
        }

        public Builder(RulesEngineRuleArgs defaults) {
            $ = new RulesEngineRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Actions to perform on the request and response if all of the match conditions are met.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<RulesEngineActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Actions to perform on the request and response if all of the match conditions are met.
         * 
         * @return builder
         * 
         */
        public Builder action(RulesEngineActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param matchConditions A list of match conditions that must meet in order for the actions of this rule to run. Having no match conditions means the actions will always run.
         * 
         * @return builder
         * 
         */
        public Builder matchConditions(@Nullable Output<List<RulesEngineMatchConditionArgs>> matchConditions) {
            $.matchConditions = matchConditions;
            return this;
        }

        /**
         * @param matchConditions A list of match conditions that must meet in order for the actions of this rule to run. Having no match conditions means the actions will always run.
         * 
         * @return builder
         * 
         */
        public Builder matchConditions(List<RulesEngineMatchConditionArgs> matchConditions) {
            return matchConditions(Output.of(matchConditions));
        }

        /**
         * @param matchConditions A list of match conditions that must meet in order for the actions of this rule to run. Having no match conditions means the actions will always run.
         * 
         * @return builder
         * 
         */
        public Builder matchConditions(RulesEngineMatchConditionArgs... matchConditions) {
            return matchConditions(List.of(matchConditions));
        }

        /**
         * @param matchProcessingBehavior If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
         * 
         * @return builder
         * 
         */
        public Builder matchProcessingBehavior(@Nullable Output<Either<String,MatchProcessingBehavior>> matchProcessingBehavior) {
            $.matchProcessingBehavior = matchProcessingBehavior;
            return this;
        }

        /**
         * @param matchProcessingBehavior If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
         * 
         * @return builder
         * 
         */
        public Builder matchProcessingBehavior(Either<String,MatchProcessingBehavior> matchProcessingBehavior) {
            return matchProcessingBehavior(Output.of(matchProcessingBehavior));
        }

        /**
         * @param matchProcessingBehavior If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
         * 
         * @return builder
         * 
         */
        public Builder matchProcessingBehavior(String matchProcessingBehavior) {
            return matchProcessingBehavior(Either.ofLeft(matchProcessingBehavior));
        }

        /**
         * @param matchProcessingBehavior If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
         * 
         * @return builder
         * 
         */
        public Builder matchProcessingBehavior(MatchProcessingBehavior matchProcessingBehavior) {
            return matchProcessingBehavior(Either.ofRight(matchProcessingBehavior));
        }

        /**
         * @param name A name to refer to this specific rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name to refer to this specific rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority A priority assigned to this rule.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority A priority assigned to this rule.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public RulesEngineRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            return $;
        }
    }

}
