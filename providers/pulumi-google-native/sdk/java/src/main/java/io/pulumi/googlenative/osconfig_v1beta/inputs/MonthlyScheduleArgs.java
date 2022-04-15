// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.osconfig_v1beta.inputs.WeekDayOfMonthArgs;
import java.lang.Integer;
import java.util.Objects;


/**
 * Represents a monthly schedule. An example of a valid monthly schedule is "on the third Tuesday of the month" or "on the 15th of the month".
 * 
 */
public final class MonthlyScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonthlyScheduleArgs Empty = new MonthlyScheduleArgs();

    /**
     * One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month. Months without the target day will be skipped. For example, a schedule to run "every month on the 31st" will not run in February, April, June, etc.
     * 
     */
    @Import(name="monthDay", required=true)
      private final Output<Integer> monthDay;

    public Output<Integer> monthDay() {
        return this.monthDay;
    }

    /**
     * Week day in a month.
     * 
     */
    @Import(name="weekDayOfMonth", required=true)
      private final Output<WeekDayOfMonthArgs> weekDayOfMonth;

    public Output<WeekDayOfMonthArgs> weekDayOfMonth() {
        return this.weekDayOfMonth;
    }

    public MonthlyScheduleArgs(
        Output<Integer> monthDay,
        Output<WeekDayOfMonthArgs> weekDayOfMonth) {
        this.monthDay = Objects.requireNonNull(monthDay, "expected parameter 'monthDay' to be non-null");
        this.weekDayOfMonth = Objects.requireNonNull(weekDayOfMonth, "expected parameter 'weekDayOfMonth' to be non-null");
    }

    private MonthlyScheduleArgs() {
        this.monthDay = Codegen.empty();
        this.weekDayOfMonth = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonthlyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> monthDay;
        private Output<WeekDayOfMonthArgs> weekDayOfMonth;

        public Builder() {
    	      // Empty
        }

        public Builder(MonthlyScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthDay = defaults.monthDay;
    	      this.weekDayOfMonth = defaults.weekDayOfMonth;
        }

        public Builder monthDay(Output<Integer> monthDay) {
            this.monthDay = Objects.requireNonNull(monthDay);
            return this;
        }
        public Builder monthDay(Integer monthDay) {
            this.monthDay = Output.of(Objects.requireNonNull(monthDay));
            return this;
        }
        public Builder weekDayOfMonth(Output<WeekDayOfMonthArgs> weekDayOfMonth) {
            this.weekDayOfMonth = Objects.requireNonNull(weekDayOfMonth);
            return this;
        }
        public Builder weekDayOfMonth(WeekDayOfMonthArgs weekDayOfMonth) {
            this.weekDayOfMonth = Output.of(Objects.requireNonNull(weekDayOfMonth));
            return this;
        }        public MonthlyScheduleArgs build() {
            return new MonthlyScheduleArgs(monthDay, weekDayOfMonth);
        }
    }
}
