// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Defines the minimal alert severity which will be sent as email notifications
     * 
     */
    @EnumType
    public enum MinimalSeverity {
        /**
         * Get notifications on new alerts with High severity
         * 
         */
        High("High"),
        /**
         * Get notifications on new alerts with medium or high severity
         * 
         */
        Medium("Medium"),
        /**
         * Don&#39;t get notifications on new alerts with low, medium or high severity
         * 
         */
        Low("Low");

        private final String value;

        MinimalSeverity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MinimalSeverity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
