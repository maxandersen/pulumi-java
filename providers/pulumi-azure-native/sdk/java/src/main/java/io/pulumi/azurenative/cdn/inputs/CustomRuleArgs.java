// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.ActionType;
import io.pulumi.azurenative.cdn.enums.CustomRuleEnabledState;
import io.pulumi.azurenative.cdn.inputs.MatchConditionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the common attributes for a custom rule that can be included in a waf policy
 * 
 */
public final class CustomRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomRuleArgs Empty = new CustomRuleArgs();

    /**
     * Describes what action to be applied when rule matches
     * 
     */
    @Import(name="action", required=true)
      private final Output<Either<String,ActionType>> action;

    public Output<Either<String,ActionType>> action() {
        return this.action;
    }

    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    @Import(name="enabledState")
      private final @Nullable Output<Either<String,CustomRuleEnabledState>> enabledState;

    public Output<Either<String,CustomRuleEnabledState>> enabledState() {
        return this.enabledState == null ? Codegen.empty() : this.enabledState;
    }

    /**
     * List of match conditions.
     * 
     */
    @Import(name="matchConditions", required=true)
      private final Output<List<MatchConditionArgs>> matchConditions;

    public Output<List<MatchConditionArgs>> matchConditions() {
        return this.matchConditions;
    }

    /**
     * Defines the name of the custom rule
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Defines in what order this rule be evaluated in the overall list of custom rules
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    public CustomRuleArgs(
        Output<Either<String,ActionType>> action,
        @Nullable Output<Either<String,CustomRuleEnabledState>> enabledState,
        Output<List<MatchConditionArgs>> matchConditions,
        Output<String> name,
        Output<Integer> priority) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.enabledState = enabledState;
        this.matchConditions = Objects.requireNonNull(matchConditions, "expected parameter 'matchConditions' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
    }

    private CustomRuleArgs() {
        this.action = Codegen.empty();
        this.enabledState = Codegen.empty();
        this.matchConditions = Codegen.empty();
        this.name = Codegen.empty();
        this.priority = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,ActionType>> action;
        private @Nullable Output<Either<String,CustomRuleEnabledState>> enabledState;
        private Output<List<MatchConditionArgs>> matchConditions;
        private Output<String> name;
        private Output<Integer> priority;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.matchConditions = defaults.matchConditions;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        public Builder action(Output<Either<String,ActionType>> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(Either<String,ActionType> action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder enabledState(@Nullable Output<Either<String,CustomRuleEnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder enabledState(@Nullable Either<String,CustomRuleEnabledState> enabledState) {
            this.enabledState = Codegen.ofNullable(enabledState);
            return this;
        }
        public Builder matchConditions(Output<List<MatchConditionArgs>> matchConditions) {
            this.matchConditions = Objects.requireNonNull(matchConditions);
            return this;
        }
        public Builder matchConditions(List<MatchConditionArgs> matchConditions) {
            this.matchConditions = Output.of(Objects.requireNonNull(matchConditions));
            return this;
        }
        public Builder matchConditions(MatchConditionArgs... matchConditions) {
            return matchConditions(List.of(matchConditions));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }        public CustomRuleArgs build() {
            return new CustomRuleArgs(action, enabledState, matchConditions, name, priority);
        }
    }
}
