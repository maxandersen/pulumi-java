// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.compute.inputs.AdditionalCapabilitiesArgs;
import com.pulumi.azurenative.compute.inputs.DiagnosticsProfileArgs;
import com.pulumi.azurenative.compute.inputs.HardwareProfileArgs;
import com.pulumi.azurenative.compute.inputs.NetworkProfileArgs;
import com.pulumi.azurenative.compute.inputs.OSProfileArgs;
import com.pulumi.azurenative.compute.inputs.PlanArgs;
import com.pulumi.azurenative.compute.inputs.SecurityProfileArgs;
import com.pulumi.azurenative.compute.inputs.StorageProfileArgs;
import com.pulumi.azurenative.compute.inputs.SubResourceArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetVMNetworkProfileConfigurationArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetVMProtectionPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineScaleSetVMArgs extends ResourceArgs {

    public static final VirtualMachineScaleSetVMArgs Empty = new VirtualMachineScaleSetVMArgs();

    /**
     * Specifies additional capabilities enabled or disabled on the virtual machine in the scale set. For instance: whether the virtual machine has the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
     * 
     */
    @Import(name="additionalCapabilities")
    private @Nullable Output<AdditionalCapabilitiesArgs> additionalCapabilities;

    /**
     * @return Specifies additional capabilities enabled or disabled on the virtual machine in the scale set. For instance: whether the virtual machine has the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
     * 
     */
    public Optional<Output<AdditionalCapabilitiesArgs>> additionalCapabilities() {
        return Optional.ofNullable(this.additionalCapabilities);
    }

    /**
     * Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM cannot be added to an availability set.
     * 
     */
    @Import(name="availabilitySet")
    private @Nullable Output<SubResourceArgs> availabilitySet;

    /**
     * @return Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM cannot be added to an availability set.
     * 
     */
    public Optional<Output<SubResourceArgs>> availabilitySet() {
        return Optional.ofNullable(this.availabilitySet);
    }

    /**
     * Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
     * 
     */
    @Import(name="diagnosticsProfile")
    private @Nullable Output<DiagnosticsProfileArgs> diagnosticsProfile;

    /**
     * @return Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
     * 
     */
    public Optional<Output<DiagnosticsProfileArgs>> diagnosticsProfile() {
        return Optional.ofNullable(this.diagnosticsProfile);
    }

    /**
     * Specifies the hardware settings for the virtual machine.
     * 
     */
    @Import(name="hardwareProfile")
    private @Nullable Output<HardwareProfileArgs> hardwareProfile;

    /**
     * @return Specifies the hardware settings for the virtual machine.
     * 
     */
    public Optional<Output<HardwareProfileArgs>> hardwareProfile() {
        return Optional.ofNullable(this.hardwareProfile);
    }

    /**
     * The instance ID of the virtual machine.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The instance ID of the virtual machine.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Specifies that the image or disk that is being used was licensed on-premises. &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<String> licenseType;

    /**
     * @return Specifies that the image or disk that is being used was licensed on-premises. &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
     * 
     */
    public Optional<Output<String>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the network interfaces of the virtual machine.
     * 
     */
    @Import(name="networkProfile")
    private @Nullable Output<NetworkProfileArgs> networkProfile;

    /**
     * @return Specifies the network interfaces of the virtual machine.
     * 
     */
    public Optional<Output<NetworkProfileArgs>> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }

    /**
     * Specifies the network profile configuration of the virtual machine.
     * 
     */
    @Import(name="networkProfileConfiguration")
    private @Nullable Output<VirtualMachineScaleSetVMNetworkProfileConfigurationArgs> networkProfileConfiguration;

    /**
     * @return Specifies the network profile configuration of the virtual machine.
     * 
     */
    public Optional<Output<VirtualMachineScaleSetVMNetworkProfileConfigurationArgs>> networkProfileConfiguration() {
        return Optional.ofNullable(this.networkProfileConfiguration);
    }

    /**
     * Specifies the operating system settings for the virtual machine.
     * 
     */
    @Import(name="osProfile")
    private @Nullable Output<OSProfileArgs> osProfile;

    /**
     * @return Specifies the operating system settings for the virtual machine.
     * 
     */
    public Optional<Output<OSProfileArgs>> osProfile() {
        return Optional.ofNullable(this.osProfile);
    }

    /**
     * Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<PlanArgs> plan;

    /**
     * @return Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**.
     * 
     */
    public Optional<Output<PlanArgs>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * Specifies the protection policy of the virtual machine.
     * 
     */
    @Import(name="protectionPolicy")
    private @Nullable Output<VirtualMachineScaleSetVMProtectionPolicyArgs> protectionPolicy;

    /**
     * @return Specifies the protection policy of the virtual machine.
     * 
     */
    public Optional<Output<VirtualMachineScaleSetVMProtectionPolicyArgs>> protectionPolicy() {
        return Optional.ofNullable(this.protectionPolicy);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the Security related profile settings for the virtual machine.
     * 
     */
    @Import(name="securityProfile")
    private @Nullable Output<SecurityProfileArgs> securityProfile;

    /**
     * @return Specifies the Security related profile settings for the virtual machine.
     * 
     */
    public Optional<Output<SecurityProfileArgs>> securityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }

    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @Import(name="storageProfile")
    private @Nullable Output<StorageProfileArgs> storageProfile;

    /**
     * @return Specifies the storage settings for the virtual machine disks.
     * 
     */
    public Optional<Output<StorageProfileArgs>> storageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    /**
     * The name of the VM scale set where the extension should be create or updated.
     * 
     */
    @Import(name="vmScaleSetName", required=true)
    private Output<String> vmScaleSetName;

    /**
     * @return The name of the VM scale set where the extension should be create or updated.
     * 
     */
    public Output<String> vmScaleSetName() {
        return this.vmScaleSetName;
    }

    private VirtualMachineScaleSetVMArgs() {}

    private VirtualMachineScaleSetVMArgs(VirtualMachineScaleSetVMArgs $) {
        this.additionalCapabilities = $.additionalCapabilities;
        this.availabilitySet = $.availabilitySet;
        this.diagnosticsProfile = $.diagnosticsProfile;
        this.hardwareProfile = $.hardwareProfile;
        this.instanceId = $.instanceId;
        this.licenseType = $.licenseType;
        this.location = $.location;
        this.networkProfile = $.networkProfile;
        this.networkProfileConfiguration = $.networkProfileConfiguration;
        this.osProfile = $.osProfile;
        this.plan = $.plan;
        this.protectionPolicy = $.protectionPolicy;
        this.resourceGroupName = $.resourceGroupName;
        this.securityProfile = $.securityProfile;
        this.storageProfile = $.storageProfile;
        this.tags = $.tags;
        this.userData = $.userData;
        this.vmScaleSetName = $.vmScaleSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetVMArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetVMArgs $;

        public Builder() {
            $ = new VirtualMachineScaleSetVMArgs();
        }

        public Builder(VirtualMachineScaleSetVMArgs defaults) {
            $ = new VirtualMachineScaleSetVMArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalCapabilities Specifies additional capabilities enabled or disabled on the virtual machine in the scale set. For instance: whether the virtual machine has the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
         * 
         * @return builder
         * 
         */
        public Builder additionalCapabilities(@Nullable Output<AdditionalCapabilitiesArgs> additionalCapabilities) {
            $.additionalCapabilities = additionalCapabilities;
            return this;
        }

        /**
         * @param additionalCapabilities Specifies additional capabilities enabled or disabled on the virtual machine in the scale set. For instance: whether the virtual machine has the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
         * 
         * @return builder
         * 
         */
        public Builder additionalCapabilities(AdditionalCapabilitiesArgs additionalCapabilities) {
            return additionalCapabilities(Output.of(additionalCapabilities));
        }

        /**
         * @param availabilitySet Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM cannot be added to an availability set.
         * 
         * @return builder
         * 
         */
        public Builder availabilitySet(@Nullable Output<SubResourceArgs> availabilitySet) {
            $.availabilitySet = availabilitySet;
            return this;
        }

        /**
         * @param availabilitySet Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM cannot be added to an availability set.
         * 
         * @return builder
         * 
         */
        public Builder availabilitySet(SubResourceArgs availabilitySet) {
            return availabilitySet(Output.of(availabilitySet));
        }

        /**
         * @param diagnosticsProfile Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticsProfile(@Nullable Output<DiagnosticsProfileArgs> diagnosticsProfile) {
            $.diagnosticsProfile = diagnosticsProfile;
            return this;
        }

        /**
         * @param diagnosticsProfile Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticsProfile(DiagnosticsProfileArgs diagnosticsProfile) {
            return diagnosticsProfile(Output.of(diagnosticsProfile));
        }

        /**
         * @param hardwareProfile Specifies the hardware settings for the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder hardwareProfile(@Nullable Output<HardwareProfileArgs> hardwareProfile) {
            $.hardwareProfile = hardwareProfile;
            return this;
        }

        /**
         * @param hardwareProfile Specifies the hardware settings for the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder hardwareProfile(HardwareProfileArgs hardwareProfile) {
            return hardwareProfile(Output.of(hardwareProfile));
        }

        /**
         * @param instanceId The instance ID of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The instance ID of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param licenseType Specifies that the image or disk that is being used was licensed on-premises. &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<String> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType Specifies that the image or disk that is being used was licensed on-premises. &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param networkProfile Specifies the network interfaces of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(@Nullable Output<NetworkProfileArgs> networkProfile) {
            $.networkProfile = networkProfile;
            return this;
        }

        /**
         * @param networkProfile Specifies the network interfaces of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(NetworkProfileArgs networkProfile) {
            return networkProfile(Output.of(networkProfile));
        }

        /**
         * @param networkProfileConfiguration Specifies the network profile configuration of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder networkProfileConfiguration(@Nullable Output<VirtualMachineScaleSetVMNetworkProfileConfigurationArgs> networkProfileConfiguration) {
            $.networkProfileConfiguration = networkProfileConfiguration;
            return this;
        }

        /**
         * @param networkProfileConfiguration Specifies the network profile configuration of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder networkProfileConfiguration(VirtualMachineScaleSetVMNetworkProfileConfigurationArgs networkProfileConfiguration) {
            return networkProfileConfiguration(Output.of(networkProfileConfiguration));
        }

        /**
         * @param osProfile Specifies the operating system settings for the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder osProfile(@Nullable Output<OSProfileArgs> osProfile) {
            $.osProfile = osProfile;
            return this;
        }

        /**
         * @param osProfile Specifies the operating system settings for the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder osProfile(OSProfileArgs osProfile) {
            return osProfile(Output.of(osProfile));
        }

        /**
         * @param plan Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**.
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<PlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**.
         * 
         * @return builder
         * 
         */
        public Builder plan(PlanArgs plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param protectionPolicy Specifies the protection policy of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder protectionPolicy(@Nullable Output<VirtualMachineScaleSetVMProtectionPolicyArgs> protectionPolicy) {
            $.protectionPolicy = protectionPolicy;
            return this;
        }

        /**
         * @param protectionPolicy Specifies the protection policy of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder protectionPolicy(VirtualMachineScaleSetVMProtectionPolicyArgs protectionPolicy) {
            return protectionPolicy(Output.of(protectionPolicy));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param securityProfile Specifies the Security related profile settings for the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder securityProfile(@Nullable Output<SecurityProfileArgs> securityProfile) {
            $.securityProfile = securityProfile;
            return this;
        }

        /**
         * @param securityProfile Specifies the Security related profile settings for the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder securityProfile(SecurityProfileArgs securityProfile) {
            return securityProfile(Output.of(securityProfile));
        }

        /**
         * @param storageProfile Specifies the storage settings for the virtual machine disks.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(@Nullable Output<StorageProfileArgs> storageProfile) {
            $.storageProfile = storageProfile;
            return this;
        }

        /**
         * @param storageProfile Specifies the storage settings for the virtual machine disks.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(StorageProfileArgs storageProfile) {
            return storageProfile(Output.of(storageProfile));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param userData UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        /**
         * @param vmScaleSetName The name of the VM scale set where the extension should be create or updated.
         * 
         * @return builder
         * 
         */
        public Builder vmScaleSetName(Output<String> vmScaleSetName) {
            $.vmScaleSetName = vmScaleSetName;
            return this;
        }

        /**
         * @param vmScaleSetName The name of the VM scale set where the extension should be create or updated.
         * 
         * @return builder
         * 
         */
        public Builder vmScaleSetName(String vmScaleSetName) {
            return vmScaleSetName(Output.of(vmScaleSetName));
        }

        public VirtualMachineScaleSetVMArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vmScaleSetName = Objects.requireNonNull($.vmScaleSetName, "expected parameter 'vmScaleSetName' to be non-null");
            return $;
        }
    }

}
