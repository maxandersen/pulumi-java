// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune;

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
     * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    @Import(name="applyImmediately")
      private final @Nullable Output<Boolean> applyImmediately;

    public Output<Boolean> applyImmediately() {
        return this.applyImmediately == null ? Codegen.empty() : this.applyImmediately;
    }

    /**
     * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
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
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
     * 
     */
    @Import(name="clusterIdentifierPrefix")
      private final @Nullable Output<String> clusterIdentifierPrefix;

    public Output<String> clusterIdentifierPrefix() {
        return this.clusterIdentifierPrefix == null ? Codegen.empty() : this.clusterIdentifierPrefix;
    }

    /**
     * If set to true, tags are copied to any snapshot of the DB cluster that is created.
     * 
     */
    @Import(name="copyTagsToSnapshot")
      private final @Nullable Output<Boolean> copyTagsToSnapshot;

    public Output<Boolean> copyTagsToSnapshot() {
        return this.copyTagsToSnapshot == null ? Codegen.empty() : this.copyTagsToSnapshot;
    }

    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> deletionProtection() {
        return this.deletionProtection == null ? Codegen.empty() : this.deletionProtection;
    }

    /**
     * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
     * 
     */
    @Import(name="enableCloudwatchLogsExports")
      private final @Nullable Output<List<String>> enableCloudwatchLogsExports;

    public Output<List<String>> enableCloudwatchLogsExports() {
        return this.enableCloudwatchLogsExports == null ? Codegen.empty() : this.enableCloudwatchLogsExports;
    }

    /**
     * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
     * 
     */
    @Import(name="engine")
      private final @Nullable Output<String> engine;

    public Output<String> engine() {
        return this.engine == null ? Codegen.empty() : this.engine;
    }

    /**
     * The database engine version.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> engineVersion() {
        return this.engineVersion == null ? Codegen.empty() : this.engineVersion;
    }

    /**
     * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
     * 
     */
    @Import(name="finalSnapshotIdentifier")
      private final @Nullable Output<String> finalSnapshotIdentifier;

    public Output<String> finalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier == null ? Codegen.empty() : this.finalSnapshotIdentifier;
    }

    /**
     * Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * 
     */
    @Import(name="iamDatabaseAuthenticationEnabled")
      private final @Nullable Output<Boolean> iamDatabaseAuthenticationEnabled;

    public Output<Boolean> iamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled == null ? Codegen.empty() : this.iamDatabaseAuthenticationEnabled;
    }

    /**
     * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
     * 
     */
    @Import(name="iamRoles")
      private final @Nullable Output<List<String>> iamRoles;

    public Output<List<String>> iamRoles() {
        return this.iamRoles == null ? Codegen.empty() : this.iamRoles;
    }

    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn == null ? Codegen.empty() : this.kmsKeyArn;
    }

    /**
     * A cluster parameter group to associate with the cluster.
     * 
     */
    @Import(name="neptuneClusterParameterGroupName")
      private final @Nullable Output<String> neptuneClusterParameterGroupName;

    public Output<String> neptuneClusterParameterGroupName() {
        return this.neptuneClusterParameterGroupName == null ? Codegen.empty() : this.neptuneClusterParameterGroupName;
    }

    /**
     * A Neptune subnet group to associate with this Neptune instance.
     * 
     */
    @Import(name="neptuneSubnetGroupName")
      private final @Nullable Output<String> neptuneSubnetGroupName;

    public Output<String> neptuneSubnetGroupName() {
        return this.neptuneSubnetGroupName == null ? Codegen.empty() : this.neptuneSubnetGroupName;
    }

    /**
     * The port on which the Neptune accepts connections. Default is `8182`.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
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
     * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
     * 
     */
    @Import(name="replicationSourceIdentifier")
      private final @Nullable Output<String> replicationSourceIdentifier;

    public Output<String> replicationSourceIdentifier() {
        return this.replicationSourceIdentifier == null ? Codegen.empty() : this.replicationSourceIdentifier;
    }

    /**
     * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    @Import(name="skipFinalSnapshot")
      private final @Nullable Output<Boolean> skipFinalSnapshot;

    public Output<Boolean> skipFinalSnapshot() {
        return this.skipFinalSnapshot == null ? Codegen.empty() : this.skipFinalSnapshot;
    }

    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
     * 
     */
    @Import(name="snapshotIdentifier")
      private final @Nullable Output<String> snapshotIdentifier;

    public Output<String> snapshotIdentifier() {
        return this.snapshotIdentifier == null ? Codegen.empty() : this.snapshotIdentifier;
    }

    /**
     * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
     * 
     */
    @Import(name="storageEncrypted")
      private final @Nullable Output<Boolean> storageEncrypted;

    public Output<Boolean> storageEncrypted() {
        return this.storageEncrypted == null ? Codegen.empty() : this.storageEncrypted;
    }

    /**
     * A map of tags to assign to the Neptune cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * List of VPC security groups to associate with the Cluster
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
        @Nullable Output<Boolean> copyTagsToSnapshot,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<List<String>> enableCloudwatchLogsExports,
        @Nullable Output<String> engine,
        @Nullable Output<String> engineVersion,
        @Nullable Output<String> finalSnapshotIdentifier,
        @Nullable Output<Boolean> iamDatabaseAuthenticationEnabled,
        @Nullable Output<List<String>> iamRoles,
        @Nullable Output<String> kmsKeyArn,
        @Nullable Output<String> neptuneClusterParameterGroupName,
        @Nullable Output<String> neptuneSubnetGroupName,
        @Nullable Output<Integer> port,
        @Nullable Output<String> preferredBackupWindow,
        @Nullable Output<String> preferredMaintenanceWindow,
        @Nullable Output<String> replicationSourceIdentifier,
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
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        this.deletionProtection = deletionProtection;
        this.enableCloudwatchLogsExports = enableCloudwatchLogsExports;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
        this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
        this.iamRoles = iamRoles;
        this.kmsKeyArn = kmsKeyArn;
        this.neptuneClusterParameterGroupName = neptuneClusterParameterGroupName;
        this.neptuneSubnetGroupName = neptuneSubnetGroupName;
        this.port = port;
        this.preferredBackupWindow = preferredBackupWindow;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.replicationSourceIdentifier = replicationSourceIdentifier;
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
        this.copyTagsToSnapshot = Codegen.empty();
        this.deletionProtection = Codegen.empty();
        this.enableCloudwatchLogsExports = Codegen.empty();
        this.engine = Codegen.empty();
        this.engineVersion = Codegen.empty();
        this.finalSnapshotIdentifier = Codegen.empty();
        this.iamDatabaseAuthenticationEnabled = Codegen.empty();
        this.iamRoles = Codegen.empty();
        this.kmsKeyArn = Codegen.empty();
        this.neptuneClusterParameterGroupName = Codegen.empty();
        this.neptuneSubnetGroupName = Codegen.empty();
        this.port = Codegen.empty();
        this.preferredBackupWindow = Codegen.empty();
        this.preferredMaintenanceWindow = Codegen.empty();
        this.replicationSourceIdentifier = Codegen.empty();
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
        private @Nullable Output<Boolean> copyTagsToSnapshot;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<List<String>> enableCloudwatchLogsExports;
        private @Nullable Output<String> engine;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<String> finalSnapshotIdentifier;
        private @Nullable Output<Boolean> iamDatabaseAuthenticationEnabled;
        private @Nullable Output<List<String>> iamRoles;
        private @Nullable Output<String> kmsKeyArn;
        private @Nullable Output<String> neptuneClusterParameterGroupName;
        private @Nullable Output<String> neptuneSubnetGroupName;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> preferredBackupWindow;
        private @Nullable Output<String> preferredMaintenanceWindow;
        private @Nullable Output<String> replicationSourceIdentifier;
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
    	      this.copyTagsToSnapshot = defaults.copyTagsToSnapshot;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.enableCloudwatchLogsExports = defaults.enableCloudwatchLogsExports;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.finalSnapshotIdentifier = defaults.finalSnapshotIdentifier;
    	      this.iamDatabaseAuthenticationEnabled = defaults.iamDatabaseAuthenticationEnabled;
    	      this.iamRoles = defaults.iamRoles;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.neptuneClusterParameterGroupName = defaults.neptuneClusterParameterGroupName;
    	      this.neptuneSubnetGroupName = defaults.neptuneSubnetGroupName;
    	      this.port = defaults.port;
    	      this.preferredBackupWindow = defaults.preferredBackupWindow;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.replicationSourceIdentifier = defaults.replicationSourceIdentifier;
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
        public Builder copyTagsToSnapshot(@Nullable Output<Boolean> copyTagsToSnapshot) {
            this.copyTagsToSnapshot = copyTagsToSnapshot;
            return this;
        }
        public Builder copyTagsToSnapshot(@Nullable Boolean copyTagsToSnapshot) {
            this.copyTagsToSnapshot = Codegen.ofNullable(copyTagsToSnapshot);
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
        public Builder enableCloudwatchLogsExports(@Nullable Output<List<String>> enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports = enableCloudwatchLogsExports;
            return this;
        }
        public Builder enableCloudwatchLogsExports(@Nullable List<String> enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports = Codegen.ofNullable(enableCloudwatchLogsExports);
            return this;
        }
        public Builder enableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
            return enableCloudwatchLogsExports(List.of(enableCloudwatchLogsExports));
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
        public Builder iamDatabaseAuthenticationEnabled(@Nullable Output<Boolean> iamDatabaseAuthenticationEnabled) {
            this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
            return this;
        }
        public Builder iamDatabaseAuthenticationEnabled(@Nullable Boolean iamDatabaseAuthenticationEnabled) {
            this.iamDatabaseAuthenticationEnabled = Codegen.ofNullable(iamDatabaseAuthenticationEnabled);
            return this;
        }
        public Builder iamRoles(@Nullable Output<List<String>> iamRoles) {
            this.iamRoles = iamRoles;
            return this;
        }
        public Builder iamRoles(@Nullable List<String> iamRoles) {
            this.iamRoles = Codegen.ofNullable(iamRoles);
            return this;
        }
        public Builder iamRoles(String... iamRoles) {
            return iamRoles(List.of(iamRoles));
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Codegen.ofNullable(kmsKeyArn);
            return this;
        }
        public Builder neptuneClusterParameterGroupName(@Nullable Output<String> neptuneClusterParameterGroupName) {
            this.neptuneClusterParameterGroupName = neptuneClusterParameterGroupName;
            return this;
        }
        public Builder neptuneClusterParameterGroupName(@Nullable String neptuneClusterParameterGroupName) {
            this.neptuneClusterParameterGroupName = Codegen.ofNullable(neptuneClusterParameterGroupName);
            return this;
        }
        public Builder neptuneSubnetGroupName(@Nullable Output<String> neptuneSubnetGroupName) {
            this.neptuneSubnetGroupName = neptuneSubnetGroupName;
            return this;
        }
        public Builder neptuneSubnetGroupName(@Nullable String neptuneSubnetGroupName) {
            this.neptuneSubnetGroupName = Codegen.ofNullable(neptuneSubnetGroupName);
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
        public Builder replicationSourceIdentifier(@Nullable Output<String> replicationSourceIdentifier) {
            this.replicationSourceIdentifier = replicationSourceIdentifier;
            return this;
        }
        public Builder replicationSourceIdentifier(@Nullable String replicationSourceIdentifier) {
            this.replicationSourceIdentifier = Codegen.ofNullable(replicationSourceIdentifier);
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
            return new ClusterArgs(applyImmediately, availabilityZones, backupRetentionPeriod, clusterIdentifier, clusterIdentifierPrefix, copyTagsToSnapshot, deletionProtection, enableCloudwatchLogsExports, engine, engineVersion, finalSnapshotIdentifier, iamDatabaseAuthenticationEnabled, iamRoles, kmsKeyArn, neptuneClusterParameterGroupName, neptuneSubnetGroupName, port, preferredBackupWindow, preferredMaintenanceWindow, replicationSourceIdentifier, skipFinalSnapshot, snapshotIdentifier, storageEncrypted, tags, vpcSecurityGroupIds);
        }
    }
}
