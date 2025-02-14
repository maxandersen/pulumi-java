// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.outputs;

import com.pulumi.azurenative.containerinstance.outputs.ContainerExecResponse;
import com.pulumi.azurenative.containerinstance.outputs.ContainerHttpGetResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerProbeResponse {
    /**
     * @return The execution command to probe
     * 
     */
    private final @Nullable ContainerExecResponse exec;
    /**
     * @return The failure threshold.
     * 
     */
    private final @Nullable Integer failureThreshold;
    /**
     * @return The Http Get settings to probe
     * 
     */
    private final @Nullable ContainerHttpGetResponse httpGet;
    /**
     * @return The initial delay seconds.
     * 
     */
    private final @Nullable Integer initialDelaySeconds;
    /**
     * @return The period seconds.
     * 
     */
    private final @Nullable Integer periodSeconds;
    /**
     * @return The success threshold.
     * 
     */
    private final @Nullable Integer successThreshold;
    /**
     * @return The timeout seconds.
     * 
     */
    private final @Nullable Integer timeoutSeconds;

    @CustomType.Constructor
    private ContainerProbeResponse(
        @CustomType.Parameter("exec") @Nullable ContainerExecResponse exec,
        @CustomType.Parameter("failureThreshold") @Nullable Integer failureThreshold,
        @CustomType.Parameter("httpGet") @Nullable ContainerHttpGetResponse httpGet,
        @CustomType.Parameter("initialDelaySeconds") @Nullable Integer initialDelaySeconds,
        @CustomType.Parameter("periodSeconds") @Nullable Integer periodSeconds,
        @CustomType.Parameter("successThreshold") @Nullable Integer successThreshold,
        @CustomType.Parameter("timeoutSeconds") @Nullable Integer timeoutSeconds) {
        this.exec = exec;
        this.failureThreshold = failureThreshold;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * @return The execution command to probe
     * 
     */
    public Optional<ContainerExecResponse> exec() {
        return Optional.ofNullable(this.exec);
    }
    /**
     * @return The failure threshold.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * @return The Http Get settings to probe
     * 
     */
    public Optional<ContainerHttpGetResponse> httpGet() {
        return Optional.ofNullable(this.httpGet);
    }
    /**
     * @return The initial delay seconds.
     * 
     */
    public Optional<Integer> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }
    /**
     * @return The period seconds.
     * 
     */
    public Optional<Integer> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    /**
     * @return The success threshold.
     * 
     */
    public Optional<Integer> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * @return The timeout seconds.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerProbeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerExecResponse exec;
        private @Nullable Integer failureThreshold;
        private @Nullable ContainerHttpGetResponse httpGet;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerProbeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.httpGet = defaults.httpGet;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder exec(@Nullable ContainerExecResponse exec) {
            this.exec = exec;
            return this;
        }
        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder httpGet(@Nullable ContainerHttpGetResponse httpGet) {
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
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }        public ContainerProbeResponse build() {
            return new ContainerProbeResponse(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, timeoutSeconds);
        }
    }
}
