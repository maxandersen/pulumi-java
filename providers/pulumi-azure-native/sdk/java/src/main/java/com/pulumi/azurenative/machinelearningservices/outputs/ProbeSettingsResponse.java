// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProbeSettingsResponse {
    /**
     * The number of failures to allow before returning an unhealthy status.
     * 
     */
    private final @Nullable Integer failureThreshold;
    /**
     * The delay before the first probe in ISO 8601 format.
     * 
     */
    private final @Nullable String initialDelay;
    /**
     * The length of time between probes in ISO 8601 format.
     * 
     */
    private final @Nullable String period;
    /**
     * The number of successful probes before returning a healthy status.
     * 
     */
    private final @Nullable Integer successThreshold;
    /**
     * The probe timeout in ISO 8601 format.
     * 
     */
    private final @Nullable String timeout;

    @CustomType.Constructor
    private ProbeSettingsResponse(
        @CustomType.Parameter("failureThreshold") @Nullable Integer failureThreshold,
        @CustomType.Parameter("initialDelay") @Nullable String initialDelay,
        @CustomType.Parameter("period") @Nullable String period,
        @CustomType.Parameter("successThreshold") @Nullable Integer successThreshold,
        @CustomType.Parameter("timeout") @Nullable String timeout) {
        this.failureThreshold = failureThreshold;
        this.initialDelay = initialDelay;
        this.period = period;
        this.successThreshold = successThreshold;
        this.timeout = timeout;
    }

    /**
     * The number of failures to allow before returning an unhealthy status.
     * 
    */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * The delay before the first probe in ISO 8601 format.
     * 
    */
    public Optional<String> initialDelay() {
        return Optional.ofNullable(this.initialDelay);
    }
    /**
     * The length of time between probes in ISO 8601 format.
     * 
    */
    public Optional<String> period() {
        return Optional.ofNullable(this.period);
    }
    /**
     * The number of successful probes before returning a healthy status.
     * 
    */
    public Optional<Integer> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * The probe timeout in ISO 8601 format.
     * 
    */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
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
