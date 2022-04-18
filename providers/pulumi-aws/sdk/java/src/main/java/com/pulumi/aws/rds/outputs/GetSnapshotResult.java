// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSnapshotResult {
    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    private final Integer allocatedStorage;
    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * 
     */
    private final String availabilityZone;
    private final @Nullable String dbInstanceIdentifier;
    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * 
     */
    private final String dbSnapshotArn;
    private final @Nullable String dbSnapshotIdentifier;
    /**
     * Specifies whether the DB snapshot is encrypted.
     * 
     */
    private final Boolean encrypted;
    /**
     * Specifies the name of the database engine.
     * 
     */
    private final String engine;
    /**
     * Specifies the version of the database engine.
     * 
     */
    private final String engineVersion;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Boolean includePublic;
    private final @Nullable Boolean includeShared;
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * 
     */
    private final Integer iops;
    /**
     * The ARN for the KMS encryption key.
     * 
     */
    private final String kmsKeyId;
    /**
     * License model information for the restored DB instance.
     * 
     */
    private final String licenseModel;
    private final @Nullable Boolean mostRecent;
    /**
     * Provides the option group name for the DB snapshot.
     * 
     */
    private final String optionGroupName;
    private final Integer port;
    /**
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * 
     */
    private final String snapshotCreateTime;
    private final @Nullable String snapshotType;
    /**
     * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     * 
     */
    private final String sourceDbSnapshotIdentifier;
    /**
     * The region that the DB snapshot was created in or copied from.
     * 
     */
    private final String sourceRegion;
    /**
     * Specifies the status of this DB snapshot.
     * 
     */
    private final String status;
    /**
     * Specifies the storage type associated with DB snapshot.
     * 
     */
    private final String storageType;
    /**
     * Specifies the ID of the VPC associated with the DB snapshot.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private GetSnapshotResult(
        @CustomType.Parameter("allocatedStorage") Integer allocatedStorage,
        @CustomType.Parameter("availabilityZone") String availabilityZone,
        @CustomType.Parameter("dbInstanceIdentifier") @Nullable String dbInstanceIdentifier,
        @CustomType.Parameter("dbSnapshotArn") String dbSnapshotArn,
        @CustomType.Parameter("dbSnapshotIdentifier") @Nullable String dbSnapshotIdentifier,
        @CustomType.Parameter("encrypted") Boolean encrypted,
        @CustomType.Parameter("engine") String engine,
        @CustomType.Parameter("engineVersion") String engineVersion,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("includePublic") @Nullable Boolean includePublic,
        @CustomType.Parameter("includeShared") @Nullable Boolean includeShared,
        @CustomType.Parameter("iops") Integer iops,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("licenseModel") String licenseModel,
        @CustomType.Parameter("mostRecent") @Nullable Boolean mostRecent,
        @CustomType.Parameter("optionGroupName") String optionGroupName,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("snapshotCreateTime") String snapshotCreateTime,
        @CustomType.Parameter("snapshotType") @Nullable String snapshotType,
        @CustomType.Parameter("sourceDbSnapshotIdentifier") String sourceDbSnapshotIdentifier,
        @CustomType.Parameter("sourceRegion") String sourceRegion,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("storageType") String storageType,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.allocatedStorage = allocatedStorage;
        this.availabilityZone = availabilityZone;
        this.dbInstanceIdentifier = dbInstanceIdentifier;
        this.dbSnapshotArn = dbSnapshotArn;
        this.dbSnapshotIdentifier = dbSnapshotIdentifier;
        this.encrypted = encrypted;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.id = id;
        this.includePublic = includePublic;
        this.includeShared = includeShared;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.licenseModel = licenseModel;
        this.mostRecent = mostRecent;
        this.optionGroupName = optionGroupName;
        this.port = port;
        this.snapshotCreateTime = snapshotCreateTime;
        this.snapshotType = snapshotType;
        this.sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier;
        this.sourceRegion = sourceRegion;
        this.status = status;
        this.storageType = storageType;
        this.vpcId = vpcId;
    }

    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
    */
    public Integer allocatedStorage() {
        return this.allocatedStorage;
    }
    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * 
    */
    public String availabilityZone() {
        return this.availabilityZone;
    }
    public Optional<String> dbInstanceIdentifier() {
        return Optional.ofNullable(this.dbInstanceIdentifier);
    }
    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * 
    */
    public String dbSnapshotArn() {
        return this.dbSnapshotArn;
    }
    public Optional<String> dbSnapshotIdentifier() {
        return Optional.ofNullable(this.dbSnapshotIdentifier);
    }
    /**
     * Specifies whether the DB snapshot is encrypted.
     * 
    */
    public Boolean encrypted() {
        return this.encrypted;
    }
    /**
     * Specifies the name of the database engine.
     * 
    */
    public String engine() {
        return this.engine;
    }
    /**
     * Specifies the version of the database engine.
     * 
    */
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> includePublic() {
        return Optional.ofNullable(this.includePublic);
    }
    public Optional<Boolean> includeShared() {
        return Optional.ofNullable(this.includeShared);
    }
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * 
    */
    public Integer iops() {
        return this.iops;
    }
    /**
     * The ARN for the KMS encryption key.
     * 
    */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * License model information for the restored DB instance.
     * 
    */
    public String licenseModel() {
        return this.licenseModel;
    }
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * Provides the option group name for the DB snapshot.
     * 
    */
    public String optionGroupName() {
        return this.optionGroupName;
    }
    public Integer port() {
        return this.port;
    }
    /**
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * 
    */
    public String snapshotCreateTime() {
        return this.snapshotCreateTime;
    }
    public Optional<String> snapshotType() {
        return Optional.ofNullable(this.snapshotType);
    }
    /**
     * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     * 
    */
    public String sourceDbSnapshotIdentifier() {
        return this.sourceDbSnapshotIdentifier;
    }
    /**
     * The region that the DB snapshot was created in or copied from.
     * 
    */
    public String sourceRegion() {
        return this.sourceRegion;
    }
    /**
     * Specifies the status of this DB snapshot.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Specifies the storage type associated with DB snapshot.
     * 
    */
    public String storageType() {
        return this.storageType;
    }
    /**
     * Specifies the ID of the VPC associated with the DB snapshot.
     * 
    */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer allocatedStorage;
        private String availabilityZone;
        private @Nullable String dbInstanceIdentifier;
        private String dbSnapshotArn;
        private @Nullable String dbSnapshotIdentifier;
        private Boolean encrypted;
        private String engine;
        private String engineVersion;
        private String id;
        private @Nullable Boolean includePublic;
        private @Nullable Boolean includeShared;
        private Integer iops;
        private String kmsKeyId;
        private String licenseModel;
        private @Nullable Boolean mostRecent;
        private String optionGroupName;
        private Integer port;
        private String snapshotCreateTime;
        private @Nullable String snapshotType;
        private String sourceDbSnapshotIdentifier;
        private String sourceRegion;
        private String status;
        private String storageType;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedStorage = defaults.allocatedStorage;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.dbInstanceIdentifier = defaults.dbInstanceIdentifier;
    	      this.dbSnapshotArn = defaults.dbSnapshotArn;
    	      this.dbSnapshotIdentifier = defaults.dbSnapshotIdentifier;
    	      this.encrypted = defaults.encrypted;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.includePublic = defaults.includePublic;
    	      this.includeShared = defaults.includeShared;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.licenseModel = defaults.licenseModel;
    	      this.mostRecent = defaults.mostRecent;
    	      this.optionGroupName = defaults.optionGroupName;
    	      this.port = defaults.port;
    	      this.snapshotCreateTime = defaults.snapshotCreateTime;
    	      this.snapshotType = defaults.snapshotType;
    	      this.sourceDbSnapshotIdentifier = defaults.sourceDbSnapshotIdentifier;
    	      this.sourceRegion = defaults.sourceRegion;
    	      this.status = defaults.status;
    	      this.storageType = defaults.storageType;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder allocatedStorage(Integer allocatedStorage) {
            this.allocatedStorage = Objects.requireNonNull(allocatedStorage);
            return this;
        }
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder dbInstanceIdentifier(@Nullable String dbInstanceIdentifier) {
            this.dbInstanceIdentifier = dbInstanceIdentifier;
            return this;
        }
        public Builder dbSnapshotArn(String dbSnapshotArn) {
            this.dbSnapshotArn = Objects.requireNonNull(dbSnapshotArn);
            return this;
        }
        public Builder dbSnapshotIdentifier(@Nullable String dbSnapshotIdentifier) {
            this.dbSnapshotIdentifier = dbSnapshotIdentifier;
            return this;
        }
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder includePublic(@Nullable Boolean includePublic) {
            this.includePublic = includePublic;
            return this;
        }
        public Builder includeShared(@Nullable Boolean includeShared) {
            this.includeShared = includeShared;
            return this;
        }
        public Builder iops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder licenseModel(String licenseModel) {
            this.licenseModel = Objects.requireNonNull(licenseModel);
            return this;
        }
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        public Builder optionGroupName(String optionGroupName) {
            this.optionGroupName = Objects.requireNonNull(optionGroupName);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder snapshotCreateTime(String snapshotCreateTime) {
            this.snapshotCreateTime = Objects.requireNonNull(snapshotCreateTime);
            return this;
        }
        public Builder snapshotType(@Nullable String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public Builder sourceDbSnapshotIdentifier(String sourceDbSnapshotIdentifier) {
            this.sourceDbSnapshotIdentifier = Objects.requireNonNull(sourceDbSnapshotIdentifier);
            return this;
        }
        public Builder sourceRegion(String sourceRegion) {
            this.sourceRegion = Objects.requireNonNull(sourceRegion);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public GetSnapshotResult build() {
            return new GetSnapshotResult(allocatedStorage, availabilityZone, dbInstanceIdentifier, dbSnapshotArn, dbSnapshotIdentifier, encrypted, engine, engineVersion, id, includePublic, includeShared, iops, kmsKeyId, licenseModel, mostRecent, optionGroupName, port, snapshotCreateTime, snapshotType, sourceDbSnapshotIdentifier, sourceRegion, status, storageType, vpcId);
        }
    }
}
