// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.azurenative.alertsmanagement.enums.Operator;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * condition to trigger an action rule
 * 
 */
public final class ConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    /**
     * operator for a given condition
     * 
     */
    @Import(name="operator")
    private @Nullable Output<Either<String,Operator>> operator;

    /**
     * @return operator for a given condition
     * 
     */
    public Optional<Output<Either<String,Operator>>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * list of values to match for a given condition.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return list of values to match for a given condition.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ConditionArgs() {}

    private ConditionArgs(ConditionArgs $) {
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionArgs $;

        public Builder() {
            $ = new ConditionArgs();
        }

        public Builder(ConditionArgs defaults) {
            $ = new ConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator operator for a given condition
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<Either<String,Operator>> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator operator for a given condition
         * 
         * @return builder
         * 
         */
        public Builder operator(Either<String,Operator> operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param operator operator for a given condition
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Either.ofLeft(operator));
        }

        /**
         * @param operator operator for a given condition
         * 
         * @return builder
         * 
         */
        public Builder operator(Operator operator) {
            return operator(Either.ofRight(operator));
        }

        /**
         * @param values list of values to match for a given condition.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values list of values to match for a given condition.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values list of values to match for a given condition.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ConditionArgs build() {
            return $;
        }
    }

}
