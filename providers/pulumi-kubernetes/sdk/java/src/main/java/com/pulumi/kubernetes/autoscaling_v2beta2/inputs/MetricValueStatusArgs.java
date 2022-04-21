// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MetricValueStatus holds the current value for a metric
 * 
 */
public final class MetricValueStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricValueStatusArgs Empty = new MetricValueStatusArgs();

    /**
     * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
     */
    @Import(name="averageUtilization")
    private @Nullable Output<Integer> averageUtilization;

    public Optional<Output<Integer>> averageUtilization() {
        return Optional.ofNullable(this.averageUtilization);
    }

    /**
     * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    @Import(name="averageValue")
    private @Nullable Output<String> averageValue;

    public Optional<Output<String>> averageValue() {
        return Optional.ofNullable(this.averageValue);
    }

    /**
     * value is the current value of the metric (as a quantity).
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private MetricValueStatusArgs() {}

    private MetricValueStatusArgs(MetricValueStatusArgs $) {
        this.averageUtilization = $.averageUtilization;
        this.averageValue = $.averageValue;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricValueStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricValueStatusArgs $;

        public Builder() {
            $ = new MetricValueStatusArgs();
        }

        public Builder(MetricValueStatusArgs defaults) {
            $ = new MetricValueStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder averageUtilization(@Nullable Output<Integer> averageUtilization) {
            $.averageUtilization = averageUtilization;
            return this;
        }

        public Builder averageUtilization(Integer averageUtilization) {
            return averageUtilization(Output.of(averageUtilization));
        }

        public Builder averageValue(@Nullable Output<String> averageValue) {
            $.averageValue = averageValue;
            return this;
        }

        public Builder averageValue(String averageValue) {
            return averageValue(Output.of(averageValue));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public MetricValueStatusArgs build() {
            return $;
        }
    }

}
