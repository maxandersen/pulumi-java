// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v1.inputs.TableDisplayOptionsArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesQueryArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Groups a time series query definition with table options.
 * 
 */
public final class TableDataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableDataSetArgs Empty = new TableDataSetArgs();

    /**
     * Optional. The lower bound on data point frequency for this data set, implemented by specifying the minimum alignment period to use in a time series query For example, if the data is published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It would not make sense to fetch and align data at one minute intervals.
     * 
     */
    @Import(name="minAlignmentPeriod")
      private final @Nullable Output<String> minAlignmentPeriod;

    public Output<String> minAlignmentPeriod() {
        return this.minAlignmentPeriod == null ? Codegen.empty() : this.minAlignmentPeriod;
    }

    /**
     * Optional. Table display options for configuring how the table is rendered.
     * 
     */
    @Import(name="tableDisplayOptions")
      private final @Nullable Output<TableDisplayOptionsArgs> tableDisplayOptions;

    public Output<TableDisplayOptionsArgs> tableDisplayOptions() {
        return this.tableDisplayOptions == null ? Codegen.empty() : this.tableDisplayOptions;
    }

    /**
     * Optional. A template string for naming TimeSeries in the resulting data set. This should be a string with interpolations of the form ${label_name}, which will resolve to the label's value i.e. "${resource.labels.project_id}."
     * 
     */
    @Import(name="tableTemplate")
      private final @Nullable Output<String> tableTemplate;

    public Output<String> tableTemplate() {
        return this.tableTemplate == null ? Codegen.empty() : this.tableTemplate;
    }

    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
     */
    @Import(name="timeSeriesQuery", required=true)
      private final Output<TimeSeriesQueryArgs> timeSeriesQuery;

    public Output<TimeSeriesQueryArgs> timeSeriesQuery() {
        return this.timeSeriesQuery;
    }

    public TableDataSetArgs(
        @Nullable Output<String> minAlignmentPeriod,
        @Nullable Output<TableDisplayOptionsArgs> tableDisplayOptions,
        @Nullable Output<String> tableTemplate,
        Output<TimeSeriesQueryArgs> timeSeriesQuery) {
        this.minAlignmentPeriod = minAlignmentPeriod;
        this.tableDisplayOptions = tableDisplayOptions;
        this.tableTemplate = tableTemplate;
        this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery, "expected parameter 'timeSeriesQuery' to be non-null");
    }

    private TableDataSetArgs() {
        this.minAlignmentPeriod = Codegen.empty();
        this.tableDisplayOptions = Codegen.empty();
        this.tableTemplate = Codegen.empty();
        this.timeSeriesQuery = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> minAlignmentPeriod;
        private @Nullable Output<TableDisplayOptionsArgs> tableDisplayOptions;
        private @Nullable Output<String> tableTemplate;
        private Output<TimeSeriesQueryArgs> timeSeriesQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(TableDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minAlignmentPeriod = defaults.minAlignmentPeriod;
    	      this.tableDisplayOptions = defaults.tableDisplayOptions;
    	      this.tableTemplate = defaults.tableTemplate;
    	      this.timeSeriesQuery = defaults.timeSeriesQuery;
        }

        public Builder minAlignmentPeriod(@Nullable Output<String> minAlignmentPeriod) {
            this.minAlignmentPeriod = minAlignmentPeriod;
            return this;
        }
        public Builder minAlignmentPeriod(@Nullable String minAlignmentPeriod) {
            this.minAlignmentPeriod = Codegen.ofNullable(minAlignmentPeriod);
            return this;
        }
        public Builder tableDisplayOptions(@Nullable Output<TableDisplayOptionsArgs> tableDisplayOptions) {
            this.tableDisplayOptions = tableDisplayOptions;
            return this;
        }
        public Builder tableDisplayOptions(@Nullable TableDisplayOptionsArgs tableDisplayOptions) {
            this.tableDisplayOptions = Codegen.ofNullable(tableDisplayOptions);
            return this;
        }
        public Builder tableTemplate(@Nullable Output<String> tableTemplate) {
            this.tableTemplate = tableTemplate;
            return this;
        }
        public Builder tableTemplate(@Nullable String tableTemplate) {
            this.tableTemplate = Codegen.ofNullable(tableTemplate);
            return this;
        }
        public Builder timeSeriesQuery(Output<TimeSeriesQueryArgs> timeSeriesQuery) {
            this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery);
            return this;
        }
        public Builder timeSeriesQuery(TimeSeriesQueryArgs timeSeriesQuery) {
            this.timeSeriesQuery = Output.of(Objects.requireNonNull(timeSeriesQuery));
            return this;
        }        public TableDataSetArgs build() {
            return new TableDataSetArgs(minAlignmentPeriod, tableDisplayOptions, tableTemplate, timeSeriesQuery);
        }
    }
}
