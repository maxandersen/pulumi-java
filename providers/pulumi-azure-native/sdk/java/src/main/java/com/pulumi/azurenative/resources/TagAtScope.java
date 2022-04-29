// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.resources.TagAtScopeArgs;
import com.pulumi.azurenative.resources.outputs.TagsResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Wrapper resource for tags API requests and responses.
 * API Version: 2019-10-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:resources:TagAtScope myresource1 /{scope}/providers/Microsoft.Resources/tags/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:resources:TagAtScope")
public class TagAtScope extends CustomResource {
    /**
     * The name of the tags wrapper resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the tags wrapper resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The set of tags.
     * 
     */
    @Export(name="properties", type=TagsResponse.class, parameters={})
    private Output<TagsResponse> properties;

    /**
     * @return The set of tags.
     * 
     */
    public Output<TagsResponse> properties() {
        return this.properties;
    }
    /**
     * The type of the tags wrapper resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the tags wrapper resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagAtScope(String name) {
        this(name, TagAtScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagAtScope(String name, TagAtScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagAtScope(String name, TagAtScopeArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:resources:TagAtScope", name, args == null ? TagAtScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagAtScope(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:resources:TagAtScope", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:resources/v20191001:TagAtScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20200601:TagAtScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20200801:TagAtScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20201001:TagAtScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210101:TagAtScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210401:TagAtScope").build())
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
    public static TagAtScope get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new TagAtScope(name, id, options);
    }
}
