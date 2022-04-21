// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
 * 
 */
public final class ExternalMetricStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalMetricStatusArgs Empty = new ExternalMetricStatusArgs();

    /**
     * currentAverageValue is the current value of metric averaged over autoscaled pods.
     * 
     */
    @Import(name="currentAverageValue")
    private @Nullable Output<String> currentAverageValue;

    public Optional<Output<String>> currentAverageValue() {
        return Optional.ofNullable(this.currentAverageValue);
    }

    /**
     * currentValue is the current value of the metric (as a quantity)
     * 
     */
    @Import(name="currentValue", required=true)
    private Output<String> currentValue;

    public Output<String> currentValue() {
        return this.currentValue;
    }

    /**
     * metricName is the name of a metric used for autoscaling in metric system.
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * metricSelector is used to identify a specific time series within a given metric.
     * 
     */
    @Import(name="metricSelector")
    private @Nullable Output<LabelSelectorArgs> metricSelector;

    public Optional<Output<LabelSelectorArgs>> metricSelector() {
        return Optional.ofNullable(this.metricSelector);
    }

    private ExternalMetricStatusArgs() {}

    private ExternalMetricStatusArgs(ExternalMetricStatusArgs $) {
        this.currentAverageValue = $.currentAverageValue;
        this.currentValue = $.currentValue;
        this.metricName = $.metricName;
        this.metricSelector = $.metricSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalMetricStatusArgs $;

        public Builder() {
            $ = new ExternalMetricStatusArgs();
        }

        public Builder(ExternalMetricStatusArgs defaults) {
            $ = new ExternalMetricStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder currentAverageValue(@Nullable Output<String> currentAverageValue) {
            $.currentAverageValue = currentAverageValue;
            return this;
        }

        public Builder currentAverageValue(String currentAverageValue) {
            return currentAverageValue(Output.of(currentAverageValue));
        }

        public Builder currentValue(Output<String> currentValue) {
            $.currentValue = currentValue;
            return this;
        }

        public Builder currentValue(String currentValue) {
            return currentValue(Output.of(currentValue));
        }

        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public Builder metricSelector(@Nullable Output<LabelSelectorArgs> metricSelector) {
            $.metricSelector = metricSelector;
            return this;
        }

        public Builder metricSelector(LabelSelectorArgs metricSelector) {
            return metricSelector(Output.of(metricSelector));
        }

        public ExternalMetricStatusArgs build() {
            $.currentValue = Objects.requireNonNull($.currentValue, "expected parameter 'currentValue' to be non-null");
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            return $;
        }
    }

}
