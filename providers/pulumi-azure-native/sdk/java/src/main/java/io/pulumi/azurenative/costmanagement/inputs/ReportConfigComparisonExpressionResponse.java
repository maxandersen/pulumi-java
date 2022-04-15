// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The comparison expression to be used in the report.
 * 
 */
public final class ReportConfigComparisonExpressionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportConfigComparisonExpressionResponse Empty = new ReportConfigComparisonExpressionResponse();

    /**
     * The name of the column to use in comparison.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The operator to use for comparison.
     * 
     */
    @Import(name="operator", required=true)
      private final String operator;

    public String operator() {
        return this.operator;
    }

    /**
     * Array of values to use for comparison
     * 
     */
    @Import(name="values", required=true)
      private final List<String> values;

    public List<String> values() {
        return this.values;
    }

    public ReportConfigComparisonExpressionResponse(
        String name,
        String operator,
        List<String> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ReportConfigComparisonExpressionResponse() {
        this.name = null;
        this.operator = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigComparisonExpressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigComparisonExpressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ReportConfigComparisonExpressionResponse build() {
            return new ReportConfigComparisonExpressionResponse(name, operator, values);
        }
    }
}
