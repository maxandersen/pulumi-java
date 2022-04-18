// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.inputs.DayDetailsResponse;
import com.pulumi.azurenative.devtestlab.inputs.HourDetailsResponse;
import com.pulumi.azurenative.devtestlab.inputs.NotificationSettingsResponse;
import com.pulumi.azurenative.devtestlab.inputs.WeekDetailsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for creating a schedule.
 * 
 */
public final class ScheduleCreationParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScheduleCreationParameterResponse Empty = new ScheduleCreationParameterResponse();

    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    @Import(name="dailyRecurrence")
      private final @Nullable DayDetailsResponse dailyRecurrence;

    public Optional<DayDetailsResponse> dailyRecurrence() {
        return this.dailyRecurrence == null ? Optional.empty() : Optional.ofNullable(this.dailyRecurrence);
    }

    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    @Import(name="hourlyRecurrence")
      private final @Nullable HourDetailsResponse hourlyRecurrence;

    public Optional<HourDetailsResponse> hourlyRecurrence() {
        return this.hourlyRecurrence == null ? Optional.empty() : Optional.ofNullable(this.hourlyRecurrence);
    }

    /**
     * The location of the new virtual machine or environment
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    /**
     * The name of the virtual machine or environment
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Notification settings.
     * 
     */
    @Import(name="notificationSettings")
      private final @Nullable NotificationSettingsResponse notificationSettings;

    public Optional<NotificationSettingsResponse> notificationSettings() {
        return this.notificationSettings == null ? Optional.empty() : Optional.ofNullable(this.notificationSettings);
    }

    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * The resource ID to which the schedule belongs
     * 
     */
    @Import(name="targetResourceId")
      private final @Nullable String targetResourceId;

    public Optional<String> targetResourceId() {
        return this.targetResourceId == null ? Optional.empty() : Optional.ofNullable(this.targetResourceId);
    }

    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    @Import(name="taskType")
      private final @Nullable String taskType;

    public Optional<String> taskType() {
        return this.taskType == null ? Optional.empty() : Optional.ofNullable(this.taskType);
    }

    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
     */
    @Import(name="timeZoneId")
      private final @Nullable String timeZoneId;

    public Optional<String> timeZoneId() {
        return this.timeZoneId == null ? Optional.empty() : Optional.ofNullable(this.timeZoneId);
    }

    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    @Import(name="weeklyRecurrence")
      private final @Nullable WeekDetailsResponse weeklyRecurrence;

    public Optional<WeekDetailsResponse> weeklyRecurrence() {
        return this.weeklyRecurrence == null ? Optional.empty() : Optional.ofNullable(this.weeklyRecurrence);
    }

    public ScheduleCreationParameterResponse(
        @Nullable DayDetailsResponse dailyRecurrence,
        @Nullable HourDetailsResponse hourlyRecurrence,
        String location,
        @Nullable String name,
        @Nullable NotificationSettingsResponse notificationSettings,
        @Nullable String status,
        @Nullable Map<String,String> tags,
        @Nullable String targetResourceId,
        @Nullable String taskType,
        @Nullable String timeZoneId,
        @Nullable WeekDetailsResponse weeklyRecurrence) {
        this.dailyRecurrence = dailyRecurrence;
        this.hourlyRecurrence = hourlyRecurrence;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.notificationSettings = notificationSettings;
        this.status = status == null ? "Disabled" : status;
        this.tags = tags;
        this.targetResourceId = targetResourceId;
        this.taskType = taskType;
        this.timeZoneId = timeZoneId;
        this.weeklyRecurrence = weeklyRecurrence;
    }

    private ScheduleCreationParameterResponse() {
        this.dailyRecurrence = null;
        this.hourlyRecurrence = null;
        this.location = null;
        this.name = null;
        this.notificationSettings = null;
        this.status = null;
        this.tags = Map.of();
        this.targetResourceId = null;
        this.taskType = null;
        this.timeZoneId = null;
        this.weeklyRecurrence = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleCreationParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DayDetailsResponse dailyRecurrence;
        private @Nullable HourDetailsResponse hourlyRecurrence;
        private String location;
        private @Nullable String name;
        private @Nullable NotificationSettingsResponse notificationSettings;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String targetResourceId;
        private @Nullable String taskType;
        private @Nullable String timeZoneId;
        private @Nullable WeekDetailsResponse weeklyRecurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleCreationParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyRecurrence = defaults.dailyRecurrence;
    	      this.hourlyRecurrence = defaults.hourlyRecurrence;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.taskType = defaults.taskType;
    	      this.timeZoneId = defaults.timeZoneId;
    	      this.weeklyRecurrence = defaults.weeklyRecurrence;
        }

        public Builder dailyRecurrence(@Nullable DayDetailsResponse dailyRecurrence) {
            this.dailyRecurrence = dailyRecurrence;
            return this;
        }
        public Builder hourlyRecurrence(@Nullable HourDetailsResponse hourlyRecurrence) {
            this.hourlyRecurrence = hourlyRecurrence;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder notificationSettings(@Nullable NotificationSettingsResponse notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder targetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }
        public Builder taskType(@Nullable String taskType) {
            this.taskType = taskType;
            return this;
        }
        public Builder timeZoneId(@Nullable String timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }
        public Builder weeklyRecurrence(@Nullable WeekDetailsResponse weeklyRecurrence) {
            this.weeklyRecurrence = weeklyRecurrence;
            return this;
        }        public ScheduleCreationParameterResponse build() {
            return new ScheduleCreationParameterResponse(dailyRecurrence, hourlyRecurrence, location, name, notificationSettings, status, tags, targetResourceId, taskType, timeZoneId, weeklyRecurrence);
        }
    }
}
