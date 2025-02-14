// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.compute.VirtualMachineScaleSetArgs;
import com.pulumi.azurenative.compute.outputs.AdditionalCapabilitiesResponse;
import com.pulumi.azurenative.compute.outputs.AutomaticRepairsPolicyResponse;
import com.pulumi.azurenative.compute.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.compute.outputs.PlanResponse;
import com.pulumi.azurenative.compute.outputs.ScaleInPolicyResponse;
import com.pulumi.azurenative.compute.outputs.SkuResponse;
import com.pulumi.azurenative.compute.outputs.SubResourceResponse;
import com.pulumi.azurenative.compute.outputs.UpgradePolicyResponse;
import com.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetIdentityResponse;
import com.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetVMProfileResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Describes a Virtual Machine Scale Set.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:VirtualMachineScaleSet {vmss-name} /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachineScaleSets/{vmss-name} 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:VirtualMachineScaleSet")
public class VirtualMachineScaleSet extends com.pulumi.resources.CustomResource {
    /**
     * Specifies additional capabilities enabled or disabled on the Virtual Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
     * 
     */
    @Export(name="additionalCapabilities", type=AdditionalCapabilitiesResponse.class, parameters={})
    private Output</* @Nullable */ AdditionalCapabilitiesResponse> additionalCapabilities;

    /**
     * @return Specifies additional capabilities enabled or disabled on the Virtual Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
     * 
     */
    public Output<Optional<AdditionalCapabilitiesResponse>> additionalCapabilities() {
        return Codegen.optional(this.additionalCapabilities);
    }
    /**
     * Policy for automatic repairs.
     * 
     */
    @Export(name="automaticRepairsPolicy", type=AutomaticRepairsPolicyResponse.class, parameters={})
    private Output</* @Nullable */ AutomaticRepairsPolicyResponse> automaticRepairsPolicy;

    /**
     * @return Policy for automatic repairs.
     * 
     */
    public Output<Optional<AutomaticRepairsPolicyResponse>> automaticRepairsPolicy() {
        return Codegen.optional(this.automaticRepairsPolicy);
    }
    /**
     * When Overprovision is enabled, extensions are launched only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions do not run on the extra overprovisioned VMs.
     * 
     */
    @Export(name="doNotRunExtensionsOnOverprovisionedVMs", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> doNotRunExtensionsOnOverprovisionedVMs;

    /**
     * @return When Overprovision is enabled, extensions are launched only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions do not run on the extra overprovisioned VMs.
     * 
     */
    public Output<Optional<Boolean>> doNotRunExtensionsOnOverprovisionedVMs() {
        return Codegen.optional(this.doNotRunExtensionsOnOverprovisionedVMs);
    }
    /**
     * The extended location of the Virtual Machine Scale Set.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the Virtual Machine Scale Set.
     * 
     */
    public Output<Optional<ExtendedLocationResponse>> extendedLocation() {
        return Codegen.optional(this.extendedLocation);
    }
    /**
     * Specifies information about the dedicated host group that the virtual machine scale set resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     * 
     */
    @Export(name="hostGroup", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> hostGroup;

    /**
     * @return Specifies information about the dedicated host group that the virtual machine scale set resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     * 
     */
    public Output<Optional<SubResourceResponse>> hostGroup() {
        return Codegen.optional(this.hostGroup);
    }
    /**
     * The identity of the virtual machine scale set, if configured.
     * 
     */
    @Export(name="identity", type=VirtualMachineScaleSetIdentityResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineScaleSetIdentityResponse> identity;

    /**
     * @return The identity of the virtual machine scale set, if configured.
     * 
     */
    public Output<Optional<VirtualMachineScaleSetIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
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
     * Specifies the orchestration mode for the virtual machine scale set.
     * 
     */
    @Export(name="orchestrationMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> orchestrationMode;

    /**
     * @return Specifies the orchestration mode for the virtual machine scale set.
     * 
     */
    public Output<Optional<String>> orchestrationMode() {
        return Codegen.optional(this.orchestrationMode);
    }
    /**
     * Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     * 
     */
    @Export(name="overprovision", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> overprovision;

    /**
     * @return Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     * 
     */
    public Output<Optional<Boolean>> overprovision() {
        return Codegen.optional(this.overprovision);
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
    public Output<Optional<PlanResponse>> plan() {
        return Codegen.optional(this.plan);
    }
    /**
     * Fault Domain count for each placement group.
     * 
     */
    @Export(name="platformFaultDomainCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> platformFaultDomainCount;

    /**
     * @return Fault Domain count for each placement group.
     * 
     */
    public Output<Optional<Integer>> platformFaultDomainCount() {
        return Codegen.optional(this.platformFaultDomainCount);
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
     * Specifies information about the proximity placement group that the virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     * 
     */
    @Export(name="proximityPlacementGroup", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> proximityPlacementGroup;

    /**
     * @return Specifies information about the proximity placement group that the virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     * 
     */
    public Output<Optional<SubResourceResponse>> proximityPlacementGroup() {
        return Codegen.optional(this.proximityPlacementGroup);
    }
    /**
     * Specifies the scale-in policy that decides which virtual machines are chosen for removal when a Virtual Machine Scale Set is scaled-in.
     * 
     */
    @Export(name="scaleInPolicy", type=ScaleInPolicyResponse.class, parameters={})
    private Output</* @Nullable */ ScaleInPolicyResponse> scaleInPolicy;

    /**
     * @return Specifies the scale-in policy that decides which virtual machines are chosen for removal when a Virtual Machine Scale Set is scaled-in.
     * 
     */
    public Output<Optional<ScaleInPolicyResponse>> scaleInPolicy() {
        return Codegen.optional(this.scaleInPolicy);
    }
    /**
     * When true this limits the scale set to a single placement group, of max size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if singlePlacementGroup is false, it may not be modified to true.
     * 
     */
    @Export(name="singlePlacementGroup", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> singlePlacementGroup;

    /**
     * @return When true this limits the scale set to a single placement group, of max size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if singlePlacementGroup is false, it may not be modified to true.
     * 
     */
    public Output<Optional<Boolean>> singlePlacementGroup() {
        return Codegen.optional(this.singlePlacementGroup);
    }
    /**
     * The virtual machine scale set sku.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The virtual machine scale set sku.
     * 
     */
    public Output<Optional<SkuResponse>> sku() {
        return Codegen.optional(this.sku);
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
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
     * Specifies the ID which uniquely identifies a Virtual Machine Scale Set.
     * 
     */
    @Export(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return Specifies the ID which uniquely identifies a Virtual Machine Scale Set.
     * 
     */
    public Output<String> uniqueId() {
        return this.uniqueId;
    }
    /**
     * The upgrade policy.
     * 
     */
    @Export(name="upgradePolicy", type=UpgradePolicyResponse.class, parameters={})
    private Output</* @Nullable */ UpgradePolicyResponse> upgradePolicy;

    /**
     * @return The upgrade policy.
     * 
     */
    public Output<Optional<UpgradePolicyResponse>> upgradePolicy() {
        return Codegen.optional(this.upgradePolicy);
    }
    /**
     * The virtual machine profile.
     * 
     */
    @Export(name="virtualMachineProfile", type=VirtualMachineScaleSetVMProfileResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineScaleSetVMProfileResponse> virtualMachineProfile;

    /**
     * @return The virtual machine profile.
     * 
     */
    public Output<Optional<VirtualMachineScaleSetVMProfileResponse>> virtualMachineProfile() {
        return Codegen.optional(this.virtualMachineProfile);
    }
    /**
     * Whether to force strictly even Virtual Machine distribution cross x-zones in case there is zone outage.
     * 
     */
    @Export(name="zoneBalance", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneBalance;

    /**
     * @return Whether to force strictly even Virtual Machine distribution cross x-zones in case there is zone outage.
     * 
     */
    public Output<Optional<Boolean>> zoneBalance() {
        return Codegen.optional(this.zoneBalance);
    }
    /**
     * The virtual machine scale set zones. NOTE: Availability zones can only be set when you create the scale set
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return The virtual machine scale set zones. NOTE: Availability zones can only be set when you create the scale set
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachineScaleSet(String name) {
        this(name, VirtualMachineScaleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachineScaleSet(String name, VirtualMachineScaleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachineScaleSet(String name, VirtualMachineScaleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSet", name, args == null ? VirtualMachineScaleSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMachineScaleSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSet", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20150615:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20160330:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20160430preview:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20170330:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20171201:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180401:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180601:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20181001:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190301:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190701:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20191201:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200601:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20201201:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210301:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210401:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210701:VirtualMachineScaleSet").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20211101:VirtualMachineScaleSet").build())
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
    public static VirtualMachineScaleSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineScaleSet(name, id, options);
    }
}
