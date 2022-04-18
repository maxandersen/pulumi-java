// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.MatchConditionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomRuleResponse {
    /**
     * Describes what action to be applied when rule matches
     * 
     */
    private final String action;
    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    private final @Nullable String enabledState;
    /**
     * List of match conditions.
     * 
     */
    private final List<MatchConditionResponse> matchConditions;
    /**
     * Defines the name of the custom rule
     * 
     */
    private final String name;
    /**
     * Defines in what order this rule be evaluated in the overall list of custom rules
     * 
     */
    private final Integer priority;

    @CustomType.Constructor
    private CustomRuleResponse(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("enabledState") @Nullable String enabledState,
        @CustomType.Parameter("matchConditions") List<MatchConditionResponse> matchConditions,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("priority") Integer priority) {
        this.action = action;
        this.enabledState = enabledState;
        this.matchConditions = matchConditions;
        this.name = name;
        this.priority = priority;
    }

    /**
     * Describes what action to be applied when rule matches
     * 
    */
    public String action() {
        return this.action;
    }
    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
    */
    public Optional<String> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * List of match conditions.
     * 
    */
    public List<MatchConditionResponse> matchConditions() {
        return this.matchConditions;
    }
    /**
     * Defines the name of the custom rule
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Defines in what order this rule be evaluated in the overall list of custom rules
     * 
    */
    public Integer priority() {
        return this.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private @Nullable String enabledState;
        private List<MatchConditionResponse> matchConditions;
        private String name;
        private Integer priority;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.matchConditions = defaults.matchConditions;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder enabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder matchConditions(List<MatchConditionResponse> matchConditions) {
            this.matchConditions = Objects.requireNonNull(matchConditions);
            return this;
        }
        public Builder matchConditions(MatchConditionResponse... matchConditions) {
            return matchConditions(List.of(matchConditions));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }        public CustomRuleResponse build() {
            return new CustomRuleResponse(action, enabledState, matchConditions, name, priority);
        }
    }
}
