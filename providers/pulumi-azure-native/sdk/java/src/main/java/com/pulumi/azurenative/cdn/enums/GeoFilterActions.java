// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Action of the geo filter, i.e. allow or block access.
     * 
     */
    @EnumType
    public enum GeoFilterActions {
        Block("Block"),
        Allow("Allow");

        private final String value;

        GeoFilterActions(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GeoFilterActions[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
