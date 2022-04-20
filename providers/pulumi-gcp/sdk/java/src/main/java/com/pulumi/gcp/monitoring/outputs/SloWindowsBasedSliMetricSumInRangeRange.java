// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SloWindowsBasedSliMetricSumInRangeRange {
    /**
     * max value for the range (inclusive). If not given,
     * will be set to &#34;infinity&#34;, defining an open range
     * &#34;&gt;= range.min&#34;
     * 
     */
    private final @Nullable Double max;
    /**
     * Min value for the range (inclusive). If not given,
     * will be set to &#34;-infinity&#34;, defining an open range
     * &#34;&lt; range.max&#34;
     * 
     */
    private final @Nullable Double min;

    @CustomType.Constructor
    private SloWindowsBasedSliMetricSumInRangeRange(
        @CustomType.Parameter("max") @Nullable Double max,
        @CustomType.Parameter("min") @Nullable Double min) {
        this.max = max;
        this.min = min;
    }

    /**
     * max value for the range (inclusive). If not given,
     * will be set to &#34;infinity&#34;, defining an open range
     * &#34;&gt;= range.min&#34;
     * 
    */
    public Optional<Double> max() {
        return Optional.ofNullable(this.max);
    }
    /**
     * Min value for the range (inclusive). If not given,
     * will be set to &#34;-infinity&#34;, defining an open range
     * &#34;&lt; range.max&#34;
     * 
    */
    public Optional<Double> min() {
        return Optional.ofNullable(this.min);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliMetricSumInRangeRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double max;
        private @Nullable Double min;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliMetricSumInRangeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(@Nullable Double max) {
            this.max = max;
            return this;
        }
        public Builder min(@Nullable Double min) {
            this.min = min;
            return this;
        }        public SloWindowsBasedSliMetricSumInRangeRange build() {
            return new SloWindowsBasedSliMetricSumInRangeRange(max, min);
        }
    }
}
