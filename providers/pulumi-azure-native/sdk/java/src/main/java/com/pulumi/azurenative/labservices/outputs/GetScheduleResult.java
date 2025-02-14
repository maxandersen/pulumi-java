// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.outputs;

import com.pulumi.azurenative.labservices.outputs.RecurrencePatternResponse;
import com.pulumi.azurenative.labservices.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScheduleResult {
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Notes for this schedule.
     * 
     */
    private final @Nullable String notes;
    /**
     * @return Current provisioning state of the schedule.
     * 
     */
    private final String provisioningState;
    /**
     * @return The recurrence pattern of the scheduled actions.
     * 
     */
    private final @Nullable RecurrencePatternResponse recurrencePattern;
    /**
     * @return When lab user virtual machines will be started. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    private final @Nullable String startAt;
    /**
     * @return When lab user virtual machines will be stopped. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    private final String stopAt;
    /**
     * @return Metadata pertaining to creation and last modification of the schedule.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The IANA timezone id for the schedule.
     * 
     */
    private final String timeZoneId;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetScheduleResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notes") @Nullable String notes,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("recurrencePattern") @Nullable RecurrencePatternResponse recurrencePattern,
        @CustomType.Parameter("startAt") @Nullable String startAt,
        @CustomType.Parameter("stopAt") String stopAt,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("timeZoneId") String timeZoneId,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.notes = notes;
        this.provisioningState = provisioningState;
        this.recurrencePattern = recurrencePattern;
        this.startAt = startAt;
        this.stopAt = stopAt;
        this.systemData = systemData;
        this.timeZoneId = timeZoneId;
        this.type = type;
    }

    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Notes for this schedule.
     * 
     */
    public Optional<String> notes() {
        return Optional.ofNullable(this.notes);
    }
    /**
     * @return Current provisioning state of the schedule.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The recurrence pattern of the scheduled actions.
     * 
     */
    public Optional<RecurrencePatternResponse> recurrencePattern() {
        return Optional.ofNullable(this.recurrencePattern);
    }
    /**
     * @return When lab user virtual machines will be started. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    public Optional<String> startAt() {
        return Optional.ofNullable(this.startAt);
    }
    /**
     * @return When lab user virtual machines will be stopped. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    public String stopAt() {
        return this.stopAt;
    }
    /**
     * @return Metadata pertaining to creation and last modification of the schedule.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The IANA timezone id for the schedule.
     * 
     */
    public String timeZoneId() {
        return this.timeZoneId;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable String notes;
        private String provisioningState;
        private @Nullable RecurrencePatternResponse recurrencePattern;
        private @Nullable String startAt;
        private String stopAt;
        private SystemDataResponse systemData;
        private String timeZoneId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.provisioningState = defaults.provisioningState;
    	      this.recurrencePattern = defaults.recurrencePattern;
    	      this.startAt = defaults.startAt;
    	      this.stopAt = defaults.stopAt;
    	      this.systemData = defaults.systemData;
    	      this.timeZoneId = defaults.timeZoneId;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notes(@Nullable String notes) {
            this.notes = notes;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder recurrencePattern(@Nullable RecurrencePatternResponse recurrencePattern) {
            this.recurrencePattern = recurrencePattern;
            return this;
        }
        public Builder startAt(@Nullable String startAt) {
            this.startAt = startAt;
            return this;
        }
        public Builder stopAt(String stopAt) {
            this.stopAt = Objects.requireNonNull(stopAt);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder timeZoneId(String timeZoneId) {
            this.timeZoneId = Objects.requireNonNull(timeZoneId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetScheduleResult build() {
            return new GetScheduleResult(id, name, notes, provisioningState, recurrencePattern, startAt, stopAt, systemData, timeZoneId, type);
        }
    }
}
