// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum JobEmploymentTypesItem {
        /**
         * The default value if the employment type is not specified.
         * 
         */
        EmploymentTypeUnspecified("EMPLOYMENT_TYPE_UNSPECIFIED"),
        /**
         * The job requires working a number of hours that constitute full time employment, typically 40 or more hours per week.
         * 
         */
        FullTime("FULL_TIME"),
        /**
         * The job entails working fewer hours than a full time job, typically less than 40 hours a week.
         * 
         */
        PartTime("PART_TIME"),
        /**
         * The job is offered as a contracted, as opposed to a salaried employee, position.
         * 
         */
        Contractor("CONTRACTOR"),
        /**
         * The job is offered as a contracted position with the understanding that it's converted into a full-time position at the end of the contract. Jobs of this type are also returned by a search for EmploymentType.CONTRACTOR jobs.
         * 
         */
        ContractToHire("CONTRACT_TO_HIRE"),
        /**
         * The job is offered as a temporary employment opportunity, usually a short-term engagement.
         * 
         */
        Temporary("TEMPORARY"),
        /**
         * The job is a fixed-term opportunity for students or entry-level job seekers to obtain on-the-job training, typically offered as a summer position.
         * 
         */
        Intern("INTERN"),
        /**
         * The is an opportunity for an individual to volunteer, where there's no expectation of compensation for the provided services.
         * 
         */
        Volunteer("VOLUNTEER"),
        /**
         * The job requires an employee to work on an as-needed basis with a flexible schedule.
         * 
         */
        PerDiem("PER_DIEM"),
        /**
         * The job involves employing people in remote areas and flying them temporarily to the work site instead of relocating employees and their families permanently.
         * 
         */
        FlyInFlyOut("FLY_IN_FLY_OUT"),
        /**
         * The job does not fit any of the other listed types.
         * 
         */
        OtherEmploymentType("OTHER_EMPLOYMENT_TYPE");

        private final String value;

        JobEmploymentTypesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobEmploymentTypesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
