// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates that this field supports ordering by the specified order or comparing using =, !=, &lt;, &lt;=, &gt;, &gt;=.
     * 
     */
    @EnumType
    public enum GoogleFirestoreAdminV1IndexFieldOrder {
        /**
         * The ordering is unspecified. Not a valid option.
         * 
         */
        OrderUnspecified("ORDER_UNSPECIFIED"),
        /**
         * The field is ordered by ascending field value.
         * 
         */
        Ascending("ASCENDING"),
        /**
         * The field is ordered by descending field value.
         * 
         */
        Descending("DESCENDING");

        private final String value;

        GoogleFirestoreAdminV1IndexFieldOrder(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleFirestoreAdminV1IndexFieldOrder[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
