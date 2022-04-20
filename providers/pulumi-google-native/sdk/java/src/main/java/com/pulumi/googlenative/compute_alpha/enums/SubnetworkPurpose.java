// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn&#39;t supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    @EnumType
    public enum SubnetworkPurpose {
        /**
         * Subnetwork used to aggregate multiple private subnetworks.
         * 
         */
        Aggregate("AGGREGATE"),
        /**
         * Subnetworks created for Cloud Extension Machines.
         * 
         */
        CloudExtension("CLOUD_EXTENSION"),
        /**
         * Subnet reserved for Global Internal HTTP(S) Load Balancing.
         * 
         */
        GlobalManagedProxy("GLOBAL_MANAGED_PROXY"),
        /**
         * Subnet reserved for Internal HTTP(S) Load Balancing.
         * 
         */
        InternalHttpsLoadBalancer("INTERNAL_HTTPS_LOAD_BALANCER"),
        /**
         * Regular user created or automatically created subnet.
         * 
         */
        Private("PRIVATE"),
        /**
         * Subnetwork used as source range for Private NAT Gateways.
         * 
         */
        PrivateNat("PRIVATE_NAT"),
        /**
         * Regular user created or automatically created subnet.
         * 
         */
        PrivateRfc1918("PRIVATE_RFC_1918"),
        /**
         * Subnetworks created for Private Service Connect in the producer network.
         * 
         */
        PrivateServiceConnect("PRIVATE_SERVICE_CONNECT"),
        /**
         * Subnetwork used for Regional Internal/External HTTP(S) Load Balancing.
         * 
         */
        RegionalManagedProxy("REGIONAL_MANAGED_PROXY");

        private final String value;

        SubnetworkPurpose(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SubnetworkPurpose[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
