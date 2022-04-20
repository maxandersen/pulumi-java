// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * OS disk type to be used for machines in a given agent pool. Allowed values are &#39;Ephemeral&#39; and &#39;Managed&#39;. If unspecified, defaults to &#39;Ephemeral&#39; when the VM supports ephemeral OS and has a cache disk larger than the requested OSDiskSizeGB. Otherwise, defaults to &#39;Managed&#39;. May not be changed after creation.
     * 
     */
    @EnumType
    public enum OSDiskType {
        Managed("Managed"),
        Ephemeral("Ephemeral");

        private final String value;

        OSDiskType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OSDiskType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
