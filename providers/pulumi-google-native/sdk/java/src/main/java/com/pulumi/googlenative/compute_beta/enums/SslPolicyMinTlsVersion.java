// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
     * 
     */
    @EnumType
    public enum SslPolicyMinTlsVersion {
        /**
         * TLS 1.0
         * 
         */
        Tls10("TLS_1_0"),
        /**
         * TLS 1.1
         * 
         */
        Tls11("TLS_1_1"),
        /**
         * TLS 1.2
         * 
         */
        Tls12("TLS_1_2");

        private final String value;

        SslPolicyMinTlsVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SslPolicyMinTlsVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
