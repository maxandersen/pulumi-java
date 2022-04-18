// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring_v1.outputs.GaugeViewResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.SparkChartViewResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.ThresholdResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.TimeSeriesQueryResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ScorecardResponse {
    /**
     * Will cause the scorecard to show a gauge chart.
     * 
     */
    private final GaugeViewResponse gaugeView;
    /**
     * Will cause the scorecard to show a spark chart.
     * 
     */
    private final SparkChartViewResponse sparkChartView;
    /**
     * The thresholds used to determine the state of the scorecard given the time series' current value. For an actual value x, the scorecard is in a danger state if x is less than or equal to a danger threshold that triggers below, or greater than or equal to a danger threshold that triggers above. Similarly, if x is above/below a warning threshold that triggers above/below, then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger trumps warning.)As an example, consider a scorecard with the following four thresholds: { value: 90, category: 'DANGER', trigger: 'ABOVE', }, { value: 70, category: 'WARNING', trigger: 'ABOVE', }, { value: 10, category: 'DANGER', trigger: 'BELOW', }, { value: 20, category: 'WARNING', trigger: 'BELOW', }Then: values less than or equal to 10 would put the scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
     * 
     */
    private final List<ThresholdResponse> thresholds;
    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
     */
    private final TimeSeriesQueryResponse timeSeriesQuery;

    @CustomType.Constructor
    private ScorecardResponse(
        @CustomType.Parameter("gaugeView") GaugeViewResponse gaugeView,
        @CustomType.Parameter("sparkChartView") SparkChartViewResponse sparkChartView,
        @CustomType.Parameter("thresholds") List<ThresholdResponse> thresholds,
        @CustomType.Parameter("timeSeriesQuery") TimeSeriesQueryResponse timeSeriesQuery) {
        this.gaugeView = gaugeView;
        this.sparkChartView = sparkChartView;
        this.thresholds = thresholds;
        this.timeSeriesQuery = timeSeriesQuery;
    }

    /**
     * Will cause the scorecard to show a gauge chart.
     * 
    */
    public GaugeViewResponse gaugeView() {
        return this.gaugeView;
    }
    /**
     * Will cause the scorecard to show a spark chart.
     * 
    */
    public SparkChartViewResponse sparkChartView() {
        return this.sparkChartView;
    }
    /**
     * The thresholds used to determine the state of the scorecard given the time series' current value. For an actual value x, the scorecard is in a danger state if x is less than or equal to a danger threshold that triggers below, or greater than or equal to a danger threshold that triggers above. Similarly, if x is above/below a warning threshold that triggers above/below, then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger trumps warning.)As an example, consider a scorecard with the following four thresholds: { value: 90, category: 'DANGER', trigger: 'ABOVE', }, { value: 70, category: 'WARNING', trigger: 'ABOVE', }, { value: 10, category: 'DANGER', trigger: 'BELOW', }, { value: 20, category: 'WARNING', trigger: 'BELOW', }Then: values less than or equal to 10 would put the scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
     * 
    */
    public List<ThresholdResponse> thresholds() {
        return this.thresholds;
    }
    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
    */
    public TimeSeriesQueryResponse timeSeriesQuery() {
        return this.timeSeriesQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScorecardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GaugeViewResponse gaugeView;
        private SparkChartViewResponse sparkChartView;
        private List<ThresholdResponse> thresholds;
        private TimeSeriesQueryResponse timeSeriesQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(ScorecardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gaugeView = defaults.gaugeView;
    	      this.sparkChartView = defaults.sparkChartView;
    	      this.thresholds = defaults.thresholds;
    	      this.timeSeriesQuery = defaults.timeSeriesQuery;
        }

        public Builder gaugeView(GaugeViewResponse gaugeView) {
            this.gaugeView = Objects.requireNonNull(gaugeView);
            return this;
        }
        public Builder sparkChartView(SparkChartViewResponse sparkChartView) {
            this.sparkChartView = Objects.requireNonNull(sparkChartView);
            return this;
        }
        public Builder thresholds(List<ThresholdResponse> thresholds) {
            this.thresholds = Objects.requireNonNull(thresholds);
            return this;
        }
        public Builder thresholds(ThresholdResponse... thresholds) {
            return thresholds(List.of(thresholds));
        }
        public Builder timeSeriesQuery(TimeSeriesQueryResponse timeSeriesQuery) {
            this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery);
            return this;
        }        public ScorecardResponse build() {
            return new ScorecardResponse(gaugeView, sparkChartView, thresholds, timeSeriesQuery);
        }
    }
}
