// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for Cookies match conditions
 * 
 */
public final class CookiesMatchConditionParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final CookiesMatchConditionParametersResponse Empty = new CookiesMatchConditionParametersResponse();

    /**
     * The match value for the condition of the delivery rule
     * 
     */
    @Import(name="matchValues")
      private final @Nullable List<String> matchValues;

    public List<String> matchValues() {
        return this.matchValues == null ? List.of() : this.matchValues;
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @Import(name="negateCondition")
      private final @Nullable Boolean negateCondition;

    public Optional<Boolean> negateCondition() {
        return this.negateCondition == null ? Optional.empty() : Optional.ofNullable(this.negateCondition);
    }

    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * Describes operator to be matched
     * 
     */
    @Import(name="operator", required=true)
      private final String operator;

    public String operator() {
        return this.operator;
    }

    /**
     * Name of Cookies to be matched
     * 
     */
    @Import(name="selector")
      private final @Nullable String selector;

    public Optional<String> selector() {
        return this.selector == null ? Optional.empty() : Optional.ofNullable(this.selector);
    }

    /**
     * List of transforms
     * 
     */
    @Import(name="transforms")
      private final @Nullable List<String> transforms;

    public List<String> transforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public CookiesMatchConditionParametersResponse(
        @Nullable List<String> matchValues,
        @Nullable Boolean negateCondition,
        String odataType,
        String operator,
        @Nullable String selector,
        @Nullable List<String> transforms) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.selector = selector;
        this.transforms = transforms;
    }

    private CookiesMatchConditionParametersResponse() {
        this.matchValues = List.of();
        this.negateCondition = null;
        this.odataType = null;
        this.operator = null;
        this.selector = null;
        this.transforms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CookiesMatchConditionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private String odataType;
        private String operator;
        private @Nullable String selector;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(CookiesMatchConditionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
    	      this.selector = defaults.selector;
    	      this.transforms = defaults.transforms;
        }

        public Builder matchValues(@Nullable List<String> matchValues) {
            this.matchValues = matchValues;
            return this;
        }
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }
        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
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
        }        public CookiesMatchConditionParametersResponse build() {
            return new CookiesMatchConditionParametersResponse(matchValues, negateCondition, odataType, operator, selector, transforms);
        }
    }
}
