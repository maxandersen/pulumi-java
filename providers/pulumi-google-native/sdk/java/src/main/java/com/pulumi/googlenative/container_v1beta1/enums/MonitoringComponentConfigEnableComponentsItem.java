// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum MonitoringComponentConfigEnableComponentsItem {
        /**
         * Default value. This shouldn&#39;t be used.
         * 
         */
        ComponentUnspecified("COMPONENT_UNSPECIFIED"),
        /**
         * system components
         * 
         */
        SystemComponents("SYSTEM_COMPONENTS"),
        /**
         * Deprecated: Use Google Cloud Managed Service for Prometheus.
         * 
         */
        Workloads("WORKLOADS");

        private final String value;

        MonitoringComponentConfigEnableComponentsItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MonitoringComponentConfigEnableComponentsItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
