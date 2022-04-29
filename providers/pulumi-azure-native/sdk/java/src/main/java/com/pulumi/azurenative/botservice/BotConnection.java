// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.botservice.BotConnectionArgs;
import com.pulumi.azurenative.botservice.outputs.ConnectionSettingPropertiesResponse;
import com.pulumi.azurenative.botservice.outputs.SkuResponse;
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
 * Bot channel resource definition
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:botservice:BotConnection sampleConnection /subscriptions/subscription-id/resourceGroups/OneResourceGroupName/providers/Microsoft.BotService/botServices/samplebotname/connections/sampleConnection 
 * ```
 * 
 */
@ResourceType(type="azure-native:botservice:BotConnection")
public class BotConnection extends CustomResource {
    /**
     * Entity Tag
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Entity Tag
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * Required. Gets or sets the Kind of the resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Required. Gets or sets the Kind of the resource.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Specifies the location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Specifies the name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The set of properties specific to bot channel resource
     * 
     */
    @Export(name="properties", type=ConnectionSettingPropertiesResponse.class, parameters={})
    private Output<ConnectionSettingPropertiesResponse> properties;

    /**
     * @return The set of properties specific to bot channel resource
     * 
     */
    public Output<ConnectionSettingPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Gets or sets the SKU of the resource.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Gets or sets the SKU of the resource.
     * 
     */
    public Output<Optional<SkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Contains resource tags defined as key/value pairs.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specifies the type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Entity zones
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output<List<String>> zones;

    /**
     * @return Entity zones
     * 
     */
    public Output<List<String>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BotConnection(String name) {
        this(name, BotConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotConnection(String name, BotConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotConnection(String name, BotConnectionArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:botservice:BotConnection", name, args == null ? BotConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BotConnection(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:botservice:BotConnection", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:botservice/v20171201:BotConnection").build()),
                Output.of(Alias.builder().type("azure-native:botservice/v20180712:BotConnection").build()),
                Output.of(Alias.builder().type("azure-native:botservice/v20200602:BotConnection").build()),
                Output.of(Alias.builder().type("azure-native:botservice/v20210301:BotConnection").build()),
                Output.of(Alias.builder().type("azure-native:botservice/v20210501preview:BotConnection").build())
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
    public static BotConnection get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new BotConnection(name, id, options);
    }
}
