// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the query&#39;s source entity
     * 
     */
    @EnumType
    public enum EntityType {
        /**
         * Entity represents account in the system.
         * 
         */
        Account("Account"),
        /**
         * Entity represents host in the system.
         * 
         */
        Host("Host"),
        /**
         * Entity represents file in the system.
         * 
         */
        File("File"),
        /**
         * Entity represents azure resource in the system.
         * 
         */
        AzureResource("AzureResource"),
        /**
         * Entity represents cloud application in the system.
         * 
         */
        CloudApplication("CloudApplication"),
        /**
         * Entity represents dns in the system.
         * 
         */
        DNS("DNS"),
        /**
         * Entity represents file hash in the system.
         * 
         */
        FileHash("FileHash"),
        /**
         * Entity represents ip in the system.
         * 
         */
        IP("IP"),
        /**
         * Entity represents malware in the system.
         * 
         */
        Malware("Malware"),
        /**
         * Entity represents process in the system.
         * 
         */
        Process("Process"),
        /**
         * Entity represents registry key in the system.
         * 
         */
        RegistryKey("RegistryKey"),
        /**
         * Entity represents registry value in the system.
         * 
         */
        RegistryValue("RegistryValue"),
        /**
         * Entity represents security group in the system.
         * 
         */
        SecurityGroup("SecurityGroup"),
        /**
         * Entity represents url in the system.
         * 
         */
        URL("URL"),
        /**
         * Entity represents IoT device in the system.
         * 
         */
        IoTDevice("IoTDevice"),
        /**
         * Entity represents security alert in the system.
         * 
         */
        SecurityAlert("SecurityAlert"),
        /**
         * Entity represents HuntingBookmark in the system.
         * 
         */
        HuntingBookmark("HuntingBookmark"),
        /**
         * Entity represents mail cluster in the system.
         * 
         */
        MailCluster("MailCluster"),
        /**
         * Entity represents mail message in the system.
         * 
         */
        MailMessage("MailMessage"),
        /**
         * Entity represents mailbox in the system.
         * 
         */
        Mailbox("Mailbox"),
        /**
         * Entity represents submission mail in the system.
         * 
         */
        SubmissionMail("SubmissionMail");

        private final String value;

        EntityType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EntityType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
