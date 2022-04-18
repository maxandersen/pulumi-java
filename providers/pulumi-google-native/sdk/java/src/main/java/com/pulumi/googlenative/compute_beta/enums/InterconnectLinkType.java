// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    @EnumType
    public enum InterconnectLinkType {
        /**
         * 100G Ethernet, LR Optics.
         * 
         */
        LinkTypeEthernet100gLr("LINK_TYPE_ETHERNET_100G_LR"),
        /**
         * 10G Ethernet, LR Optics. [(rate_bps) = 10000000000];
         * 
         */
        LinkTypeEthernet10gLr("LINK_TYPE_ETHERNET_10G_LR");

        private final String value;

        InterconnectLinkType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InterconnectLinkType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
