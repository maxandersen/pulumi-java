// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed while the state is OFF.
     * 
     */
    @EnumType
    public enum ManagedZoneDnsSecConfigNonExistence {
        Nsec("nsec"),
        Nsec3("nsec3");

        private final String value;

        ManagedZoneDnsSecConfigNonExistence(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ManagedZoneDnsSecConfigNonExistence[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
