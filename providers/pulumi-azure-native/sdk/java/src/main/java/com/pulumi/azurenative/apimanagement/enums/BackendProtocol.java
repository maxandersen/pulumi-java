// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Backend communication protocol.
     * 
     */
    @EnumType
    public enum BackendProtocol {
        /**
         * The Backend is a RESTful service.
         * 
         */
        Http("http"),
        /**
         * The Backend is a SOAP service.
         * 
         */
        Soap("soap");

        private final String value;

        BackendProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackendProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
