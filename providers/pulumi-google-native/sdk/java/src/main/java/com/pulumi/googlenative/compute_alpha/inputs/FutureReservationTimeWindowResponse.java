// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.DurationResponse;
import java.lang.String;
import java.util.Objects;


public final class FutureReservationTimeWindowResponse extends com.pulumi.resources.InvokeArgs {

    public static final FutureReservationTimeWindowResponse Empty = new FutureReservationTimeWindowResponse();

    @Import(name="duration", required=true)
      private final DurationResponse duration;

    public DurationResponse duration() {
        return this.duration;
    }

    @Import(name="endTime", required=true)
      private final String endTime;

    public String endTime() {
        return this.endTime;
    }

    /**
     * Start time of the Future Reservation. The start_time is an RFC3339 string.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    public FutureReservationTimeWindowResponse(
        DurationResponse duration,
        String endTime,
        String startTime) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private FutureReservationTimeWindowResponse() {
        this.duration = null;
        this.endTime = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FutureReservationTimeWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse duration;
        private String endTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(FutureReservationTimeWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder duration(DurationResponse duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public FutureReservationTimeWindowResponse build() {
            return new FutureReservationTimeWindowResponse(duration, endTime, startTime);
        }
    }
}
