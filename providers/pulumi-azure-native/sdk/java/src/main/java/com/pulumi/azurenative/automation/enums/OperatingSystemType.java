// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * operating system of target machines
     * 
     */
    @EnumType
    public enum OperatingSystemType {
        Windows("Windows"),
        Linux("Linux");

        private final String value;

        OperatingSystemType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OperatingSystemType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
