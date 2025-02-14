// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The IP Filter Action
     * 
     */
    @EnumType
    public enum IPAction {
        Accept("Accept"),
        Reject("Reject");

        private final String value;

        IPAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IPAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
