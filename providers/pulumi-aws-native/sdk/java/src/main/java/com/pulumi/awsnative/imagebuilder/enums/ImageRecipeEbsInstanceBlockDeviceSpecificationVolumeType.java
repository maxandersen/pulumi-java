// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Use to override the device&#39;s volume type.
     * 
     */
    @EnumType
    public enum ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType {
        Standard("standard"),
        Io1("io1"),
        Io2("io2"),
        Gp2("gp2"),
        Gp3("gp3"),
        Sc1("sc1"),
        St1("st1");

        private final String value;

        ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
