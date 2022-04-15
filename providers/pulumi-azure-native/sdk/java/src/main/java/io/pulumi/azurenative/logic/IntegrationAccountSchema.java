// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.IntegrationAccountSchemaArgs;
import io.pulumi.azurenative.logic.outputs.ContentLinkResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The integration account schema.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationAccountSchema IntegrationAccountSchema5349 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testResourceGroup/providers/Microsoft.Logic/integrationAccounts/testIntegrationAccount/schemas/testSchema 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationAccountSchema")
public class IntegrationAccountSchema extends io.pulumi.resources.CustomResource {
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
    public Output</* @Nullable */ String> content() {
        return this.content;
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
    public Output</* @Nullable */ String> contentType() {
        return this.contentType;
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
     * The document name.
     * 
     */
    @Export(name="documentName", type=String.class, parameters={})
    private Output</* @Nullable */ String> documentName;

    /**
     * @return The document name.
     * 
     */
    public Output</* @Nullable */ String> documentName() {
        return this.documentName;
    }
    /**
     * The file name.
     * 
     */
    @Export(name="fileName", type=String.class, parameters={})
    private Output</* @Nullable */ String> fileName;

    /**
     * @return The file name.
     * 
     */
    public Output</* @Nullable */ String> fileName() {
        return this.fileName;
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
    public Output</* @Nullable */ String> location() {
        return this.location;
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
    public Output</* @Nullable */ Object> metadata() {
        return this.metadata;
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
     * The schema type.
     * 
     */
    @Export(name="schemaType", type=String.class, parameters={})
    private Output<String> schemaType;

    /**
     * @return The schema type.
     * 
     */
    public Output<String> schemaType() {
        return this.schemaType;
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
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The target namespace of the schema.
     * 
     */
    @Export(name="targetNamespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetNamespace;

    /**
     * @return The target namespace of the schema.
     * 
     */
    public Output</* @Nullable */ String> targetNamespace() {
        return this.targetNamespace;
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
    public IntegrationAccountSchema(String name) {
        this(name, IntegrationAccountSchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccountSchema(String name, IntegrationAccountSchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccountSchema(String name, IntegrationAccountSchemaArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountSchema", name, args == null ? IntegrationAccountSchemaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationAccountSchema(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountSchema", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:logic/v20150801preview:IntegrationAccountSchema").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20160601:IntegrationAccountSchema").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20180701preview:IntegrationAccountSchema").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20190501:IntegrationAccountSchema").build())
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
    public static IntegrationAccountSchema get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAccountSchema(name, id, options);
    }
}
