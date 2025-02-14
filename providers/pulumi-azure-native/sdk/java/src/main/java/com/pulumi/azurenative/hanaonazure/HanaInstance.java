// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.hanaonazure.HanaInstanceArgs;
import com.pulumi.azurenative.hanaonazure.outputs.HardwareProfileResponse;
import com.pulumi.azurenative.hanaonazure.outputs.NetworkProfileResponse;
import com.pulumi.azurenative.hanaonazure.outputs.OSProfileResponse;
import com.pulumi.azurenative.hanaonazure.outputs.StorageProfileResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * HANA instance info on Azure (ARM properties and HANA properties)
 * API Version: 2017-11-03-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hanaonazure:HanaInstance myHanaInstance /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.HanaOnAzure/hanaInstances/myHanaInstance 
 * ```
 * 
 */
@ResourceType(type="azure-native:hanaonazure:HanaInstance")
public class HanaInstance extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the HANA instance unique ID.
     * 
     */
    @Export(name="hanaInstanceId", type=String.class, parameters={})
    private Output<String> hanaInstanceId;

    /**
     * @return Specifies the HANA instance unique ID.
     * 
     */
    public Output<String> hanaInstanceId() {
        return this.hanaInstanceId;
    }
    /**
     * Specifies the hardware settings for the HANA instance.
     * 
     */
    @Export(name="hardwareProfile", type=HardwareProfileResponse.class, parameters={})
    private Output</* @Nullable */ HardwareProfileResponse> hardwareProfile;

    /**
     * @return Specifies the hardware settings for the HANA instance.
     * 
     */
    public Output<Optional<HardwareProfileResponse>> hardwareProfile() {
        return Codegen.optional(this.hardwareProfile);
    }
    /**
     * Hardware revision of a HANA instance
     * 
     */
    @Export(name="hwRevision", type=String.class, parameters={})
    private Output<String> hwRevision;

    /**
     * @return Hardware revision of a HANA instance
     * 
     */
    public Output<String> hwRevision() {
        return this.hwRevision;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
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
     * Specifies the network settings for the HANA instance.
     * 
     */
    @Export(name="networkProfile", type=NetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ NetworkProfileResponse> networkProfile;

    /**
     * @return Specifies the network settings for the HANA instance.
     * 
     */
    public Output<Optional<NetworkProfileResponse>> networkProfile() {
        return Codegen.optional(this.networkProfile);
    }
    /**
     * Specifies the operating system settings for the HANA instance.
     * 
     */
    @Export(name="osProfile", type=OSProfileResponse.class, parameters={})
    private Output</* @Nullable */ OSProfileResponse> osProfile;

    /**
     * @return Specifies the operating system settings for the HANA instance.
     * 
     */
    public Output<Optional<OSProfileResponse>> osProfile() {
        return Codegen.optional(this.osProfile);
    }
    /**
     * ARM ID of another HanaInstance that will share a network with this HanaInstance
     * 
     */
    @Export(name="partnerNodeId", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerNodeId;

    /**
     * @return ARM ID of another HanaInstance that will share a network with this HanaInstance
     * 
     */
    public Output<Optional<String>> partnerNodeId() {
        return Codegen.optional(this.partnerNodeId);
    }
    /**
     * Resource power state
     * 
     */
    @Export(name="powerState", type=String.class, parameters={})
    private Output<String> powerState;

    /**
     * @return Resource power state
     * 
     */
    public Output<String> powerState() {
        return this.powerState;
    }
    /**
     * State of provisioning of the HanaInstance
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of provisioning of the HanaInstance
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource proximity placement group
     * 
     */
    @Export(name="proximityPlacementGroup", type=String.class, parameters={})
    private Output<String> proximityPlacementGroup;

    /**
     * @return Resource proximity placement group
     * 
     */
    public Output<String> proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }
    /**
     * Specifies the storage settings for the HANA instance disks.
     * 
     */
    @Export(name="storageProfile", type=StorageProfileResponse.class, parameters={})
    private Output</* @Nullable */ StorageProfileResponse> storageProfile;

    /**
     * @return Specifies the storage settings for the HANA instance disks.
     * 
     */
    public Output<Optional<StorageProfileResponse>> storageProfile() {
        return Codegen.optional(this.storageProfile);
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HanaInstance(String name) {
        this(name, HanaInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HanaInstance(String name, HanaInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HanaInstance(String name, HanaInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hanaonazure:HanaInstance", name, args == null ? HanaInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HanaInstance(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hanaonazure:HanaInstance", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:hanaonazure/v20171103preview:HanaInstance").build())
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
    public static HanaInstance get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HanaInstance(name, id, options);
    }
}
