// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.DestinationsSpecAzureMonitorMetricsArgs;
import com.pulumi.azurenative.insights.inputs.LogAnalyticsDestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The specification of destinations.
 * 
 */
public final class DataCollectionRuleDestinationsArgs extends ResourceArgs {

    public static final DataCollectionRuleDestinationsArgs Empty = new DataCollectionRuleDestinationsArgs();

    /**
     * Azure Monitor Metrics destination.
     * 
     */
    @Import(name="azureMonitorMetrics")
    private @Nullable Output<DestinationsSpecAzureMonitorMetricsArgs> azureMonitorMetrics;

    /**
     * @return Azure Monitor Metrics destination.
     * 
     */
    public Optional<Output<DestinationsSpecAzureMonitorMetricsArgs>> azureMonitorMetrics() {
        return Optional.ofNullable(this.azureMonitorMetrics);
    }

    /**
     * List of Log Analytics destinations.
     * 
     */
    @Import(name="logAnalytics")
    private @Nullable Output<List<LogAnalyticsDestinationArgs>> logAnalytics;

    /**
     * @return List of Log Analytics destinations.
     * 
     */
    public Optional<Output<List<LogAnalyticsDestinationArgs>>> logAnalytics() {
        return Optional.ofNullable(this.logAnalytics);
    }

    private DataCollectionRuleDestinationsArgs() {}

    private DataCollectionRuleDestinationsArgs(DataCollectionRuleDestinationsArgs $) {
        this.azureMonitorMetrics = $.azureMonitorMetrics;
        this.logAnalytics = $.logAnalytics;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCollectionRuleDestinationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCollectionRuleDestinationsArgs $;

        public Builder() {
            $ = new DataCollectionRuleDestinationsArgs();
        }

        public Builder(DataCollectionRuleDestinationsArgs defaults) {
            $ = new DataCollectionRuleDestinationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureMonitorMetrics Azure Monitor Metrics destination.
         * 
         * @return builder
         * 
         */
        public Builder azureMonitorMetrics(@Nullable Output<DestinationsSpecAzureMonitorMetricsArgs> azureMonitorMetrics) {
            $.azureMonitorMetrics = azureMonitorMetrics;
            return this;
        }

        /**
         * @param azureMonitorMetrics Azure Monitor Metrics destination.
         * 
         * @return builder
         * 
         */
        public Builder azureMonitorMetrics(DestinationsSpecAzureMonitorMetricsArgs azureMonitorMetrics) {
            return azureMonitorMetrics(Output.of(azureMonitorMetrics));
        }

        /**
         * @param logAnalytics List of Log Analytics destinations.
         * 
         * @return builder
         * 
         */
        public Builder logAnalytics(@Nullable Output<List<LogAnalyticsDestinationArgs>> logAnalytics) {
            $.logAnalytics = logAnalytics;
            return this;
        }

        /**
         * @param logAnalytics List of Log Analytics destinations.
         * 
         * @return builder
         * 
         */
        public Builder logAnalytics(List<LogAnalyticsDestinationArgs> logAnalytics) {
            return logAnalytics(Output.of(logAnalytics));
        }

        /**
         * @param logAnalytics List of Log Analytics destinations.
         * 
         * @return builder
         * 
         */
        public Builder logAnalytics(LogAnalyticsDestinationArgs... logAnalytics) {
            return logAnalytics(List.of(logAnalytics));
        }

        public DataCollectionRuleDestinationsArgs build() {
            return $;
        }
    }

}
