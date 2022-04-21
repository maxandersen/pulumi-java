// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.DayResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Schedule based backup criteria
 * 
 */
public final class ScheduleBasedBackupCriteriaResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScheduleBasedBackupCriteriaResponse Empty = new ScheduleBasedBackupCriteriaResponse();

    /**
     * it contains absolute values like &#34;AllBackup&#34; / &#34;FirstOfDay&#34; / &#34;FirstOfWeek&#34; / &#34;FirstOfMonth&#34;
     * and should be part of AbsoluteMarker enum
     * 
     */
    @Import(name="absoluteCriteria")
    private @Nullable List<String> absoluteCriteria;

    public Optional<List<String>> absoluteCriteria() {
        return Optional.ofNullable(this.absoluteCriteria);
    }

    /**
     * This is day of the month from 1 to 28 other wise last of month
     * 
     */
    @Import(name="daysOfMonth")
    private @Nullable List<DayResponse> daysOfMonth;

    public Optional<List<DayResponse>> daysOfMonth() {
        return Optional.ofNullable(this.daysOfMonth);
    }

    /**
     * It should be Sunday/Monday/T..../Saturday
     * 
     */
    @Import(name="daysOfTheWeek")
    private @Nullable List<String> daysOfTheWeek;

    public Optional<List<String>> daysOfTheWeek() {
        return Optional.ofNullable(this.daysOfTheWeek);
    }

    /**
     * It should be January/February/....../December
     * 
     */
    @Import(name="monthsOfYear")
    private @Nullable List<String> monthsOfYear;

    public Optional<List<String>> monthsOfYear() {
        return Optional.ofNullable(this.monthsOfYear);
    }

    /**
     * Type of the specific object - used for deserializing
     * Expected value is &#39;ScheduleBasedBackupCriteria&#39;.
     * 
     */
    @Import(name="objectType", required=true)
    private String objectType;

    public String objectType() {
        return this.objectType;
    }

    /**
     * List of schedule times for backup
     * 
     */
    @Import(name="scheduleTimes")
    private @Nullable List<String> scheduleTimes;

    public Optional<List<String>> scheduleTimes() {
        return Optional.ofNullable(this.scheduleTimes);
    }

    /**
     * It should be First/Second/Third/Fourth/Last
     * 
     */
    @Import(name="weeksOfTheMonth")
    private @Nullable List<String> weeksOfTheMonth;

    public Optional<List<String>> weeksOfTheMonth() {
        return Optional.ofNullable(this.weeksOfTheMonth);
    }

    private ScheduleBasedBackupCriteriaResponse() {}

    private ScheduleBasedBackupCriteriaResponse(ScheduleBasedBackupCriteriaResponse $) {
        this.absoluteCriteria = $.absoluteCriteria;
        this.daysOfMonth = $.daysOfMonth;
        this.daysOfTheWeek = $.daysOfTheWeek;
        this.monthsOfYear = $.monthsOfYear;
        this.objectType = $.objectType;
        this.scheduleTimes = $.scheduleTimes;
        this.weeksOfTheMonth = $.weeksOfTheMonth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleBasedBackupCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleBasedBackupCriteriaResponse $;

        public Builder() {
            $ = new ScheduleBasedBackupCriteriaResponse();
        }

        public Builder(ScheduleBasedBackupCriteriaResponse defaults) {
            $ = new ScheduleBasedBackupCriteriaResponse(Objects.requireNonNull(defaults));
        }

        public Builder absoluteCriteria(@Nullable List<String> absoluteCriteria) {
            $.absoluteCriteria = absoluteCriteria;
            return this;
        }

        public Builder absoluteCriteria(String... absoluteCriteria) {
            return absoluteCriteria(List.of(absoluteCriteria));
        }

        public Builder daysOfMonth(@Nullable List<DayResponse> daysOfMonth) {
            $.daysOfMonth = daysOfMonth;
            return this;
        }

        public Builder daysOfMonth(DayResponse... daysOfMonth) {
            return daysOfMonth(List.of(daysOfMonth));
        }

        public Builder daysOfTheWeek(@Nullable List<String> daysOfTheWeek) {
            $.daysOfTheWeek = daysOfTheWeek;
            return this;
        }

        public Builder daysOfTheWeek(String... daysOfTheWeek) {
            return daysOfTheWeek(List.of(daysOfTheWeek));
        }

        public Builder monthsOfYear(@Nullable List<String> monthsOfYear) {
            $.monthsOfYear = monthsOfYear;
            return this;
        }

        public Builder monthsOfYear(String... monthsOfYear) {
            return monthsOfYear(List.of(monthsOfYear));
        }

        public Builder objectType(String objectType) {
            $.objectType = objectType;
            return this;
        }

        public Builder scheduleTimes(@Nullable List<String> scheduleTimes) {
            $.scheduleTimes = scheduleTimes;
            return this;
        }

        public Builder scheduleTimes(String... scheduleTimes) {
            return scheduleTimes(List.of(scheduleTimes));
        }

        public Builder weeksOfTheMonth(@Nullable List<String> weeksOfTheMonth) {
            $.weeksOfTheMonth = weeksOfTheMonth;
            return this;
        }

        public Builder weeksOfTheMonth(String... weeksOfTheMonth) {
            return weeksOfTheMonth(List.of(weeksOfTheMonth));
        }

        public ScheduleBasedBackupCriteriaResponse build() {
            $.objectType = Codegen.stringProp("objectType").arg($.objectType).require();
            return $;
        }
    }

}
