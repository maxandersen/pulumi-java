// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.ConnectionMonitorTestConfigurationProtocol;
import com.pulumi.azurenative.network.enums.PreferredIPVersion;
import com.pulumi.azurenative.network.inputs.ConnectionMonitorHttpConfigurationArgs;
import com.pulumi.azurenative.network.inputs.ConnectionMonitorIcmpConfigurationArgs;
import com.pulumi.azurenative.network.inputs.ConnectionMonitorSuccessThresholdArgs;
import com.pulumi.azurenative.network.inputs.ConnectionMonitorTcpConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a connection monitor test configuration.
 * 
 */
public final class ConnectionMonitorTestConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorTestConfigurationArgs Empty = new ConnectionMonitorTestConfigurationArgs();

    /**
     * The parameters used to perform test evaluation over HTTP.
     * 
     */
    @Import(name="httpConfiguration")
    private @Nullable Output<ConnectionMonitorHttpConfigurationArgs> httpConfiguration;

    public Optional<Output<ConnectionMonitorHttpConfigurationArgs>> httpConfiguration() {
        return Optional.ofNullable(this.httpConfiguration);
    }

    /**
     * The parameters used to perform test evaluation over ICMP.
     * 
     */
    @Import(name="icmpConfiguration")
    private @Nullable Output<ConnectionMonitorIcmpConfigurationArgs> icmpConfiguration;

    public Optional<Output<ConnectionMonitorIcmpConfigurationArgs>> icmpConfiguration() {
        return Optional.ofNullable(this.icmpConfiguration);
    }

    /**
     * The name of the connection monitor test configuration.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The preferred IP version to use in test evaluation. The connection monitor may choose to use a different version depending on other parameters.
     * 
     */
    @Import(name="preferredIPVersion")
    private @Nullable Output<Either<String,PreferredIPVersion>> preferredIPVersion;

    public Optional<Output<Either<String,PreferredIPVersion>>> preferredIPVersion() {
        return Optional.ofNullable(this.preferredIPVersion);
    }

    /**
     * The protocol to use in test evaluation.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<Either<String,ConnectionMonitorTestConfigurationProtocol>> protocol;

    public Output<Either<String,ConnectionMonitorTestConfigurationProtocol>> protocol() {
        return this.protocol;
    }

    /**
     * The threshold for declaring a test successful.
     * 
     */
    @Import(name="successThreshold")
    private @Nullable Output<ConnectionMonitorSuccessThresholdArgs> successThreshold;

    public Optional<Output<ConnectionMonitorSuccessThresholdArgs>> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }

    /**
     * The parameters used to perform test evaluation over TCP.
     * 
     */
    @Import(name="tcpConfiguration")
    private @Nullable Output<ConnectionMonitorTcpConfigurationArgs> tcpConfiguration;

    public Optional<Output<ConnectionMonitorTcpConfigurationArgs>> tcpConfiguration() {
        return Optional.ofNullable(this.tcpConfiguration);
    }

    /**
     * The frequency of test evaluation, in seconds.
     * 
     */
    @Import(name="testFrequencySec")
    private @Nullable Output<Integer> testFrequencySec;

    public Optional<Output<Integer>> testFrequencySec() {
        return Optional.ofNullable(this.testFrequencySec);
    }

    private ConnectionMonitorTestConfigurationArgs() {}

    private ConnectionMonitorTestConfigurationArgs(ConnectionMonitorTestConfigurationArgs $) {
        this.httpConfiguration = $.httpConfiguration;
        this.icmpConfiguration = $.icmpConfiguration;
        this.name = $.name;
        this.preferredIPVersion = $.preferredIPVersion;
        this.protocol = $.protocol;
        this.successThreshold = $.successThreshold;
        this.tcpConfiguration = $.tcpConfiguration;
        this.testFrequencySec = $.testFrequencySec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionMonitorTestConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionMonitorTestConfigurationArgs $;

        public Builder() {
            $ = new ConnectionMonitorTestConfigurationArgs();
        }

        public Builder(ConnectionMonitorTestConfigurationArgs defaults) {
            $ = new ConnectionMonitorTestConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder httpConfiguration(@Nullable Output<ConnectionMonitorHttpConfigurationArgs> httpConfiguration) {
            $.httpConfiguration = httpConfiguration;
            return this;
        }

        public Builder httpConfiguration(ConnectionMonitorHttpConfigurationArgs httpConfiguration) {
            return httpConfiguration(Output.of(httpConfiguration));
        }

        public Builder icmpConfiguration(@Nullable Output<ConnectionMonitorIcmpConfigurationArgs> icmpConfiguration) {
            $.icmpConfiguration = icmpConfiguration;
            return this;
        }

        public Builder icmpConfiguration(ConnectionMonitorIcmpConfigurationArgs icmpConfiguration) {
            return icmpConfiguration(Output.of(icmpConfiguration));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder preferredIPVersion(@Nullable Output<Either<String,PreferredIPVersion>> preferredIPVersion) {
            $.preferredIPVersion = preferredIPVersion;
            return this;
        }

        public Builder preferredIPVersion(Either<String,PreferredIPVersion> preferredIPVersion) {
            return preferredIPVersion(Output.of(preferredIPVersion));
        }

        public Builder protocol(Output<Either<String,ConnectionMonitorTestConfigurationProtocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(Either<String,ConnectionMonitorTestConfigurationProtocol> protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder successThreshold(@Nullable Output<ConnectionMonitorSuccessThresholdArgs> successThreshold) {
            $.successThreshold = successThreshold;
            return this;
        }

        public Builder successThreshold(ConnectionMonitorSuccessThresholdArgs successThreshold) {
            return successThreshold(Output.of(successThreshold));
        }

        public Builder tcpConfiguration(@Nullable Output<ConnectionMonitorTcpConfigurationArgs> tcpConfiguration) {
            $.tcpConfiguration = tcpConfiguration;
            return this;
        }

        public Builder tcpConfiguration(ConnectionMonitorTcpConfigurationArgs tcpConfiguration) {
            return tcpConfiguration(Output.of(tcpConfiguration));
        }

        public Builder testFrequencySec(@Nullable Output<Integer> testFrequencySec) {
            $.testFrequencySec = testFrequencySec;
            return this;
        }

        public Builder testFrequencySec(Integer testFrequencySec) {
            return testFrequencySec(Output.of(testFrequencySec));
        }

        public ConnectionMonitorTestConfigurationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
