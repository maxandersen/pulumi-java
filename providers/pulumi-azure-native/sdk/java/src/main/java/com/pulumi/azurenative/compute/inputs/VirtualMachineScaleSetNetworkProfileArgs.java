// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.NetworkApiVersion;
import com.pulumi.azurenative.compute.inputs.ApiEntityReferenceArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetNetworkConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set network profile.
 * 
 */
public final class VirtualMachineScaleSetNetworkProfileArgs extends ResourceArgs {

    public static final VirtualMachineScaleSetNetworkProfileArgs Empty = new VirtualMachineScaleSetNetworkProfileArgs();

    /**
     * A reference to a load balancer probe used to determine the health of an instance in the virtual machine scale set. The reference will be in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}&#39;.
     * 
     */
    @Import(name="healthProbe")
    private @Nullable Output<ApiEntityReferenceArgs> healthProbe;

    /**
     * @return A reference to a load balancer probe used to determine the health of an instance in the virtual machine scale set. The reference will be in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}&#39;.
     * 
     */
    public Optional<Output<ApiEntityReferenceArgs>> healthProbe() {
        return Optional.ofNullable(this.healthProbe);
    }

    /**
     * specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations for Virtual Machine Scale Set with orchestration mode &#39;Flexible&#39;
     * 
     */
    @Import(name="networkApiVersion")
    private @Nullable Output<Either<String,NetworkApiVersion>> networkApiVersion;

    /**
     * @return specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations for Virtual Machine Scale Set with orchestration mode &#39;Flexible&#39;
     * 
     */
    public Optional<Output<Either<String,NetworkApiVersion>>> networkApiVersion() {
        return Optional.ofNullable(this.networkApiVersion);
    }

    /**
     * The list of network configurations.
     * 
     */
    @Import(name="networkInterfaceConfigurations")
    private @Nullable Output<List<VirtualMachineScaleSetNetworkConfigurationArgs>> networkInterfaceConfigurations;

    /**
     * @return The list of network configurations.
     * 
     */
    public Optional<Output<List<VirtualMachineScaleSetNetworkConfigurationArgs>>> networkInterfaceConfigurations() {
        return Optional.ofNullable(this.networkInterfaceConfigurations);
    }

    private VirtualMachineScaleSetNetworkProfileArgs() {}

    private VirtualMachineScaleSetNetworkProfileArgs(VirtualMachineScaleSetNetworkProfileArgs $) {
        this.healthProbe = $.healthProbe;
        this.networkApiVersion = $.networkApiVersion;
        this.networkInterfaceConfigurations = $.networkInterfaceConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetNetworkProfileArgs $;

        public Builder() {
            $ = new VirtualMachineScaleSetNetworkProfileArgs();
        }

        public Builder(VirtualMachineScaleSetNetworkProfileArgs defaults) {
            $ = new VirtualMachineScaleSetNetworkProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param healthProbe A reference to a load balancer probe used to determine the health of an instance in the virtual machine scale set. The reference will be in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}&#39;.
         * 
         * @return builder
         * 
         */
        public Builder healthProbe(@Nullable Output<ApiEntityReferenceArgs> healthProbe) {
            $.healthProbe = healthProbe;
            return this;
        }

        /**
         * @param healthProbe A reference to a load balancer probe used to determine the health of an instance in the virtual machine scale set. The reference will be in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}&#39;.
         * 
         * @return builder
         * 
         */
        public Builder healthProbe(ApiEntityReferenceArgs healthProbe) {
            return healthProbe(Output.of(healthProbe));
        }

        /**
         * @param networkApiVersion specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations for Virtual Machine Scale Set with orchestration mode &#39;Flexible&#39;
         * 
         * @return builder
         * 
         */
        public Builder networkApiVersion(@Nullable Output<Either<String,NetworkApiVersion>> networkApiVersion) {
            $.networkApiVersion = networkApiVersion;
            return this;
        }

        /**
         * @param networkApiVersion specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations for Virtual Machine Scale Set with orchestration mode &#39;Flexible&#39;
         * 
         * @return builder
         * 
         */
        public Builder networkApiVersion(Either<String,NetworkApiVersion> networkApiVersion) {
            return networkApiVersion(Output.of(networkApiVersion));
        }

        /**
         * @param networkApiVersion specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations for Virtual Machine Scale Set with orchestration mode &#39;Flexible&#39;
         * 
         * @return builder
         * 
         */
        public Builder networkApiVersion(String networkApiVersion) {
            return networkApiVersion(Either.ofLeft(networkApiVersion));
        }

        /**
         * @param networkApiVersion specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations for Virtual Machine Scale Set with orchestration mode &#39;Flexible&#39;
         * 
         * @return builder
         * 
         */
        public Builder networkApiVersion(NetworkApiVersion networkApiVersion) {
            return networkApiVersion(Either.ofRight(networkApiVersion));
        }

        /**
         * @param networkInterfaceConfigurations The list of network configurations.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceConfigurations(@Nullable Output<List<VirtualMachineScaleSetNetworkConfigurationArgs>> networkInterfaceConfigurations) {
            $.networkInterfaceConfigurations = networkInterfaceConfigurations;
            return this;
        }

        /**
         * @param networkInterfaceConfigurations The list of network configurations.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceConfigurations(List<VirtualMachineScaleSetNetworkConfigurationArgs> networkInterfaceConfigurations) {
            return networkInterfaceConfigurations(Output.of(networkInterfaceConfigurations));
        }

        /**
         * @param networkInterfaceConfigurations The list of network configurations.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceConfigurations(VirtualMachineScaleSetNetworkConfigurationArgs... networkInterfaceConfigurations) {
            return networkInterfaceConfigurations(List.of(networkInterfaceConfigurations));
        }

        public VirtualMachineScaleSetNetworkProfileArgs build() {
            return $;
        }
    }

}
