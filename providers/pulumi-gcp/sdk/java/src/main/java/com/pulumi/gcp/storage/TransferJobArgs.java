// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs;
import com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferJobArgs Empty = new TransferJobArgs();

    /**
     * Unique description to identify the Transfer Job.
     * 
     */
    @Import(name="description", required=true)
      private final Output<String> description;

    public Output<String> description() {
        return this.description;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Schedule specification defining when the Transfer Job should be scheduled to start, end and what time to run. Structure documented below.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<TransferJobScheduleArgs> schedule;

    public Output<TransferJobScheduleArgs> schedule() {
        return this.schedule == null ? Codegen.empty() : this.schedule;
    }

    /**
     * Status of the job. Default: `ENABLED`. **NOTE: The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.**
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Transfer specification. Structure documented below.
     * 
     */
    @Import(name="transferSpec", required=true)
      private final Output<TransferJobTransferSpecArgs> transferSpec;

    public Output<TransferJobTransferSpecArgs> transferSpec() {
        return this.transferSpec;
    }

    public TransferJobArgs(
        Output<String> description,
        @Nullable Output<String> project,
        @Nullable Output<TransferJobScheduleArgs> schedule,
        @Nullable Output<String> status,
        Output<TransferJobTransferSpecArgs> transferSpec) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.project = project;
        this.schedule = schedule;
        this.status = status;
        this.transferSpec = Objects.requireNonNull(transferSpec, "expected parameter 'transferSpec' to be non-null");
    }

    private TransferJobArgs() {
        this.description = Codegen.empty();
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
        private Output<String> description;
        private @Nullable Output<String> project;
        private @Nullable Output<TransferJobScheduleArgs> schedule;
        private @Nullable Output<String> status;
        private Output<TransferJobTransferSpecArgs> transferSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.project = defaults.project;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
    	      this.transferSpec = defaults.transferSpec;
        }

        public Builder description(Output<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder description(String description) {
            this.description = Output.of(Objects.requireNonNull(description));
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
        public Builder schedule(@Nullable Output<TransferJobScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder schedule(@Nullable TransferJobScheduleArgs schedule) {
            this.schedule = Codegen.ofNullable(schedule);
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
        public Builder transferSpec(Output<TransferJobTransferSpecArgs> transferSpec) {
            this.transferSpec = Objects.requireNonNull(transferSpec);
            return this;
        }
        public Builder transferSpec(TransferJobTransferSpecArgs transferSpec) {
            this.transferSpec = Output.of(Objects.requireNonNull(transferSpec));
            return this;
        }        public TransferJobArgs build() {
            return new TransferJobArgs(description, project, schedule, status, transferSpec);
        }
    }
}
