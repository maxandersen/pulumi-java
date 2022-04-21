// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machines scale sets network configuration&#39;s DNS settings.
 * 
 */
public final class VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs Empty = new VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs();

    /**
     * List of DNS servers IP addresses
     * 
     */
    @Import(name="dnsServers")
    private @Nullable Output<List<String>> dnsServers;

    public Optional<Output<List<String>>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    private VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs() {}

    private VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs(VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs $) {
        this.dnsServers = $.dnsServers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs $;

        public Builder() {
            $ = new VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs();
        }

        public Builder(VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs defaults) {
            $ = new VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        public Builder dnsServers(List<String> dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }

        public VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs build() {
            return $;
        }
    }

}
