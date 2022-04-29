// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.operationsmanagement.ManagementConfigurationArgs;
import com.pulumi.azurenative.operationsmanagement.outputs.ManagementConfigurationPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The container for solution.
 * API Version: 2015-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:operationsmanagement:ManagementConfiguration managementConfiguration1 subscriptions/subid/resourcegroups/rg1/providers/Microsoft.OperationsManagement/ManagementConfigurations/managementConfiguration1 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationsmanagement:ManagementConfiguration")
public class ManagementConfiguration extends CustomResource {
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties for ManagementConfiguration object supported by the OperationsManagement resource provider.
     * 
     */
    @Export(name="properties", type=ManagementConfigurationPropertiesResponse.class, parameters={})
    private Output<ManagementConfigurationPropertiesResponse> properties;

    /**
     * @return Properties for ManagementConfiguration object supported by the OperationsManagement resource provider.
     * 
     */
    public Output<ManagementConfigurationPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagementConfiguration(String name) {
        this(name, ManagementConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementConfiguration(String name, ManagementConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementConfiguration(String name, ManagementConfigurationArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:operationsmanagement:ManagementConfiguration", name, args == null ? ManagementConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagementConfiguration(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:operationsmanagement:ManagementConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:operationsmanagement/v20151101preview:ManagementConfiguration").build())
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
    public static ManagementConfiguration get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ManagementConfiguration(name, id, options);
    }
}
