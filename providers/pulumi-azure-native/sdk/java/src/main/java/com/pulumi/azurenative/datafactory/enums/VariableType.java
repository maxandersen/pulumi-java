// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Variable type.
     * 
     */
    @EnumType
    public enum VariableType {
        String("String"),
        Bool("Bool"),
        Array("Array");

        private final String value;

        VariableType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VariableType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
