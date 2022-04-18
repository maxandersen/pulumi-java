// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.azurenative.storsimple.enums.DayOfWeek;
import com.pulumi.azurenative.storsimple.inputs.TimeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * The schedule for bandwidth setting.
 * 
 */
public final class BandwidthScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BandwidthScheduleArgs Empty = new BandwidthScheduleArgs();

    /**
     * The days of the week when this schedule is applicable.
     * 
     */
    @Import(name="days", required=true)
      private final Output<List<DayOfWeek>> days;

    public Output<List<DayOfWeek>> days() {
        return this.days;
    }

    /**
     * The rate in Mbps.
     * 
     */
    @Import(name="rateInMbps", required=true)
      private final Output<Integer> rateInMbps;

    public Output<Integer> rateInMbps() {
        return this.rateInMbps;
    }

    /**
     * The start time of the schedule.
     * 
     */
    @Import(name="start", required=true)
      private final Output<TimeArgs> start;

    public Output<TimeArgs> start() {
        return this.start;
    }

    /**
     * The stop time of the schedule.
     * 
     */
    @Import(name="stop", required=true)
      private final Output<TimeArgs> stop;

    public Output<TimeArgs> stop() {
        return this.stop;
    }

    public BandwidthScheduleArgs(
        Output<List<DayOfWeek>> days,
        Output<Integer> rateInMbps,
        Output<TimeArgs> start,
        Output<TimeArgs> stop) {
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
        this.rateInMbps = Objects.requireNonNull(rateInMbps, "expected parameter 'rateInMbps' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
        this.stop = Objects.requireNonNull(stop, "expected parameter 'stop' to be non-null");
    }

    private BandwidthScheduleArgs() {
        this.days = Codegen.empty();
        this.rateInMbps = Codegen.empty();
        this.start = Codegen.empty();
        this.stop = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BandwidthScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<DayOfWeek>> days;
        private Output<Integer> rateInMbps;
        private Output<TimeArgs> start;
        private Output<TimeArgs> stop;

        public Builder() {
    	      // Empty
        }

        public Builder(BandwidthScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.rateInMbps = defaults.rateInMbps;
    	      this.start = defaults.start;
    	      this.stop = defaults.stop;
        }

        public Builder days(Output<List<DayOfWeek>> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder days(List<DayOfWeek> days) {
            this.days = Output.of(Objects.requireNonNull(days));
            return this;
        }
        public Builder days(DayOfWeek... days) {
            return days(List.of(days));
        }
        public Builder rateInMbps(Output<Integer> rateInMbps) {
            this.rateInMbps = Objects.requireNonNull(rateInMbps);
            return this;
        }
        public Builder rateInMbps(Integer rateInMbps) {
            this.rateInMbps = Output.of(Objects.requireNonNull(rateInMbps));
            return this;
        }
        public Builder start(Output<TimeArgs> start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public Builder start(TimeArgs start) {
            this.start = Output.of(Objects.requireNonNull(start));
            return this;
        }
        public Builder stop(Output<TimeArgs> stop) {
            this.stop = Objects.requireNonNull(stop);
            return this;
        }
        public Builder stop(TimeArgs stop) {
            this.stop = Output.of(Objects.requireNonNull(stop));
            return this;
        }        public BandwidthScheduleArgs build() {
            return new BandwidthScheduleArgs(days, rateInMbps, start, stop);
        }
    }
}
