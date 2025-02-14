// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum WeekOfMonth {
        First("First"),
        Second("Second"),
        Third("Third"),
        Fourth("Fourth"),
        Last("Last"),
        Invalid("Invalid");

        private final String value;

        WeekOfMonth(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "WeekOfMonth[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
