// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.synapse.WorkspaceSqlAadAdminArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Workspace active directory administrator
 * API Version: 2021-03-01.
 * 
 * Note: SQL AAD Admin is configured automatically during workspace creation and assigned to the current user. One can&#39;t add more admins with this resource unless you manually delete the current SQL AAD Admin.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:WorkspaceSqlAadAdmin activeDirectory /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup1/providers/Microsoft.Synapse/workspaces/workspace1/administrators/activeDirectory 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:WorkspaceSqlAadAdmin")
public class WorkspaceSqlAadAdmin extends com.pulumi.resources.CustomResource {
    /**
     * Workspace active directory administrator type
     * 
     */
    @Export(name="administratorType", type=String.class, parameters={})
    private Output</* @Nullable */ String> administratorType;

    /**
     * @return Workspace active directory administrator type
     * 
     */
    public Output</* @Nullable */ String> administratorType() {
        return this.administratorType;
    }
    /**
     * Login of the workspace active directory administrator
     * 
     */
    @Export(name="login", type=String.class, parameters={})
    private Output</* @Nullable */ String> login;

    /**
     * @return Login of the workspace active directory administrator
     * 
     */
    public Output</* @Nullable */ String> login() {
        return this.login;
    }
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
     * Object ID of the workspace active directory administrator
     * 
     */
    @Export(name="sid", type=String.class, parameters={})
    private Output</* @Nullable */ String> sid;

    /**
     * @return Object ID of the workspace active directory administrator
     * 
     */
    public Output</* @Nullable */ String> sid() {
        return this.sid;
    }
    /**
     * Tenant ID of the workspace active directory administrator
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return Tenant ID of the workspace active directory administrator
     * 
     */
    public Output</* @Nullable */ String> tenantId() {
        return this.tenantId;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkspaceSqlAadAdmin(String name) {
        this(name, WorkspaceSqlAadAdminArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkspaceSqlAadAdmin(String name, WorkspaceSqlAadAdminArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkspaceSqlAadAdmin(String name, WorkspaceSqlAadAdminArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:WorkspaceSqlAadAdmin", name, args == null ? WorkspaceSqlAadAdminArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkspaceSqlAadAdmin(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:WorkspaceSqlAadAdmin", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20190601preview:WorkspaceSqlAadAdmin").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20201201:WorkspaceSqlAadAdmin").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210301:WorkspaceSqlAadAdmin").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210401preview:WorkspaceSqlAadAdmin").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210501:WorkspaceSqlAadAdmin").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601:WorkspaceSqlAadAdmin").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:WorkspaceSqlAadAdmin").build())
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
    public static WorkspaceSqlAadAdmin get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkspaceSqlAadAdmin(name, id, options);
    }
}
