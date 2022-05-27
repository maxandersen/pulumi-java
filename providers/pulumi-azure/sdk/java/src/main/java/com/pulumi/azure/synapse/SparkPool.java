// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.synapse.SparkPoolArgs;
import com.pulumi.azure.synapse.inputs.SparkPoolState;
import com.pulumi.azure.synapse.outputs.SparkPoolAutoPause;
import com.pulumi.azure.synapse.outputs.SparkPoolAutoScale;
import com.pulumi.azure.synapse.outputs.SparkPoolLibraryRequirement;
import com.pulumi.azure.synapse.outputs.SparkPoolSparkConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Synapse Spark Pool.
 * 
 * ## Import
 * 
 * Synapse Spark Pool can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:synapse/sparkPool:SparkPool example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Synapse/workspaces/workspace1/bigDataPools/sparkPool1
 * ```
 * 
 */
@ResourceType(type="azure:synapse/sparkPool:SparkPool")
public class SparkPool extends com.pulumi.resources.CustomResource {
    /**
     * An `auto_pause` block as defined below.
     * 
     */
    @Export(name="autoPause", type=SparkPoolAutoPause.class, parameters={})
    private Output</* @Nullable */ SparkPoolAutoPause> autoPause;

    /**
     * @return An `auto_pause` block as defined below.
     * 
     */
    public Output<Optional<SparkPoolAutoPause>> autoPause() {
        return Codegen.optional(this.autoPause);
    }
    /**
     * An `auto_scale` block as defined below. Exactly one of `node_count` or `auto_scale` must be specified.
     * 
     */
    @Export(name="autoScale", type=SparkPoolAutoScale.class, parameters={})
    private Output</* @Nullable */ SparkPoolAutoScale> autoScale;

    /**
     * @return An `auto_scale` block as defined below. Exactly one of `node_count` or `auto_scale` must be specified.
     * 
     */
    public Output<Optional<SparkPoolAutoScale>> autoScale() {
        return Codegen.optional(this.autoScale);
    }
    /**
     * The cache size in the Spark Pool.
     * 
     */
    @Export(name="cacheSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cacheSize;

    /**
     * @return The cache size in the Spark Pool.
     * 
     */
    public Output<Optional<Integer>> cacheSize() {
        return Codegen.optional(this.cacheSize);
    }
    /**
     * Indicates whether compute isolation is enabled or not. Defaults to `false`.
     * 
     */
    @Export(name="computeIsolationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> computeIsolationEnabled;

    /**
     * @return Indicates whether compute isolation is enabled or not. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> computeIsolationEnabled() {
        return Codegen.optional(this.computeIsolationEnabled);
    }
    /**
     * Indicates whether Dynamic Executor Allocation is enabled or not. Defaults to `false`.
     * 
     */
    @Export(name="dynamicExecutorAllocationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dynamicExecutorAllocationEnabled;

    /**
     * @return Indicates whether Dynamic Executor Allocation is enabled or not. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> dynamicExecutorAllocationEnabled() {
        return Codegen.optional(this.dynamicExecutorAllocationEnabled);
    }
    /**
     * A `library_requirement` block as defined below.
     * 
     */
    @Export(name="libraryRequirement", type=SparkPoolLibraryRequirement.class, parameters={})
    private Output</* @Nullable */ SparkPoolLibraryRequirement> libraryRequirement;

    /**
     * @return A `library_requirement` block as defined below.
     * 
     */
    public Output<Optional<SparkPoolLibraryRequirement>> libraryRequirement() {
        return Codegen.optional(this.libraryRequirement);
    }
    /**
     * The name which should be used for this Synapse Spark Pool. Changing this forces a new Synapse Spark Pool to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Synapse Spark Pool. Changing this forces a new Synapse Spark Pool to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of nodes in the Spark Pool. Exactly one of `node_count` or `auto_scale` must be specified.
     * 
     */
    @Export(name="nodeCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> nodeCount;

    /**
     * @return The number of nodes in the Spark Pool. Exactly one of `node_count` or `auto_scale` must be specified.
     * 
     */
    public Output<Optional<Integer>> nodeCount() {
        return Codegen.optional(this.nodeCount);
    }
    /**
     * The level of node in the Spark Pool. Possible value is `Small`, `Medium` and `Large`.
     * 
     */
    @Export(name="nodeSize", type=String.class, parameters={})
    private Output<String> nodeSize;

    /**
     * @return The level of node in the Spark Pool. Possible value is `Small`, `Medium` and `Large`.
     * 
     */
    public Output<String> nodeSize() {
        return this.nodeSize;
    }
    /**
     * The kind of nodes that the Spark Pool provides. Possible value is `MemoryOptimized`.
     * 
     */
    @Export(name="nodeSizeFamily", type=String.class, parameters={})
    private Output<String> nodeSizeFamily;

    /**
     * @return The kind of nodes that the Spark Pool provides. Possible value is `MemoryOptimized`.
     * 
     */
    public Output<String> nodeSizeFamily() {
        return this.nodeSizeFamily;
    }
    /**
     * Indicates whether session level packages are enabled or not. Defaults to `false`.
     * 
     */
    @Export(name="sessionLevelPackagesEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sessionLevelPackagesEnabled;

    /**
     * @return Indicates whether session level packages are enabled or not. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> sessionLevelPackagesEnabled() {
        return Codegen.optional(this.sessionLevelPackagesEnabled);
    }
    /**
     * A `spark_config` block as defined below.
     * 
     */
    @Export(name="sparkConfig", type=SparkPoolSparkConfig.class, parameters={})
    private Output</* @Nullable */ SparkPoolSparkConfig> sparkConfig;

    /**
     * @return A `spark_config` block as defined below.
     * 
     */
    public Output<Optional<SparkPoolSparkConfig>> sparkConfig() {
        return Codegen.optional(this.sparkConfig);
    }
    /**
     * The Spark events folder. Defaults to `/events`.
     * 
     */
    @Export(name="sparkEventsFolder", type=String.class, parameters={})
    private Output</* @Nullable */ String> sparkEventsFolder;

    /**
     * @return The Spark events folder. Defaults to `/events`.
     * 
     */
    public Output<Optional<String>> sparkEventsFolder() {
        return Codegen.optional(this.sparkEventsFolder);
    }
    /**
     * The default folder where Spark logs will be written. Defaults to `/logs`.
     * 
     */
    @Export(name="sparkLogFolder", type=String.class, parameters={})
    private Output</* @Nullable */ String> sparkLogFolder;

    /**
     * @return The default folder where Spark logs will be written. Defaults to `/logs`.
     * 
     */
    public Output<Optional<String>> sparkLogFolder() {
        return Codegen.optional(this.sparkLogFolder);
    }
    /**
     * The Apache Spark version. Possible values are `2.4` and `3.1`. Defaults to `2.4`.
     * 
     */
    @Export(name="sparkVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> sparkVersion;

    /**
     * @return The Apache Spark version. Possible values are `2.4` and `3.1`. Defaults to `2.4`.
     * 
     */
    public Output<Optional<String>> sparkVersion() {
        return Codegen.optional(this.sparkVersion);
    }
    /**
     * The ID of the Synapse Workspace where the Synapse Spark Pool should exist. Changing this forces a new Synapse Spark Pool to be created.
     * 
     */
    @Export(name="synapseWorkspaceId", type=String.class, parameters={})
    private Output<String> synapseWorkspaceId;

    /**
     * @return The ID of the Synapse Workspace where the Synapse Spark Pool should exist. Changing this forces a new Synapse Spark Pool to be created.
     * 
     */
    public Output<String> synapseWorkspaceId() {
        return this.synapseWorkspaceId;
    }
    /**
     * A mapping of tags which should be assigned to the Synapse Spark Pool.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Synapse Spark Pool.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SparkPool(String name) {
        this(name, SparkPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SparkPool(String name, SparkPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SparkPool(String name, SparkPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/sparkPool:SparkPool", name, args == null ? SparkPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SparkPool(String name, Output<String> id, @Nullable SparkPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/sparkPool:SparkPool", name, state, makeResourceOptions(options, id));
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
    public static SparkPool get(String name, Output<String> id, @Nullable SparkPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SparkPool(name, id, state, options);
    }
}
