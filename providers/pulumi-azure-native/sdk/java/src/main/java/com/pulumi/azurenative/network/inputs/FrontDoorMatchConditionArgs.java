// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FrontDoorMatchVariable;
import com.pulumi.azurenative.network.enums.Operator;
import com.pulumi.azurenative.network.enums.TransformType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Define a match condition.
 * 
 */
public final class FrontDoorMatchConditionArgs extends ResourceArgs {

    public static final FrontDoorMatchConditionArgs Empty = new FrontDoorMatchConditionArgs();

    /**
     * List of possible match values.
     * 
     */
    @Import(name="matchValue", required=true)
    private Output<List<String>> matchValue;

    /**
     * @return List of possible match values.
     * 
     */
    public Output<List<String>> matchValue() {
        return this.matchValue;
    }

    /**
     * Request variable to compare with.
     * 
     */
    @Import(name="matchVariable", required=true)
    private Output<Either<String,FrontDoorMatchVariable>> matchVariable;

    /**
     * @return Request variable to compare with.
     * 
     */
    public Output<Either<String,FrontDoorMatchVariable>> matchVariable() {
        return this.matchVariable;
    }

    /**
     * Describes if the result of this condition should be negated.
     * 
     */
    @Import(name="negateCondition")
    private @Nullable Output<Boolean> negateCondition;

    /**
     * @return Describes if the result of this condition should be negated.
     * 
     */
    public Optional<Output<Boolean>> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }

    /**
     * Comparison type to use for matching with the variable value.
     * 
     */
    @Import(name="operator", required=true)
    private Output<Either<String,Operator>> operator;

    /**
     * @return Comparison type to use for matching with the variable value.
     * 
     */
    public Output<Either<String,Operator>> operator() {
        return this.operator;
    }

    /**
     * Match against a specific key from the QueryString, PostArgs, RequestHeader or Cookies variables. Default is null.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return Match against a specific key from the QueryString, PostArgs, RequestHeader or Cookies variables. Default is null.
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * List of transforms.
     * 
     */
    @Import(name="transforms")
    private @Nullable Output<List<Either<String,TransformType>>> transforms;

    /**
     * @return List of transforms.
     * 
     */
    public Optional<Output<List<Either<String,TransformType>>>> transforms() {
        return Optional.ofNullable(this.transforms);
    }

    private FrontDoorMatchConditionArgs() {}

    private FrontDoorMatchConditionArgs(FrontDoorMatchConditionArgs $) {
        this.matchValue = $.matchValue;
        this.matchVariable = $.matchVariable;
        this.negateCondition = $.negateCondition;
        this.operator = $.operator;
        this.selector = $.selector;
        this.transforms = $.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontDoorMatchConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontDoorMatchConditionArgs $;

        public Builder() {
            $ = new FrontDoorMatchConditionArgs();
        }

        public Builder(FrontDoorMatchConditionArgs defaults) {
            $ = new FrontDoorMatchConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchValue List of possible match values.
         * 
         * @return builder
         * 
         */
        public Builder matchValue(Output<List<String>> matchValue) {
            $.matchValue = matchValue;
            return this;
        }

        /**
         * @param matchValue List of possible match values.
         * 
         * @return builder
         * 
         */
        public Builder matchValue(List<String> matchValue) {
            return matchValue(Output.of(matchValue));
        }

        /**
         * @param matchValue List of possible match values.
         * 
         * @return builder
         * 
         */
        public Builder matchValue(String... matchValue) {
            return matchValue(List.of(matchValue));
        }

        /**
         * @param matchVariable Request variable to compare with.
         * 
         * @return builder
         * 
         */
        public Builder matchVariable(Output<Either<String,FrontDoorMatchVariable>> matchVariable) {
            $.matchVariable = matchVariable;
            return this;
        }

        /**
         * @param matchVariable Request variable to compare with.
         * 
         * @return builder
         * 
         */
        public Builder matchVariable(Either<String,FrontDoorMatchVariable> matchVariable) {
            return matchVariable(Output.of(matchVariable));
        }

        /**
         * @param matchVariable Request variable to compare with.
         * 
         * @return builder
         * 
         */
        public Builder matchVariable(String matchVariable) {
            return matchVariable(Either.ofLeft(matchVariable));
        }

        /**
         * @param matchVariable Request variable to compare with.
         * 
         * @return builder
         * 
         */
        public Builder matchVariable(FrontDoorMatchVariable matchVariable) {
            return matchVariable(Either.ofRight(matchVariable));
        }

        /**
         * @param negateCondition Describes if the result of this condition should be negated.
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(@Nullable Output<Boolean> negateCondition) {
            $.negateCondition = negateCondition;
            return this;
        }

        /**
         * @param negateCondition Describes if the result of this condition should be negated.
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(Boolean negateCondition) {
            return negateCondition(Output.of(negateCondition));
        }

        /**
         * @param operator Comparison type to use for matching with the variable value.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<Either<String,Operator>> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Comparison type to use for matching with the variable value.
         * 
         * @return builder
         * 
         */
        public Builder operator(Either<String,Operator> operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param operator Comparison type to use for matching with the variable value.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Either.ofLeft(operator));
        }

        /**
         * @param operator Comparison type to use for matching with the variable value.
         * 
         * @return builder
         * 
         */
        public Builder operator(Operator operator) {
            return operator(Either.ofRight(operator));
        }

        /**
         * @param selector Match against a specific key from the QueryString, PostArgs, RequestHeader or Cookies variables. Default is null.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Match against a specific key from the QueryString, PostArgs, RequestHeader or Cookies variables. Default is null.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param transforms List of transforms.
         * 
         * @return builder
         * 
         */
        public Builder transforms(@Nullable Output<List<Either<String,TransformType>>> transforms) {
            $.transforms = transforms;
            return this;
        }

        /**
         * @param transforms List of transforms.
         * 
         * @return builder
         * 
         */
        public Builder transforms(List<Either<String,TransformType>> transforms) {
            return transforms(Output.of(transforms));
        }

        /**
         * @param transforms List of transforms.
         * 
         * @return builder
         * 
         */
        public Builder transforms(Either<String,TransformType>... transforms) {
            return transforms(List.of(transforms));
        }

        public FrontDoorMatchConditionArgs build() {
            $.matchValue = Objects.requireNonNull($.matchValue, "expected parameter 'matchValue' to be non-null");
            $.matchVariable = Objects.requireNonNull($.matchVariable, "expected parameter 'matchVariable' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            return $;
        }
    }

}
