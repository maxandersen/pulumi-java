// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The IPSec integrity algorithm (IKE phase 1).
     * 
     */
    @EnumType
    public enum IpsecIntegrity {
        MD5("MD5"),
        SHA1("SHA1"),
        SHA256("SHA256"),
        GCMAES128("GCMAES128"),
        GCMAES192("GCMAES192"),
        GCMAES256("GCMAES256");

        private final String value;

        IpsecIntegrity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IpsecIntegrity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
