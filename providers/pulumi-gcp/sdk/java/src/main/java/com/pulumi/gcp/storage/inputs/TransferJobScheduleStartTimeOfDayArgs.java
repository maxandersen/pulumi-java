// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class TransferJobScheduleStartTimeOfDayArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferJobScheduleStartTimeOfDayArgs Empty = new TransferJobScheduleStartTimeOfDayArgs();

    /**
     * Hours of day in 24 hour format. Should be from 0 to 23
     * 
     */
    @Import(name="hours", required=true)
    private Output<Integer> hours;

    public Output<Integer> hours() {
        return this.hours;
    }

    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    @Import(name="minutes", required=true)
    private Output<Integer> minutes;

    public Output<Integer> minutes() {
        return this.minutes;
    }

    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    @Import(name="nanos", required=true)
    private Output<Integer> nanos;

    public Output<Integer> nanos() {
        return this.nanos;
    }

    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59.
     * 
     */
    @Import(name="seconds", required=true)
    private Output<Integer> seconds;

    public Output<Integer> seconds() {
        return this.seconds;
    }

    private TransferJobScheduleStartTimeOfDayArgs() {}

    private TransferJobScheduleStartTimeOfDayArgs(TransferJobScheduleStartTimeOfDayArgs $) {
        this.hours = $.hours;
        this.minutes = $.minutes;
        this.nanos = $.nanos;
        this.seconds = $.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferJobScheduleStartTimeOfDayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferJobScheduleStartTimeOfDayArgs $;

        public Builder() {
            $ = new TransferJobScheduleStartTimeOfDayArgs();
        }

        public Builder(TransferJobScheduleStartTimeOfDayArgs defaults) {
            $ = new TransferJobScheduleStartTimeOfDayArgs(Objects.requireNonNull(defaults));
        }

        public Builder hours(Output<Integer> hours) {
            $.hours = hours;
            return this;
        }

        public Builder hours(Integer hours) {
            return hours(Output.of(hours));
        }

        public Builder minutes(Output<Integer> minutes) {
            $.minutes = minutes;
            return this;
        }

        public Builder minutes(Integer minutes) {
            return minutes(Output.of(minutes));
        }

        public Builder nanos(Output<Integer> nanos) {
            $.nanos = nanos;
            return this;
        }

        public Builder nanos(Integer nanos) {
            return nanos(Output.of(nanos));
        }

        public Builder seconds(Output<Integer> seconds) {
            $.seconds = seconds;
            return this;
        }

        public Builder seconds(Integer seconds) {
            return seconds(Output.of(seconds));
        }

        public TransferJobScheduleStartTimeOfDayArgs build() {
            $.hours = Objects.requireNonNull($.hours, "expected parameter 'hours' to be non-null");
            $.minutes = Objects.requireNonNull($.minutes, "expected parameter 'minutes' to be non-null");
            $.nanos = Objects.requireNonNull($.nanos, "expected parameter 'nanos' to be non-null");
            $.seconds = Objects.requireNonNull($.seconds, "expected parameter 'seconds' to be non-null");
            return $;
        }
    }

}
