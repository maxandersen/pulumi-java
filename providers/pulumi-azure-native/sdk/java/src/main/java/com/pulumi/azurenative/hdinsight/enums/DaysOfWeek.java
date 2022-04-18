// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DaysOfWeek {
        Monday("Monday"),
        Tuesday("Tuesday"),
        Wednesday("Wednesday"),
        Thursday("Thursday"),
        Friday("Friday"),
        Saturday("Saturday"),
        Sunday("Sunday");

        private final String value;

        DaysOfWeek(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DaysOfWeek[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
