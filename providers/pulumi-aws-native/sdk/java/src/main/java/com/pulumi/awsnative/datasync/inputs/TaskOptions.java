// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

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
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the options that are available to control the behavior of a StartTaskExecution operation.
 * 
 */
public final class TaskOptions extends com.pulumi.resources.InvokeArgs {

    public static final TaskOptions Empty = new TaskOptions();

    /**
     * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to).
     * 
     */
    @Import(name="atime")
      private final @Nullable TaskOptionsAtime atime;

    public Optional<TaskOptionsAtime> atime() {
        return this.atime == null ? Optional.empty() : Optional.ofNullable(this.atime);
    }

    /**
     * A value that limits the bandwidth used by AWS DataSync.
     * 
     */
    @Import(name="bytesPerSecond")
      private final @Nullable Integer bytesPerSecond;

    public Optional<Integer> bytesPerSecond() {
        return this.bytesPerSecond == null ? Optional.empty() : Optional.ofNullable(this.bytesPerSecond);
    }

    /**
     * The group ID (GID) of the file's owners.
     * 
     */
    @Import(name="gid")
      private final @Nullable TaskOptionsGid gid;

    public Optional<TaskOptionsGid> gid() {
        return this.gid == null ? Optional.empty() : Optional.ofNullable(this.gid);
    }

    /**
     * A value that determines the types of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide.
     * 
     */
    @Import(name="logLevel")
      private final @Nullable TaskOptionsLogLevel logLevel;

    public Optional<TaskOptionsLogLevel> logLevel() {
        return this.logLevel == null ? Optional.empty() : Optional.ofNullable(this.logLevel);
    }

    /**
     * A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.
     * 
     */
    @Import(name="mtime")
      private final @Nullable TaskOptionsMtime mtime;

    public Optional<TaskOptionsMtime> mtime() {
        return this.mtime == null ? Optional.empty() : Optional.ofNullable(this.mtime);
    }

    /**
     * A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * 
     */
    @Import(name="overwriteMode")
      private final @Nullable TaskOptionsOverwriteMode overwriteMode;

    public Optional<TaskOptionsOverwriteMode> overwriteMode() {
        return this.overwriteMode == null ? Optional.empty() : Optional.ofNullable(this.overwriteMode);
    }

    /**
     * A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.
     * 
     */
    @Import(name="posixPermissions")
      private final @Nullable TaskOptionsPosixPermissions posixPermissions;

    public Optional<TaskOptionsPosixPermissions> posixPermissions() {
        return this.posixPermissions == null ? Optional.empty() : Optional.ofNullable(this.posixPermissions);
    }

    /**
     * A value that specifies whether files in the destination that don't exist in the source file system should be preserved.
     * 
     */
    @Import(name="preserveDeletedFiles")
      private final @Nullable TaskOptionsPreserveDeletedFiles preserveDeletedFiles;

    public Optional<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles() {
        return this.preserveDeletedFiles == null ? Optional.empty() : Optional.ofNullable(this.preserveDeletedFiles);
    }

    /**
     * A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.
     * 
     */
    @Import(name="preserveDevices")
      private final @Nullable TaskOptionsPreserveDevices preserveDevices;

    public Optional<TaskOptionsPreserveDevices> preserveDevices() {
        return this.preserveDevices == null ? Optional.empty() : Optional.ofNullable(this.preserveDevices);
    }

    /**
     * A value that determines which components of the SMB security descriptor are copied during transfer.
     * 
     */
    @Import(name="securityDescriptorCopyFlags")
      private final @Nullable TaskOptionsSecurityDescriptorCopyFlags securityDescriptorCopyFlags;

    public Optional<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags() {
        return this.securityDescriptorCopyFlags == null ? Optional.empty() : Optional.ofNullable(this.securityDescriptorCopyFlags);
    }

    /**
     * A value that determines whether tasks should be queued before executing the tasks.
     * 
     */
    @Import(name="taskQueueing")
      private final @Nullable TaskOptionsTaskQueueing taskQueueing;

    public Optional<TaskOptionsTaskQueueing> taskQueueing() {
        return this.taskQueueing == null ? Optional.empty() : Optional.ofNullable(this.taskQueueing);
    }

    /**
     * A value that determines whether DataSync transfers only the data and metadata that differ between the source and the destination location, or whether DataSync transfers all the content from the source, without comparing to the destination location.
     * 
     */
    @Import(name="transferMode")
      private final @Nullable TaskOptionsTransferMode transferMode;

    public Optional<TaskOptionsTransferMode> transferMode() {
        return this.transferMode == null ? Optional.empty() : Optional.ofNullable(this.transferMode);
    }

    /**
     * The user ID (UID) of the file's owner.
     * 
     */
    @Import(name="uid")
      private final @Nullable TaskOptionsUid uid;

    public Optional<TaskOptionsUid> uid() {
        return this.uid == null ? Optional.empty() : Optional.ofNullable(this.uid);
    }

    /**
     * A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.
     * 
     */
    @Import(name="verifyMode")
      private final @Nullable TaskOptionsVerifyMode verifyMode;

    public Optional<TaskOptionsVerifyMode> verifyMode() {
        return this.verifyMode == null ? Optional.empty() : Optional.ofNullable(this.verifyMode);
    }

    public TaskOptions(
        @Nullable TaskOptionsAtime atime,
        @Nullable Integer bytesPerSecond,
        @Nullable TaskOptionsGid gid,
        @Nullable TaskOptionsLogLevel logLevel,
        @Nullable TaskOptionsMtime mtime,
        @Nullable TaskOptionsOverwriteMode overwriteMode,
        @Nullable TaskOptionsPosixPermissions posixPermissions,
        @Nullable TaskOptionsPreserveDeletedFiles preserveDeletedFiles,
        @Nullable TaskOptionsPreserveDevices preserveDevices,
        @Nullable TaskOptionsSecurityDescriptorCopyFlags securityDescriptorCopyFlags,
        @Nullable TaskOptionsTaskQueueing taskQueueing,
        @Nullable TaskOptionsTransferMode transferMode,
        @Nullable TaskOptionsUid uid,
        @Nullable TaskOptionsVerifyMode verifyMode) {
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

    private TaskOptions() {
        this.atime = null;
        this.bytesPerSecond = null;
        this.gid = null;
        this.logLevel = null;
        this.mtime = null;
        this.overwriteMode = null;
        this.posixPermissions = null;
        this.preserveDeletedFiles = null;
        this.preserveDevices = null;
        this.securityDescriptorCopyFlags = null;
        this.taskQueueing = null;
        this.transferMode = null;
        this.uid = null;
        this.verifyMode = null;
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
