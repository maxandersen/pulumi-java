// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.EtwProviderConfigurationArgs;
import io.pulumi.azurenative.insights.inputs.EventLogConfigurationArgs;
import io.pulumi.azurenative.insights.inputs.PerformanceCounterConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceConfigurationArgs Empty = new DataSourceConfigurationArgs();

    /**
     * Windows event logs configuration.
     * 
     */
    @Import(name="eventLogs")
      private final @Nullable Output<List<EventLogConfigurationArgs>> eventLogs;

    public Output<List<EventLogConfigurationArgs>> eventLogs() {
        return this.eventLogs == null ? Codegen.empty() : this.eventLogs;
    }

    /**
     * Performance counter configuration
     * 
     */
    @Import(name="perfCounters")
      private final @Nullable Output<List<PerformanceCounterConfigurationArgs>> perfCounters;

    public Output<List<PerformanceCounterConfigurationArgs>> perfCounters() {
        return this.perfCounters == null ? Codegen.empty() : this.perfCounters;
    }

    /**
     * ETW providers configuration
     * 
     */
    @Import(name="providers")
      private final @Nullable Output<List<EtwProviderConfigurationArgs>> providers;

    public Output<List<EtwProviderConfigurationArgs>> providers() {
        return this.providers == null ? Codegen.empty() : this.providers;
    }

    public DataSourceConfigurationArgs(
        @Nullable Output<List<EventLogConfigurationArgs>> eventLogs,
        @Nullable Output<List<PerformanceCounterConfigurationArgs>> perfCounters,
        @Nullable Output<List<EtwProviderConfigurationArgs>> providers) {
        this.eventLogs = eventLogs;
        this.perfCounters = perfCounters;
        this.providers = providers;
    }

    private DataSourceConfigurationArgs() {
        this.eventLogs = Codegen.empty();
        this.perfCounters = Codegen.empty();
        this.providers = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<EventLogConfigurationArgs>> eventLogs;
        private @Nullable Output<List<PerformanceCounterConfigurationArgs>> perfCounters;
        private @Nullable Output<List<EtwProviderConfigurationArgs>> providers;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventLogs = defaults.eventLogs;
    	      this.perfCounters = defaults.perfCounters;
    	      this.providers = defaults.providers;
        }

        public Builder eventLogs(@Nullable Output<List<EventLogConfigurationArgs>> eventLogs) {
            this.eventLogs = eventLogs;
            return this;
        }
        public Builder eventLogs(@Nullable List<EventLogConfigurationArgs> eventLogs) {
            this.eventLogs = Codegen.ofNullable(eventLogs);
            return this;
        }
        public Builder eventLogs(EventLogConfigurationArgs... eventLogs) {
            return eventLogs(List.of(eventLogs));
        }
        public Builder perfCounters(@Nullable Output<List<PerformanceCounterConfigurationArgs>> perfCounters) {
            this.perfCounters = perfCounters;
            return this;
        }
        public Builder perfCounters(@Nullable List<PerformanceCounterConfigurationArgs> perfCounters) {
            this.perfCounters = Codegen.ofNullable(perfCounters);
            return this;
        }
        public Builder perfCounters(PerformanceCounterConfigurationArgs... perfCounters) {
            return perfCounters(List.of(perfCounters));
        }
        public Builder providers(@Nullable Output<List<EtwProviderConfigurationArgs>> providers) {
            this.providers = providers;
            return this;
        }
        public Builder providers(@Nullable List<EtwProviderConfigurationArgs> providers) {
            this.providers = Codegen.ofNullable(providers);
            return this;
        }
        public Builder providers(EtwProviderConfigurationArgs... providers) {
            return providers(List.of(providers));
        }        public DataSourceConfigurationArgs build() {
            return new DataSourceConfigurationArgs(eventLogs, perfCounters, providers);
        }
    }
}
