// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.enums.WeekDay;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Time in a week.
 * 
 */
public final class TimeInWeekArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeInWeekArgs Empty = new TimeInWeekArgs();

    /**
     * A day in a week.
     * 
     */
    @Import(name="day")
      private final @Nullable Output<Either<String,WeekDay>> day;

    public Output<Either<String,WeekDay>> day() {
        return this.day == null ? Codegen.empty() : this.day;
    }

    /**
     * hour slots in a day.
     * 
     */
    @Import(name="hourSlots")
      private final @Nullable Output<List<Integer>> hourSlots;

    public Output<List<Integer>> hourSlots() {
        return this.hourSlots == null ? Codegen.empty() : this.hourSlots;
    }

    public TimeInWeekArgs(
        @Nullable Output<Either<String,WeekDay>> day,
        @Nullable Output<List<Integer>> hourSlots) {
        this.day = day;
        this.hourSlots = hourSlots;
    }

    private TimeInWeekArgs() {
        this.day = Codegen.empty();
        this.hourSlots = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeInWeekArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,WeekDay>> day;
        private @Nullable Output<List<Integer>> hourSlots;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeInWeekArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hourSlots = defaults.hourSlots;
        }

        public Builder day(@Nullable Output<Either<String,WeekDay>> day) {
            this.day = day;
            return this;
        }
        public Builder day(@Nullable Either<String,WeekDay> day) {
            this.day = Codegen.ofNullable(day);
            return this;
        }
        public Builder hourSlots(@Nullable Output<List<Integer>> hourSlots) {
            this.hourSlots = hourSlots;
            return this;
        }
        public Builder hourSlots(@Nullable List<Integer> hourSlots) {
            this.hourSlots = Codegen.ofNullable(hourSlots);
            return this;
        }
        public Builder hourSlots(Integer... hourSlots) {
            return hourSlots(List.of(hourSlots));
        }        public TimeInWeekArgs build() {
            return new TimeInWeekArgs(day, hourSlots);
        }
    }
}
