// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The target axis to use for plotting the threshold. Target axis is not allowed in a Scorecard.
     * 
     */
    @EnumType
    public enum ThresholdTargetAxis {
        /**
         * The target axis was not specified. Defaults to Y1.
         * 
         */
        TargetAxisUnspecified("TARGET_AXIS_UNSPECIFIED"),
        /**
         * The y_axis (the right axis of chart).
         * 
         */
        Y1("Y1"),
        /**
         * The y2_axis (the left axis of chart).
         * 
         */
        Y2("Y2");

        private final String value;

        ThresholdTargetAxis(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ThresholdTargetAxis[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
