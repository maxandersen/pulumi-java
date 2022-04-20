// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DevicePolicyAllowedDeviceManagementLevelsItem {
        /**
         * The device&#39;s management level is not specified or not known.
         * 
         */
        ManagementUnspecified("MANAGEMENT_UNSPECIFIED"),
        /**
         * The device is not managed.
         * 
         */
        None("NONE"),
        /**
         * Basic management is enabled, which is generally limited to monitoring and wiping the corporate account.
         * 
         */
        Basic("BASIC"),
        /**
         * Complete device management. This includes more thorough monitoring and the ability to directly manage the device (such as remote wiping). This can be enabled through the Android Enterprise Platform.
         * 
         */
        Complete("COMPLETE");

        private final String value;

        DevicePolicyAllowedDeviceManagementLevelsItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DevicePolicyAllowedDeviceManagementLevelsItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
