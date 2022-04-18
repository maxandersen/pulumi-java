// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datafusion_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type represents the release availability of the version
     * 
     */
    @EnumType
    public enum VersionType {
        /**
         * Version does not have availability yet
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * Version is under development and not considered stable
         * 
         */
        TypePreview("TYPE_PREVIEW"),
        /**
         * Version is available for public use
         * 
         */
        TypeGeneralAvailability("TYPE_GENERAL_AVAILABILITY");

        private final String value;

        VersionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VersionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
