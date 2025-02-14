// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The setting to enable usage of premium data disks.
     * When its value is &#39;Enabled&#39;, creation of standard or premium data disks is allowed.
     * When its value is &#39;Disabled&#39;, only creation of standard data disks is allowed.
     * 
     */
    @EnumType
    public enum PremiumDataDisk {
        Disabled("Disabled"),
        Enabled("Enabled");

        private final String value;

        PremiumDataDisk(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PremiumDataDisk[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
