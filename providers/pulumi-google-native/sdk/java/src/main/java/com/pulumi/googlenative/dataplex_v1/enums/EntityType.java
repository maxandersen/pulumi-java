// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Immutable. The type of entity.
     * 
     */
    @EnumType
    public enum EntityType {
        /**
         * Type unspecified.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * Structured and semi-structured data.
         * 
         */
        Table("TABLE"),
        /**
         * Unstructured data.
         * 
         */
        Fileset("FILESET");

        private final String value;

        EntityType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EntityType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
