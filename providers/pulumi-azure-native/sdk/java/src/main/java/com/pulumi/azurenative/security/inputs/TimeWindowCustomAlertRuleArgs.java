// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A custom alert rule that checks if the number of activities (depends on the custom alert type) in a time window is within the given range.
 * 
 */
public final class TimeWindowCustomAlertRuleArgs extends ResourceArgs {

    public static final TimeWindowCustomAlertRuleArgs Empty = new TimeWindowCustomAlertRuleArgs();

    /**
     * Status of the custom alert.
     * 
     */
    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    /**
     * @return Status of the custom alert.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    /**
     * The maximum threshold.
     * 
     */
    @Import(name="maxThreshold", required=true)
    private Output<Integer> maxThreshold;

    /**
     * @return The maximum threshold.
     * 
     */
    public Output<Integer> maxThreshold() {
        return this.maxThreshold;
    }

    /**
     * The minimum threshold.
     * 
     */
    @Import(name="minThreshold", required=true)
    private Output<Integer> minThreshold;

    /**
     * @return The minimum threshold.
     * 
     */
    public Output<Integer> minThreshold() {
        return this.minThreshold;
    }

    /**
     * The type of the custom alert rule.
     * Expected value is &#39;TimeWindowCustomAlertRule&#39;.
     * 
     */
    @Import(name="ruleType", required=true)
    private Output<String> ruleType;

    /**
     * @return The type of the custom alert rule.
     * Expected value is &#39;TimeWindowCustomAlertRule&#39;.
     * 
     */
    public Output<String> ruleType() {
        return this.ruleType;
    }

    /**
     * The time window size in iso8601 format.
     * 
     */
    @Import(name="timeWindowSize", required=true)
    private Output<String> timeWindowSize;

    /**
     * @return The time window size in iso8601 format.
     * 
     */
    public Output<String> timeWindowSize() {
        return this.timeWindowSize;
    }

    private TimeWindowCustomAlertRuleArgs() {}

    private TimeWindowCustomAlertRuleArgs(TimeWindowCustomAlertRuleArgs $) {
        this.isEnabled = $.isEnabled;
        this.maxThreshold = $.maxThreshold;
        this.minThreshold = $.minThreshold;
        this.ruleType = $.ruleType;
        this.timeWindowSize = $.timeWindowSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeWindowCustomAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeWindowCustomAlertRuleArgs $;

        public Builder() {
            $ = new TimeWindowCustomAlertRuleArgs();
        }

        public Builder(TimeWindowCustomAlertRuleArgs defaults) {
            $ = new TimeWindowCustomAlertRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isEnabled Status of the custom alert.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Status of the custom alert.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param maxThreshold The maximum threshold.
         * 
         * @return builder
         * 
         */
        public Builder maxThreshold(Output<Integer> maxThreshold) {
            $.maxThreshold = maxThreshold;
            return this;
        }

        /**
         * @param maxThreshold The maximum threshold.
         * 
         * @return builder
         * 
         */
        public Builder maxThreshold(Integer maxThreshold) {
            return maxThreshold(Output.of(maxThreshold));
        }

        /**
         * @param minThreshold The minimum threshold.
         * 
         * @return builder
         * 
         */
        public Builder minThreshold(Output<Integer> minThreshold) {
            $.minThreshold = minThreshold;
            return this;
        }

        /**
         * @param minThreshold The minimum threshold.
         * 
         * @return builder
         * 
         */
        public Builder minThreshold(Integer minThreshold) {
            return minThreshold(Output.of(minThreshold));
        }

        /**
         * @param ruleType The type of the custom alert rule.
         * Expected value is &#39;TimeWindowCustomAlertRule&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(Output<String> ruleType) {
            $.ruleType = ruleType;
            return this;
        }

        /**
         * @param ruleType The type of the custom alert rule.
         * Expected value is &#39;TimeWindowCustomAlertRule&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(String ruleType) {
            return ruleType(Output.of(ruleType));
        }

        /**
         * @param timeWindowSize The time window size in iso8601 format.
         * 
         * @return builder
         * 
         */
        public Builder timeWindowSize(Output<String> timeWindowSize) {
            $.timeWindowSize = timeWindowSize;
            return this;
        }

        /**
         * @param timeWindowSize The time window size in iso8601 format.
         * 
         * @return builder
         * 
         */
        public Builder timeWindowSize(String timeWindowSize) {
            return timeWindowSize(Output.of(timeWindowSize));
        }

        public TimeWindowCustomAlertRuleArgs build() {
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            $.maxThreshold = Objects.requireNonNull($.maxThreshold, "expected parameter 'maxThreshold' to be non-null");
            $.minThreshold = Objects.requireNonNull($.minThreshold, "expected parameter 'minThreshold' to be non-null");
            $.ruleType = Codegen.stringProp("ruleType").output().arg($.ruleType).require();
            $.timeWindowSize = Objects.requireNonNull($.timeWindowSize, "expected parameter 'timeWindowSize' to be non-null");
            return $;
        }
    }

}
