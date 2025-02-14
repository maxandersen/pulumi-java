// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Allowed request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    @EnumType
    public enum SignalRRequestType {
        ClientConnection("ClientConnection"),
        ServerConnection("ServerConnection"),
        RESTAPI("RESTAPI"),
        Trace("Trace");

        private final String value;

        SignalRRequestType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SignalRRequestType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
