// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.refactorspaces.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum RouteMethod {
        Delete("DELETE"),
        Get("GET"),
        Head("HEAD"),
        Options("OPTIONS"),
        Patch("PATCH"),
        Post("POST"),
        Put("PUT");

        private final String value;

        RouteMethod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RouteMethod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
