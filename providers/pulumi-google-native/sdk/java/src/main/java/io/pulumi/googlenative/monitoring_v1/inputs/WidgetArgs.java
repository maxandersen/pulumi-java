// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v1.inputs.AlertChartArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.EmptyArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.LogsPanelArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.ScorecardArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.TextArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesTableArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.XyChartArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Widget contains a single dashboard component and configuration of how to present the component in the dashboard.
 * 
 */
public final class WidgetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WidgetArgs Empty = new WidgetArgs();

    /**
     * A chart of alert policy data.
     * 
     */
    @Import(name="alertChart")
      private final @Nullable Output<AlertChartArgs> alertChart;

    public Output<AlertChartArgs> alertChart() {
        return this.alertChart == null ? Codegen.empty() : this.alertChart;
    }

    /**
     * A blank space.
     * 
     */
    @Import(name="blank")
      private final @Nullable Output<EmptyArgs> blank;

    public Output<EmptyArgs> blank() {
        return this.blank == null ? Codegen.empty() : this.blank;
    }

    /**
     * A widget that shows a stream of logs.
     * 
     */
    @Import(name="logsPanel")
      private final @Nullable Output<LogsPanelArgs> logsPanel;

    public Output<LogsPanelArgs> logsPanel() {
        return this.logsPanel == null ? Codegen.empty() : this.logsPanel;
    }

    /**
     * A scorecard summarizing time series data.
     * 
     */
    @Import(name="scorecard")
      private final @Nullable Output<ScorecardArgs> scorecard;

    public Output<ScorecardArgs> scorecard() {
        return this.scorecard == null ? Codegen.empty() : this.scorecard;
    }

    /**
     * A raw string or markdown displaying textual content.
     * 
     */
    @Import(name="text")
      private final @Nullable Output<TextArgs> text;

    public Output<TextArgs> text() {
        return this.text == null ? Codegen.empty() : this.text;
    }

    /**
     * A widget that displays time series data in a tabular format.
     * 
     */
    @Import(name="timeSeriesTable")
      private final @Nullable Output<TimeSeriesTableArgs> timeSeriesTable;

    public Output<TimeSeriesTableArgs> timeSeriesTable() {
        return this.timeSeriesTable == null ? Codegen.empty() : this.timeSeriesTable;
    }

    /**
     * Optional. The title of the widget.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> title() {
        return this.title == null ? Codegen.empty() : this.title;
    }

    /**
     * A chart of time series data.
     * 
     */
    @Import(name="xyChart")
      private final @Nullable Output<XyChartArgs> xyChart;

    public Output<XyChartArgs> xyChart() {
        return this.xyChart == null ? Codegen.empty() : this.xyChart;
    }

    public WidgetArgs(
        @Nullable Output<AlertChartArgs> alertChart,
        @Nullable Output<EmptyArgs> blank,
        @Nullable Output<LogsPanelArgs> logsPanel,
        @Nullable Output<ScorecardArgs> scorecard,
        @Nullable Output<TextArgs> text,
        @Nullable Output<TimeSeriesTableArgs> timeSeriesTable,
        @Nullable Output<String> title,
        @Nullable Output<XyChartArgs> xyChart) {
        this.alertChart = alertChart;
        this.blank = blank;
        this.logsPanel = logsPanel;
        this.scorecard = scorecard;
        this.text = text;
        this.timeSeriesTable = timeSeriesTable;
        this.title = title;
        this.xyChart = xyChart;
    }

    private WidgetArgs() {
        this.alertChart = Codegen.empty();
        this.blank = Codegen.empty();
        this.logsPanel = Codegen.empty();
        this.scorecard = Codegen.empty();
        this.text = Codegen.empty();
        this.timeSeriesTable = Codegen.empty();
        this.title = Codegen.empty();
        this.xyChart = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WidgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AlertChartArgs> alertChart;
        private @Nullable Output<EmptyArgs> blank;
        private @Nullable Output<LogsPanelArgs> logsPanel;
        private @Nullable Output<ScorecardArgs> scorecard;
        private @Nullable Output<TextArgs> text;
        private @Nullable Output<TimeSeriesTableArgs> timeSeriesTable;
        private @Nullable Output<String> title;
        private @Nullable Output<XyChartArgs> xyChart;

        public Builder() {
    	      // Empty
        }

        public Builder(WidgetArgs defaults) {
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

        public Builder alertChart(@Nullable Output<AlertChartArgs> alertChart) {
            this.alertChart = alertChart;
            return this;
        }
        public Builder alertChart(@Nullable AlertChartArgs alertChart) {
            this.alertChart = Codegen.ofNullable(alertChart);
            return this;
        }
        public Builder blank(@Nullable Output<EmptyArgs> blank) {
            this.blank = blank;
            return this;
        }
        public Builder blank(@Nullable EmptyArgs blank) {
            this.blank = Codegen.ofNullable(blank);
            return this;
        }
        public Builder logsPanel(@Nullable Output<LogsPanelArgs> logsPanel) {
            this.logsPanel = logsPanel;
            return this;
        }
        public Builder logsPanel(@Nullable LogsPanelArgs logsPanel) {
            this.logsPanel = Codegen.ofNullable(logsPanel);
            return this;
        }
        public Builder scorecard(@Nullable Output<ScorecardArgs> scorecard) {
            this.scorecard = scorecard;
            return this;
        }
        public Builder scorecard(@Nullable ScorecardArgs scorecard) {
            this.scorecard = Codegen.ofNullable(scorecard);
            return this;
        }
        public Builder text(@Nullable Output<TextArgs> text) {
            this.text = text;
            return this;
        }
        public Builder text(@Nullable TextArgs text) {
            this.text = Codegen.ofNullable(text);
            return this;
        }
        public Builder timeSeriesTable(@Nullable Output<TimeSeriesTableArgs> timeSeriesTable) {
            this.timeSeriesTable = timeSeriesTable;
            return this;
        }
        public Builder timeSeriesTable(@Nullable TimeSeriesTableArgs timeSeriesTable) {
            this.timeSeriesTable = Codegen.ofNullable(timeSeriesTable);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Codegen.ofNullable(title);
            return this;
        }
        public Builder xyChart(@Nullable Output<XyChartArgs> xyChart) {
            this.xyChart = xyChart;
            return this;
        }
        public Builder xyChart(@Nullable XyChartArgs xyChart) {
            this.xyChart = Codegen.ofNullable(xyChart);
            return this;
        }        public WidgetArgs build() {
            return new WidgetArgs(alertChart, blank, logsPanel, scorecard, text, timeSeriesTable, title, xyChart);
        }
    }
}
