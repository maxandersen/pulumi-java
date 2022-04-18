// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The API type
     * 
     */
    @EnumType
    public enum ApiType {
        NotSpecified("NotSpecified"),
        Rest("Rest"),
        Soap("Soap");

        private final String value;

        ApiType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ApiType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
