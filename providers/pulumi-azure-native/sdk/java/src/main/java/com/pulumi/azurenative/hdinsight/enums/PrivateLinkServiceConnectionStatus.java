// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The concrete private link service connection.
     * 
     */
    @EnumType
    public enum PrivateLinkServiceConnectionStatus {
        Approved("Approved"),
        Rejected("Rejected"),
        Pending("Pending"),
        Removed("Removed");

        private final String value;

        PrivateLinkServiceConnectionStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PrivateLinkServiceConnectionStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
