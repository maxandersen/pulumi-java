// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.DailyRetentionFormatResponse;
import com.pulumi.azurenative.recoveryservices.inputs.RetentionDurationResponse;
import com.pulumi.azurenative.recoveryservices.inputs.WeeklyRetentionFormatResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Yearly retention schedule.
 * 
 */
public final class YearlyRetentionScheduleResponse extends com.pulumi.resources.InvokeArgs {

    public static final YearlyRetentionScheduleResponse Empty = new YearlyRetentionScheduleResponse();

    /**
     * List of months of year of yearly retention policy.
     * 
     */
    @Import(name="monthsOfYear")
      private final @Nullable List<String> monthsOfYear;

    public List<String> monthsOfYear() {
        return this.monthsOfYear == null ? List.of() : this.monthsOfYear;
    }

    /**
     * Retention duration of retention Policy.
     * 
     */
    @Import(name="retentionDuration")
      private final @Nullable RetentionDurationResponse retentionDuration;

    public Optional<RetentionDurationResponse> retentionDuration() {
        return this.retentionDuration == null ? Optional.empty() : Optional.ofNullable(this.retentionDuration);
    }

    /**
     * Daily retention format for yearly retention policy.
     * 
     */
    @Import(name="retentionScheduleDaily")
      private final @Nullable DailyRetentionFormatResponse retentionScheduleDaily;

    public Optional<DailyRetentionFormatResponse> retentionScheduleDaily() {
        return this.retentionScheduleDaily == null ? Optional.empty() : Optional.ofNullable(this.retentionScheduleDaily);
    }

    /**
     * Retention schedule format for yearly retention policy.
     * 
     */
    @Import(name="retentionScheduleFormatType")
      private final @Nullable String retentionScheduleFormatType;

    public Optional<String> retentionScheduleFormatType() {
        return this.retentionScheduleFormatType == null ? Optional.empty() : Optional.ofNullable(this.retentionScheduleFormatType);
    }

    /**
     * Weekly retention format for yearly retention policy.
     * 
     */
    @Import(name="retentionScheduleWeekly")
      private final @Nullable WeeklyRetentionFormatResponse retentionScheduleWeekly;

    public Optional<WeeklyRetentionFormatResponse> retentionScheduleWeekly() {
        return this.retentionScheduleWeekly == null ? Optional.empty() : Optional.ofNullable(this.retentionScheduleWeekly);
    }

    /**
     * Retention times of retention policy.
     * 
     */
    @Import(name="retentionTimes")
      private final @Nullable List<String> retentionTimes;

    public List<String> retentionTimes() {
        return this.retentionTimes == null ? List.of() : this.retentionTimes;
    }

    public YearlyRetentionScheduleResponse(
        @Nullable List<String> monthsOfYear,
        @Nullable RetentionDurationResponse retentionDuration,
        @Nullable DailyRetentionFormatResponse retentionScheduleDaily,
        @Nullable String retentionScheduleFormatType,
        @Nullable WeeklyRetentionFormatResponse retentionScheduleWeekly,
        @Nullable List<String> retentionTimes) {
        this.monthsOfYear = monthsOfYear;
        this.retentionDuration = retentionDuration;
        this.retentionScheduleDaily = retentionScheduleDaily;
        this.retentionScheduleFormatType = retentionScheduleFormatType;
        this.retentionScheduleWeekly = retentionScheduleWeekly;
        this.retentionTimes = retentionTimes;
    }

    private YearlyRetentionScheduleResponse() {
        this.monthsOfYear = List.of();
        this.retentionDuration = null;
        this.retentionScheduleDaily = null;
        this.retentionScheduleFormatType = null;
        this.retentionScheduleWeekly = null;
        this.retentionTimes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(YearlyRetentionScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> monthsOfYear;
        private @Nullable RetentionDurationResponse retentionDuration;
        private @Nullable DailyRetentionFormatResponse retentionScheduleDaily;
        private @Nullable String retentionScheduleFormatType;
        private @Nullable WeeklyRetentionFormatResponse retentionScheduleWeekly;
        private @Nullable List<String> retentionTimes;

        public Builder() {
    	      // Empty
        }

        public Builder(YearlyRetentionScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthsOfYear = defaults.monthsOfYear;
    	      this.retentionDuration = defaults.retentionDuration;
    	      this.retentionScheduleDaily = defaults.retentionScheduleDaily;
    	      this.retentionScheduleFormatType = defaults.retentionScheduleFormatType;
    	      this.retentionScheduleWeekly = defaults.retentionScheduleWeekly;
    	      this.retentionTimes = defaults.retentionTimes;
        }

        public Builder monthsOfYear(@Nullable List<String> monthsOfYear) {
            this.monthsOfYear = monthsOfYear;
            return this;
        }
        public Builder monthsOfYear(String... monthsOfYear) {
            return monthsOfYear(List.of(monthsOfYear));
        }
        public Builder retentionDuration(@Nullable RetentionDurationResponse retentionDuration) {
            this.retentionDuration = retentionDuration;
            return this;
        }
        public Builder retentionScheduleDaily(@Nullable DailyRetentionFormatResponse retentionScheduleDaily) {
            this.retentionScheduleDaily = retentionScheduleDaily;
            return this;
        }
        public Builder retentionScheduleFormatType(@Nullable String retentionScheduleFormatType) {
            this.retentionScheduleFormatType = retentionScheduleFormatType;
            return this;
        }
        public Builder retentionScheduleWeekly(@Nullable WeeklyRetentionFormatResponse retentionScheduleWeekly) {
            this.retentionScheduleWeekly = retentionScheduleWeekly;
            return this;
        }
        public Builder retentionTimes(@Nullable List<String> retentionTimes) {
            this.retentionTimes = retentionTimes;
            return this;
        }
        public Builder retentionTimes(String... retentionTimes) {
            return retentionTimes(List.of(retentionTimes));
        }        public YearlyRetentionScheduleResponse build() {
            return new YearlyRetentionScheduleResponse(monthsOfYear, retentionDuration, retentionScheduleDaily, retentionScheduleFormatType, retentionScheduleWeekly, retentionTimes);
        }
    }
}
