// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.MonitorProtocol;
import io.pulumi.azurenative.network.enums.ProfileMonitorStatus;
import io.pulumi.azurenative.network.inputs.MonitorConfigCustomHeadersArgs;
import io.pulumi.azurenative.network.inputs.MonitorConfigExpectedStatusCodeRangesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class containing endpoint monitoring settings in a Traffic Manager profile.
 * 
 */
public final class MonitorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitorConfigArgs Empty = new MonitorConfigArgs();

    /**
     * List of custom headers.
     * 
     */
    @Import(name="customHeaders")
      private final @Nullable Output<List<MonitorConfigCustomHeadersArgs>> customHeaders;

    public Output<List<MonitorConfigCustomHeadersArgs>> customHeaders() {
        return this.customHeaders == null ? Codegen.empty() : this.customHeaders;
    }

    /**
     * List of expected status code ranges.
     * 
     */
    @Import(name="expectedStatusCodeRanges")
      private final @Nullable Output<List<MonitorConfigExpectedStatusCodeRangesArgs>> expectedStatusCodeRanges;

    public Output<List<MonitorConfigExpectedStatusCodeRangesArgs>> expectedStatusCodeRanges() {
        return this.expectedStatusCodeRanges == null ? Codegen.empty() : this.expectedStatusCodeRanges;
    }

    /**
     * The monitor interval for endpoints in this profile. This is the interval at which Traffic Manager will check the health of each endpoint in this profile.
     * 
     */
    @Import(name="intervalInSeconds")
      private final @Nullable Output<Double> intervalInSeconds;

    public Output<Double> intervalInSeconds() {
        return this.intervalInSeconds == null ? Codegen.empty() : this.intervalInSeconds;
    }

    /**
     * The path relative to the endpoint domain name used to probe for endpoint health.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * The TCP port used to probe for endpoint health.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Double> port;

    public Output<Double> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The profile-level monitoring status of the Traffic Manager profile.
     * 
     */
    @Import(name="profileMonitorStatus")
      private final @Nullable Output<Either<String,ProfileMonitorStatus>> profileMonitorStatus;

    public Output<Either<String,ProfileMonitorStatus>> profileMonitorStatus() {
        return this.profileMonitorStatus == null ? Codegen.empty() : this.profileMonitorStatus;
    }

    /**
     * The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<Either<String,MonitorProtocol>> protocol;

    public Output<Either<String,MonitorProtocol>> protocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    /**
     * The monitor timeout for endpoints in this profile. This is the time that Traffic Manager allows endpoints in this profile to response to the health check.
     * 
     */
    @Import(name="timeoutInSeconds")
      private final @Nullable Output<Double> timeoutInSeconds;

    public Output<Double> timeoutInSeconds() {
        return this.timeoutInSeconds == null ? Codegen.empty() : this.timeoutInSeconds;
    }

    /**
     * The number of consecutive failed health check that Traffic Manager tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
     * 
     */
    @Import(name="toleratedNumberOfFailures")
      private final @Nullable Output<Double> toleratedNumberOfFailures;

    public Output<Double> toleratedNumberOfFailures() {
        return this.toleratedNumberOfFailures == null ? Codegen.empty() : this.toleratedNumberOfFailures;
    }

    public MonitorConfigArgs(
        @Nullable Output<List<MonitorConfigCustomHeadersArgs>> customHeaders,
        @Nullable Output<List<MonitorConfigExpectedStatusCodeRangesArgs>> expectedStatusCodeRanges,
        @Nullable Output<Double> intervalInSeconds,
        @Nullable Output<String> path,
        @Nullable Output<Double> port,
        @Nullable Output<Either<String,ProfileMonitorStatus>> profileMonitorStatus,
        @Nullable Output<Either<String,MonitorProtocol>> protocol,
        @Nullable Output<Double> timeoutInSeconds,
        @Nullable Output<Double> toleratedNumberOfFailures) {
        this.customHeaders = customHeaders;
        this.expectedStatusCodeRanges = expectedStatusCodeRanges;
        this.intervalInSeconds = intervalInSeconds;
        this.path = path;
        this.port = port;
        this.profileMonitorStatus = profileMonitorStatus;
        this.protocol = protocol;
        this.timeoutInSeconds = timeoutInSeconds;
        this.toleratedNumberOfFailures = toleratedNumberOfFailures;
    }

    private MonitorConfigArgs() {
        this.customHeaders = Codegen.empty();
        this.expectedStatusCodeRanges = Codegen.empty();
        this.intervalInSeconds = Codegen.empty();
        this.path = Codegen.empty();
        this.port = Codegen.empty();
        this.profileMonitorStatus = Codegen.empty();
        this.protocol = Codegen.empty();
        this.timeoutInSeconds = Codegen.empty();
        this.toleratedNumberOfFailures = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<MonitorConfigCustomHeadersArgs>> customHeaders;
        private @Nullable Output<List<MonitorConfigExpectedStatusCodeRangesArgs>> expectedStatusCodeRanges;
        private @Nullable Output<Double> intervalInSeconds;
        private @Nullable Output<String> path;
        private @Nullable Output<Double> port;
        private @Nullable Output<Either<String,ProfileMonitorStatus>> profileMonitorStatus;
        private @Nullable Output<Either<String,MonitorProtocol>> protocol;
        private @Nullable Output<Double> timeoutInSeconds;
        private @Nullable Output<Double> toleratedNumberOfFailures;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHeaders = defaults.customHeaders;
    	      this.expectedStatusCodeRanges = defaults.expectedStatusCodeRanges;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.profileMonitorStatus = defaults.profileMonitorStatus;
    	      this.protocol = defaults.protocol;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.toleratedNumberOfFailures = defaults.toleratedNumberOfFailures;
        }

        public Builder customHeaders(@Nullable Output<List<MonitorConfigCustomHeadersArgs>> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public Builder customHeaders(@Nullable List<MonitorConfigCustomHeadersArgs> customHeaders) {
            this.customHeaders = Codegen.ofNullable(customHeaders);
            return this;
        }
        public Builder customHeaders(MonitorConfigCustomHeadersArgs... customHeaders) {
            return customHeaders(List.of(customHeaders));
        }
        public Builder expectedStatusCodeRanges(@Nullable Output<List<MonitorConfigExpectedStatusCodeRangesArgs>> expectedStatusCodeRanges) {
            this.expectedStatusCodeRanges = expectedStatusCodeRanges;
            return this;
        }
        public Builder expectedStatusCodeRanges(@Nullable List<MonitorConfigExpectedStatusCodeRangesArgs> expectedStatusCodeRanges) {
            this.expectedStatusCodeRanges = Codegen.ofNullable(expectedStatusCodeRanges);
            return this;
        }
        public Builder expectedStatusCodeRanges(MonitorConfigExpectedStatusCodeRangesArgs... expectedStatusCodeRanges) {
            return expectedStatusCodeRanges(List.of(expectedStatusCodeRanges));
        }
        public Builder intervalInSeconds(@Nullable Output<Double> intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }
        public Builder intervalInSeconds(@Nullable Double intervalInSeconds) {
            this.intervalInSeconds = Codegen.ofNullable(intervalInSeconds);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder port(@Nullable Output<Double> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Double port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder profileMonitorStatus(@Nullable Output<Either<String,ProfileMonitorStatus>> profileMonitorStatus) {
            this.profileMonitorStatus = profileMonitorStatus;
            return this;
        }
        public Builder profileMonitorStatus(@Nullable Either<String,ProfileMonitorStatus> profileMonitorStatus) {
            this.profileMonitorStatus = Codegen.ofNullable(profileMonitorStatus);
            return this;
        }
        public Builder protocol(@Nullable Output<Either<String,MonitorProtocol>> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable Either<String,MonitorProtocol> protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Output<Double> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Double timeoutInSeconds) {
            this.timeoutInSeconds = Codegen.ofNullable(timeoutInSeconds);
            return this;
        }
        public Builder toleratedNumberOfFailures(@Nullable Output<Double> toleratedNumberOfFailures) {
            this.toleratedNumberOfFailures = toleratedNumberOfFailures;
            return this;
        }
        public Builder toleratedNumberOfFailures(@Nullable Double toleratedNumberOfFailures) {
            this.toleratedNumberOfFailures = Codegen.ofNullable(toleratedNumberOfFailures);
            return this;
        }        public MonitorConfigArgs build() {
            return new MonitorConfigArgs(customHeaders, expectedStatusCodeRanges, intervalInSeconds, path, port, profileMonitorStatus, protocol, timeoutInSeconds, toleratedNumberOfFailures);
        }
    }
}
