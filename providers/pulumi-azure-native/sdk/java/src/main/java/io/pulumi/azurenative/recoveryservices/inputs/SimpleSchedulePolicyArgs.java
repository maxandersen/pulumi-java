// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.DayOfWeek;
import io.pulumi.azurenative.recoveryservices.enums.ScheduleRunType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Simple policy schedule.
 * 
 */
public final class SimpleSchedulePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SimpleSchedulePolicyArgs Empty = new SimpleSchedulePolicyArgs();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'SimpleSchedulePolicy'.
     * 
     */
    @Import(name="schedulePolicyType", required=true)
      private final Output<String> schedulePolicyType;

    public Output<String> schedulePolicyType() {
        return this.schedulePolicyType;
    }

    /**
     * List of days of week this schedule has to be run.
     * 
     */
    @Import(name="scheduleRunDays")
      private final @Nullable Output<List<DayOfWeek>> scheduleRunDays;

    public Output<List<DayOfWeek>> scheduleRunDays() {
        return this.scheduleRunDays == null ? Codegen.empty() : this.scheduleRunDays;
    }

    /**
     * Frequency of the schedule operation of this policy.
     * 
     */
    @Import(name="scheduleRunFrequency")
      private final @Nullable Output<Either<String,ScheduleRunType>> scheduleRunFrequency;

    public Output<Either<String,ScheduleRunType>> scheduleRunFrequency() {
        return this.scheduleRunFrequency == null ? Codegen.empty() : this.scheduleRunFrequency;
    }

    /**
     * List of times of day this schedule has to be run.
     * 
     */
    @Import(name="scheduleRunTimes")
      private final @Nullable Output<List<String>> scheduleRunTimes;

    public Output<List<String>> scheduleRunTimes() {
        return this.scheduleRunTimes == null ? Codegen.empty() : this.scheduleRunTimes;
    }

    /**
     * At every number weeks this schedule has to be run.
     * 
     */
    @Import(name="scheduleWeeklyFrequency")
      private final @Nullable Output<Integer> scheduleWeeklyFrequency;

    public Output<Integer> scheduleWeeklyFrequency() {
        return this.scheduleWeeklyFrequency == null ? Codegen.empty() : this.scheduleWeeklyFrequency;
    }

    public SimpleSchedulePolicyArgs(
        Output<String> schedulePolicyType,
        @Nullable Output<List<DayOfWeek>> scheduleRunDays,
        @Nullable Output<Either<String,ScheduleRunType>> scheduleRunFrequency,
        @Nullable Output<List<String>> scheduleRunTimes,
        @Nullable Output<Integer> scheduleWeeklyFrequency) {
        this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType, "expected parameter 'schedulePolicyType' to be non-null");
        this.scheduleRunDays = scheduleRunDays;
        this.scheduleRunFrequency = scheduleRunFrequency;
        this.scheduleRunTimes = scheduleRunTimes;
        this.scheduleWeeklyFrequency = scheduleWeeklyFrequency;
    }

    private SimpleSchedulePolicyArgs() {
        this.schedulePolicyType = Codegen.empty();
        this.scheduleRunDays = Codegen.empty();
        this.scheduleRunFrequency = Codegen.empty();
        this.scheduleRunTimes = Codegen.empty();
        this.scheduleWeeklyFrequency = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimpleSchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> schedulePolicyType;
        private @Nullable Output<List<DayOfWeek>> scheduleRunDays;
        private @Nullable Output<Either<String,ScheduleRunType>> scheduleRunFrequency;
        private @Nullable Output<List<String>> scheduleRunTimes;
        private @Nullable Output<Integer> scheduleWeeklyFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(SimpleSchedulePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedulePolicyType = defaults.schedulePolicyType;
    	      this.scheduleRunDays = defaults.scheduleRunDays;
    	      this.scheduleRunFrequency = defaults.scheduleRunFrequency;
    	      this.scheduleRunTimes = defaults.scheduleRunTimes;
    	      this.scheduleWeeklyFrequency = defaults.scheduleWeeklyFrequency;
        }

        public Builder schedulePolicyType(Output<String> schedulePolicyType) {
            this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
            return this;
        }
        public Builder schedulePolicyType(String schedulePolicyType) {
            this.schedulePolicyType = Output.of(Objects.requireNonNull(schedulePolicyType));
            return this;
        }
        public Builder scheduleRunDays(@Nullable Output<List<DayOfWeek>> scheduleRunDays) {
            this.scheduleRunDays = scheduleRunDays;
            return this;
        }
        public Builder scheduleRunDays(@Nullable List<DayOfWeek> scheduleRunDays) {
            this.scheduleRunDays = Codegen.ofNullable(scheduleRunDays);
            return this;
        }
        public Builder scheduleRunDays(DayOfWeek... scheduleRunDays) {
            return scheduleRunDays(List.of(scheduleRunDays));
        }
        public Builder scheduleRunFrequency(@Nullable Output<Either<String,ScheduleRunType>> scheduleRunFrequency) {
            this.scheduleRunFrequency = scheduleRunFrequency;
            return this;
        }
        public Builder scheduleRunFrequency(@Nullable Either<String,ScheduleRunType> scheduleRunFrequency) {
            this.scheduleRunFrequency = Codegen.ofNullable(scheduleRunFrequency);
            return this;
        }
        public Builder scheduleRunTimes(@Nullable Output<List<String>> scheduleRunTimes) {
            this.scheduleRunTimes = scheduleRunTimes;
            return this;
        }
        public Builder scheduleRunTimes(@Nullable List<String> scheduleRunTimes) {
            this.scheduleRunTimes = Codegen.ofNullable(scheduleRunTimes);
            return this;
        }
        public Builder scheduleRunTimes(String... scheduleRunTimes) {
            return scheduleRunTimes(List.of(scheduleRunTimes));
        }
        public Builder scheduleWeeklyFrequency(@Nullable Output<Integer> scheduleWeeklyFrequency) {
            this.scheduleWeeklyFrequency = scheduleWeeklyFrequency;
            return this;
        }
        public Builder scheduleWeeklyFrequency(@Nullable Integer scheduleWeeklyFrequency) {
            this.scheduleWeeklyFrequency = Codegen.ofNullable(scheduleWeeklyFrequency);
            return this;
        }        public SimpleSchedulePolicyArgs build() {
            return new SimpleSchedulePolicyArgs(schedulePolicyType, scheduleRunDays, scheduleRunFrequency, scheduleRunTimes, scheduleWeeklyFrequency);
        }
    }
}
