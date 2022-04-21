// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.aws.rds.enums.EngineMode;
import com.pulumi.aws.rds.enums.EngineType;
import com.pulumi.aws.rds.inputs.ClusterRestoreToPointInTimeGetArgs;
import com.pulumi.aws.rds.inputs.ClusterS3ImportGetArgs;
import com.pulumi.aws.rds.inputs.ClusterScalingConfigurationGetArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * Enable to allow major engine version upgrades when changing engine versions. Defaults to `false`.
     * 
     */
    @Import(name="allowMajorVersionUpgrade")
    private @Nullable Output<Boolean> allowMajorVersionUpgrade;

    public Optional<Output<Boolean>> allowMajorVersionUpgrade() {
        return Optional.ofNullable(this.allowMajorVersionUpgrade);
    }

    /**
     * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`. See [Amazon RDS Documentation for more information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
     * 
     */
    @Import(name="applyImmediately")
    private @Nullable Output<Boolean> applyImmediately;

    public Optional<Output<Boolean>> applyImmediately() {
        return Optional.ofNullable(this.applyImmediately);
    }

    /**
     * Amazon Resource Name (ARN) of cluster
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A list of EC2 Availability Zones for the DB cluster storage where DB cluster instances can be created. RDS automatically assigns 3 AZs if less than 3 AZs are configured, which will show as a difference requiring resource recreation next apply. It is recommended to specify 3 AZs.
     * 
     */
    @Import(name="availabilityZones")
    private @Nullable Output<List<String>> availabilityZones;

    public Optional<Output<List<String>>> availabilityZones() {
        return Optional.ofNullable(this.availabilityZones);
    }

    /**
     * The target backtrack window, in seconds. Only available for `aurora` and `aurora-mysql` engines currently. To disable backtracking, set this value to `0`. Defaults to `0`. Must be between `0` and `259200` (72 hours)
     * 
     */
    @Import(name="backtrackWindow")
    private @Nullable Output<Integer> backtrackWindow;

    public Optional<Output<Integer>> backtrackWindow() {
        return Optional.ofNullable(this.backtrackWindow);
    }

    /**
     * The days to retain backups for. Default `1`
     * 
     */
    @Import(name="backupRetentionPeriod")
    private @Nullable Output<Integer> backupRetentionPeriod;

    public Optional<Output<Integer>> backupRetentionPeriod() {
        return Optional.ofNullable(this.backupRetentionPeriod);
    }

    /**
     * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Import(name="clusterIdentifier")
    private @Nullable Output<String> clusterIdentifier;

    public Optional<Output<String>> clusterIdentifier() {
        return Optional.ofNullable(this.clusterIdentifier);
    }

    /**
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
     * 
     */
    @Import(name="clusterIdentifierPrefix")
    private @Nullable Output<String> clusterIdentifierPrefix;

    public Optional<Output<String>> clusterIdentifierPrefix() {
        return Optional.ofNullable(this.clusterIdentifierPrefix);
    }

    /**
     * List of RDS Instances that are a part of this cluster
     * 
     */
    @Import(name="clusterMembers")
    private @Nullable Output<List<String>> clusterMembers;

    public Optional<Output<List<String>>> clusterMembers() {
        return Optional.ofNullable(this.clusterMembers);
    }

    /**
     * The RDS Cluster Resource ID
     * 
     */
    @Import(name="clusterResourceId")
    private @Nullable Output<String> clusterResourceId;

    public Optional<Output<String>> clusterResourceId() {
        return Optional.ofNullable(this.clusterResourceId);
    }

    /**
     * Copy all Cluster `tags` to snapshots. Default is `false`.
     * 
     */
    @Import(name="copyTagsToSnapshot")
    private @Nullable Output<Boolean> copyTagsToSnapshot;

    public Optional<Output<Boolean>> copyTagsToSnapshot() {
        return Optional.ofNullable(this.copyTagsToSnapshot);
    }

    /**
     * Name for an automatically created database on cluster creation. There are different naming restrictions per database engine: [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * A cluster parameter group to associate with the cluster.
     * 
     */
    @Import(name="dbClusterParameterGroupName")
    private @Nullable Output<String> dbClusterParameterGroupName;

    public Optional<Output<String>> dbClusterParameterGroupName() {
        return Optional.ofNullable(this.dbClusterParameterGroupName);
    }

    /**
     * Instance parameter group to associate with all instances of the DB cluster. The `db_instance_parameter_group_name` parameter is only valid in combination with the `allow_major_version_upgrade` parameter.
     * 
     */
    @Import(name="dbInstanceParameterGroupName")
    private @Nullable Output<String> dbInstanceParameterGroupName;

    public Optional<Output<String>> dbInstanceParameterGroupName() {
        return Optional.ofNullable(this.dbInstanceParameterGroupName);
    }

    /**
     * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` specified on every `aws.rds.ClusterInstance` in the cluster.
     * 
     */
    @Import(name="dbSubnetGroupName")
    private @Nullable Output<String> dbSubnetGroupName;

    public Optional<Output<String>> dbSubnetGroupName() {
        return Optional.ofNullable(this.dbSubnetGroupName);
    }

    /**
     * If the DB instance should have deletion protection enabled. The database can&#39;t be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    /**
     * Whether cluster should forward writes to an associated global cluster. Applied to secondary clusters to enable them to forward writes to an `aws.rds.GlobalCluster`&#39;s primary cluster. See the [Aurora Userguide documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database-write-forwarding.html) for more information.
     * 
     */
    @Import(name="enableGlobalWriteForwarding")
    private @Nullable Output<Boolean> enableGlobalWriteForwarding;

    public Optional<Output<Boolean>> enableGlobalWriteForwarding() {
        return Optional.ofNullable(this.enableGlobalWriteForwarding);
    }

    /**
     * Enable HTTP endpoint (data API). Only valid when `engine_mode` is set to `serverless`.
     * 
     */
    @Import(name="enableHttpEndpoint")
    private @Nullable Output<Boolean> enableHttpEndpoint;

    public Optional<Output<Boolean>> enableHttpEndpoint() {
        return Optional.ofNullable(this.enableHttpEndpoint);
    }

    /**
     * Set of log types to export to cloudwatch. If omitted, no logs will be exported. The following log types are supported: `audit`, `error`, `general`, `slowquery`, `postgresql` (PostgreSQL).
     * 
     */
    @Import(name="enabledCloudwatchLogsExports")
    private @Nullable Output<List<String>> enabledCloudwatchLogsExports;

    public Optional<Output<List<String>>> enabledCloudwatchLogsExports() {
        return Optional.ofNullable(this.enabledCloudwatchLogsExports);
    }

    /**
     * The DNS address of the RDS instance
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The name of the database engine to be used for this DB cluster. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`
     * 
     */
    @Import(name="engine")
    private @Nullable Output<Either<String,EngineType>> engine;

    public Optional<Output<Either<String,EngineType>>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * The database engine mode. Valid values: `global` (only valid for Aurora MySQL 1.21 and earlier), `multimaster`, `parallelquery`, `provisioned`, `serverless`. Defaults to: `provisioned`. See the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/aurora-serverless.html) for limitations when using `serverless`.
     * 
     */
    @Import(name="engineMode")
    private @Nullable Output<Either<String,EngineMode>> engineMode;

    public Optional<Output<Either<String,EngineMode>>> engineMode() {
        return Optional.ofNullable(this.engineMode);
    }

    /**
     * The database engine version. Updating this argument results in an outage. See the [Aurora MySQL](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html) and [Aurora Postgres](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.html) documentation for your configured engine to determine this value. For example with Aurora MySQL 2, a potential value for this argument is `5.7.mysql_aurora.2.03.2`. The value can contain a partial version where supported by the API. The actual engine version used is returned in the attribute `engine_version_actual`, defined below.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * The running version of the database.
     * 
     */
    @Import(name="engineVersionActual")
    private @Nullable Output<String> engineVersionActual;

    public Optional<Output<String>> engineVersionActual() {
        return Optional.ofNullable(this.engineVersionActual);
    }

    /**
     * The name of your final DB snapshot when this DB cluster is deleted. If omitted, no final snapshot will be made.
     * 
     */
    @Import(name="finalSnapshotIdentifier")
    private @Nullable Output<String> finalSnapshotIdentifier;

    public Optional<Output<String>> finalSnapshotIdentifier() {
        return Optional.ofNullable(this.finalSnapshotIdentifier);
    }

    /**
     * The global cluster identifier specified on `aws.rds.GlobalCluster`.
     * 
     */
    @Import(name="globalClusterIdentifier")
    private @Nullable Output<String> globalClusterIdentifier;

    public Optional<Output<String>> globalClusterIdentifier() {
        return Optional.ofNullable(this.globalClusterIdentifier);
    }

    /**
     * The Route53 Hosted Zone ID of the endpoint
     * 
     */
    @Import(name="hostedZoneId")
    private @Nullable Output<String> hostedZoneId;

    public Optional<Output<String>> hostedZoneId() {
        return Optional.ofNullable(this.hostedZoneId);
    }

    /**
     * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html) for availability and limitations.
     * 
     */
    @Import(name="iamDatabaseAuthenticationEnabled")
    private @Nullable Output<Boolean> iamDatabaseAuthenticationEnabled;

    public Optional<Output<Boolean>> iamDatabaseAuthenticationEnabled() {
        return Optional.ofNullable(this.iamDatabaseAuthenticationEnabled);
    }

    /**
     * A List of ARNs for the IAM roles to associate to the RDS Cluster.
     * 
     */
    @Import(name="iamRoles")
    private @Nullable Output<List<String>> iamRoles;

    public Optional<Output<List<String>>> iamRoles() {
        return Optional.ofNullable(this.iamRoles);
    }

    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * Password for the master DB user. Note that this may show up in logs, and it will be stored in the state file. Please refer to the [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints)
     * 
     */
    @Import(name="masterPassword")
    private @Nullable Output<String> masterPassword;

    public Optional<Output<String>> masterPassword() {
        return Optional.ofNullable(this.masterPassword);
    }

    /**
     * Username for the master DB user. Please refer to the [RDS Naming Constraints](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Limits.html#RDS_Limits.Constraints). This argument does not support in-place updates and cannot be changed during a restore from snapshot.
     * 
     */
    @Import(name="masterUsername")
    private @Nullable Output<String> masterUsername;

    public Optional<Output<String>> masterUsername() {
        return Optional.ofNullable(this.masterUsername);
    }

    /**
     * The port on which the DB accepts connections
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
     * 
     */
    @Import(name="preferredBackupWindow")
    private @Nullable Output<String> preferredBackupWindow;

    public Optional<Output<String>> preferredBackupWindow() {
        return Optional.ofNullable(this.preferredBackupWindow);
    }

    /**
     * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
     * 
     */
    @Import(name="preferredMaintenanceWindow")
    private @Nullable Output<String> preferredMaintenanceWindow;

    public Optional<Output<String>> preferredMaintenanceWindow() {
        return Optional.ofNullable(this.preferredMaintenanceWindow);
    }

    /**
     * A read-only endpoint for the Aurora cluster, automatically
     * load-balanced across replicas
     * 
     */
    @Import(name="readerEndpoint")
    private @Nullable Output<String> readerEndpoint;

    public Optional<Output<String>> readerEndpoint() {
        return Optional.ofNullable(this.readerEndpoint);
    }

    /**
     * ARN of a source DB cluster or DB instance if this DB cluster is to be created as a Read Replica. If DB Cluster is part of a Global Cluster, use `ignore_changes`.
     * 
     */
    @Import(name="replicationSourceIdentifier")
    private @Nullable Output<String> replicationSourceIdentifier;

    public Optional<Output<String>> replicationSourceIdentifier() {
        return Optional.ofNullable(this.replicationSourceIdentifier);
    }

    /**
     * Nested attribute for [point in time restore](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_PIT.html). More details below.
     * 
     */
    @Import(name="restoreToPointInTime")
    private @Nullable Output<ClusterRestoreToPointInTimeGetArgs> restoreToPointInTime;

    public Optional<Output<ClusterRestoreToPointInTimeGetArgs>> restoreToPointInTime() {
        return Optional.ofNullable(this.restoreToPointInTime);
    }

    @Import(name="s3Import")
    private @Nullable Output<ClusterS3ImportGetArgs> s3Import;

    public Optional<Output<ClusterS3ImportGetArgs>> s3Import() {
        return Optional.ofNullable(this.s3Import);
    }

    /**
     * Nested attribute with scaling properties. Only valid when `engine_mode` is set to `serverless`. More details below.
     * 
     */
    @Import(name="scalingConfiguration")
    private @Nullable Output<ClusterScalingConfigurationGetArgs> scalingConfiguration;

    public Optional<Output<ClusterScalingConfigurationGetArgs>> scalingConfiguration() {
        return Optional.ofNullable(this.scalingConfiguration);
    }

    /**
     * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    @Import(name="skipFinalSnapshot")
    private @Nullable Output<Boolean> skipFinalSnapshot;

    public Optional<Output<Boolean>> skipFinalSnapshot() {
        return Optional.ofNullable(this.skipFinalSnapshot);
    }

    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
     * 
     */
    @Import(name="snapshotIdentifier")
    private @Nullable Output<String> snapshotIdentifier;

    public Optional<Output<String>> snapshotIdentifier() {
        return Optional.ofNullable(this.snapshotIdentifier);
    }

    /**
     * The source region for an encrypted replica DB cluster.
     * 
     */
    @Import(name="sourceRegion")
    private @Nullable Output<String> sourceRegion;

    public Optional<Output<String>> sourceRegion() {
        return Optional.ofNullable(this.sourceRegion);
    }

    /**
     * Specifies whether the DB cluster is encrypted. The default is `false` for `provisioned` `engine_mode` and `true` for `serverless` `engine_mode`. When restoring an unencrypted `snapshot_identifier`, the `kms_key_id` argument must be provided to encrypt the restored cluster. The provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="storageEncrypted")
    private @Nullable Output<Boolean> storageEncrypted;

    public Optional<Output<Boolean>> storageEncrypted() {
        return Optional.ofNullable(this.storageEncrypted);
    }

    /**
     * A map of tags to assign to the DB cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * List of VPC security groups to associate with the Cluster
     * 
     */
    @Import(name="vpcSecurityGroupIds")
    private @Nullable Output<List<String>> vpcSecurityGroupIds;

    public Optional<Output<List<String>>> vpcSecurityGroupIds() {
        return Optional.ofNullable(this.vpcSecurityGroupIds);
    }

    private ClusterState() {}

    private ClusterState(ClusterState $) {
        this.allowMajorVersionUpgrade = $.allowMajorVersionUpgrade;
        this.applyImmediately = $.applyImmediately;
        this.arn = $.arn;
        this.availabilityZones = $.availabilityZones;
        this.backtrackWindow = $.backtrackWindow;
        this.backupRetentionPeriod = $.backupRetentionPeriod;
        this.clusterIdentifier = $.clusterIdentifier;
        this.clusterIdentifierPrefix = $.clusterIdentifierPrefix;
        this.clusterMembers = $.clusterMembers;
        this.clusterResourceId = $.clusterResourceId;
        this.copyTagsToSnapshot = $.copyTagsToSnapshot;
        this.databaseName = $.databaseName;
        this.dbClusterParameterGroupName = $.dbClusterParameterGroupName;
        this.dbInstanceParameterGroupName = $.dbInstanceParameterGroupName;
        this.dbSubnetGroupName = $.dbSubnetGroupName;
        this.deletionProtection = $.deletionProtection;
        this.enableGlobalWriteForwarding = $.enableGlobalWriteForwarding;
        this.enableHttpEndpoint = $.enableHttpEndpoint;
        this.enabledCloudwatchLogsExports = $.enabledCloudwatchLogsExports;
        this.endpoint = $.endpoint;
        this.engine = $.engine;
        this.engineMode = $.engineMode;
        this.engineVersion = $.engineVersion;
        this.engineVersionActual = $.engineVersionActual;
        this.finalSnapshotIdentifier = $.finalSnapshotIdentifier;
        this.globalClusterIdentifier = $.globalClusterIdentifier;
        this.hostedZoneId = $.hostedZoneId;
        this.iamDatabaseAuthenticationEnabled = $.iamDatabaseAuthenticationEnabled;
        this.iamRoles = $.iamRoles;
        this.kmsKeyId = $.kmsKeyId;
        this.masterPassword = $.masterPassword;
        this.masterUsername = $.masterUsername;
        this.port = $.port;
        this.preferredBackupWindow = $.preferredBackupWindow;
        this.preferredMaintenanceWindow = $.preferredMaintenanceWindow;
        this.readerEndpoint = $.readerEndpoint;
        this.replicationSourceIdentifier = $.replicationSourceIdentifier;
        this.restoreToPointInTime = $.restoreToPointInTime;
        this.s3Import = $.s3Import;
        this.scalingConfiguration = $.scalingConfiguration;
        this.skipFinalSnapshot = $.skipFinalSnapshot;
        this.snapshotIdentifier = $.snapshotIdentifier;
        this.sourceRegion = $.sourceRegion;
        this.storageEncrypted = $.storageEncrypted;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcSecurityGroupIds = $.vpcSecurityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterState $;

        public Builder() {
            $ = new ClusterState();
        }

        public Builder(ClusterState defaults) {
            $ = new ClusterState(Objects.requireNonNull(defaults));
        }

        public Builder allowMajorVersionUpgrade(@Nullable Output<Boolean> allowMajorVersionUpgrade) {
            $.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
            return this;
        }

        public Builder allowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
            return allowMajorVersionUpgrade(Output.of(allowMajorVersionUpgrade));
        }

        public Builder applyImmediately(@Nullable Output<Boolean> applyImmediately) {
            $.applyImmediately = applyImmediately;
            return this;
        }

        public Builder applyImmediately(Boolean applyImmediately) {
            return applyImmediately(Output.of(applyImmediately));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            $.availabilityZones = availabilityZones;
            return this;
        }

        public Builder availabilityZones(List<String> availabilityZones) {
            return availabilityZones(Output.of(availabilityZones));
        }

        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }

        public Builder backtrackWindow(@Nullable Output<Integer> backtrackWindow) {
            $.backtrackWindow = backtrackWindow;
            return this;
        }

        public Builder backtrackWindow(Integer backtrackWindow) {
            return backtrackWindow(Output.of(backtrackWindow));
        }

        public Builder backupRetentionPeriod(@Nullable Output<Integer> backupRetentionPeriod) {
            $.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            return backupRetentionPeriod(Output.of(backupRetentionPeriod));
        }

        public Builder clusterIdentifier(@Nullable Output<String> clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        public Builder clusterIdentifier(String clusterIdentifier) {
            return clusterIdentifier(Output.of(clusterIdentifier));
        }

        public Builder clusterIdentifierPrefix(@Nullable Output<String> clusterIdentifierPrefix) {
            $.clusterIdentifierPrefix = clusterIdentifierPrefix;
            return this;
        }

        public Builder clusterIdentifierPrefix(String clusterIdentifierPrefix) {
            return clusterIdentifierPrefix(Output.of(clusterIdentifierPrefix));
        }

        public Builder clusterMembers(@Nullable Output<List<String>> clusterMembers) {
            $.clusterMembers = clusterMembers;
            return this;
        }

        public Builder clusterMembers(List<String> clusterMembers) {
            return clusterMembers(Output.of(clusterMembers));
        }

        public Builder clusterMembers(String... clusterMembers) {
            return clusterMembers(List.of(clusterMembers));
        }

        public Builder clusterResourceId(@Nullable Output<String> clusterResourceId) {
            $.clusterResourceId = clusterResourceId;
            return this;
        }

        public Builder clusterResourceId(String clusterResourceId) {
            return clusterResourceId(Output.of(clusterResourceId));
        }

        public Builder copyTagsToSnapshot(@Nullable Output<Boolean> copyTagsToSnapshot) {
            $.copyTagsToSnapshot = copyTagsToSnapshot;
            return this;
        }

        public Builder copyTagsToSnapshot(Boolean copyTagsToSnapshot) {
            return copyTagsToSnapshot(Output.of(copyTagsToSnapshot));
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder dbClusterParameterGroupName(@Nullable Output<String> dbClusterParameterGroupName) {
            $.dbClusterParameterGroupName = dbClusterParameterGroupName;
            return this;
        }

        public Builder dbClusterParameterGroupName(String dbClusterParameterGroupName) {
            return dbClusterParameterGroupName(Output.of(dbClusterParameterGroupName));
        }

        public Builder dbInstanceParameterGroupName(@Nullable Output<String> dbInstanceParameterGroupName) {
            $.dbInstanceParameterGroupName = dbInstanceParameterGroupName;
            return this;
        }

        public Builder dbInstanceParameterGroupName(String dbInstanceParameterGroupName) {
            return dbInstanceParameterGroupName(Output.of(dbInstanceParameterGroupName));
        }

        public Builder dbSubnetGroupName(@Nullable Output<String> dbSubnetGroupName) {
            $.dbSubnetGroupName = dbSubnetGroupName;
            return this;
        }

        public Builder dbSubnetGroupName(String dbSubnetGroupName) {
            return dbSubnetGroupName(Output.of(dbSubnetGroupName));
        }

        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        public Builder deletionProtection(Boolean deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        public Builder enableGlobalWriteForwarding(@Nullable Output<Boolean> enableGlobalWriteForwarding) {
            $.enableGlobalWriteForwarding = enableGlobalWriteForwarding;
            return this;
        }

        public Builder enableGlobalWriteForwarding(Boolean enableGlobalWriteForwarding) {
            return enableGlobalWriteForwarding(Output.of(enableGlobalWriteForwarding));
        }

        public Builder enableHttpEndpoint(@Nullable Output<Boolean> enableHttpEndpoint) {
            $.enableHttpEndpoint = enableHttpEndpoint;
            return this;
        }

        public Builder enableHttpEndpoint(Boolean enableHttpEndpoint) {
            return enableHttpEndpoint(Output.of(enableHttpEndpoint));
        }

        public Builder enabledCloudwatchLogsExports(@Nullable Output<List<String>> enabledCloudwatchLogsExports) {
            $.enabledCloudwatchLogsExports = enabledCloudwatchLogsExports;
            return this;
        }

        public Builder enabledCloudwatchLogsExports(List<String> enabledCloudwatchLogsExports) {
            return enabledCloudwatchLogsExports(Output.of(enabledCloudwatchLogsExports));
        }

        public Builder enabledCloudwatchLogsExports(String... enabledCloudwatchLogsExports) {
            return enabledCloudwatchLogsExports(List.of(enabledCloudwatchLogsExports));
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder engine(@Nullable Output<Either<String,EngineType>> engine) {
            $.engine = engine;
            return this;
        }

        public Builder engine(Either<String,EngineType> engine) {
            return engine(Output.of(engine));
        }

        public Builder engineMode(@Nullable Output<Either<String,EngineMode>> engineMode) {
            $.engineMode = engineMode;
            return this;
        }

        public Builder engineMode(Either<String,EngineMode> engineMode) {
            return engineMode(Output.of(engineMode));
        }

        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        public Builder engineVersionActual(@Nullable Output<String> engineVersionActual) {
            $.engineVersionActual = engineVersionActual;
            return this;
        }

        public Builder engineVersionActual(String engineVersionActual) {
            return engineVersionActual(Output.of(engineVersionActual));
        }

        public Builder finalSnapshotIdentifier(@Nullable Output<String> finalSnapshotIdentifier) {
            $.finalSnapshotIdentifier = finalSnapshotIdentifier;
            return this;
        }

        public Builder finalSnapshotIdentifier(String finalSnapshotIdentifier) {
            return finalSnapshotIdentifier(Output.of(finalSnapshotIdentifier));
        }

        public Builder globalClusterIdentifier(@Nullable Output<String> globalClusterIdentifier) {
            $.globalClusterIdentifier = globalClusterIdentifier;
            return this;
        }

        public Builder globalClusterIdentifier(String globalClusterIdentifier) {
            return globalClusterIdentifier(Output.of(globalClusterIdentifier));
        }

        public Builder hostedZoneId(@Nullable Output<String> hostedZoneId) {
            $.hostedZoneId = hostedZoneId;
            return this;
        }

        public Builder hostedZoneId(String hostedZoneId) {
            return hostedZoneId(Output.of(hostedZoneId));
        }

        public Builder iamDatabaseAuthenticationEnabled(@Nullable Output<Boolean> iamDatabaseAuthenticationEnabled) {
            $.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
            return this;
        }

        public Builder iamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
            return iamDatabaseAuthenticationEnabled(Output.of(iamDatabaseAuthenticationEnabled));
        }

        public Builder iamRoles(@Nullable Output<List<String>> iamRoles) {
            $.iamRoles = iamRoles;
            return this;
        }

        public Builder iamRoles(List<String> iamRoles) {
            return iamRoles(Output.of(iamRoles));
        }

        public Builder iamRoles(String... iamRoles) {
            return iamRoles(List.of(iamRoles));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder masterPassword(@Nullable Output<String> masterPassword) {
            $.masterPassword = masterPassword;
            return this;
        }

        public Builder masterPassword(String masterPassword) {
            return masterPassword(Output.of(masterPassword));
        }

        public Builder masterUsername(@Nullable Output<String> masterUsername) {
            $.masterUsername = masterUsername;
            return this;
        }

        public Builder masterUsername(String masterUsername) {
            return masterUsername(Output.of(masterUsername));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder preferredBackupWindow(@Nullable Output<String> preferredBackupWindow) {
            $.preferredBackupWindow = preferredBackupWindow;
            return this;
        }

        public Builder preferredBackupWindow(String preferredBackupWindow) {
            return preferredBackupWindow(Output.of(preferredBackupWindow));
        }

        public Builder preferredMaintenanceWindow(@Nullable Output<String> preferredMaintenanceWindow) {
            $.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        public Builder preferredMaintenanceWindow(String preferredMaintenanceWindow) {
            return preferredMaintenanceWindow(Output.of(preferredMaintenanceWindow));
        }

        public Builder readerEndpoint(@Nullable Output<String> readerEndpoint) {
            $.readerEndpoint = readerEndpoint;
            return this;
        }

        public Builder readerEndpoint(String readerEndpoint) {
            return readerEndpoint(Output.of(readerEndpoint));
        }

        public Builder replicationSourceIdentifier(@Nullable Output<String> replicationSourceIdentifier) {
            $.replicationSourceIdentifier = replicationSourceIdentifier;
            return this;
        }

        public Builder replicationSourceIdentifier(String replicationSourceIdentifier) {
            return replicationSourceIdentifier(Output.of(replicationSourceIdentifier));
        }

        public Builder restoreToPointInTime(@Nullable Output<ClusterRestoreToPointInTimeGetArgs> restoreToPointInTime) {
            $.restoreToPointInTime = restoreToPointInTime;
            return this;
        }

        public Builder restoreToPointInTime(ClusterRestoreToPointInTimeGetArgs restoreToPointInTime) {
            return restoreToPointInTime(Output.of(restoreToPointInTime));
        }

        public Builder s3Import(@Nullable Output<ClusterS3ImportGetArgs> s3Import) {
            $.s3Import = s3Import;
            return this;
        }

        public Builder s3Import(ClusterS3ImportGetArgs s3Import) {
            return s3Import(Output.of(s3Import));
        }

        public Builder scalingConfiguration(@Nullable Output<ClusterScalingConfigurationGetArgs> scalingConfiguration) {
            $.scalingConfiguration = scalingConfiguration;
            return this;
        }

        public Builder scalingConfiguration(ClusterScalingConfigurationGetArgs scalingConfiguration) {
            return scalingConfiguration(Output.of(scalingConfiguration));
        }

        public Builder skipFinalSnapshot(@Nullable Output<Boolean> skipFinalSnapshot) {
            $.skipFinalSnapshot = skipFinalSnapshot;
            return this;
        }

        public Builder skipFinalSnapshot(Boolean skipFinalSnapshot) {
            return skipFinalSnapshot(Output.of(skipFinalSnapshot));
        }

        public Builder snapshotIdentifier(@Nullable Output<String> snapshotIdentifier) {
            $.snapshotIdentifier = snapshotIdentifier;
            return this;
        }

        public Builder snapshotIdentifier(String snapshotIdentifier) {
            return snapshotIdentifier(Output.of(snapshotIdentifier));
        }

        public Builder sourceRegion(@Nullable Output<String> sourceRegion) {
            $.sourceRegion = sourceRegion;
            return this;
        }

        public Builder sourceRegion(String sourceRegion) {
            return sourceRegion(Output.of(sourceRegion));
        }

        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            $.storageEncrypted = storageEncrypted;
            return this;
        }

        public Builder storageEncrypted(Boolean storageEncrypted) {
            return storageEncrypted(Output.of(storageEncrypted));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            $.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        public Builder vpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(Output.of(vpcSecurityGroupIds));
        }

        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }

        public ClusterState build() {
            return $;
        }
    }

}
