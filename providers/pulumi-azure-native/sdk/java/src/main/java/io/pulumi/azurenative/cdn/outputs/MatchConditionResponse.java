// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MatchConditionResponse {
    /**
     * List of possible match values.
     * 
     */
    private final List<String> matchValue;
    /**
     * Match variable to compare against.
     * 
     */
    private final String matchVariable;
    /**
     * Describes if the result of this condition should be negated.
     * 
     */
    private final @Nullable Boolean negateCondition;
    /**
     * Describes operator to be matched
     * 
     */
    private final String operator;
    /**
     * Selector can used to match a specific key for QueryString, Cookies, RequestHeader or PostArgs.
     * 
     */
    private final @Nullable String selector;
    /**
     * List of transforms.
     * 
     */
    private final @Nullable List<String> transforms;

    @CustomType.Constructor
    private MatchConditionResponse(
        @CustomType.Parameter("matchValue") List<String> matchValue,
        @CustomType.Parameter("matchVariable") String matchVariable,
        @CustomType.Parameter("negateCondition") @Nullable Boolean negateCondition,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("selector") @Nullable String selector,
        @CustomType.Parameter("transforms") @Nullable List<String> transforms) {
        this.matchValue = matchValue;
        this.matchVariable = matchVariable;
        this.negateCondition = negateCondition;
        this.operator = operator;
        this.selector = selector;
        this.transforms = transforms;
    }

    /**
     * List of possible match values.
     * 
    */
    public List<String> matchValue() {
        return this.matchValue;
    }
    /**
     * Match variable to compare against.
     * 
    */
    public String matchVariable() {
        return this.matchVariable;
    }
    /**
     * Describes if the result of this condition should be negated.
     * 
    */
    public Optional<Boolean> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }
    /**
     * Describes operator to be matched
     * 
    */
    public String operator() {
        return this.operator;
    }
    /**
     * Selector can used to match a specific key for QueryString, Cookies, RequestHeader or PostArgs.
     * 
    */
    public Optional<String> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * List of transforms.
     * 
    */
    public List<String> transforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MatchConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> matchValue;
        private String matchVariable;
        private @Nullable Boolean negateCondition;
        private String operator;
        private @Nullable String selector;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(MatchConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValue = defaults.matchValue;
    	      this.matchVariable = defaults.matchVariable;
    	      this.negateCondition = defaults.negateCondition;
    	      this.operator = defaults.operator;
    	      this.selector = defaults.selector;
    	      this.transforms = defaults.transforms;
        }

        public Builder matchValue(List<String> matchValue) {
            this.matchValue = Objects.requireNonNull(matchValue);
            return this;
        }
        public Builder matchValue(String... matchValue) {
            return matchValue(List.of(matchValue));
        }
        public Builder matchVariable(String matchVariable) {
            this.matchVariable = Objects.requireNonNull(matchVariable);
            return this;
        }
        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder selector(@Nullable String selector) {
            this.selector = selector;
            return this;
        }
        public Builder transforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }
        public Builder transforms(String... transforms) {
            return transforms(List.of(transforms));
        }        public MatchConditionResponse build() {
            return new MatchConditionResponse(matchValue, matchVariable, negateCondition, operator, selector, transforms);
        }
    }
}
