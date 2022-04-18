// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the load balancer type. A backend service created for one type of load balancer cannot be used with another. For more information, refer to Choosing a load balancer.
     * 
     */
    @EnumType
    public enum RegionBackendServiceLoadBalancingScheme {
        /**
         * Signifies that this will be used for external HTTP(S), SSL Proxy, TCP Proxy, or Network Load Balancing
         * 
         */
        External("EXTERNAL"),
        /**
         * Signifies that this will be used for External Managed HTTP(S) Load Balancing.
         * 
         */
        ExternalManaged("EXTERNAL_MANAGED"),
        /**
         * Signifies that this will be used for Internal TCP/UDP Load Balancing.
         * 
         */
        Internal("INTERNAL"),
        /**
         * Signifies that this will be used for Internal HTTP(S) Load Balancing.
         * 
         */
        InternalManaged("INTERNAL_MANAGED"),
        /**
         * Signifies that this will be used by Traffic Director.
         * 
         */
        InternalSelfManaged("INTERNAL_SELF_MANAGED"),
        InvalidLoadBalancingScheme("INVALID_LOAD_BALANCING_SCHEME");

        private final String value;

        RegionBackendServiceLoadBalancingScheme(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegionBackendServiceLoadBalancingScheme[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
