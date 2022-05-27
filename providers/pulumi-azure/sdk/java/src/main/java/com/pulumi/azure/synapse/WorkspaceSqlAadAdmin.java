// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.synapse.WorkspaceSqlAadAdminArgs;
import com.pulumi.azure.synapse.inputs.WorkspaceSqlAadAdminState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an Azure Active Directory SQL Administrator setting for a Synapse Workspace
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .accountKind(&#34;StorageV2&#34;)
 *             .isHnsEnabled(&#34;true&#34;)
 *             .build());
 * 
 *         var exampleDataLakeGen2Filesystem = new DataLakeGen2Filesystem(&#34;exampleDataLakeGen2Filesystem&#34;, DataLakeGen2FilesystemArgs.builder()        
 *             .storageAccountId(exampleAccount.getId())
 *             .build());
 * 
 *         final var current = Output.of(CoreFunctions.getClientConfig());
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(azurerm_resource_group.getExampl().getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .tenantId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getTenantId()))
 *             .skuName(&#34;standard&#34;)
 *             .purgeProtectionEnabled(true)
 *             .build());
 * 
 *         var deployer = new AccessPolicy(&#34;deployer&#34;, AccessPolicyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.getId())
 *             .tenantId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getTenantId()))
 *             .objectId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getObjectId()))
 *             .keyPermissions(            
 *                 &#34;create&#34;,
 *                 &#34;get&#34;,
 *                 &#34;delete&#34;,
 *                 &#34;purge&#34;)
 *             .build());
 * 
 *         var exampleKey = new Key(&#34;exampleKey&#34;, KeyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.getId())
 *             .keyType(&#34;RSA&#34;)
 *             .keySize(2048)
 *             .keyOpts(            
 *                 &#34;unwrapKey&#34;,
 *                 &#34;wrapKey&#34;)
 *             .build());
 * 
 *         var exampleWorkspace = new Workspace(&#34;exampleWorkspace&#34;, WorkspaceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .storageDataLakeGen2FilesystemId(exampleDataLakeGen2Filesystem.getId())
 *             .sqlAdministratorLogin(&#34;sqladminuser&#34;)
 *             .sqlAdministratorLoginPassword(&#34;H@Sh1CoR3!&#34;)
 *             .tags(Map.of(&#34;Env&#34;, &#34;production&#34;))
 *             .build());
 * 
 *         var test = new WorkspaceSqlAadAdmin(&#34;test&#34;, WorkspaceSqlAadAdminArgs.builder()        
 *             .synapseWorkspaceId(azurerm_synapse_workspace.getTest().getId())
 *             .login(&#34;AzureAD Admin&#34;)
 *             .objectId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getObjectId()))
 *             .tenantId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getTenantId()))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Synapse Workspace Azure AD Administrator can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:synapse/workspaceSqlAadAdmin:WorkspaceSqlAadAdmin example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Synapse/workspaces/workspace1/sqlAdministrators/activeDirectory
 * ```
 * 
 */
@ResourceType(type="azure:synapse/workspaceSqlAadAdmin:WorkspaceSqlAadAdmin")
public class WorkspaceSqlAadAdmin extends com.pulumi.resources.CustomResource {
    /**
     * The login name of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    @Export(name="login", type=String.class, parameters={})
    private Output<String> login;

    /**
     * @return The login name of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    public Output<String> login() {
        return this.login;
    }
    /**
     * The object id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    @Export(name="objectId", type=String.class, parameters={})
    private Output<String> objectId;

    /**
     * @return The object id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    public Output<String> objectId() {
        return this.objectId;
    }
    /**
     * The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
     * 
     */
    @Export(name="synapseWorkspaceId", type=String.class, parameters={})
    private Output<String> synapseWorkspaceId;

    /**
     * @return The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
     * 
     */
    public Output<String> synapseWorkspaceId() {
        return this.synapseWorkspaceId;
    }
    /**
     * The tenant id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The tenant id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
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
        super("azure:synapse/workspaceSqlAadAdmin:WorkspaceSqlAadAdmin", name, args == null ? WorkspaceSqlAadAdminArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkspaceSqlAadAdmin(String name, Output<String> id, @Nullable WorkspaceSqlAadAdminState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/workspaceSqlAadAdmin:WorkspaceSqlAadAdmin", name, state, makeResourceOptions(options, id));
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
    public static WorkspaceSqlAadAdmin get(String name, Output<String> id, @Nullable WorkspaceSqlAadAdminState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkspaceSqlAadAdmin(name, id, state, options);
    }
}
