// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class DateResponse {
    /**
     * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
     * 
     */
    private final Integer day;
    /**
     * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
     * 
     */
    private final Integer month;
    /**
     * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
     * 
     */
    private final Integer year;

    @OutputCustomType.Constructor
    private DateResponse(
        @OutputCustomType.Parameter("day") Integer day,
        @OutputCustomType.Parameter("month") Integer month,
        @OutputCustomType.Parameter("year") Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
     * 
    */
    public Integer getDay() {
        return this.day;
    }
    /**
     * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
     * 
    */
    public Integer getMonth() {
        return this.month;
    }
    /**
     * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
     * 
    */
    public Integer getYear() {
        return this.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer day;
        private Integer month;
        private Integer year;

        public Builder() {
    	      // Empty
        }

        public Builder(DateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder setDay(Integer day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setMonth(Integer month) {
            this.month = Objects.requireNonNull(month);
            return this;
        }

        public Builder setYear(Integer year) {
            this.year = Objects.requireNonNull(year);
            return this;
        }
        public DateResponse build() {
            return new DateResponse(day, month, year);
        }
    }
}
