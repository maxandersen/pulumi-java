// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.transfer;

import com.pulumi.awsnative.transfer.inputs.WorkflowStepArgs;
import com.pulumi.awsnative.transfer.inputs.WorkflowTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowArgs Empty = new WorkflowArgs();

    /**
     * A textual description for the workflow.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Specifies the steps (actions) to take if any errors are encountered during execution of the workflow.
     * 
     */
    @Import(name="onExceptionSteps")
      private final @Nullable Output<List<WorkflowStepArgs>> onExceptionSteps;

    public Output<List<WorkflowStepArgs>> onExceptionSteps() {
        return this.onExceptionSteps == null ? Codegen.empty() : this.onExceptionSteps;
    }

    /**
     * Specifies the details for the steps that are in the specified workflow.
     * 
     */
    @Import(name="steps", required=true)
      private final Output<List<WorkflowStepArgs>> steps;

    public Output<List<WorkflowStepArgs>> steps() {
        return this.steps;
    }

    /**
     * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for any purpose.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<WorkflowTagArgs>> tags;

    public Output<List<WorkflowTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public WorkflowArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<WorkflowStepArgs>> onExceptionSteps,
        Output<List<WorkflowStepArgs>> steps,
        @Nullable Output<List<WorkflowTagArgs>> tags) {
        this.description = description;
        this.onExceptionSteps = onExceptionSteps;
        this.steps = Objects.requireNonNull(steps, "expected parameter 'steps' to be non-null");
        this.tags = tags;
    }

    private WorkflowArgs() {
        this.description = Codegen.empty();
        this.onExceptionSteps = Codegen.empty();
        this.steps = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<WorkflowStepArgs>> onExceptionSteps;
        private Output<List<WorkflowStepArgs>> steps;
        private @Nullable Output<List<WorkflowTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.onExceptionSteps = defaults.onExceptionSteps;
    	      this.steps = defaults.steps;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder onExceptionSteps(@Nullable Output<List<WorkflowStepArgs>> onExceptionSteps) {
            this.onExceptionSteps = onExceptionSteps;
            return this;
        }
        public Builder onExceptionSteps(@Nullable List<WorkflowStepArgs> onExceptionSteps) {
            this.onExceptionSteps = Codegen.ofNullable(onExceptionSteps);
            return this;
        }
        public Builder onExceptionSteps(WorkflowStepArgs... onExceptionSteps) {
            return onExceptionSteps(List.of(onExceptionSteps));
        }
        public Builder steps(Output<List<WorkflowStepArgs>> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }
        public Builder steps(List<WorkflowStepArgs> steps) {
            this.steps = Output.of(Objects.requireNonNull(steps));
            return this;
        }
        public Builder steps(WorkflowStepArgs... steps) {
            return steps(List.of(steps));
        }
        public Builder tags(@Nullable Output<List<WorkflowTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<WorkflowTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(WorkflowTagArgs... tags) {
            return tags(List.of(tags));
        }        public WorkflowArgs build() {
            return new WorkflowArgs(description, onExceptionSteps, steps, tags);
        }
    }
}
