// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.storagetransfer_v1.inputs.DateArgs;
import com.pulumi.googlenative.storagetransfer_v1.inputs.TimeOfDayArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Transfers can be scheduled to recur or to run just once.
 * 
 */
public final class ScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * The time in UTC that no further transfer operations are scheduled. Combined with schedule_end_date, `end_time_of_day` specifies the end date and time for starting new transfer operations. This field must be greater than or equal to the timestamp corresponding to the combintation of schedule_start_date and start_time_of_day, and is subject to the following: * If `end_time_of_day` is not set and `schedule_end_date` is set, then a default value of `23:59:59` is used for `end_time_of_day`. * If `end_time_of_day` is set and `schedule_end_date` is not set, then INVALID_ARGUMENT is returned.
     * 
     */
    @Import(name="endTimeOfDay")
      private final @Nullable Output<TimeOfDayArgs> endTimeOfDay;

    public Output<TimeOfDayArgs> endTimeOfDay() {
        return this.endTimeOfDay == null ? Codegen.empty() : this.endTimeOfDay;
    }

    /**
     * Interval between the start of each scheduled TransferOperation. If unspecified, the default value is 24 hours. This value may not be less than 1 hour.
     * 
     */
    @Import(name="repeatInterval")
      private final @Nullable Output<String> repeatInterval;

    public Output<String> repeatInterval() {
        return this.repeatInterval == null ? Codegen.empty() : this.repeatInterval;
    }

    /**
     * The last day a transfer runs. Date boundaries are determined relative to UTC time. A job runs once per 24 hours within the following guidelines: * If `schedule_end_date` and schedule_start_date are the same and in the future relative to UTC, the transfer is executed only one time. * If `schedule_end_date` is later than `schedule_start_date` and `schedule_end_date` is in the future relative to UTC, the job runs each day at start_time_of_day through `schedule_end_date`.
     * 
     */
    @Import(name="scheduleEndDate")
      private final @Nullable Output<DateArgs> scheduleEndDate;

    public Output<DateArgs> scheduleEndDate() {
        return this.scheduleEndDate == null ? Codegen.empty() : this.scheduleEndDate;
    }

    /**
     * The start date of a transfer. Date boundaries are determined relative to UTC time. If `schedule_start_date` and start_time_of_day are in the past relative to the job's creation time, the transfer starts the day after you schedule the transfer request. **Note:** When starting jobs at or near midnight UTC it is possible that a job starts later than expected. For example, if you send an outbound request on June 1 one millisecond prior to midnight UTC and the Storage Transfer Service server receives the request on June 2, then it creates a TransferJob with `schedule_start_date` set to June 2 and a `start_time_of_day` set to midnight UTC. The first scheduled TransferOperation takes place on June 3 at midnight UTC.
     * 
     */
    @Import(name="scheduleStartDate", required=true)
      private final Output<DateArgs> scheduleStartDate;

    public Output<DateArgs> scheduleStartDate() {
        return this.scheduleStartDate;
    }

    /**
     * The time in UTC that a transfer job is scheduled to run. Transfers may start later than this time. If `start_time_of_day` is not specified: * One-time transfers run immediately. * Recurring transfers run immediately, and each day at midnight UTC, through schedule_end_date. If `start_time_of_day` is specified: * One-time transfers run at the specified time. * Recurring transfers run at the specified time each day, through `schedule_end_date`.
     * 
     */
    @Import(name="startTimeOfDay")
      private final @Nullable Output<TimeOfDayArgs> startTimeOfDay;

    public Output<TimeOfDayArgs> startTimeOfDay() {
        return this.startTimeOfDay == null ? Codegen.empty() : this.startTimeOfDay;
    }

    public ScheduleArgs(
        @Nullable Output<TimeOfDayArgs> endTimeOfDay,
        @Nullable Output<String> repeatInterval,
        @Nullable Output<DateArgs> scheduleEndDate,
        Output<DateArgs> scheduleStartDate,
        @Nullable Output<TimeOfDayArgs> startTimeOfDay) {
        this.endTimeOfDay = endTimeOfDay;
        this.repeatInterval = repeatInterval;
        this.scheduleEndDate = scheduleEndDate;
        this.scheduleStartDate = Objects.requireNonNull(scheduleStartDate, "expected parameter 'scheduleStartDate' to be non-null");
        this.startTimeOfDay = startTimeOfDay;
    }

    private ScheduleArgs() {
        this.endTimeOfDay = Codegen.empty();
        this.repeatInterval = Codegen.empty();
        this.scheduleEndDate = Codegen.empty();
        this.scheduleStartDate = Codegen.empty();
        this.startTimeOfDay = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TimeOfDayArgs> endTimeOfDay;
        private @Nullable Output<String> repeatInterval;
        private @Nullable Output<DateArgs> scheduleEndDate;
        private Output<DateArgs> scheduleStartDate;
        private @Nullable Output<TimeOfDayArgs> startTimeOfDay;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTimeOfDay = defaults.endTimeOfDay;
    	      this.repeatInterval = defaults.repeatInterval;
    	      this.scheduleEndDate = defaults.scheduleEndDate;
    	      this.scheduleStartDate = defaults.scheduleStartDate;
    	      this.startTimeOfDay = defaults.startTimeOfDay;
        }

        public Builder endTimeOfDay(@Nullable Output<TimeOfDayArgs> endTimeOfDay) {
            this.endTimeOfDay = endTimeOfDay;
            return this;
        }
        public Builder endTimeOfDay(@Nullable TimeOfDayArgs endTimeOfDay) {
            this.endTimeOfDay = Codegen.ofNullable(endTimeOfDay);
            return this;
        }
        public Builder repeatInterval(@Nullable Output<String> repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Builder repeatInterval(@Nullable String repeatInterval) {
            this.repeatInterval = Codegen.ofNullable(repeatInterval);
            return this;
        }
        public Builder scheduleEndDate(@Nullable Output<DateArgs> scheduleEndDate) {
            this.scheduleEndDate = scheduleEndDate;
            return this;
        }
        public Builder scheduleEndDate(@Nullable DateArgs scheduleEndDate) {
            this.scheduleEndDate = Codegen.ofNullable(scheduleEndDate);
            return this;
        }
        public Builder scheduleStartDate(Output<DateArgs> scheduleStartDate) {
            this.scheduleStartDate = Objects.requireNonNull(scheduleStartDate);
            return this;
        }
        public Builder scheduleStartDate(DateArgs scheduleStartDate) {
            this.scheduleStartDate = Output.of(Objects.requireNonNull(scheduleStartDate));
            return this;
        }
        public Builder startTimeOfDay(@Nullable Output<TimeOfDayArgs> startTimeOfDay) {
            this.startTimeOfDay = startTimeOfDay;
            return this;
        }
        public Builder startTimeOfDay(@Nullable TimeOfDayArgs startTimeOfDay) {
            this.startTimeOfDay = Codegen.ofNullable(startTimeOfDay);
            return this;
        }        public ScheduleArgs build() {
            return new ScheduleArgs(endTimeOfDay, repeatInterval, scheduleEndDate, scheduleStartDate, startTimeOfDay);
        }
    }
}
