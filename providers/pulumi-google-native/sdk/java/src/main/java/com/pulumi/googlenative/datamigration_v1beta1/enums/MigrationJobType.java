// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The migration job type.
     * 
     */
    @EnumType
    public enum MigrationJobType {
        /**
         * The type of the migration job is unknown.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * The migration job is a one time migration.
         * 
         */
        OneTime("ONE_TIME"),
        /**
         * The migration job is a continuous migration.
         * 
         */
        Continuous("CONTINUOUS");

        private final String value;

        MigrationJobType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MigrationJobType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
