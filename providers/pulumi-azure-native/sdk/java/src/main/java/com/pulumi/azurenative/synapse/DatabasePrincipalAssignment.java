// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.synapse.DatabasePrincipalAssignmentArgs;
import com.pulumi.azurenative.synapse.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing a database principal assignment.
 * API Version: 2021-04-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:DatabasePrincipalAssignment synapseWorkspaceName/kustoclusterrptest4/Kustodatabase8/kustoprincipal1 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Synapse/workspaces/synapseWorkspaceName/kustoPools/kustoclusterrptest4/Databases/Kustodatabase8/PrincipalAssignments/kustoprincipal1 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:DatabasePrincipalAssignment")
public class DatabasePrincipalAssignment extends com.pulumi.resources.CustomResource {
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
     * The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     * 
     */
    @Export(name="principalId", type=String.class, parameters={})
    private Output<String> principalId;

    /**
     * @return The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }
    /**
     * The principal name
     * 
     */
    @Export(name="principalName", type=String.class, parameters={})
    private Output<String> principalName;

    /**
     * @return The principal name
     * 
     */
    public Output<String> principalName() {
        return this.principalName;
    }
    /**
     * Principal type.
     * 
     */
    @Export(name="principalType", type=String.class, parameters={})
    private Output<String> principalType;

    /**
     * @return Principal type.
     * 
     */
    public Output<String> principalType() {
        return this.principalType;
    }
    /**
     * The provisioned state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Database principal role.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return Database principal role.
     * 
     */
    public Output<String> role() {
        return this.role;
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
     * The tenant id of the principal
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return The tenant id of the principal
     * 
     */
    public Output</* @Nullable */ String> tenantId() {
        return this.tenantId;
    }
    /**
     * The tenant name of the principal
     * 
     */
    @Export(name="tenantName", type=String.class, parameters={})
    private Output<String> tenantName;

    /**
     * @return The tenant name of the principal
     * 
     */
    public Output<String> tenantName() {
        return this.tenantName;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabasePrincipalAssignment(String name) {
        this(name, DatabasePrincipalAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabasePrincipalAssignment(String name, DatabasePrincipalAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabasePrincipalAssignment(String name, DatabasePrincipalAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:DatabasePrincipalAssignment", name, args == null ? DatabasePrincipalAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabasePrincipalAssignment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:DatabasePrincipalAssignment", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20210401preview:DatabasePrincipalAssignment").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:DatabasePrincipalAssignment").build())
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
    public static DatabasePrincipalAssignment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabasePrincipalAssignment(name, id, options);
    }
}
