// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.connectedvmwarevsphere.VirtualMachineTemplateArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.NetworkInterfaceResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.VirtualDiskResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Define the virtualMachineTemplate.
 * API Version: 2020-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:connectedvmwarevsphere:VirtualMachineTemplate ContosoAgent /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VirtualMachineTemplates/ContosoAgent 
 * ```
 * 
 */
@ResourceType(type="azure-native:connectedvmwarevsphere:VirtualMachineTemplate")
public class VirtualMachineTemplate extends CustomResource {
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
     * Gets or sets the disks the template.
     * 
     */
    @Export(name="disks", type=List.class, parameters={VirtualDiskResponse.class})
    private Output<List<VirtualDiskResponse>> disks;

    /**
     * @return Gets or sets the disks the template.
     * 
     */
    public Output<List<VirtualDiskResponse>> disks() {
        return this.disks;
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
    private Output<String> firmwareType;

    /**
     * @return Firmware type
     * 
     */
    public Output<String> firmwareType() {
        return this.firmwareType;
    }
    /**
     * Gets or sets the folder path of the template.
     * 
     */
    @Export(name="folderPath", type=String.class, parameters={})
    private Output<String> folderPath;

    /**
     * @return Gets or sets the folder path of the template.
     * 
     */
    public Output<String> folderPath() {
        return this.folderPath;
    }
    /**
     * Gets or sets the inventory Item ID for the virtual machine template.
     * 
     */
    @Export(name="inventoryItemId", type=String.class, parameters={})
    private Output</* @Nullable */ String> inventoryItemId;

    /**
     * @return Gets or sets the inventory Item ID for the virtual machine template.
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
     * Gets or sets memory size in MBs for the template.
     * 
     */
    @Export(name="memorySizeMB", type=Integer.class, parameters={})
    private Output<Integer> memorySizeMB;

    /**
     * @return Gets or sets memory size in MBs for the template.
     * 
     */
    public Output<Integer> memorySizeMB() {
        return this.memorySizeMB;
    }
    /**
     * Gets or sets the vCenter Managed Object name for the virtual machine template.
     * 
     */
    @Export(name="moName", type=String.class, parameters={})
    private Output<String> moName;

    /**
     * @return Gets or sets the vCenter Managed Object name for the virtual machine template.
     * 
     */
    public Output<String> moName() {
        return this.moName;
    }
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine
     * template.
     * 
     */
    @Export(name="moRefId", type=String.class, parameters={})
    private Output</* @Nullable */ String> moRefId;

    /**
     * @return Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine
     * template.
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
     * Gets or sets the network interfaces of the template.
     * 
     */
    @Export(name="networkInterfaces", type=List.class, parameters={NetworkInterfaceResponse.class})
    private Output<List<NetworkInterfaceResponse>> networkInterfaces;

    /**
     * @return Gets or sets the network interfaces of the template.
     * 
     */
    public Output<List<NetworkInterfaceResponse>> networkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * Gets or sets the number of vCPUs for the template.
     * 
     */
    @Export(name="numCPUs", type=Integer.class, parameters={})
    private Output<Integer> numCPUs;

    /**
     * @return Gets or sets the number of vCPUs for the template.
     * 
     */
    public Output<Integer> numCPUs() {
        return this.numCPUs;
    }
    /**
     * Gets or sets the number of cores per socket for the template.
     * Defaults to 1 if unspecified.
     * 
     */
    @Export(name="numCoresPerSocket", type=Integer.class, parameters={})
    private Output<Integer> numCoresPerSocket;

    /**
     * @return Gets or sets the number of cores per socket for the template.
     * Defaults to 1 if unspecified.
     * 
     */
    public Output<Integer> numCoresPerSocket() {
        return this.numCoresPerSocket;
    }
    /**
     * Gets or sets os name.
     * 
     */
    @Export(name="osName", type=String.class, parameters={})
    private Output<String> osName;

    /**
     * @return Gets or sets os name.
     * 
     */
    public Output<String> osName() {
        return this.osName;
    }
    /**
     * Gets or sets the type of the os.
     * 
     */
    @Export(name="osType", type=String.class, parameters={})
    private Output<String> osType;

    /**
     * @return Gets or sets the type of the os.
     * 
     */
    public Output<String> osType() {
        return this.osType;
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
     * Gets or sets the current version of VMware Tools.
     * 
     */
    @Export(name="toolsVersion", type=String.class, parameters={})
    private Output<String> toolsVersion;

    /**
     * @return Gets or sets the current version of VMware Tools.
     * 
     */
    public Output<String> toolsVersion() {
        return this.toolsVersion;
    }
    /**
     * Gets or sets the current version status of VMware Tools installed in the guest operating system.
     * 
     */
    @Export(name="toolsVersionStatus", type=String.class, parameters={})
    private Output<String> toolsVersionStatus;

    /**
     * @return Gets or sets the current version status of VMware Tools installed in the guest operating system.
     * 
     */
    public Output<String> toolsVersionStatus() {
        return this.toolsVersionStatus;
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
     * Gets or sets the ARM Id of the vCenter resource in which this template resides.
     * 
     */
    @Export(name="vCenterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vCenterId;

    /**
     * @return Gets or sets the ARM Id of the vCenter resource in which this template resides.
     * 
     */
    public Output<Optional<String>> vCenterId() {
        return Codegen.optional(this.vCenterId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachineTemplate(String name) {
        this(name, VirtualMachineTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachineTemplate(String name, VirtualMachineTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachineTemplate(String name, VirtualMachineTemplateArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:VirtualMachineTemplate", name, args == null ? VirtualMachineTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMachineTemplate(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:VirtualMachineTemplate", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:connectedvmwarevsphere/v20201001preview:VirtualMachineTemplate").build())
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
    public static VirtualMachineTemplate get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new VirtualMachineTemplate(name, id, options);
    }
}
