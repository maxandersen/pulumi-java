// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.inputs.JobRecurrenceScheduleResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobRecurrenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobRecurrenceResponse Empty = new JobRecurrenceResponse();

    /**
     * Gets or sets the maximum number of times that the job should run.
     * 
     */
    @Import(name="count")
    private @Nullable Integer count;

    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Gets or sets the time at which the job will complete.
     * 
     */
    @Import(name="endTime")
    private @Nullable String endTime;

    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
     * 
     */
    @Import(name="frequency")
    private @Nullable String frequency;

    public Optional<String> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * Gets or sets the interval between retries.
     * 
     */
    @Import(name="interval")
    private @Nullable Integer interval;

    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }

    @Import(name="schedule")
    private @Nullable JobRecurrenceScheduleResponse schedule;

    public Optional<JobRecurrenceScheduleResponse> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    private JobRecurrenceResponse() {}

    private JobRecurrenceResponse(JobRecurrenceResponse $) {
        this.count = $.count;
        this.endTime = $.endTime;
        this.frequency = $.frequency;
        this.interval = $.interval;
        this.schedule = $.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobRecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobRecurrenceResponse $;

        public Builder() {
            $ = new JobRecurrenceResponse();
        }

        public Builder(JobRecurrenceResponse defaults) {
            $ = new JobRecurrenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder count(@Nullable Integer count) {
            $.count = count;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder frequency(@Nullable String frequency) {
            $.frequency = frequency;
            return this;
        }

        public Builder interval(@Nullable Integer interval) {
            $.interval = interval;
            return this;
        }

        public Builder schedule(@Nullable JobRecurrenceScheduleResponse schedule) {
            $.schedule = schedule;
            return this;
        }

        public JobRecurrenceResponse build() {
            return $;
        }
    }

}
