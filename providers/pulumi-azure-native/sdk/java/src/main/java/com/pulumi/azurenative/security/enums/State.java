// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Defines whether to send email notifications from Azure Security Center to persons with specific RBAC roles on the subscription.
     * 
     */
    @EnumType
    public enum State {
        /**
         * Send notification on new alerts to the subscription's admins
         * 
         */
        On("On"),
        /**
         * Don't send notification on new alerts to the subscription's admins
         * 
         */
        Off("Off");

        private final String value;

        State(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "State[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
