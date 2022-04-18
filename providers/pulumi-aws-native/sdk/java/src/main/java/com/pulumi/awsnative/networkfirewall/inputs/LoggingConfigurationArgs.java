// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationLogDestinationConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


public final class LoggingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationArgs Empty = new LoggingConfigurationArgs();

    @Import(name="logDestinationConfigs", required=true)
      private final Output<List<LoggingConfigurationLogDestinationConfigArgs>> logDestinationConfigs;

    public Output<List<LoggingConfigurationLogDestinationConfigArgs>> logDestinationConfigs() {
        return this.logDestinationConfigs;
    }

    public LoggingConfigurationArgs(Output<List<LoggingConfigurationLogDestinationConfigArgs>> logDestinationConfigs) {
        this.logDestinationConfigs = Objects.requireNonNull(logDestinationConfigs, "expected parameter 'logDestinationConfigs' to be non-null");
    }

    private LoggingConfigurationArgs() {
        this.logDestinationConfigs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<LoggingConfigurationLogDestinationConfigArgs>> logDestinationConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestinationConfigs = defaults.logDestinationConfigs;
        }

        public Builder logDestinationConfigs(Output<List<LoggingConfigurationLogDestinationConfigArgs>> logDestinationConfigs) {
            this.logDestinationConfigs = Objects.requireNonNull(logDestinationConfigs);
            return this;
        }
        public Builder logDestinationConfigs(List<LoggingConfigurationLogDestinationConfigArgs> logDestinationConfigs) {
            this.logDestinationConfigs = Output.of(Objects.requireNonNull(logDestinationConfigs));
            return this;
        }
        public Builder logDestinationConfigs(LoggingConfigurationLogDestinationConfigArgs... logDestinationConfigs) {
            return logDestinationConfigs(List.of(logDestinationConfigs));
        }        public LoggingConfigurationArgs build() {
            return new LoggingConfigurationArgs(logDestinationConfigs);
        }
    }
}
