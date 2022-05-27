// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.ManagedDatabaseSensitivityLabelArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A sensitivity label.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * ### Updates or creates a sensitivity label of a given column with all parameters in a managed database
 * 
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
 *         var managedDatabaseSensitivityLabel = new ManagedDatabaseSensitivityLabel(&#34;managedDatabaseSensitivityLabel&#34;, ManagedDatabaseSensitivityLabelArgs.builder()        
 *             .columnName(&#34;myColumn&#34;)
 *             .databaseName(&#34;myDatabase&#34;)
 *             .informationType(&#34;PhoneNumber&#34;)
 *             .informationTypeId(&#34;d22fa6e9-5ee4-3bde-4c2b-a409604c4646&#34;)
 *             .labelId(&#34;bf91e08c-f4f0-478a-b016-25164b2a65ff&#34;)
 *             .labelName(&#34;PII&#34;)
 *             .managedInstanceName(&#34;myManagedInstanceName&#34;)
 *             .rank(&#34;High&#34;)
 *             .resourceGroupName(&#34;myRG&#34;)
 *             .schemaName(&#34;dbo&#34;)
 *             .sensitivityLabelSource(&#34;current&#34;)
 *             .tableName(&#34;myTable&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ManagedDatabaseSensitivityLabel current /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/myRG/providers/Microsoft.Sql/managedInstances/myManagedInstanceName/databases/myDatabase/schemas/dbo/tables/myTable/columns/myColumn/sensitivityLabels/current 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ManagedDatabaseSensitivityLabel")
public class ManagedDatabaseSensitivityLabel extends com.pulumi.resources.CustomResource {
    /**
     * The column name.
     * 
     */
    @Export(name="columnName", type=String.class, parameters={})
    private Output<String> columnName;

    /**
     * @return The column name.
     * 
     */
    public Output<String> columnName() {
        return this.columnName;
    }
    /**
     * The information type.
     * 
     */
    @Export(name="informationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> informationType;

    /**
     * @return The information type.
     * 
     */
    public Output<Optional<String>> informationType() {
        return Codegen.optional(this.informationType);
    }
    /**
     * The information type ID.
     * 
     */
    @Export(name="informationTypeId", type=String.class, parameters={})
    private Output</* @Nullable */ String> informationTypeId;

    /**
     * @return The information type ID.
     * 
     */
    public Output<Optional<String>> informationTypeId() {
        return Codegen.optional(this.informationTypeId);
    }
    /**
     * Is sensitivity recommendation disabled. Applicable for recommended sensitivity label only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     * 
     */
    @Export(name="isDisabled", type=Boolean.class, parameters={})
    private Output<Boolean> isDisabled;

    /**
     * @return Is sensitivity recommendation disabled. Applicable for recommended sensitivity label only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     * 
     */
    public Output<Boolean> isDisabled() {
        return this.isDisabled;
    }
    /**
     * The label ID.
     * 
     */
    @Export(name="labelId", type=String.class, parameters={})
    private Output</* @Nullable */ String> labelId;

    /**
     * @return The label ID.
     * 
     */
    public Output<Optional<String>> labelId() {
        return Codegen.optional(this.labelId);
    }
    /**
     * The label name.
     * 
     */
    @Export(name="labelName", type=String.class, parameters={})
    private Output</* @Nullable */ String> labelName;

    /**
     * @return The label name.
     * 
     */
    public Output<Optional<String>> labelName() {
        return Codegen.optional(this.labelName);
    }
    /**
     * Resource that manages the sensitivity label.
     * 
     */
    @Export(name="managedBy", type=String.class, parameters={})
    private Output<String> managedBy;

    /**
     * @return Resource that manages the sensitivity label.
     * 
     */
    public Output<String> managedBy() {
        return this.managedBy;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="rank", type=String.class, parameters={})
    private Output</* @Nullable */ String> rank;

    public Output<Optional<String>> rank() {
        return Codegen.optional(this.rank);
    }
    /**
     * The schema name.
     * 
     */
    @Export(name="schemaName", type=String.class, parameters={})
    private Output<String> schemaName;

    /**
     * @return The schema name.
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }
    /**
     * The table name.
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    /**
     * @return The table name.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedDatabaseSensitivityLabel(String name) {
        this(name, ManagedDatabaseSensitivityLabelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedDatabaseSensitivityLabel(String name, ManagedDatabaseSensitivityLabelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedDatabaseSensitivityLabel(String name, ManagedDatabaseSensitivityLabelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedDatabaseSensitivityLabel", name, args == null ? ManagedDatabaseSensitivityLabelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedDatabaseSensitivityLabel(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedDatabaseSensitivityLabel", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20180601preview:ManagedDatabaseSensitivityLabel").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:ManagedDatabaseSensitivityLabel").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:ManagedDatabaseSensitivityLabel").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:ManagedDatabaseSensitivityLabel").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:ManagedDatabaseSensitivityLabel").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:ManagedDatabaseSensitivityLabel").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:ManagedDatabaseSensitivityLabel").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:ManagedDatabaseSensitivityLabel").build())
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
    public static ManagedDatabaseSensitivityLabel get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedDatabaseSensitivityLabel(name, id, options);
    }
}
