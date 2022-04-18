// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.outputs;

import com.pulumi.awsnative.datasync.enums.TaskOptionsAtime;
import com.pulumi.awsnative.datasync.enums.TaskOptionsGid;
import com.pulumi.awsnative.datasync.enums.TaskOptionsLogLevel;
import com.pulumi.awsnative.datasync.enums.TaskOptionsMtime;
import com.pulumi.awsnative.datasync.enums.TaskOptionsOverwriteMode;
import com.pulumi.awsnative.datasync.enums.TaskOptionsPosixPermissions;
import com.pulumi.awsnative.datasync.enums.TaskOptionsPreserveDeletedFiles;
import com.pulumi.awsnative.datasync.enums.TaskOptionsPreserveDevices;
import com.pulumi.awsnative.datasync.enums.TaskOptionsSecurityDescriptorCopyFlags;
import com.pulumi.awsnative.datasync.enums.TaskOptionsTaskQueueing;
import com.pulumi.awsnative.datasync.enums.TaskOptionsTransferMode;
import com.pulumi.awsnative.datasync.enums.TaskOptionsUid;
import com.pulumi.awsnative.datasync.enums.TaskOptionsVerifyMode;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskOptions {
    /**
     * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to).
     * 
     */
    private final @Nullable TaskOptionsAtime atime;
    /**
     * A value that limits the bandwidth used by AWS DataSync.
     * 
     */
    private final @Nullable Integer bytesPerSecond;
    /**
     * The group ID (GID) of the file's owners.
     * 
     */
    private final @Nullable TaskOptionsGid gid;
    /**
     * A value that determines the types of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide.
     * 
     */
    private final @Nullable TaskOptionsLogLevel logLevel;
    /**
     * A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.
     * 
     */
    private final @Nullable TaskOptionsMtime mtime;
    /**
     * A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * 
     */
    private final @Nullable TaskOptionsOverwriteMode overwriteMode;
    /**
     * A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.
     * 
     */
    private final @Nullable TaskOptionsPosixPermissions posixPermissions;
    /**
     * A value that specifies whether files in the destination that don't exist in the source file system should be preserved.
     * 
     */
    private final @Nullable TaskOptionsPreserveDeletedFiles preserveDeletedFiles;
    /**
     * A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.
     * 
     */
    private final @Nullable TaskOptionsPreserveDevices preserveDevices;
    /**
     * A value that determines which components of the SMB security descriptor are copied during transfer.
     * 
     */
    private final @Nullable TaskOptionsSecurityDescriptorCopyFlags securityDescriptorCopyFlags;
    /**
     * A value that determines whether tasks should be queued before executing the tasks.
     * 
     */
    private final @Nullable TaskOptionsTaskQueueing taskQueueing;
    /**
     * A value that determines whether DataSync transfers only the data and metadata that differ between the source and the destination location, or whether DataSync transfers all the content from the source, without comparing to the destination location.
     * 
     */
    private final @Nullable TaskOptionsTransferMode transferMode;
    /**
     * The user ID (UID) of the file's owner.
     * 
     */
    private final @Nullable TaskOptionsUid uid;
    /**
     * A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.
     * 
     */
    private final @Nullable TaskOptionsVerifyMode verifyMode;

    @CustomType.Constructor
    private TaskOptions(
        @CustomType.Parameter("atime") @Nullable TaskOptionsAtime atime,
        @CustomType.Parameter("bytesPerSecond") @Nullable Integer bytesPerSecond,
        @CustomType.Parameter("gid") @Nullable TaskOptionsGid gid,
        @CustomType.Parameter("logLevel") @Nullable TaskOptionsLogLevel logLevel,
        @CustomType.Parameter("mtime") @Nullable TaskOptionsMtime mtime,
        @CustomType.Parameter("overwriteMode") @Nullable TaskOptionsOverwriteMode overwriteMode,
        @CustomType.Parameter("posixPermissions") @Nullable TaskOptionsPosixPermissions posixPermissions,
        @CustomType.Parameter("preserveDeletedFiles") @Nullable TaskOptionsPreserveDeletedFiles preserveDeletedFiles,
        @CustomType.Parameter("preserveDevices") @Nullable TaskOptionsPreserveDevices preserveDevices,
        @CustomType.Parameter("securityDescriptorCopyFlags") @Nullable TaskOptionsSecurityDescriptorCopyFlags securityDescriptorCopyFlags,
        @CustomType.Parameter("taskQueueing") @Nullable TaskOptionsTaskQueueing taskQueueing,
        @CustomType.Parameter("transferMode") @Nullable TaskOptionsTransferMode transferMode,
        @CustomType.Parameter("uid") @Nullable TaskOptionsUid uid,
        @CustomType.Parameter("verifyMode") @Nullable TaskOptionsVerifyMode verifyMode) {
        this.atime = atime;
        this.bytesPerSecond = bytesPerSecond;
        this.gid = gid;
        this.logLevel = logLevel;
        this.mtime = mtime;
        this.overwriteMode = overwriteMode;
        this.posixPermissions = posixPermissions;
        this.preserveDeletedFiles = preserveDeletedFiles;
        this.preserveDevices = preserveDevices;
        this.securityDescriptorCopyFlags = securityDescriptorCopyFlags;
        this.taskQueueing = taskQueueing;
        this.transferMode = transferMode;
        this.uid = uid;
        this.verifyMode = verifyMode;
    }

    /**
     * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to).
     * 
    */
    public Optional<TaskOptionsAtime> atime() {
        return Optional.ofNullable(this.atime);
    }
    /**
     * A value that limits the bandwidth used by AWS DataSync.
     * 
    */
    public Optional<Integer> bytesPerSecond() {
        return Optional.ofNullable(this.bytesPerSecond);
    }
    /**
     * The group ID (GID) of the file's owners.
     * 
    */
    public Optional<TaskOptionsGid> gid() {
        return Optional.ofNullable(this.gid);
    }
    /**
     * A value that determines the types of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide.
     * 
    */
    public Optional<TaskOptionsLogLevel> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }
    /**
     * A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.
     * 
    */
    public Optional<TaskOptionsMtime> mtime() {
        return Optional.ofNullable(this.mtime);
    }
    /**
     * A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * 
    */
    public Optional<TaskOptionsOverwriteMode> overwriteMode() {
        return Optional.ofNullable(this.overwriteMode);
    }
    /**
     * A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.
     * 
    */
    public Optional<TaskOptionsPosixPermissions> posixPermissions() {
        return Optional.ofNullable(this.posixPermissions);
    }
    /**
     * A value that specifies whether files in the destination that don't exist in the source file system should be preserved.
     * 
    */
    public Optional<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles() {
        return Optional.ofNullable(this.preserveDeletedFiles);
    }
    /**
     * A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.
     * 
    */
    public Optional<TaskOptionsPreserveDevices> preserveDevices() {
        return Optional.ofNullable(this.preserveDevices);
    }
    /**
     * A value that determines which components of the SMB security descriptor are copied during transfer.
     * 
    */
    public Optional<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags() {
        return Optional.ofNullable(this.securityDescriptorCopyFlags);
    }
    /**
     * A value that determines whether tasks should be queued before executing the tasks.
     * 
    */
    public Optional<TaskOptionsTaskQueueing> taskQueueing() {
        return Optional.ofNullable(this.taskQueueing);
    }
    /**
     * A value that determines whether DataSync transfers only the data and metadata that differ between the source and the destination location, or whether DataSync transfers all the content from the source, without comparing to the destination location.
     * 
    */
    public Optional<TaskOptionsTransferMode> transferMode() {
        return Optional.ofNullable(this.transferMode);
    }
    /**
     * The user ID (UID) of the file's owner.
     * 
    */
    public Optional<TaskOptionsUid> uid() {
        return Optional.ofNullable(this.uid);
    }
    /**
     * A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.
     * 
    */
    public Optional<TaskOptionsVerifyMode> verifyMode() {
        return Optional.ofNullable(this.verifyMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskOptionsAtime atime;
        private @Nullable Integer bytesPerSecond;
        private @Nullable TaskOptionsGid gid;
        private @Nullable TaskOptionsLogLevel logLevel;
        private @Nullable TaskOptionsMtime mtime;
        private @Nullable TaskOptionsOverwriteMode overwriteMode;
        private @Nullable TaskOptionsPosixPermissions posixPermissions;
        private @Nullable TaskOptionsPreserveDeletedFiles preserveDeletedFiles;
        private @Nullable TaskOptionsPreserveDevices preserveDevices;
        private @Nullable TaskOptionsSecurityDescriptorCopyFlags securityDescriptorCopyFlags;
        private @Nullable TaskOptionsTaskQueueing taskQueueing;
        private @Nullable TaskOptionsTransferMode transferMode;
        private @Nullable TaskOptionsUid uid;
        private @Nullable TaskOptionsVerifyMode verifyMode;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atime = defaults.atime;
    	      this.bytesPerSecond = defaults.bytesPerSecond;
    	      this.gid = defaults.gid;
    	      this.logLevel = defaults.logLevel;
    	      this.mtime = defaults.mtime;
    	      this.overwriteMode = defaults.overwriteMode;
    	      this.posixPermissions = defaults.posixPermissions;
    	      this.preserveDeletedFiles = defaults.preserveDeletedFiles;
    	      this.preserveDevices = defaults.preserveDevices;
    	      this.securityDescriptorCopyFlags = defaults.securityDescriptorCopyFlags;
    	      this.taskQueueing = defaults.taskQueueing;
    	      this.transferMode = defaults.transferMode;
    	      this.uid = defaults.uid;
    	      this.verifyMode = defaults.verifyMode;
        }

        public Builder atime(@Nullable TaskOptionsAtime atime) {
            this.atime = atime;
            return this;
        }
        public Builder bytesPerSecond(@Nullable Integer bytesPerSecond) {
            this.bytesPerSecond = bytesPerSecond;
            return this;
        }
        public Builder gid(@Nullable TaskOptionsGid gid) {
            this.gid = gid;
            return this;
        }
        public Builder logLevel(@Nullable TaskOptionsLogLevel logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public Builder mtime(@Nullable TaskOptionsMtime mtime) {
            this.mtime = mtime;
            return this;
        }
        public Builder overwriteMode(@Nullable TaskOptionsOverwriteMode overwriteMode) {
            this.overwriteMode = overwriteMode;
            return this;
        }
        public Builder posixPermissions(@Nullable TaskOptionsPosixPermissions posixPermissions) {
            this.posixPermissions = posixPermissions;
            return this;
        }
        public Builder preserveDeletedFiles(@Nullable TaskOptionsPreserveDeletedFiles preserveDeletedFiles) {
            this.preserveDeletedFiles = preserveDeletedFiles;
            return this;
        }
        public Builder preserveDevices(@Nullable TaskOptionsPreserveDevices preserveDevices) {
            this.preserveDevices = preserveDevices;
            return this;
        }
        public Builder securityDescriptorCopyFlags(@Nullable TaskOptionsSecurityDescriptorCopyFlags securityDescriptorCopyFlags) {
            this.securityDescriptorCopyFlags = securityDescriptorCopyFlags;
            return this;
        }
        public Builder taskQueueing(@Nullable TaskOptionsTaskQueueing taskQueueing) {
            this.taskQueueing = taskQueueing;
            return this;
        }
        public Builder transferMode(@Nullable TaskOptionsTransferMode transferMode) {
            this.transferMode = transferMode;
            return this;
        }
        public Builder uid(@Nullable TaskOptionsUid uid) {
            this.uid = uid;
            return this;
        }
        public Builder verifyMode(@Nullable TaskOptionsVerifyMode verifyMode) {
            this.verifyMode = verifyMode;
            return this;
        }        public TaskOptions build() {
            return new TaskOptions(atime, bytesPerSecond, gid, logLevel, mtime, overwriteMode, posixPermissions, preserveDeletedFiles, preserveDevices, securityDescriptorCopyFlags, taskQueueing, transferMode, uid, verifyMode);
        }
    }
}
