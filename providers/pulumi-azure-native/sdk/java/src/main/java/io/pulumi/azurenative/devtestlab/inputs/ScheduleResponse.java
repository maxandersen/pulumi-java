// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.DayDetailsResponse;
import io.pulumi.azurenative.devtestlab.inputs.HourDetailsResponse;
import io.pulumi.azurenative.devtestlab.inputs.NotificationSettingsResponse;
import io.pulumi.azurenative.devtestlab.inputs.WeekDetailsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A schedule.
 * 
 */
public final class ScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScheduleResponse Empty = new ScheduleResponse();

    /**
     * The creation date of the schedule.
     * 
     */
    @Import(name="createdDate", required=true)
      private final String createdDate;

    public String createdDate() {
        return this.createdDate;
    }

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
     * The identifier of the resource.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable String location;

    public Optional<String> location() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
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
     * The provisioning status of the resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
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
     * The type of the resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @Import(name="uniqueIdentifier", required=true)
      private final String uniqueIdentifier;

    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
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

    public ScheduleResponse(
        String createdDate,
        @Nullable DayDetailsResponse dailyRecurrence,
        @Nullable HourDetailsResponse hourlyRecurrence,
        String id,
        @Nullable String location,
        String name,
        @Nullable NotificationSettingsResponse notificationSettings,
        String provisioningState,
        @Nullable String status,
        @Nullable Map<String,String> tags,
        @Nullable String targetResourceId,
        @Nullable String taskType,
        @Nullable String timeZoneId,
        String type,
        String uniqueIdentifier,
        @Nullable WeekDetailsResponse weeklyRecurrence) {
        this.createdDate = Objects.requireNonNull(createdDate, "expected parameter 'createdDate' to be non-null");
        this.dailyRecurrence = dailyRecurrence;
        this.hourlyRecurrence = hourlyRecurrence;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.notificationSettings = notificationSettings;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.status = status == null ? "Disabled" : status;
        this.tags = tags;
        this.targetResourceId = targetResourceId;
        this.taskType = taskType;
        this.timeZoneId = timeZoneId;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier, "expected parameter 'uniqueIdentifier' to be non-null");
        this.weeklyRecurrence = weeklyRecurrence;
    }

    private ScheduleResponse() {
        this.createdDate = null;
        this.dailyRecurrence = null;
        this.hourlyRecurrence = null;
        this.id = null;
        this.location = null;
        this.name = null;
        this.notificationSettings = null;
        this.provisioningState = null;
        this.status = null;
        this.tags = Map.of();
        this.targetResourceId = null;
        this.taskType = null;
        this.timeZoneId = null;
        this.type = null;
        this.uniqueIdentifier = null;
        this.weeklyRecurrence = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private @Nullable DayDetailsResponse dailyRecurrence;
        private @Nullable HourDetailsResponse hourlyRecurrence;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable NotificationSettingsResponse notificationSettings;
        private String provisioningState;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String targetResourceId;
        private @Nullable String taskType;
        private @Nullable String timeZoneId;
        private String type;
        private String uniqueIdentifier;
        private @Nullable WeekDetailsResponse weeklyRecurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.dailyRecurrence = defaults.dailyRecurrence;
    	      this.hourlyRecurrence = defaults.hourlyRecurrence;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.taskType = defaults.taskType;
    	      this.timeZoneId = defaults.timeZoneId;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.weeklyRecurrence = defaults.weeklyRecurrence;
        }

        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        public Builder dailyRecurrence(@Nullable DayDetailsResponse dailyRecurrence) {
            this.dailyRecurrence = dailyRecurrence;
            return this;
        }
        public Builder hourlyRecurrence(@Nullable HourDetailsResponse hourlyRecurrence) {
            this.hourlyRecurrence = hourlyRecurrence;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notificationSettings(@Nullable NotificationSettingsResponse notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }
        public Builder weeklyRecurrence(@Nullable WeekDetailsResponse weeklyRecurrence) {
            this.weeklyRecurrence = weeklyRecurrence;
            return this;
        }        public ScheduleResponse build() {
            return new ScheduleResponse(createdDate, dailyRecurrence, hourlyRecurrence, id, location, name, notificationSettings, provisioningState, status, tags, targetResourceId, taskType, timeZoneId, type, uniqueIdentifier, weeklyRecurrence);
        }
    }
}
