// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.logic.IntegrationAccountBatchConfigurationArgs;
import com.pulumi.azurenative.logic.outputs.BatchConfigurationPropertiesResponse;
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
 * The batch configuration resource definition.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationAccountBatchConfiguration testBatchConfiguration /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testResourceGroup/providers/Microsoft.Logic/integrationAccounts/testIntegrationAccount/batchConfigurations/testBatchConfiguration 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationAccountBatchConfiguration")
public class IntegrationAccountBatchConfiguration extends CustomResource {
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
     * The batch configuration properties.
     * 
     */
    @Export(name="properties", type=BatchConfigurationPropertiesResponse.class, parameters={})
    private Output<BatchConfigurationPropertiesResponse> properties;

    /**
     * @return The batch configuration properties.
     * 
     */
    public Output<BatchConfigurationPropertiesResponse> properties() {
        return this.properties;
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
    public IntegrationAccountBatchConfiguration(String name) {
        this(name, IntegrationAccountBatchConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccountBatchConfiguration(String name, IntegrationAccountBatchConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccountBatchConfiguration(String name, IntegrationAccountBatchConfigurationArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountBatchConfiguration", name, args == null ? IntegrationAccountBatchConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationAccountBatchConfiguration(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountBatchConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:logic/v20160601:IntegrationAccountBatchConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20180701preview:IntegrationAccountBatchConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20190501:IntegrationAccountBatchConfiguration").build())
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
    public static IntegrationAccountBatchConfiguration get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new IntegrationAccountBatchConfiguration(name, id, options);
    }
}
