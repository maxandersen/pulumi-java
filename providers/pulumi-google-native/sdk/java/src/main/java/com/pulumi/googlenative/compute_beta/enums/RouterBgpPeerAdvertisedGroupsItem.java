// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum RouterBgpPeerAdvertisedGroupsItem {
        /**
         * Advertise all available subnets (including peer VPC subnets).
         * 
         */
        AllSubnets("ALL_SUBNETS");

        private final String value;

        RouterBgpPeerAdvertisedGroupsItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RouterBgpPeerAdvertisedGroupsItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
