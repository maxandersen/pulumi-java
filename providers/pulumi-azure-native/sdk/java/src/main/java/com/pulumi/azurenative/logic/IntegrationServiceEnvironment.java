// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.logic.IntegrationServiceEnvironmentArgs;
import com.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentPropertiesResponse;
import com.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentSkuResponse;
import com.pulumi.azurenative.logic.outputs.ManagedServiceIdentityResponse;
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
 * The integration service environment.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationServiceEnvironment testIntegrationServiceEnvironment /subscriptions/f34b22a3-2202-4fb1-b040-1332bd928c84/resourceGroups/testResourceGroup/providers/Microsoft.Logic/integrationServiceEnvironments/testIntegrationServiceEnvironment 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationServiceEnvironment")
public class IntegrationServiceEnvironment extends CustomResource {
    /**
     * Managed service identity properties.
     * 
     */
    @Export(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Managed service identity properties.
     * 
     */
    public Output<Optional<ManagedServiceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
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
     * The integration service environment properties.
     * 
     */
    @Export(name="properties", type=IntegrationServiceEnvironmentPropertiesResponse.class, parameters={})
    private Output<IntegrationServiceEnvironmentPropertiesResponse> properties;

    /**
     * @return The integration service environment properties.
     * 
     */
    public Output<IntegrationServiceEnvironmentPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * The sku.
     * 
     */
    @Export(name="sku", type=IntegrationServiceEnvironmentSkuResponse.class, parameters={})
    private Output</* @Nullable */ IntegrationServiceEnvironmentSkuResponse> sku;

    /**
     * @return The sku.
     * 
     */
    public Output<Optional<IntegrationServiceEnvironmentSkuResponse>> sku() {
        return Codegen.optional(this.sku);
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
    public IntegrationServiceEnvironment(String name) {
        this(name, IntegrationServiceEnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationServiceEnvironment(String name, IntegrationServiceEnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationServiceEnvironment(String name, IntegrationServiceEnvironmentArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:logic:IntegrationServiceEnvironment", name, args == null ? IntegrationServiceEnvironmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationServiceEnvironment(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:logic:IntegrationServiceEnvironment", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:logic/v20190501:IntegrationServiceEnvironment").build())
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
    public static IntegrationServiceEnvironment get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new IntegrationServiceEnvironment(name, id, options);
    }
}
