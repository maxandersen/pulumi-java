// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Gets or sets provisioning state of the private endpoint connection
     * 
     */
    @EnumType
    public enum ProvisioningState {
        Succeeded("Succeeded"),
        Deleting("Deleting"),
        Failed("Failed"),
        Pending("Pending");

        private final String value;

        ProvisioningState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ProvisioningState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
