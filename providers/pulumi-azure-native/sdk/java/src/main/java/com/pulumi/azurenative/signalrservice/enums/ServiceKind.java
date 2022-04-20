// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The kind of the service - e.g. &#34;SignalR&#34;, or &#34;RawWebSockets&#34; for &#34;Microsoft.SignalRService/SignalR&#34;
     * 
     */
    @EnumType
    public enum ServiceKind {
        SignalR("SignalR"),
        RawWebSockets("RawWebSockets");

        private final String value;

        ServiceKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServiceKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
