// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.visualstudio.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the operation.
     * 
     */
    @EnumType
    public enum AccountResourceRequestOperationType {
        Unknown("unknown"),
        Create("create"),
        Update("update"),
        Link("link");

        private final String value;

        AccountResourceRequestOperationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AccountResourceRequestOperationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
