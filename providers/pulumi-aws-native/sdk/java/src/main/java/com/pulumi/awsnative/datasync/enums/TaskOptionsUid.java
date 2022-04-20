// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The user ID (UID) of the file&#39;s owner.
     * 
     */
    @EnumType
    public enum TaskOptionsUid {
        None("NONE"),
        IntValue("INT_VALUE"),
        Name("NAME"),
        Both("BOTH");

        private final String value;

        TaskOptionsUid(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TaskOptionsUid[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
