// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.DiskEncryptionConfigurationResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.DiskEncryptionStatusResponse;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.OperationErrorResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBackupRunResult {
    /**
     * Specifies the kind of backup, PHYSICAL or DEFAULT_SNAPSHOT.
     * 
     */
    private final String backupKind;
    /**
     * The description of this run, only applicable to on-demand backups.
     * 
     */
    private final String description;
    /**
     * Encryption configuration specific to a backup.
     * 
     */
    private final DiskEncryptionConfigurationResponse diskEncryptionConfiguration;
    /**
     * Encryption status specific to a backup.
     * 
     */
    private final DiskEncryptionStatusResponse diskEncryptionStatus;
    /**
     * The time the backup operation completed in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    private final String endTime;
    /**
     * The time the run was enqueued in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    private final String enqueuedTime;
    /**
     * Information about why the backup operation failed. This is only present if the run has the FAILED status.
     * 
     */
    private final OperationErrorResponse error;
    /**
     * Name of the database instance.
     * 
     */
    private final String instance;
    /**
     * This is always `sql#backupRun`.
     * 
     */
    private final String kind;
    /**
     * Location of the backups.
     * 
     */
    private final String location;
    /**
     * The URI of this resource.
     * 
     */
    private final String selfLink;
    /**
     * The time the backup operation actually started in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    private final String startTime;
    /**
     * The status of this run.
     * 
     */
    private final String status;
    /**
     * The type of this run; can be either "AUTOMATED" or "ON_DEMAND". This field defaults to "ON_DEMAND" and is ignored, when specified for insert requests.
     * 
     */
    private final String type;
    /**
     * The start time of the backup window during which this the backup was attempted in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    private final String windowStartTime;

    @OutputCustomType.Constructor
    private GetBackupRunResult(
        @OutputCustomType.Parameter("backupKind") String backupKind,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("diskEncryptionConfiguration") DiskEncryptionConfigurationResponse diskEncryptionConfiguration,
        @OutputCustomType.Parameter("diskEncryptionStatus") DiskEncryptionStatusResponse diskEncryptionStatus,
        @OutputCustomType.Parameter("endTime") String endTime,
        @OutputCustomType.Parameter("enqueuedTime") String enqueuedTime,
        @OutputCustomType.Parameter("error") OperationErrorResponse error,
        @OutputCustomType.Parameter("instance") String instance,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("startTime") String startTime,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("windowStartTime") String windowStartTime) {
        this.backupKind = backupKind;
        this.description = description;
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        this.diskEncryptionStatus = diskEncryptionStatus;
        this.endTime = endTime;
        this.enqueuedTime = enqueuedTime;
        this.error = error;
        this.instance = instance;
        this.kind = kind;
        this.location = location;
        this.selfLink = selfLink;
        this.startTime = startTime;
        this.status = status;
        this.type = type;
        this.windowStartTime = windowStartTime;
    }

    /**
     * Specifies the kind of backup, PHYSICAL or DEFAULT_SNAPSHOT.
     * 
    */
    public String getBackupKind() {
        return this.backupKind;
    }
    /**
     * The description of this run, only applicable to on-demand backups.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Encryption configuration specific to a backup.
     * 
    */
    public DiskEncryptionConfigurationResponse getDiskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration;
    }
    /**
     * Encryption status specific to a backup.
     * 
    */
    public DiskEncryptionStatusResponse getDiskEncryptionStatus() {
        return this.diskEncryptionStatus;
    }
    /**
     * The time the backup operation completed in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * The time the run was enqueued in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
    */
    public String getEnqueuedTime() {
        return this.enqueuedTime;
    }
    /**
     * Information about why the backup operation failed. This is only present if the run has the FAILED status.
     * 
    */
    public OperationErrorResponse getError() {
        return this.error;
    }
    /**
     * Name of the database instance.
     * 
    */
    public String getInstance() {
        return this.instance;
    }
    /**
     * This is always `sql#backupRun`.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Location of the backups.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The URI of this resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The time the backup operation actually started in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The status of this run.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The type of this run; can be either "AUTOMATED" or "ON_DEMAND". This field defaults to "ON_DEMAND" and is ignored, when specified for insert requests.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The start time of the backup window during which this the backup was attempted in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
    */
    public String getWindowStartTime() {
        return this.windowStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupRunResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupKind;
        private String description;
        private DiskEncryptionConfigurationResponse diskEncryptionConfiguration;
        private DiskEncryptionStatusResponse diskEncryptionStatus;
        private String endTime;
        private String enqueuedTime;
        private OperationErrorResponse error;
        private String instance;
        private String kind;
        private String location;
        private String selfLink;
        private String startTime;
        private String status;
        private String type;
        private String windowStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupRunResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupKind = defaults.backupKind;
    	      this.description = defaults.description;
    	      this.diskEncryptionConfiguration = defaults.diskEncryptionConfiguration;
    	      this.diskEncryptionStatus = defaults.diskEncryptionStatus;
    	      this.endTime = defaults.endTime;
    	      this.enqueuedTime = defaults.enqueuedTime;
    	      this.error = defaults.error;
    	      this.instance = defaults.instance;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.selfLink = defaults.selfLink;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.windowStartTime = defaults.windowStartTime;
        }

        public Builder setBackupKind(String backupKind) {
            this.backupKind = Objects.requireNonNull(backupKind);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDiskEncryptionConfiguration(DiskEncryptionConfigurationResponse diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = Objects.requireNonNull(diskEncryptionConfiguration);
            return this;
        }

        public Builder setDiskEncryptionStatus(DiskEncryptionStatusResponse diskEncryptionStatus) {
            this.diskEncryptionStatus = Objects.requireNonNull(diskEncryptionStatus);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setEnqueuedTime(String enqueuedTime) {
            this.enqueuedTime = Objects.requireNonNull(enqueuedTime);
            return this;
        }

        public Builder setError(OperationErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWindowStartTime(String windowStartTime) {
            this.windowStartTime = Objects.requireNonNull(windowStartTime);
            return this;
        }
        public GetBackupRunResult build() {
            return new GetBackupRunResult(backupKind, description, diskEncryptionConfiguration, diskEncryptionStatus, endTime, enqueuedTime, error, instance, kind, location, selfLink, startTime, status, type, windowStartTime);
        }
    }
}
