// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of IoT Security recommendation.
     * 
     */
    @EnumType
    public enum RecommendationType {
        /**
         * Authentication schema used for pull an edge module from an ACR repository does not use Service Principal Authentication.
         * 
         */
        IoT_ACRAuthentication("IoT_ACRAuthentication"),
        /**
         * IoT agent message size capacity is currently underutilized, causing an increase in the number of sent messages. Adjust message intervals for better utilization.
         * 
         */
        IoT_AgentSendsUnutilizedMessages("IoT_AgentSendsUnutilizedMessages"),
        /**
         * Identified security related system configuration issues.
         * 
         */
        IoT_Baseline("IoT_Baseline"),
        /**
         * You can optimize Edge Hub memory usage by turning off protocol heads for any protocols not used by Edge modules in your solution.
         * 
         */
        IoT_EdgeHubMemOptimize("IoT_EdgeHubMemOptimize"),
        /**
         * Logging is disabled for this edge module.
         * 
         */
        IoT_EdgeLoggingOptions("IoT_EdgeLoggingOptions"),
        /**
         * A minority within a device security group has inconsistent Edge Module settings with the rest of their group.
         * 
         */
        IoT_InconsistentModuleSettings("IoT_InconsistentModuleSettings"),
        /**
         * Install the Azure Security of Things Agent.
         * 
         */
        IoT_InstallAgent("IoT_InstallAgent"),
        /**
         * IP Filter Configuration should have rules defined for allowed traffic and should deny all other traffic by default.
         * 
         */
        IoT_IPFilter_DenyAll("IoT_IPFilter_DenyAll"),
        /**
         * An Allow IP Filter rules source IP range is too large. Overly permissive rules might expose your IoT hub to malicious intenders.
         * 
         */
        IoT_IPFilter_PermissiveRule("IoT_IPFilter_PermissiveRule"),
        /**
         * A listening endpoint was found on the device.
         * 
         */
        IoT_OpenPorts("IoT_OpenPorts"),
        /**
         * An Allowed firewall policy was found (INPUT/OUTPUT). The policy should Deny all traffic by default and define rules to allow necessary communication to/from the device.
         * 
         */
        IoT_PermissiveFirewallPolicy("IoT_PermissiveFirewallPolicy"),
        /**
         * A rule in the firewall has been found that contains a permissive pattern for a wide range of IP addresses or Ports.
         * 
         */
        IoT_PermissiveInputFirewallRules("IoT_PermissiveInputFirewallRules"),
        /**
         * A rule in the firewall has been found that contains a permissive pattern for a wide range of IP addresses or Ports.
         * 
         */
        IoT_PermissiveOutputFirewallRules("IoT_PermissiveOutputFirewallRules"),
        /**
         * Edge module is configured to run in privileged mode, with extensive Linux capabilities or with host-level network access (send/receive data to host machine).
         * 
         */
        IoT_PrivilegedDockerOptions("IoT_PrivilegedDockerOptions"),
        /**
         * Same authentication credentials to the IoT Hub used by multiple devices. This could indicate an illegitimate device impersonating a legitimate device. It also exposes the risk of device impersonation by an attacker.
         * 
         */
        IoT_SharedCredentials("IoT_SharedCredentials"),
        /**
         * Insecure TLS configurations detected. Immediate upgrade recommended.
         * 
         */
        IoT_VulnerableTLSCipherSuite("IoT_VulnerableTLSCipherSuite");

        private final String value;

        RecommendationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RecommendationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
