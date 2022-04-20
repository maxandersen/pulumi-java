// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devops;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.devops.PipelineArgs;
import com.pulumi.azurenative.devops.outputs.BootstrapConfigurationResponse;
import com.pulumi.azurenative.devops.outputs.SystemDataResponse;
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
 * Pipeline used to configure Continuous Integration (CI) &amp; Continuous Delivery (CD) for Azure resources.
 * API Version: 2020-07-13-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devops:Pipeline myAspNetWebAppPipeline /subscriptions/{subscriptionId}/resourceGroups/myAspNetWebAppPipeline-rg/providers/Microsoft.DevOps/pipelines/myAspNetWebAppPipeline 
 * ```
 * 
 */
@ResourceType(type="azure-native:devops:Pipeline")
public class Pipeline extends com.pulumi.resources.CustomResource {
    /**
     * Configuration used to bootstrap the Pipeline.
     * 
     */
    @Export(name="bootstrapConfiguration", type=BootstrapConfigurationResponse.class, parameters={})
    private Output<BootstrapConfigurationResponse> bootstrapConfiguration;

    /**
     * @return Configuration used to bootstrap the Pipeline.
     * 
     */
    public Output<BootstrapConfigurationResponse> bootstrapConfiguration() {
        return this.bootstrapConfiguration;
    }
    /**
     * Resource Location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource Location
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * Resource Name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Unique identifier of the Pipeline
     * 
     */
    @Export(name="pipelineId", type=Integer.class, parameters={})
    private Output<Integer> pipelineId;

    /**
     * @return Unique identifier of the Pipeline
     * 
     */
    public Output<Integer> pipelineId() {
        return this.pipelineId;
    }
    /**
     * Specifies which CI/CD provider to use. Valid options are &#39;azurePipeline&#39;, &#39;githubWorkflow&#39;.
     * 
     */
    @Export(name="pipelineType", type=String.class, parameters={})
    private Output<String> pipelineType;

    /**
     * @return Specifies which CI/CD provider to use. Valid options are &#39;azurePipeline&#39;, &#39;githubWorkflow&#39;.
     * 
     */
    public Output<String> pipelineType() {
        return this.pipelineType;
    }
    /**
     * The system metadata pertaining to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata pertaining to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource Tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource Tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Resource Type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource Type
     * 
     */
    public Output<String> type() {
        return this.type;
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
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devops:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devops:Pipeline", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:devops/v20190701preview:Pipeline").build()),
                Output.of(Alias.builder().type("azure-native:devops/v20200713preview:Pipeline").build())
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
    public static Pipeline get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, options);
    }
}
