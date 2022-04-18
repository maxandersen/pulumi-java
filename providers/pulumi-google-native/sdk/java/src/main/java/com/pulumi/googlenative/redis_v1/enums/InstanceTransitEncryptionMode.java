// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the instance.
     * 
     */
    @EnumType
    public enum InstanceTransitEncryptionMode {
        /**
         * Not set.
         * 
         */
        TransitEncryptionModeUnspecified("TRANSIT_ENCRYPTION_MODE_UNSPECIFIED"),
        /**
         * Client to Server traffic encryption enabled with server authentication.
         * 
         */
        ServerAuthentication("SERVER_AUTHENTICATION"),
        /**
         * TLS is disabled for the instance.
         * 
         */
        Disabled("DISABLED");

        private final String value;

        InstanceTransitEncryptionMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceTransitEncryptionMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
