// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.machinelearning.SynapseSparkArgs;
import com.pulumi.azure.machinelearning.inputs.SynapseSparkState;
import com.pulumi.azure.machinelearning.outputs.SynapseSparkIdentity;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the linked service to link an Azure Machine learning workspace to an Azure Synapse workspace.
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
 *         final var current = Output.of(CoreFunctions.getClientConfig());
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;west europe&#34;)
 *             .tags(Map.of(&#34;stage&#34;, &#34;example&#34;))
 *             .build());
 * 
 *         var exampleInsights = new Insights(&#34;exampleInsights&#34;, InsightsArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .applicationType(&#34;web&#34;)
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .tenantId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getTenantId()))
 *             .skuName(&#34;standard&#34;)
 *             .purgeProtectionEnabled(true)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleWorkspace = new Workspace(&#34;exampleWorkspace&#34;, WorkspaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .applicationInsightsId(exampleInsights.getId())
 *             .keyVaultId(exampleKeyVault.getId())
 *             .storageAccountId(exampleAccount.getId())
 *             .identity(WorkspaceIdentity.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleDataLakeGen2Filesystem = new DataLakeGen2Filesystem(&#34;exampleDataLakeGen2Filesystem&#34;, DataLakeGen2FilesystemArgs.builder()        
 *             .storageAccountId(exampleAccount.getId())
 *             .build());
 * 
 *         var exampleSynapse_workspaceWorkspace = new Workspace(&#34;exampleSynapse/workspaceWorkspace&#34;, WorkspaceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .storageDataLakeGen2FilesystemId(exampleDataLakeGen2Filesystem.getId())
 *             .sqlAdministratorLogin(&#34;sqladminuser&#34;)
 *             .sqlAdministratorLoginPassword(&#34;H@Sh1CoR3!&#34;)
 *             .build());
 * 
 *         var exampleSparkPool = new SparkPool(&#34;exampleSparkPool&#34;, SparkPoolArgs.builder()        
 *             .synapseWorkspaceId(exampleSynapse / workspaceWorkspace.getId())
 *             .nodeSizeFamily(&#34;MemoryOptimized&#34;)
 *             .nodeSize(&#34;Small&#34;)
 *             .nodeCount(3)
 *             .build());
 * 
 *         var exampleSynapseSpark = new SynapseSpark(&#34;exampleSynapseSpark&#34;, SynapseSparkArgs.builder()        
 *             .machineLearningWorkspaceId(exampleWorkspace.getId())
 *             .location(exampleResourceGroup.getLocation())
 *             .synapseSparkPoolId(exampleSparkPool.getId())
 *             .identity(SynapseSparkIdentity.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Machine Learning Synapse Sparks can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:machinelearning/synapseSpark:SynapseSpark example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.MachineLearningServices/workspaces/workspace1/computes/compute1
 * ```
 * 
 */
@ResourceType(type="azure:machinelearning/synapseSpark:SynapseSpark")
public class SynapseSpark extends com.pulumi.resources.CustomResource {
    /**
     * The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Export(name="identity", type=SynapseSparkIdentity.class, parameters={})
    private Output</* @Nullable */ SynapseSparkIdentity> identity;

    /**
     * @return An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Output<Optional<SynapseSparkIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Export(name="localAuthEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> localAuthEnabled;

    /**
     * @return Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Output<Optional<Boolean>> localAuthEnabled() {
        return Codegen.optional(this.localAuthEnabled);
    }
    /**
     * The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Export(name="machineLearningWorkspaceId", type=String.class, parameters={})
    private Output<String> machineLearningWorkspaceId;

    /**
     * @return The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Output<String> machineLearningWorkspaceId() {
        return this.machineLearningWorkspaceId;
    }
    /**
     * The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Export(name="synapseSparkPoolId", type=String.class, parameters={})
    private Output<String> synapseSparkPoolId;

    /**
     * @return The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Output<String> synapseSparkPoolId() {
        return this.synapseSparkPoolId;
    }
    /**
     * A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SynapseSpark(String name) {
        this(name, SynapseSparkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SynapseSpark(String name, SynapseSparkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SynapseSpark(String name, SynapseSparkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:machinelearning/synapseSpark:SynapseSpark", name, args == null ? SynapseSparkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SynapseSpark(String name, Output<String> id, @Nullable SynapseSparkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:machinelearning/synapseSpark:SynapseSpark", name, state, makeResourceOptions(options, id));
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
    public static SynapseSpark get(String name, Output<String> id, @Nullable SynapseSparkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SynapseSpark(name, id, state, options);
    }
}
