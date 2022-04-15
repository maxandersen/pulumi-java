// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobScheduleResponse {
    /**
     * Whether or not the schedule is enabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Schedule end time.
     * 
     */
    private final @Nullable String endTime;
    /**
     * Value of the schedule's recurring interval, if the ScheduleType is recurring. ISO8601 duration format.
     * 
     */
    private final @Nullable String interval;
    /**
     * Schedule start time.
     * 
     */
    private final @Nullable String startTime;
    /**
     * Schedule interval type
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private JobScheduleResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("endTime") @Nullable String endTime,
        @CustomType.Parameter("interval") @Nullable String interval,
        @CustomType.Parameter("startTime") @Nullable String startTime,
        @CustomType.Parameter("type") @Nullable String type) {
        this.enabled = enabled;
        this.endTime = endTime;
        this.interval = interval;
        this.startTime = startTime;
        this.type = type;
    }

    /**
     * Whether or not the schedule is enabled.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Schedule end time.
     * 
    */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * Value of the schedule's recurring interval, if the ScheduleType is recurring. ISO8601 duration format.
     * 
    */
    public Optional<String> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * Schedule start time.
     * 
    */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * Schedule interval type
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String endTime;
        private @Nullable String interval;
        private @Nullable String startTime;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.endTime = defaults.endTime;
    	      this.interval = defaults.interval;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder interval(@Nullable String interval) {
            this.interval = interval;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public JobScheduleResponse build() {
            return new JobScheduleResponse(enabled, endTime, interval, startTime, type);
        }
    }
}
