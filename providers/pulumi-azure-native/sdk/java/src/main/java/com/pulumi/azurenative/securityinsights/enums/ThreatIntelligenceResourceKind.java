// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The kind of the entity.
     * 
     */
    @EnumType
    public enum ThreatIntelligenceResourceKind {
        /**
         * Entity represents threat intelligence indicator in the system.
         * 
         */
        Indicator("indicator");

        private final String value;

        ThreatIntelligenceResourceKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ThreatIntelligenceResourceKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
