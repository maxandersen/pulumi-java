// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.enums.EnableStatus;
import io.pulumi.azurenative.devtestlab.inputs.DayDetailsArgs;
import io.pulumi.azurenative.devtestlab.inputs.HourDetailsArgs;
import io.pulumi.azurenative.devtestlab.inputs.NotificationSettingsArgs;
import io.pulumi.azurenative.devtestlab.inputs.WeekDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    @Import(name="dailyRecurrence")
      private final @Nullable Output<DayDetailsArgs> dailyRecurrence;

    public Output<DayDetailsArgs> dailyRecurrence() {
        return this.dailyRecurrence == null ? Codegen.empty() : this.dailyRecurrence;
    }

    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    @Import(name="hourlyRecurrence")
      private final @Nullable Output<HourDetailsArgs> hourlyRecurrence;

    public Output<HourDetailsArgs> hourlyRecurrence() {
        return this.hourlyRecurrence == null ? Codegen.empty() : this.hourlyRecurrence;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
      private final Output<String> labName;

    public Output<String> labName() {
        return this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the schedule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Notification settings.
     * 
     */
    @Import(name="notificationSettings")
      private final @Nullable Output<NotificationSettingsArgs> notificationSettings;

    public Output<NotificationSettingsArgs> notificationSettings() {
        return this.notificationSettings == null ? Codegen.empty() : this.notificationSettings;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Either<String,EnableStatus>> status;

    public Output<Either<String,EnableStatus>> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The resource ID to which the schedule belongs
     * 
     */
    @Import(name="targetResourceId")
      private final @Nullable Output<String> targetResourceId;

    public Output<String> targetResourceId() {
        return this.targetResourceId == null ? Codegen.empty() : this.targetResourceId;
    }

    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    @Import(name="taskType")
      private final @Nullable Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType == null ? Codegen.empty() : this.taskType;
    }

    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
     */
    @Import(name="timeZoneId")
      private final @Nullable Output<String> timeZoneId;

    public Output<String> timeZoneId() {
        return this.timeZoneId == null ? Codegen.empty() : this.timeZoneId;
    }

    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    @Import(name="weeklyRecurrence")
      private final @Nullable Output<WeekDetailsArgs> weeklyRecurrence;

    public Output<WeekDetailsArgs> weeklyRecurrence() {
        return this.weeklyRecurrence == null ? Codegen.empty() : this.weeklyRecurrence;
    }

    public ScheduleArgs(
        @Nullable Output<DayDetailsArgs> dailyRecurrence,
        @Nullable Output<HourDetailsArgs> hourlyRecurrence,
        Output<String> labName,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<NotificationSettingsArgs> notificationSettings,
        Output<String> resourceGroupName,
        @Nullable Output<Either<String,EnableStatus>> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> targetResourceId,
        @Nullable Output<String> taskType,
        @Nullable Output<String> timeZoneId,
        @Nullable Output<WeekDetailsArgs> weeklyRecurrence) {
        this.dailyRecurrence = dailyRecurrence;
        this.hourlyRecurrence = hourlyRecurrence;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.name = name;
        this.notificationSettings = notificationSettings;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.status = status == null ? Output.ofLeft("Disabled") : status;
        this.tags = tags;
        this.targetResourceId = targetResourceId;
        this.taskType = taskType;
        this.timeZoneId = timeZoneId;
        this.weeklyRecurrence = weeklyRecurrence;
    }

    private ScheduleArgs() {
        this.dailyRecurrence = Codegen.empty();
        this.hourlyRecurrence = Codegen.empty();
        this.labName = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.notificationSettings = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.status = Codegen.empty();
        this.tags = Codegen.empty();
        this.targetResourceId = Codegen.empty();
        this.taskType = Codegen.empty();
        this.timeZoneId = Codegen.empty();
        this.weeklyRecurrence = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DayDetailsArgs> dailyRecurrence;
        private @Nullable Output<HourDetailsArgs> hourlyRecurrence;
        private Output<String> labName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<NotificationSettingsArgs> notificationSettings;
        private Output<String> resourceGroupName;
        private @Nullable Output<Either<String,EnableStatus>> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> targetResourceId;
        private @Nullable Output<String> taskType;
        private @Nullable Output<String> timeZoneId;
        private @Nullable Output<WeekDetailsArgs> weeklyRecurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyRecurrence = defaults.dailyRecurrence;
    	      this.hourlyRecurrence = defaults.hourlyRecurrence;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.taskType = defaults.taskType;
    	      this.timeZoneId = defaults.timeZoneId;
    	      this.weeklyRecurrence = defaults.weeklyRecurrence;
        }

        public Builder dailyRecurrence(@Nullable Output<DayDetailsArgs> dailyRecurrence) {
            this.dailyRecurrence = dailyRecurrence;
            return this;
        }
        public Builder dailyRecurrence(@Nullable DayDetailsArgs dailyRecurrence) {
            this.dailyRecurrence = Codegen.ofNullable(dailyRecurrence);
            return this;
        }
        public Builder hourlyRecurrence(@Nullable Output<HourDetailsArgs> hourlyRecurrence) {
            this.hourlyRecurrence = hourlyRecurrence;
            return this;
        }
        public Builder hourlyRecurrence(@Nullable HourDetailsArgs hourlyRecurrence) {
            this.hourlyRecurrence = Codegen.ofNullable(hourlyRecurrence);
            return this;
        }
        public Builder labName(Output<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }
        public Builder labName(String labName) {
            this.labName = Output.of(Objects.requireNonNull(labName));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder notificationSettings(@Nullable Output<NotificationSettingsArgs> notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }
        public Builder notificationSettings(@Nullable NotificationSettingsArgs notificationSettings) {
            this.notificationSettings = Codegen.ofNullable(notificationSettings);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder status(@Nullable Output<Either<String,EnableStatus>> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable Either<String,EnableStatus> status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder targetResourceId(@Nullable Output<String> targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }
        public Builder targetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = Codegen.ofNullable(targetResourceId);
            return this;
        }
        public Builder taskType(@Nullable Output<String> taskType) {
            this.taskType = taskType;
            return this;
        }
        public Builder taskType(@Nullable String taskType) {
            this.taskType = Codegen.ofNullable(taskType);
            return this;
        }
        public Builder timeZoneId(@Nullable Output<String> timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }
        public Builder timeZoneId(@Nullable String timeZoneId) {
            this.timeZoneId = Codegen.ofNullable(timeZoneId);
            return this;
        }
        public Builder weeklyRecurrence(@Nullable Output<WeekDetailsArgs> weeklyRecurrence) {
            this.weeklyRecurrence = weeklyRecurrence;
            return this;
        }
        public Builder weeklyRecurrence(@Nullable WeekDetailsArgs weeklyRecurrence) {
            this.weeklyRecurrence = Codegen.ofNullable(weeklyRecurrence);
            return this;
        }        public ScheduleArgs build() {
            return new ScheduleArgs(dailyRecurrence, hourlyRecurrence, labName, location, name, notificationSettings, resourceGroupName, status, tags, targetResourceId, taskType, timeZoneId, weeklyRecurrence);
        }
    }
}
