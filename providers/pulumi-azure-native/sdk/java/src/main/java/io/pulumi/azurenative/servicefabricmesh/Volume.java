// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabricmesh.VolumeArgs;
import io.pulumi.azurenative.servicefabricmesh.outputs.VolumeProviderParametersAzureFileResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This type describes a volume resource.
 * API Version: 2018-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabricmesh:Volume sampleVolume /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/sbz_demo/providers/Microsoft.ServiceFabricMesh/volumes/sampleVolume 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabricmesh:Volume")
public class Volume extends io.pulumi.resources.CustomResource {
    /**
     * This type describes a volume provided by an Azure Files file share.
     * 
     */
    @Export(name="azureFileParameters", type=VolumeProviderParametersAzureFileResponse.class, parameters={})
    private Output</* @Nullable */ VolumeProviderParametersAzureFileResponse> azureFileParameters;

    /**
     * @return This type describes a volume provided by an Azure Files file share.
     * 
     */
    public Output</* @Nullable */ VolumeProviderParametersAzureFileResponse> azureFileParameters() {
        return this.azureFileParameters;
    }
    /**
     * User readable description of the volume.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return User readable description of the volume.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provider of the volume.
     * 
     */
    @Export(name="provider", type=String.class, parameters={})
    private Output<String> provider;

    /**
     * @return Provider of the volume.
     * 
     */
    public Output<String> provider() {
        return this.provider;
    }
    /**
     * State of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Status of the volume.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the volume.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Gives additional information about the current status of the volume.
     * 
     */
    @Export(name="statusDetails", type=String.class, parameters={})
    private Output<String> statusDetails;

    /**
     * @return Gives additional information about the current status of the volume.
     * 
     */
    public Output<String> statusDetails() {
        return this.statusDetails;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Volume(String name) {
        this(name, VolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Volume(String name, VolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Volume(String name, VolumeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:Volume", name, args == null ? VolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Volume(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:Volume", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:servicefabricmesh/v20180701preview:Volume").build()),
                Output.of(Alias.builder().type("azure-native:servicefabricmesh/v20180901preview:Volume").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Volume get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Volume(name, id, options);
    }
}
