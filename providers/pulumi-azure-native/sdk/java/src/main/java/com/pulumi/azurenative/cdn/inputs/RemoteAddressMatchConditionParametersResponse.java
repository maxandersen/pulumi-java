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
 * Defines the parameters for RemoteAddress match conditions
 * 
 */
public final class RemoteAddressMatchConditionParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final RemoteAddressMatchConditionParametersResponse Empty = new RemoteAddressMatchConditionParametersResponse();

    /**
     * Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     * 
     */
    @Import(name="matchValues")
    private @Nullable List<String> matchValues;

    public Optional<List<String>> matchValues() {
        return Optional.ofNullable(this.matchValues);
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @Import(name="negateCondition")
    private @Nullable Boolean negateCondition;

    public Optional<Boolean> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }

    @Import(name="odataType", required=true)
    private String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * Describes operator to be matched
     * 
     */
    @Import(name="operator", required=true)
    private String operator;

    public String operator() {
        return this.operator;
    }

    /**
     * List of transforms
     * 
     */
    @Import(name="transforms")
    private @Nullable List<String> transforms;

    public Optional<List<String>> transforms() {
        return Optional.ofNullable(this.transforms);
    }

    private RemoteAddressMatchConditionParametersResponse() {}

    private RemoteAddressMatchConditionParametersResponse(RemoteAddressMatchConditionParametersResponse $) {
        this.matchValues = $.matchValues;
        this.negateCondition = $.negateCondition;
        this.odataType = $.odataType;
        this.operator = $.operator;
        this.transforms = $.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RemoteAddressMatchConditionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RemoteAddressMatchConditionParametersResponse $;

        public Builder() {
            $ = new RemoteAddressMatchConditionParametersResponse();
        }

        public Builder(RemoteAddressMatchConditionParametersResponse defaults) {
            $ = new RemoteAddressMatchConditionParametersResponse(Objects.requireNonNull(defaults));
        }

        public Builder matchValues(@Nullable List<String> matchValues) {
            $.matchValues = matchValues;
            return this;
        }

        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }

        public Builder negateCondition(@Nullable Boolean negateCondition) {
            $.negateCondition = negateCondition;
            return this;
        }

        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder operator(String operator) {
            $.operator = operator;
            return this;
        }

        public Builder transforms(@Nullable List<String> transforms) {
            $.transforms = transforms;
            return this;
        }

        public Builder transforms(String... transforms) {
            return transforms(List.of(transforms));
        }

        public RemoteAddressMatchConditionParametersResponse build() {
            $.odataType = Objects.requireNonNull($.odataType, "expected parameter 'odataType' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            return $;
        }
    }

}
