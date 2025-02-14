// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mwaa.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Choice for mode of webserver access including over public internet or via private VPC endpoint.
     * 
     */
    @EnumType
    public enum EnvironmentWebserverAccessMode {
        PrivateOnly("PRIVATE_ONLY"),
        PublicOnly("PUBLIC_ONLY");

        private final String value;

        EnvironmentWebserverAccessMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EnvironmentWebserverAccessMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
