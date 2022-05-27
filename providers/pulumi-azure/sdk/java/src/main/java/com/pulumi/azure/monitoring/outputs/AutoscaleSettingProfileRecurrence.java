// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscaleSettingProfileRecurrence {
    /**
     * @return A list of days that this profile takes effect on. Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
     * 
     */
    private final List<String> days;
    /**
     * @return A list containing a single item, which specifies the Hour interval at which this recurrence should be triggered (in 24-hour time). Possible values are from `0` to `23`.
     * 
     */
    private final Integer hours;
    /**
     * @return A list containing a single item which specifies the Minute interval at which this recurrence should be triggered.
     * 
     */
    private final Integer minutes;
    /**
     * @return The Time Zone used for the `hours` field. A list of [possible values can be found here](https://msdn.microsoft.com/en-us/library/azure/dn931928.aspx). Defaults to `UTC`.
     * 
     */
    private final @Nullable String timezone;

    @CustomType.Constructor
    private AutoscaleSettingProfileRecurrence(
        @CustomType.Parameter("days") List<String> days,
        @CustomType.Parameter("hours") Integer hours,
        @CustomType.Parameter("minutes") Integer minutes,
        @CustomType.Parameter("timezone") @Nullable String timezone) {
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
        this.timezone = timezone;
    }

    /**
     * @return A list of days that this profile takes effect on. Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
     * 
     */
    public List<String> days() {
        return this.days;
    }
    /**
     * @return A list containing a single item, which specifies the Hour interval at which this recurrence should be triggered (in 24-hour time). Possible values are from `0` to `23`.
     * 
     */
    public Integer hours() {
        return this.hours;
    }
    /**
     * @return A list containing a single item which specifies the Minute interval at which this recurrence should be triggered.
     * 
     */
    public Integer minutes() {
        return this.minutes;
    }
    /**
     * @return The Time Zone used for the `hours` field. A list of [possible values can be found here](https://msdn.microsoft.com/en-us/library/azure/dn931928.aspx). Defaults to `UTC`.
     * 
     */
    public Optional<String> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleSettingProfileRecurrence defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> days;
        private Integer hours;
        private Integer minutes;
        private @Nullable String timezone;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleSettingProfileRecurrence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.timezone = defaults.timezone;
        }

        public Builder days(List<String> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder days(String... days) {
            return days(List.of(days));
        }
        public Builder hours(Integer hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }
        public Builder minutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public Builder timezone(@Nullable String timezone) {
            this.timezone = timezone;
            return this;
        }        public AutoscaleSettingProfileRecurrence build() {
            return new AutoscaleSettingProfileRecurrence(days, hours, minutes, timezone);
        }
    }
}
