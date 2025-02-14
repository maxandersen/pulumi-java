// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Which load balancer type is installed for Cloud Run.
     * 
     */
    @EnumType
    public enum CloudRunConfigLoadBalancerType {
        /**
         * Load balancer type for Cloud Run is unspecified.
         * 
         */
        LoadBalancerTypeUnspecified("LOAD_BALANCER_TYPE_UNSPECIFIED"),
        /**
         * Install external load balancer for Cloud Run.
         * 
         */
        LoadBalancerTypeExternal("LOAD_BALANCER_TYPE_EXTERNAL"),
        /**
         * Install internal load balancer for Cloud Run.
         * 
         */
        LoadBalancerTypeInternal("LOAD_BALANCER_TYPE_INTERNAL");

        private final String value;

        CloudRunConfigLoadBalancerType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CloudRunConfigLoadBalancerType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
