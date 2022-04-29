// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.containerregistry.ImportPipelineArgs;
import com.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.ImportPipelineSourcePropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.PipelineTriggerPropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An object that represents an import pipeline for a container registry.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerregistry:ImportPipeline myImportPipeline /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/importPipelines/myImportPipeline 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerregistry:ImportPipeline")
public class ImportPipeline extends CustomResource {
    /**
     * The identity of the import pipeline.
     * 
     */
    @Export(name="identity", type=IdentityPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ IdentityPropertiesResponse> identity;

    /**
     * @return The identity of the import pipeline.
     * 
     */
    public Output<Optional<IdentityPropertiesResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The location of the import pipeline.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the import pipeline.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The list of all options configured for the pipeline.
     * 
     */
    @Export(name="options", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> options;

    /**
     * @return The list of all options configured for the pipeline.
     * 
     */
    public Output<Optional<List<String>>> options() {
        return Codegen.optional(this.options);
    }
    /**
     * The provisioning state of the pipeline at the time the operation was called.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the pipeline at the time the operation was called.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The source properties of the import pipeline.
     * 
     */
    @Export(name="source", type=ImportPipelineSourcePropertiesResponse.class, parameters={})
    private Output<ImportPipelineSourcePropertiesResponse> source;

    /**
     * @return The source properties of the import pipeline.
     * 
     */
    public Output<ImportPipelineSourcePropertiesResponse> source() {
        return this.source;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The properties that describe the trigger of the import pipeline.
     * 
     */
    @Export(name="trigger", type=PipelineTriggerPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ PipelineTriggerPropertiesResponse> trigger;

    /**
     * @return The properties that describe the trigger of the import pipeline.
     * 
     */
    public Output<Optional<PipelineTriggerPropertiesResponse>> trigger() {
        return Codegen.optional(this.trigger);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImportPipeline(String name) {
        this(name, ImportPipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImportPipeline(String name, ImportPipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImportPipeline(String name, ImportPipelineArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:containerregistry:ImportPipeline", name, args == null ? ImportPipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ImportPipeline(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:containerregistry:ImportPipeline", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:containerregistry/v20191201preview:ImportPipeline").build()),
                Output.of(Alias.builder().type("azure-native:containerregistry/v20201101preview:ImportPipeline").build()),
                Output.of(Alias.builder().type("azure-native:containerregistry/v20210601preview:ImportPipeline").build()),
                Output.of(Alias.builder().type("azure-native:containerregistry/v20210801preview:ImportPipeline").build()),
                Output.of(Alias.builder().type("azure-native:containerregistry/v20211201preview:ImportPipeline").build())
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
    public static ImportPipeline get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ImportPipeline(name, id, options);
    }
}
