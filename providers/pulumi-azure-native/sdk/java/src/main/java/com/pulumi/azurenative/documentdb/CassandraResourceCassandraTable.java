// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.documentdb.CassandraResourceCassandraTableArgs;
import com.pulumi.azurenative.documentdb.outputs.CassandraTableGetPropertiesResponseOptions;
import com.pulumi.azurenative.documentdb.outputs.CassandraTableGetPropertiesResponseResource;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Azure Cosmos DB Cassandra table.
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:CassandraResourceCassandraTable tableName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1/cassandraKeyspaces/keyspaceName/cassandraTables/tableName 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:CassandraResourceCassandraTable")
public class CassandraResourceCassandraTable extends CustomResource {
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
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
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
    @Export(name="options", type=CassandraTableGetPropertiesResponseOptions.class, parameters={})
    private Output</* @Nullable */ CassandraTableGetPropertiesResponseOptions> options;

    public Output<Optional<CassandraTableGetPropertiesResponseOptions>> options() {
        return Codegen.optional(this.options);
    }
    @Export(name="resource", type=CassandraTableGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ CassandraTableGetPropertiesResponseResource> resource;

    public Output<Optional<CassandraTableGetPropertiesResponseResource>> resource() {
        return Codegen.optional(this.resource);
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
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
    public CassandraResourceCassandraTable(String name) {
        this(name, CassandraResourceCassandraTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CassandraResourceCassandraTable(String name, CassandraResourceCassandraTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CassandraResourceCassandraTable(String name, CassandraResourceCassandraTableArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraResourceCassandraTable", name, args == null ? CassandraResourceCassandraTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CassandraResourceCassandraTable(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraResourceCassandraTable", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20150401:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20150408:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20151106:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20160319:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20160331:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20190801:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20191212:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200301:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200401:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200601preview:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200901:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210115:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210301preview:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210315:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210401preview:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210415:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210515:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210615:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210701preview:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015:CassandraResourceCassandraTable").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:CassandraResourceCassandraTable").build())
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
    public static CassandraResourceCassandraTable get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new CassandraResourceCassandraTable(name, id, options);
    }
}
