// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.engagementfabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.engagementfabric.AccountArgs;
import io.pulumi.azurenative.engagementfabric.outputs.SKUResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The EngagementFabric account
 * API Version: 2018-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:engagementfabric:Account ExampleAccount subscriptions/EDBF0095-A524-4A84-95FB-F72DA41AA6A1/resourceGroups/ExampleRg/providers/Microsoft.EngagementFabric/Accounts/ExampleAccount 
 * ```
 * 
 */
@ResourceType(type="azure-native:engagementfabric:Account")
public class Account extends io.pulumi.resources.CustomResource {
    /**
     * The location of the resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * The SKU of the resource
     * 
     */
    @Export(name="sku", type=SKUResponse.class, parameters={})
    private Output<SKUResponse> sku;

    /**
     * @return The SKU of the resource
     * 
     */
    public Output<SKUResponse> sku() {
        return this.sku;
    }
    /**
     * The tags of the resource
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The fully qualified type of the resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The fully qualified type of the resource
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(String name, AccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:engagementfabric:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:engagementfabric:Account", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:engagementfabric/v20180901preview:Account").build())
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
    public static Account get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, options);
    }
}
