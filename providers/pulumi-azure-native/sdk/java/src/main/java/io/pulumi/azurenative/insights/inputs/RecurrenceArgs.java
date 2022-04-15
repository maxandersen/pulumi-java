// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.RecurrenceFrequency;
import io.pulumi.azurenative.insights.inputs.RecurrentScheduleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * The repeating times at which this profile begins. This element is not used if the FixedDate element is used.
 * 
 */
public final class RecurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecurrenceArgs Empty = new RecurrenceArgs();

    /**
     * the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
     * 
     */
    @Import(name="frequency", required=true)
      private final Output<RecurrenceFrequency> frequency;

    public Output<RecurrenceFrequency> frequency() {
        return this.frequency;
    }

    /**
     * the scheduling constraints for when the profile begins.
     * 
     */
    @Import(name="schedule", required=true)
      private final Output<RecurrentScheduleArgs> schedule;

    public Output<RecurrentScheduleArgs> schedule() {
        return this.schedule;
    }

    public RecurrenceArgs(
        Output<RecurrenceFrequency> frequency,
        Output<RecurrentScheduleArgs> schedule) {
        this.frequency = Objects.requireNonNull(frequency, "expected parameter 'frequency' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
    }

    private RecurrenceArgs() {
        this.frequency = Codegen.empty();
        this.schedule = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RecurrenceFrequency> frequency;
        private Output<RecurrentScheduleArgs> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.schedule = defaults.schedule;
        }

        public Builder frequency(Output<RecurrenceFrequency> frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }
        public Builder frequency(RecurrenceFrequency frequency) {
            this.frequency = Output.of(Objects.requireNonNull(frequency));
            return this;
        }
        public Builder schedule(Output<RecurrentScheduleArgs> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder schedule(RecurrentScheduleArgs schedule) {
            this.schedule = Output.of(Objects.requireNonNull(schedule));
            return this;
        }        public RecurrenceArgs build() {
            return new RecurrenceArgs(frequency, schedule);
        }
    }
}
