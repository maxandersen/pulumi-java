// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.resources.TemplateSpecArgs;
import com.pulumi.azurenative.resources.outputs.SystemDataResponse;
import com.pulumi.azurenative.resources.outputs.TemplateSpecVersionInfoResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Template Spec object.
 * API Version: 2022-02-01.
 * 
 * ## Example Usage
 * ### TemplateSpecsCreateUpdate
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var templateSpec = new TemplateSpec(&#34;templateSpec&#34;, TemplateSpecArgs.builder()        
 *             .description(&#34;A very simple Template Spec&#34;)
 *             .location(&#34;eastus&#34;)
 *             .resourceGroupName(&#34;templateSpecRG&#34;)
 *             .templateSpecName(&#34;simpleTemplateSpec&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:resources:TemplateSpec simpleTemplateSpec /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/templateSpecRG/providers/Microsoft.Resources/templateSpecs/simpleTemplateSpec 
 * ```
 * 
 */
@ResourceType(type="azure-native:resources:TemplateSpec")
public class TemplateSpec extends com.pulumi.resources.CustomResource {
    /**
     * Template Spec description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Template Spec description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Template Spec display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Template Spec display name.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The location of the Template Spec. It cannot be changed after Template Spec creation. It must be one of the supported Azure locations.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the Template Spec. It cannot be changed after Template Spec creation. It must be one of the supported Azure locations.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The Template Spec metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
     * 
     */
    @Export(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The Template Spec metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
     * 
     */
    public Output<Optional<Object>> metadata() {
        return Codegen.optional(this.metadata);
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
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
     * High-level information about the versions within this Template Spec. The keys are the version names. Only populated if the $expand query parameter is set to &#39;versions&#39;.
     * 
     */
    @Export(name="versions", type=Map.class, parameters={String.class, TemplateSpecVersionInfoResponse.class})
    private Output<Map<String,TemplateSpecVersionInfoResponse>> versions;

    /**
     * @return High-level information about the versions within this Template Spec. The keys are the version names. Only populated if the $expand query parameter is set to &#39;versions&#39;.
     * 
     */
    public Output<Map<String,TemplateSpecVersionInfoResponse>> versions() {
        return this.versions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TemplateSpec(String name) {
        this(name, TemplateSpecArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TemplateSpec(String name, TemplateSpecArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TemplateSpec(String name, TemplateSpecArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:TemplateSpec", name, args == null ? TemplateSpecArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TemplateSpec(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:TemplateSpec", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:resources/v20190601preview:TemplateSpec").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210301preview:TemplateSpec").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210501:TemplateSpec").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20220201:TemplateSpec").build())
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
    public static TemplateSpec get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TemplateSpec(name, id, options);
    }
}
