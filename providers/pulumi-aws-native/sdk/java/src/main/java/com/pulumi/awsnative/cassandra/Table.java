// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cassandra;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.cassandra.TableArgs;
import com.pulumi.awsnative.cassandra.outputs.TableBillingMode;
import com.pulumi.awsnative.cassandra.outputs.TableClusteringKeyColumn;
import com.pulumi.awsnative.cassandra.outputs.TableColumn;
import com.pulumi.awsnative.cassandra.outputs.TableEncryptionSpecification;
import com.pulumi.awsnative.cassandra.outputs.TableTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Cassandra::Table
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:cassandra:Table")
public class Table extends com.pulumi.resources.CustomResource {
    @Export(name="billingMode", type=TableBillingMode.class, parameters={})
    private Output</* @Nullable */ TableBillingMode> billingMode;

    public Output<Optional<TableBillingMode>> billingMode() {
        return Codegen.optional(this.billingMode);
    }
    /**
     * Clustering key columns of the table
     * 
     */
    @Export(name="clusteringKeyColumns", type=List.class, parameters={TableClusteringKeyColumn.class})
    private Output</* @Nullable */ List<TableClusteringKeyColumn>> clusteringKeyColumns;

    /**
     * @return Clustering key columns of the table
     * 
     */
    public Output<Optional<List<TableClusteringKeyColumn>>> clusteringKeyColumns() {
        return Codegen.optional(this.clusteringKeyColumns);
    }
    /**
     * Default TTL (Time To Live) in seconds, where zero is disabled. If the value is greater than zero, TTL is enabled for the entire table and an expiration timestamp is added to each column.
     * 
     */
    @Export(name="defaultTimeToLive", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> defaultTimeToLive;

    /**
     * @return Default TTL (Time To Live) in seconds, where zero is disabled. If the value is greater than zero, TTL is enabled for the entire table and an expiration timestamp is added to each column.
     * 
     */
    public Output<Optional<Integer>> defaultTimeToLive() {
        return Codegen.optional(this.defaultTimeToLive);
    }
    @Export(name="encryptionSpecification", type=TableEncryptionSpecification.class, parameters={})
    private Output</* @Nullable */ TableEncryptionSpecification> encryptionSpecification;

    public Output<Optional<TableEncryptionSpecification>> encryptionSpecification() {
        return Codegen.optional(this.encryptionSpecification);
    }
    /**
     * Name for Cassandra keyspace
     * 
     */
    @Export(name="keyspaceName", type=String.class, parameters={})
    private Output<String> keyspaceName;

    /**
     * @return Name for Cassandra keyspace
     * 
     */
    public Output<String> keyspaceName() {
        return this.keyspaceName;
    }
    /**
     * Partition key columns of the table
     * 
     */
    @Export(name="partitionKeyColumns", type=List.class, parameters={TableColumn.class})
    private Output<List<TableColumn>> partitionKeyColumns;

    /**
     * @return Partition key columns of the table
     * 
     */
    public Output<List<TableColumn>> partitionKeyColumns() {
        return this.partitionKeyColumns;
    }
    /**
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table
     * 
     */
    @Export(name="pointInTimeRecoveryEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> pointInTimeRecoveryEnabled;

    /**
     * @return Indicates whether point in time recovery is enabled (true) or disabled (false) on the table
     * 
     */
    public Output<Optional<Boolean>> pointInTimeRecoveryEnabled() {
        return Codegen.optional(this.pointInTimeRecoveryEnabled);
    }
    /**
     * Non-key columns of the table
     * 
     */
    @Export(name="regularColumns", type=List.class, parameters={TableColumn.class})
    private Output</* @Nullable */ List<TableColumn>> regularColumns;

    /**
     * @return Non-key columns of the table
     * 
     */
    public Output<Optional<List<TableColumn>>> regularColumns() {
        return Codegen.optional(this.regularColumns);
    }
    /**
     * Name for Cassandra table
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableName;

    /**
     * @return Name for Cassandra table
     * 
     */
    public Output<Optional<String>> tableName() {
        return Codegen.optional(this.tableName);
    }
    /**
     * An array of key-value pairs to apply to this resource
     * 
     */
    @Export(name="tags", type=List.class, parameters={TableTag.class})
    private Output</* @Nullable */ List<TableTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource
     * 
     */
    public Output<Optional<List<TableTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cassandra:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Table(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cassandra:Table", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Table get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, options);
    }
}
