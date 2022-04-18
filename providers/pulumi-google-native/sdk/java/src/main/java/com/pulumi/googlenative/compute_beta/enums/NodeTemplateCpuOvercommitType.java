// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * CPU overcommit.
     * 
     */
    @EnumType
    public enum NodeTemplateCpuOvercommitType {
        CpuOvercommitTypeUnspecified("CPU_OVERCOMMIT_TYPE_UNSPECIFIED"),
        Enabled("ENABLED"),
        None("NONE");

        private final String value;

        NodeTemplateCpuOvercommitType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NodeTemplateCpuOvercommitType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
