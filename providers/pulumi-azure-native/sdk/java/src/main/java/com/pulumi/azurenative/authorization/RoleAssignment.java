// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.authorization.RoleAssignmentArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Role Assignments
 * API Version: 2020-08-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:authorization:RoleAssignment 05c5a614-a7d6-4502-b150-c2fb455033ff /subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/providers/Microsoft.Authorization/roleAssignments/05c5a614-a7d6-4502-b150-c2fb455033ff 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:RoleAssignment")
public class RoleAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The conditions on the role assignment. This limits the resources it can be assigned to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName] StringEqualsIgnoreCase &#39;foo_storage_container&#39;
     * 
     */
    @Export(name="condition", type=String.class, parameters={})
    private Output</* @Nullable */ String> condition;

    /**
     * @return The conditions on the role assignment. This limits the resources it can be assigned to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName] StringEqualsIgnoreCase &#39;foo_storage_container&#39;
     * 
     */
    public Output</* @Nullable */ String> condition() {
        return this.condition;
    }
    /**
     * Version of the condition. Currently accepted value is &#39;2.0&#39;
     * 
     */
    @Export(name="conditionVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> conditionVersion;

    /**
     * @return Version of the condition. Currently accepted value is &#39;2.0&#39;
     * 
     */
    public Output</* @Nullable */ String> conditionVersion() {
        return this.conditionVersion;
    }
    /**
     * Id of the user who created the assignment
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output<String> createdBy;

    /**
     * @return Id of the user who created the assignment
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * Time it was created
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return Time it was created
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Id of the delegated managed identity resource
     * 
     */
    @Export(name="delegatedManagedIdentityResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> delegatedManagedIdentityResourceId;

    /**
     * @return Id of the delegated managed identity resource
     * 
     */
    public Output</* @Nullable */ String> delegatedManagedIdentityResourceId() {
        return this.delegatedManagedIdentityResourceId;
    }
    /**
     * Description of role assignment
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of role assignment
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The role assignment name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The role assignment name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The principal ID.
     * 
     */
    @Export(name="principalId", type=String.class, parameters={})
    private Output<String> principalId;

    /**
     * @return The principal ID.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }
    /**
     * The principal type of the assigned principal ID.
     * 
     */
    @Export(name="principalType", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalType;

    /**
     * @return The principal type of the assigned principal ID.
     * 
     */
    public Output</* @Nullable */ String> principalType() {
        return this.principalType;
    }
    /**
     * The role definition ID.
     * 
     */
    @Export(name="roleDefinitionId", type=String.class, parameters={})
    private Output<String> roleDefinitionId;

    /**
     * @return The role definition ID.
     * 
     */
    public Output<String> roleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * The role assignment scope.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return The role assignment scope.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * The role assignment type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The role assignment type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Id of the user who updated the assignment
     * 
     */
    @Export(name="updatedBy", type=String.class, parameters={})
    private Output<String> updatedBy;

    /**
     * @return Id of the user who updated the assignment
     * 
     */
    public Output<String> updatedBy() {
        return this.updatedBy;
    }
    /**
     * Time it was updated
     * 
     */
    @Export(name="updatedOn", type=String.class, parameters={})
    private Output<String> updatedOn;

    /**
     * @return Time it was updated
     * 
     */
    public Output<String> updatedOn() {
        return this.updatedOn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleAssignment(String name) {
        this(name, RoleAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleAssignment(String name, RoleAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleAssignment(String name, RoleAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:RoleAssignment", name, args == null ? RoleAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RoleAssignment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:RoleAssignment", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:authorization/v20150701:RoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20171001preview:RoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20180101preview:RoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20180901preview:RoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20200301preview:RoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20200401preview:RoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20200801preview:RoleAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20201001preview:RoleAssignment").build())
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
    public static RoleAssignment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoleAssignment(name, id, options);
    }
}
