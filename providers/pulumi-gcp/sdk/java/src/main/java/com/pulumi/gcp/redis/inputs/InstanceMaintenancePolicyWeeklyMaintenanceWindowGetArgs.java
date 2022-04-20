// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs Empty = new InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs();

    /**
     * Required. The day of week that maintenance updates occur.
     * - DAY_OF_WEEK_UNSPECIFIED: The day of the week is unspecified.
     * - MONDAY: Monday
     * - TUESDAY: Tuesday
     * - WEDNESDAY: Wednesday
     * - THURSDAY: Thursday
     * - FRIDAY: Friday
     * - SATURDAY: Saturday
     * - SUNDAY: Sunday
     *   Possible values are `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @Import(name="day", required=true)
      private final Output<String> day;

    public Output<String> day() {
        return this.day;
    }

    /**
     * - 
     * Output only. Duration of the maintenance window.
     * The current window is fixed at 1 hour.
     * A duration in seconds with up to nine fractional digits,
     * terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="duration")
      private final @Nullable Output<String> duration;

    public Output<String> duration() {
        return this.duration == null ? Codegen.empty() : this.duration;
    }

    /**
     * - 
     * Output only. The start time of any upcoming scheduled maintenance for this instance.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @Import(name="startTime", required=true)
      private final Output<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs> startTime;

    public Output<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs> startTime() {
        return this.startTime;
    }

    public InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs(
        Output<String> day,
        @Nullable Output<String> duration,
        Output<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs> startTime) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.duration = duration;
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs() {
        this.day = Codegen.empty();
        this.duration = Codegen.empty();
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> day;
        private @Nullable Output<String> duration;
        private Output<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(Output<String> day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        public Builder day(String day) {
            this.day = Output.of(Objects.requireNonNull(day));
            return this;
        }
        public Builder duration(@Nullable Output<String> duration) {
            this.duration = duration;
            return this;
        }
        public Builder duration(@Nullable String duration) {
            this.duration = Codegen.ofNullable(duration);
            return this;
        }
        public Builder startTime(Output<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder startTime(InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }        public InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs build() {
            return new InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs(day, duration, startTime);
        }
    }
}
