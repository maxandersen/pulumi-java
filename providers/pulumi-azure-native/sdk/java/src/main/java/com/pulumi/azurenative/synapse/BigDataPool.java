// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.synapse.BigDataPoolArgs;
import com.pulumi.azurenative.synapse.outputs.AutoPausePropertiesResponse;
import com.pulumi.azurenative.synapse.outputs.AutoScalePropertiesResponse;
import com.pulumi.azurenative.synapse.outputs.DynamicExecutorAllocationResponse;
import com.pulumi.azurenative.synapse.outputs.LibraryInfoResponse;
import com.pulumi.azurenative.synapse.outputs.LibraryRequirementsResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Big Data pool
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:BigDataPool ExamplePool /subscriptions/01234567-89ab-4def-0123-456789abcdef/resourceGroups/ExampleResourceGroup/providers/Microsoft.Synapse/workspaces/ExampleWorkspace/bigDataPools/ExamplePool 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:BigDataPool")
public class BigDataPool extends CustomResource {
    /**
     * Auto-pausing properties
     * 
     */
    @Export(name="autoPause", type=AutoPausePropertiesResponse.class, parameters={})
    private Output</* @Nullable */ AutoPausePropertiesResponse> autoPause;

    /**
     * @return Auto-pausing properties
     * 
     */
    public Output<Optional<AutoPausePropertiesResponse>> autoPause() {
        return Codegen.optional(this.autoPause);
    }
    /**
     * Auto-scaling properties
     * 
     */
    @Export(name="autoScale", type=AutoScalePropertiesResponse.class, parameters={})
    private Output</* @Nullable */ AutoScalePropertiesResponse> autoScale;

    /**
     * @return Auto-scaling properties
     * 
     */
    public Output<Optional<AutoScalePropertiesResponse>> autoScale() {
        return Codegen.optional(this.autoScale);
    }
    /**
     * The cache size
     * 
     */
    @Export(name="cacheSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> cacheSize;

    /**
     * @return The cache size
     * 
     */
    public Output<Optional<Integer>> cacheSize() {
        return Codegen.optional(this.cacheSize);
    }
    /**
     * The time when the Big Data pool was created.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationDate;

    /**
     * @return The time when the Big Data pool was created.
     * 
     */
    public Output<Optional<String>> creationDate() {
        return Codegen.optional(this.creationDate);
    }
    /**
     * List of custom libraries/packages associated with the spark pool.
     * 
     */
    @Export(name="customLibraries", type=List.class, parameters={LibraryInfoResponse.class})
    private Output</* @Nullable */ List<LibraryInfoResponse>> customLibraries;

    /**
     * @return List of custom libraries/packages associated with the spark pool.
     * 
     */
    public Output<Optional<List<LibraryInfoResponse>>> customLibraries() {
        return Codegen.optional(this.customLibraries);
    }
    /**
     * The default folder where Spark logs will be written.
     * 
     */
    @Export(name="defaultSparkLogFolder", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultSparkLogFolder;

    /**
     * @return The default folder where Spark logs will be written.
     * 
     */
    public Output<Optional<String>> defaultSparkLogFolder() {
        return Codegen.optional(this.defaultSparkLogFolder);
    }
    /**
     * Dynamic Executor Allocation
     * 
     */
    @Export(name="dynamicExecutorAllocation", type=DynamicExecutorAllocationResponse.class, parameters={})
    private Output</* @Nullable */ DynamicExecutorAllocationResponse> dynamicExecutorAllocation;

    /**
     * @return Dynamic Executor Allocation
     * 
     */
    public Output<Optional<DynamicExecutorAllocationResponse>> dynamicExecutorAllocation() {
        return Codegen.optional(this.dynamicExecutorAllocation);
    }
    /**
     * Whether compute isolation is required or not.
     * 
     */
    @Export(name="isComputeIsolationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isComputeIsolationEnabled;

    /**
     * @return Whether compute isolation is required or not.
     * 
     */
    public Output<Optional<Boolean>> isComputeIsolationEnabled() {
        return Codegen.optional(this.isComputeIsolationEnabled);
    }
    /**
     * The time when the Big Data pool was updated successfully.
     * 
     */
    @Export(name="lastSucceededTimestamp", type=String.class, parameters={})
    private Output<String> lastSucceededTimestamp;

    /**
     * @return The time when the Big Data pool was updated successfully.
     * 
     */
    public Output<String> lastSucceededTimestamp() {
        return this.lastSucceededTimestamp;
    }
    /**
     * Library version requirements
     * 
     */
    @Export(name="libraryRequirements", type=LibraryRequirementsResponse.class, parameters={})
    private Output</* @Nullable */ LibraryRequirementsResponse> libraryRequirements;

    /**
     * @return Library version requirements
     * 
     */
    public Output<Optional<LibraryRequirementsResponse>> libraryRequirements() {
        return Codegen.optional(this.libraryRequirements);
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * The number of nodes in the Big Data pool.
     * 
     */
    @Export(name="nodeCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> nodeCount;

    /**
     * @return The number of nodes in the Big Data pool.
     * 
     */
    public Output<Optional<Integer>> nodeCount() {
        return Codegen.optional(this.nodeCount);
    }
    /**
     * The level of compute power that each node in the Big Data pool has.
     * 
     */
    @Export(name="nodeSize", type=String.class, parameters={})
    private Output</* @Nullable */ String> nodeSize;

    /**
     * @return The level of compute power that each node in the Big Data pool has.
     * 
     */
    public Output<Optional<String>> nodeSize() {
        return Codegen.optional(this.nodeSize);
    }
    /**
     * The kind of nodes that the Big Data pool provides.
     * 
     */
    @Export(name="nodeSizeFamily", type=String.class, parameters={})
    private Output</* @Nullable */ String> nodeSizeFamily;

    /**
     * @return The kind of nodes that the Big Data pool provides.
     * 
     */
    public Output<Optional<String>> nodeSizeFamily() {
        return Codegen.optional(this.nodeSizeFamily);
    }
    /**
     * The state of the Big Data pool.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return The state of the Big Data pool.
     * 
     */
    public Output<Optional<String>> provisioningState() {
        return Codegen.optional(this.provisioningState);
    }
    /**
     * Whether session level packages enabled.
     * 
     */
    @Export(name="sessionLevelPackagesEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sessionLevelPackagesEnabled;

    /**
     * @return Whether session level packages enabled.
     * 
     */
    public Output<Optional<Boolean>> sessionLevelPackagesEnabled() {
        return Codegen.optional(this.sessionLevelPackagesEnabled);
    }
    /**
     * Spark configuration file to specify additional properties
     * 
     */
    @Export(name="sparkConfigProperties", type=LibraryRequirementsResponse.class, parameters={})
    private Output</* @Nullable */ LibraryRequirementsResponse> sparkConfigProperties;

    /**
     * @return Spark configuration file to specify additional properties
     * 
     */
    public Output<Optional<LibraryRequirementsResponse>> sparkConfigProperties() {
        return Codegen.optional(this.sparkConfigProperties);
    }
    /**
     * The Spark events folder
     * 
     */
    @Export(name="sparkEventsFolder", type=String.class, parameters={})
    private Output</* @Nullable */ String> sparkEventsFolder;

    /**
     * @return The Spark events folder
     * 
     */
    public Output<Optional<String>> sparkEventsFolder() {
        return Codegen.optional(this.sparkEventsFolder);
    }
    /**
     * The Apache Spark version.
     * 
     */
    @Export(name="sparkVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> sparkVersion;

    /**
     * @return The Apache Spark version.
     * 
     */
    public Output<Optional<String>> sparkVersion() {
        return Codegen.optional(this.sparkVersion);
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
    public BigDataPool(String name) {
        this(name, BigDataPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BigDataPool(String name, BigDataPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BigDataPool(String name, BigDataPoolArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:synapse:BigDataPool", name, args == null ? BigDataPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BigDataPool(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:synapse:BigDataPool", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20190601preview:BigDataPool").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20201201:BigDataPool").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210301:BigDataPool").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210401preview:BigDataPool").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210501:BigDataPool").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601:BigDataPool").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:BigDataPool").build())
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
    public static BigDataPool get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new BigDataPool(name, id, options);
    }
}
