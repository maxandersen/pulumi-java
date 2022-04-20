// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.documentdb.SqlResourceSqlStoredProcedureArgs;
import com.pulumi.azurenative.documentdb.outputs.SqlStoredProcedureGetPropertiesResponseResource;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An Azure Cosmos DB storedProcedure.
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:SqlResourceSqlStoredProcedure storedProcedureName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1/sqlDatabases/databaseName/sqlContainers/containerName/sqlStoredProcedures/storedProcedureName 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:SqlResourceSqlStoredProcedure")
public class SqlResourceSqlStoredProcedure extends com.pulumi.resources.CustomResource {
    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource group to which the resource belongs.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * The name of the ARM resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ARM resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="resource", type=SqlStoredProcedureGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ SqlStoredProcedureGetPropertiesResponseResource> resource;

    public Output</* @Nullable */ SqlStoredProcedureGetPropertiesResponseResource> resource() {
        return this.resource;
    }
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The type of Azure resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlResourceSqlStoredProcedure(String name) {
        this(name, SqlResourceSqlStoredProcedureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlResourceSqlStoredProcedure(String name, SqlResourceSqlStoredProcedureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlResourceSqlStoredProcedure(String name, SqlResourceSqlStoredProcedureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:SqlResourceSqlStoredProcedure", name, args == null ? SqlResourceSqlStoredProcedureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlResourceSqlStoredProcedure(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:SqlResourceSqlStoredProcedure", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20190801:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20191212:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200301:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200401:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200601preview:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200901:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210115:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210301preview:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210315:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210401preview:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210415:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210515:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210615:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210701preview:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015:SqlResourceSqlStoredProcedure").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:SqlResourceSqlStoredProcedure").build())
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
    public static SqlResourceSqlStoredProcedure get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlResourceSqlStoredProcedure(name, id, options);
    }
}
