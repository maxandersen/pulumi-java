// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Indicates the kind of entity type.
     * 
     */
    @EnumType
    public enum EntityTypeKind {
        /**
         * Not specified. This value should be never used.
         * 
         */
        KindUnspecified("KIND_UNSPECIFIED"),
        /**
         * Map entity types allow mapping of a group of synonyms to a reference value.
         * 
         */
        KindMap("KIND_MAP"),
        /**
         * List entity types contain a set of entries that do not map to reference values. However, list entity types can contain references to other entity types (with or without aliases).
         * 
         */
        KindList("KIND_LIST"),
        /**
         * Regexp entity types allow to specify regular expressions in entries values.
         * 
         */
        KindRegexp("KIND_REGEXP");

        private final String value;

        EntityTypeKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EntityTypeKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
