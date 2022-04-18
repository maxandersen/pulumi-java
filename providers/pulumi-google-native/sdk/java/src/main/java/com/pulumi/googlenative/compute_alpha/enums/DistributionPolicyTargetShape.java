// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
     * 
     */
    @EnumType
    public enum DistributionPolicyTargetShape {
        /**
         * The group picks zones for creating VM instances to fulfill the requested number of VMs within present resource constraints and to maximize utilization of unused zonal reservations. Recommended for batch workloads that do not require high availability.
         * 
         */
        Any("ANY"),
        /**
         * The group prioritizes acquisition of resources, scheduling VMs in zones where resources are available while distributing VMs as evenly as possible across selected zones to minimize the impact of zonal failure. Recommended for highly available serving workloads.
         * 
         */
        Balanced("BALANCED"),
        /**
         * The group schedules VM instance creation and deletion to achieve and maintain an even number of managed instances across the selected zones. The distribution is even when the number of managed instances does not differ by more than 1 between any two zones. Recommended for highly available serving workloads.
         * 
         */
        Even("EVEN");

        private final String value;

        DistributionPolicyTargetShape(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DistributionPolicyTargetShape[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
