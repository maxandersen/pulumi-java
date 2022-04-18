// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.docdb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * Specifies whether any cluster modifications
     * are applied immediately, or during the next maintenance window. Default is
     * `false`.
     * 
     */
    @Import(name="applyImmediately")
      private final @Nullable Output<Boolean> applyImmediately;

    public Output<Boolean> applyImmediately() {
        return this.applyImmediately == null ? Codegen.empty() : this.applyImmediately;
    }

    /**
     * A list of EC2 Availability Zones that
     * instances in the DB cluster can be created in.
     * 
     */
    @Import(name="availabilityZones")
      private final @Nullable Output<List<String>> availabilityZones;

    public Output<List<String>> availabilityZones() {
        return this.availabilityZones == null ? Codegen.empty() : this.availabilityZones;
    }

    /**
     * The days to retain backups for. Default `1`
     * 
     */
    @Import(name="backupRetentionPeriod")
      private final @Nullable Output<Integer> backupRetentionPeriod;

    public Output<Integer> backupRetentionPeriod() {
        return this.backupRetentionPeriod == null ? Codegen.empty() : this.backupRetentionPeriod;
    }

    /**
     * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Import(name="clusterIdentifier")
      private final @Nullable Output<String> clusterIdentifier;

    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier == null ? Codegen.empty() : this.clusterIdentifier;
    }

    /**
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifer`.
     * 
     */
    @Import(name="clusterIdentifierPrefix")
      private final @Nullable Output<String> clusterIdentifierPrefix;

    public Output<String> clusterIdentifierPrefix() {
        return this.clusterIdentifierPrefix == null ? Codegen.empty() : this.clusterIdentifierPrefix;
    }

    /**
     * List of DocDB Instances that are a part of this cluster
     * 
     */
    @Import(name="clusterMembers")
      private final @Nullable Output<List<String>> clusterMembers;

    public Output<List<String>> clusterMembers() {
        return this.clusterMembers == null ? Codegen.empty() : this.clusterMembers;
    }

    /**
     * A cluster parameter group to associate with the cluster.
     * 
     */
    @Import(name="dbClusterParameterGroupName")
      private final @Nullable Output<String> dbClusterParameterGroupName;

    public Output<String> dbClusterParameterGroupName() {
        return this.dbClusterParameterGroupName == null ? Codegen.empty() : this.dbClusterParameterGroupName;
    }

    /**
     * A DB subnet group to associate with this DB instance.
     * 
     */
    @Import(name="dbSubnetGroupName")
      private final @Nullable Output<String> dbSubnetGroupName;

    public Output<String> dbSubnetGroupName() {
        return this.dbSubnetGroupName == null ? Codegen.empty() : this.dbSubnetGroupName;
    }

    /**
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> deletionProtection() {
        return this.deletionProtection == null ? Codegen.empty() : this.deletionProtection;
    }

    /**
     * List of log types to export to cloudwatch. If omitted, no logs will be exported.
     * The following log types are supported: `audit`, `profiler`.
     * 
     */
    @Import(name="enabledCloudwatchLogsExports")
      private final @Nullable Output<List<String>> enabledCloudwatchLogsExports;

    public Output<List<String>> enabledCloudwatchLogsExports() {
        return this.enabledCloudwatchLogsExports == null ? Codegen.empty() : this.enabledCloudwatchLogsExports;
    }

    /**
     * The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
     * 
     */
    @Import(name="engine")
      private final @Nullable Output<String> engine;

    public Output<String> engine() {
        return this.engine == null ? Codegen.empty() : this.engine;
    }

    /**
     * The database engine version. Updating this argument results in an outage.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> engineVersion() {
        return this.engineVersion == null ? Codegen.empty() : this.engineVersion;
    }

    /**
     * The name of your final DB snapshot
     * when this DB cluster is deleted. If omitted, no final snapshot will be
     * made.
     * 
     */
    @Import(name="finalSnapshotIdentifier")
      private final @Nullable Output<String> finalSnapshotIdentifier;

    public Output<String> finalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier == null ? Codegen.empty() : this.finalSnapshotIdentifier;
    }

    /**
     * The global cluster identifier specified on `aws.docdb.GlobalCluster`.
     * 
     */
    @Import(name="globalClusterIdentifier")
      private final @Nullable Output<String> globalClusterIdentifier;

    public Output<String> globalClusterIdentifier() {
        return this.globalClusterIdentifier == null ? Codegen.empty() : this.globalClusterIdentifier;
    }

    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * Password for the master DB user. Note that this may
     * show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
     * 
     */
    @Import(name="masterPassword")
      private final @Nullable Output<String> masterPassword;

    public Output<String> masterPassword() {
        return this.masterPassword == null ? Codegen.empty() : this.masterPassword;
    }

    /**
     * Username for the master DB user.
     * 
     */
    @Import(name="masterUsername")
      private final @Nullable Output<String> masterUsername;

    public Output<String> masterUsername() {
        return this.masterUsername == null ? Codegen.empty() : this.masterUsername;
    }

    /**
     * The port on which the DB accepts connections
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
     * Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    @Import(name="preferredBackupWindow")
      private final @Nullable Output<String> preferredBackupWindow;

    public Output<String> preferredBackupWindow() {
        return this.preferredBackupWindow == null ? Codegen.empty() : this.preferredBackupWindow;
    }

    /**
     * The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     * 
     */
    @Import(name="preferredMaintenanceWindow")
      private final @Nullable Output<String> preferredMaintenanceWindow;

    public Output<String> preferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow == null ? Codegen.empty() : this.preferredMaintenanceWindow;
    }

    /**
     * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    @Import(name="skipFinalSnapshot")
      private final @Nullable Output<Boolean> skipFinalSnapshot;

    public Output<Boolean> skipFinalSnapshot() {
        return this.skipFinalSnapshot == null ? Codegen.empty() : this.skipFinalSnapshot;
    }

    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
     * 
     */
    @Import(name="snapshotIdentifier")
      private final @Nullable Output<String> snapshotIdentifier;

    public Output<String> snapshotIdentifier() {
        return this.snapshotIdentifier == null ? Codegen.empty() : this.snapshotIdentifier;
    }

    /**
     * Specifies whether the DB cluster is encrypted. The default is `false`.
     * 
     */
    @Import(name="storageEncrypted")
      private final @Nullable Output<Boolean> storageEncrypted;

    public Output<Boolean> storageEncrypted() {
        return this.storageEncrypted == null ? Codegen.empty() : this.storageEncrypted;
    }

    /**
     * A map of tags to assign to the DB cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * List of VPC security groups to associate
     * with the Cluster
     * 
     */
    @Import(name="vpcSecurityGroupIds")
      private final @Nullable Output<List<String>> vpcSecurityGroupIds;

    public Output<List<String>> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Codegen.empty() : this.vpcSecurityGroupIds;
    }

    public ClusterArgs(
        @Nullable Output<Boolean> applyImmediately,
        @Nullable Output<List<String>> availabilityZones,
        @Nullable Output<Integer> backupRetentionPeriod,
        @Nullable Output<String> clusterIdentifier,
        @Nullable Output<String> clusterIdentifierPrefix,
        @Nullable Output<List<String>> clusterMembers,
        @Nullable Output<String> dbClusterParameterGroupName,
        @Nullable Output<String> dbSubnetGroupName,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<List<String>> enabledCloudwatchLogsExports,
        @Nullable Output<String> engine,
        @Nullable Output<String> engineVersion,
        @Nullable Output<String> finalSnapshotIdentifier,
        @Nullable Output<String> globalClusterIdentifier,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> masterPassword,
        @Nullable Output<String> masterUsername,
        @Nullable Output<Integer> port,
        @Nullable Output<String> preferredBackupWindow,
        @Nullable Output<String> preferredMaintenanceWindow,
        @Nullable Output<Boolean> skipFinalSnapshot,
        @Nullable Output<String> snapshotIdentifier,
        @Nullable Output<Boolean> storageEncrypted,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<String>> vpcSecurityGroupIds) {
        this.applyImmediately = applyImmediately;
        this.availabilityZones = availabilityZones;
        this.backupRetentionPeriod = backupRetentionPeriod;
        this.clusterIdentifier = clusterIdentifier;
        this.clusterIdentifierPrefix = clusterIdentifierPrefix;
        this.clusterMembers = clusterMembers;
        this.dbClusterParameterGroupName = dbClusterParameterGroupName;
        this.dbSubnetGroupName = dbSubnetGroupName;
        this.deletionProtection = deletionProtection;
        this.enabledCloudwatchLogsExports = enabledCloudwatchLogsExports;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
        this.globalClusterIdentifier = globalClusterIdentifier;
        this.kmsKeyId = kmsKeyId;
        this.masterPassword = masterPassword;
        this.masterUsername = masterUsername;
        this.port = port;
        this.preferredBackupWindow = preferredBackupWindow;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.skipFinalSnapshot = skipFinalSnapshot;
        this.snapshotIdentifier = snapshotIdentifier;
        this.storageEncrypted = storageEncrypted;
        this.tags = tags;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    private ClusterArgs() {
        this.applyImmediately = Codegen.empty();
        this.availabilityZones = Codegen.empty();
        this.backupRetentionPeriod = Codegen.empty();
        this.clusterIdentifier = Codegen.empty();
        this.clusterIdentifierPrefix = Codegen.empty();
        this.clusterMembers = Codegen.empty();
        this.dbClusterParameterGroupName = Codegen.empty();
        this.dbSubnetGroupName = Codegen.empty();
        this.deletionProtection = Codegen.empty();
        this.enabledCloudwatchLogsExports = Codegen.empty();
        this.engine = Codegen.empty();
        this.engineVersion = Codegen.empty();
        this.finalSnapshotIdentifier = Codegen.empty();
        this.globalClusterIdentifier = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
        this.masterPassword = Codegen.empty();
        this.masterUsername = Codegen.empty();
        this.port = Codegen.empty();
        this.preferredBackupWindow = Codegen.empty();
        this.preferredMaintenanceWindow = Codegen.empty();
        this.skipFinalSnapshot = Codegen.empty();
        this.snapshotIdentifier = Codegen.empty();
        this.storageEncrypted = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcSecurityGroupIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> applyImmediately;
        private @Nullable Output<List<String>> availabilityZones;
        private @Nullable Output<Integer> backupRetentionPeriod;
        private @Nullable Output<String> clusterIdentifier;
        private @Nullable Output<String> clusterIdentifierPrefix;
        private @Nullable Output<List<String>> clusterMembers;
        private @Nullable Output<String> dbClusterParameterGroupName;
        private @Nullable Output<String> dbSubnetGroupName;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<List<String>> enabledCloudwatchLogsExports;
        private @Nullable Output<String> engine;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<String> finalSnapshotIdentifier;
        private @Nullable Output<String> globalClusterIdentifier;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> masterPassword;
        private @Nullable Output<String> masterUsername;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> preferredBackupWindow;
        private @Nullable Output<String> preferredMaintenanceWindow;
        private @Nullable Output<Boolean> skipFinalSnapshot;
        private @Nullable Output<String> snapshotIdentifier;
        private @Nullable Output<Boolean> storageEncrypted;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<String>> vpcSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyImmediately = defaults.applyImmediately;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.backupRetentionPeriod = defaults.backupRetentionPeriod;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.clusterIdentifierPrefix = defaults.clusterIdentifierPrefix;
    	      this.clusterMembers = defaults.clusterMembers;
    	      this.dbClusterParameterGroupName = defaults.dbClusterParameterGroupName;
    	      this.dbSubnetGroupName = defaults.dbSubnetGroupName;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.enabledCloudwatchLogsExports = defaults.enabledCloudwatchLogsExports;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.finalSnapshotIdentifier = defaults.finalSnapshotIdentifier;
    	      this.globalClusterIdentifier = defaults.globalClusterIdentifier;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.masterPassword = defaults.masterPassword;
    	      this.masterUsername = defaults.masterUsername;
    	      this.port = defaults.port;
    	      this.preferredBackupWindow = defaults.preferredBackupWindow;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.skipFinalSnapshot = defaults.skipFinalSnapshot;
    	      this.snapshotIdentifier = defaults.snapshotIdentifier;
    	      this.storageEncrypted = defaults.storageEncrypted;
    	      this.tags = defaults.tags;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        public Builder applyImmediately(@Nullable Output<Boolean> applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }
        public Builder applyImmediately(@Nullable Boolean applyImmediately) {
            this.applyImmediately = Codegen.ofNullable(applyImmediately);
            return this;
        }
        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Codegen.ofNullable(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder backupRetentionPeriod(@Nullable Output<Integer> backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }
        public Builder backupRetentionPeriod(@Nullable Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = Codegen.ofNullable(backupRetentionPeriod);
            return this;
        }
        public Builder clusterIdentifier(@Nullable Output<String> clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }
        public Builder clusterIdentifier(@Nullable String clusterIdentifier) {
            this.clusterIdentifier = Codegen.ofNullable(clusterIdentifier);
            return this;
        }
        public Builder clusterIdentifierPrefix(@Nullable Output<String> clusterIdentifierPrefix) {
            this.clusterIdentifierPrefix = clusterIdentifierPrefix;
            return this;
        }
        public Builder clusterIdentifierPrefix(@Nullable String clusterIdentifierPrefix) {
            this.clusterIdentifierPrefix = Codegen.ofNullable(clusterIdentifierPrefix);
            return this;
        }
        public Builder clusterMembers(@Nullable Output<List<String>> clusterMembers) {
            this.clusterMembers = clusterMembers;
            return this;
        }
        public Builder clusterMembers(@Nullable List<String> clusterMembers) {
            this.clusterMembers = Codegen.ofNullable(clusterMembers);
            return this;
        }
        public Builder clusterMembers(String... clusterMembers) {
            return clusterMembers(List.of(clusterMembers));
        }
        public Builder dbClusterParameterGroupName(@Nullable Output<String> dbClusterParameterGroupName) {
            this.dbClusterParameterGroupName = dbClusterParameterGroupName;
            return this;
        }
        public Builder dbClusterParameterGroupName(@Nullable String dbClusterParameterGroupName) {
            this.dbClusterParameterGroupName = Codegen.ofNullable(dbClusterParameterGroupName);
            return this;
        }
        public Builder dbSubnetGroupName(@Nullable Output<String> dbSubnetGroupName) {
            this.dbSubnetGroupName = dbSubnetGroupName;
            return this;
        }
        public Builder dbSubnetGroupName(@Nullable String dbSubnetGroupName) {
            this.dbSubnetGroupName = Codegen.ofNullable(dbSubnetGroupName);
            return this;
        }
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Codegen.ofNullable(deletionProtection);
            return this;
        }
        public Builder enabledCloudwatchLogsExports(@Nullable Output<List<String>> enabledCloudwatchLogsExports) {
            this.enabledCloudwatchLogsExports = enabledCloudwatchLogsExports;
            return this;
        }
        public Builder enabledCloudwatchLogsExports(@Nullable List<String> enabledCloudwatchLogsExports) {
            this.enabledCloudwatchLogsExports = Codegen.ofNullable(enabledCloudwatchLogsExports);
            return this;
        }
        public Builder enabledCloudwatchLogsExports(String... enabledCloudwatchLogsExports) {
            return enabledCloudwatchLogsExports(List.of(enabledCloudwatchLogsExports));
        }
        public Builder engine(@Nullable Output<String> engine) {
            this.engine = engine;
            return this;
        }
        public Builder engine(@Nullable String engine) {
            this.engine = Codegen.ofNullable(engine);
            return this;
        }
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = Codegen.ofNullable(engineVersion);
            return this;
        }
        public Builder finalSnapshotIdentifier(@Nullable Output<String> finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            return this;
        }
        public Builder finalSnapshotIdentifier(@Nullable String finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = Codegen.ofNullable(finalSnapshotIdentifier);
            return this;
        }
        public Builder globalClusterIdentifier(@Nullable Output<String> globalClusterIdentifier) {
            this.globalClusterIdentifier = globalClusterIdentifier;
            return this;
        }
        public Builder globalClusterIdentifier(@Nullable String globalClusterIdentifier) {
            this.globalClusterIdentifier = Codegen.ofNullable(globalClusterIdentifier);
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }
        public Builder masterPassword(@Nullable Output<String> masterPassword) {
            this.masterPassword = masterPassword;
            return this;
        }
        public Builder masterPassword(@Nullable String masterPassword) {
            this.masterPassword = Codegen.ofNullable(masterPassword);
            return this;
        }
        public Builder masterUsername(@Nullable Output<String> masterUsername) {
            this.masterUsername = masterUsername;
            return this;
        }
        public Builder masterUsername(@Nullable String masterUsername) {
            this.masterUsername = Codegen.ofNullable(masterUsername);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder preferredBackupWindow(@Nullable Output<String> preferredBackupWindow) {
            this.preferredBackupWindow = preferredBackupWindow;
            return this;
        }
        public Builder preferredBackupWindow(@Nullable String preferredBackupWindow) {
            this.preferredBackupWindow = Codegen.ofNullable(preferredBackupWindow);
            return this;
        }
        public Builder preferredMaintenanceWindow(@Nullable Output<String> preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }
        public Builder preferredMaintenanceWindow(@Nullable String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Codegen.ofNullable(preferredMaintenanceWindow);
            return this;
        }
        public Builder skipFinalSnapshot(@Nullable Output<Boolean> skipFinalSnapshot) {
            this.skipFinalSnapshot = skipFinalSnapshot;
            return this;
        }
        public Builder skipFinalSnapshot(@Nullable Boolean skipFinalSnapshot) {
            this.skipFinalSnapshot = Codegen.ofNullable(skipFinalSnapshot);
            return this;
        }
        public Builder snapshotIdentifier(@Nullable Output<String> snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            return this;
        }
        public Builder snapshotIdentifier(@Nullable String snapshotIdentifier) {
            this.snapshotIdentifier = Codegen.ofNullable(snapshotIdentifier);
            return this;
        }
        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }
        public Builder storageEncrypted(@Nullable Boolean storageEncrypted) {
            this.storageEncrypted = Codegen.ofNullable(storageEncrypted);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Codegen.ofNullable(vpcSecurityGroupIds);
            return this;
        }
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }        public ClusterArgs build() {
            return new ClusterArgs(applyImmediately, availabilityZones, backupRetentionPeriod, clusterIdentifier, clusterIdentifierPrefix, clusterMembers, dbClusterParameterGroupName, dbSubnetGroupName, deletionProtection, enabledCloudwatchLogsExports, engine, engineVersion, finalSnapshotIdentifier, globalClusterIdentifier, kmsKeyId, masterPassword, masterUsername, port, preferredBackupWindow, preferredMaintenanceWindow, skipFinalSnapshot, snapshotIdentifier, storageEncrypted, tags, vpcSecurityGroupIds);
        }
    }
}
