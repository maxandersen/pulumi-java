// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.NetworkInterfaceIPConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayBackendHealthServerResponse {
    /**
     * IP address or FQDN of backend server.
     * 
     */
    private final @Nullable String address;
    /**
     * Health of backend server.
     * 
     */
    private final @Nullable String health;
    /**
     * Health Probe Log.
     * 
     */
    private final @Nullable String healthProbeLog;
    /**
     * Reference to IP configuration of backend server.
     * 
     */
    private final @Nullable NetworkInterfaceIPConfigurationResponse ipConfiguration;

    @CustomType.Constructor
    private ApplicationGatewayBackendHealthServerResponse(
        @CustomType.Parameter("address") @Nullable String address,
        @CustomType.Parameter("health") @Nullable String health,
        @CustomType.Parameter("healthProbeLog") @Nullable String healthProbeLog,
        @CustomType.Parameter("ipConfiguration") @Nullable NetworkInterfaceIPConfigurationResponse ipConfiguration) {
        this.address = address;
        this.health = health;
        this.healthProbeLog = healthProbeLog;
        this.ipConfiguration = ipConfiguration;
    }

    /**
     * IP address or FQDN of backend server.
     * 
    */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * Health of backend server.
     * 
    */
    public Optional<String> health() {
        return Optional.ofNullable(this.health);
    }
    /**
     * Health Probe Log.
     * 
    */
    public Optional<String> healthProbeLog() {
        return Optional.ofNullable(this.healthProbeLog);
    }
    /**
     * Reference to IP configuration of backend server.
     * 
    */
    public Optional<NetworkInterfaceIPConfigurationResponse> ipConfiguration() {
        return Optional.ofNullable(this.ipConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayBackendHealthServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String health;
        private @Nullable String healthProbeLog;
        private @Nullable NetworkInterfaceIPConfigurationResponse ipConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayBackendHealthServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.health = defaults.health;
    	      this.healthProbeLog = defaults.healthProbeLog;
    	      this.ipConfiguration = defaults.ipConfiguration;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public Builder health(@Nullable String health) {
            this.health = health;
            return this;
        }
        public Builder healthProbeLog(@Nullable String healthProbeLog) {
            this.healthProbeLog = healthProbeLog;
            return this;
        }
        public Builder ipConfiguration(@Nullable NetworkInterfaceIPConfigurationResponse ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }        public ApplicationGatewayBackendHealthServerResponse build() {
            return new ApplicationGatewayBackendHealthServerResponse(address, health, healthProbeLog, ipConfiguration);
        }
    }
}
