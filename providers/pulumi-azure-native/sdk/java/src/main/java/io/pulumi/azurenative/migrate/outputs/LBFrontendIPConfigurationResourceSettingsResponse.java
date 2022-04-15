// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.SubnetReferenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LBFrontendIPConfigurationResourceSettingsResponse {
    /**
     * Gets or sets the frontend IP configuration name.
     * 
     */
    private final @Nullable String name;
    /**
     * Gets or sets the IP address of the Load Balancer.This is only specified if a specific
     * private IP address shall be allocated from the subnet specified in subnetRef.
     * 
     */
    private final @Nullable String privateIpAddress;
    /**
     * Gets or sets PrivateIP allocation method (Static/Dynamic).
     * 
     */
    private final @Nullable String privateIpAllocationMethod;
    /**
     * Defines reference to subnet.
     * 
     */
    private final @Nullable SubnetReferenceResponse subnet;
    /**
     * Gets or sets the csv list of zones.
     * 
     */
    private final @Nullable String zones;

    @CustomType.Constructor
    private LBFrontendIPConfigurationResourceSettingsResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("privateIpAddress") @Nullable String privateIpAddress,
        @CustomType.Parameter("privateIpAllocationMethod") @Nullable String privateIpAllocationMethod,
        @CustomType.Parameter("subnet") @Nullable SubnetReferenceResponse subnet,
        @CustomType.Parameter("zones") @Nullable String zones) {
        this.name = name;
        this.privateIpAddress = privateIpAddress;
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        this.subnet = subnet;
        this.zones = zones;
    }

    /**
     * Gets or sets the frontend IP configuration name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Gets or sets the IP address of the Load Balancer.This is only specified if a specific
     * private IP address shall be allocated from the subnet specified in subnetRef.
     * 
    */
    public Optional<String> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }
    /**
     * Gets or sets PrivateIP allocation method (Static/Dynamic).
     * 
    */
    public Optional<String> privateIpAllocationMethod() {
        return Optional.ofNullable(this.privateIpAllocationMethod);
    }
    /**
     * Defines reference to subnet.
     * 
    */
    public Optional<SubnetReferenceResponse> subnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * Gets or sets the csv list of zones.
     * 
    */
    public Optional<String> zones() {
        return Optional.ofNullable(this.zones);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LBFrontendIPConfigurationResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String privateIpAddress;
        private @Nullable String privateIpAllocationMethod;
        private @Nullable SubnetReferenceResponse subnet;
        private @Nullable String zones;

        public Builder() {
    	      // Empty
        }

        public Builder(LBFrontendIPConfigurationResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.privateIpAllocationMethod = defaults.privateIpAllocationMethod;
    	      this.subnet = defaults.subnet;
    	      this.zones = defaults.zones;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public Builder privateIpAllocationMethod(@Nullable String privateIpAllocationMethod) {
            this.privateIpAllocationMethod = privateIpAllocationMethod;
            return this;
        }
        public Builder subnet(@Nullable SubnetReferenceResponse subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder zones(@Nullable String zones) {
            this.zones = zones;
            return this;
        }        public LBFrontendIPConfigurationResourceSettingsResponse build() {
            return new LBFrontendIPConfigurationResourceSettingsResponse(name, privateIpAddress, privateIpAllocationMethod, subnet, zones);
        }
    }
}
