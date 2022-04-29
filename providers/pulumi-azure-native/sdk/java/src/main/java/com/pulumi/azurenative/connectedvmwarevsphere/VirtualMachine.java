// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.connectedvmwarevsphere.VirtualMachineArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.GuestAgentProfileResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.HardwareProfileResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.IdentityResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.NetworkProfileResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.OsProfileResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.PlacementProfileResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.StorageProfileResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Define the virtualMachine.
 * API Version: 2020-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:connectedvmwarevsphere:VirtualMachine ContosoAgent /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VirtualMachines/ContosoAgent 
 * ```
 * 
 */
@ResourceType(type="azure-native:connectedvmwarevsphere:VirtualMachine")
public class VirtualMachine extends CustomResource {
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    @Export(name="customResourceName", type=String.class, parameters={})
    private Output<String> customResourceName;

    /**
     * @return Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    public Output<String> customResourceName() {
        return this.customResourceName;
    }
    /**
     * Gets or sets the extended location.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return Gets or sets the extended location.
     * 
     */
    public Output<Optional<ExtendedLocationResponse>> extendedLocation() {
        return Codegen.optional(this.extendedLocation);
    }
    /**
     * Firmware type
     * 
     */
    @Export(name="firmwareType", type=String.class, parameters={})
    private Output</* @Nullable */ String> firmwareType;

    /**
     * @return Firmware type
     * 
     */
    public Output<Optional<String>> firmwareType() {
        return Codegen.optional(this.firmwareType);
    }
    /**
     * Gets or sets the folder path of the vm.
     * 
     */
    @Export(name="folderPath", type=String.class, parameters={})
    private Output<String> folderPath;

    /**
     * @return Gets or sets the folder path of the vm.
     * 
     */
    public Output<String> folderPath() {
        return this.folderPath;
    }
    /**
     * Guest agent status properties.
     * 
     */
    @Export(name="guestAgentProfile", type=GuestAgentProfileResponse.class, parameters={})
    private Output</* @Nullable */ GuestAgentProfileResponse> guestAgentProfile;

    /**
     * @return Guest agent status properties.
     * 
     */
    public Output<Optional<GuestAgentProfileResponse>> guestAgentProfile() {
        return Codegen.optional(this.guestAgentProfile);
    }
    /**
     * Hardware properties.
     * 
     */
    @Export(name="hardwareProfile", type=HardwareProfileResponse.class, parameters={})
    private Output</* @Nullable */ HardwareProfileResponse> hardwareProfile;

    /**
     * @return Hardware properties.
     * 
     */
    public Output<Optional<HardwareProfileResponse>> hardwareProfile() {
        return Codegen.optional(this.hardwareProfile);
    }
    /**
     * The identity of the resource.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Output<Optional<IdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Gets or sets the instance uuid of the vm.
     * 
     */
    @Export(name="instanceUuid", type=String.class, parameters={})
    private Output<String> instanceUuid;

    /**
     * @return Gets or sets the instance uuid of the vm.
     * 
     */
    public Output<String> instanceUuid() {
        return this.instanceUuid;
    }
    /**
     * Gets or sets the inventory Item ID for the virtual machine.
     * 
     */
    @Export(name="inventoryItemId", type=String.class, parameters={})
    private Output</* @Nullable */ String> inventoryItemId;

    /**
     * @return Gets or sets the inventory Item ID for the virtual machine.
     * 
     */
    public Output<Optional<String>> inventoryItemId() {
        return Codegen.optional(this.inventoryItemId);
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Gets or sets the location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Gets or sets the vCenter Managed Object name for the virtual machine.
     * 
     */
    @Export(name="moName", type=String.class, parameters={})
    private Output<String> moName;

    /**
     * @return Gets or sets the vCenter Managed Object name for the virtual machine.
     * 
     */
    public Output<String> moName() {
        return this.moName;
    }
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine.
     * 
     */
    @Export(name="moRefId", type=String.class, parameters={})
    private Output</* @Nullable */ String> moRefId;

    /**
     * @return Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine.
     * 
     */
    public Output<Optional<String>> moRefId() {
        return Codegen.optional(this.moRefId);
    }
    /**
     * Gets or sets the name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets or sets the name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Network properties.
     * 
     */
    @Export(name="networkProfile", type=NetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ NetworkProfileResponse> networkProfile;

    /**
     * @return Network properties.
     * 
     */
    public Output<Optional<NetworkProfileResponse>> networkProfile() {
        return Codegen.optional(this.networkProfile);
    }
    /**
     * OS properties.
     * 
     */
    @Export(name="osProfile", type=OsProfileResponse.class, parameters={})
    private Output</* @Nullable */ OsProfileResponse> osProfile;

    /**
     * @return OS properties.
     * 
     */
    public Output<Optional<OsProfileResponse>> osProfile() {
        return Codegen.optional(this.osProfile);
    }
    /**
     * Placement properties.
     * 
     */
    @Export(name="placementProfile", type=PlacementProfileResponse.class, parameters={})
    private Output</* @Nullable */ PlacementProfileResponse> placementProfile;

    /**
     * @return Placement properties.
     * 
     */
    public Output<Optional<PlacementProfileResponse>> placementProfile() {
        return Codegen.optional(this.placementProfile);
    }
    /**
     * Gets the power state of the virtual machine.
     * 
     */
    @Export(name="powerState", type=String.class, parameters={})
    private Output<String> powerState;

    /**
     * @return Gets the power state of the virtual machine.
     * 
     */
    public Output<String> powerState() {
        return this.powerState;
    }
    /**
     * Gets or sets the provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will
     * deploy.
     * 
     */
    @Export(name="resourcePoolId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourcePoolId;

    /**
     * @return Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will
     * deploy.
     * 
     */
    public Output<Optional<String>> resourcePoolId() {
        return Codegen.optional(this.resourcePoolId);
    }
    /**
     * Gets or sets the SMBIOS UUID of the vm.
     * 
     */
    @Export(name="smbiosUuid", type=String.class, parameters={})
    private Output</* @Nullable */ String> smbiosUuid;

    /**
     * @return Gets or sets the SMBIOS UUID of the vm.
     * 
     */
    public Output<Optional<String>> smbiosUuid() {
        return Codegen.optional(this.smbiosUuid);
    }
    /**
     * The resource status information.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={ResourceStatusResponse.class})
    private Output<List<ResourceStatusResponse>> statuses;

    /**
     * @return The resource status information.
     * 
     */
    public Output<List<ResourceStatusResponse>> statuses() {
        return this.statuses;
    }
    /**
     * Storage properties.
     * 
     */
    @Export(name="storageProfile", type=StorageProfileResponse.class, parameters={})
    private Output</* @Nullable */ StorageProfileResponse> storageProfile;

    /**
     * @return Storage properties.
     * 
     */
    public Output<Optional<StorageProfileResponse>> storageProfile() {
        return Codegen.optional(this.storageProfile);
    }
    /**
     * The system data.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Gets or sets the Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Gets or sets the Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Gets or sets the ARM Id of the template resource to deploy the virtual machine.
     * 
     */
    @Export(name="templateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateId;

    /**
     * @return Gets or sets the ARM Id of the template resource to deploy the virtual machine.
     * 
     */
    public Output<Optional<String>> templateId() {
        return Codegen.optional(this.templateId);
    }
    /**
     * Gets or sets the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets or sets the type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return Gets or sets a unique identifier for this resource.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    @Export(name="vCenterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vCenterId;

    /**
     * @return Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    public Output<Optional<String>> vCenterId() {
        return Codegen.optional(this.vCenterId);
    }
    /**
     * Gets or sets a unique identifier for the vm resource.
     * 
     */
    @Export(name="vmId", type=String.class, parameters={})
    private Output<String> vmId;

    /**
     * @return Gets or sets a unique identifier for the vm resource.
     * 
     */
    public Output<String> vmId() {
        return this.vmId;
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
    public VirtualMachine(String name, VirtualMachineArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:VirtualMachine", name, args == null ? VirtualMachineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMachine(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:VirtualMachine", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:connectedvmwarevsphere/v20201001preview:VirtualMachine").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VirtualMachine get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new VirtualMachine(name, id, options);
    }
}
