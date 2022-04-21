// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.enums.RecurrenceFrequency;
import com.pulumi.azurenative.insights.inputs.RecurrentScheduleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The repeating times at which this profile begins. This element is not used if the FixedDate element is used.
 * 
 */
public final class RecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecurrenceArgs Empty = new RecurrenceArgs();

    /**
     * the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
     * 
     */
    @Import(name="frequency", required=true)
    private Output<RecurrenceFrequency> frequency;

    public Output<RecurrenceFrequency> frequency() {
        return this.frequency;
    }

    /**
     * the scheduling constraints for when the profile begins.
     * 
     */
    @Import(name="schedule", required=true)
    private Output<RecurrentScheduleArgs> schedule;

    public Output<RecurrentScheduleArgs> schedule() {
        return this.schedule;
    }

    private RecurrenceArgs() {}

    private RecurrenceArgs(RecurrenceArgs $) {
        this.frequency = $.frequency;
        this.schedule = $.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecurrenceArgs $;

        public Builder() {
            $ = new RecurrenceArgs();
        }

        public Builder(RecurrenceArgs defaults) {
            $ = new RecurrenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder frequency(Output<RecurrenceFrequency> frequency) {
            $.frequency = frequency;
            return this;
        }

        public Builder frequency(RecurrenceFrequency frequency) {
            return frequency(Output.of(frequency));
        }

        public Builder schedule(Output<RecurrentScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        public Builder schedule(RecurrentScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        public RecurrenceArgs build() {
            $.frequency = Objects.requireNonNull($.frequency, "expected parameter 'frequency' to be non-null");
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            return $;
        }
    }

}
