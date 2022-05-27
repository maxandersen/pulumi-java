// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MetricAlertDynamicCriteriaDimensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricAlertDynamicCriteriaDimensionArgs Empty = new MetricAlertDynamicCriteriaDimensionArgs();

    /**
     * One of the dimension names.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return One of the dimension names.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The dimension operator. Possible values are `Include`, `Exclude` and `StartsWith`.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return The dimension operator. Possible values are `Include`, `Exclude` and `StartsWith`.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * The list of dimension values.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return The list of dimension values.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private MetricAlertDynamicCriteriaDimensionArgs() {}

    private MetricAlertDynamicCriteriaDimensionArgs(MetricAlertDynamicCriteriaDimensionArgs $) {
        this.name = $.name;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricAlertDynamicCriteriaDimensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricAlertDynamicCriteriaDimensionArgs $;

        public Builder() {
            $ = new MetricAlertDynamicCriteriaDimensionArgs();
        }

        public Builder(MetricAlertDynamicCriteriaDimensionArgs defaults) {
            $ = new MetricAlertDynamicCriteriaDimensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name One of the dimension names.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name One of the dimension names.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param operator The dimension operator. Possible values are `Include`, `Exclude` and `StartsWith`.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The dimension operator. Possible values are `Include`, `Exclude` and `StartsWith`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values The list of dimension values.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The list of dimension values.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The list of dimension values.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public MetricAlertDynamicCriteriaDimensionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
