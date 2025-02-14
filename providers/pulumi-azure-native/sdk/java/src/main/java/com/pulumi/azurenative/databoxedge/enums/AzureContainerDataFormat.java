// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Storage format used for the file represented by the share.
     * 
     */
    @EnumType
    public enum AzureContainerDataFormat {
        BlockBlob("BlockBlob"),
        PageBlob("PageBlob"),
        AzureFile("AzureFile");

        private final String value;

        AzureContainerDataFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AzureContainerDataFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
