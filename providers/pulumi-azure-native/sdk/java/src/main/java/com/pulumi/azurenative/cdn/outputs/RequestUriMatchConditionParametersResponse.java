// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RequestUriMatchConditionParametersResponse {
    /**
     * The match value for the condition of the delivery rule
     * 
     */
    private final @Nullable List<String> matchValues;
    /**
     * Describes if this is negate condition or not
     * 
     */
    private final @Nullable Boolean negateCondition;
    private final String odataType;
    /**
     * Describes operator to be matched
     * 
     */
    private final String operator;
    /**
     * List of transforms
     * 
     */
    private final @Nullable List<String> transforms;

    @CustomType.Constructor
    private RequestUriMatchConditionParametersResponse(
        @CustomType.Parameter("matchValues") @Nullable List<String> matchValues,
        @CustomType.Parameter("negateCondition") @Nullable Boolean negateCondition,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("transforms") @Nullable List<String> transforms) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = odataType;
        this.operator = operator;
        this.transforms = transforms;
    }

    /**
     * The match value for the condition of the delivery rule
     * 
    */
    public List<String> matchValues() {
        return this.matchValues == null ? List.of() : this.matchValues;
    }
    /**
     * Describes if this is negate condition or not
     * 
    */
    public Optional<Boolean> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }
    public String odataType() {
        return this.odataType;
    }
    /**
     * Describes operator to be matched
     * 
    */
    public String operator() {
        return this.operator;
    }
    /**
     * List of transforms
     * 
    */
    public List<String> transforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestUriMatchConditionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private String odataType;
        private String operator;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestUriMatchConditionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
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
        public Builder transforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }
        public Builder transforms(String... transforms) {
            return transforms(List.of(transforms));
        }        public RequestUriMatchConditionParametersResponse build() {
            return new RequestUriMatchConditionParametersResponse(matchValues, negateCondition, odataType, operator, transforms);
        }
    }
}
