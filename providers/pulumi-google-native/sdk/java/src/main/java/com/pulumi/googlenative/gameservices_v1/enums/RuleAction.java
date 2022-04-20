// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required
     * 
     */
    @EnumType
    public enum RuleAction {
        /**
         * Default no action.
         * 
         */
        NoAction("NO_ACTION"),
        /**
         * Matching &#39;Entries&#39; grant access.
         * 
         */
        Allow("ALLOW"),
        /**
         * Matching &#39;Entries&#39; grant access and the caller promises to log the request per the returned log_configs.
         * 
         */
        AllowWithLog("ALLOW_WITH_LOG"),
        /**
         * Matching &#39;Entries&#39; deny access.
         * 
         */
        Deny("DENY"),
        /**
         * Matching &#39;Entries&#39; deny access and the caller promises to log the request per the returned log_configs.
         * 
         */
        DenyWithLog("DENY_WITH_LOG"),
        /**
         * Matching &#39;Entries&#39; tell IAM.Check callers to generate logs.
         * 
         */
        Log("LOG");

        private final String value;

        RuleAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RuleAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
