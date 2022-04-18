// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduleResponse {
    /**
     * The duration of time between executions in days.
     * 
     */
    private final Integer intervalDurationDays;
    /**
     * A timestamp indicates when the next run will be scheduled. The value is refreshed by the server after each run. If unspecified, it will default to current server time, which means the scan will be scheduled to start immediately.
     * 
     */
    private final String scheduleTime;

    @CustomType.Constructor
    private ScheduleResponse(
        @CustomType.Parameter("intervalDurationDays") Integer intervalDurationDays,
        @CustomType.Parameter("scheduleTime") String scheduleTime) {
        this.intervalDurationDays = intervalDurationDays;
        this.scheduleTime = scheduleTime;
    }

    /**
     * The duration of time between executions in days.
     * 
    */
    public Integer intervalDurationDays() {
        return this.intervalDurationDays;
    }
    /**
     * A timestamp indicates when the next run will be scheduled. The value is refreshed by the server after each run. If unspecified, it will default to current server time, which means the scan will be scheduled to start immediately.
     * 
    */
    public String scheduleTime() {
        return this.scheduleTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer intervalDurationDays;
        private String scheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalDurationDays = defaults.intervalDurationDays;
    	      this.scheduleTime = defaults.scheduleTime;
        }

        public Builder intervalDurationDays(Integer intervalDurationDays) {
            this.intervalDurationDays = Objects.requireNonNull(intervalDurationDays);
            return this;
        }
        public Builder scheduleTime(String scheduleTime) {
            this.scheduleTime = Objects.requireNonNull(scheduleTime);
            return this;
        }        public ScheduleResponse build() {
            return new ScheduleResponse(intervalDurationDays, scheduleTime);
        }
    }
}
