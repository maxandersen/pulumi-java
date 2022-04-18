// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The kind of web test this is, valid choices are ping and multistep.
     * 
     */
    @EnumType
    public enum WebTestKind {
        Ping("ping"),
        Multistep("multistep");

        private final String value;

        WebTestKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "WebTestKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
