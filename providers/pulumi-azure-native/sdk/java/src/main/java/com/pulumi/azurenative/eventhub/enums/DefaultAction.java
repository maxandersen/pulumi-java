// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Default Action for Network Rule Set
     * 
     */
    @EnumType
    public enum DefaultAction {
        Allow("Allow"),
        Deny("Deny");

        private final String value;

        DefaultAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DefaultAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
