// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.blueprint.AssignmentArgs;
import com.pulumi.azurenative.blueprint.outputs.AssignmentLockSettingsResponse;
import com.pulumi.azurenative.blueprint.outputs.AssignmentStatusResponse;
import com.pulumi.azurenative.blueprint.outputs.ManagedServiceIdentityResponse;
import com.pulumi.azurenative.blueprint.outputs.ParameterValueResponse;
import com.pulumi.azurenative.blueprint.outputs.ResourceGroupValueResponse;
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
 * Represents a blueprint assignment.
 * API Version: 2018-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:blueprint:Assignment assignSimpleBlueprint /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Blueprint/blueprintAssignments/assignSimpleBlueprint 
 * ```
 * 
 */
@ResourceType(type="azure-native:blueprint:Assignment")
public class Assignment extends CustomResource {
    /**
     * ID of the published version of a blueprint definition.
     * 
     */
    @Export(name="blueprintId", type=String.class, parameters={})
    private Output</* @Nullable */ String> blueprintId;

    /**
     * @return ID of the published version of a blueprint definition.
     * 
     */
    public Output<Optional<String>> blueprintId() {
        return Codegen.optional(this.blueprintId);
    }
    /**
     * Multi-line explain this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Multi-line explain this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * One-liner string explain this resource.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return One-liner string explain this resource.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Managed identity for this blueprint assignment.
     * 
     */
    @Export(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output<ManagedServiceIdentityResponse> identity;

    /**
     * @return Managed identity for this blueprint assignment.
     * 
     */
    public Output<ManagedServiceIdentityResponse> identity() {
        return this.identity;
    }
    /**
     * The location of this blueprint assignment.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of this blueprint assignment.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Defines how resources deployed by a blueprint assignment are locked.
     * 
     */
    @Export(name="locks", type=AssignmentLockSettingsResponse.class, parameters={})
    private Output</* @Nullable */ AssignmentLockSettingsResponse> locks;

    /**
     * @return Defines how resources deployed by a blueprint assignment are locked.
     * 
     */
    public Output<Optional<AssignmentLockSettingsResponse>> locks() {
        return Codegen.optional(this.locks);
    }
    /**
     * Name of this resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Blueprint assignment parameter values.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, ParameterValueResponse.class})
    private Output<Map<String,ParameterValueResponse>> parameters;

    /**
     * @return Blueprint assignment parameter values.
     * 
     */
    public Output<Map<String,ParameterValueResponse>> parameters() {
        return this.parameters;
    }
    /**
     * State of the blueprint assignment.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the blueprint assignment.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Names and locations of resource group placeholders.
     * 
     */
    @Export(name="resourceGroups", type=Map.class, parameters={String.class, ResourceGroupValueResponse.class})
    private Output<Map<String,ResourceGroupValueResponse>> resourceGroups;

    /**
     * @return Names and locations of resource group placeholders.
     * 
     */
    public Output<Map<String,ResourceGroupValueResponse>> resourceGroups() {
        return this.resourceGroups;
    }
    /**
     * The target subscription scope of the blueprint assignment (format: &#39;/subscriptions/{subscriptionId}&#39;). For management group level assignments, the property is required.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return The target subscription scope of the blueprint assignment (format: &#39;/subscriptions/{subscriptionId}&#39;). For management group level assignments, the property is required.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * Status of blueprint assignment. This field is readonly.
     * 
     */
    @Export(name="status", type=AssignmentStatusResponse.class, parameters={})
    private Output<AssignmentStatusResponse> status;

    /**
     * @return Status of blueprint assignment. This field is readonly.
     * 
     */
    public Output<AssignmentStatusResponse> status() {
        return this.status;
    }
    /**
     * Type of this resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Assignment(String name) {
        this(name, AssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Assignment(String name, AssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Assignment(String name, AssignmentArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:blueprint:Assignment", name, args == null ? AssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Assignment(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:blueprint:Assignment", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:blueprint/v20181101preview:Assignment").build())
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
    public static Assignment get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Assignment(name, id, options);
    }
}
