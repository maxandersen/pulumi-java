// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricMeanInRangeRangeArgs;
import java.lang.String;
import java.util.Objects;


public final class SloWindowsBasedSliMetricMeanInRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliMetricMeanInRangeArgs Empty = new SloWindowsBasedSliMetricMeanInRangeArgs();

    /**
     * Range of numerical values. The computed good_service
     * will be the count of values x in the Distribution such
     * that range.min &lt;= x &lt;= range.max. inclusive of min and
     * max. Open ranges can be defined by setting
     * just one of min or max. Summed value `X` should satisfy
     * `range.min &lt;= X &lt;= range.max` for a good window.
     * Structure is documented below.
     * 
     */
    @Import(name="range", required=true)
      private final Output<SloWindowsBasedSliMetricMeanInRangeRangeArgs> range;

    public Output<SloWindowsBasedSliMetricMeanInRangeRangeArgs> range() {
        return this.range;
    }

    /**
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying the TimeSeries to use for evaluating window
     * quality. The provided TimeSeries must have
     * ValueType = INT64 or ValueType = DOUBLE and
     * MetricKind = GAUGE.
     * Summed value `X` should satisfy
     * `range.min &lt;= X &lt;= range.max` for a good window.
     * 
     */
    @Import(name="timeSeries", required=true)
      private final Output<String> timeSeries;

    public Output<String> timeSeries() {
        return this.timeSeries;
    }

    public SloWindowsBasedSliMetricMeanInRangeArgs(
        Output<SloWindowsBasedSliMetricMeanInRangeRangeArgs> range,
        Output<String> timeSeries) {
        this.range = Objects.requireNonNull(range, "expected parameter 'range' to be non-null");
        this.timeSeries = Objects.requireNonNull(timeSeries, "expected parameter 'timeSeries' to be non-null");
    }

    private SloWindowsBasedSliMetricMeanInRangeArgs() {
        this.range = Codegen.empty();
        this.timeSeries = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliMetricMeanInRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SloWindowsBasedSliMetricMeanInRangeRangeArgs> range;
        private Output<String> timeSeries;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliMetricMeanInRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.timeSeries = defaults.timeSeries;
        }

        public Builder range(Output<SloWindowsBasedSliMetricMeanInRangeRangeArgs> range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        public Builder range(SloWindowsBasedSliMetricMeanInRangeRangeArgs range) {
            this.range = Output.of(Objects.requireNonNull(range));
            return this;
        }
        public Builder timeSeries(Output<String> timeSeries) {
            this.timeSeries = Objects.requireNonNull(timeSeries);
            return this;
        }
        public Builder timeSeries(String timeSeries) {
            this.timeSeries = Output.of(Objects.requireNonNull(timeSeries));
            return this;
        }        public SloWindowsBasedSliMetricMeanInRangeArgs build() {
            return new SloWindowsBasedSliMetricMeanInRangeArgs(range, timeSeries);
        }
    }
}
