// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
     */
    @EnumType
    public enum TransportProtocol {
        Udp("Udp"),
        Tcp("Tcp"),
        All("All");

        private final String value;

        TransportProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TransportProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
