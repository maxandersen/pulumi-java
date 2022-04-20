// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machines network configuration&#39;s DNS settings.
 * 
 */
public final class VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse Empty = new VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse();

    /**
     * List of DNS servers IP addresses
     * 
     */
    @Import(name="dnsServers")
      private final @Nullable List<String> dnsServers;

    public List<String> dnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }

    public VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse(@Nullable List<String> dnsServers) {
        this.dnsServers = dnsServers;
    }

    private VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse() {
        this.dnsServers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dnsServers;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
        }

        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }        public VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse build() {
            return new VirtualMachineNetworkInterfaceDnsSettingsConfigurationResponse(dnsServers);
        }
    }
}
