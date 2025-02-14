// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
     * 
     */
    @EnumType
    public enum LoggingConfigurationConditionActionConditionPropertiesAction {
        Allow("ALLOW"),
        Block("BLOCK"),
        Count("COUNT"),
        Captcha("CAPTCHA"),
        ExcludedAsCount("EXCLUDED_AS_COUNT");

        private final String value;

        LoggingConfigurationConditionActionConditionPropertiesAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LoggingConfigurationConditionActionConditionPropertiesAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
