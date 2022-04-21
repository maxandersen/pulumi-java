// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscalingplans.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs Empty = new ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs();

    /**
     * The dimensions of the metric.
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<Map<String,String>> dimensions;

    public Optional<Output<Map<String,String>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * The name of the metric.
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * The namespace of the metric.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * The statistic of the metric. Currently, the value must always be `Sum`.
     * 
     */
    @Import(name="statistic", required=true)
    private Output<String> statistic;

    public Output<String> statistic() {
        return this.statistic;
    }

    /**
     * The unit of the metric.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    private ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs() {}

    private ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs(ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs $) {
        this.dimensions = $.dimensions;
        this.metricName = $.metricName;
        this.namespace = $.namespace;
        this.statistic = $.statistic;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs $;

        public Builder() {
            $ = new ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs();
        }

        public Builder(ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs defaults) {
            $ = new ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder dimensions(@Nullable Output<Map<String,String>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(Map<String,String> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder statistic(Output<String> statistic) {
            $.statistic = statistic;
            return this;
        }

        public Builder statistic(String statistic) {
            return statistic(Output.of(statistic));
        }

        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationGetArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            $.statistic = Objects.requireNonNull($.statistic, "expected parameter 'statistic' to be non-null");
            return $;
        }
    }

}
