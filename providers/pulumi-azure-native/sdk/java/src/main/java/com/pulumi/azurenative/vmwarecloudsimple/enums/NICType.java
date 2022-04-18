// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.vmwarecloudsimple.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * NIC type
     * 
     */
    @EnumType
    public enum NICType {
        E1000("E1000"),
        E1000E("E1000E"),
        PCNET32("PCNET32"),
        VMXNET("VMXNET"),
        VMXNET2("VMXNET2"),
        VMXNET3("VMXNET3");

        private final String value;

        NICType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NICType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
