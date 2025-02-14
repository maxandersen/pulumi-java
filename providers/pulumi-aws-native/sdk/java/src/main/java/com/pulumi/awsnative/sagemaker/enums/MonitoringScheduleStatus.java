// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The status of a schedule job.
     * 
     */
    @EnumType
    public enum MonitoringScheduleStatus {
        Pending("Pending"),
        Failed("Failed"),
        Scheduled("Scheduled"),
        Stopped("Stopped");

        private final String value;

        MonitoringScheduleStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MonitoringScheduleStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
