// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.compute.VirtualMachineArgs;
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
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Describes a Virtual Machine.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:VirtualMachine myVM /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:VirtualMachine")
public class VirtualMachine extends com.pulumi.resources.CustomResource {
    /**
     * Specifies additional capabilities enabled or disabled on the virtual machine.
     * 
     */
    @Export(name="additionalCapabilities", type=AdditionalCapabilitiesResponse.class, parameters={})
    private Output</* @Nullable */ AdditionalCapabilitiesResponse> additionalCapabilities;

    /**
     * @return Specifies additional capabilities enabled or disabled on the virtual machine.
     * 
     */
    public Output</* @Nullable */ AdditionalCapabilitiesResponse> additionalCapabilities() {
        return this.additionalCapabilities;
    }
    /**
     * Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. The availability set to which the VM is being added should be under the same resource group as the availability set resource. An existing VM cannot be added to an availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.virtualMachineScaleSet reference.
     * 
     */
    @Export(name="availabilitySet", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> availabilitySet;

    /**
     * @return Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. The availability set to which the VM is being added should be under the same resource group as the availability set resource. An existing VM cannot be added to an availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.virtualMachineScaleSet reference.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> availabilitySet() {
        return this.availabilitySet;
    }
    /**
     * Specifies the billing related details of a Azure Spot virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     * 
     */
    @Export(name="billingProfile", type=BillingProfileResponse.class, parameters={})
    private Output</* @Nullable */ BillingProfileResponse> billingProfile;

    /**
     * @return Specifies the billing related details of a Azure Spot virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     * 
     */
    public Output</* @Nullable */ BillingProfileResponse> billingProfile() {
        return this.billingProfile;
    }
    /**
     * Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
     * 
     */
    @Export(name="diagnosticsProfile", type=DiagnosticsProfileResponse.class, parameters={})
    private Output</* @Nullable */ DiagnosticsProfileResponse> diagnosticsProfile;

    /**
     * @return Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15.
     * 
     */
    public Output</* @Nullable */ DiagnosticsProfileResponse> diagnosticsProfile() {
        return this.diagnosticsProfile;
    }
    /**
     * Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2017-10-30-preview.
     * 
     */
    @Export(name="evictionPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> evictionPolicy;

    /**
     * @return Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both &#39;Deallocate&#39; and &#39;Delete&#39; are supported and the minimum api-version is 2017-10-30-preview.
     * 
     */
    public Output</* @Nullable */ String> evictionPolicy() {
        return this.evictionPolicy;
    }
    /**
     * The extended location of the Virtual Machine.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the Virtual Machine.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> extendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01
     * 
     */
    @Export(name="extensionsTimeBudget", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionsTimeBudget;

    /**
     * @return Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01
     * 
     */
    public Output</* @Nullable */ String> extensionsTimeBudget() {
        return this.extensionsTimeBudget;
    }
    /**
     * Specifies the hardware settings for the virtual machine.
     * 
     */
    @Export(name="hardwareProfile", type=HardwareProfileResponse.class, parameters={})
    private Output</* @Nullable */ HardwareProfileResponse> hardwareProfile;

    /**
     * @return Specifies the hardware settings for the virtual machine.
     * 
     */
    public Output</* @Nullable */ HardwareProfileResponse> hardwareProfile() {
        return this.hardwareProfile;
    }
    /**
     * Specifies information about the dedicated host that the virtual machine resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01.
     * 
     */
    @Export(name="host", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> host;

    /**
     * @return Specifies information about the dedicated host that the virtual machine resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> host() {
        return this.host;
    }
    /**
     * Specifies information about the dedicated host group that the virtual machine resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01. &lt;br&gt;&lt;br&gt;NOTE: User cannot specify both host and hostGroup properties.
     * 
     */
    @Export(name="hostGroup", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> hostGroup;

    /**
     * @return Specifies information about the dedicated host group that the virtual machine resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01. &lt;br&gt;&lt;br&gt;NOTE: User cannot specify both host and hostGroup properties.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> hostGroup() {
        return this.hostGroup;
    }
    /**
     * The identity of the virtual machine, if configured.
     * 
     */
    @Export(name="identity", type=VirtualMachineIdentityResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineIdentityResponse> identity;

    /**
     * @return The identity of the virtual machine, if configured.
     * 
     */
    public Output</* @Nullable */ VirtualMachineIdentityResponse> identity() {
        return this.identity;
    }
    /**
     * The virtual machine instance view.
     * 
     */
    @Export(name="instanceView", type=VirtualMachineInstanceViewResponse.class, parameters={})
    private Output<VirtualMachineInstanceViewResponse> instanceView;

    /**
     * @return The virtual machine instance view.
     * 
     */
    public Output<VirtualMachineInstanceViewResponse> instanceView() {
        return this.instanceView;
    }
    /**
     * Specifies that the image or disk that is being used was licensed on-premises. &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
     * 
     */
    @Export(name="licenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseType;

    /**
     * @return Specifies that the image or disk that is being used was licensed on-premises. &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
     * 
     */
    public Output</* @Nullable */ String> licenseType() {
        return this.licenseType;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the network interfaces of the virtual machine.
     * 
     */
    @Export(name="networkProfile", type=NetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ NetworkProfileResponse> networkProfile;

    /**
     * @return Specifies the network interfaces of the virtual machine.
     * 
     */
    public Output</* @Nullable */ NetworkProfileResponse> networkProfile() {
        return this.networkProfile;
    }
    /**
     * Specifies the operating system settings used while creating the virtual machine. Some of the settings cannot be changed once VM is provisioned.
     * 
     */
    @Export(name="osProfile", type=OSProfileResponse.class, parameters={})
    private Output</* @Nullable */ OSProfileResponse> osProfile;

    /**
     * @return Specifies the operating system settings used while creating the virtual machine. Some of the settings cannot be changed once VM is provisioned.
     * 
     */
    public Output</* @Nullable */ OSProfileResponse> osProfile() {
        return this.osProfile;
    }
    /**
     * Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**.
     * 
     */
    @Export(name="plan", type=PlanResponse.class, parameters={})
    private Output</* @Nullable */ PlanResponse> plan;

    /**
     * @return Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**.
     * 
     */
    public Output</* @Nullable */ PlanResponse> plan() {
        return this.plan;
    }
    /**
     * Specifies the scale set logical fault domain into which the Virtual Machine will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that best maintains balance across available fault domains.&lt;br&gt;&lt;li&gt;This is applicable only if the &#39;virtualMachineScaleSet&#39; property of this Virtual Machine is set.&lt;li&gt;The Virtual Machine Scale Set that is referenced, must have &#39;platformFaultDomainCount&#39; &amp;gt; 1.&lt;li&gt;This property cannot be updated once the Virtual Machine is created.&lt;li&gt;Fault domain assignment can be viewed in the Virtual Machine Instance View.&lt;br&gt;&lt;br&gt;Minimum api‐version: 2020‐12‐01
     * 
     */
    @Export(name="platformFaultDomain", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> platformFaultDomain;

    /**
     * @return Specifies the scale set logical fault domain into which the Virtual Machine will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that best maintains balance across available fault domains.&lt;br&gt;&lt;li&gt;This is applicable only if the &#39;virtualMachineScaleSet&#39; property of this Virtual Machine is set.&lt;li&gt;The Virtual Machine Scale Set that is referenced, must have &#39;platformFaultDomainCount&#39; &amp;gt; 1.&lt;li&gt;This property cannot be updated once the Virtual Machine is created.&lt;li&gt;Fault domain assignment can be viewed in the Virtual Machine Instance View.&lt;br&gt;&lt;br&gt;Minimum api‐version: 2020‐12‐01
     * 
     */
    public Output</* @Nullable */ Integer> platformFaultDomain() {
        return this.platformFaultDomain;
    }
    /**
     * Specifies the priority for the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01
     * 
     */
    @Export(name="priority", type=String.class, parameters={})
    private Output</* @Nullable */ String> priority;

    /**
     * @return Specifies the priority for the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01
     * 
     */
    public Output</* @Nullable */ String> priority() {
        return this.priority;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Specifies information about the proximity placement group that the virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     * 
     */
    @Export(name="proximityPlacementGroup", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> proximityPlacementGroup;

    /**
     * @return Specifies information about the proximity placement group that the virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }
    /**
     * The virtual machine child extension resources.
     * 
     */
    @Export(name="resources", type=List.class, parameters={VirtualMachineExtensionResponse.class})
    private Output<List<VirtualMachineExtensionResponse>> resources;

    /**
     * @return The virtual machine child extension resources.
     * 
     */
    public Output<List<VirtualMachineExtensionResponse>> resources() {
        return this.resources;
    }
    /**
     * Specifies Scheduled Event related configurations.
     * 
     */
    @Export(name="scheduledEventsProfile", type=ScheduledEventsProfileResponse.class, parameters={})
    private Output</* @Nullable */ ScheduledEventsProfileResponse> scheduledEventsProfile;

    /**
     * @return Specifies Scheduled Event related configurations.
     * 
     */
    public Output</* @Nullable */ ScheduledEventsProfileResponse> scheduledEventsProfile() {
        return this.scheduledEventsProfile;
    }
    /**
     * Specifies the Security related profile settings for the virtual machine.
     * 
     */
    @Export(name="securityProfile", type=SecurityProfileResponse.class, parameters={})
    private Output</* @Nullable */ SecurityProfileResponse> securityProfile;

    /**
     * @return Specifies the Security related profile settings for the virtual machine.
     * 
     */
    public Output</* @Nullable */ SecurityProfileResponse> securityProfile() {
        return this.securityProfile;
    }
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @Export(name="storageProfile", type=StorageProfileResponse.class, parameters={})
    private Output</* @Nullable */ StorageProfileResponse> storageProfile;

    /**
     * @return Specifies the storage settings for the virtual machine disks.
     * 
     */
    public Output</* @Nullable */ StorageProfileResponse> storageProfile() {
        return this.storageProfile;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01
     * 
     */
    @Export(name="userData", type=String.class, parameters={})
    private Output</* @Nullable */ String> userData;

    /**
     * @return UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01
     * 
     */
    public Output</* @Nullable */ String> userData() {
        return this.userData;
    }
    /**
     * Specifies information about the virtual machine scale set that the virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale set at creation time. An existing VM cannot be added to a virtual machine scale set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.availabilitySet reference. &lt;br&gt;&lt;br&gt;Minimum api‐version: 2019‐03‐01
     * 
     */
    @Export(name="virtualMachineScaleSet", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> virtualMachineScaleSet;

    /**
     * @return Specifies information about the virtual machine scale set that the virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale set at creation time. An existing VM cannot be added to a virtual machine scale set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.availabilitySet reference. &lt;br&gt;&lt;br&gt;Minimum api‐version: 2019‐03‐01
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> virtualMachineScaleSet() {
        return this.virtualMachineScaleSet;
    }
    /**
     * Specifies the VM unique ID which is a 128-bits identifier that is encoded and stored in all Azure IaaS VMs SMBIOS and can be read using platform BIOS commands.
     * 
     */
    @Export(name="vmId", type=String.class, parameters={})
    private Output<String> vmId;

    /**
     * @return Specifies the VM unique ID which is a 128-bits identifier that is encoded and stored in all Azure IaaS VMs SMBIOS and can be read using platform BIOS commands.
     * 
     */
    public Output<String> vmId() {
        return this.vmId;
    }
    /**
     * The virtual machine zones.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return The virtual machine zones.
     * 
     */
    public Output</* @Nullable */ List<String>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachine(String name) {
        this(name, VirtualMachineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachine(String name, VirtualMachineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachine(String name, VirtualMachineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachine", name, args == null ? VirtualMachineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMachine(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachine", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20150615:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20160330:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20160430preview:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20170330:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20171201:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180401:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180601:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20181001:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190301:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190701:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20191201:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200601:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20201201:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210301:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210401:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210701:VirtualMachine").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20211101:VirtualMachine").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VirtualMachine get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachine(name, id, options);
    }
}
