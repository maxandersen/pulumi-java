// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.enums.OperatorType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The comparison expression to be used in the report.
 * 
 */
public final class ReportConfigComparisonExpressionArgs extends ResourceArgs {

    public static final ReportConfigComparisonExpressionArgs Empty = new ReportConfigComparisonExpressionArgs();

    /**
     * The name of the column to use in comparison.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the column to use in comparison.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The operator to use for comparison.
     * 
     */
    @Import(name="operator", required=true)
    private Output<Either<String,OperatorType>> operator;

    /**
     * @return The operator to use for comparison.
     * 
     */
    public Output<Either<String,OperatorType>> operator() {
        return this.operator;
    }

    /**
     * Array of values to use for comparison
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return Array of values to use for comparison
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private ReportConfigComparisonExpressionArgs() {}

    private ReportConfigComparisonExpressionArgs(ReportConfigComparisonExpressionArgs $) {
        this.name = $.name;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportConfigComparisonExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportConfigComparisonExpressionArgs $;

        public Builder() {
            $ = new ReportConfigComparisonExpressionArgs();
        }

        public Builder(ReportConfigComparisonExpressionArgs defaults) {
            $ = new ReportConfigComparisonExpressionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the column to use in comparison.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the column to use in comparison.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param operator The operator to use for comparison.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<Either<String,OperatorType>> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator to use for comparison.
         * 
         * @return builder
         * 
         */
        public Builder operator(Either<String,OperatorType> operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param operator The operator to use for comparison.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Either.ofLeft(operator));
        }

        /**
         * @param operator The operator to use for comparison.
         * 
         * @return builder
         * 
         */
        public Builder operator(OperatorType operator) {
            return operator(Either.ofRight(operator));
        }

        /**
         * @param values Array of values to use for comparison
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Array of values to use for comparison
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Array of values to use for comparison
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ReportConfigComparisonExpressionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
