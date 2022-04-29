// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.operationsmanagement.ManagementAssociationArgs;
import com.pulumi.azurenative.operationsmanagement.outputs.ManagementAssociationPropertiesResponse;
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
 * $ pulumi import azure-native:operationsmanagement:ManagementAssociation managementAssociation1 /subscriptions/subid/resourcegroups/rg1/providers/Microsoft.OperationalInsights/workspaces/ws1/Microsoft.OperationsManagement/ManagementAssociations/managementAssociation1 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationsmanagement:ManagementAssociation")
public class ManagementAssociation extends CustomResource {
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
     * Properties for ManagementAssociation object supported by the OperationsManagement resource provider.
     * 
     */
    @Export(name="properties", type=ManagementAssociationPropertiesResponse.class, parameters={})
    private Output<ManagementAssociationPropertiesResponse> properties;

    /**
     * @return Properties for ManagementAssociation object supported by the OperationsManagement resource provider.
     * 
     */
    public Output<ManagementAssociationPropertiesResponse> properties() {
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
    public ManagementAssociation(String name) {
        this(name, ManagementAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementAssociation(String name, ManagementAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementAssociation(String name, ManagementAssociationArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:operationsmanagement:ManagementAssociation", name, args == null ? ManagementAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagementAssociation(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:operationsmanagement:ManagementAssociation", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:operationsmanagement/v20151101preview:ManagementAssociation").build())
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
    public static ManagementAssociation get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ManagementAssociation(name, id, options);
    }
}
