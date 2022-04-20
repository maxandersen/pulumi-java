// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Whether a VM will get shutdown when it has idled for a period of time.
     * 
     */
    @EnumType
    public enum ShutdownOnIdleMode {
        /**
         * The VM won&#39;t be shut down when it is idle.
         * 
         */
        None("None"),
        /**
         * The VM will be considered as idle when there is no keyboard or mouse input.
         * 
         */
        UserAbsence("UserAbsence"),
        /**
         * The VM will be considered as idle when user is absent and the resource (CPU and disk) consumption is low.
         * 
         */
        LowUsage("LowUsage");

        private final String value;

        ShutdownOnIdleMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ShutdownOnIdleMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
