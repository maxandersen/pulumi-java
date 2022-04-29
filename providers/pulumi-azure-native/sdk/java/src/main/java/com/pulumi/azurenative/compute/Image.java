// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.compute.ImageArgs;
import com.pulumi.azurenative.compute.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.compute.outputs.ImageStorageProfileResponse;
import com.pulumi.azurenative.compute.outputs.SubResourceResponse;
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
 * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:Image myImage /subscriptions/{subscription-id}/resourceGroups/disk/providers/Microsoft.Compute/images/myImage 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:Image")
public class Image extends CustomResource {
    /**
     * The extended location of the Image.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the Image.
     * 
     */
    public Output<Optional<ExtendedLocationResponse>> extendedLocation() {
        return Codegen.optional(this.extendedLocation);
    }
    /**
     * Specifies the HyperVGenerationType of the VirtualMachine created from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if the source is managed resource like disk or snapshot, we may require the user to specify the property if we cannot deduce it from the source managed resource.
     * 
     */
    @Export(name="hyperVGeneration", type=String.class, parameters={})
    private Output</* @Nullable */ String> hyperVGeneration;

    /**
     * @return Specifies the HyperVGenerationType of the VirtualMachine created from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if the source is managed resource like disk or snapshot, we may require the user to specify the property if we cannot deduce it from the source managed resource.
     * 
     */
    public Output<Optional<String>> hyperVGeneration() {
        return Codegen.optional(this.hyperVGeneration);
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
     * The provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The source virtual machine from which Image is created.
     * 
     */
    @Export(name="sourceVirtualMachine", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> sourceVirtualMachine;

    /**
     * @return The source virtual machine from which Image is created.
     * 
     */
    public Output<Optional<SubResourceResponse>> sourceVirtualMachine() {
        return Codegen.optional(this.sourceVirtualMachine);
    }
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @Export(name="storageProfile", type=ImageStorageProfileResponse.class, parameters={})
    private Output</* @Nullable */ ImageStorageProfileResponse> storageProfile;

    /**
     * @return Specifies the storage settings for the virtual machine disks.
     * 
     */
    public Output<Optional<ImageStorageProfileResponse>> storageProfile() {
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
    public Image(String name) {
        this(name, ImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Image(String name, ImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Image(String name, ImageArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:compute:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Image(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:compute:Image", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20160430preview:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20170330:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20171201:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180401:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180601:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20181001:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190301:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190701:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20191201:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200601:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20201201:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210301:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210401:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210701:Image").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20211101:Image").build())
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
    public static Image get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Image(name, id, options);
    }
}
