// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.blueprint.TemplateArtifactArgs;
import com.pulumi.azurenative.blueprint.outputs.ParameterValueResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Blueprint artifact that deploys a Resource Manager template.
 * API Version: 2018-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:blueprint:TemplateArtifact ownerAssignment /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Blueprint/blueprints/simpleBlueprint/artifacts/ownerAssignment 
 * ```
 * 
 */
@ResourceType(type="azure-native:blueprint:TemplateArtifact")
public class TemplateArtifact extends com.pulumi.resources.CustomResource {
    /**
     * Artifacts which need to be deployed before the specified artifact.
     * 
     */
    @Export(name="dependsOn", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> dependsOn;

    /**
     * @return Artifacts which need to be deployed before the specified artifact.
     * 
     */
    public Output</* @Nullable */ List<String>> dependsOn() {
        return this.dependsOn;
    }
    /**
     * Multi-line explain this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Multi-line explain this resource.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * One-liner string explain this resource.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return One-liner string explain this resource.
     * 
     */
    public Output</* @Nullable */ String> displayName() {
        return this.displayName;
    }
    /**
     * Specifies the kind of blueprint artifact.
     * Expected value is &#39;template&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Specifies the kind of blueprint artifact.
     * Expected value is &#39;template&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of this resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource Manager template blueprint artifact parameter values.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, ParameterValueResponse.class})
    private Output<Map<String,ParameterValueResponse>> parameters;

    /**
     * @return Resource Manager template blueprint artifact parameter values.
     * 
     */
    public Output<Map<String,ParameterValueResponse>> parameters() {
        return this.parameters;
    }
    /**
     * If applicable, the name of the resource group placeholder to which the Resource Manager template blueprint artifact will be deployed.
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroup;

    /**
     * @return If applicable, the name of the resource group placeholder to which the Resource Manager template blueprint artifact will be deployed.
     * 
     */
    public Output</* @Nullable */ String> resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * The Resource Manager template blueprint artifact body.
     * 
     */
    @Export(name="template", type=Object.class, parameters={})
    private Output<Object> template;

    /**
     * @return The Resource Manager template blueprint artifact body.
     * 
     */
    public Output<Object> template() {
        return this.template;
    }
    /**
     * Type of this resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TemplateArtifact(String name) {
        this(name, TemplateArtifactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TemplateArtifact(String name, TemplateArtifactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TemplateArtifact(String name, TemplateArtifactArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:TemplateArtifact", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private TemplateArtifact(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:TemplateArtifact", name, null, makeResourceOptions(options, id));
    }

    private static TemplateArtifactArgs makeArgs(TemplateArtifactArgs args) {
        var builder = args == null ? TemplateArtifactArgs.builder() : TemplateArtifactArgs.builder(args);
        return builder
            .kind("template")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:blueprint/v20181101preview:TemplateArtifact").build())
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
    public static TemplateArtifact get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TemplateArtifact(name, id, options);
    }
}
