// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.logic.IntegrationAccountSessionArgs;
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
 * The integration account session.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationAccountSession testsession123-ICN /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.Logic/integrationAccounts/testia123/sessions/testsession123-ICN 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationAccountSession")
public class IntegrationAccountSession extends com.pulumi.resources.CustomResource {
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
     * The session content.
     * 
     */
    @Export(name="content", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> content;

    /**
     * @return The session content.
     * 
     */
    public Output<Optional<Object>> content() {
        return Codegen.optional(this.content);
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
    public IntegrationAccountSession(String name) {
        this(name, IntegrationAccountSessionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccountSession(String name, IntegrationAccountSessionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccountSession(String name, IntegrationAccountSessionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountSession", name, args == null ? IntegrationAccountSessionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationAccountSession(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountSession", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:logic/v20160601:IntegrationAccountSession").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20180701preview:IntegrationAccountSession").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20190501:IntegrationAccountSession").build())
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
    public static IntegrationAccountSession get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAccountSession(name, id, options);
    }
}
