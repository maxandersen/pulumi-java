// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.MonitorProtocol;
import com.pulumi.azurenative.network.enums.ProfileMonitorStatus;
import com.pulumi.azurenative.network.inputs.MonitorConfigCustomHeadersArgs;
import com.pulumi.azurenative.network.inputs.MonitorConfigExpectedStatusCodeRangesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class containing endpoint monitoring settings in a Traffic Manager profile.
 * 
 */
public final class MonitorConfigArgs extends ResourceArgs {

    public static final MonitorConfigArgs Empty = new MonitorConfigArgs();

    /**
     * List of custom headers.
     * 
     */
    @Import(name="customHeaders")
    private @Nullable Output<List<MonitorConfigCustomHeadersArgs>> customHeaders;

    /**
     * @return List of custom headers.
     * 
     */
    public Optional<Output<List<MonitorConfigCustomHeadersArgs>>> customHeaders() {
        return Optional.ofNullable(this.customHeaders);
    }

    /**
     * List of expected status code ranges.
     * 
     */
    @Import(name="expectedStatusCodeRanges")
    private @Nullable Output<List<MonitorConfigExpectedStatusCodeRangesArgs>> expectedStatusCodeRanges;

    /**
     * @return List of expected status code ranges.
     * 
     */
    public Optional<Output<List<MonitorConfigExpectedStatusCodeRangesArgs>>> expectedStatusCodeRanges() {
        return Optional.ofNullable(this.expectedStatusCodeRanges);
    }

    /**
     * The monitor interval for endpoints in this profile. This is the interval at which Traffic Manager will check the health of each endpoint in this profile.
     * 
     */
    @Import(name="intervalInSeconds")
    private @Nullable Output<Double> intervalInSeconds;

    /**
     * @return The monitor interval for endpoints in this profile. This is the interval at which Traffic Manager will check the health of each endpoint in this profile.
     * 
     */
    public Optional<Output<Double>> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }

    /**
     * The path relative to the endpoint domain name used to probe for endpoint health.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path relative to the endpoint domain name used to probe for endpoint health.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The TCP port used to probe for endpoint health.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Double> port;

    /**
     * @return The TCP port used to probe for endpoint health.
     * 
     */
    public Optional<Output<Double>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The profile-level monitoring status of the Traffic Manager profile.
     * 
     */
    @Import(name="profileMonitorStatus")
    private @Nullable Output<Either<String,ProfileMonitorStatus>> profileMonitorStatus;

    /**
     * @return The profile-level monitoring status of the Traffic Manager profile.
     * 
     */
    public Optional<Output<Either<String,ProfileMonitorStatus>>> profileMonitorStatus() {
        return Optional.ofNullable(this.profileMonitorStatus);
    }

    /**
     * The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<Either<String,MonitorProtocol>> protocol;

    /**
     * @return The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
     * 
     */
    public Optional<Output<Either<String,MonitorProtocol>>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The monitor timeout for endpoints in this profile. This is the time that Traffic Manager allows endpoints in this profile to response to the health check.
     * 
     */
    @Import(name="timeoutInSeconds")
    private @Nullable Output<Double> timeoutInSeconds;

    /**
     * @return The monitor timeout for endpoints in this profile. This is the time that Traffic Manager allows endpoints in this profile to response to the health check.
     * 
     */
    public Optional<Output<Double>> timeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }

    /**
     * The number of consecutive failed health check that Traffic Manager tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
     * 
     */
    @Import(name="toleratedNumberOfFailures")
    private @Nullable Output<Double> toleratedNumberOfFailures;

    /**
     * @return The number of consecutive failed health check that Traffic Manager tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
     * 
     */
    public Optional<Output<Double>> toleratedNumberOfFailures() {
        return Optional.ofNullable(this.toleratedNumberOfFailures);
    }

    private MonitorConfigArgs() {}

    private MonitorConfigArgs(MonitorConfigArgs $) {
        this.customHeaders = $.customHeaders;
        this.expectedStatusCodeRanges = $.expectedStatusCodeRanges;
        this.intervalInSeconds = $.intervalInSeconds;
        this.path = $.path;
        this.port = $.port;
        this.profileMonitorStatus = $.profileMonitorStatus;
        this.protocol = $.protocol;
        this.timeoutInSeconds = $.timeoutInSeconds;
        this.toleratedNumberOfFailures = $.toleratedNumberOfFailures;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorConfigArgs $;

        public Builder() {
            $ = new MonitorConfigArgs();
        }

        public Builder(MonitorConfigArgs defaults) {
            $ = new MonitorConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customHeaders List of custom headers.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(@Nullable Output<List<MonitorConfigCustomHeadersArgs>> customHeaders) {
            $.customHeaders = customHeaders;
            return this;
        }

        /**
         * @param customHeaders List of custom headers.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(List<MonitorConfigCustomHeadersArgs> customHeaders) {
            return customHeaders(Output.of(customHeaders));
        }

        /**
         * @param customHeaders List of custom headers.
         * 
         * @return builder
         * 
         */
        public Builder customHeaders(MonitorConfigCustomHeadersArgs... customHeaders) {
            return customHeaders(List.of(customHeaders));
        }

        /**
         * @param expectedStatusCodeRanges List of expected status code ranges.
         * 
         * @return builder
         * 
         */
        public Builder expectedStatusCodeRanges(@Nullable Output<List<MonitorConfigExpectedStatusCodeRangesArgs>> expectedStatusCodeRanges) {
            $.expectedStatusCodeRanges = expectedStatusCodeRanges;
            return this;
        }

        /**
         * @param expectedStatusCodeRanges List of expected status code ranges.
         * 
         * @return builder
         * 
         */
        public Builder expectedStatusCodeRanges(List<MonitorConfigExpectedStatusCodeRangesArgs> expectedStatusCodeRanges) {
            return expectedStatusCodeRanges(Output.of(expectedStatusCodeRanges));
        }

        /**
         * @param expectedStatusCodeRanges List of expected status code ranges.
         * 
         * @return builder
         * 
         */
        public Builder expectedStatusCodeRanges(MonitorConfigExpectedStatusCodeRangesArgs... expectedStatusCodeRanges) {
            return expectedStatusCodeRanges(List.of(expectedStatusCodeRanges));
        }

        /**
         * @param intervalInSeconds The monitor interval for endpoints in this profile. This is the interval at which Traffic Manager will check the health of each endpoint in this profile.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(@Nullable Output<Double> intervalInSeconds) {
            $.intervalInSeconds = intervalInSeconds;
            return this;
        }

        /**
         * @param intervalInSeconds The monitor interval for endpoints in this profile. This is the interval at which Traffic Manager will check the health of each endpoint in this profile.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(Double intervalInSeconds) {
            return intervalInSeconds(Output.of(intervalInSeconds));
        }

        /**
         * @param path The path relative to the endpoint domain name used to probe for endpoint health.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path relative to the endpoint domain name used to probe for endpoint health.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port The TCP port used to probe for endpoint health.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Double> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The TCP port used to probe for endpoint health.
         * 
         * @return builder
         * 
         */
        public Builder port(Double port) {
            return port(Output.of(port));
        }

        /**
         * @param profileMonitorStatus The profile-level monitoring status of the Traffic Manager profile.
         * 
         * @return builder
         * 
         */
        public Builder profileMonitorStatus(@Nullable Output<Either<String,ProfileMonitorStatus>> profileMonitorStatus) {
            $.profileMonitorStatus = profileMonitorStatus;
            return this;
        }

        /**
         * @param profileMonitorStatus The profile-level monitoring status of the Traffic Manager profile.
         * 
         * @return builder
         * 
         */
        public Builder profileMonitorStatus(Either<String,ProfileMonitorStatus> profileMonitorStatus) {
            return profileMonitorStatus(Output.of(profileMonitorStatus));
        }

        /**
         * @param profileMonitorStatus The profile-level monitoring status of the Traffic Manager profile.
         * 
         * @return builder
         * 
         */
        public Builder profileMonitorStatus(String profileMonitorStatus) {
            return profileMonitorStatus(Either.ofLeft(profileMonitorStatus));
        }

        /**
         * @param profileMonitorStatus The profile-level monitoring status of the Traffic Manager profile.
         * 
         * @return builder
         * 
         */
        public Builder profileMonitorStatus(ProfileMonitorStatus profileMonitorStatus) {
            return profileMonitorStatus(Either.ofRight(profileMonitorStatus));
        }

        /**
         * @param protocol The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<Either<String,MonitorProtocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Either<String,MonitorProtocol> protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param protocol The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Either.ofLeft(protocol));
        }

        /**
         * @param protocol The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
         * 
         * @return builder
         * 
         */
        public Builder protocol(MonitorProtocol protocol) {
            return protocol(Either.ofRight(protocol));
        }

        /**
         * @param timeoutInSeconds The monitor timeout for endpoints in this profile. This is the time that Traffic Manager allows endpoints in this profile to response to the health check.
         * 
         * @return builder
         * 
         */
        public Builder timeoutInSeconds(@Nullable Output<Double> timeoutInSeconds) {
            $.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        /**
         * @param timeoutInSeconds The monitor timeout for endpoints in this profile. This is the time that Traffic Manager allows endpoints in this profile to response to the health check.
         * 
         * @return builder
         * 
         */
        public Builder timeoutInSeconds(Double timeoutInSeconds) {
            return timeoutInSeconds(Output.of(timeoutInSeconds));
        }

        /**
         * @param toleratedNumberOfFailures The number of consecutive failed health check that Traffic Manager tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
         * 
         * @return builder
         * 
         */
        public Builder toleratedNumberOfFailures(@Nullable Output<Double> toleratedNumberOfFailures) {
            $.toleratedNumberOfFailures = toleratedNumberOfFailures;
            return this;
        }

        /**
         * @param toleratedNumberOfFailures The number of consecutive failed health check that Traffic Manager tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
         * 
         * @return builder
         * 
         */
        public Builder toleratedNumberOfFailures(Double toleratedNumberOfFailures) {
            return toleratedNumberOfFailures(Output.of(toleratedNumberOfFailures));
        }

        public MonitorConfigArgs build() {
            return $;
        }
    }

}
