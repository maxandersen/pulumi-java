// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Describes what transforms applied before matching.
     * 
     */
    @EnumType
    public enum TransformType {
        Lowercase("Lowercase"),
        Uppercase("Uppercase"),
        Trim("Trim"),
        UrlDecode("UrlDecode"),
        UrlEncode("UrlEncode"),
        RemoveNulls("RemoveNulls");

        private final String value;

        TransformType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TransformType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
