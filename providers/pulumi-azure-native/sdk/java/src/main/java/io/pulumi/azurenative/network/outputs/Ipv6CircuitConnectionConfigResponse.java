// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Ipv6CircuitConnectionConfigResponse {
    /**
     * /125 IP address space to carve out customer addresses for global reach.
     * 
     */
    private final @Nullable String addressPrefix;
    /**
     * Express Route Circuit connection state.
     * 
     */
    private final String circuitConnectionStatus;

    @CustomType.Constructor
    private Ipv6CircuitConnectionConfigResponse(
        @CustomType.Parameter("addressPrefix") @Nullable String addressPrefix,
        @CustomType.Parameter("circuitConnectionStatus") String circuitConnectionStatus) {
        this.addressPrefix = addressPrefix;
        this.circuitConnectionStatus = circuitConnectionStatus;
    }

    /**
     * /125 IP address space to carve out customer addresses for global reach.
     * 
    */
    public Optional<String> addressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }
    /**
     * Express Route Circuit connection state.
     * 
    */
    public String circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Ipv6CircuitConnectionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private String circuitConnectionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(Ipv6CircuitConnectionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.circuitConnectionStatus = defaults.circuitConnectionStatus;
        }

        public Builder addressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }
        public Builder circuitConnectionStatus(String circuitConnectionStatus) {
            this.circuitConnectionStatus = Objects.requireNonNull(circuitConnectionStatus);
            return this;
        }        public Ipv6CircuitConnectionConfigResponse build() {
            return new Ipv6CircuitConnectionConfigResponse(addressPrefix, circuitConnectionStatus);
        }
    }
}
