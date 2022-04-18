// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.docdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterSnapshotState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterSnapshotState Empty = new ClusterSnapshotState();

    /**
     * List of EC2 Availability Zones that instances in the DocDB cluster snapshot can be restored in.
     * 
     */
    @Import(name="availabilityZones")
      private final @Nullable Output<List<String>> availabilityZones;

    public Output<List<String>> availabilityZones() {
        return this.availabilityZones == null ? Codegen.empty() : this.availabilityZones;
    }

    /**
     * The DocDB Cluster Identifier from which to take the snapshot.
     * 
     */
    @Import(name="dbClusterIdentifier")
      private final @Nullable Output<String> dbClusterIdentifier;

    public Output<String> dbClusterIdentifier() {
        return this.dbClusterIdentifier == null ? Codegen.empty() : this.dbClusterIdentifier;
    }

    /**
     * The Amazon Resource Name (ARN) for the DocDB Cluster Snapshot.
     * 
     */
    @Import(name="dbClusterSnapshotArn")
      private final @Nullable Output<String> dbClusterSnapshotArn;

    public Output<String> dbClusterSnapshotArn() {
        return this.dbClusterSnapshotArn == null ? Codegen.empty() : this.dbClusterSnapshotArn;
    }

    /**
     * The Identifier for the snapshot.
     * 
     */
    @Import(name="dbClusterSnapshotIdentifier")
      private final @Nullable Output<String> dbClusterSnapshotIdentifier;

    public Output<String> dbClusterSnapshotIdentifier() {
        return this.dbClusterSnapshotIdentifier == null ? Codegen.empty() : this.dbClusterSnapshotIdentifier;
    }

    /**
     * Specifies the name of the database engine.
     * 
     */
    @Import(name="engine")
      private final @Nullable Output<String> engine;

    public Output<String> engine() {
        return this.engine == null ? Codegen.empty() : this.engine;
    }

    /**
     * Version of the database engine for this DocDB cluster snapshot.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> engineVersion() {
        return this.engineVersion == null ? Codegen.empty() : this.engineVersion;
    }

    /**
     * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DocDB cluster snapshot.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * Port that the DocDB cluster was listening on at the time of the snapshot.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    @Import(name="snapshotType")
      private final @Nullable Output<String> snapshotType;

    public Output<String> snapshotType() {
        return this.snapshotType == null ? Codegen.empty() : this.snapshotType;
    }

    @Import(name="sourceDbClusterSnapshotArn")
      private final @Nullable Output<String> sourceDbClusterSnapshotArn;

    public Output<String> sourceDbClusterSnapshotArn() {
        return this.sourceDbClusterSnapshotArn == null ? Codegen.empty() : this.sourceDbClusterSnapshotArn;
    }

    /**
     * The status of this DocDB Cluster Snapshot.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Specifies whether the DocDB cluster snapshot is encrypted.
     * 
     */
    @Import(name="storageEncrypted")
      private final @Nullable Output<Boolean> storageEncrypted;

    public Output<Boolean> storageEncrypted() {
        return this.storageEncrypted == null ? Codegen.empty() : this.storageEncrypted;
    }

    /**
     * The VPC ID associated with the DocDB cluster snapshot.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public ClusterSnapshotState(
        @Nullable Output<List<String>> availabilityZones,
        @Nullable Output<String> dbClusterIdentifier,
        @Nullable Output<String> dbClusterSnapshotArn,
        @Nullable Output<String> dbClusterSnapshotIdentifier,
        @Nullable Output<String> engine,
        @Nullable Output<String> engineVersion,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<Integer> port,
        @Nullable Output<String> snapshotType,
        @Nullable Output<String> sourceDbClusterSnapshotArn,
        @Nullable Output<String> status,
        @Nullable Output<Boolean> storageEncrypted,
        @Nullable Output<String> vpcId) {
        this.availabilityZones = availabilityZones;
        this.dbClusterIdentifier = dbClusterIdentifier;
        this.dbClusterSnapshotArn = dbClusterSnapshotArn;
        this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.kmsKeyId = kmsKeyId;
        this.port = port;
        this.snapshotType = snapshotType;
        this.sourceDbClusterSnapshotArn = sourceDbClusterSnapshotArn;
        this.status = status;
        this.storageEncrypted = storageEncrypted;
        this.vpcId = vpcId;
    }

    private ClusterSnapshotState() {
        this.availabilityZones = Codegen.empty();
        this.dbClusterIdentifier = Codegen.empty();
        this.dbClusterSnapshotArn = Codegen.empty();
        this.dbClusterSnapshotIdentifier = Codegen.empty();
        this.engine = Codegen.empty();
        this.engineVersion = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
        this.port = Codegen.empty();
        this.snapshotType = Codegen.empty();
        this.sourceDbClusterSnapshotArn = Codegen.empty();
        this.status = Codegen.empty();
        this.storageEncrypted = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> availabilityZones;
        private @Nullable Output<String> dbClusterIdentifier;
        private @Nullable Output<String> dbClusterSnapshotArn;
        private @Nullable Output<String> dbClusterSnapshotIdentifier;
        private @Nullable Output<String> engine;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> snapshotType;
        private @Nullable Output<String> sourceDbClusterSnapshotArn;
        private @Nullable Output<String> status;
        private @Nullable Output<Boolean> storageEncrypted;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSnapshotState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.dbClusterSnapshotArn = defaults.dbClusterSnapshotArn;
    	      this.dbClusterSnapshotIdentifier = defaults.dbClusterSnapshotIdentifier;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.port = defaults.port;
    	      this.snapshotType = defaults.snapshotType;
    	      this.sourceDbClusterSnapshotArn = defaults.sourceDbClusterSnapshotArn;
    	      this.status = defaults.status;
    	      this.storageEncrypted = defaults.storageEncrypted;
    	      this.vpcId = defaults.vpcId;
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
        public Builder dbClusterIdentifier(@Nullable Output<String> dbClusterIdentifier) {
            this.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }
        public Builder dbClusterIdentifier(@Nullable String dbClusterIdentifier) {
            this.dbClusterIdentifier = Codegen.ofNullable(dbClusterIdentifier);
            return this;
        }
        public Builder dbClusterSnapshotArn(@Nullable Output<String> dbClusterSnapshotArn) {
            this.dbClusterSnapshotArn = dbClusterSnapshotArn;
            return this;
        }
        public Builder dbClusterSnapshotArn(@Nullable String dbClusterSnapshotArn) {
            this.dbClusterSnapshotArn = Codegen.ofNullable(dbClusterSnapshotArn);
            return this;
        }
        public Builder dbClusterSnapshotIdentifier(@Nullable Output<String> dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
            return this;
        }
        public Builder dbClusterSnapshotIdentifier(@Nullable String dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = Codegen.ofNullable(dbClusterSnapshotIdentifier);
            return this;
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
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
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
        public Builder snapshotType(@Nullable Output<String> snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public Builder snapshotType(@Nullable String snapshotType) {
            this.snapshotType = Codegen.ofNullable(snapshotType);
            return this;
        }
        public Builder sourceDbClusterSnapshotArn(@Nullable Output<String> sourceDbClusterSnapshotArn) {
            this.sourceDbClusterSnapshotArn = sourceDbClusterSnapshotArn;
            return this;
        }
        public Builder sourceDbClusterSnapshotArn(@Nullable String sourceDbClusterSnapshotArn) {
            this.sourceDbClusterSnapshotArn = Codegen.ofNullable(sourceDbClusterSnapshotArn);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
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
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public ClusterSnapshotState build() {
            return new ClusterSnapshotState(availabilityZones, dbClusterIdentifier, dbClusterSnapshotArn, dbClusterSnapshotIdentifier, engine, engineVersion, kmsKeyId, port, snapshotType, sourceDbClusterSnapshotArn, status, storageEncrypted, vpcId);
        }
    }
}
