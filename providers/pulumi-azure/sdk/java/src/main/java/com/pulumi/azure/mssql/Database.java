// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mssql.DatabaseArgs;
import com.pulumi.azure.mssql.inputs.DatabaseState;
import com.pulumi.azure.mssql.outputs.DatabaseLongTermRetentionPolicy;
import com.pulumi.azure.mssql.outputs.DatabaseShortTermRetentionPolicy;
import com.pulumi.azure.mssql.outputs.DatabaseThreatDetectionPolicy;
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
 * Manages a MS SQL Database.
 * 
 * &gt; **Note:** The Database Extended Auditing Policy can be set inline here, as well as with the mssql_database_extended_auditing_policy resource resource. You can only use one or the other and using both will cause a conflict.
 * 
 * ## Example Usage
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleServer = new Server(&#34;exampleServer&#34;, ServerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .version(&#34;12.0&#34;)
 *             .administratorLogin(&#34;4dm1n157r470r&#34;)
 *             .administratorLoginPassword(&#34;4-v3ry-53cr37-p455w0rd&#34;)
 *             .build());
 * 
 *         var test = new Database(&#34;test&#34;, DatabaseArgs.builder()        
 *             .serverId(exampleServer.getId())
 *             .collation(&#34;SQL_Latin1_General_CP1_CI_AS&#34;)
 *             .licenseType(&#34;LicenseIncluded&#34;)
 *             .maxSizeGb(4)
 *             .readScale(true)
 *             .skuName(&#34;S0&#34;)
 *             .zoneRedundant(true)
 *             .extendedAuditingPolicy(Map.ofEntries(
 *                 Map.entry(&#34;storageEndpoint&#34;, exampleAccount.getPrimaryBlobEndpoint()),
 *                 Map.entry(&#34;storageAccountAccessKey&#34;, exampleAccount.getPrimaryAccessKey()),
 *                 Map.entry(&#34;storageAccountAccessKeyIsSecondary&#34;, true),
 *                 Map.entry(&#34;retentionInDays&#34;, 6)
 *             ))
 *             .tags(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * SQL Database can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mssql/database:Database example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/databases/example1
 * ```
 * 
 */
@ResourceType(type="azure:mssql/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * Time in minutes after which database is automatically paused. A value of `-1` means that automatic pause is disabled. This property is only settable for General Purpose Serverless databases.
     * 
     */
    @Export(name="autoPauseDelayInMinutes", type=Integer.class, parameters={})
    private Output<Integer> autoPauseDelayInMinutes;

    /**
     * @return Time in minutes after which database is automatically paused. A value of `-1` means that automatic pause is disabled. This property is only settable for General Purpose Serverless databases.
     * 
     */
    public Output<Integer> autoPauseDelayInMinutes() {
        return this.autoPauseDelayInMinutes;
    }
    /**
     * Specifies the collation of the database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="collation", type=String.class, parameters={})
    private Output<String> collation;

    /**
     * @return Specifies the collation of the database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> collation() {
        return this.collation;
    }
    /**
     * The create mode of the database. Possible values are `Copy`, `Default`, `OnlineSecondary`, `PointInTimeRestore`, `Recovery`, `Restore`, `RestoreExternalBackup`, `RestoreExternalBackupSecondary`, `RestoreLongTermRetentionBackup` and `Secondary`.
     * 
     */
    @Export(name="createMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> createMode;

    /**
     * @return The create mode of the database. Possible values are `Copy`, `Default`, `OnlineSecondary`, `PointInTimeRestore`, `Recovery`, `Restore`, `RestoreExternalBackup`, `RestoreExternalBackupSecondary`, `RestoreLongTermRetentionBackup` and `Secondary`.
     * 
     */
    public Output<Optional<String>> createMode() {
        return Codegen.optional(this.createMode);
    }
    /**
     * The ID of the source database from which to create the new database. This should only be used for databases with `create_mode` values that use another database as reference. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="creationSourceDatabaseId", type=String.class, parameters={})
    private Output<String> creationSourceDatabaseId;

    /**
     * @return The ID of the source database from which to create the new database. This should only be used for databases with `create_mode` values that use another database as reference. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> creationSourceDatabaseId() {
        return this.creationSourceDatabaseId;
    }
    /**
     * Specifies the ID of the elastic pool containing this database.
     * 
     */
    @Export(name="elasticPoolId", type=String.class, parameters={})
    private Output</* @Nullable */ String> elasticPoolId;

    /**
     * @return Specifies the ID of the elastic pool containing this database.
     * 
     */
    public Output<Optional<String>> elasticPoolId() {
        return Codegen.optional(this.elasticPoolId);
    }
    /**
     * A boolean that specifies if the Geo Backup Policy is enabled.
     * 
     */
    @Export(name="geoBackupEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> geoBackupEnabled;

    /**
     * @return A boolean that specifies if the Geo Backup Policy is enabled.
     * 
     */
    public Output<Optional<Boolean>> geoBackupEnabled() {
        return Codegen.optional(this.geoBackupEnabled);
    }
    /**
     * A boolean that specifies if this is a ledger database. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="ledgerEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> ledgerEnabled;

    /**
     * @return A boolean that specifies if this is a ledger database. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Boolean> ledgerEnabled() {
        return this.ledgerEnabled;
    }
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
     * A `long_term_retention_policy` block as defined below.
     * 
     */
    @Export(name="longTermRetentionPolicy", type=DatabaseLongTermRetentionPolicy.class, parameters={})
    private Output<DatabaseLongTermRetentionPolicy> longTermRetentionPolicy;

    /**
     * @return A `long_term_retention_policy` block as defined below.
     * 
     */
    public Output<DatabaseLongTermRetentionPolicy> longTermRetentionPolicy() {
        return this.longTermRetentionPolicy;
    }
    /**
     * The max size of the database in gigabytes.
     * 
     */
    @Export(name="maxSizeGb", type=Integer.class, parameters={})
    private Output<Integer> maxSizeGb;

    /**
     * @return The max size of the database in gigabytes.
     * 
     */
    public Output<Integer> maxSizeGb() {
        return this.maxSizeGb;
    }
    /**
     * Minimal capacity that database will always have allocated, if not paused. This property is only settable for General Purpose Serverless databases.
     * 
     */
    @Export(name="minCapacity", type=Double.class, parameters={})
    private Output<Double> minCapacity;

    /**
     * @return Minimal capacity that database will always have allocated, if not paused. This property is only settable for General Purpose Serverless databases.
     * 
     */
    public Output<Double> minCapacity() {
        return this.minCapacity;
    }
    /**
     * The name of the MS SQL Database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the MS SQL Database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of readonly secondary replicas associated with the database to which readonly application intent connections may be routed. This property is only settable for Hyperscale edition databases.
     * 
     */
    @Export(name="readReplicaCount", type=Integer.class, parameters={})
    private Output<Integer> readReplicaCount;

    /**
     * @return The number of readonly secondary replicas associated with the database to which readonly application intent connections may be routed. This property is only settable for Hyperscale edition databases.
     * 
     */
    public Output<Integer> readReplicaCount() {
        return this.readReplicaCount;
    }
    /**
     * If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica. This property is only settable for Premium and Business Critical databases.
     * 
     */
    @Export(name="readScale", type=Boolean.class, parameters={})
    private Output<Boolean> readScale;

    /**
     * @return If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica. This property is only settable for Premium and Business Critical databases.
     * 
     */
    public Output<Boolean> readScale() {
        return this.readScale;
    }
    /**
     * The ID of the database to be recovered. This property is only applicable when the `create_mode` is `Recovery`.
     * 
     */
    @Export(name="recoverDatabaseId", type=String.class, parameters={})
    private Output</* @Nullable */ String> recoverDatabaseId;

    /**
     * @return The ID of the database to be recovered. This property is only applicable when the `create_mode` is `Recovery`.
     * 
     */
    public Output<Optional<String>> recoverDatabaseId() {
        return Codegen.optional(this.recoverDatabaseId);
    }
    /**
     * The ID of the database to be restored. This property is only applicable when the `create_mode` is `Restore`.
     * 
     */
    @Export(name="restoreDroppedDatabaseId", type=String.class, parameters={})
    private Output</* @Nullable */ String> restoreDroppedDatabaseId;

    /**
     * @return The ID of the database to be restored. This property is only applicable when the `create_mode` is `Restore`.
     * 
     */
    public Output<Optional<String>> restoreDroppedDatabaseId() {
        return Codegen.optional(this.restoreDroppedDatabaseId);
    }
    /**
     * Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database. This property is only settable for `create_mode`= `PointInTimeRestore`  databases.
     * 
     */
    @Export(name="restorePointInTime", type=String.class, parameters={})
    private Output<String> restorePointInTime;

    /**
     * @return Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database. This property is only settable for `create_mode`= `PointInTimeRestore`  databases.
     * 
     */
    public Output<String> restorePointInTime() {
        return this.restorePointInTime;
    }
    /**
     * Specifies the name of the sample schema to apply when creating this database. Possible value is `AdventureWorksLT`.
     * 
     */
    @Export(name="sampleName", type=String.class, parameters={})
    private Output<String> sampleName;

    /**
     * @return Specifies the name of the sample schema to apply when creating this database. Possible value is `AdventureWorksLT`.
     * 
     */
    public Output<String> sampleName() {
        return this.sampleName;
    }
    /**
     * The id of the MS SQL Server on which to create the database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="serverId", type=String.class, parameters={})
    private Output<String> serverId;

    /**
     * @return The id of the MS SQL Server on which to create the database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }
    /**
     * A `short_term_retention_policy` block as defined below.
     * 
     */
    @Export(name="shortTermRetentionPolicy", type=DatabaseShortTermRetentionPolicy.class, parameters={})
    private Output<DatabaseShortTermRetentionPolicy> shortTermRetentionPolicy;

    /**
     * @return A `short_term_retention_policy` block as defined below.
     * 
     */
    public Output<DatabaseShortTermRetentionPolicy> shortTermRetentionPolicy() {
        return this.shortTermRetentionPolicy;
    }
    /**
     * Specifies the name of the SKU used by the database. For example, `GP_S_Gen5_2`,`HS_Gen4_1`,`BC_Gen5_2`, `ElasticPool`, `Basic`,`S0`, `P2` ,`DW100c`, `DS100`. Changing this from the HyperScale service tier to another service tier will force a new resource to be created.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output<String> skuName;

    /**
     * @return Specifies the name of the SKU used by the database. For example, `GP_S_Gen5_2`,`HS_Gen4_1`,`BC_Gen5_2`, `ElasticPool`, `Basic`,`S0`, `P2` ,`DW100c`, `DS100`. Changing this from the HyperScale service tier to another service tier will force a new resource to be created.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * Specifies the storage account type used to store backups for this database. Possible values are `Geo`, `GeoZone`, `Local` and `Zone`.  The default value is `Geo`.
     * 
     */
    @Export(name="storageAccountType", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountType;

    /**
     * @return Specifies the storage account type used to store backups for this database. Possible values are `Geo`, `GeoZone`, `Local` and `Zone`.  The default value is `Geo`.
     * 
     */
    public Output<Optional<String>> storageAccountType() {
        return Codegen.optional(this.storageAccountType);
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
     * Threat detection policy configuration. The `threat_detection_policy` block supports fields documented below.
     * 
     */
    @Export(name="threatDetectionPolicy", type=DatabaseThreatDetectionPolicy.class, parameters={})
    private Output<DatabaseThreatDetectionPolicy> threatDetectionPolicy;

    /**
     * @return Threat detection policy configuration. The `threat_detection_policy` block supports fields documented below.
     * 
     */
    public Output<DatabaseThreatDetectionPolicy> threatDetectionPolicy() {
        return this.threatDetectionPolicy;
    }
    @Export(name="transparentDataEncryptionEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> transparentDataEncryptionEnabled;

    public Output<Optional<Boolean>> transparentDataEncryptionEnabled() {
        return Codegen.optional(this.transparentDataEncryptionEnabled);
    }
    /**
     * Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones. This property is only settable for Premium and Business Critical databases.
     * 
     */
    @Export(name="zoneRedundant", type=Boolean.class, parameters={})
    private Output<Boolean> zoneRedundant;

    /**
     * @return Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones. This property is only settable for Premium and Business Critical databases.
     * 
     */
    public Output<Boolean> zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/database:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Database(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/database:Database", name, state, makeResourceOptions(options, id));
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
    public static Database get(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}
