// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
     * 
     */
    @EnumType
    public enum NodeGroupMaintenancePolicy {
        /**
         * Allow the node and corresponding instances to retain default maintenance behavior.
         * 
         */
        Default("DEFAULT"),
        MaintenancePolicyUnspecified("MAINTENANCE_POLICY_UNSPECIFIED"),
        /**
         * When maintenance must be done on a node, the instances on that node will be moved to other nodes in the group. Instances with onHostMaintenance = MIGRATE will live migrate to their destinations while instances with onHostMaintenance = TERMINATE will terminate and then restart on their destination nodes if automaticRestart = true.
         * 
         */
        MigrateWithinNodeGroup("MIGRATE_WITHIN_NODE_GROUP"),
        /**
         * Instances in this group will restart on the same node when maintenance has completed. Instances must have onHostMaintenance = TERMINATE, and they will only restart if automaticRestart = true.
         * 
         */
        RestartInPlace("RESTART_IN_PLACE");

        private final String value;

        NodeGroupMaintenancePolicy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NodeGroupMaintenancePolicy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
