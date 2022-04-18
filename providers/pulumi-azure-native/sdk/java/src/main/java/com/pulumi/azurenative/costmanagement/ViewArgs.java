// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement;

import com.pulumi.azurenative.costmanagement.enums.AccumulatedType;
import com.pulumi.azurenative.costmanagement.enums.ChartType;
import com.pulumi.azurenative.costmanagement.enums.MetricType;
import com.pulumi.azurenative.costmanagement.enums.ReportTimeframeType;
import com.pulumi.azurenative.costmanagement.enums.ReportType;
import com.pulumi.azurenative.costmanagement.inputs.KpiPropertiesArgs;
import com.pulumi.azurenative.costmanagement.inputs.PivotPropertiesArgs;
import com.pulumi.azurenative.costmanagement.inputs.ReportConfigDatasetArgs;
import com.pulumi.azurenative.costmanagement.inputs.ReportConfigTimePeriodArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final ViewArgs Empty = new ViewArgs();

    /**
     * Show costs accumulated over time.
     * 
     */
    @Import(name="accumulated")
      private final @Nullable Output<Either<String,AccumulatedType>> accumulated;

    public Output<Either<String,AccumulatedType>> accumulated() {
        return this.accumulated == null ? Codegen.empty() : this.accumulated;
    }

    /**
     * Chart type of the main view in Cost Analysis. Required.
     * 
     */
    @Import(name="chart")
      private final @Nullable Output<Either<String,ChartType>> chart;

    public Output<Either<String,ChartType>> chart() {
        return this.chart == null ? Codegen.empty() : this.chart;
    }

    /**
     * Has definition for data in this report config.
     * 
     */
    @Import(name="dataSet")
      private final @Nullable Output<ReportConfigDatasetArgs> dataSet;

    public Output<ReportConfigDatasetArgs> dataSet() {
        return this.dataSet == null ? Codegen.empty() : this.dataSet;
    }

    /**
     * User input name of the view. Required.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    @Import(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> eTag() {
        return this.eTag == null ? Codegen.empty() : this.eTag;
    }

    /**
     * List of KPIs to show in Cost Analysis UI.
     * 
     */
    @Import(name="kpis")
      private final @Nullable Output<List<KpiPropertiesArgs>> kpis;

    public Output<List<KpiPropertiesArgs>> kpis() {
        return this.kpis == null ? Codegen.empty() : this.kpis;
    }

    /**
     * Metric to use when displaying costs.
     * 
     */
    @Import(name="metric")
      private final @Nullable Output<Either<String,MetricType>> metric;

    public Output<Either<String,MetricType>> metric() {
        return this.metric == null ? Codegen.empty() : this.metric;
    }

    /**
     * Configuration of 3 sub-views in the Cost Analysis UI.
     * 
     */
    @Import(name="pivots")
      private final @Nullable Output<List<PivotPropertiesArgs>> pivots;

    public Output<List<PivotPropertiesArgs>> pivots() {
        return this.pivots == null ? Codegen.empty() : this.pivots;
    }

    /**
     * Cost Management scope to save the view on. This includes 'subscriptions/{subscriptionId}' for subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for BillingProfile scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group scope, '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for ExternalBillingAccount scope, and '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for ExternalSubscription scope.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    /**
     * Has time period for pulling data for the report.
     * 
     */
    @Import(name="timePeriod")
      private final @Nullable Output<ReportConfigTimePeriodArgs> timePeriod;

    public Output<ReportConfigTimePeriodArgs> timePeriod() {
        return this.timePeriod == null ? Codegen.empty() : this.timePeriod;
    }

    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    @Import(name="timeframe", required=true)
      private final Output<Either<String,ReportTimeframeType>> timeframe;

    public Output<Either<String,ReportTimeframeType>> timeframe() {
        return this.timeframe;
    }

    /**
     * The type of the report. Usage represents actual usage, forecast represents forecasted data and UsageAndForecast represents both usage and forecasted data. Actual usage and forecasted data can be differentiated based on dates.
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,ReportType>> type;

    public Output<Either<String,ReportType>> type() {
        return this.type;
    }

    /**
     * View name
     * 
     */
    @Import(name="viewName")
      private final @Nullable Output<String> viewName;

    public Output<String> viewName() {
        return this.viewName == null ? Codegen.empty() : this.viewName;
    }

    public ViewArgs(
        @Nullable Output<Either<String,AccumulatedType>> accumulated,
        @Nullable Output<Either<String,ChartType>> chart,
        @Nullable Output<ReportConfigDatasetArgs> dataSet,
        @Nullable Output<String> displayName,
        @Nullable Output<String> eTag,
        @Nullable Output<List<KpiPropertiesArgs>> kpis,
        @Nullable Output<Either<String,MetricType>> metric,
        @Nullable Output<List<PivotPropertiesArgs>> pivots,
        @Nullable Output<String> scope,
        @Nullable Output<ReportConfigTimePeriodArgs> timePeriod,
        Output<Either<String,ReportTimeframeType>> timeframe,
        Output<Either<String,ReportType>> type,
        @Nullable Output<String> viewName) {
        this.accumulated = accumulated;
        this.chart = chart;
        this.dataSet = dataSet;
        this.displayName = displayName;
        this.eTag = eTag;
        this.kpis = kpis;
        this.metric = metric;
        this.pivots = pivots;
        this.scope = scope;
        this.timePeriod = timePeriod;
        this.timeframe = Objects.requireNonNull(timeframe, "expected parameter 'timeframe' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.viewName = viewName;
    }

    private ViewArgs() {
        this.accumulated = Codegen.empty();
        this.chart = Codegen.empty();
        this.dataSet = Codegen.empty();
        this.displayName = Codegen.empty();
        this.eTag = Codegen.empty();
        this.kpis = Codegen.empty();
        this.metric = Codegen.empty();
        this.pivots = Codegen.empty();
        this.scope = Codegen.empty();
        this.timePeriod = Codegen.empty();
        this.timeframe = Codegen.empty();
        this.type = Codegen.empty();
        this.viewName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,AccumulatedType>> accumulated;
        private @Nullable Output<Either<String,ChartType>> chart;
        private @Nullable Output<ReportConfigDatasetArgs> dataSet;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> eTag;
        private @Nullable Output<List<KpiPropertiesArgs>> kpis;
        private @Nullable Output<Either<String,MetricType>> metric;
        private @Nullable Output<List<PivotPropertiesArgs>> pivots;
        private @Nullable Output<String> scope;
        private @Nullable Output<ReportConfigTimePeriodArgs> timePeriod;
        private Output<Either<String,ReportTimeframeType>> timeframe;
        private Output<Either<String,ReportType>> type;
        private @Nullable Output<String> viewName;

        public Builder() {
    	      // Empty
        }

        public Builder(ViewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accumulated = defaults.accumulated;
    	      this.chart = defaults.chart;
    	      this.dataSet = defaults.dataSet;
    	      this.displayName = defaults.displayName;
    	      this.eTag = defaults.eTag;
    	      this.kpis = defaults.kpis;
    	      this.metric = defaults.metric;
    	      this.pivots = defaults.pivots;
    	      this.scope = defaults.scope;
    	      this.timePeriod = defaults.timePeriod;
    	      this.timeframe = defaults.timeframe;
    	      this.type = defaults.type;
    	      this.viewName = defaults.viewName;
        }

        public Builder accumulated(@Nullable Output<Either<String,AccumulatedType>> accumulated) {
            this.accumulated = accumulated;
            return this;
        }
        public Builder accumulated(@Nullable Either<String,AccumulatedType> accumulated) {
            this.accumulated = Codegen.ofNullable(accumulated);
            return this;
        }
        public Builder chart(@Nullable Output<Either<String,ChartType>> chart) {
            this.chart = chart;
            return this;
        }
        public Builder chart(@Nullable Either<String,ChartType> chart) {
            this.chart = Codegen.ofNullable(chart);
            return this;
        }
        public Builder dataSet(@Nullable Output<ReportConfigDatasetArgs> dataSet) {
            this.dataSet = dataSet;
            return this;
        }
        public Builder dataSet(@Nullable ReportConfigDatasetArgs dataSet) {
            this.dataSet = Codegen.ofNullable(dataSet);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }
        public Builder eTag(@Nullable String eTag) {
            this.eTag = Codegen.ofNullable(eTag);
            return this;
        }
        public Builder kpis(@Nullable Output<List<KpiPropertiesArgs>> kpis) {
            this.kpis = kpis;
            return this;
        }
        public Builder kpis(@Nullable List<KpiPropertiesArgs> kpis) {
            this.kpis = Codegen.ofNullable(kpis);
            return this;
        }
        public Builder kpis(KpiPropertiesArgs... kpis) {
            return kpis(List.of(kpis));
        }
        public Builder metric(@Nullable Output<Either<String,MetricType>> metric) {
            this.metric = metric;
            return this;
        }
        public Builder metric(@Nullable Either<String,MetricType> metric) {
            this.metric = Codegen.ofNullable(metric);
            return this;
        }
        public Builder pivots(@Nullable Output<List<PivotPropertiesArgs>> pivots) {
            this.pivots = pivots;
            return this;
        }
        public Builder pivots(@Nullable List<PivotPropertiesArgs> pivots) {
            this.pivots = Codegen.ofNullable(pivots);
            return this;
        }
        public Builder pivots(PivotPropertiesArgs... pivots) {
            return pivots(List.of(pivots));
        }
        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }
        public Builder timePeriod(@Nullable Output<ReportConfigTimePeriodArgs> timePeriod) {
            this.timePeriod = timePeriod;
            return this;
        }
        public Builder timePeriod(@Nullable ReportConfigTimePeriodArgs timePeriod) {
            this.timePeriod = Codegen.ofNullable(timePeriod);
            return this;
        }
        public Builder timeframe(Output<Either<String,ReportTimeframeType>> timeframe) {
            this.timeframe = Objects.requireNonNull(timeframe);
            return this;
        }
        public Builder timeframe(Either<String,ReportTimeframeType> timeframe) {
            this.timeframe = Output.of(Objects.requireNonNull(timeframe));
            return this;
        }
        public Builder type(Output<Either<String,ReportType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(Either<String,ReportType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder viewName(@Nullable Output<String> viewName) {
            this.viewName = viewName;
            return this;
        }
        public Builder viewName(@Nullable String viewName) {
            this.viewName = Codegen.ofNullable(viewName);
            return this;
        }        public ViewArgs build() {
            return new ViewArgs(accumulated, chart, dataSet, displayName, eTag, kpis, metric, pivots, scope, timePeriod, timeframe, type, viewName);
        }
    }
}
