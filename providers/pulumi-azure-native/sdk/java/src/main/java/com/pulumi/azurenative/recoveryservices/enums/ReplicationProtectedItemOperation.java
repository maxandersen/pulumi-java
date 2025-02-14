// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ReplicationProtectedItemOperation {
        ReverseReplicate("ReverseReplicate"),
        Commit("Commit"),
        PlannedFailover("PlannedFailover"),
        UnplannedFailover("UnplannedFailover"),
        DisableProtection("DisableProtection"),
        TestFailover("TestFailover"),
        TestFailoverCleanup("TestFailoverCleanup"),
        Failback("Failback"),
        FinalizeFailback("FinalizeFailback"),
        ChangePit("ChangePit"),
        RepairReplication("RepairReplication"),
        SwitchProtection("SwitchProtection"),
        CompleteMigration("CompleteMigration");

        private final String value;

        ReplicationProtectedItemOperation(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ReplicationProtectedItemOperation[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
