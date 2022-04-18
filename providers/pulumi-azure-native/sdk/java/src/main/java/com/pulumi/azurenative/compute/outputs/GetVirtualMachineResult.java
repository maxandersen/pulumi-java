// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.AdditionalCapabilitiesResponse;
import com.pulumi.azurenative.compute.outputs.BillingProfileResponse;
import com.pulumi.azurenative.compute.outputs.DiagnosticsProfileResponse;
import com.pulumi.azurenative.compute.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.compute.outputs.HardwareProfileResponse;
import com.pulumi.azurenative.compute.outputs.NetworkProfileResponse;
import com.pulumi.azurenative.compute.outputs.OSProfileResponse;
import com.pulumi.azurenative.compute.outputs.PlanResponse;
import com.pulumi.azurenative.compute.outputs.ScheduledEventsProfileResponse;
import com.pulumi.azurenative.compute.outputs.SecurityProfileResponse;
import com.pulumi.azurenative.compute.outputs.StorageProfileResponse;
import com.pulumi.azurenative.compute.outputs.SubResourceResponse;
import com.pulumi.azurenative.compute.outputs.VirtualMachineExtensionResponse;
import com.pulumi.azurenative.compute.outputs.VirtualMachineIdentityResponse;
import com.pulumi.azurenative.compute.outputs.VirtualMachineInstanceViewResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualMachineResult {
    /**
     * Specifies additional capabilities enabled or disabled on the virtual machine.
     * 
     */
    private final @Nullable AdditionalCapabilitiesResponse additionalCapabilities;
    /**
     * Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). <br><br> For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) <br><br> Currently, a VM can only be added to availability set at creation time. The availability set to which the VM is being added should be under the same resource group as the availability set resource. An existing VM cannot be added to an availability set. <br><br>This property cannot exist along with a non-null properties.virtualMachineScaleSet reference.
     * 
     */
    private final @Nullable SubResourceResponse availabilitySet;
    /**
     * Specifies the billing related details of a Azure Spot virtual machine. <br><br>Minimum api-version: 2019-03-01.
     * 
     */
    private final @Nullable BillingProfileResponse billingProfile;
    /**
     * Specifies the boot diagnostic settings state. <br><br>Minimum api-version: 2015-06-15.
     * 
     */
    private final @Nullable DiagnosticsProfileResponse diagnosticsProfile;
    /**
     * Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. <br><br>For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2019-03-01. <br><br>For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     * 
     */
    private final @Nullable String evictionPolicy;
    /**
     * The extended location of the Virtual Machine.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M). <br><br> Minimum api-version: 2020-06-01
     * 
     */
    private final @Nullable String extensionsTimeBudget;
    /**
     * Specifies the hardware settings for the virtual machine.
     * 
     */
    private final @Nullable HardwareProfileResponse hardwareProfile;
    /**
     * Specifies information about the dedicated host that the virtual machine resides in. <br><br>Minimum api-version: 2018-10-01.
     * 
     */
    private final @Nullable SubResourceResponse host;
    /**
     * Specifies information about the dedicated host group that the virtual machine resides in. <br><br>Minimum api-version: 2020-06-01. <br><br>NOTE: User cannot specify both host and hostGroup properties.
     * 
     */
    private final @Nullable SubResourceResponse hostGroup;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The identity of the virtual machine, if configured.
     * 
     */
    private final @Nullable VirtualMachineIdentityResponse identity;
    /**
     * The virtual machine instance view.
     * 
     */
    private final VirtualMachineInstanceViewResponse instanceView;
    /**
     * Specifies that the image or disk that is being used was licensed on-premises. <br><br> Possible values for Windows Server operating system are: <br><br> Windows_Client <br><br> Windows_Server <br><br> Possible values for Linux Server operating system are: <br><br> RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) <br><br> [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) <br><br> Minimum api-version: 2015-06-15
     * 
     */
    private final @Nullable String licenseType;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Specifies the network interfaces of the virtual machine.
     * 
     */
    private final @Nullable NetworkProfileResponse networkProfile;
    /**
     * Specifies the operating system settings used while creating the virtual machine. Some of the settings cannot be changed once VM is provisioned.
     * 
     */
    private final @Nullable OSProfileResponse osProfile;
    /**
     * Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started ->**. Enter any required information and then click **Save**.
     * 
     */
    private final @Nullable PlanResponse plan;
    /**
     * Specifies the scale set logical fault domain into which the Virtual Machine will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that best maintains balance across available fault domains.<br><li>This is applicable only if the 'virtualMachineScaleSet' property of this Virtual Machine is set.<li>The Virtual Machine Scale Set that is referenced, must have 'platformFaultDomainCount' &gt; 1.<li>This property cannot be updated once the Virtual Machine is created.<li>Fault domain assignment can be viewed in the Virtual Machine Instance View.<br><br>Minimum api‐version: 2020‐12‐01
     * 
     */
    private final @Nullable Integer platformFaultDomain;
    /**
     * Specifies the priority for the virtual machine. <br><br>Minimum api-version: 2019-03-01
     * 
     */
    private final @Nullable String priority;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * Specifies information about the proximity placement group that the virtual machine should be assigned to. <br><br>Minimum api-version: 2018-04-01.
     * 
     */
    private final @Nullable SubResourceResponse proximityPlacementGroup;
    /**
     * The virtual machine child extension resources.
     * 
     */
    private final List<VirtualMachineExtensionResponse> resources;
    /**
     * Specifies Scheduled Event related configurations.
     * 
     */
    private final @Nullable ScheduledEventsProfileResponse scheduledEventsProfile;
    /**
     * Specifies the Security related profile settings for the virtual machine.
     * 
     */
    private final @Nullable SecurityProfileResponse securityProfile;
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    private final @Nullable StorageProfileResponse storageProfile;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. <br><br>Minimum api-version: 2021-03-01
     * 
     */
    private final @Nullable String userData;
    /**
     * Specifies information about the virtual machine scale set that the virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale set at creation time. An existing VM cannot be added to a virtual machine scale set. <br><br>This property cannot exist along with a non-null properties.availabilitySet reference. <br><br>Minimum api‐version: 2019‐03‐01
     * 
     */
    private final @Nullable SubResourceResponse virtualMachineScaleSet;
    /**
     * Specifies the VM unique ID which is a 128-bits identifier that is encoded and stored in all Azure IaaS VMs SMBIOS and can be read using platform BIOS commands.
     * 
     */
    private final String vmId;
    /**
     * The virtual machine zones.
     * 
     */
    private final @Nullable List<String> zones;

    @CustomType.Constructor
    private GetVirtualMachineResult(
        @CustomType.Parameter("additionalCapabilities") @Nullable AdditionalCapabilitiesResponse additionalCapabilities,
        @CustomType.Parameter("availabilitySet") @Nullable SubResourceResponse availabilitySet,
        @CustomType.Parameter("billingProfile") @Nullable BillingProfileResponse billingProfile,
        @CustomType.Parameter("diagnosticsProfile") @Nullable DiagnosticsProfileResponse diagnosticsProfile,
        @CustomType.Parameter("evictionPolicy") @Nullable String evictionPolicy,
        @CustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @CustomType.Parameter("extensionsTimeBudget") @Nullable String extensionsTimeBudget,
        @CustomType.Parameter("hardwareProfile") @Nullable HardwareProfileResponse hardwareProfile,
        @CustomType.Parameter("host") @Nullable SubResourceResponse host,
        @CustomType.Parameter("hostGroup") @Nullable SubResourceResponse hostGroup,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable VirtualMachineIdentityResponse identity,
        @CustomType.Parameter("instanceView") VirtualMachineInstanceViewResponse instanceView,
        @CustomType.Parameter("licenseType") @Nullable String licenseType,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkProfile") @Nullable NetworkProfileResponse networkProfile,
        @CustomType.Parameter("osProfile") @Nullable OSProfileResponse osProfile,
        @CustomType.Parameter("plan") @Nullable PlanResponse plan,
        @CustomType.Parameter("platformFaultDomain") @Nullable Integer platformFaultDomain,
        @CustomType.Parameter("priority") @Nullable String priority,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("proximityPlacementGroup") @Nullable SubResourceResponse proximityPlacementGroup,
        @CustomType.Parameter("resources") List<VirtualMachineExtensionResponse> resources,
        @CustomType.Parameter("scheduledEventsProfile") @Nullable ScheduledEventsProfileResponse scheduledEventsProfile,
        @CustomType.Parameter("securityProfile") @Nullable SecurityProfileResponse securityProfile,
        @CustomType.Parameter("storageProfile") @Nullable StorageProfileResponse storageProfile,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userData") @Nullable String userData,
        @CustomType.Parameter("virtualMachineScaleSet") @Nullable SubResourceResponse virtualMachineScaleSet,
        @CustomType.Parameter("vmId") String vmId,
        @CustomType.Parameter("zones") @Nullable List<String> zones) {
        this.additionalCapabilities = additionalCapabilities;
        this.availabilitySet = availabilitySet;
        this.billingProfile = billingProfile;
        this.diagnosticsProfile = diagnosticsProfile;
        this.evictionPolicy = evictionPolicy;
        this.extendedLocation = extendedLocation;
        this.extensionsTimeBudget = extensionsTimeBudget;
        this.hardwareProfile = hardwareProfile;
        this.host = host;
        this.hostGroup = hostGroup;
        this.id = id;
        this.identity = identity;
        this.instanceView = instanceView;
        this.licenseType = licenseType;
        this.location = location;
        this.name = name;
        this.networkProfile = networkProfile;
        this.osProfile = osProfile;
        this.plan = plan;
        this.platformFaultDomain = platformFaultDomain;
        this.priority = priority;
        this.provisioningState = provisioningState;
        this.proximityPlacementGroup = proximityPlacementGroup;
        this.resources = resources;
        this.scheduledEventsProfile = scheduledEventsProfile;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.tags = tags;
        this.type = type;
        this.userData = userData;
        this.virtualMachineScaleSet = virtualMachineScaleSet;
        this.vmId = vmId;
        this.zones = zones;
    }

    /**
     * Specifies additional capabilities enabled or disabled on the virtual machine.
     * 
    */
    public Optional<AdditionalCapabilitiesResponse> additionalCapabilities() {
        return Optional.ofNullable(this.additionalCapabilities);
    }
    /**
     * Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). <br><br> For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) <br><br> Currently, a VM can only be added to availability set at creation time. The availability set to which the VM is being added should be under the same resource group as the availability set resource. An existing VM cannot be added to an availability set. <br><br>This property cannot exist along with a non-null properties.virtualMachineScaleSet reference.
     * 
    */
    public Optional<SubResourceResponse> availabilitySet() {
        return Optional.ofNullable(this.availabilitySet);
    }
    /**
     * Specifies the billing related details of a Azure Spot virtual machine. <br><br>Minimum api-version: 2019-03-01.
     * 
    */
    public Optional<BillingProfileResponse> billingProfile() {
        return Optional.ofNullable(this.billingProfile);
    }
    /**
     * Specifies the boot diagnostic settings state. <br><br>Minimum api-version: 2015-06-15.
     * 
    */
    public Optional<DiagnosticsProfileResponse> diagnosticsProfile() {
        return Optional.ofNullable(this.diagnosticsProfile);
    }
    /**
     * Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. <br><br>For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2019-03-01. <br><br>For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     * 
    */
    public Optional<String> evictionPolicy() {
        return Optional.ofNullable(this.evictionPolicy);
    }
    /**
     * The extended location of the Virtual Machine.
     * 
    */
    public Optional<ExtendedLocationResponse> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M). <br><br> Minimum api-version: 2020-06-01
     * 
    */
    public Optional<String> extensionsTimeBudget() {
        return Optional.ofNullable(this.extensionsTimeBudget);
    }
    /**
     * Specifies the hardware settings for the virtual machine.
     * 
    */
    public Optional<HardwareProfileResponse> hardwareProfile() {
        return Optional.ofNullable(this.hardwareProfile);
    }
    /**
     * Specifies information about the dedicated host that the virtual machine resides in. <br><br>Minimum api-version: 2018-10-01.
     * 
    */
    public Optional<SubResourceResponse> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * Specifies information about the dedicated host group that the virtual machine resides in. <br><br>Minimum api-version: 2020-06-01. <br><br>NOTE: User cannot specify both host and hostGroup properties.
     * 
    */
    public Optional<SubResourceResponse> hostGroup() {
        return Optional.ofNullable(this.hostGroup);
    }
    /**
     * Resource Id
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The identity of the virtual machine, if configured.
     * 
    */
    public Optional<VirtualMachineIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The virtual machine instance view.
     * 
    */
    public VirtualMachineInstanceViewResponse instanceView() {
        return this.instanceView;
    }
    /**
     * Specifies that the image or disk that is being used was licensed on-premises. <br><br> Possible values for Windows Server operating system are: <br><br> Windows_Client <br><br> Windows_Server <br><br> Possible values for Linux Server operating system are: <br><br> RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) <br><br> [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) <br><br> Minimum api-version: 2015-06-15
     * 
    */
    public Optional<String> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * Resource location
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Specifies the network interfaces of the virtual machine.
     * 
    */
    public Optional<NetworkProfileResponse> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * Specifies the operating system settings used while creating the virtual machine. Some of the settings cannot be changed once VM is provisioned.
     * 
    */
    public Optional<OSProfileResponse> osProfile() {
        return Optional.ofNullable(this.osProfile);
    }
    /**
     * Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started ->**. Enter any required information and then click **Save**.
     * 
    */
    public Optional<PlanResponse> plan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * Specifies the scale set logical fault domain into which the Virtual Machine will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that best maintains balance across available fault domains.<br><li>This is applicable only if the 'virtualMachineScaleSet' property of this Virtual Machine is set.<li>The Virtual Machine Scale Set that is referenced, must have 'platformFaultDomainCount' &gt; 1.<li>This property cannot be updated once the Virtual Machine is created.<li>Fault domain assignment can be viewed in the Virtual Machine Instance View.<br><br>Minimum api‐version: 2020‐12‐01
     * 
    */
    public Optional<Integer> platformFaultDomain() {
        return Optional.ofNullable(this.platformFaultDomain);
    }
    /**
     * Specifies the priority for the virtual machine. <br><br>Minimum api-version: 2019-03-01
     * 
    */
    public Optional<String> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Specifies information about the proximity placement group that the virtual machine should be assigned to. <br><br>Minimum api-version: 2018-04-01.
     * 
    */
    public Optional<SubResourceResponse> proximityPlacementGroup() {
        return Optional.ofNullable(this.proximityPlacementGroup);
    }
    /**
     * The virtual machine child extension resources.
     * 
    */
    public List<VirtualMachineExtensionResponse> resources() {
        return this.resources;
    }
    /**
     * Specifies Scheduled Event related configurations.
     * 
    */
    public Optional<ScheduledEventsProfileResponse> scheduledEventsProfile() {
        return Optional.ofNullable(this.scheduledEventsProfile);
    }
    /**
     * Specifies the Security related profile settings for the virtual machine.
     * 
    */
    public Optional<SecurityProfileResponse> securityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
    */
    public Optional<StorageProfileResponse> storageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. <br><br>Minimum api-version: 2021-03-01
     * 
    */
    public Optional<String> userData() {
        return Optional.ofNullable(this.userData);
    }
    /**
     * Specifies information about the virtual machine scale set that the virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale set at creation time. An existing VM cannot be added to a virtual machine scale set. <br><br>This property cannot exist along with a non-null properties.availabilitySet reference. <br><br>Minimum api‐version: 2019‐03‐01
     * 
    */
    public Optional<SubResourceResponse> virtualMachineScaleSet() {
        return Optional.ofNullable(this.virtualMachineScaleSet);
    }
    /**
     * Specifies the VM unique ID which is a 128-bits identifier that is encoded and stored in all Azure IaaS VMs SMBIOS and can be read using platform BIOS commands.
     * 
    */
    public String vmId() {
        return this.vmId;
    }
    /**
     * The virtual machine zones.
     * 
    */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AdditionalCapabilitiesResponse additionalCapabilities;
        private @Nullable SubResourceResponse availabilitySet;
        private @Nullable BillingProfileResponse billingProfile;
        private @Nullable DiagnosticsProfileResponse diagnosticsProfile;
        private @Nullable String evictionPolicy;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable String extensionsTimeBudget;
        private @Nullable HardwareProfileResponse hardwareProfile;
        private @Nullable SubResourceResponse host;
        private @Nullable SubResourceResponse hostGroup;
        private String id;
        private @Nullable VirtualMachineIdentityResponse identity;
        private VirtualMachineInstanceViewResponse instanceView;
        private @Nullable String licenseType;
        private String location;
        private String name;
        private @Nullable NetworkProfileResponse networkProfile;
        private @Nullable OSProfileResponse osProfile;
        private @Nullable PlanResponse plan;
        private @Nullable Integer platformFaultDomain;
        private @Nullable String priority;
        private String provisioningState;
        private @Nullable SubResourceResponse proximityPlacementGroup;
        private List<VirtualMachineExtensionResponse> resources;
        private @Nullable ScheduledEventsProfileResponse scheduledEventsProfile;
        private @Nullable SecurityProfileResponse securityProfile;
        private @Nullable StorageProfileResponse storageProfile;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String userData;
        private @Nullable SubResourceResponse virtualMachineScaleSet;
        private String vmId;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCapabilities = defaults.additionalCapabilities;
    	      this.availabilitySet = defaults.availabilitySet;
    	      this.billingProfile = defaults.billingProfile;
    	      this.diagnosticsProfile = defaults.diagnosticsProfile;
    	      this.evictionPolicy = defaults.evictionPolicy;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.extensionsTimeBudget = defaults.extensionsTimeBudget;
    	      this.hardwareProfile = defaults.hardwareProfile;
    	      this.host = defaults.host;
    	      this.hostGroup = defaults.hostGroup;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.instanceView = defaults.instanceView;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osProfile = defaults.osProfile;
    	      this.plan = defaults.plan;
    	      this.platformFaultDomain = defaults.platformFaultDomain;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.proximityPlacementGroup = defaults.proximityPlacementGroup;
    	      this.resources = defaults.resources;
    	      this.scheduledEventsProfile = defaults.scheduledEventsProfile;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.userData = defaults.userData;
    	      this.virtualMachineScaleSet = defaults.virtualMachineScaleSet;
    	      this.vmId = defaults.vmId;
    	      this.zones = defaults.zones;
        }

        public Builder additionalCapabilities(@Nullable AdditionalCapabilitiesResponse additionalCapabilities) {
            this.additionalCapabilities = additionalCapabilities;
            return this;
        }
        public Builder availabilitySet(@Nullable SubResourceResponse availabilitySet) {
            this.availabilitySet = availabilitySet;
            return this;
        }
        public Builder billingProfile(@Nullable BillingProfileResponse billingProfile) {
            this.billingProfile = billingProfile;
            return this;
        }
        public Builder diagnosticsProfile(@Nullable DiagnosticsProfileResponse diagnosticsProfile) {
            this.diagnosticsProfile = diagnosticsProfile;
            return this;
        }
        public Builder evictionPolicy(@Nullable String evictionPolicy) {
            this.evictionPolicy = evictionPolicy;
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder extensionsTimeBudget(@Nullable String extensionsTimeBudget) {
            this.extensionsTimeBudget = extensionsTimeBudget;
            return this;
        }
        public Builder hardwareProfile(@Nullable HardwareProfileResponse hardwareProfile) {
            this.hardwareProfile = hardwareProfile;
            return this;
        }
        public Builder host(@Nullable SubResourceResponse host) {
            this.host = host;
            return this;
        }
        public Builder hostGroup(@Nullable SubResourceResponse hostGroup) {
            this.hostGroup = hostGroup;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable VirtualMachineIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder instanceView(VirtualMachineInstanceViewResponse instanceView) {
            this.instanceView = Objects.requireNonNull(instanceView);
            return this;
        }
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }
        public Builder osProfile(@Nullable OSProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }
        public Builder plan(@Nullable PlanResponse plan) {
            this.plan = plan;
            return this;
        }
        public Builder platformFaultDomain(@Nullable Integer platformFaultDomain) {
            this.platformFaultDomain = platformFaultDomain;
            return this;
        }
        public Builder priority(@Nullable String priority) {
            this.priority = priority;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder proximityPlacementGroup(@Nullable SubResourceResponse proximityPlacementGroup) {
            this.proximityPlacementGroup = proximityPlacementGroup;
            return this;
        }
        public Builder resources(List<VirtualMachineExtensionResponse> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(VirtualMachineExtensionResponse... resources) {
            return resources(List.of(resources));
        }
        public Builder scheduledEventsProfile(@Nullable ScheduledEventsProfileResponse scheduledEventsProfile) {
            this.scheduledEventsProfile = scheduledEventsProfile;
            return this;
        }
        public Builder securityProfile(@Nullable SecurityProfileResponse securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }
        public Builder storageProfile(@Nullable StorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userData(@Nullable String userData) {
            this.userData = userData;
            return this;
        }
        public Builder virtualMachineScaleSet(@Nullable SubResourceResponse virtualMachineScaleSet) {
            this.virtualMachineScaleSet = virtualMachineScaleSet;
            return this;
        }
        public Builder vmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public GetVirtualMachineResult build() {
            return new GetVirtualMachineResult(additionalCapabilities, availabilitySet, billingProfile, diagnosticsProfile, evictionPolicy, extendedLocation, extensionsTimeBudget, hardwareProfile, host, hostGroup, id, identity, instanceView, licenseType, location, name, networkProfile, osProfile, plan, platformFaultDomain, priority, provisioningState, proximityPlacementGroup, resources, scheduledEventsProfile, securityProfile, storageProfile, tags, type, userData, virtualMachineScaleSet, vmId, zones);
        }
    }
}
