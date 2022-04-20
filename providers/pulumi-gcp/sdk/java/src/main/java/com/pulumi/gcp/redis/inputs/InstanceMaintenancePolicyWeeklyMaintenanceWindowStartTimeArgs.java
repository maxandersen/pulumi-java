// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs Empty = new InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs();

    /**
     * Hours of day in 24 hour format. Should be from 0 to 23.
     * An API may choose to allow the value &#34;24:00:00&#34; for scenarios like business closing time.
     * 
     */
    @Import(name="hours")
      private final @Nullable Output<Integer> hours;

    public Output<Integer> hours() {
        return this.hours == null ? Codegen.empty() : this.hours;
    }

    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    @Import(name="minutes")
      private final @Nullable Output<Integer> minutes;

    public Output<Integer> minutes() {
        return this.minutes == null ? Codegen.empty() : this.minutes;
    }

    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    @Import(name="nanos")
      private final @Nullable Output<Integer> nanos;

    public Output<Integer> nanos() {
        return this.nanos == null ? Codegen.empty() : this.nanos;
    }

    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59.
     * An API may allow the value 60 if it allows leap-seconds.
     * 
     */
    @Import(name="seconds")
      private final @Nullable Output<Integer> seconds;

    public Output<Integer> seconds() {
        return this.seconds == null ? Codegen.empty() : this.seconds;
    }

    public InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs(
        @Nullable Output<Integer> hours,
        @Nullable Output<Integer> minutes,
        @Nullable Output<Integer> nanos,
        @Nullable Output<Integer> seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.nanos = nanos;
        this.seconds = seconds;
    }

    private InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs() {
        this.hours = Codegen.empty();
        this.minutes = Codegen.empty();
        this.nanos = Codegen.empty();
        this.seconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> hours;
        private @Nullable Output<Integer> minutes;
        private @Nullable Output<Integer> nanos;
        private @Nullable Output<Integer> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder hours(@Nullable Output<Integer> hours) {
            this.hours = hours;
            return this;
        }
        public Builder hours(@Nullable Integer hours) {
            this.hours = Codegen.ofNullable(hours);
            return this;
        }
        public Builder minutes(@Nullable Output<Integer> minutes) {
            this.minutes = minutes;
            return this;
        }
        public Builder minutes(@Nullable Integer minutes) {
            this.minutes = Codegen.ofNullable(minutes);
            return this;
        }
        public Builder nanos(@Nullable Output<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }
        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = Codegen.ofNullable(nanos);
            return this;
        }
        public Builder seconds(@Nullable Output<Integer> seconds) {
            this.seconds = seconds;
            return this;
        }
        public Builder seconds(@Nullable Integer seconds) {
            this.seconds = Codegen.ofNullable(seconds);
            return this;
        }        public InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs build() {
            return new InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeArgs(hours, minutes, nanos, seconds);
        }
    }
}
