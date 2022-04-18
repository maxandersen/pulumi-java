// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesQueryResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Groups a time series query definition with charting options.
 * 
 */
public final class DataSetResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataSetResponse Empty = new DataSetResponse();

    /**
     * A template string for naming TimeSeries in the resulting data set. This should be a string with interpolations of the form ${label_name}, which will resolve to the label's value.
     * 
     */
    @Import(name="legendTemplate", required=true)
      private final String legendTemplate;

    public String legendTemplate() {
        return this.legendTemplate;
    }

    /**
     * Optional. The lower bound on data point frequency for this data set, implemented by specifying the minimum alignment period to use in a time series query For example, if the data is published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It would not make sense to fetch and align data at one minute intervals.
     * 
     */
    @Import(name="minAlignmentPeriod", required=true)
      private final String minAlignmentPeriod;

    public String minAlignmentPeriod() {
        return this.minAlignmentPeriod;
    }

    /**
     * How this data should be plotted on the chart.
     * 
     */
    @Import(name="plotType", required=true)
      private final String plotType;

    public String plotType() {
        return this.plotType;
    }

    /**
     * Optional. The target axis to use for plotting the metric.
     * 
     */
    @Import(name="targetAxis", required=true)
      private final String targetAxis;

    public String targetAxis() {
        return this.targetAxis;
    }

    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
     */
    @Import(name="timeSeriesQuery", required=true)
      private final TimeSeriesQueryResponse timeSeriesQuery;

    public TimeSeriesQueryResponse timeSeriesQuery() {
        return this.timeSeriesQuery;
    }

    public DataSetResponse(
        String legendTemplate,
        String minAlignmentPeriod,
        String plotType,
        String targetAxis,
        TimeSeriesQueryResponse timeSeriesQuery) {
        this.legendTemplate = Objects.requireNonNull(legendTemplate, "expected parameter 'legendTemplate' to be non-null");
        this.minAlignmentPeriod = Objects.requireNonNull(minAlignmentPeriod, "expected parameter 'minAlignmentPeriod' to be non-null");
        this.plotType = Objects.requireNonNull(plotType, "expected parameter 'plotType' to be non-null");
        this.targetAxis = Objects.requireNonNull(targetAxis, "expected parameter 'targetAxis' to be non-null");
        this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery, "expected parameter 'timeSeriesQuery' to be non-null");
    }

    private DataSetResponse() {
        this.legendTemplate = null;
        this.minAlignmentPeriod = null;
        this.plotType = null;
        this.targetAxis = null;
        this.timeSeriesQuery = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String legendTemplate;
        private String minAlignmentPeriod;
        private String plotType;
        private String targetAxis;
        private TimeSeriesQueryResponse timeSeriesQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.legendTemplate = defaults.legendTemplate;
    	      this.minAlignmentPeriod = defaults.minAlignmentPeriod;
    	      this.plotType = defaults.plotType;
    	      this.targetAxis = defaults.targetAxis;
    	      this.timeSeriesQuery = defaults.timeSeriesQuery;
        }

        public Builder legendTemplate(String legendTemplate) {
            this.legendTemplate = Objects.requireNonNull(legendTemplate);
            return this;
        }
        public Builder minAlignmentPeriod(String minAlignmentPeriod) {
            this.minAlignmentPeriod = Objects.requireNonNull(minAlignmentPeriod);
            return this;
        }
        public Builder plotType(String plotType) {
            this.plotType = Objects.requireNonNull(plotType);
            return this;
        }
        public Builder targetAxis(String targetAxis) {
            this.targetAxis = Objects.requireNonNull(targetAxis);
            return this;
        }
        public Builder timeSeriesQuery(TimeSeriesQueryResponse timeSeriesQuery) {
            this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery);
            return this;
        }        public DataSetResponse build() {
            return new DataSetResponse(legendTemplate, minAlignmentPeriod, plotType, targetAxis, timeSeriesQuery);
        }
    }
}
