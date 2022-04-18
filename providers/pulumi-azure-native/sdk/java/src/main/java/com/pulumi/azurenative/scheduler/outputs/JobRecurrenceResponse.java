// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.outputs;

import com.pulumi.azurenative.scheduler.outputs.JobRecurrenceScheduleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobRecurrenceResponse {
    /**
     * Gets or sets the maximum number of times that the job should run.
     * 
     */
    private final @Nullable Integer count;
    /**
     * Gets or sets the time at which the job will complete.
     * 
     */
    private final @Nullable String endTime;
    /**
     * Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
     * 
     */
    private final @Nullable String frequency;
    /**
     * Gets or sets the interval between retries.
     * 
     */
    private final @Nullable Integer interval;
    private final @Nullable JobRecurrenceScheduleResponse schedule;

    @CustomType.Constructor
    private JobRecurrenceResponse(
        @CustomType.Parameter("count") @Nullable Integer count,
        @CustomType.Parameter("endTime") @Nullable String endTime,
        @CustomType.Parameter("frequency") @Nullable String frequency,
        @CustomType.Parameter("interval") @Nullable Integer interval,
        @CustomType.Parameter("schedule") @Nullable JobRecurrenceScheduleResponse schedule) {
        this.count = count;
        this.endTime = endTime;
        this.frequency = frequency;
        this.interval = interval;
        this.schedule = schedule;
    }

    /**
     * Gets or sets the maximum number of times that the job should run.
     * 
    */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * Gets or sets the time at which the job will complete.
     * 
    */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
     * 
    */
    public Optional<String> frequency() {
        return Optional.ofNullable(this.frequency);
    }
    /**
     * Gets or sets the interval between retries.
     * 
    */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }
    public Optional<JobRecurrenceScheduleResponse> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String endTime;
        private @Nullable String frequency;
        private @Nullable Integer interval;
        private @Nullable JobRecurrenceScheduleResponse schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.schedule = defaults.schedule;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder frequency(@Nullable String frequency) {
            this.frequency = frequency;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }
        public Builder schedule(@Nullable JobRecurrenceScheduleResponse schedule) {
            this.schedule = schedule;
            return this;
        }        public JobRecurrenceResponse build() {
            return new JobRecurrenceResponse(count, endTime, frequency, interval, schedule);
        }
    }
}
