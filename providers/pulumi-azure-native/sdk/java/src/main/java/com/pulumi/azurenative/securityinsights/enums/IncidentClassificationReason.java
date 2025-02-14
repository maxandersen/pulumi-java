// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The classification reason the incident was closed with
     * 
     */
    @EnumType
    public enum IncidentClassificationReason {
        /**
         * Classification reason was suspicious activity
         * 
         */
        SuspiciousActivity("SuspiciousActivity"),
        /**
         * Classification reason was suspicious but expected
         * 
         */
        SuspiciousButExpected("SuspiciousButExpected"),
        /**
         * Classification reason was incorrect alert logic
         * 
         */
        IncorrectAlertLogic("IncorrectAlertLogic"),
        /**
         * Classification reason was inaccurate data
         * 
         */
        InaccurateData("InaccurateData");

        private final String value;

        IncidentClassificationReason(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IncidentClassificationReason[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
