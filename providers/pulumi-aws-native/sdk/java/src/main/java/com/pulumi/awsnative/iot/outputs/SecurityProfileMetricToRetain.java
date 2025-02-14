// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.awsnative.iot.outputs.SecurityProfileMetricDimension;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityProfileMetricToRetain {
    /**
     * @return What is measured by the behavior.
     * 
     */
    private final String metric;
    private final @Nullable SecurityProfileMetricDimension metricDimension;

    @CustomType.Constructor
    private SecurityProfileMetricToRetain(
        @CustomType.Parameter("metric") String metric,
        @CustomType.Parameter("metricDimension") @Nullable SecurityProfileMetricDimension metricDimension) {
        this.metric = metric;
        this.metricDimension = metricDimension;
    }

    /**
     * @return What is measured by the behavior.
     * 
     */
    public String metric() {
        return this.metric;
    }
    public Optional<SecurityProfileMetricDimension> metricDimension() {
        return Optional.ofNullable(this.metricDimension);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMetricToRetain defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metric;
        private @Nullable SecurityProfileMetricDimension metricDimension;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMetricToRetain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.metricDimension = defaults.metricDimension;
        }

        public Builder metric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        public Builder metricDimension(@Nullable SecurityProfileMetricDimension metricDimension) {
            this.metricDimension = metricDimension;
            return this;
        }        public SecurityProfileMetricToRetain build() {
            return new SecurityProfileMetricToRetain(metric, metricDimension);
        }
    }
}
