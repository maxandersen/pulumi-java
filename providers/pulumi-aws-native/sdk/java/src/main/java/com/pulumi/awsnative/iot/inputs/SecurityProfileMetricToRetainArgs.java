// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.awsnative.iot.inputs.SecurityProfileMetricDimensionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The metric you want to retain. Dimensions are optional.
 * 
 */
public final class SecurityProfileMetricToRetainArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityProfileMetricToRetainArgs Empty = new SecurityProfileMetricToRetainArgs();

    /**
     * What is measured by the behavior.
     * 
     */
    @Import(name="metric", required=true)
    private Output<String> metric;

    public Output<String> metric() {
        return this.metric;
    }

    @Import(name="metricDimension")
    private @Nullable Output<SecurityProfileMetricDimensionArgs> metricDimension;

    public Optional<Output<SecurityProfileMetricDimensionArgs>> metricDimension() {
        return Optional.ofNullable(this.metricDimension);
    }

    private SecurityProfileMetricToRetainArgs() {}

    private SecurityProfileMetricToRetainArgs(SecurityProfileMetricToRetainArgs $) {
        this.metric = $.metric;
        this.metricDimension = $.metricDimension;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityProfileMetricToRetainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityProfileMetricToRetainArgs $;

        public Builder() {
            $ = new SecurityProfileMetricToRetainArgs();
        }

        public Builder(SecurityProfileMetricToRetainArgs defaults) {
            $ = new SecurityProfileMetricToRetainArgs(Objects.requireNonNull(defaults));
        }

        public Builder metric(Output<String> metric) {
            $.metric = metric;
            return this;
        }

        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        public Builder metricDimension(@Nullable Output<SecurityProfileMetricDimensionArgs> metricDimension) {
            $.metricDimension = metricDimension;
            return this;
        }

        public Builder metricDimension(SecurityProfileMetricDimensionArgs metricDimension) {
            return metricDimension(Output.of(metricDimension));
        }

        public SecurityProfileMetricToRetainArgs build() {
            $.metric = Objects.requireNonNull($.metric, "expected parameter 'metric' to be non-null");
            return $;
        }
    }

}
