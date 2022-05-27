// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mssql.ManagedInstanceActiveDirectoryAdministratorArgs;
import com.pulumi.azure.mssql.inputs.ManagedInstanceActiveDirectoryAdministratorState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Allows you to set a user, group or service principal as the AAD Administrator for an Azure SQL Managed Instance.
 * 
 * ## Import
 * 
 * An Azure SQL Active Directory Administrator can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mssql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator administrator /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/managedInstances/mymanagedinstance/administrators/activeDirectory
 * ```
 * 
 */
@ResourceType(type="azure:mssql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator")
public class ManagedInstanceActiveDirectoryAdministrator extends com.pulumi.resources.CustomResource {
    /**
     * When `true`, only permit logins from AAD users and administrators. When `false`, also allow local database users. Defaults to `false`.
     * 
     */
    @Export(name="azureadAuthenticationOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> azureadAuthenticationOnly;

    /**
     * @return When `true`, only permit logins from AAD users and administrators. When `false`, also allow local database users. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> azureadAuthenticationOnly() {
        return Codegen.optional(this.azureadAuthenticationOnly);
    }
    /**
     * The login name of the principal to set as the Managed Instance Administrator.
     * 
     */
    @Export(name="loginUsername", type=String.class, parameters={})
    private Output<String> loginUsername;

    /**
     * @return The login name of the principal to set as the Managed Instance Administrator.
     * 
     */
    public Output<String> loginUsername() {
        return this.loginUsername;
    }
    /**
     * The ID of the Azure SQL Managed Instance for which to set the administrator. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="managedInstanceId", type=String.class, parameters={})
    private Output<String> managedInstanceId;

    /**
     * @return The ID of the Azure SQL Managed Instance for which to set the administrator. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> managedInstanceId() {
        return this.managedInstanceId;
    }
    /**
     * The Object ID of the principal to set as the Managed Instance Administrator.
     * 
     */
    @Export(name="objectId", type=String.class, parameters={})
    private Output<String> objectId;

    /**
     * @return The Object ID of the principal to set as the Managed Instance Administrator.
     * 
     */
    public Output<String> objectId() {
        return this.objectId;
    }
    /**
     * The Azure Active Directory Tenant ID.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The Azure Active Directory Tenant ID.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedInstanceActiveDirectoryAdministrator(String name) {
        this(name, ManagedInstanceActiveDirectoryAdministratorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedInstanceActiveDirectoryAdministrator(String name, ManagedInstanceActiveDirectoryAdministratorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedInstanceActiveDirectoryAdministrator(String name, ManagedInstanceActiveDirectoryAdministratorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator", name, args == null ? ManagedInstanceActiveDirectoryAdministratorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedInstanceActiveDirectoryAdministrator(String name, Output<String> id, @Nullable ManagedInstanceActiveDirectoryAdministratorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ManagedInstanceActiveDirectoryAdministrator get(String name, Output<String> id, @Nullable ManagedInstanceActiveDirectoryAdministratorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedInstanceActiveDirectoryAdministrator(name, id, state, options);
    }
}
