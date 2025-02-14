// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * metric name.
     * 
     */
    @EnumType
    public enum GoogleCloudMlV1__MetricSpecName {
        /**
         * Unspecified MetricName.
         * 
         */
        MetricNameUnspecified("METRIC_NAME_UNSPECIFIED"),
        /**
         * CPU usage.
         * 
         */
        CpuUsage("CPU_USAGE"),
        /**
         * GPU duty cycle.
         * 
         */
        GpuDutyCycle("GPU_DUTY_CYCLE");

        private final String value;

        GoogleCloudMlV1__MetricSpecName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudMlV1__MetricSpecName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
