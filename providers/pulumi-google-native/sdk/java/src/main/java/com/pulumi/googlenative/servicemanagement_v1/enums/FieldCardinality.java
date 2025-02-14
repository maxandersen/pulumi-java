// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The field cardinality.
     * 
     */
    @EnumType
    public enum FieldCardinality {
        /**
         * For fields with unknown cardinality.
         * 
         */
        CardinalityUnknown("CARDINALITY_UNKNOWN"),
        /**
         * For optional fields.
         * 
         */
        CardinalityOptional("CARDINALITY_OPTIONAL"),
        /**
         * For required fields. Proto2 syntax only.
         * 
         */
        CardinalityRequired("CARDINALITY_REQUIRED"),
        /**
         * For repeated fields.
         * 
         */
        CardinalityRepeated("CARDINALITY_REPEATED");

        private final String value;

        FieldCardinality(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FieldCardinality[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
