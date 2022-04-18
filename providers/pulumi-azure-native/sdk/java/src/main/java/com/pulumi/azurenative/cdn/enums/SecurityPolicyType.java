// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the Security policy to create.
     * 
     */
    @EnumType
    public enum SecurityPolicyType {
        WebApplicationFirewall("WebApplicationFirewall");

        private final String value;

        SecurityPolicyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecurityPolicyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
