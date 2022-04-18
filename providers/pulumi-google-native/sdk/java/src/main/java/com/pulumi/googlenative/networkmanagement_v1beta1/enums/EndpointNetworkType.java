// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of the network where the endpoint is located. Applicable only to source endpoint, as destination network type can be inferred from the source.
     * 
     */
    @EnumType
    public enum EndpointNetworkType {
        /**
         * Default type if unspecified.
         * 
         */
        NetworkTypeUnspecified("NETWORK_TYPE_UNSPECIFIED"),
        /**
         * A network hosted within Google Cloud Platform. To receive more detailed output, specify the URI for the source or destination network.
         * 
         */
        GcpNetwork("GCP_NETWORK"),
        /**
         * A network hosted outside of Google Cloud Platform. This can be an on-premises network, or a network hosted by another cloud provider.
         * 
         */
        NonGcpNetwork("NON_GCP_NETWORK");

        private final String value;

        EndpointNetworkType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EndpointNetworkType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
