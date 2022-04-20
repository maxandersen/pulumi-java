// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to &#39;Disabled&#39;.
     * 
     */
    @EnumType
    public enum InterNodeCommunicationState {
        /**
         * Enable network communication between virtual machines.
         * 
         */
        Enabled("Enabled"),
        /**
         * Disable network communication between virtual machines.
         * 
         */
        Disabled("Disabled");

        private final String value;

        InterNodeCommunicationState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InterNodeCommunicationState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
