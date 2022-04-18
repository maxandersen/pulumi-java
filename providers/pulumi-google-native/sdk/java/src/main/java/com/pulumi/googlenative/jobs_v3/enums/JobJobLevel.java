// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The experience level associated with the job, such as "Entry Level".
     * 
     */
    @EnumType
    public enum JobJobLevel {
        /**
         * The default value if the level is not specified.
         * 
         */
        JobLevelUnspecified("JOB_LEVEL_UNSPECIFIED"),
        /**
         * Entry-level individual contributors, typically with less than 2 years of experience in a similar role. Includes interns.
         * 
         */
        EntryLevel("ENTRY_LEVEL"),
        /**
         * Experienced individual contributors, typically with 2+ years of experience in a similar role.
         * 
         */
        Experienced("EXPERIENCED"),
        /**
         * Entry- to mid-level managers responsible for managing a team of people.
         * 
         */
        Manager("MANAGER"),
        /**
         * Senior-level managers responsible for managing teams of managers.
         * 
         */
        Director("DIRECTOR"),
        /**
         * Executive-level managers and above, including C-level positions.
         * 
         */
        Executive("EXECUTIVE");

        private final String value;

        JobJobLevel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobJobLevel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
