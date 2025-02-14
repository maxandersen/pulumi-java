// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.videoanalyzer.PipelineJobArgs;
import com.pulumi.azurenative.videoanalyzer.outputs.ParameterDefinitionResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.PipelineJobErrorResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Pipeline job represents a unique instance of a batch topology, used for offline processing of selected portions of archived content.
 * API Version: 2021-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:videoanalyzer:PipelineJob pipelineJob1 /subscriptions/591e76c3-3e97-44db-879c-3e2b12961b62/resourceGroups/testrg/providers/Microsoft.Media/videoAnalyzers/testaccount2/pipelineJobs/pipelineJob1 
 * ```
 * 
 */
@ResourceType(type="azure-native:videoanalyzer:PipelineJob")
public class PipelineJob extends com.pulumi.resources.CustomResource {
    /**
     * An optional description for the pipeline.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description for the pipeline.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Details about the error, in case the pipeline job fails.
     * 
     */
    @Export(name="error", type=PipelineJobErrorResponse.class, parameters={})
    private Output<PipelineJobErrorResponse> error;

    /**
     * @return Details about the error, in case the pipeline job fails.
     * 
     */
    public Output<PipelineJobErrorResponse> error() {
        return this.error;
    }
    /**
     * The date-time by when this pipeline job will be automatically deleted from your account.
     * 
     */
    @Export(name="expiration", type=String.class, parameters={})
    private Output<String> expiration;

    /**
     * @return The date-time by when this pipeline job will be automatically deleted from your account.
     * 
     */
    public Output<String> expiration() {
        return this.expiration;
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
     * List of the instance level parameter values for the user-defined topology parameters. A pipeline can only define or override parameters values for parameters which have been declared in the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a default value can be optionally be overridden.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={ParameterDefinitionResponse.class})
    private Output</* @Nullable */ List<ParameterDefinitionResponse>> parameters;

    /**
     * @return List of the instance level parameter values for the user-defined topology parameters. A pipeline can only define or override parameters values for parameters which have been declared in the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a default value can be optionally be overridden.
     * 
     */
    public Output<Optional<List<ParameterDefinitionResponse>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * Current state of the pipeline (read-only).
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current state of the pipeline (read-only).
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Reference to an existing pipeline topology. When activated, this pipeline job will process content according to the pipeline topology definition.
     * 
     */
    @Export(name="topologyName", type=String.class, parameters={})
    private Output<String> topologyName;

    /**
     * @return Reference to an existing pipeline topology. When activated, this pipeline job will process content according to the pipeline topology definition.
     * 
     */
    public Output<String> topologyName() {
        return this.topologyName;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PipelineJob(String name) {
        this(name, PipelineJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PipelineJob(String name, PipelineJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PipelineJob(String name, PipelineJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:PipelineJob", name, args == null ? PipelineJobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PipelineJob(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:PipelineJob", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:videoanalyzer/v20211101preview:PipelineJob").build())
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
    public static PipelineJob get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PipelineJob(name, id, options);
    }
}
