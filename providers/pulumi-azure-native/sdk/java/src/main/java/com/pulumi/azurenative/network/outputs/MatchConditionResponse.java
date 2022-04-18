// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.MatchVariableResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MatchConditionResponse {
    /**
     * Match value.
     * 
     */
    private final List<String> matchValues;
    /**
     * List of match variables.
     * 
     */
    private final List<MatchVariableResponse> matchVariables;
    /**
     * Whether this is negate condition or not.
     * 
     */
    private final @Nullable Boolean negationConditon;
    /**
     * The operator to be matched.
     * 
     */
    private final String operator;
    /**
     * List of transforms.
     * 
     */
    private final @Nullable List<String> transforms;

    @CustomType.Constructor
    private MatchConditionResponse(
        @CustomType.Parameter("matchValues") List<String> matchValues,
        @CustomType.Parameter("matchVariables") List<MatchVariableResponse> matchVariables,
        @CustomType.Parameter("negationConditon") @Nullable Boolean negationConditon,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("transforms") @Nullable List<String> transforms) {
        this.matchValues = matchValues;
        this.matchVariables = matchVariables;
        this.negationConditon = negationConditon;
        this.operator = operator;
        this.transforms = transforms;
    }

    /**
     * Match value.
     * 
    */
    public List<String> matchValues() {
        return this.matchValues;
    }
    /**
     * List of match variables.
     * 
    */
    public List<MatchVariableResponse> matchVariables() {
        return this.matchVariables;
    }
    /**
     * Whether this is negate condition or not.
     * 
    */
    public Optional<Boolean> negationConditon() {
        return Optional.ofNullable(this.negationConditon);
    }
    /**
     * The operator to be matched.
     * 
    */
    public String operator() {
        return this.operator;
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
        private List<String> matchValues;
        private List<MatchVariableResponse> matchVariables;
        private @Nullable Boolean negationConditon;
        private String operator;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(MatchConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.matchVariables = defaults.matchVariables;
    	      this.negationConditon = defaults.negationConditon;
    	      this.operator = defaults.operator;
    	      this.transforms = defaults.transforms;
        }

        public Builder matchValues(List<String> matchValues) {
            this.matchValues = Objects.requireNonNull(matchValues);
            return this;
        }
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }
        public Builder matchVariables(List<MatchVariableResponse> matchVariables) {
            this.matchVariables = Objects.requireNonNull(matchVariables);
            return this;
        }
        public Builder matchVariables(MatchVariableResponse... matchVariables) {
            return matchVariables(List.of(matchVariables));
        }
        public Builder negationConditon(@Nullable Boolean negationConditon) {
            this.negationConditon = negationConditon;
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
        }        public MatchConditionResponse build() {
            return new MatchConditionResponse(matchValues, matchVariables, negationConditon, operator, transforms);
        }
    }
}
