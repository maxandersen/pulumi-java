// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. Indicates whether the entity type can be automatically expanded.
     * 
     */
    @EnumType
    public enum EntityTypeAutoExpansionMode {
        /**
         * Auto expansion disabled for the entity.
         * 
         */
        AutoExpansionModeUnspecified("AUTO_EXPANSION_MODE_UNSPECIFIED"),
        /**
         * Allows an agent to recognize values that have not been explicitly listed in the entity.
         * 
         */
        AutoExpansionModeDefault("AUTO_EXPANSION_MODE_DEFAULT");

        private final String value;

        EntityTypeAutoExpansionMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EntityTypeAutoExpansionMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
