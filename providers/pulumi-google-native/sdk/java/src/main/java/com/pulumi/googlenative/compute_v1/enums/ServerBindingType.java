// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ServerBindingType {
        /**
         * Node may associate with any physical server over its lifetime.
         * 
         */
        RestartNodeOnAnyServer("RESTART_NODE_ON_ANY_SERVER"),
        /**
         * Node may associate with minimal physical servers over its lifetime.
         * 
         */
        RestartNodeOnMinimalServers("RESTART_NODE_ON_MINIMAL_SERVERS"),
        ServerBindingTypeUnspecified("SERVER_BINDING_TYPE_UNSPECIFIED");

        private final String value;

        ServerBindingType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServerBindingType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
