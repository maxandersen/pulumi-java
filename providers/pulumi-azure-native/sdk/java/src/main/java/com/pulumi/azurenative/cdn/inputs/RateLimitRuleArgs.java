// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.ActionType;
import com.pulumi.azurenative.cdn.enums.CustomRuleEnabledState;
import com.pulumi.azurenative.cdn.inputs.MatchConditionArgs;
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
 * Defines a rate limiting rule that can be included in a waf policy
 * 
 */
public final class RateLimitRuleArgs extends ResourceArgs {

    public static final RateLimitRuleArgs Empty = new RateLimitRuleArgs();

    /**
     * Describes what action to be applied when rule matches
     * 
     */
    @Import(name="action", required=true)
    private Output<Either<String,ActionType>> action;

    /**
     * @return Describes what action to be applied when rule matches
     * 
     */
    public Output<Either<String,ActionType>> action() {
        return this.action;
    }

    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    @Import(name="enabledState")
    private @Nullable Output<Either<String,CustomRuleEnabledState>> enabledState;

    /**
     * @return Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    public Optional<Output<Either<String,CustomRuleEnabledState>>> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }

    /**
     * List of match conditions.
     * 
     */
    @Import(name="matchConditions", required=true)
    private Output<List<MatchConditionArgs>> matchConditions;

    /**
     * @return List of match conditions.
     * 
     */
    public Output<List<MatchConditionArgs>> matchConditions() {
        return this.matchConditions;
    }

    /**
     * Defines the name of the custom rule
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Defines the name of the custom rule
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Defines in what order this rule be evaluated in the overall list of custom rules
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return Defines in what order this rule be evaluated in the overall list of custom rules
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * Defines rate limit duration. Default is 1 minute.
     * 
     */
    @Import(name="rateLimitDurationInMinutes", required=true)
    private Output<Integer> rateLimitDurationInMinutes;

    /**
     * @return Defines rate limit duration. Default is 1 minute.
     * 
     */
    public Output<Integer> rateLimitDurationInMinutes() {
        return this.rateLimitDurationInMinutes;
    }

    /**
     * Defines rate limit threshold.
     * 
     */
    @Import(name="rateLimitThreshold", required=true)
    private Output<Integer> rateLimitThreshold;

    /**
     * @return Defines rate limit threshold.
     * 
     */
    public Output<Integer> rateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    private RateLimitRuleArgs() {}

    private RateLimitRuleArgs(RateLimitRuleArgs $) {
        this.action = $.action;
        this.enabledState = $.enabledState;
        this.matchConditions = $.matchConditions;
        this.name = $.name;
        this.priority = $.priority;
        this.rateLimitDurationInMinutes = $.rateLimitDurationInMinutes;
        this.rateLimitThreshold = $.rateLimitThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RateLimitRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RateLimitRuleArgs $;

        public Builder() {
            $ = new RateLimitRuleArgs();
        }

        public Builder(RateLimitRuleArgs defaults) {
            $ = new RateLimitRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Describes what action to be applied when rule matches
         * 
         * @return builder
         * 
         */
        public Builder action(Output<Either<String,ActionType>> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Describes what action to be applied when rule matches
         * 
         * @return builder
         * 
         */
        public Builder action(Either<String,ActionType> action) {
            return action(Output.of(action));
        }

        /**
         * @param action Describes what action to be applied when rule matches
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Either.ofLeft(action));
        }

        /**
         * @param action Describes what action to be applied when rule matches
         * 
         * @return builder
         * 
         */
        public Builder action(ActionType action) {
            return action(Either.ofRight(action));
        }

        /**
         * @param enabledState Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
         * 
         * @return builder
         * 
         */
        public Builder enabledState(@Nullable Output<Either<String,CustomRuleEnabledState>> enabledState) {
            $.enabledState = enabledState;
            return this;
        }

        /**
         * @param enabledState Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
         * 
         * @return builder
         * 
         */
        public Builder enabledState(Either<String,CustomRuleEnabledState> enabledState) {
            return enabledState(Output.of(enabledState));
        }

        /**
         * @param enabledState Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
         * 
         * @return builder
         * 
         */
        public Builder enabledState(String enabledState) {
            return enabledState(Either.ofLeft(enabledState));
        }

        /**
         * @param enabledState Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
         * 
         * @return builder
         * 
         */
        public Builder enabledState(CustomRuleEnabledState enabledState) {
            return enabledState(Either.ofRight(enabledState));
        }

        /**
         * @param matchConditions List of match conditions.
         * 
         * @return builder
         * 
         */
        public Builder matchConditions(Output<List<MatchConditionArgs>> matchConditions) {
            $.matchConditions = matchConditions;
            return this;
        }

        /**
         * @param matchConditions List of match conditions.
         * 
         * @return builder
         * 
         */
        public Builder matchConditions(List<MatchConditionArgs> matchConditions) {
            return matchConditions(Output.of(matchConditions));
        }

        /**
         * @param matchConditions List of match conditions.
         * 
         * @return builder
         * 
         */
        public Builder matchConditions(MatchConditionArgs... matchConditions) {
            return matchConditions(List.of(matchConditions));
        }

        /**
         * @param name Defines the name of the custom rule
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Defines the name of the custom rule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority Defines in what order this rule be evaluated in the overall list of custom rules
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Defines in what order this rule be evaluated in the overall list of custom rules
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param rateLimitDurationInMinutes Defines rate limit duration. Default is 1 minute.
         * 
         * @return builder
         * 
         */
        public Builder rateLimitDurationInMinutes(Output<Integer> rateLimitDurationInMinutes) {
            $.rateLimitDurationInMinutes = rateLimitDurationInMinutes;
            return this;
        }

        /**
         * @param rateLimitDurationInMinutes Defines rate limit duration. Default is 1 minute.
         * 
         * @return builder
         * 
         */
        public Builder rateLimitDurationInMinutes(Integer rateLimitDurationInMinutes) {
            return rateLimitDurationInMinutes(Output.of(rateLimitDurationInMinutes));
        }

        /**
         * @param rateLimitThreshold Defines rate limit threshold.
         * 
         * @return builder
         * 
         */
        public Builder rateLimitThreshold(Output<Integer> rateLimitThreshold) {
            $.rateLimitThreshold = rateLimitThreshold;
            return this;
        }

        /**
         * @param rateLimitThreshold Defines rate limit threshold.
         * 
         * @return builder
         * 
         */
        public Builder rateLimitThreshold(Integer rateLimitThreshold) {
            return rateLimitThreshold(Output.of(rateLimitThreshold));
        }

        public RateLimitRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.matchConditions = Objects.requireNonNull($.matchConditions, "expected parameter 'matchConditions' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.rateLimitDurationInMinutes = Objects.requireNonNull($.rateLimitDurationInMinutes, "expected parameter 'rateLimitDurationInMinutes' to be non-null");
            $.rateLimitThreshold = Objects.requireNonNull($.rateLimitThreshold, "expected parameter 'rateLimitThreshold' to be non-null");
            return $;
        }
    }

}
