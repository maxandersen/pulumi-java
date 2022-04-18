// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specify what to do with extra properties when executing a request.
     * 
     */
    @EnumType
    public enum ValidationOptionsUndeclaredProperties {
        Unknown("UNKNOWN"),
        /**
         * Always include even if not present on discovery doc.
         * 
         */
        Include("INCLUDE"),
        /**
         * Always ignore if not present on discovery doc.
         * 
         */
        Ignore("IGNORE"),
        /**
         * Include on request, but emit a warning.
         * 
         */
        IncludeWithWarnings("INCLUDE_WITH_WARNINGS"),
        /**
         * Ignore properties, but emit a warning.
         * 
         */
        IgnoreWithWarnings("IGNORE_WITH_WARNINGS"),
        /**
         * Always fail if undeclared properties are present.
         * 
         */
        Fail("FAIL");

        private final String value;

        ValidationOptionsUndeclaredProperties(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ValidationOptionsUndeclaredProperties[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
