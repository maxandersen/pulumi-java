// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mssql.ElasticPoolArgs;
import com.pulumi.azure.mssql.inputs.ElasticPoolState;
import com.pulumi.azure.mssql.outputs.ElasticPoolPerDatabaseSettings;
import com.pulumi.azure.mssql.outputs.ElasticPoolSku;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Allows you to manage an Azure SQL Elastic Pool via the `v3.0` API which allows for `vCore` and `DTU` based configurations.
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleSqlServer = new SqlServer(&#34;exampleSqlServer&#34;, SqlServerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .version(&#34;12.0&#34;)
 *             .administratorLogin(&#34;4dm1n157r470r&#34;)
 *             .administratorLoginPassword(&#34;4-v3ry-53cr37-p455w0rd&#34;)
 *             .build());
 * 
 *         var exampleElasticPool = new ElasticPool(&#34;exampleElasticPool&#34;, ElasticPoolArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .serverName(exampleSqlServer.getName())
 *             .licenseType(&#34;LicenseIncluded&#34;)
 *             .maxSizeGb(756)
 *             .sku(ElasticPoolSku.builder()
 *                 .name(&#34;BasicPool&#34;)
 *                 .tier(&#34;Basic&#34;)
 *                 .family(&#34;Gen4&#34;)
 *                 .capacity(4)
 *                 .build())
 *             .perDatabaseSettings(ElasticPoolPerDatabaseSettings.builder()
 *                 .minCapacity(0.25)
 *                 .maxCapacity(4)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * SQL Elastic Pool can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mssql/elasticPool:ElasticPool example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/servers/myserver/elasticPools/myelasticpoolname
 * ```
 * 
 */
@ResourceType(type="azure:mssql/elasticPool:ElasticPool")
public class ElasticPool extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the license type applied to this database. Possible values are `LicenseIncluded` and `BasePrice`.
     * 
     */
    @Export(name="licenseType", type=String.class, parameters={})
    private Output<String> licenseType;

    /**
     * @return Specifies the license type applied to this database. Possible values are `LicenseIncluded` and `BasePrice`.
     * 
     */
    public Output<String> licenseType() {
        return this.licenseType;
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The max data size of the elastic pool in bytes. Conflicts with `max_size_gb`.
     * 
     */
    @Export(name="maxSizeBytes", type=Integer.class, parameters={})
    private Output<Integer> maxSizeBytes;

    /**
     * @return The max data size of the elastic pool in bytes. Conflicts with `max_size_gb`.
     * 
     */
    public Output<Integer> maxSizeBytes() {
        return this.maxSizeBytes;
    }
    /**
     * The max data size of the elastic pool in gigabytes. Conflicts with `max_size_bytes`.
     * 
     */
    @Export(name="maxSizeGb", type=Double.class, parameters={})
    private Output<Double> maxSizeGb;

    /**
     * @return The max data size of the elastic pool in gigabytes. Conflicts with `max_size_bytes`.
     * 
     */
    public Output<Double> maxSizeGb() {
        return this.maxSizeGb;
    }
    /**
     * The name of the elastic pool. This needs to be globally unique. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the elastic pool. This needs to be globally unique. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `per_database_settings` block as defined below.
     * 
     */
    @Export(name="perDatabaseSettings", type=ElasticPoolPerDatabaseSettings.class, parameters={})
    private Output<ElasticPoolPerDatabaseSettings> perDatabaseSettings;

    /**
     * @return A `per_database_settings` block as defined below.
     * 
     */
    public Output<ElasticPoolPerDatabaseSettings> perDatabaseSettings() {
        return this.perDatabaseSettings;
    }
    /**
     * The name of the resource group in which to create the elastic pool. This must be the same as the resource group of the underlying SQL server.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the elastic pool. This must be the same as the resource group of the underlying SQL server.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name of the SQL Server on which to create the elastic pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="serverName", type=String.class, parameters={})
    private Output<String> serverName;

    /**
     * @return The name of the SQL Server on which to create the elastic pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }
    /**
     * A `sku` block as defined below.
     * 
     */
    @Export(name="sku", type=ElasticPoolSku.class, parameters={})
    private Output<ElasticPoolSku> sku;

    /**
     * @return A `sku` block as defined below.
     * 
     */
    public Output<ElasticPoolSku> sku() {
        return this.sku;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Whether or not this elastic pool is zone redundant. `tier` needs to be `Premium` for `DTU` based  or `BusinessCritical` for `vCore` based `sku`. Defaults to `false`.
     * 
     */
    @Export(name="zoneRedundant", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneRedundant;

    /**
     * @return Whether or not this elastic pool is zone redundant. `tier` needs to be `Premium` for `DTU` based  or `BusinessCritical` for `vCore` based `sku`. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> zoneRedundant() {
        return Codegen.optional(this.zoneRedundant);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ElasticPool(String name) {
        this(name, ElasticPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ElasticPool(String name, ElasticPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ElasticPool(String name, ElasticPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/elasticPool:ElasticPool", name, args == null ? ElasticPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ElasticPool(String name, Output<String> id, @Nullable ElasticPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/elasticPool:ElasticPool", name, state, makeResourceOptions(options, id));
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
    public static ElasticPool get(String name, Output<String> id, @Nullable ElasticPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ElasticPool(name, id, state, options);
    }
}
