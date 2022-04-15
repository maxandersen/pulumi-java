// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.ReadOnlyFollowingDatabaseArgs;
import io.pulumi.azurenative.kusto.outputs.DatabaseStatisticsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing a read only following database.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kusto:ReadOnlyFollowingDatabase KustoClusterRPTest4/KustoDatabase8 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/Clusters/KustoClusterRPTest4/Databases/KustoDatabase8 
 * ```
 * 
 */
@ResourceType(type="azure-native:kusto:ReadOnlyFollowingDatabase")
public class ReadOnlyFollowingDatabase extends io.pulumi.resources.CustomResource {
    /**
     * The name of the attached database configuration cluster
     * 
     */
    @Export(name="attachedDatabaseConfigurationName", type=String.class, parameters={})
    private Output<String> attachedDatabaseConfigurationName;

    /**
     * @return The name of the attached database configuration cluster
     * 
     */
    public Output<String> attachedDatabaseConfigurationName() {
        return this.attachedDatabaseConfigurationName;
    }
    /**
     * The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     */
    @Export(name="hotCachePeriod", type=String.class, parameters={})
    private Output</* @Nullable */ String> hotCachePeriod;

    /**
     * @return The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     */
    public Output</* @Nullable */ String> hotCachePeriod() {
        return this.hotCachePeriod;
    }
    /**
     * Kind of the database
     * Expected value is 'ReadOnlyFollowing'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of the database
     * Expected value is 'ReadOnlyFollowing'.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The name of the leader cluster
     * 
     */
    @Export(name="leaderClusterResourceId", type=String.class, parameters={})
    private Output<String> leaderClusterResourceId;

    /**
     * @return The name of the leader cluster
     * 
     */
    public Output<String> leaderClusterResourceId() {
        return this.leaderClusterResourceId;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> location() {
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
     * The principals modification kind of the database
     * 
     */
    @Export(name="principalsModificationKind", type=String.class, parameters={})
    private Output<String> principalsModificationKind;

    /**
     * @return The principals modification kind of the database
     * 
     */
    public Output<String> principalsModificationKind() {
        return this.principalsModificationKind;
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
     * The time the data should be kept before it stops being accessible to queries in TimeSpan.
     * 
     */
    @Export(name="softDeletePeriod", type=String.class, parameters={})
    private Output<String> softDeletePeriod;

    /**
     * @return The time the data should be kept before it stops being accessible to queries in TimeSpan.
     * 
     */
    public Output<String> softDeletePeriod() {
        return this.softDeletePeriod;
    }
    /**
     * The statistics of the database.
     * 
     */
    @Export(name="statistics", type=DatabaseStatisticsResponse.class, parameters={})
    private Output<DatabaseStatisticsResponse> statistics;

    /**
     * @return The statistics of the database.
     * 
     */
    public Output<DatabaseStatisticsResponse> statistics() {
        return this.statistics;
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
    public ReadOnlyFollowingDatabase(String name) {
        this(name, ReadOnlyFollowingDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReadOnlyFollowingDatabase(String name, ReadOnlyFollowingDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReadOnlyFollowingDatabase(String name, ReadOnlyFollowingDatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:ReadOnlyFollowingDatabase", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private ReadOnlyFollowingDatabase(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:ReadOnlyFollowingDatabase", name, null, makeResourceOptions(options, id));
    }

    private static ReadOnlyFollowingDatabaseArgs makeArgs(ReadOnlyFollowingDatabaseArgs args) {
        var builder = args == null ? ReadOnlyFollowingDatabaseArgs.builder() : ReadOnlyFollowingDatabaseArgs.builder(args);
        return builder
            .kind("ReadOnlyFollowing")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:kusto/v20170907privatepreview:ReadOnlyFollowingDatabase").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20180907preview:ReadOnlyFollowingDatabase").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20190121:ReadOnlyFollowingDatabase").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20190515:ReadOnlyFollowingDatabase").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20190907:ReadOnlyFollowingDatabase").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20191109:ReadOnlyFollowingDatabase").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20200215:ReadOnlyFollowingDatabase").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20200614:ReadOnlyFollowingDatabase").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20200918:ReadOnlyFollowingDatabase").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20210101:ReadOnlyFollowingDatabase").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20210827:ReadOnlyFollowingDatabase").build())
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
    public static ReadOnlyFollowingDatabase get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReadOnlyFollowingDatabase(name, id, options);
    }
}
