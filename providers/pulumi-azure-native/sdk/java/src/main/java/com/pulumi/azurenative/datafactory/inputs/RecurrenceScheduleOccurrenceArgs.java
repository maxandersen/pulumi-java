// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.DayOfWeek;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The recurrence schedule occurrence.
 * 
 */
public final class RecurrenceScheduleOccurrenceArgs extends ResourceArgs {

    public static final RecurrenceScheduleOccurrenceArgs Empty = new RecurrenceScheduleOccurrenceArgs();

    /**
     * The day of the week.
     * 
     */
    @Import(name="day")
    private @Nullable Output<DayOfWeek> day;

    /**
     * @return The day of the week.
     * 
     */
    public Optional<Output<DayOfWeek>> day() {
        return Optional.ofNullable(this.day);
    }

    /**
     * The occurrence.
     * 
     */
    @Import(name="occurrence")
    private @Nullable Output<Integer> occurrence;

    /**
     * @return The occurrence.
     * 
     */
    public Optional<Output<Integer>> occurrence() {
        return Optional.ofNullable(this.occurrence);
    }

    private RecurrenceScheduleOccurrenceArgs() {}

    private RecurrenceScheduleOccurrenceArgs(RecurrenceScheduleOccurrenceArgs $) {
        this.day = $.day;
        this.occurrence = $.occurrence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecurrenceScheduleOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecurrenceScheduleOccurrenceArgs $;

        public Builder() {
            $ = new RecurrenceScheduleOccurrenceArgs();
        }

        public Builder(RecurrenceScheduleOccurrenceArgs defaults) {
            $ = new RecurrenceScheduleOccurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param day The day of the week.
         * 
         * @return builder
         * 
         */
        public Builder day(@Nullable Output<DayOfWeek> day) {
            $.day = day;
            return this;
        }

        /**
         * @param day The day of the week.
         * 
         * @return builder
         * 
         */
        public Builder day(DayOfWeek day) {
            return day(Output.of(day));
        }

        /**
         * @param occurrence The occurrence.
         * 
         * @return builder
         * 
         */
        public Builder occurrence(@Nullable Output<Integer> occurrence) {
            $.occurrence = occurrence;
            return this;
        }

        /**
         * @param occurrence The occurrence.
         * 
         * @return builder
         * 
         */
        public Builder occurrence(Integer occurrence) {
            return occurrence(Output.of(occurrence));
        }

        public RecurrenceScheduleOccurrenceArgs build() {
            return $;
        }
    }

}
