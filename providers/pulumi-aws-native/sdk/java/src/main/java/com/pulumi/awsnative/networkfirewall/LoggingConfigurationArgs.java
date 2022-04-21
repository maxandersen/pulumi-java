// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoggingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationArgs Empty = new LoggingConfigurationArgs();

    @Import(name="firewallArn", required=true)
    private Output<String> firewallArn;

    public Output<String> firewallArn() {
        return this.firewallArn;
    }

    @Import(name="firewallName")
    private @Nullable Output<String> firewallName;

    public Optional<Output<String>> firewallName() {
        return Optional.ofNullable(this.firewallName);
    }

    @Import(name="loggingConfiguration", required=true)
    private Output<com.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationArgs> loggingConfiguration;

    public Output<com.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationArgs> loggingConfiguration() {
        return this.loggingConfiguration;
    }

    private LoggingConfigurationArgs() {}

    private LoggingConfigurationArgs(LoggingConfigurationArgs $) {
        this.firewallArn = $.firewallArn;
        this.firewallName = $.firewallName;
        this.loggingConfiguration = $.loggingConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationArgs $;

        public Builder() {
            $ = new LoggingConfigurationArgs();
        }

        public Builder(LoggingConfigurationArgs defaults) {
            $ = new LoggingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder firewallArn(Output<String> firewallArn) {
            $.firewallArn = firewallArn;
            return this;
        }

        public Builder firewallArn(String firewallArn) {
            return firewallArn(Output.of(firewallArn));
        }

        public Builder firewallName(@Nullable Output<String> firewallName) {
            $.firewallName = firewallName;
            return this;
        }

        public Builder firewallName(String firewallName) {
            return firewallName(Output.of(firewallName));
        }

        public Builder loggingConfiguration(Output<com.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationArgs> loggingConfiguration) {
            $.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder loggingConfiguration(com.pulumi.awsnative.networkfirewall.inputs.LoggingConfigurationArgs loggingConfiguration) {
            return loggingConfiguration(Output.of(loggingConfiguration));
        }

        public LoggingConfigurationArgs build() {
            $.firewallArn = Objects.requireNonNull($.firewallArn, "expected parameter 'firewallArn' to be non-null");
            $.loggingConfiguration = Objects.requireNonNull($.loggingConfiguration, "expected parameter 'loggingConfiguration' to be non-null");
            return $;
        }
    }

}
