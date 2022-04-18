// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.ApiEntityReferenceResponse;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetNetworkConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set network profile.
 * 
 */
public final class VirtualMachineScaleSetNetworkProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetNetworkProfileResponse Empty = new VirtualMachineScaleSetNetworkProfileResponse();

    /**
     * A reference to a load balancer probe used to determine the health of an instance in the virtual machine scale set. The reference will be in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}'.
     * 
     */
    @Import(name="healthProbe")
      private final @Nullable ApiEntityReferenceResponse healthProbe;

    public Optional<ApiEntityReferenceResponse> healthProbe() {
        return this.healthProbe == null ? Optional.empty() : Optional.ofNullable(this.healthProbe);
    }

    /**
     * specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations for Virtual Machine Scale Set with orchestration mode 'Flexible'
     * 
     */
    @Import(name="networkApiVersion")
      private final @Nullable String networkApiVersion;

    public Optional<String> networkApiVersion() {
        return this.networkApiVersion == null ? Optional.empty() : Optional.ofNullable(this.networkApiVersion);
    }

    /**
     * The list of network configurations.
     * 
     */
    @Import(name="networkInterfaceConfigurations")
      private final @Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations;

    public List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations() {
        return this.networkInterfaceConfigurations == null ? List.of() : this.networkInterfaceConfigurations;
    }

    public VirtualMachineScaleSetNetworkProfileResponse(
        @Nullable ApiEntityReferenceResponse healthProbe,
        @Nullable String networkApiVersion,
        @Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations) {
        this.healthProbe = healthProbe;
        this.networkApiVersion = networkApiVersion;
        this.networkInterfaceConfigurations = networkInterfaceConfigurations;
    }

    private VirtualMachineScaleSetNetworkProfileResponse() {
        this.healthProbe = null;
        this.networkApiVersion = null;
        this.networkInterfaceConfigurations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetNetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApiEntityReferenceResponse healthProbe;
        private @Nullable String networkApiVersion;
        private @Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetNetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthProbe = defaults.healthProbe;
    	      this.networkApiVersion = defaults.networkApiVersion;
    	      this.networkInterfaceConfigurations = defaults.networkInterfaceConfigurations;
        }

        public Builder healthProbe(@Nullable ApiEntityReferenceResponse healthProbe) {
            this.healthProbe = healthProbe;
            return this;
        }
        public Builder networkApiVersion(@Nullable String networkApiVersion) {
            this.networkApiVersion = networkApiVersion;
            return this;
        }
        public Builder networkInterfaceConfigurations(@Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations) {
            this.networkInterfaceConfigurations = networkInterfaceConfigurations;
            return this;
        }
        public Builder networkInterfaceConfigurations(VirtualMachineScaleSetNetworkConfigurationResponse... networkInterfaceConfigurations) {
            return networkInterfaceConfigurations(List.of(networkInterfaceConfigurations));
        }        public VirtualMachineScaleSetNetworkProfileResponse build() {
            return new VirtualMachineScaleSetNetworkProfileResponse(healthProbe, networkApiVersion, networkInterfaceConfigurations);
        }
    }
}
