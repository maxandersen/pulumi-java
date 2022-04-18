// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Scope at which the operator will be installed.
     * 
     */
    @EnumType
    public enum ScopeType {
        Cluster("cluster"),
        Namespace("namespace");

        private final String value;

        ScopeType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ScopeType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
