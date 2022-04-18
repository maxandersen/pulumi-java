// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The data type of the compared operands (string, integer, floating point number or a boolean [true/false]]
     * 
     */
    @EnumType
    public enum PropertyType {
        String("String"),
        Integer("Integer"),
        Number("Number"),
        Boolean("Boolean");

        private final String value;

        PropertyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PropertyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
