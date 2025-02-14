// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * If you have configured an application-based health check for the group, this field controls whether to trigger VM autohealing based on a failed health check. Valid values are: - ON (default): The group recreates running VMs that fail the application-based health check. - OFF: When set to OFF, you can still observe instance health state, but the group does not recreate VMs that fail the application-based health check. This is useful for troubleshooting and setting up your health check configuration.
     * 
     */
    @EnumType
    public enum InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck {
        /**
         * When set to OFF, you can still observe instance health state, but the group does not recreate VMs that fail the application-based health check. This is useful for troubleshooting and setting up your health check configuration.
         * 
         */
        Off("OFF"),
        /**
         * (Default) The group recreates running VMs that fail the group&#39;s application-based health check.
         * 
         */
        On("ON");

        private final String value;

        InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersOnHealthCheck[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
