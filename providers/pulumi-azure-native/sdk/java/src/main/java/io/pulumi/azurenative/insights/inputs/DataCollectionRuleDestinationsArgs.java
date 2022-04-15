// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.DestinationsSpecAzureMonitorMetricsArgs;
import io.pulumi.azurenative.insights.inputs.LogAnalyticsDestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The specification of destinations.
 * 
 */
public final class DataCollectionRuleDestinationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCollectionRuleDestinationsArgs Empty = new DataCollectionRuleDestinationsArgs();

    /**
     * Azure Monitor Metrics destination.
     * 
     */
    @Import(name="azureMonitorMetrics")
      private final @Nullable Output<DestinationsSpecAzureMonitorMetricsArgs> azureMonitorMetrics;

    public Output<DestinationsSpecAzureMonitorMetricsArgs> azureMonitorMetrics() {
        return this.azureMonitorMetrics == null ? Codegen.empty() : this.azureMonitorMetrics;
    }

    /**
     * List of Log Analytics destinations.
     * 
     */
    @Import(name="logAnalytics")
      private final @Nullable Output<List<LogAnalyticsDestinationArgs>> logAnalytics;

    public Output<List<LogAnalyticsDestinationArgs>> logAnalytics() {
        return this.logAnalytics == null ? Codegen.empty() : this.logAnalytics;
    }

    public DataCollectionRuleDestinationsArgs(
        @Nullable Output<DestinationsSpecAzureMonitorMetricsArgs> azureMonitorMetrics,
        @Nullable Output<List<LogAnalyticsDestinationArgs>> logAnalytics) {
        this.azureMonitorMetrics = azureMonitorMetrics;
        this.logAnalytics = logAnalytics;
    }

    private DataCollectionRuleDestinationsArgs() {
        this.azureMonitorMetrics = Codegen.empty();
        this.logAnalytics = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleDestinationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DestinationsSpecAzureMonitorMetricsArgs> azureMonitorMetrics;
        private @Nullable Output<List<LogAnalyticsDestinationArgs>> logAnalytics;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionRuleDestinationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureMonitorMetrics = defaults.azureMonitorMetrics;
    	      this.logAnalytics = defaults.logAnalytics;
        }

        public Builder azureMonitorMetrics(@Nullable Output<DestinationsSpecAzureMonitorMetricsArgs> azureMonitorMetrics) {
            this.azureMonitorMetrics = azureMonitorMetrics;
            return this;
        }
        public Builder azureMonitorMetrics(@Nullable DestinationsSpecAzureMonitorMetricsArgs azureMonitorMetrics) {
            this.azureMonitorMetrics = Codegen.ofNullable(azureMonitorMetrics);
            return this;
        }
        public Builder logAnalytics(@Nullable Output<List<LogAnalyticsDestinationArgs>> logAnalytics) {
            this.logAnalytics = logAnalytics;
            return this;
        }
        public Builder logAnalytics(@Nullable List<LogAnalyticsDestinationArgs> logAnalytics) {
            this.logAnalytics = Codegen.ofNullable(logAnalytics);
            return this;
        }
        public Builder logAnalytics(LogAnalyticsDestinationArgs... logAnalytics) {
            return logAnalytics(List.of(logAnalytics));
        }        public DataCollectionRuleDestinationsArgs build() {
            return new DataCollectionRuleDestinationsArgs(azureMonitorMetrics, logAnalytics);
        }
    }
}
