// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.EtwProviderConfigurationResponse;
import io.pulumi.azurenative.insights.inputs.EventLogConfigurationResponse;
import io.pulumi.azurenative.insights.inputs.PerformanceCounterConfigurationResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceConfigurationResponse Empty = new DataSourceConfigurationResponse();

    /**
     * Windows event logs configuration.
     * 
     */
    @Import(name="eventLogs")
      private final @Nullable List<EventLogConfigurationResponse> eventLogs;

    public List<EventLogConfigurationResponse> eventLogs() {
        return this.eventLogs == null ? List.of() : this.eventLogs;
    }

    /**
     * Performance counter configuration
     * 
     */
    @Import(name="perfCounters")
      private final @Nullable List<PerformanceCounterConfigurationResponse> perfCounters;

    public List<PerformanceCounterConfigurationResponse> perfCounters() {
        return this.perfCounters == null ? List.of() : this.perfCounters;
    }

    /**
     * ETW providers configuration
     * 
     */
    @Import(name="providers")
      private final @Nullable List<EtwProviderConfigurationResponse> providers;

    public List<EtwProviderConfigurationResponse> providers() {
        return this.providers == null ? List.of() : this.providers;
    }

    public DataSourceConfigurationResponse(
        @Nullable List<EventLogConfigurationResponse> eventLogs,
        @Nullable List<PerformanceCounterConfigurationResponse> perfCounters,
        @Nullable List<EtwProviderConfigurationResponse> providers) {
        this.eventLogs = eventLogs;
        this.perfCounters = perfCounters;
        this.providers = providers;
    }

    private DataSourceConfigurationResponse() {
        this.eventLogs = List.of();
        this.perfCounters = List.of();
        this.providers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EventLogConfigurationResponse> eventLogs;
        private @Nullable List<PerformanceCounterConfigurationResponse> perfCounters;
        private @Nullable List<EtwProviderConfigurationResponse> providers;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventLogs = defaults.eventLogs;
    	      this.perfCounters = defaults.perfCounters;
    	      this.providers = defaults.providers;
        }

        public Builder eventLogs(@Nullable List<EventLogConfigurationResponse> eventLogs) {
            this.eventLogs = eventLogs;
            return this;
        }
        public Builder eventLogs(EventLogConfigurationResponse... eventLogs) {
            return eventLogs(List.of(eventLogs));
        }
        public Builder perfCounters(@Nullable List<PerformanceCounterConfigurationResponse> perfCounters) {
            this.perfCounters = perfCounters;
            return this;
        }
        public Builder perfCounters(PerformanceCounterConfigurationResponse... perfCounters) {
            return perfCounters(List.of(perfCounters));
        }
        public Builder providers(@Nullable List<EtwProviderConfigurationResponse> providers) {
            this.providers = providers;
            return this;
        }
        public Builder providers(EtwProviderConfigurationResponse... providers) {
            return providers(List.of(providers));
        }        public DataSourceConfigurationResponse build() {
            return new DataSourceConfigurationResponse(eventLogs, perfCounters, providers);
        }
    }
}
