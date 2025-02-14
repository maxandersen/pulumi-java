// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The mode in which Robo should run. Most clients should allow the server to populate this field automatically.
     * 
     */
    @EnumType
    public enum AndroidRoboTestRoboMode {
        /**
         * This means that the server should choose the mode. Recommended.
         * 
         */
        RoboModeUnspecified("ROBO_MODE_UNSPECIFIED"),
        /**
         * Runs Robo in UIAutomator-only mode without app resigning
         * 
         */
        RoboVersion1("ROBO_VERSION_1"),
        /**
         * Runs Robo in standard Espresso with UIAutomator fallback
         * 
         */
        RoboVersion2("ROBO_VERSION_2");

        private final String value;

        AndroidRoboTestRoboMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AndroidRoboTestRoboMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
