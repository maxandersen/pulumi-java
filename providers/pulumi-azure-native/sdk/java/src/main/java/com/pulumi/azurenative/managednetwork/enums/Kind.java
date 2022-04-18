// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Responsibility role under which this Managed Network Group will be created
     * 
     */
    @EnumType
    public enum Kind {
        Connectivity("Connectivity");

        private final String value;

        Kind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Kind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
