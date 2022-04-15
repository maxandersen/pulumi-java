// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesFilterArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesFilterRatioArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TimeSeriesQuery collects the set of supported methods for querying time series data from the Stackdriver metrics API.
 * 
 */
public final class TimeSeriesQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeSeriesQueryArgs Empty = new TimeSeriesQueryArgs();

    /**
     * Filter parameters to fetch time series.
     * 
     */
    @Import(name="timeSeriesFilter")
      private final @Nullable Output<TimeSeriesFilterArgs> timeSeriesFilter;

    public Output<TimeSeriesFilterArgs> timeSeriesFilter() {
        return this.timeSeriesFilter == null ? Codegen.empty() : this.timeSeriesFilter;
    }

    /**
     * Parameters to fetch a ratio between two time series filters.
     * 
     */
    @Import(name="timeSeriesFilterRatio")
      private final @Nullable Output<TimeSeriesFilterRatioArgs> timeSeriesFilterRatio;

    public Output<TimeSeriesFilterRatioArgs> timeSeriesFilterRatio() {
        return this.timeSeriesFilterRatio == null ? Codegen.empty() : this.timeSeriesFilterRatio;
    }

    /**
     * A query used to fetch time series.
     * 
     */
    @Import(name="timeSeriesQueryLanguage")
      private final @Nullable Output<String> timeSeriesQueryLanguage;

    public Output<String> timeSeriesQueryLanguage() {
        return this.timeSeriesQueryLanguage == null ? Codegen.empty() : this.timeSeriesQueryLanguage;
    }

    /**
     * The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
     * 
     */
    @Import(name="unitOverride")
      private final @Nullable Output<String> unitOverride;

    public Output<String> unitOverride() {
        return this.unitOverride == null ? Codegen.empty() : this.unitOverride;
    }

    public TimeSeriesQueryArgs(
        @Nullable Output<TimeSeriesFilterArgs> timeSeriesFilter,
        @Nullable Output<TimeSeriesFilterRatioArgs> timeSeriesFilterRatio,
        @Nullable Output<String> timeSeriesQueryLanguage,
        @Nullable Output<String> unitOverride) {
        this.timeSeriesFilter = timeSeriesFilter;
        this.timeSeriesFilterRatio = timeSeriesFilterRatio;
        this.timeSeriesQueryLanguage = timeSeriesQueryLanguage;
        this.unitOverride = unitOverride;
    }

    private TimeSeriesQueryArgs() {
        this.timeSeriesFilter = Codegen.empty();
        this.timeSeriesFilterRatio = Codegen.empty();
        this.timeSeriesQueryLanguage = Codegen.empty();
        this.unitOverride = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TimeSeriesFilterArgs> timeSeriesFilter;
        private @Nullable Output<TimeSeriesFilterRatioArgs> timeSeriesFilterRatio;
        private @Nullable Output<String> timeSeriesQueryLanguage;
        private @Nullable Output<String> unitOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSeriesQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeSeriesFilter = defaults.timeSeriesFilter;
    	      this.timeSeriesFilterRatio = defaults.timeSeriesFilterRatio;
    	      this.timeSeriesQueryLanguage = defaults.timeSeriesQueryLanguage;
    	      this.unitOverride = defaults.unitOverride;
        }

        public Builder timeSeriesFilter(@Nullable Output<TimeSeriesFilterArgs> timeSeriesFilter) {
            this.timeSeriesFilter = timeSeriesFilter;
            return this;
        }
        public Builder timeSeriesFilter(@Nullable TimeSeriesFilterArgs timeSeriesFilter) {
            this.timeSeriesFilter = Codegen.ofNullable(timeSeriesFilter);
            return this;
        }
        public Builder timeSeriesFilterRatio(@Nullable Output<TimeSeriesFilterRatioArgs> timeSeriesFilterRatio) {
            this.timeSeriesFilterRatio = timeSeriesFilterRatio;
            return this;
        }
        public Builder timeSeriesFilterRatio(@Nullable TimeSeriesFilterRatioArgs timeSeriesFilterRatio) {
            this.timeSeriesFilterRatio = Codegen.ofNullable(timeSeriesFilterRatio);
            return this;
        }
        public Builder timeSeriesQueryLanguage(@Nullable Output<String> timeSeriesQueryLanguage) {
            this.timeSeriesQueryLanguage = timeSeriesQueryLanguage;
            return this;
        }
        public Builder timeSeriesQueryLanguage(@Nullable String timeSeriesQueryLanguage) {
            this.timeSeriesQueryLanguage = Codegen.ofNullable(timeSeriesQueryLanguage);
            return this;
        }
        public Builder unitOverride(@Nullable Output<String> unitOverride) {
            this.unitOverride = unitOverride;
            return this;
        }
        public Builder unitOverride(@Nullable String unitOverride) {
            this.unitOverride = Codegen.ofNullable(unitOverride);
            return this;
        }        public TimeSeriesQueryArgs build() {
            return new TimeSeriesQueryArgs(timeSeriesFilter, timeSeriesFilterRatio, timeSeriesQueryLanguage, unitOverride);
        }
    }
}
