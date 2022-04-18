// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.inputs.JobActionResponse;
import com.pulumi.azurenative.scheduler.inputs.JobRecurrenceResponse;
import com.pulumi.azurenative.scheduler.inputs.JobStatusResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobPropertiesResponse Empty = new JobPropertiesResponse();

    /**
     * Gets or sets the job action.
     * 
     */
    @Import(name="action")
      private final @Nullable JobActionResponse action;

    public Optional<JobActionResponse> action() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * Gets or sets the job recurrence.
     * 
     */
    @Import(name="recurrence")
      private final @Nullable JobRecurrenceResponse recurrence;

    public Optional<JobRecurrenceResponse> recurrence() {
        return this.recurrence == null ? Optional.empty() : Optional.ofNullable(this.recurrence);
    }

    /**
     * Gets or sets the job start time.
     * 
     */
    @Import(name="startTime")
      private final @Nullable String startTime;

    public Optional<String> startTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    /**
     * Gets or set the job state.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> state() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * Gets the job status.
     * 
     */
    @Import(name="status", required=true)
      private final JobStatusResponse status;

    public JobStatusResponse status() {
        return this.status;
    }

    public JobPropertiesResponse(
        @Nullable JobActionResponse action,
        @Nullable JobRecurrenceResponse recurrence,
        @Nullable String startTime,
        @Nullable String state,
        JobStatusResponse status) {
        this.action = action;
        this.recurrence = recurrence;
        this.startTime = startTime;
        this.state = state;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private JobPropertiesResponse() {
        this.action = null;
        this.recurrence = null;
        this.startTime = null;
        this.state = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobActionResponse action;
        private @Nullable JobRecurrenceResponse recurrence;
        private @Nullable String startTime;
        private @Nullable String state;
        private JobStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
        }

        public Builder action(@Nullable JobActionResponse action) {
            this.action = action;
            return this;
        }
        public Builder recurrence(@Nullable JobRecurrenceResponse recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder status(JobStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public JobPropertiesResponse build() {
            return new JobPropertiesResponse(action, recurrence, startTime, state, status);
        }
    }
}
