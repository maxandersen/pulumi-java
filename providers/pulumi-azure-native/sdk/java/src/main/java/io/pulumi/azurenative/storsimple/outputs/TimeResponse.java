// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class TimeResponse {
    /**
     * The hour.
     * 
     */
    private final Integer hours;
    /**
     * The minute.
     * 
     */
    private final Integer minutes;
    /**
     * The second.
     * 
     */
    private final Integer seconds;

    @CustomType.Constructor
    private TimeResponse(
        @CustomType.Parameter("hours") Integer hours,
        @CustomType.Parameter("minutes") Integer minutes,
        @CustomType.Parameter("seconds") Integer seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * The hour.
     * 
    */
    public Integer hours() {
        return this.hours;
    }
    /**
     * The minute.
     * 
    */
    public Integer minutes() {
        return this.minutes;
    }
    /**
     * The second.
     * 
    */
    public Integer seconds() {
        return this.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hours;
        private Integer minutes;
        private Integer seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
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
        public Builder seconds(Integer seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }        public TimeResponse build() {
            return new TimeResponse(hours, minutes, seconds);
        }
    }
}
