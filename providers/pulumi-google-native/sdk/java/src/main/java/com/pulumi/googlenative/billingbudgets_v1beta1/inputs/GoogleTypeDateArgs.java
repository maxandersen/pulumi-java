// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a whole or partial calendar date, such as a birthday. The time of day and time zone are either specified elsewhere or are insignificant. The date is relative to the Gregorian Calendar. This can represent one of the following: * A full date, with non-zero year, month, and day values * A month and day value, with a zero year, such as an anniversary * A year on its own, with zero month and day values * A year and month value, with a zero day, such as a credit card expiration date Related types are google.type.TimeOfDay and `google.protobuf.Timestamp`.
 * 
 */
public final class GoogleTypeDateArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleTypeDateArgs Empty = new GoogleTypeDateArgs();

    /**
     * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn&#39;t significant.
     * 
     */
    @Import(name="day")
      private final @Nullable Output<Integer> day;

    public Output<Integer> day() {
        return this.day == null ? Codegen.empty() : this.day;
    }

    /**
     * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
     * 
     */
    @Import(name="month")
      private final @Nullable Output<Integer> month;

    public Output<Integer> month() {
        return this.month == null ? Codegen.empty() : this.month;
    }

    /**
     * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
     * 
     */
    @Import(name="year")
      private final @Nullable Output<Integer> year;

    public Output<Integer> year() {
        return this.year == null ? Codegen.empty() : this.year;
    }

    public GoogleTypeDateArgs(
        @Nullable Output<Integer> day,
        @Nullable Output<Integer> month,
        @Nullable Output<Integer> year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private GoogleTypeDateArgs() {
        this.day = Codegen.empty();
        this.month = Codegen.empty();
        this.year = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleTypeDateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> day;
        private @Nullable Output<Integer> month;
        private @Nullable Output<Integer> year;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleTypeDateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder day(@Nullable Output<Integer> day) {
            this.day = day;
            return this;
        }
        public Builder day(@Nullable Integer day) {
            this.day = Codegen.ofNullable(day);
            return this;
        }
        public Builder month(@Nullable Output<Integer> month) {
            this.month = month;
            return this;
        }
        public Builder month(@Nullable Integer month) {
            this.month = Codegen.ofNullable(month);
            return this;
        }
        public Builder year(@Nullable Output<Integer> year) {
            this.year = year;
            return this;
        }
        public Builder year(@Nullable Integer year) {
            this.year = Codegen.ofNullable(year);
            return this;
        }        public GoogleTypeDateArgs build() {
            return new GoogleTypeDateArgs(day, month, year);
        }
    }
}
