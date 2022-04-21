// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.inputs.TimeWindowArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents an arbitrary window of time that recurs.
 * 
 */
public final class RecurringTimeWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecurringTimeWindowArgs Empty = new RecurringTimeWindowArgs();

    /**
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how this window reccurs. They go on for the span of time between the start and end time. For example, to have something repeat every weekday, you&#39;d use: `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR` To repeat some window daily (equivalent to the DailyMaintenanceWindow): `FREQ=DAILY` For the first weekend of every month: `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU` This specifies how frequently the window starts. Eg, if you wanted to have a 9-5 UTC-4 window every weekday, you&#39;d use something like: ```start time = 2019-01-01T09:00:00-0400 end time = 2019-01-01T17:00:00-0400 recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR``` Windows can span multiple days. Eg, to make the window encompass every weekend from midnight Saturday till the last minute of Sunday UTC: ```start time = 2019-01-05T00:00:00Z end time = 2019-01-07T23:59:00Z recurrence = FREQ=WEEKLY;BYDAY=SA``` Note the start and end time&#39;s specific dates are largely arbitrary except to specify duration of the window and when it first starts. The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * 
     */
    @Import(name="recurrence")
    private @Nullable Output<String> recurrence;

    public Optional<Output<String>> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    /**
     * The window of the first recurrence.
     * 
     */
    @Import(name="window")
    private @Nullable Output<TimeWindowArgs> window;

    public Optional<Output<TimeWindowArgs>> window() {
        return Optional.ofNullable(this.window);
    }

    private RecurringTimeWindowArgs() {}

    private RecurringTimeWindowArgs(RecurringTimeWindowArgs $) {
        this.recurrence = $.recurrence;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecurringTimeWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecurringTimeWindowArgs $;

        public Builder() {
            $ = new RecurringTimeWindowArgs();
        }

        public Builder(RecurringTimeWindowArgs defaults) {
            $ = new RecurringTimeWindowArgs(Objects.requireNonNull(defaults));
        }

        public Builder recurrence(@Nullable Output<String> recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        public Builder recurrence(String recurrence) {
            return recurrence(Output.of(recurrence));
        }

        public Builder window(@Nullable Output<TimeWindowArgs> window) {
            $.window = window;
            return this;
        }

        public Builder window(TimeWindowArgs window) {
            return window(Output.of(window));
        }

        public RecurringTimeWindowArgs build() {
            return $;
        }
    }

}
