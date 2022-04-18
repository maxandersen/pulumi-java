// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the image used to create this disk. The default and only value is RAW
     * 
     */
    @EnumType
    public enum ImageSourceType {
        Raw("RAW");

        private final String value;

        ImageSourceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ImageSourceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
