// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.SubResourceResponse;
import com.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetIPConfigurationResponse;
import com.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineScaleSetNetworkConfigurationResponse {
    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
     */
    private final @Nullable String deleteOption;
    /**
     * The dns settings to be applied on the network interfaces.
     * 
     */
    private final @Nullable VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse dnsSettings;
    /**
     * Specifies whether the network interface is accelerated networking-enabled.
     * 
     */
    private final @Nullable Boolean enableAcceleratedNetworking;
    /**
     * Specifies whether the network interface is FPGA networking-enabled.
     * 
     */
    private final @Nullable Boolean enableFpga;
    /**
     * Whether IP forwarding enabled on this NIC.
     * 
     */
    private final @Nullable Boolean enableIPForwarding;
    /**
     * Resource Id
     * 
     */
    private final @Nullable String id;
    /**
     * Specifies the IP configurations of the network interface.
     * 
     */
    private final List<VirtualMachineScaleSetIPConfigurationResponse> ipConfigurations;
    /**
     * The network configuration name.
     * 
     */
    private final String name;
    /**
     * The network security group.
     * 
     */
    private final @Nullable SubResourceResponse networkSecurityGroup;
    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    private final @Nullable Boolean primary;

    @CustomType.Constructor
    private VirtualMachineScaleSetNetworkConfigurationResponse(
        @CustomType.Parameter("deleteOption") @Nullable String deleteOption,
        @CustomType.Parameter("dnsSettings") @Nullable VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse dnsSettings,
        @CustomType.Parameter("enableAcceleratedNetworking") @Nullable Boolean enableAcceleratedNetworking,
        @CustomType.Parameter("enableFpga") @Nullable Boolean enableFpga,
        @CustomType.Parameter("enableIPForwarding") @Nullable Boolean enableIPForwarding,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipConfigurations") List<VirtualMachineScaleSetIPConfigurationResponse> ipConfigurations,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkSecurityGroup") @Nullable SubResourceResponse networkSecurityGroup,
        @CustomType.Parameter("primary") @Nullable Boolean primary) {
        this.deleteOption = deleteOption;
        this.dnsSettings = dnsSettings;
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        this.enableFpga = enableFpga;
        this.enableIPForwarding = enableIPForwarding;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.name = name;
        this.networkSecurityGroup = networkSecurityGroup;
        this.primary = primary;
    }

    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
    */
    public Optional<String> deleteOption() {
        return Optional.ofNullable(this.deleteOption);
    }
    /**
     * The dns settings to be applied on the network interfaces.
     * 
    */
    public Optional<VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse> dnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }
    /**
     * Specifies whether the network interface is accelerated networking-enabled.
     * 
    */
    public Optional<Boolean> enableAcceleratedNetworking() {
        return Optional.ofNullable(this.enableAcceleratedNetworking);
    }
    /**
     * Specifies whether the network interface is FPGA networking-enabled.
     * 
    */
    public Optional<Boolean> enableFpga() {
        return Optional.ofNullable(this.enableFpga);
    }
    /**
     * Whether IP forwarding enabled on this NIC.
     * 
    */
    public Optional<Boolean> enableIPForwarding() {
        return Optional.ofNullable(this.enableIPForwarding);
    }
    /**
     * Resource Id
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Specifies the IP configurations of the network interface.
     * 
    */
    public List<VirtualMachineScaleSetIPConfigurationResponse> ipConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * The network configuration name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The network security group.
     * 
    */
    public Optional<SubResourceResponse> networkSecurityGroup() {
        return Optional.ofNullable(this.networkSecurityGroup);
    }
    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
    */
    public Optional<Boolean> primary() {
        return Optional.ofNullable(this.primary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetNetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteOption;
        private @Nullable VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse dnsSettings;
        private @Nullable Boolean enableAcceleratedNetworking;
        private @Nullable Boolean enableFpga;
        private @Nullable Boolean enableIPForwarding;
        private @Nullable String id;
        private List<VirtualMachineScaleSetIPConfigurationResponse> ipConfigurations;
        private String name;
        private @Nullable SubResourceResponse networkSecurityGroup;
        private @Nullable Boolean primary;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetNetworkConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOption = defaults.deleteOption;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.enableAcceleratedNetworking = defaults.enableAcceleratedNetworking;
    	      this.enableFpga = defaults.enableFpga;
    	      this.enableIPForwarding = defaults.enableIPForwarding;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
    	      this.networkSecurityGroup = defaults.networkSecurityGroup;
    	      this.primary = defaults.primary;
        }

        public Builder deleteOption(@Nullable String deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }
        public Builder dnsSettings(@Nullable VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }
        public Builder enableAcceleratedNetworking(@Nullable Boolean enableAcceleratedNetworking) {
            this.enableAcceleratedNetworking = enableAcceleratedNetworking;
            return this;
        }
        public Builder enableFpga(@Nullable Boolean enableFpga) {
            this.enableFpga = enableFpga;
            return this;
        }
        public Builder enableIPForwarding(@Nullable Boolean enableIPForwarding) {
            this.enableIPForwarding = enableIPForwarding;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ipConfigurations(List<VirtualMachineScaleSetIPConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(VirtualMachineScaleSetIPConfigurationResponse... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkSecurityGroup(@Nullable SubResourceResponse networkSecurityGroup) {
            this.networkSecurityGroup = networkSecurityGroup;
            return this;
        }
        public Builder primary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }        public VirtualMachineScaleSetNetworkConfigurationResponse build() {
            return new VirtualMachineScaleSetNetworkConfigurationResponse(deleteOption, dnsSettings, enableAcceleratedNetworking, enableFpga, enableIPForwarding, id, ipConfigurations, name, networkSecurityGroup, primary);
        }
    }
}
