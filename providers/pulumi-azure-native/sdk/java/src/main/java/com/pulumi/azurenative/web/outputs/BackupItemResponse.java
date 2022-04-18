// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.DatabaseBackupSettingResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupItemResponse {
    /**
     * Id of the backup.
     * 
     */
    private final Integer backupId;
    /**
     * Name of the blob which contains data for this backup.
     * 
     */
    private final String blobName;
    /**
     * Unique correlation identifier. Please use this along with the timestamp while communicating with Azure support.
     * 
     */
    private final String correlationId;
    /**
     * Timestamp of the backup creation.
     * 
     */
    private final String created;
    /**
     * List of databases included in the backup.
     * 
     */
    private final List<DatabaseBackupSettingResponse> databases;
    /**
     * Timestamp when this backup finished.
     * 
     */
    private final String finishedTimeStamp;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Timestamp of a last restore operation which used this backup.
     * 
     */
    private final String lastRestoreTimeStamp;
    /**
     * Details regarding this backup. Might contain an error message.
     * 
     */
    private final String log;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * True if this backup has been created due to a schedule being triggered.
     * 
     */
    private final Boolean scheduled;
    /**
     * Size of the backup in bytes.
     * 
     */
    private final Double sizeInBytes;
    /**
     * Backup status.
     * 
     */
    private final String status;
    /**
     * SAS URL for the storage account container which contains this backup.
     * 
     */
    private final String storageAccountUrl;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Size of the original web app which has been backed up.
     * 
     */
    private final Double websiteSizeInBytes;

    @CustomType.Constructor
    private BackupItemResponse(
        @CustomType.Parameter("backupId") Integer backupId,
        @CustomType.Parameter("blobName") String blobName,
        @CustomType.Parameter("correlationId") String correlationId,
        @CustomType.Parameter("created") String created,
        @CustomType.Parameter("databases") List<DatabaseBackupSettingResponse> databases,
        @CustomType.Parameter("finishedTimeStamp") String finishedTimeStamp,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("lastRestoreTimeStamp") String lastRestoreTimeStamp,
        @CustomType.Parameter("log") String log,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("scheduled") Boolean scheduled,
        @CustomType.Parameter("sizeInBytes") Double sizeInBytes,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("storageAccountUrl") String storageAccountUrl,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("websiteSizeInBytes") Double websiteSizeInBytes) {
        this.backupId = backupId;
        this.blobName = blobName;
        this.correlationId = correlationId;
        this.created = created;
        this.databases = databases;
        this.finishedTimeStamp = finishedTimeStamp;
        this.id = id;
        this.kind = kind;
        this.lastRestoreTimeStamp = lastRestoreTimeStamp;
        this.log = log;
        this.name = name;
        this.scheduled = scheduled;
        this.sizeInBytes = sizeInBytes;
        this.status = status;
        this.storageAccountUrl = storageAccountUrl;
        this.type = type;
        this.websiteSizeInBytes = websiteSizeInBytes;
    }

    /**
     * Id of the backup.
     * 
    */
    public Integer backupId() {
        return this.backupId;
    }
    /**
     * Name of the blob which contains data for this backup.
     * 
    */
    public String blobName() {
        return this.blobName;
    }
    /**
     * Unique correlation identifier. Please use this along with the timestamp while communicating with Azure support.
     * 
    */
    public String correlationId() {
        return this.correlationId;
    }
    /**
     * Timestamp of the backup creation.
     * 
    */
    public String created() {
        return this.created;
    }
    /**
     * List of databases included in the backup.
     * 
    */
    public List<DatabaseBackupSettingResponse> databases() {
        return this.databases;
    }
    /**
     * Timestamp when this backup finished.
     * 
    */
    public String finishedTimeStamp() {
        return this.finishedTimeStamp;
    }
    /**
     * Resource Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Timestamp of a last restore operation which used this backup.
     * 
    */
    public String lastRestoreTimeStamp() {
        return this.lastRestoreTimeStamp;
    }
    /**
     * Details regarding this backup. Might contain an error message.
     * 
    */
    public String log() {
        return this.log;
    }
    /**
     * Resource Name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * True if this backup has been created due to a schedule being triggered.
     * 
    */
    public Boolean scheduled() {
        return this.scheduled;
    }
    /**
     * Size of the backup in bytes.
     * 
    */
    public Double sizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * Backup status.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * SAS URL for the storage account container which contains this backup.
     * 
    */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Size of the original web app which has been backed up.
     * 
    */
    public Double websiteSizeInBytes() {
        return this.websiteSizeInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backupId;
        private String blobName;
        private String correlationId;
        private String created;
        private List<DatabaseBackupSettingResponse> databases;
        private String finishedTimeStamp;
        private String id;
        private @Nullable String kind;
        private String lastRestoreTimeStamp;
        private String log;
        private String name;
        private Boolean scheduled;
        private Double sizeInBytes;
        private String status;
        private String storageAccountUrl;
        private String type;
        private Double websiteSizeInBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.blobName = defaults.blobName;
    	      this.correlationId = defaults.correlationId;
    	      this.created = defaults.created;
    	      this.databases = defaults.databases;
    	      this.finishedTimeStamp = defaults.finishedTimeStamp;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastRestoreTimeStamp = defaults.lastRestoreTimeStamp;
    	      this.log = defaults.log;
    	      this.name = defaults.name;
    	      this.scheduled = defaults.scheduled;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.status = defaults.status;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
    	      this.type = defaults.type;
    	      this.websiteSizeInBytes = defaults.websiteSizeInBytes;
        }

        public Builder backupId(Integer backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }
        public Builder blobName(String blobName) {
            this.blobName = Objects.requireNonNull(blobName);
            return this;
        }
        public Builder correlationId(String correlationId) {
            this.correlationId = Objects.requireNonNull(correlationId);
            return this;
        }
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        public Builder databases(List<DatabaseBackupSettingResponse> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }
        public Builder databases(DatabaseBackupSettingResponse... databases) {
            return databases(List.of(databases));
        }
        public Builder finishedTimeStamp(String finishedTimeStamp) {
            this.finishedTimeStamp = Objects.requireNonNull(finishedTimeStamp);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder lastRestoreTimeStamp(String lastRestoreTimeStamp) {
            this.lastRestoreTimeStamp = Objects.requireNonNull(lastRestoreTimeStamp);
            return this;
        }
        public Builder log(String log) {
            this.log = Objects.requireNonNull(log);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder scheduled(Boolean scheduled) {
            this.scheduled = Objects.requireNonNull(scheduled);
            return this;
        }
        public Builder sizeInBytes(Double sizeInBytes) {
            this.sizeInBytes = Objects.requireNonNull(sizeInBytes);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder storageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder websiteSizeInBytes(Double websiteSizeInBytes) {
            this.websiteSizeInBytes = Objects.requireNonNull(websiteSizeInBytes);
            return this;
        }        public BackupItemResponse build() {
            return new BackupItemResponse(backupId, blobName, correlationId, created, databases, finishedTimeStamp, id, kind, lastRestoreTimeStamp, log, name, scheduled, sizeInBytes, status, storageAccountUrl, type, websiteSizeInBytes);
        }
    }
}
