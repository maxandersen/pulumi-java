// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceMaintenanceScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceMaintenanceScheduleArgs Empty = new InstanceMaintenanceScheduleArgs();

    /**
     * - 
     * Output only. The end time of any upcoming scheduled maintenance for this instance.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> endTime() {
        return this.endTime == null ? Codegen.empty() : this.endTime;
    }

    /**
     * - 
     * Output only. The deadline that the maintenance schedule start time
     * can not go beyond, including reschedule.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @Import(name="scheduleDeadlineTime")
      private final @Nullable Output<String> scheduleDeadlineTime;

    public Output<String> scheduleDeadlineTime() {
        return this.scheduleDeadlineTime == null ? Codegen.empty() : this.scheduleDeadlineTime;
    }

    /**
     * - 
     * Output only. The start time of any upcoming scheduled maintenance for this instance.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    public InstanceMaintenanceScheduleArgs(
        @Nullable Output<String> endTime,
        @Nullable Output<String> scheduleDeadlineTime,
        @Nullable Output<String> startTime) {
        this.endTime = endTime;
        this.scheduleDeadlineTime = scheduleDeadlineTime;
        this.startTime = startTime;
    }

    private InstanceMaintenanceScheduleArgs() {
        this.endTime = Codegen.empty();
        this.scheduleDeadlineTime = Codegen.empty();
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMaintenanceScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endTime;
        private @Nullable Output<String> scheduleDeadlineTime;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMaintenanceScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.scheduleDeadlineTime = defaults.scheduleDeadlineTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = Codegen.ofNullable(endTime);
            return this;
        }
        public Builder scheduleDeadlineTime(@Nullable Output<String> scheduleDeadlineTime) {
            this.scheduleDeadlineTime = scheduleDeadlineTime;
            return this;
        }
        public Builder scheduleDeadlineTime(@Nullable String scheduleDeadlineTime) {
            this.scheduleDeadlineTime = Codegen.ofNullable(scheduleDeadlineTime);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }        public InstanceMaintenanceScheduleArgs build() {
            return new InstanceMaintenanceScheduleArgs(endTime, scheduleDeadlineTime, startTime);
        }
    }
}
