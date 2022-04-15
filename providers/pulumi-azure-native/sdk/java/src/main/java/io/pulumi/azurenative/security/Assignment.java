// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.AssignmentArgs;
import io.pulumi.azurenative.security.outputs.AssignedComponentItemResponse;
import io.pulumi.azurenative.security.outputs.AssignedStandardItemResponse;
import io.pulumi.azurenative.security.outputs.AssignmentPropertiesResponseAdditionalData;
import io.pulumi.azurenative.security.outputs.SystemDataResponse;
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
 * Security Assignment on a resource group over a given scope
 * API Version: 2021-08-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:Assignment 1f3afdf9-d0c9-4c3d-847f-89da613e70a8 subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myResourceGroup/providers/Microsoft.Security/assignments/1f3afdf9-d0c9-4c3d-847f-89da613e70a8 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:Assignment")
public class Assignment extends io.pulumi.resources.CustomResource {
    /**
     * Additional data about the assignment
     * 
     */
    @Export(name="additionalData", type=AssignmentPropertiesResponseAdditionalData.class, parameters={})
    private Output</* @Nullable */ AssignmentPropertiesResponseAdditionalData> additionalData;

    /**
     * @return Additional data about the assignment
     * 
     */
    public Output</* @Nullable */ AssignmentPropertiesResponseAdditionalData> additionalData() {
        return this.additionalData;
    }
    /**
     * Component item with key as applied to this standard assignment over the given scope
     * 
     */
    @Export(name="assignedComponent", type=AssignedComponentItemResponse.class, parameters={})
    private Output</* @Nullable */ AssignedComponentItemResponse> assignedComponent;

    /**
     * @return Component item with key as applied to this standard assignment over the given scope
     * 
     */
    public Output</* @Nullable */ AssignedComponentItemResponse> assignedComponent() {
        return this.assignedComponent;
    }
    /**
     * Standard item with key as applied to this standard assignment over the given scope
     * 
     */
    @Export(name="assignedStandard", type=AssignedStandardItemResponse.class, parameters={})
    private Output</* @Nullable */ AssignedStandardItemResponse> assignedStandard;

    /**
     * @return Standard item with key as applied to this standard assignment over the given scope
     * 
     */
    public Output</* @Nullable */ AssignedStandardItemResponse> assignedStandard() {
        return this.assignedStandard;
    }
    /**
     * description of the standardAssignment
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return description of the standardAssignment
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * display name of the standardAssignment
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return display name of the standardAssignment
     * 
     */
    public Output</* @Nullable */ String> displayName() {
        return this.displayName;
    }
    /**
     * expected effect of this assignment (Disable/Exempt/etc)
     * 
     */
    @Export(name="effect", type=String.class, parameters={})
    private Output</* @Nullable */ String> effect;

    /**
     * @return expected effect of this assignment (Disable/Exempt/etc)
     * 
     */
    public Output</* @Nullable */ String> effect() {
        return this.effect;
    }
    /**
     * Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    public Output</* @Nullable */ String> etag() {
        return this.etag;
    }
    /**
     * Expiration date of this assignment as a full ISO date
     * 
     */
    @Export(name="expiresOn", type=String.class, parameters={})
    private Output</* @Nullable */ String> expiresOn;

    /**
     * @return Expiration date of this assignment as a full ISO date
     * 
     */
    public Output</* @Nullable */ String> expiresOn() {
        return this.expiresOn;
    }
    /**
     * Kind of the resource
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of the resource
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * Location where the resource is stored
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location where the resource is stored
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * The assignment metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @Export(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The assignment metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    public Output</* @Nullable */ Object> metadata() {
        return this.metadata;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Scope to which the standardAssignment applies - can be a subscription path or a resource group under that subscription
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return Scope to which the standardAssignment applies - can be a subscription path or a resource group under that subscription
     * 
     */
    public Output</* @Nullable */ String> scope() {
        return this.scope;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * A list of key value pairs that describe the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A list of key value pairs that describe the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
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
    public Assignment(String name, AssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:Assignment", name, args == null ? AssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Assignment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:Assignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:security/v20210801preview:Assignment").build())
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
    public static Assignment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Assignment(name, id, options);
    }
}
