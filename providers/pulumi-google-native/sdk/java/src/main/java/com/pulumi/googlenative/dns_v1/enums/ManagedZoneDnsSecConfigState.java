// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies whether DNSSEC is enabled, and what mode it is in.
     * 
     */
    @EnumType
    public enum ManagedZoneDnsSecConfigState {
        /**
         * DNSSEC is disabled; the zone is not signed.
         * 
         */
        Off("off"),
        /**
         * DNSSEC is enabled; the zone is signed and fully managed.
         * 
         */
        On("on"),
        /**
         * DNSSEC is enabled, but in a &#34;transfer&#34; mode.
         * 
         */
        Transfer("transfer");

        private final String value;

        ManagedZoneDnsSecConfigState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ManagedZoneDnsSecConfigState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
