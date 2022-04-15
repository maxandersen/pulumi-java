// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInterfaceIPConfigurationResponse {
    /**
     * The list of DNS servers IP addresses.
     * 
     */
    private final @Nullable List<String> dnsServers;
    /**
     * The value of the gateway.
     * 
     */
    private final @Nullable String gateway;
    /**
     * The value of the IP address.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * IP address allocation method.
     * 
     */
    private final @Nullable String ipAllocationMethod;
    /**
     * IP address version.
     * 
     */
    private final @Nullable String ipVersion;
    /**
     * The value of the subnet.
     * 
     */
    private final @Nullable String subnet;

    @CustomType.Constructor
    private NetworkInterfaceIPConfigurationResponse(
        @CustomType.Parameter("dnsServers") @Nullable List<String> dnsServers,
        @CustomType.Parameter("gateway") @Nullable String gateway,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("ipAllocationMethod") @Nullable String ipAllocationMethod,
        @CustomType.Parameter("ipVersion") @Nullable String ipVersion,
        @CustomType.Parameter("subnet") @Nullable String subnet) {
        this.dnsServers = dnsServers;
        this.gateway = gateway;
        this.ipAddress = ipAddress;
        this.ipAllocationMethod = ipAllocationMethod;
        this.ipVersion = ipVersion;
        this.subnet = subnet;
    }

    /**
     * The list of DNS servers IP addresses.
     * 
    */
    public List<String> dnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }
    /**
     * The value of the gateway.
     * 
    */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    /**
     * The value of the IP address.
     * 
    */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * IP address allocation method.
     * 
    */
    public Optional<String> ipAllocationMethod() {
        return Optional.ofNullable(this.ipAllocationMethod);
    }
    /**
     * IP address version.
     * 
    */
    public Optional<String> ipVersion() {
        return Optional.ofNullable(this.ipVersion);
    }
    /**
     * The value of the subnet.
     * 
    */
    public Optional<String> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dnsServers;
        private @Nullable String gateway;
        private @Nullable String ipAddress;
        private @Nullable String ipAllocationMethod;
        private @Nullable String ipVersion;
        private @Nullable String subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
    	      this.gateway = defaults.gateway;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipAllocationMethod = defaults.ipAllocationMethod;
    	      this.ipVersion = defaults.ipVersion;
    	      this.subnet = defaults.subnet;
        }

        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        public Builder gateway(@Nullable String gateway) {
            this.gateway = gateway;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAllocationMethod(@Nullable String ipAllocationMethod) {
            this.ipAllocationMethod = ipAllocationMethod;
            return this;
        }
        public Builder ipVersion(@Nullable String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }        public NetworkInterfaceIPConfigurationResponse build() {
            return new NetworkInterfaceIPConfigurationResponse(dnsServers, gateway, ipAddress, ipAllocationMethod, ipVersion, subnet);
        }
    }
}
