// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.inputs.ReportRecurrencePeriodResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The schedule associated with a report.
 * 
 */
public final class ReportScheduleResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReportScheduleResponse Empty = new ReportScheduleResponse();

    /**
     * The schedule recurrence.
     * 
     */
    @Import(name="recurrence", required=true)
    private String recurrence;

    public String recurrence() {
        return this.recurrence;
    }

    /**
     * Has start and end date of the recurrence. The start date must be in future. If present, the end date must be greater than start date.
     * 
     */
    @Import(name="recurrencePeriod")
    private @Nullable ReportRecurrencePeriodResponse recurrencePeriod;

    public Optional<ReportRecurrencePeriodResponse> recurrencePeriod() {
        return Optional.ofNullable(this.recurrencePeriod);
    }

    /**
     * The status of the schedule. Whether active or not. If inactive, the report&#39;s scheduled execution is paused.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private ReportScheduleResponse() {}

    private ReportScheduleResponse(ReportScheduleResponse $) {
        this.recurrence = $.recurrence;
        this.recurrencePeriod = $.recurrencePeriod;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportScheduleResponse $;

        public Builder() {
            $ = new ReportScheduleResponse();
        }

        public Builder(ReportScheduleResponse defaults) {
            $ = new ReportScheduleResponse(Objects.requireNonNull(defaults));
        }

        public Builder recurrence(String recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        public Builder recurrencePeriod(@Nullable ReportRecurrencePeriodResponse recurrencePeriod) {
            $.recurrencePeriod = recurrencePeriod;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public ReportScheduleResponse build() {
            $.recurrence = Objects.requireNonNull($.recurrence, "expected parameter 'recurrence' to be non-null");
            return $;
        }
    }

}
