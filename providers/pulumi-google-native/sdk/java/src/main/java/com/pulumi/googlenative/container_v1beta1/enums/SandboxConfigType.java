// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of the sandbox to use for the node.
     * 
     */
    @EnumType
    public enum SandboxConfigType {
        /**
         * Default value. This should not be used.
         * 
         */
        Unspecified("UNSPECIFIED"),
        /**
         * Run sandbox using gvisor.
         * 
         */
        Gvisor("GVISOR");

        private final String value;

        SandboxConfigType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SandboxConfigType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
