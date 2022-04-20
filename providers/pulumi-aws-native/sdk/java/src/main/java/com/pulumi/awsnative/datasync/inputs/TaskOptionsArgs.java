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
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the options that are available to control the behavior of a StartTaskExecution operation.
 * 
 */
public final class TaskOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskOptionsArgs Empty = new TaskOptionsArgs();

    /**
     * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to).
     * 
     */
    @Import(name="atime")
      private final @Nullable Output<TaskOptionsAtime> atime;

    public Output<TaskOptionsAtime> atime() {
        return this.atime == null ? Codegen.empty() : this.atime;
    }

    /**
     * A value that limits the bandwidth used by AWS DataSync.
     * 
     */
    @Import(name="bytesPerSecond")
      private final @Nullable Output<Integer> bytesPerSecond;

    public Output<Integer> bytesPerSecond() {
        return this.bytesPerSecond == null ? Codegen.empty() : this.bytesPerSecond;
    }

    /**
     * The group ID (GID) of the file&#39;s owners.
     * 
     */
    @Import(name="gid")
      private final @Nullable Output<TaskOptionsGid> gid;

    public Output<TaskOptionsGid> gid() {
        return this.gid == null ? Codegen.empty() : this.gid;
    }

    /**
     * A value that determines the types of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide.
     * 
     */
    @Import(name="logLevel")
      private final @Nullable Output<TaskOptionsLogLevel> logLevel;

    public Output<TaskOptionsLogLevel> logLevel() {
        return this.logLevel == null ? Codegen.empty() : this.logLevel;
    }

    /**
     * A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.
     * 
     */
    @Import(name="mtime")
      private final @Nullable Output<TaskOptionsMtime> mtime;

    public Output<TaskOptionsMtime> mtime() {
        return this.mtime == null ? Codegen.empty() : this.mtime;
    }

    /**
     * A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * 
     */
    @Import(name="overwriteMode")
      private final @Nullable Output<TaskOptionsOverwriteMode> overwriteMode;

    public Output<TaskOptionsOverwriteMode> overwriteMode() {
        return this.overwriteMode == null ? Codegen.empty() : this.overwriteMode;
    }

    /**
     * A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.
     * 
     */
    @Import(name="posixPermissions")
      private final @Nullable Output<TaskOptionsPosixPermissions> posixPermissions;

    public Output<TaskOptionsPosixPermissions> posixPermissions() {
        return this.posixPermissions == null ? Codegen.empty() : this.posixPermissions;
    }

    /**
     * A value that specifies whether files in the destination that don&#39;t exist in the source file system should be preserved.
     * 
     */
    @Import(name="preserveDeletedFiles")
      private final @Nullable Output<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles;

    public Output<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles() {
        return this.preserveDeletedFiles == null ? Codegen.empty() : this.preserveDeletedFiles;
    }

    /**
     * A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.
     * 
     */
    @Import(name="preserveDevices")
      private final @Nullable Output<TaskOptionsPreserveDevices> preserveDevices;

    public Output<TaskOptionsPreserveDevices> preserveDevices() {
        return this.preserveDevices == null ? Codegen.empty() : this.preserveDevices;
    }

    /**
     * A value that determines which components of the SMB security descriptor are copied during transfer.
     * 
     */
    @Import(name="securityDescriptorCopyFlags")
      private final @Nullable Output<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags;

    public Output<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags() {
        return this.securityDescriptorCopyFlags == null ? Codegen.empty() : this.securityDescriptorCopyFlags;
    }

    /**
     * A value that determines whether tasks should be queued before executing the tasks.
     * 
     */
    @Import(name="taskQueueing")
      private final @Nullable Output<TaskOptionsTaskQueueing> taskQueueing;

    public Output<TaskOptionsTaskQueueing> taskQueueing() {
        return this.taskQueueing == null ? Codegen.empty() : this.taskQueueing;
    }

    /**
     * A value that determines whether DataSync transfers only the data and metadata that differ between the source and the destination location, or whether DataSync transfers all the content from the source, without comparing to the destination location.
     * 
     */
    @Import(name="transferMode")
      private final @Nullable Output<TaskOptionsTransferMode> transferMode;

    public Output<TaskOptionsTransferMode> transferMode() {
        return this.transferMode == null ? Codegen.empty() : this.transferMode;
    }

    /**
     * The user ID (UID) of the file&#39;s owner.
     * 
     */
    @Import(name="uid")
      private final @Nullable Output<TaskOptionsUid> uid;

    public Output<TaskOptionsUid> uid() {
        return this.uid == null ? Codegen.empty() : this.uid;
    }

    /**
     * A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.
     * 
     */
    @Import(name="verifyMode")
      private final @Nullable Output<TaskOptionsVerifyMode> verifyMode;

    public Output<TaskOptionsVerifyMode> verifyMode() {
        return this.verifyMode == null ? Codegen.empty() : this.verifyMode;
    }

    public TaskOptionsArgs(
        @Nullable Output<TaskOptionsAtime> atime,
        @Nullable Output<Integer> bytesPerSecond,
        @Nullable Output<TaskOptionsGid> gid,
        @Nullable Output<TaskOptionsLogLevel> logLevel,
        @Nullable Output<TaskOptionsMtime> mtime,
        @Nullable Output<TaskOptionsOverwriteMode> overwriteMode,
        @Nullable Output<TaskOptionsPosixPermissions> posixPermissions,
        @Nullable Output<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles,
        @Nullable Output<TaskOptionsPreserveDevices> preserveDevices,
        @Nullable Output<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags,
        @Nullable Output<TaskOptionsTaskQueueing> taskQueueing,
        @Nullable Output<TaskOptionsTransferMode> transferMode,
        @Nullable Output<TaskOptionsUid> uid,
        @Nullable Output<TaskOptionsVerifyMode> verifyMode) {
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

    private TaskOptionsArgs() {
        this.atime = Codegen.empty();
        this.bytesPerSecond = Codegen.empty();
        this.gid = Codegen.empty();
        this.logLevel = Codegen.empty();
        this.mtime = Codegen.empty();
        this.overwriteMode = Codegen.empty();
        this.posixPermissions = Codegen.empty();
        this.preserveDeletedFiles = Codegen.empty();
        this.preserveDevices = Codegen.empty();
        this.securityDescriptorCopyFlags = Codegen.empty();
        this.taskQueueing = Codegen.empty();
        this.transferMode = Codegen.empty();
        this.uid = Codegen.empty();
        this.verifyMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TaskOptionsAtime> atime;
        private @Nullable Output<Integer> bytesPerSecond;
        private @Nullable Output<TaskOptionsGid> gid;
        private @Nullable Output<TaskOptionsLogLevel> logLevel;
        private @Nullable Output<TaskOptionsMtime> mtime;
        private @Nullable Output<TaskOptionsOverwriteMode> overwriteMode;
        private @Nullable Output<TaskOptionsPosixPermissions> posixPermissions;
        private @Nullable Output<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles;
        private @Nullable Output<TaskOptionsPreserveDevices> preserveDevices;
        private @Nullable Output<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags;
        private @Nullable Output<TaskOptionsTaskQueueing> taskQueueing;
        private @Nullable Output<TaskOptionsTransferMode> transferMode;
        private @Nullable Output<TaskOptionsUid> uid;
        private @Nullable Output<TaskOptionsVerifyMode> verifyMode;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskOptionsArgs defaults) {
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

        public Builder atime(@Nullable Output<TaskOptionsAtime> atime) {
            this.atime = atime;
            return this;
        }
        public Builder atime(@Nullable TaskOptionsAtime atime) {
            this.atime = Codegen.ofNullable(atime);
            return this;
        }
        public Builder bytesPerSecond(@Nullable Output<Integer> bytesPerSecond) {
            this.bytesPerSecond = bytesPerSecond;
            return this;
        }
        public Builder bytesPerSecond(@Nullable Integer bytesPerSecond) {
            this.bytesPerSecond = Codegen.ofNullable(bytesPerSecond);
            return this;
        }
        public Builder gid(@Nullable Output<TaskOptionsGid> gid) {
            this.gid = gid;
            return this;
        }
        public Builder gid(@Nullable TaskOptionsGid gid) {
            this.gid = Codegen.ofNullable(gid);
            return this;
        }
        public Builder logLevel(@Nullable Output<TaskOptionsLogLevel> logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public Builder logLevel(@Nullable TaskOptionsLogLevel logLevel) {
            this.logLevel = Codegen.ofNullable(logLevel);
            return this;
        }
        public Builder mtime(@Nullable Output<TaskOptionsMtime> mtime) {
            this.mtime = mtime;
            return this;
        }
        public Builder mtime(@Nullable TaskOptionsMtime mtime) {
            this.mtime = Codegen.ofNullable(mtime);
            return this;
        }
        public Builder overwriteMode(@Nullable Output<TaskOptionsOverwriteMode> overwriteMode) {
            this.overwriteMode = overwriteMode;
            return this;
        }
        public Builder overwriteMode(@Nullable TaskOptionsOverwriteMode overwriteMode) {
            this.overwriteMode = Codegen.ofNullable(overwriteMode);
            return this;
        }
        public Builder posixPermissions(@Nullable Output<TaskOptionsPosixPermissions> posixPermissions) {
            this.posixPermissions = posixPermissions;
            return this;
        }
        public Builder posixPermissions(@Nullable TaskOptionsPosixPermissions posixPermissions) {
            this.posixPermissions = Codegen.ofNullable(posixPermissions);
            return this;
        }
        public Builder preserveDeletedFiles(@Nullable Output<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles) {
            this.preserveDeletedFiles = preserveDeletedFiles;
            return this;
        }
        public Builder preserveDeletedFiles(@Nullable TaskOptionsPreserveDeletedFiles preserveDeletedFiles) {
            this.preserveDeletedFiles = Codegen.ofNullable(preserveDeletedFiles);
            return this;
        }
        public Builder preserveDevices(@Nullable Output<TaskOptionsPreserveDevices> preserveDevices) {
            this.preserveDevices = preserveDevices;
            return this;
        }
        public Builder preserveDevices(@Nullable TaskOptionsPreserveDevices preserveDevices) {
            this.preserveDevices = Codegen.ofNullable(preserveDevices);
            return this;
        }
        public Builder securityDescriptorCopyFlags(@Nullable Output<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags) {
            this.securityDescriptorCopyFlags = securityDescriptorCopyFlags;
            return this;
        }
        public Builder securityDescriptorCopyFlags(@Nullable TaskOptionsSecurityDescriptorCopyFlags securityDescriptorCopyFlags) {
            this.securityDescriptorCopyFlags = Codegen.ofNullable(securityDescriptorCopyFlags);
            return this;
        }
        public Builder taskQueueing(@Nullable Output<TaskOptionsTaskQueueing> taskQueueing) {
            this.taskQueueing = taskQueueing;
            return this;
        }
        public Builder taskQueueing(@Nullable TaskOptionsTaskQueueing taskQueueing) {
            this.taskQueueing = Codegen.ofNullable(taskQueueing);
            return this;
        }
        public Builder transferMode(@Nullable Output<TaskOptionsTransferMode> transferMode) {
            this.transferMode = transferMode;
            return this;
        }
        public Builder transferMode(@Nullable TaskOptionsTransferMode transferMode) {
            this.transferMode = Codegen.ofNullable(transferMode);
            return this;
        }
        public Builder uid(@Nullable Output<TaskOptionsUid> uid) {
            this.uid = uid;
            return this;
        }
        public Builder uid(@Nullable TaskOptionsUid uid) {
            this.uid = Codegen.ofNullable(uid);
            return this;
        }
        public Builder verifyMode(@Nullable Output<TaskOptionsVerifyMode> verifyMode) {
            this.verifyMode = verifyMode;
            return this;
        }
        public Builder verifyMode(@Nullable TaskOptionsVerifyMode verifyMode) {
            this.verifyMode = Codegen.ofNullable(verifyMode);
            return this;
        }        public TaskOptionsArgs build() {
            return new TaskOptionsArgs(atime, bytesPerSecond, gid, logLevel, mtime, overwriteMode, posixPermissions, preserveDeletedFiles, preserveDevices, securityDescriptorCopyFlags, taskQueueing, transferMode, uid, verifyMode);
        }
    }
}
