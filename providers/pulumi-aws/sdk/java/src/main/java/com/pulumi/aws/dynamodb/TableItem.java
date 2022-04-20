// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.dynamodb.TableItemArgs;
import com.pulumi.aws.dynamodb.inputs.TableItemState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a DynamoDB table item resource
 * 
 * &gt; **Note:** This resource is not meant to be used for managing large amounts of data in your table, it is not designed to scale.
 *   You should perform **regular backups** of all data in the table, see [AWS docs for more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/BackupRestore.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DynamoDB table items cannot be imported.
 * 
 */
@ResourceType(type="aws:dynamodb/tableItem:TableItem")
public class TableItem extends com.pulumi.resources.CustomResource {
    /**
     * Hash key to use for lookups and identification of the item
     * 
     */
    @Export(name="hashKey", type=String.class, parameters={})
    private Output<String> hashKey;

    /**
     * @return Hash key to use for lookups and identification of the item
     * 
     */
    public Output<String> hashKey() {
        return this.hashKey;
    }
    /**
     * JSON representation of a map of attribute name/value pairs, one for each attribute.
     * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
     * 
     */
    @Export(name="item", type=String.class, parameters={})
    private Output<String> item;

    /**
     * @return JSON representation of a map of attribute name/value pairs, one for each attribute.
     * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
     * 
     */
    public Output<String> item() {
        return this.item;
    }
    /**
     * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
     * 
     */
    @Export(name="rangeKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> rangeKey;

    /**
     * @return Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
     * 
     */
    public Output</* @Nullable */ String> rangeKey() {
        return this.rangeKey;
    }
    /**
     * The name of the table to contain the item.
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    /**
     * @return The name of the table to contain the item.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TableItem(String name) {
        this(name, TableItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TableItem(String name, TableItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TableItem(String name, TableItemArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/tableItem:TableItem", name, args == null ? TableItemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TableItem(String name, Output<String> id, @Nullable TableItemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/tableItem:TableItem", name, state, makeResourceOptions(options, id));
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
    public static TableItem get(String name, Output<String> id, @Nullable TableItemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TableItem(name, id, state, options);
    }
}
