// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum RouterBgpAdvertisedGroupsItem {
        /**
         * Advertise peer subnets of the router&#39;s VPC.
         * 
         */
        AllPeerVpcSubnets("ALL_PEER_VPC_SUBNETS"),
        /**
         * Advertise all available subnets (including peer VPC subnets).
         * 
         */
        AllSubnets("ALL_SUBNETS"),
        /**
         * Advertise the router&#39;s own VPC subnets.
         * 
         */
        AllVpcSubnets("ALL_VPC_SUBNETS");

        private final String value;

        RouterBgpAdvertisedGroupsItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RouterBgpAdvertisedGroupsItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
