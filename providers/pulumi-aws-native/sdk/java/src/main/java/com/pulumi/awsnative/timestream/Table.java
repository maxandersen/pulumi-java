// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.timestream;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.timestream.TableArgs;
import com.pulumi.awsnative.timestream.outputs.MagneticStoreWritePropertiesProperties;
import com.pulumi.awsnative.timestream.outputs.RetentionPropertiesProperties;
import com.pulumi.awsnative.timestream.outputs.TableTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::Timestream::Table resource creates a Timestream Table.
 * 
 */
@ResourceType(type="aws-native:timestream:Table")
public class Table extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name for the database which the table to be created belongs to.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name for the database which the table to be created belongs to.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * The properties that determine whether magnetic store writes are enabled.
     * 
     */
    @Export(name="magneticStoreWriteProperties", type=MagneticStoreWritePropertiesProperties.class, parameters={})
    private Output</* @Nullable */ MagneticStoreWritePropertiesProperties> magneticStoreWriteProperties;

    /**
     * @return The properties that determine whether magnetic store writes are enabled.
     * 
     */
    public Output</* @Nullable */ MagneticStoreWritePropertiesProperties> magneticStoreWriteProperties() {
        return this.magneticStoreWriteProperties;
    }
    /**
     * The table name exposed as a read-only attribute.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The table name exposed as a read-only attribute.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The retention duration of the memory store and the magnetic store.
     * 
     */
    @Export(name="retentionProperties", type=RetentionPropertiesProperties.class, parameters={})
    private Output</* @Nullable */ RetentionPropertiesProperties> retentionProperties;

    /**
     * @return The retention duration of the memory store and the magnetic store.
     * 
     */
    public Output</* @Nullable */ RetentionPropertiesProperties> retentionProperties() {
        return this.retentionProperties;
    }
    /**
     * The name for the table. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the table name.
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableName;

    /**
     * @return The name for the table. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the table name.
     * 
     */
    public Output</* @Nullable */ String> tableName() {
        return this.tableName;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={TableTag.class})
    private Output</* @Nullable */ List<TableTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<TableTag>> tags() {
        return this.tags;
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
        super("aws-native:timestream:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Table(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:timestream:Table", name, null, makeResourceOptions(options, id));
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
