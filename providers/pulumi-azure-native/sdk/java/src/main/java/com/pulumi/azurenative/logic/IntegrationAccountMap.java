// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.logic.IntegrationAccountMapArgs;
import com.pulumi.azurenative.logic.outputs.ContentLinkResponse;
import com.pulumi.azurenative.logic.outputs.IntegrationAccountMapPropertiesResponseParametersSchema;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The integration account map.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationAccountMap IntegrationAccountMap291 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/&lt;resourceGroup&gt;/providers/Microsoft.Logic/integrationAccounts/&lt;IntegrationAccount&gt;/maps/testMap 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationAccountMap")
public class IntegrationAccountMap extends CustomResource {
    /**
     * The changed time.
     * 
     */
    @Export(name="changedTime", type=String.class, parameters={})
    private Output<String> changedTime;

    /**
     * @return The changed time.
     * 
     */
    public Output<String> changedTime() {
        return this.changedTime;
    }
    /**
     * The content.
     * 
     */
    @Export(name="content", type=String.class, parameters={})
    private Output</* @Nullable */ String> content;

    /**
     * @return The content.
     * 
     */
    public Output<Optional<String>> content() {
        return Codegen.optional(this.content);
    }
    /**
     * The content link.
     * 
     */
    @Export(name="contentLink", type=ContentLinkResponse.class, parameters={})
    private Output<ContentLinkResponse> contentLink;

    /**
     * @return The content link.
     * 
     */
    public Output<ContentLinkResponse> contentLink() {
        return this.contentLink;
    }
    /**
     * The content type.
     * 
     */
    @Export(name="contentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentType;

    /**
     * @return The content type.
     * 
     */
    public Output<Optional<String>> contentType() {
        return Codegen.optional(this.contentType);
    }
    /**
     * The created time.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The created time.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The map type.
     * 
     */
    @Export(name="mapType", type=String.class, parameters={})
    private Output<String> mapType;

    /**
     * @return The map type.
     * 
     */
    public Output<String> mapType() {
        return this.mapType;
    }
    /**
     * The metadata.
     * 
     */
    @Export(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The metadata.
     * 
     */
    public Output<Optional<Object>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Gets the resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parameters schema of integration account map.
     * 
     */
    @Export(name="parametersSchema", type=IntegrationAccountMapPropertiesResponseParametersSchema.class, parameters={})
    private Output</* @Nullable */ IntegrationAccountMapPropertiesResponseParametersSchema> parametersSchema;

    /**
     * @return The parameters schema of integration account map.
     * 
     */
    public Output<Optional<IntegrationAccountMapPropertiesResponseParametersSchema>> parametersSchema() {
        return Codegen.optional(this.parametersSchema);
    }
    /**
     * The resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Gets the resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationAccountMap(String name) {
        this(name, IntegrationAccountMapArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccountMap(String name, IntegrationAccountMapArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccountMap(String name, IntegrationAccountMapArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountMap", name, args == null ? IntegrationAccountMapArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationAccountMap(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountMap", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:logic/v20150801preview:IntegrationAccountMap").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20160601:IntegrationAccountMap").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20180701preview:IntegrationAccountMap").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20190501:IntegrationAccountMap").build())
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
    public static IntegrationAccountMap get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new IntegrationAccountMap(name, id, options);
    }
}
