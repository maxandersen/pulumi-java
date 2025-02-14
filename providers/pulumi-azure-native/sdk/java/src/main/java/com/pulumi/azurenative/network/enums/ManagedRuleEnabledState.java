// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The state of the managed rule. Defaults to Disabled if not specified.
     * 
     */
    @EnumType
    public enum ManagedRuleEnabledState {
        Disabled("Disabled");

        private final String value;

        ManagedRuleEnabledState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ManagedRuleEnabledState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
