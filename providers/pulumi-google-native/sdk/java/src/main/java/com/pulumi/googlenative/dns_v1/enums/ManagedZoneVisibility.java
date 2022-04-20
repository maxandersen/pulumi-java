// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The zone&#39;s visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
     * 
     */
    @EnumType
    public enum ManagedZoneVisibility {
        Public("public"),
        Private("private");

        private final String value;

        ManagedZoneVisibility(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ManagedZoneVisibility[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
