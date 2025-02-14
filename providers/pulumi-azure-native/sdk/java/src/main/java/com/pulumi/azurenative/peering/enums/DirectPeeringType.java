// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of direct peering.
     * 
     */
    @EnumType
    public enum DirectPeeringType {
        Edge("Edge"),
        Transit("Transit"),
        Cdn("Cdn"),
        Internal("Internal"),
        Ix("Ix"),
        IxRs("IxRs"),
        Voice("Voice");

        private final String value;

        DirectPeeringType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DirectPeeringType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
