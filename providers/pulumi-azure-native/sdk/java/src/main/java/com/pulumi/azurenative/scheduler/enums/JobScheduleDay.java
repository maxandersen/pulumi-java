// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Gets or sets the day. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    @EnumType
    public enum JobScheduleDay {
        Monday("Monday"),
        Tuesday("Tuesday"),
        Wednesday("Wednesday"),
        Thursday("Thursday"),
        Friday("Friday"),
        Saturday("Saturday"),
        Sunday("Sunday");

        private final String value;

        JobScheduleDay(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobScheduleDay[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
