// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.storagetransfer_v1.enums.TransferJobStatus;
import com.pulumi.googlenative.storagetransfer_v1.inputs.LoggingConfigArgs;
import com.pulumi.googlenative.storagetransfer_v1.inputs.NotificationConfigArgs;
import com.pulumi.googlenative.storagetransfer_v1.inputs.ScheduleArgs;
import com.pulumi.googlenative.storagetransfer_v1.inputs.TransferSpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferJobArgs Empty = new TransferJobArgs();

    /**
     * A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the most recently started TransferOperation of this JobConfig. Present if a TransferOperation has been created for this JobConfig.
     * 
     */
    @Import(name="latestOperationName")
      private final @Nullable Output<String> latestOperationName;

    public Output<String> latestOperationName() {
        return this.latestOperationName == null ? Codegen.empty() : this.latestOperationName;
    }

    /**
     * Logging configuration.
     * 
     */
    @Import(name="loggingConfig")
      private final @Nullable Output<LoggingConfigArgs> loggingConfig;

    public Output<LoggingConfigArgs> loggingConfig() {
        return this.loggingConfig == null ? Codegen.empty() : this.loggingConfig;
    }

    /**
     * A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service assigns a unique name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This name must start with `&#34;transferJobs/&#34;` prefix and end with a letter or a number, and should be no more than 128 characters. For transfers involving PosixFilesystem, this name must start with `transferJobs/OPI` specifically. For all other transfer types, this name must not start with `transferJobs/OPI`. Non-PosixFilesystem example: `&#34;transferJobs/^(?!OPI)[A-Za-z0-9-._~]*[A-Za-z0-9]$&#34;` PosixFilesystem example: `&#34;transferJobs/OPI^[A-Za-z0-9-._~]*[A-Za-z0-9]$&#34;` Applications must not rely on the enforcement of naming requirements involving OPI. Invalid job names fail with an INVALID_ARGUMENT error.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Notification configuration. This is not supported for transfers involving PosixFilesystem.
     * 
     */
    @Import(name="notificationConfig")
      private final @Nullable Output<NotificationConfigArgs> notificationConfig;

    public Output<NotificationConfigArgs> notificationConfig() {
        return this.notificationConfig == null ? Codegen.empty() : this.notificationConfig;
    }

    /**
     * The ID of the Google Cloud project that owns the job.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Specifies schedule for the transfer job. This is an optional field. When the field is not set, the job never executes a transfer, unless you invoke RunTransferJob or update the job to have a non-empty schedule.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<ScheduleArgs> schedule;

    public Output<ScheduleArgs> schedule() {
        return this.schedule == null ? Codegen.empty() : this.schedule;
    }

    /**
     * Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<TransferJobStatus> status;

    public Output<TransferJobStatus> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Transfer specification.
     * 
     */
    @Import(name="transferSpec")
      private final @Nullable Output<TransferSpecArgs> transferSpec;

    public Output<TransferSpecArgs> transferSpec() {
        return this.transferSpec == null ? Codegen.empty() : this.transferSpec;
    }

    public TransferJobArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> latestOperationName,
        @Nullable Output<LoggingConfigArgs> loggingConfig,
        @Nullable Output<String> name,
        @Nullable Output<NotificationConfigArgs> notificationConfig,
        @Nullable Output<String> project,
        @Nullable Output<ScheduleArgs> schedule,
        @Nullable Output<TransferJobStatus> status,
        @Nullable Output<TransferSpecArgs> transferSpec) {
        this.description = description;
        this.latestOperationName = latestOperationName;
        this.loggingConfig = loggingConfig;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.project = project;
        this.schedule = schedule;
        this.status = status;
        this.transferSpec = transferSpec;
    }

    private TransferJobArgs() {
        this.description = Codegen.empty();
        this.latestOperationName = Codegen.empty();
        this.loggingConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.notificationConfig = Codegen.empty();
        this.project = Codegen.empty();
        this.schedule = Codegen.empty();
        this.status = Codegen.empty();
        this.transferSpec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> latestOperationName;
        private @Nullable Output<LoggingConfigArgs> loggingConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<NotificationConfigArgs> notificationConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<ScheduleArgs> schedule;
        private @Nullable Output<TransferJobStatus> status;
        private @Nullable Output<TransferSpecArgs> transferSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.latestOperationName = defaults.latestOperationName;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.project = defaults.project;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
    	      this.transferSpec = defaults.transferSpec;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder latestOperationName(@Nullable Output<String> latestOperationName) {
            this.latestOperationName = latestOperationName;
            return this;
        }
        public Builder latestOperationName(@Nullable String latestOperationName) {
            this.latestOperationName = Codegen.ofNullable(latestOperationName);
            return this;
        }
        public Builder loggingConfig(@Nullable Output<LoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder loggingConfig(@Nullable LoggingConfigArgs loggingConfig) {
            this.loggingConfig = Codegen.ofNullable(loggingConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder notificationConfig(@Nullable Output<NotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }
        public Builder notificationConfig(@Nullable NotificationConfigArgs notificationConfig) {
            this.notificationConfig = Codegen.ofNullable(notificationConfig);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder schedule(@Nullable Output<ScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder schedule(@Nullable ScheduleArgs schedule) {
            this.schedule = Codegen.ofNullable(schedule);
            return this;
        }
        public Builder status(@Nullable Output<TransferJobStatus> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable TransferJobStatus status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder transferSpec(@Nullable Output<TransferSpecArgs> transferSpec) {
            this.transferSpec = transferSpec;
            return this;
        }
        public Builder transferSpec(@Nullable TransferSpecArgs transferSpec) {
            this.transferSpec = Codegen.ofNullable(transferSpec);
            return this;
        }        public TransferJobArgs build() {
            return new TransferJobArgs(description, latestOperationName, loggingConfig, name, notificationConfig, project, schedule, status, transferSpec);
        }
    }
}
