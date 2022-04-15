// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class TimeOfDayResponse {
    /**
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value "24:00:00" for scenarios like business closing time.
     * 
     */
    private final Integer hours;
    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    private final Integer minutes;
    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    private final Integer nanos;
    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
     * 
     */
    private final Integer seconds;

    @CustomType.Constructor
    private TimeOfDayResponse(
        @CustomType.Parameter("hours") Integer hours,
        @CustomType.Parameter("minutes") Integer minutes,
        @CustomType.Parameter("nanos") Integer nanos,
        @CustomType.Parameter("seconds") Integer seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.nanos = nanos;
        this.seconds = seconds;
    }

    /**
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value "24:00:00" for scenarios like business closing time.
     * 
    */
    public Integer hours() {
        return this.hours;
    }
    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
    */
    public Integer minutes() {
        return this.minutes;
    }
    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
    */
    public Integer nanos() {
        return this.nanos;
    }
    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
     * 
    */
    public Integer seconds() {
        return this.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeOfDayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hours;
        private Integer minutes;
        private Integer nanos;
        private Integer seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeOfDayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder hours(Integer hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }
        public Builder minutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public Builder nanos(Integer nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }
        public Builder seconds(Integer seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }        public TimeOfDayResponse build() {
            return new TimeOfDayResponse(hours, minutes, nanos, seconds);
        }
    }
}
