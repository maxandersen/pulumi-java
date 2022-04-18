// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TimeWindowCustomAlertRuleResponse {
    /**
     * The description of the custom alert.
     * 
     */
    private final String description;
    /**
     * The display name of the custom alert.
     * 
     */
    private final String displayName;
    /**
     * Status of the custom alert.
     * 
     */
    private final Boolean isEnabled;
    /**
     * The maximum threshold.
     * 
     */
    private final Integer maxThreshold;
    /**
     * The minimum threshold.
     * 
     */
    private final Integer minThreshold;
    /**
     * The type of the custom alert rule.
     * Expected value is 'TimeWindowCustomAlertRule'.
     * 
     */
    private final String ruleType;
    /**
     * The time window size in iso8601 format.
     * 
     */
    private final String timeWindowSize;

    @CustomType.Constructor
    private TimeWindowCustomAlertRuleResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("maxThreshold") Integer maxThreshold,
        @CustomType.Parameter("minThreshold") Integer minThreshold,
        @CustomType.Parameter("ruleType") String ruleType,
        @CustomType.Parameter("timeWindowSize") String timeWindowSize) {
        this.description = description;
        this.displayName = displayName;
        this.isEnabled = isEnabled;
        this.maxThreshold = maxThreshold;
        this.minThreshold = minThreshold;
        this.ruleType = ruleType;
        this.timeWindowSize = timeWindowSize;
    }

    /**
     * The description of the custom alert.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The display name of the custom alert.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Status of the custom alert.
     * 
    */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * The maximum threshold.
     * 
    */
    public Integer maxThreshold() {
        return this.maxThreshold;
    }
    /**
     * The minimum threshold.
     * 
    */
    public Integer minThreshold() {
        return this.minThreshold;
    }
    /**
     * The type of the custom alert rule.
     * Expected value is 'TimeWindowCustomAlertRule'.
     * 
    */
    public String ruleType() {
        return this.ruleType;
    }
    /**
     * The time window size in iso8601 format.
     * 
    */
    public String timeWindowSize() {
        return this.timeWindowSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeWindowCustomAlertRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private Boolean isEnabled;
        private Integer maxThreshold;
        private Integer minThreshold;
        private String ruleType;
        private String timeWindowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeWindowCustomAlertRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isEnabled = defaults.isEnabled;
    	      this.maxThreshold = defaults.maxThreshold;
    	      this.minThreshold = defaults.minThreshold;
    	      this.ruleType = defaults.ruleType;
    	      this.timeWindowSize = defaults.timeWindowSize;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder maxThreshold(Integer maxThreshold) {
            this.maxThreshold = Objects.requireNonNull(maxThreshold);
            return this;
        }
        public Builder minThreshold(Integer minThreshold) {
            this.minThreshold = Objects.requireNonNull(minThreshold);
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder timeWindowSize(String timeWindowSize) {
            this.timeWindowSize = Objects.requireNonNull(timeWindowSize);
            return this;
        }        public TimeWindowCustomAlertRuleResponse build() {
            return new TimeWindowCustomAlertRuleResponse(description, displayName, isEnabled, maxThreshold, minThreshold, ruleType, timeWindowSize);
        }
    }
}
