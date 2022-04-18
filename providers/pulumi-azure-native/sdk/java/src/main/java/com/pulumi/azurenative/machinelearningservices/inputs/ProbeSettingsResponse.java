// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deployment container liveness/readiness probe configuration.
 * 
 */
public final class ProbeSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ProbeSettingsResponse Empty = new ProbeSettingsResponse();

    /**
     * The number of failures to allow before returning an unhealthy status.
     * 
     */
    @Import(name="failureThreshold")
      private final @Nullable Integer failureThreshold;

    public Optional<Integer> failureThreshold() {
        return this.failureThreshold == null ? Optional.empty() : Optional.ofNullable(this.failureThreshold);
    }

    /**
     * The delay before the first probe in ISO 8601 format.
     * 
     */
    @Import(name="initialDelay")
      private final @Nullable String initialDelay;

    public Optional<String> initialDelay() {
        return this.initialDelay == null ? Optional.empty() : Optional.ofNullable(this.initialDelay);
    }

    /**
     * The length of time between probes in ISO 8601 format.
     * 
     */
    @Import(name="period")
      private final @Nullable String period;

    public Optional<String> period() {
        return this.period == null ? Optional.empty() : Optional.ofNullable(this.period);
    }

    /**
     * The number of successful probes before returning a healthy status.
     * 
     */
    @Import(name="successThreshold")
      private final @Nullable Integer successThreshold;

    public Optional<Integer> successThreshold() {
        return this.successThreshold == null ? Optional.empty() : Optional.ofNullable(this.successThreshold);
    }

    /**
     * The probe timeout in ISO 8601 format.
     * 
     */
    @Import(name="timeout")
      private final @Nullable String timeout;

    public Optional<String> timeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    public ProbeSettingsResponse(
        @Nullable Integer failureThreshold,
        @Nullable String initialDelay,
        @Nullable String period,
        @Nullable Integer successThreshold,
        @Nullable String timeout) {
        this.failureThreshold = failureThreshold;
        this.initialDelay = initialDelay;
        this.period = period;
        this.successThreshold = successThreshold;
        this.timeout = timeout;
    }

    private ProbeSettingsResponse() {
        this.failureThreshold = null;
        this.initialDelay = null;
        this.period = null;
        this.successThreshold = null;
        this.timeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProbeSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer failureThreshold;
        private @Nullable String initialDelay;
        private @Nullable String period;
        private @Nullable Integer successThreshold;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ProbeSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.initialDelay = defaults.initialDelay;
    	      this.period = defaults.period;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder initialDelay(@Nullable String initialDelay) {
            this.initialDelay = initialDelay;
            return this;
        }
        public Builder period(@Nullable String period) {
            this.period = period;
            return this;
        }
        public Builder successThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }        public ProbeSettingsResponse build() {
            return new ProbeSettingsResponse(failureThreshold, initialDelay, period, successThreshold, timeout);
        }
    }
}
