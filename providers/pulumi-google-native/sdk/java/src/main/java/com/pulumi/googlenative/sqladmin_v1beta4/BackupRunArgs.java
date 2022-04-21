// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1beta4.enums.BackupRunBackupKind;
import com.pulumi.googlenative.sqladmin_v1beta4.enums.BackupRunStatus;
import com.pulumi.googlenative.sqladmin_v1beta4.enums.BackupRunType;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.DiskEncryptionConfigurationArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.DiskEncryptionStatusArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.OperationErrorArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupRunArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupRunArgs Empty = new BackupRunArgs();

    /**
     * Specifies the kind of backup, PHYSICAL or DEFAULT_SNAPSHOT.
     * 
     */
    @Import(name="backupKind")
    private @Nullable Output<BackupRunBackupKind> backupKind;

    public Optional<Output<BackupRunBackupKind>> backupKind() {
        return Optional.ofNullable(this.backupKind);
    }

    /**
     * The description of this run, only applicable to on-demand backups.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Encryption configuration specific to a backup.
     * 
     */
    @Import(name="diskEncryptionConfiguration")
    private @Nullable Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;

    public Optional<Output<DiskEncryptionConfigurationArgs>> diskEncryptionConfiguration() {
        return Optional.ofNullable(this.diskEncryptionConfiguration);
    }

    /**
     * Encryption status specific to a backup.
     * 
     */
    @Import(name="diskEncryptionStatus")
    private @Nullable Output<DiskEncryptionStatusArgs> diskEncryptionStatus;

    public Optional<Output<DiskEncryptionStatusArgs>> diskEncryptionStatus() {
        return Optional.ofNullable(this.diskEncryptionStatus);
    }

    /**
     * The time the backup operation completed in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The time the run was enqueued in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="enqueuedTime")
    private @Nullable Output<String> enqueuedTime;

    public Optional<Output<String>> enqueuedTime() {
        return Optional.ofNullable(this.enqueuedTime);
    }

    /**
     * Information about why the backup operation failed. This is only present if the run has the FAILED status.
     * 
     */
    @Import(name="error")
    private @Nullable Output<OperationErrorArgs> error;

    public Optional<Output<OperationErrorArgs>> error() {
        return Optional.ofNullable(this.error);
    }

    /**
     * The identifier for this backup run. Unique only for a specific Cloud SQL instance.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the database instance.
     * 
     */
    @Import(name="instance", required=true)
    private Output<String> instance;

    public Output<String> instance() {
        return this.instance;
    }

    /**
     * This is always `sql#backupRun`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Location of the backups.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The URI of this resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * The time the backup operation actually started in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The status of this run.
     * 
     */
    @Import(name="status")
    private @Nullable Output<BackupRunStatus> status;

    public Optional<Output<BackupRunStatus>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The type of this run; can be either &#34;AUTOMATED&#34; or &#34;ON_DEMAND&#34;. This field defaults to &#34;ON_DEMAND&#34; and is ignored, when specified for insert requests.
     * 
     */
    @Import(name="type")
    private @Nullable Output<BackupRunType> type;

    public Optional<Output<BackupRunType>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The start time of the backup window during which this the backup was attempted in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="windowStartTime")
    private @Nullable Output<String> windowStartTime;

    public Optional<Output<String>> windowStartTime() {
        return Optional.ofNullable(this.windowStartTime);
    }

    private BackupRunArgs() {}

    private BackupRunArgs(BackupRunArgs $) {
        this.backupKind = $.backupKind;
        this.description = $.description;
        this.diskEncryptionConfiguration = $.diskEncryptionConfiguration;
        this.diskEncryptionStatus = $.diskEncryptionStatus;
        this.endTime = $.endTime;
        this.enqueuedTime = $.enqueuedTime;
        this.error = $.error;
        this.id = $.id;
        this.instance = $.instance;
        this.kind = $.kind;
        this.location = $.location;
        this.project = $.project;
        this.selfLink = $.selfLink;
        this.startTime = $.startTime;
        this.status = $.status;
        this.type = $.type;
        this.windowStartTime = $.windowStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupRunArgs $;

        public Builder() {
            $ = new BackupRunArgs();
        }

        public Builder(BackupRunArgs defaults) {
            $ = new BackupRunArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupKind(@Nullable Output<BackupRunBackupKind> backupKind) {
            $.backupKind = backupKind;
            return this;
        }

        public Builder backupKind(BackupRunBackupKind backupKind) {
            return backupKind(Output.of(backupKind));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder diskEncryptionConfiguration(@Nullable Output<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration) {
            $.diskEncryptionConfiguration = diskEncryptionConfiguration;
            return this;
        }

        public Builder diskEncryptionConfiguration(DiskEncryptionConfigurationArgs diskEncryptionConfiguration) {
            return diskEncryptionConfiguration(Output.of(diskEncryptionConfiguration));
        }

        public Builder diskEncryptionStatus(@Nullable Output<DiskEncryptionStatusArgs> diskEncryptionStatus) {
            $.diskEncryptionStatus = diskEncryptionStatus;
            return this;
        }

        public Builder diskEncryptionStatus(DiskEncryptionStatusArgs diskEncryptionStatus) {
            return diskEncryptionStatus(Output.of(diskEncryptionStatus));
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        public Builder enqueuedTime(@Nullable Output<String> enqueuedTime) {
            $.enqueuedTime = enqueuedTime;
            return this;
        }

        public Builder enqueuedTime(String enqueuedTime) {
            return enqueuedTime(Output.of(enqueuedTime));
        }

        public Builder error(@Nullable Output<OperationErrorArgs> error) {
            $.error = error;
            return this;
        }

        public Builder error(OperationErrorArgs error) {
            return error(Output.of(error));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder instance(Output<String> instance) {
            $.instance = instance;
            return this;
        }

        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public Builder status(@Nullable Output<BackupRunStatus> status) {
            $.status = status;
            return this;
        }

        public Builder status(BackupRunStatus status) {
            return status(Output.of(status));
        }

        public Builder type(@Nullable Output<BackupRunType> type) {
            $.type = type;
            return this;
        }

        public Builder type(BackupRunType type) {
            return type(Output.of(type));
        }

        public Builder windowStartTime(@Nullable Output<String> windowStartTime) {
            $.windowStartTime = windowStartTime;
            return this;
        }

        public Builder windowStartTime(String windowStartTime) {
            return windowStartTime(Output.of(windowStartTime));
        }

        public BackupRunArgs build() {
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            return $;
        }
    }

}
