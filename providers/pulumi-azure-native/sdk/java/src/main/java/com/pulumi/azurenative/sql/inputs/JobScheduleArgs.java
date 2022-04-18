// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.azurenative.sql.enums.JobScheduleType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scheduling properties of a job.
 * 
 */
public final class JobScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobScheduleArgs Empty = new JobScheduleArgs();

    /**
     * Whether or not the schedule is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Schedule end time.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> endTime() {
        return this.endTime == null ? Codegen.empty() : this.endTime;
    }

    /**
     * Value of the schedule's recurring interval, if the ScheduleType is recurring. ISO8601 duration format.
     * 
     */
    @Import(name="interval")
      private final @Nullable Output<String> interval;

    public Output<String> interval() {
        return this.interval == null ? Codegen.empty() : this.interval;
    }

    /**
     * Schedule start time.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    /**
     * Schedule interval type
     * 
     */
    @Import(name="type")
      private final @Nullable Output<JobScheduleType> type;

    public Output<JobScheduleType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public JobScheduleArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> endTime,
        @Nullable Output<String> interval,
        @Nullable Output<String> startTime,
        @Nullable Output<JobScheduleType> type) {
        this.enabled = enabled;
        this.endTime = endTime == null ? Codegen.ofNullable("9999-12-31T11:59:59+00:00") : endTime;
        this.interval = interval;
        this.startTime = startTime == null ? Codegen.ofNullable("0001-01-01T00:00:00+00:00") : startTime;
        this.type = type == null ? Codegen.ofNullable(com.pulumi.azurenative.sql.enums.JobScheduleType.Once) : type;
    }

    private JobScheduleArgs() {
        this.enabled = Codegen.empty();
        this.endTime = Codegen.empty();
        this.interval = Codegen.empty();
        this.startTime = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> endTime;
        private @Nullable Output<String> interval;
        private @Nullable Output<String> startTime;
        private @Nullable Output<JobScheduleType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.endTime = defaults.endTime;
    	      this.interval = defaults.interval;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = Codegen.ofNullable(endTime);
            return this;
        }
        public Builder interval(@Nullable Output<String> interval) {
            this.interval = interval;
            return this;
        }
        public Builder interval(@Nullable String interval) {
            this.interval = Codegen.ofNullable(interval);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }
        public Builder type(@Nullable Output<JobScheduleType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable JobScheduleType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public JobScheduleArgs build() {
            return new JobScheduleArgs(enabled, endTime, interval, startTime, type);
        }
    }
}
