// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1CustomReportMetricArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1ReportPropertyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReportArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportArgs Empty = new ReportArgs();

    /**
     * This field contains the chart type for the report
     * 
     */
    @Import(name="chartType")
      private final @Nullable Output<String> chartType;

    public Output<String> chartType() {
        return this.chartType == null ? Codegen.empty() : this.chartType;
    }

    /**
     * Legacy field: not used. This field contains a list of comments associated with custom report
     * 
     */
    @Import(name="comments")
      private final @Nullable Output<List<String>> comments;

    public Output<List<String>> comments() {
        return this.comments == null ? Codegen.empty() : this.comments;
    }

    /**
     * This contains the list of dimensions for the report
     * 
     */
    @Import(name="dimensions")
      private final @Nullable Output<List<String>> dimensions;

    public Output<List<String>> dimensions() {
        return this.dimensions == null ? Codegen.empty() : this.dimensions;
    }

    /**
     * This is the display name for the report
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * This field contains the filter expression
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * Legacy field: not used. Contains the from time for the report
     * 
     */
    @Import(name="fromTime")
      private final @Nullable Output<String> fromTime;

    public Output<String> fromTime() {
        return this.fromTime == null ? Codegen.empty() : this.fromTime;
    }

    /**
     * Legacy field: not used This field contains the limit for the result retrieved
     * 
     */
    @Import(name="limit")
      private final @Nullable Output<String> limit;

    public Output<String> limit() {
        return this.limit == null ? Codegen.empty() : this.limit;
    }

    /**
     * This contains the list of metrics
     * 
     */
    @Import(name="metrics", required=true)
      private final Output<List<GoogleCloudApigeeV1CustomReportMetricArgs>> metrics;

    public Output<List<GoogleCloudApigeeV1CustomReportMetricArgs>> metrics() {
        return this.metrics;
    }

    /**
     * Unique identifier for the report T his is a legacy field used to encode custom report unique id
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Legacy field: not used. This field contains the offset for the data
     * 
     */
    @Import(name="offset")
      private final @Nullable Output<String> offset;

    public Output<String> offset() {
        return this.offset == null ? Codegen.empty() : this.offset;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * This field contains report properties such as ui metadata etc.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<List<GoogleCloudApigeeV1ReportPropertyArgs>> properties;

    public Output<List<GoogleCloudApigeeV1ReportPropertyArgs>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Legacy field: not used much. Contains the list of sort by columns
     * 
     */
    @Import(name="sortByCols")
      private final @Nullable Output<List<String>> sortByCols;

    public Output<List<String>> sortByCols() {
        return this.sortByCols == null ? Codegen.empty() : this.sortByCols;
    }

    /**
     * Legacy field: not used much. Contains the sort order for the sort columns
     * 
     */
    @Import(name="sortOrder")
      private final @Nullable Output<String> sortOrder;

    public Output<String> sortOrder() {
        return this.sortOrder == null ? Codegen.empty() : this.sortOrder;
    }

    /**
     * Legacy field: not used. This field contains a list of tags associated with custom report
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * This field contains the time unit of aggregation for the report
     * 
     */
    @Import(name="timeUnit")
      private final @Nullable Output<String> timeUnit;

    public Output<String> timeUnit() {
        return this.timeUnit == null ? Codegen.empty() : this.timeUnit;
    }

    /**
     * Legacy field: not used. Contains the end time for the report
     * 
     */
    @Import(name="toTime")
      private final @Nullable Output<String> toTime;

    public Output<String> toTime() {
        return this.toTime == null ? Codegen.empty() : this.toTime;
    }

    /**
     * Legacy field: not used. This field contains the top k parameter value for restricting the result
     * 
     */
    @Import(name="topk")
      private final @Nullable Output<String> topk;

    public Output<String> topk() {
        return this.topk == null ? Codegen.empty() : this.topk;
    }

    public ReportArgs(
        @Nullable Output<String> chartType,
        @Nullable Output<List<String>> comments,
        @Nullable Output<List<String>> dimensions,
        @Nullable Output<String> displayName,
        @Nullable Output<String> filter,
        @Nullable Output<String> fromTime,
        @Nullable Output<String> limit,
        Output<List<GoogleCloudApigeeV1CustomReportMetricArgs>> metrics,
        @Nullable Output<String> name,
        @Nullable Output<String> offset,
        Output<String> organizationId,
        @Nullable Output<List<GoogleCloudApigeeV1ReportPropertyArgs>> properties,
        @Nullable Output<List<String>> sortByCols,
        @Nullable Output<String> sortOrder,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> timeUnit,
        @Nullable Output<String> toTime,
        @Nullable Output<String> topk) {
        this.chartType = chartType;
        this.comments = comments;
        this.dimensions = dimensions;
        this.displayName = displayName;
        this.filter = filter;
        this.fromTime = fromTime;
        this.limit = limit;
        this.metrics = Objects.requireNonNull(metrics, "expected parameter 'metrics' to be non-null");
        this.name = name;
        this.offset = offset;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.properties = properties;
        this.sortByCols = sortByCols;
        this.sortOrder = sortOrder;
        this.tags = tags;
        this.timeUnit = timeUnit;
        this.toTime = toTime;
        this.topk = topk;
    }

    private ReportArgs() {
        this.chartType = Codegen.empty();
        this.comments = Codegen.empty();
        this.dimensions = Codegen.empty();
        this.displayName = Codegen.empty();
        this.filter = Codegen.empty();
        this.fromTime = Codegen.empty();
        this.limit = Codegen.empty();
        this.metrics = Codegen.empty();
        this.name = Codegen.empty();
        this.offset = Codegen.empty();
        this.organizationId = Codegen.empty();
        this.properties = Codegen.empty();
        this.sortByCols = Codegen.empty();
        this.sortOrder = Codegen.empty();
        this.tags = Codegen.empty();
        this.timeUnit = Codegen.empty();
        this.toTime = Codegen.empty();
        this.topk = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> chartType;
        private @Nullable Output<List<String>> comments;
        private @Nullable Output<List<String>> dimensions;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> filter;
        private @Nullable Output<String> fromTime;
        private @Nullable Output<String> limit;
        private Output<List<GoogleCloudApigeeV1CustomReportMetricArgs>> metrics;
        private @Nullable Output<String> name;
        private @Nullable Output<String> offset;
        private Output<String> organizationId;
        private @Nullable Output<List<GoogleCloudApigeeV1ReportPropertyArgs>> properties;
        private @Nullable Output<List<String>> sortByCols;
        private @Nullable Output<String> sortOrder;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> timeUnit;
        private @Nullable Output<String> toTime;
        private @Nullable Output<String> topk;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chartType = defaults.chartType;
    	      this.comments = defaults.comments;
    	      this.dimensions = defaults.dimensions;
    	      this.displayName = defaults.displayName;
    	      this.filter = defaults.filter;
    	      this.fromTime = defaults.fromTime;
    	      this.limit = defaults.limit;
    	      this.metrics = defaults.metrics;
    	      this.name = defaults.name;
    	      this.offset = defaults.offset;
    	      this.organizationId = defaults.organizationId;
    	      this.properties = defaults.properties;
    	      this.sortByCols = defaults.sortByCols;
    	      this.sortOrder = defaults.sortOrder;
    	      this.tags = defaults.tags;
    	      this.timeUnit = defaults.timeUnit;
    	      this.toTime = defaults.toTime;
    	      this.topk = defaults.topk;
        }

        public Builder chartType(@Nullable Output<String> chartType) {
            this.chartType = chartType;
            return this;
        }
        public Builder chartType(@Nullable String chartType) {
            this.chartType = Codegen.ofNullable(chartType);
            return this;
        }
        public Builder comments(@Nullable Output<List<String>> comments) {
            this.comments = comments;
            return this;
        }
        public Builder comments(@Nullable List<String> comments) {
            this.comments = Codegen.ofNullable(comments);
            return this;
        }
        public Builder comments(String... comments) {
            return comments(List.of(comments));
        }
        public Builder dimensions(@Nullable Output<List<String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(@Nullable List<String> dimensions) {
            this.dimensions = Codegen.ofNullable(dimensions);
            return this;
        }
        public Builder dimensions(String... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder fromTime(@Nullable Output<String> fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Builder fromTime(@Nullable String fromTime) {
            this.fromTime = Codegen.ofNullable(fromTime);
            return this;
        }
        public Builder limit(@Nullable Output<String> limit) {
            this.limit = limit;
            return this;
        }
        public Builder limit(@Nullable String limit) {
            this.limit = Codegen.ofNullable(limit);
            return this;
        }
        public Builder metrics(Output<List<GoogleCloudApigeeV1CustomReportMetricArgs>> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder metrics(List<GoogleCloudApigeeV1CustomReportMetricArgs> metrics) {
            this.metrics = Output.of(Objects.requireNonNull(metrics));
            return this;
        }
        public Builder metrics(GoogleCloudApigeeV1CustomReportMetricArgs... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder offset(@Nullable Output<String> offset) {
            this.offset = offset;
            return this;
        }
        public Builder offset(@Nullable String offset) {
            this.offset = Codegen.ofNullable(offset);
            return this;
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public Builder properties(@Nullable Output<List<GoogleCloudApigeeV1ReportPropertyArgs>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable List<GoogleCloudApigeeV1ReportPropertyArgs> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder properties(GoogleCloudApigeeV1ReportPropertyArgs... properties) {
            return properties(List.of(properties));
        }
        public Builder sortByCols(@Nullable Output<List<String>> sortByCols) {
            this.sortByCols = sortByCols;
            return this;
        }
        public Builder sortByCols(@Nullable List<String> sortByCols) {
            this.sortByCols = Codegen.ofNullable(sortByCols);
            return this;
        }
        public Builder sortByCols(String... sortByCols) {
            return sortByCols(List.of(sortByCols));
        }
        public Builder sortOrder(@Nullable Output<String> sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Builder sortOrder(@Nullable String sortOrder) {
            this.sortOrder = Codegen.ofNullable(sortOrder);
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder timeUnit(@Nullable Output<String> timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public Builder timeUnit(@Nullable String timeUnit) {
            this.timeUnit = Codegen.ofNullable(timeUnit);
            return this;
        }
        public Builder toTime(@Nullable Output<String> toTime) {
            this.toTime = toTime;
            return this;
        }
        public Builder toTime(@Nullable String toTime) {
            this.toTime = Codegen.ofNullable(toTime);
            return this;
        }
        public Builder topk(@Nullable Output<String> topk) {
            this.topk = topk;
            return this;
        }
        public Builder topk(@Nullable String topk) {
            this.topk = Codegen.ofNullable(topk);
            return this;
        }        public ReportArgs build() {
            return new ReportArgs(chartType, comments, dimensions, displayName, filter, fromTime, limit, metrics, name, offset, organizationId, properties, sortByCols, sortOrder, tags, timeUnit, toTime, topk);
        }
    }
}
