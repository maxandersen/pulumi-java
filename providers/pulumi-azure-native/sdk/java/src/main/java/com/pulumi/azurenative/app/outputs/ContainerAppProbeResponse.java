// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.outputs;

import com.pulumi.azurenative.app.outputs.ContainerAppProbeResponseHttpGet;
import com.pulumi.azurenative.app.outputs.ContainerAppProbeResponseTcpSocket;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerAppProbeResponse {
    /**
     * @return Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Maximum value is 10.
     * 
     */
    private final @Nullable Integer failureThreshold;
    /**
     * @return HTTPGet specifies the http request to perform.
     * 
     */
    private final @Nullable ContainerAppProbeResponseHttpGet httpGet;
    /**
     * @return Number of seconds after the container has started before liveness probes are initiated. Minimum value is 1. Maximum value is 60.
     * 
     */
    private final @Nullable Integer initialDelaySeconds;
    /**
     * @return How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value is 240.
     * 
     */
    private final @Nullable Integer periodSeconds;
    /**
     * @return Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Maximum value is 10.
     * 
     */
    private final @Nullable Integer successThreshold;
    /**
     * @return TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported.
     * 
     */
    private final @Nullable ContainerAppProbeResponseTcpSocket tcpSocket;
    /**
     * @return Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is an alpha field and requires enabling ProbeTerminationGracePeriod feature gate. Maximum value is 3600 seconds (1 hour)
     * 
     */
    private final @Nullable Double terminationGracePeriodSeconds;
    /**
     * @return Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 240.
     * 
     */
    private final @Nullable Integer timeoutSeconds;
    /**
     * @return The type of probe.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ContainerAppProbeResponse(
        @CustomType.Parameter("failureThreshold") @Nullable Integer failureThreshold,
        @CustomType.Parameter("httpGet") @Nullable ContainerAppProbeResponseHttpGet httpGet,
        @CustomType.Parameter("initialDelaySeconds") @Nullable Integer initialDelaySeconds,
        @CustomType.Parameter("periodSeconds") @Nullable Integer periodSeconds,
        @CustomType.Parameter("successThreshold") @Nullable Integer successThreshold,
        @CustomType.Parameter("tcpSocket") @Nullable ContainerAppProbeResponseTcpSocket tcpSocket,
        @CustomType.Parameter("terminationGracePeriodSeconds") @Nullable Double terminationGracePeriodSeconds,
        @CustomType.Parameter("timeoutSeconds") @Nullable Integer timeoutSeconds,
        @CustomType.Parameter("type") @Nullable String type) {
        this.failureThreshold = failureThreshold;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.tcpSocket = tcpSocket;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.timeoutSeconds = timeoutSeconds;
        this.type = type;
    }

    /**
     * @return Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Maximum value is 10.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * @return HTTPGet specifies the http request to perform.
     * 
     */
    public Optional<ContainerAppProbeResponseHttpGet> httpGet() {
        return Optional.ofNullable(this.httpGet);
    }
    /**
     * @return Number of seconds after the container has started before liveness probes are initiated. Minimum value is 1. Maximum value is 60.
     * 
     */
    public Optional<Integer> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }
    /**
     * @return How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value is 240.
     * 
     */
    public Optional<Integer> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    /**
     * @return Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Maximum value is 10.
     * 
     */
    public Optional<Integer> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * @return TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported.
     * 
     */
    public Optional<ContainerAppProbeResponseTcpSocket> tcpSocket() {
        return Optional.ofNullable(this.tcpSocket);
    }
    /**
     * @return Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is an alpha field and requires enabling ProbeTerminationGracePeriod feature gate. Maximum value is 3600 seconds (1 hour)
     * 
     */
    public Optional<Double> terminationGracePeriodSeconds() {
        return Optional.ofNullable(this.terminationGracePeriodSeconds);
    }
    /**
     * @return Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 240.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }
    /**
     * @return The type of probe.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerAppProbeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer failureThreshold;
        private @Nullable ContainerAppProbeResponseHttpGet httpGet;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable ContainerAppProbeResponseTcpSocket tcpSocket;
        private @Nullable Double terminationGracePeriodSeconds;
        private @Nullable Integer timeoutSeconds;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerAppProbeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.httpGet = defaults.httpGet;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.tcpSocket = defaults.tcpSocket;
    	      this.terminationGracePeriodSeconds = defaults.terminationGracePeriodSeconds;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.type = defaults.type;
        }

        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder httpGet(@Nullable ContainerAppProbeResponseHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public Builder initialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Builder periodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Builder successThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Builder tcpSocket(@Nullable ContainerAppProbeResponseTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public Builder terminationGracePeriodSeconds(@Nullable Double terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ContainerAppProbeResponse build() {
            return new ContainerAppProbeResponse(failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, terminationGracePeriodSeconds, timeoutSeconds, type);
        }
    }
}
