// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.enums.ScheduleFrequency;
import io.pulumi.azurenative.automation.inputs.AdvancedScheduleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of schedule parameters.
 * 
 */
public final class SUCSchedulePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SUCSchedulePropertiesArgs Empty = new SUCSchedulePropertiesArgs();

    /**
     * Gets or sets the advanced schedule.
     * 
     */
    @Import(name="advancedSchedule")
      private final @Nullable Output<AdvancedScheduleArgs> advancedSchedule;

    public Output<AdvancedScheduleArgs> advancedSchedule() {
        return this.advancedSchedule == null ? Codegen.empty() : this.advancedSchedule;
    }

    /**
     * Gets or sets the creation time.
     * 
     */
    @Import(name="creationTime")
      private final @Nullable Output<String> creationTime;

    public Output<String> creationTime() {
        return this.creationTime == null ? Codegen.empty() : this.creationTime;
    }

    /**
     * Gets or sets the description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Gets or sets the end time of the schedule.
     * 
     */
    @Import(name="expiryTime")
      private final @Nullable Output<String> expiryTime;

    public Output<String> expiryTime() {
        return this.expiryTime == null ? Codegen.empty() : this.expiryTime;
    }

    /**
     * Gets or sets the expiry time's offset in minutes.
     * 
     */
    @Import(name="expiryTimeOffsetMinutes")
      private final @Nullable Output<Double> expiryTimeOffsetMinutes;

    public Output<Double> expiryTimeOffsetMinutes() {
        return this.expiryTimeOffsetMinutes == null ? Codegen.empty() : this.expiryTimeOffsetMinutes;
    }

    /**
     * Gets or sets the frequency of the schedule.
     * 
     */
    @Import(name="frequency")
      private final @Nullable Output<Either<String,ScheduleFrequency>> frequency;

    public Output<Either<String,ScheduleFrequency>> frequency() {
        return this.frequency == null ? Codegen.empty() : this.frequency;
    }

    /**
     * Gets or sets the interval of the schedule.
     * 
     */
    @Import(name="interval")
      private final @Nullable Output<Double> interval;

    public Output<Double> interval() {
        return this.interval == null ? Codegen.empty() : this.interval;
    }

    /**
     * Gets or sets a value indicating whether this schedule is enabled.
     * 
     */
    @Import(name="isEnabled")
      private final @Nullable Output<Boolean> isEnabled;

    public Output<Boolean> isEnabled() {
        return this.isEnabled == null ? Codegen.empty() : this.isEnabled;
    }

    /**
     * Gets or sets the last modified time.
     * 
     */
    @Import(name="lastModifiedTime")
      private final @Nullable Output<String> lastModifiedTime;

    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime == null ? Codegen.empty() : this.lastModifiedTime;
    }

    /**
     * Gets or sets the next run time of the schedule.
     * 
     */
    @Import(name="nextRun")
      private final @Nullable Output<String> nextRun;

    public Output<String> nextRun() {
        return this.nextRun == null ? Codegen.empty() : this.nextRun;
    }

    /**
     * Gets or sets the next run time's offset in minutes.
     * 
     */
    @Import(name="nextRunOffsetMinutes")
      private final @Nullable Output<Double> nextRunOffsetMinutes;

    public Output<Double> nextRunOffsetMinutes() {
        return this.nextRunOffsetMinutes == null ? Codegen.empty() : this.nextRunOffsetMinutes;
    }

    /**
     * Gets or sets the start time of the schedule.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    /**
     * Gets or sets the time zone of the schedule.
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> timeZone() {
        return this.timeZone == null ? Codegen.empty() : this.timeZone;
    }

    public SUCSchedulePropertiesArgs(
        @Nullable Output<AdvancedScheduleArgs> advancedSchedule,
        @Nullable Output<String> creationTime,
        @Nullable Output<String> description,
        @Nullable Output<String> expiryTime,
        @Nullable Output<Double> expiryTimeOffsetMinutes,
        @Nullable Output<Either<String,ScheduleFrequency>> frequency,
        @Nullable Output<Double> interval,
        @Nullable Output<Boolean> isEnabled,
        @Nullable Output<String> lastModifiedTime,
        @Nullable Output<String> nextRun,
        @Nullable Output<Double> nextRunOffsetMinutes,
        @Nullable Output<String> startTime,
        @Nullable Output<String> timeZone) {
        this.advancedSchedule = advancedSchedule;
        this.creationTime = creationTime;
        this.description = description;
        this.expiryTime = expiryTime;
        this.expiryTimeOffsetMinutes = expiryTimeOffsetMinutes;
        this.frequency = frequency;
        this.interval = interval;
        this.isEnabled = isEnabled == null ? Codegen.ofNullable(false) : isEnabled;
        this.lastModifiedTime = lastModifiedTime;
        this.nextRun = nextRun;
        this.nextRunOffsetMinutes = nextRunOffsetMinutes;
        this.startTime = startTime;
        this.timeZone = timeZone;
    }

    private SUCSchedulePropertiesArgs() {
        this.advancedSchedule = Codegen.empty();
        this.creationTime = Codegen.empty();
        this.description = Codegen.empty();
        this.expiryTime = Codegen.empty();
        this.expiryTimeOffsetMinutes = Codegen.empty();
        this.frequency = Codegen.empty();
        this.interval = Codegen.empty();
        this.isEnabled = Codegen.empty();
        this.lastModifiedTime = Codegen.empty();
        this.nextRun = Codegen.empty();
        this.nextRunOffsetMinutes = Codegen.empty();
        this.startTime = Codegen.empty();
        this.timeZone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SUCSchedulePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AdvancedScheduleArgs> advancedSchedule;
        private @Nullable Output<String> creationTime;
        private @Nullable Output<String> description;
        private @Nullable Output<String> expiryTime;
        private @Nullable Output<Double> expiryTimeOffsetMinutes;
        private @Nullable Output<Either<String,ScheduleFrequency>> frequency;
        private @Nullable Output<Double> interval;
        private @Nullable Output<Boolean> isEnabled;
        private @Nullable Output<String> lastModifiedTime;
        private @Nullable Output<String> nextRun;
        private @Nullable Output<Double> nextRunOffsetMinutes;
        private @Nullable Output<String> startTime;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(SUCSchedulePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedSchedule = defaults.advancedSchedule;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.expiryTime = defaults.expiryTime;
    	      this.expiryTimeOffsetMinutes = defaults.expiryTimeOffsetMinutes;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.isEnabled = defaults.isEnabled;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.nextRun = defaults.nextRun;
    	      this.nextRunOffsetMinutes = defaults.nextRunOffsetMinutes;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder advancedSchedule(@Nullable Output<AdvancedScheduleArgs> advancedSchedule) {
            this.advancedSchedule = advancedSchedule;
            return this;
        }
        public Builder advancedSchedule(@Nullable AdvancedScheduleArgs advancedSchedule) {
            this.advancedSchedule = Codegen.ofNullable(advancedSchedule);
            return this;
        }
        public Builder creationTime(@Nullable Output<String> creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = Codegen.ofNullable(creationTime);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder expiryTime(@Nullable Output<String> expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public Builder expiryTime(@Nullable String expiryTime) {
            this.expiryTime = Codegen.ofNullable(expiryTime);
            return this;
        }
        public Builder expiryTimeOffsetMinutes(@Nullable Output<Double> expiryTimeOffsetMinutes) {
            this.expiryTimeOffsetMinutes = expiryTimeOffsetMinutes;
            return this;
        }
        public Builder expiryTimeOffsetMinutes(@Nullable Double expiryTimeOffsetMinutes) {
            this.expiryTimeOffsetMinutes = Codegen.ofNullable(expiryTimeOffsetMinutes);
            return this;
        }
        public Builder frequency(@Nullable Output<Either<String,ScheduleFrequency>> frequency) {
            this.frequency = frequency;
            return this;
        }
        public Builder frequency(@Nullable Either<String,ScheduleFrequency> frequency) {
            this.frequency = Codegen.ofNullable(frequency);
            return this;
        }
        public Builder interval(@Nullable Output<Double> interval) {
            this.interval = interval;
            return this;
        }
        public Builder interval(@Nullable Double interval) {
            this.interval = Codegen.ofNullable(interval);
            return this;
        }
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Codegen.ofNullable(isEnabled);
            return this;
        }
        public Builder lastModifiedTime(@Nullable Output<String> lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = Codegen.ofNullable(lastModifiedTime);
            return this;
        }
        public Builder nextRun(@Nullable Output<String> nextRun) {
            this.nextRun = nextRun;
            return this;
        }
        public Builder nextRun(@Nullable String nextRun) {
            this.nextRun = Codegen.ofNullable(nextRun);
            return this;
        }
        public Builder nextRunOffsetMinutes(@Nullable Output<Double> nextRunOffsetMinutes) {
            this.nextRunOffsetMinutes = nextRunOffsetMinutes;
            return this;
        }
        public Builder nextRunOffsetMinutes(@Nullable Double nextRunOffsetMinutes) {
            this.nextRunOffsetMinutes = Codegen.ofNullable(nextRunOffsetMinutes);
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
        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Codegen.ofNullable(timeZone);
            return this;
        }        public SUCSchedulePropertiesArgs build() {
            return new SUCSchedulePropertiesArgs(advancedSchedule, creationTime, description, expiryTime, expiryTimeOffsetMinutes, frequency, interval, isEnabled, lastModifiedTime, nextRun, nextRunOffsetMinutes, startTime, timeZone);
        }
    }
}
