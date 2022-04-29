// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.enums.DayOfWeek;
import com.pulumi.azurenative.scheduler.inputs.JobRecurrenceScheduleMonthlyOccurrenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobRecurrenceScheduleArgs extends ResourceArgs {

    public static final JobRecurrenceScheduleArgs Empty = new JobRecurrenceScheduleArgs();

    /**
     * Gets or sets the hours of the day that the job should execute at.
     * 
     */
    @Import(name="hours")
    private @Nullable Output<List<Integer>> hours;

    /**
     * @return Gets or sets the hours of the day that the job should execute at.
     * 
     */
    public Optional<Output<List<Integer>>> hours() {
        return Optional.ofNullable(this.hours);
    }

    /**
     * Gets or sets the minutes of the hour that the job should execute at.
     * 
     */
    @Import(name="minutes")
    private @Nullable Output<List<Integer>> minutes;

    /**
     * @return Gets or sets the minutes of the hour that the job should execute at.
     * 
     */
    public Optional<Output<List<Integer>>> minutes() {
        return Optional.ofNullable(this.minutes);
    }

    /**
     * Gets or sets the days of the month that the job should execute on. Must be between 1 and 31.
     * 
     */
    @Import(name="monthDays")
    private @Nullable Output<List<Integer>> monthDays;

    /**
     * @return Gets or sets the days of the month that the job should execute on. Must be between 1 and 31.
     * 
     */
    public Optional<Output<List<Integer>>> monthDays() {
        return Optional.ofNullable(this.monthDays);
    }

    /**
     * Gets or sets the occurrences of days within a month.
     * 
     */
    @Import(name="monthlyOccurrences")
    private @Nullable Output<List<JobRecurrenceScheduleMonthlyOccurrenceArgs>> monthlyOccurrences;

    /**
     * @return Gets or sets the occurrences of days within a month.
     * 
     */
    public Optional<Output<List<JobRecurrenceScheduleMonthlyOccurrenceArgs>>> monthlyOccurrences() {
        return Optional.ofNullable(this.monthlyOccurrences);
    }

    /**
     * Gets or sets the days of the week that the job should execute on.
     * 
     */
    @Import(name="weekDays")
    private @Nullable Output<List<DayOfWeek>> weekDays;

    /**
     * @return Gets or sets the days of the week that the job should execute on.
     * 
     */
    public Optional<Output<List<DayOfWeek>>> weekDays() {
        return Optional.ofNullable(this.weekDays);
    }

    private JobRecurrenceScheduleArgs() {}

    private JobRecurrenceScheduleArgs(JobRecurrenceScheduleArgs $) {
        this.hours = $.hours;
        this.minutes = $.minutes;
        this.monthDays = $.monthDays;
        this.monthlyOccurrences = $.monthlyOccurrences;
        this.weekDays = $.weekDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobRecurrenceScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobRecurrenceScheduleArgs $;

        public Builder() {
            $ = new JobRecurrenceScheduleArgs();
        }

        public Builder(JobRecurrenceScheduleArgs defaults) {
            $ = new JobRecurrenceScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hours Gets or sets the hours of the day that the job should execute at.
         * 
         * @return builder
         * 
         */
        public Builder hours(@Nullable Output<List<Integer>> hours) {
            $.hours = hours;
            return this;
        }

        /**
         * @param hours Gets or sets the hours of the day that the job should execute at.
         * 
         * @return builder
         * 
         */
        public Builder hours(List<Integer> hours) {
            return hours(Output.of(hours));
        }

        /**
         * @param hours Gets or sets the hours of the day that the job should execute at.
         * 
         * @return builder
         * 
         */
        public Builder hours(Integer... hours) {
            return hours(List.of(hours));
        }

        /**
         * @param minutes Gets or sets the minutes of the hour that the job should execute at.
         * 
         * @return builder
         * 
         */
        public Builder minutes(@Nullable Output<List<Integer>> minutes) {
            $.minutes = minutes;
            return this;
        }

        /**
         * @param minutes Gets or sets the minutes of the hour that the job should execute at.
         * 
         * @return builder
         * 
         */
        public Builder minutes(List<Integer> minutes) {
            return minutes(Output.of(minutes));
        }

        /**
         * @param minutes Gets or sets the minutes of the hour that the job should execute at.
         * 
         * @return builder
         * 
         */
        public Builder minutes(Integer... minutes) {
            return minutes(List.of(minutes));
        }

        /**
         * @param monthDays Gets or sets the days of the month that the job should execute on. Must be between 1 and 31.
         * 
         * @return builder
         * 
         */
        public Builder monthDays(@Nullable Output<List<Integer>> monthDays) {
            $.monthDays = monthDays;
            return this;
        }

        /**
         * @param monthDays Gets or sets the days of the month that the job should execute on. Must be between 1 and 31.
         * 
         * @return builder
         * 
         */
        public Builder monthDays(List<Integer> monthDays) {
            return monthDays(Output.of(monthDays));
        }

        /**
         * @param monthDays Gets or sets the days of the month that the job should execute on. Must be between 1 and 31.
         * 
         * @return builder
         * 
         */
        public Builder monthDays(Integer... monthDays) {
            return monthDays(List.of(monthDays));
        }

        /**
         * @param monthlyOccurrences Gets or sets the occurrences of days within a month.
         * 
         * @return builder
         * 
         */
        public Builder monthlyOccurrences(@Nullable Output<List<JobRecurrenceScheduleMonthlyOccurrenceArgs>> monthlyOccurrences) {
            $.monthlyOccurrences = monthlyOccurrences;
            return this;
        }

        /**
         * @param monthlyOccurrences Gets or sets the occurrences of days within a month.
         * 
         * @return builder
         * 
         */
        public Builder monthlyOccurrences(List<JobRecurrenceScheduleMonthlyOccurrenceArgs> monthlyOccurrences) {
            return monthlyOccurrences(Output.of(monthlyOccurrences));
        }

        /**
         * @param monthlyOccurrences Gets or sets the occurrences of days within a month.
         * 
         * @return builder
         * 
         */
        public Builder monthlyOccurrences(JobRecurrenceScheduleMonthlyOccurrenceArgs... monthlyOccurrences) {
            return monthlyOccurrences(List.of(monthlyOccurrences));
        }

        /**
         * @param weekDays Gets or sets the days of the week that the job should execute on.
         * 
         * @return builder
         * 
         */
        public Builder weekDays(@Nullable Output<List<DayOfWeek>> weekDays) {
            $.weekDays = weekDays;
            return this;
        }

        /**
         * @param weekDays Gets or sets the days of the week that the job should execute on.
         * 
         * @return builder
         * 
         */
        public Builder weekDays(List<DayOfWeek> weekDays) {
            return weekDays(Output.of(weekDays));
        }

        /**
         * @param weekDays Gets or sets the days of the week that the job should execute on.
         * 
         * @return builder
         * 
         */
        public Builder weekDays(DayOfWeek... weekDays) {
            return weekDays(List.of(weekDays));
        }

        public JobRecurrenceScheduleArgs build() {
            return $;
        }
    }

}
