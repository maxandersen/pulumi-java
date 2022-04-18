// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring_v1.outputs.AlertChartResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.EmptyResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.LogsPanelResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.ScorecardResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.TextResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.TimeSeriesTableResponse;
import com.pulumi.googlenative.monitoring_v1.outputs.XyChartResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WidgetResponse {
    /**
     * A chart of alert policy data.
     * 
     */
    private final AlertChartResponse alertChart;
    /**
     * A blank space.
     * 
     */
    private final EmptyResponse blank;
    /**
     * A widget that shows a stream of logs.
     * 
     */
    private final LogsPanelResponse logsPanel;
    /**
     * A scorecard summarizing time series data.
     * 
     */
    private final ScorecardResponse scorecard;
    /**
     * A raw string or markdown displaying textual content.
     * 
     */
    private final TextResponse text;
    /**
     * A widget that displays time series data in a tabular format.
     * 
     */
    private final TimeSeriesTableResponse timeSeriesTable;
    /**
     * Optional. The title of the widget.
     * 
     */
    private final String title;
    /**
     * A chart of time series data.
     * 
     */
    private final XyChartResponse xyChart;

    @CustomType.Constructor
    private WidgetResponse(
        @CustomType.Parameter("alertChart") AlertChartResponse alertChart,
        @CustomType.Parameter("blank") EmptyResponse blank,
        @CustomType.Parameter("logsPanel") LogsPanelResponse logsPanel,
        @CustomType.Parameter("scorecard") ScorecardResponse scorecard,
        @CustomType.Parameter("text") TextResponse text,
        @CustomType.Parameter("timeSeriesTable") TimeSeriesTableResponse timeSeriesTable,
        @CustomType.Parameter("title") String title,
        @CustomType.Parameter("xyChart") XyChartResponse xyChart) {
        this.alertChart = alertChart;
        this.blank = blank;
        this.logsPanel = logsPanel;
        this.scorecard = scorecard;
        this.text = text;
        this.timeSeriesTable = timeSeriesTable;
        this.title = title;
        this.xyChart = xyChart;
    }

    /**
     * A chart of alert policy data.
     * 
    */
    public AlertChartResponse alertChart() {
        return this.alertChart;
    }
    /**
     * A blank space.
     * 
    */
    public EmptyResponse blank() {
        return this.blank;
    }
    /**
     * A widget that shows a stream of logs.
     * 
    */
    public LogsPanelResponse logsPanel() {
        return this.logsPanel;
    }
    /**
     * A scorecard summarizing time series data.
     * 
    */
    public ScorecardResponse scorecard() {
        return this.scorecard;
    }
    /**
     * A raw string or markdown displaying textual content.
     * 
    */
    public TextResponse text() {
        return this.text;
    }
    /**
     * A widget that displays time series data in a tabular format.
     * 
    */
    public TimeSeriesTableResponse timeSeriesTable() {
        return this.timeSeriesTable;
    }
    /**
     * Optional. The title of the widget.
     * 
    */
    public String title() {
        return this.title;
    }
    /**
     * A chart of time series data.
     * 
    */
    public XyChartResponse xyChart() {
        return this.xyChart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WidgetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertChartResponse alertChart;
        private EmptyResponse blank;
        private LogsPanelResponse logsPanel;
        private ScorecardResponse scorecard;
        private TextResponse text;
        private TimeSeriesTableResponse timeSeriesTable;
        private String title;
        private XyChartResponse xyChart;

        public Builder() {
    	      // Empty
        }

        public Builder(WidgetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertChart = defaults.alertChart;
    	      this.blank = defaults.blank;
    	      this.logsPanel = defaults.logsPanel;
    	      this.scorecard = defaults.scorecard;
    	      this.text = defaults.text;
    	      this.timeSeriesTable = defaults.timeSeriesTable;
    	      this.title = defaults.title;
    	      this.xyChart = defaults.xyChart;
        }

        public Builder alertChart(AlertChartResponse alertChart) {
            this.alertChart = Objects.requireNonNull(alertChart);
            return this;
        }
        public Builder blank(EmptyResponse blank) {
            this.blank = Objects.requireNonNull(blank);
            return this;
        }
        public Builder logsPanel(LogsPanelResponse logsPanel) {
            this.logsPanel = Objects.requireNonNull(logsPanel);
            return this;
        }
        public Builder scorecard(ScorecardResponse scorecard) {
            this.scorecard = Objects.requireNonNull(scorecard);
            return this;
        }
        public Builder text(TextResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public Builder timeSeriesTable(TimeSeriesTableResponse timeSeriesTable) {
            this.timeSeriesTable = Objects.requireNonNull(timeSeriesTable);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder xyChart(XyChartResponse xyChart) {
            this.xyChart = Objects.requireNonNull(xyChart);
            return this;
        }        public WidgetResponse build() {
            return new WidgetResponse(alertChart, blank, logsPanel, scorecard, text, timeSeriesTable, title, xyChart);
        }
    }
}
