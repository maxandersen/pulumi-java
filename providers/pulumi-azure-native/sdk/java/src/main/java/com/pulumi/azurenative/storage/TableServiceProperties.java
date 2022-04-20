// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storage.TableServicePropertiesArgs;
import com.pulumi.azurenative.storage.outputs.CorsRulesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The properties of a storage account’s Table service.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:TableServiceProperties default /subscriptions/{subscription-id}/resourceGroups/res4410/providers/Microsoft.Storage/storageAccounts/sto8607/tableServices/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:TableServiceProperties")
public class TableServiceProperties extends com.pulumi.resources.CustomResource {
    /**
     * Specifies CORS rules for the Table service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Table service.
     * 
     */
    @Export(name="cors", type=CorsRulesResponse.class, parameters={})
    private Output</* @Nullable */ CorsRulesResponse> cors;

    /**
     * @return Specifies CORS rules for the Table service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Table service.
     * 
     */
    public Output</* @Nullable */ CorsRulesResponse> cors() {
        return this.cors;
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
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TableServiceProperties(String name) {
        this(name, TableServicePropertiesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TableServiceProperties(String name, TableServicePropertiesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TableServiceProperties(String name, TableServicePropertiesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:TableServiceProperties", name, args == null ? TableServicePropertiesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TableServiceProperties(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:TableServiceProperties", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20190601:TableServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:TableServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:TableServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:TableServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:TableServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:TableServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:TableServiceProperties").build())
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
    public static TableServiceProperties get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TableServiceProperties(name, id, options);
    }
}
