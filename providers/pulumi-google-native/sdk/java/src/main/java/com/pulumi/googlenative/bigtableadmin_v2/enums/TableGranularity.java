// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. The granularity (i.e. `MILLIS`) at which timestamps are stored in this table. Timestamps not matching the granularity will be rejected. If unspecified at creation time, the value will be set to `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
     * 
     */
    @EnumType
    public enum TableGranularity {
        /**
         * The user did not specify a granularity. Should not be returned. When specified during table creation, MILLIS will be used.
         * 
         */
        TimestampGranularityUnspecified("TIMESTAMP_GRANULARITY_UNSPECIFIED"),
        /**
         * The table keeps data versioned at a granularity of 1ms.
         * 
         */
        Millis("MILLIS");

        private final String value;

        TableGranularity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TableGranularity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
