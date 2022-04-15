// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.enums.ScheduleDay;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of the create advanced schedule monthly occurrence.
 * 
 */
public final class AdvancedScheduleMonthlyOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdvancedScheduleMonthlyOccurrenceArgs Empty = new AdvancedScheduleMonthlyOccurrenceArgs();

    /**
     * Day of the occurrence. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    @Import(name="day")
      private final @Nullable Output<Either<String,ScheduleDay>> day;

    public Output<Either<String,ScheduleDay>> day() {
        return this.day == null ? Codegen.empty() : this.day;
    }

    /**
     * Occurrence of the week within the month. Must be between 1 and 5
     * 
     */
    @Import(name="occurrence")
      private final @Nullable Output<Integer> occurrence;

    public Output<Integer> occurrence() {
        return this.occurrence == null ? Codegen.empty() : this.occurrence;
    }

    public AdvancedScheduleMonthlyOccurrenceArgs(
        @Nullable Output<Either<String,ScheduleDay>> day,
        @Nullable Output<Integer> occurrence) {
        this.day = day;
        this.occurrence = occurrence;
    }

    private AdvancedScheduleMonthlyOccurrenceArgs() {
        this.day = Codegen.empty();
        this.occurrence = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedScheduleMonthlyOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ScheduleDay>> day;
        private @Nullable Output<Integer> occurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedScheduleMonthlyOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.occurrence = defaults.occurrence;
        }

        public Builder day(@Nullable Output<Either<String,ScheduleDay>> day) {
            this.day = day;
            return this;
        }
        public Builder day(@Nullable Either<String,ScheduleDay> day) {
            this.day = Codegen.ofNullable(day);
            return this;
        }
        public Builder occurrence(@Nullable Output<Integer> occurrence) {
            this.occurrence = occurrence;
            return this;
        }
        public Builder occurrence(@Nullable Integer occurrence) {
            this.occurrence = Codegen.ofNullable(occurrence);
            return this;
        }        public AdvancedScheduleMonthlyOccurrenceArgs build() {
            return new AdvancedScheduleMonthlyOccurrenceArgs(day, occurrence);
        }
    }
}
