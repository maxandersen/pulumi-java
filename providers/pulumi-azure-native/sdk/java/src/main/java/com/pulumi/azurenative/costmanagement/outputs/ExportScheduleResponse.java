// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.azurenative.costmanagement.outputs.ExportRecurrencePeriodResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExportScheduleResponse {
    /**
     * The schedule recurrence.
     * 
     */
    private final @Nullable String recurrence;
    /**
     * Has start and end date of the recurrence. The start date must be in future. If present, the end date must be greater than start date.
     * 
     */
    private final @Nullable ExportRecurrencePeriodResponse recurrencePeriod;
    /**
     * The status of the export&#39;s schedule. If &#39;Inactive&#39;, the export&#39;s schedule is paused.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private ExportScheduleResponse(
        @CustomType.Parameter("recurrence") @Nullable String recurrence,
        @CustomType.Parameter("recurrencePeriod") @Nullable ExportRecurrencePeriodResponse recurrencePeriod,
        @CustomType.Parameter("status") @Nullable String status) {
        this.recurrence = recurrence;
        this.recurrencePeriod = recurrencePeriod;
        this.status = status;
    }

    /**
     * The schedule recurrence.
     * 
    */
    public Optional<String> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }
    /**
     * Has start and end date of the recurrence. The start date must be in future. If present, the end date must be greater than start date.
     * 
    */
    public Optional<ExportRecurrencePeriodResponse> recurrencePeriod() {
        return Optional.ofNullable(this.recurrencePeriod);
    }
    /**
     * The status of the export&#39;s schedule. If &#39;Inactive&#39;, the export&#39;s schedule is paused.
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String recurrence;
        private @Nullable ExportRecurrencePeriodResponse recurrencePeriod;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrence = defaults.recurrence;
    	      this.recurrencePeriod = defaults.recurrencePeriod;
    	      this.status = defaults.status;
        }

        public Builder recurrence(@Nullable String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public Builder recurrencePeriod(@Nullable ExportRecurrencePeriodResponse recurrencePeriod) {
            this.recurrencePeriod = recurrencePeriod;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public ExportScheduleResponse build() {
            return new ExportScheduleResponse(recurrence, recurrencePeriod, status);
        }
    }
}
