// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.datapipeline.PipelineArgs;
import com.pulumi.aws.datapipeline.inputs.PipelineState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a DataPipeline Pipeline resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_datapipeline_pipeline` can be imported by using the id (Pipeline ID), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:datapipeline/pipeline:Pipeline default df-1234567890
 * ```
 * 
 */
@ResourceType(type="aws:datapipeline/pipeline:Pipeline")
public class Pipeline extends com.pulumi.resources.CustomResource {
    /**
     * The description of Pipeline.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of Pipeline.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The name of Pipeline.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of Pipeline.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, @Nullable PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, @Nullable PipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datapipeline/pipeline:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datapipeline/pipeline:Pipeline", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Pipeline get(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, state, options);
    }
}
