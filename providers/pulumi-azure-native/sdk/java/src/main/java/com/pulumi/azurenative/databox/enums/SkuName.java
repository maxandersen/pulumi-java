// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The sku name.
     * 
     */
    @EnumType
    public enum SkuName {
        /**
         * Data Box.
         * 
         */
        DataBox("DataBox"),
        /**
         * Data Box Disk.
         * 
         */
        DataBoxDisk("DataBoxDisk"),
        /**
         * Data Box Heavy.
         * 
         */
        DataBoxHeavy("DataBoxHeavy");

        private final String value;

        SkuName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SkuName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
