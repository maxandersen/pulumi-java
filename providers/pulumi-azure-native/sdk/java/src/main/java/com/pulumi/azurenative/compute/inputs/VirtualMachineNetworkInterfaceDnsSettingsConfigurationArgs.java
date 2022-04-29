// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machines network configuration&#39;s DNS settings.
 * 
 */
public final class VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs extends ResourceArgs {

    public static final VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs Empty = new VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs();

    /**
     * List of DNS servers IP addresses
     * 
     */
    @Import(name="dnsServers")
    private @Nullable Output<List<String>> dnsServers;

    /**
     * @return List of DNS servers IP addresses
     * 
     */
    public Optional<Output<List<String>>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    private VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs() {}

    private VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs(VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs $) {
        this.dnsServers = $.dnsServers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs $;

        public Builder() {
            $ = new VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs();
        }

        public Builder(VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs defaults) {
            $ = new VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsServers List of DNS servers IP addresses
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        /**
         * @param dnsServers List of DNS servers IP addresses
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(List<String> dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        /**
         * @param dnsServers List of DNS servers IP addresses
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }

        public VirtualMachineNetworkInterfaceDnsSettingsConfigurationArgs build() {
            return $;
        }
    }

}
