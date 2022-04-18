// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: * `ALWAYS`: The instance is on, and remains so even in the absence of connection requests. * `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    @EnumType
    public enum SettingsActivationPolicy {
        /**
         * Unknown activation plan.
         * 
         */
        SqlActivationPolicyUnspecified("SQL_ACTIVATION_POLICY_UNSPECIFIED"),
        /**
         * The instance is always up and running.
         * 
         */
        Always("ALWAYS"),
        /**
         * The instance never starts.
         * 
         */
        Never("NEVER"),
        /**
         * The instance starts upon receiving requests.
         * 
         */
        OnDemand("ON_DEMAND");

        private final String value;

        SettingsActivationPolicy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SettingsActivationPolicy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
