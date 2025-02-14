// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The convention used when determining the session cookie&#39;s expiration.
     * 
     */
    @EnumType
    public enum CookieExpirationConvention {
        FixedTime("FixedTime"),
        IdentityProviderDerived("IdentityProviderDerived");

        private final String value;

        CookieExpirationConvention(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CookieExpirationConvention[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
