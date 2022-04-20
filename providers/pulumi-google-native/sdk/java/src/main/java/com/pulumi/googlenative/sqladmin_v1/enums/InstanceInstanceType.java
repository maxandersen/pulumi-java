// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The instance type.
     * 
     */
    @EnumType
    public enum InstanceInstanceType {
        /**
         * This is an unknown Cloud SQL instance type.
         * 
         */
        SqlInstanceTypeUnspecified("SQL_INSTANCE_TYPE_UNSPECIFIED"),
        /**
         * A regular Cloud SQL instance that is not replicating from a primary instance.
         * 
         */
        CloudSqlInstance("CLOUD_SQL_INSTANCE"),
        /**
         * An instance running on the customer&#39;s premises that is not managed by Cloud SQL.
         * 
         */
        OnPremisesInstance("ON_PREMISES_INSTANCE"),
        /**
         * A Cloud SQL instance acting as a read-replica.
         * 
         */
        ReadReplicaInstance("READ_REPLICA_INSTANCE");

        private final String value;

        InstanceInstanceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceInstanceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
