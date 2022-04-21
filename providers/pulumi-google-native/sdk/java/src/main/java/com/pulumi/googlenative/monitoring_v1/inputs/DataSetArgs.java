// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v1.enums.DataSetPlotType;
import com.pulumi.googlenative.monitoring_v1.enums.DataSetTargetAxis;
import com.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesQueryArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Groups a time series query definition with charting options.
 * 
 */
public final class DataSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSetArgs Empty = new DataSetArgs();

    /**
     * A template string for naming TimeSeries in the resulting data set. This should be a string with interpolations of the form ${label_name}, which will resolve to the label&#39;s value.
     * 
     */
    @Import(name="legendTemplate")
    private @Nullable Output<String> legendTemplate;

    public Optional<Output<String>> legendTemplate() {
        return Optional.ofNullable(this.legendTemplate);
    }

    /**
     * Optional. The lower bound on data point frequency for this data set, implemented by specifying the minimum alignment period to use in a time series query For example, if the data is published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It would not make sense to fetch and align data at one minute intervals.
     * 
     */
    @Import(name="minAlignmentPeriod")
    private @Nullable Output<String> minAlignmentPeriod;

    public Optional<Output<String>> minAlignmentPeriod() {
        return Optional.ofNullable(this.minAlignmentPeriod);
    }

    /**
     * How this data should be plotted on the chart.
     * 
     */
    @Import(name="plotType")
    private @Nullable Output<DataSetPlotType> plotType;

    public Optional<Output<DataSetPlotType>> plotType() {
        return Optional.ofNullable(this.plotType);
    }

    /**
     * Optional. The target axis to use for plotting the metric.
     * 
     */
    @Import(name="targetAxis")
    private @Nullable Output<DataSetTargetAxis> targetAxis;

    public Optional<Output<DataSetTargetAxis>> targetAxis() {
        return Optional.ofNullable(this.targetAxis);
    }

    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
     */
    @Import(name="timeSeriesQuery", required=true)
    private Output<TimeSeriesQueryArgs> timeSeriesQuery;

    public Output<TimeSeriesQueryArgs> timeSeriesQuery() {
        return this.timeSeriesQuery;
    }

    private DataSetArgs() {}

    private DataSetArgs(DataSetArgs $) {
        this.legendTemplate = $.legendTemplate;
        this.minAlignmentPeriod = $.minAlignmentPeriod;
        this.plotType = $.plotType;
        this.targetAxis = $.targetAxis;
        this.timeSeriesQuery = $.timeSeriesQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSetArgs $;

        public Builder() {
            $ = new DataSetArgs();
        }

        public Builder(DataSetArgs defaults) {
            $ = new DataSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder legendTemplate(@Nullable Output<String> legendTemplate) {
            $.legendTemplate = legendTemplate;
            return this;
        }

        public Builder legendTemplate(String legendTemplate) {
            return legendTemplate(Output.of(legendTemplate));
        }

        public Builder minAlignmentPeriod(@Nullable Output<String> minAlignmentPeriod) {
            $.minAlignmentPeriod = minAlignmentPeriod;
            return this;
        }

        public Builder minAlignmentPeriod(String minAlignmentPeriod) {
            return minAlignmentPeriod(Output.of(minAlignmentPeriod));
        }

        public Builder plotType(@Nullable Output<DataSetPlotType> plotType) {
            $.plotType = plotType;
            return this;
        }

        public Builder plotType(DataSetPlotType plotType) {
            return plotType(Output.of(plotType));
        }

        public Builder targetAxis(@Nullable Output<DataSetTargetAxis> targetAxis) {
            $.targetAxis = targetAxis;
            return this;
        }

        public Builder targetAxis(DataSetTargetAxis targetAxis) {
            return targetAxis(Output.of(targetAxis));
        }

        public Builder timeSeriesQuery(Output<TimeSeriesQueryArgs> timeSeriesQuery) {
            $.timeSeriesQuery = timeSeriesQuery;
            return this;
        }

        public Builder timeSeriesQuery(TimeSeriesQueryArgs timeSeriesQuery) {
            return timeSeriesQuery(Output.of(timeSeriesQuery));
        }

        public DataSetArgs build() {
            $.timeSeriesQuery = Objects.requireNonNull($.timeSeriesQuery, "expected parameter 'timeSeriesQuery' to be non-null");
            return $;
        }
    }

}
