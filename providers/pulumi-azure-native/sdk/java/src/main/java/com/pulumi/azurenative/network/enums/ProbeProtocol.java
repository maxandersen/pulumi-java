// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The protocol of the end point. If &#39;Tcp&#39; is specified, a received ACK is required for the probe to be successful. If &#39;Http&#39; or &#39;Https&#39; is specified, a 200 OK response from the specifies URI is required for the probe to be successful.
     * 
     */
    @EnumType
    public enum ProbeProtocol {
        Http("Http"),
        Tcp("Tcp"),
        Https("Https");

        private final String value;

        ProbeProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ProbeProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
