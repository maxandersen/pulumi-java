// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.guestconfiguration.GuestConfigurationHCRPAssignmentArgs;
import io.pulumi.azurenative.guestconfiguration.outputs.GuestConfigurationAssignmentPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Guest configuration assignment is an association between a machine and guest configuration.
 * API Version: 2020-06-25.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:guestconfiguration:GuestConfigurationHCRPAssignment WhitelistedApplication /subscriptions/mysubscriptionid/resourceGroups/myResourceGroupName/providers/HybridRP.Compute/virtualMachines/myvm/providers/Microsoft.GuestConfiguration/guestConfigurationAssignments/WhitelistedApplication 
 * ```
 * 
 */
@ResourceType(type="azure-native:guestconfiguration:GuestConfigurationHCRPAssignment")
public class GuestConfigurationHCRPAssignment extends io.pulumi.resources.CustomResource {
    /**
     * Region where the VM is located.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Region where the VM is located.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * Name of the guest configuration assignment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the guest configuration assignment.
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    /**
     * Properties of the Guest configuration assignment.
     * 
     */
    @Export(name="properties", type=GuestConfigurationAssignmentPropertiesResponse.class, parameters={})
    private Output<GuestConfigurationAssignmentPropertiesResponse> properties;

    /**
     * @return Properties of the Guest configuration assignment.
     * 
     */
    public Output<GuestConfigurationAssignmentPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GuestConfigurationHCRPAssignment(String name) {
        this(name, GuestConfigurationHCRPAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GuestConfigurationHCRPAssignment(String name, GuestConfigurationHCRPAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GuestConfigurationHCRPAssignment(String name, GuestConfigurationHCRPAssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:guestconfiguration:GuestConfigurationHCRPAssignment", name, args == null ? GuestConfigurationHCRPAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GuestConfigurationHCRPAssignment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:guestconfiguration:GuestConfigurationHCRPAssignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:guestconfiguration/v20181120:GuestConfigurationHCRPAssignment").build()),
                Output.of(Alias.builder().type("azure-native:guestconfiguration/v20200625:GuestConfigurationHCRPAssignment").build()),
                Output.of(Alias.builder().type("azure-native:guestconfiguration/v20210125:GuestConfigurationHCRPAssignment").build())
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
    public static GuestConfigurationHCRPAssignment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GuestConfigurationHCRPAssignment(name, id, options);
    }
}
