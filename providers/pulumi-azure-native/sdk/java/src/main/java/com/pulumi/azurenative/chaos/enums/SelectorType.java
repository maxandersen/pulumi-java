// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enum of the selector type.
     * 
     */
    @EnumType
    public enum SelectorType {
        Percent("Percent"),
        Random("Random"),
        Tag("Tag"),
        List("List");

        private final String value;

        SelectorType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SelectorType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
