// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Supported protocols for the customer&#39;s endpoint.
     * 
     */
    @EnumType
    public enum AFDEndpointProtocols {
        Http("Http"),
        Https("Https");

        private final String value;

        AFDEndpointProtocols(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AFDEndpointProtocols[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
