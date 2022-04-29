// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.enums.RecurrenceFrequency;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobMaxRecurrenceArgs extends ResourceArgs {

    public static final JobMaxRecurrenceArgs Empty = new JobMaxRecurrenceArgs();

    /**
     * Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
     * 
     */
    @Import(name="frequency")
    private @Nullable Output<RecurrenceFrequency> frequency;

    /**
     * @return Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
     * 
     */
    public Optional<Output<RecurrenceFrequency>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * Gets or sets the interval between retries.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return Gets or sets the interval between retries.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    private JobMaxRecurrenceArgs() {}

    private JobMaxRecurrenceArgs(JobMaxRecurrenceArgs $) {
        this.frequency = $.frequency;
        this.interval = $.interval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobMaxRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobMaxRecurrenceArgs $;

        public Builder() {
            $ = new JobMaxRecurrenceArgs();
        }

        public Builder(JobMaxRecurrenceArgs defaults) {
            $ = new JobMaxRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param frequency Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable Output<RecurrenceFrequency> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
         * 
         * @return builder
         * 
         */
        public Builder frequency(RecurrenceFrequency frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param interval Gets or sets the interval between retries.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Gets or sets the interval between retries.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        public JobMaxRecurrenceArgs build() {
            return $;
        }
    }

}
