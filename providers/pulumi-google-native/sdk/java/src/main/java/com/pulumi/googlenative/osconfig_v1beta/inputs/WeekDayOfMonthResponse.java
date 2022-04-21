// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Represents one week day in a month. An example is &#34;the 4th Sunday&#34;.
 * 
 */
public final class WeekDayOfMonthResponse extends com.pulumi.resources.InvokeArgs {

    public static final WeekDayOfMonthResponse Empty = new WeekDayOfMonthResponse();

    /**
     * A day of the week.
     * 
     */
    @Import(name="dayOfWeek", required=true)
    private String dayOfWeek;

    public String dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Optional. Represents the number of days before or after the given week day of month that the patch deployment is scheduled for. For example if `week_ordinal` and `day_of_week` values point to the second day of the month and this `day_offset` value is set to `3`, the patch deployment takes place three days after the second Tuesday of the month. If this value is negative, for example -5, the patches are deployed five days before before the second Tuesday of the month. Allowed values are in range [-30, 30].
     * 
     */
    @Import(name="dayOffset", required=true)
    private Integer dayOffset;

    public Integer dayOffset() {
        return this.dayOffset;
    }

    /**
     * Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month.
     * 
     */
    @Import(name="weekOrdinal", required=true)
    private Integer weekOrdinal;

    public Integer weekOrdinal() {
        return this.weekOrdinal;
    }

    private WeekDayOfMonthResponse() {}

    private WeekDayOfMonthResponse(WeekDayOfMonthResponse $) {
        this.dayOfWeek = $.dayOfWeek;
        this.dayOffset = $.dayOffset;
        this.weekOrdinal = $.weekOrdinal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WeekDayOfMonthResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WeekDayOfMonthResponse $;

        public Builder() {
            $ = new WeekDayOfMonthResponse();
        }

        public Builder(WeekDayOfMonthResponse defaults) {
            $ = new WeekDayOfMonthResponse(Objects.requireNonNull(defaults));
        }

        public Builder dayOfWeek(String dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder dayOffset(Integer dayOffset) {
            $.dayOffset = dayOffset;
            return this;
        }

        public Builder weekOrdinal(Integer weekOrdinal) {
            $.weekOrdinal = weekOrdinal;
            return this;
        }

        public WeekDayOfMonthResponse build() {
            $.dayOfWeek = Objects.requireNonNull($.dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
            $.dayOffset = Objects.requireNonNull($.dayOffset, "expected parameter 'dayOffset' to be non-null");
            $.weekOrdinal = Objects.requireNonNull($.weekOrdinal, "expected parameter 'weekOrdinal' to be non-null");
            return $;
        }
    }

}
