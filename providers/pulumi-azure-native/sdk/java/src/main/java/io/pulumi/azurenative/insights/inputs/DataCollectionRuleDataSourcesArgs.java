// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.ExtensionDataSourceArgs;
import io.pulumi.azurenative.insights.inputs.PerfCounterDataSourceArgs;
import io.pulumi.azurenative.insights.inputs.SyslogDataSourceArgs;
import io.pulumi.azurenative.insights.inputs.WindowsEventLogDataSourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The specification of data sources.
 * This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
 * 
 */
public final class DataCollectionRuleDataSourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCollectionRuleDataSourcesArgs Empty = new DataCollectionRuleDataSourcesArgs();

    /**
     * The list of Azure VM extension data source configurations.
     * 
     */
    @Import(name="extensions")
      private final @Nullable Output<List<ExtensionDataSourceArgs>> extensions;

    public Output<List<ExtensionDataSourceArgs>> extensions() {
        return this.extensions == null ? Codegen.empty() : this.extensions;
    }

    /**
     * The list of performance counter data source configurations.
     * 
     */
    @Import(name="performanceCounters")
      private final @Nullable Output<List<PerfCounterDataSourceArgs>> performanceCounters;

    public Output<List<PerfCounterDataSourceArgs>> performanceCounters() {
        return this.performanceCounters == null ? Codegen.empty() : this.performanceCounters;
    }

    /**
     * The list of Syslog data source configurations.
     * 
     */
    @Import(name="syslog")
      private final @Nullable Output<List<SyslogDataSourceArgs>> syslog;

    public Output<List<SyslogDataSourceArgs>> syslog() {
        return this.syslog == null ? Codegen.empty() : this.syslog;
    }

    /**
     * The list of Windows Event Log data source configurations.
     * 
     */
    @Import(name="windowsEventLogs")
      private final @Nullable Output<List<WindowsEventLogDataSourceArgs>> windowsEventLogs;

    public Output<List<WindowsEventLogDataSourceArgs>> windowsEventLogs() {
        return this.windowsEventLogs == null ? Codegen.empty() : this.windowsEventLogs;
    }

    public DataCollectionRuleDataSourcesArgs(
        @Nullable Output<List<ExtensionDataSourceArgs>> extensions,
        @Nullable Output<List<PerfCounterDataSourceArgs>> performanceCounters,
        @Nullable Output<List<SyslogDataSourceArgs>> syslog,
        @Nullable Output<List<WindowsEventLogDataSourceArgs>> windowsEventLogs) {
        this.extensions = extensions;
        this.performanceCounters = performanceCounters;
        this.syslog = syslog;
        this.windowsEventLogs = windowsEventLogs;
    }

    private DataCollectionRuleDataSourcesArgs() {
        this.extensions = Codegen.empty();
        this.performanceCounters = Codegen.empty();
        this.syslog = Codegen.empty();
        this.windowsEventLogs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleDataSourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ExtensionDataSourceArgs>> extensions;
        private @Nullable Output<List<PerfCounterDataSourceArgs>> performanceCounters;
        private @Nullable Output<List<SyslogDataSourceArgs>> syslog;
        private @Nullable Output<List<WindowsEventLogDataSourceArgs>> windowsEventLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionRuleDataSourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensions = defaults.extensions;
    	      this.performanceCounters = defaults.performanceCounters;
    	      this.syslog = defaults.syslog;
    	      this.windowsEventLogs = defaults.windowsEventLogs;
        }

        public Builder extensions(@Nullable Output<List<ExtensionDataSourceArgs>> extensions) {
            this.extensions = extensions;
            return this;
        }
        public Builder extensions(@Nullable List<ExtensionDataSourceArgs> extensions) {
            this.extensions = Codegen.ofNullable(extensions);
            return this;
        }
        public Builder extensions(ExtensionDataSourceArgs... extensions) {
            return extensions(List.of(extensions));
        }
        public Builder performanceCounters(@Nullable Output<List<PerfCounterDataSourceArgs>> performanceCounters) {
            this.performanceCounters = performanceCounters;
            return this;
        }
        public Builder performanceCounters(@Nullable List<PerfCounterDataSourceArgs> performanceCounters) {
            this.performanceCounters = Codegen.ofNullable(performanceCounters);
            return this;
        }
        public Builder performanceCounters(PerfCounterDataSourceArgs... performanceCounters) {
            return performanceCounters(List.of(performanceCounters));
        }
        public Builder syslog(@Nullable Output<List<SyslogDataSourceArgs>> syslog) {
            this.syslog = syslog;
            return this;
        }
        public Builder syslog(@Nullable List<SyslogDataSourceArgs> syslog) {
            this.syslog = Codegen.ofNullable(syslog);
            return this;
        }
        public Builder syslog(SyslogDataSourceArgs... syslog) {
            return syslog(List.of(syslog));
        }
        public Builder windowsEventLogs(@Nullable Output<List<WindowsEventLogDataSourceArgs>> windowsEventLogs) {
            this.windowsEventLogs = windowsEventLogs;
            return this;
        }
        public Builder windowsEventLogs(@Nullable List<WindowsEventLogDataSourceArgs> windowsEventLogs) {
            this.windowsEventLogs = Codegen.ofNullable(windowsEventLogs);
            return this;
        }
        public Builder windowsEventLogs(WindowsEventLogDataSourceArgs... windowsEventLogs) {
            return windowsEventLogs(List.of(windowsEventLogs));
        }        public DataCollectionRuleDataSourcesArgs build() {
            return new DataCollectionRuleDataSourcesArgs(extensions, performanceCounters, syslog, windowsEventLogs);
        }
    }
}
