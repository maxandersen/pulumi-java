// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recaptchaenterprise_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE.
     * 
     */
    @EnumType
    public enum GoogleCloudRecaptchaenterpriseV1WebKeySettingsChallengeSecurityPreference {
        /**
         * Default type that indicates this enum hasn&#39;t been specified.
         * 
         */
        ChallengeSecurityPreferenceUnspecified("CHALLENGE_SECURITY_PREFERENCE_UNSPECIFIED"),
        /**
         * Key tends to show fewer and easier challenges.
         * 
         */
        Usability("USABILITY"),
        /**
         * Key tends to show balanced (in amount and difficulty) challenges.
         * 
         */
        Balance("BALANCE"),
        /**
         * Key tends to show more and harder challenges.
         * 
         */
        Security("SECURITY");

        private final String value;

        GoogleCloudRecaptchaenterpriseV1WebKeySettingsChallengeSecurityPreference(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudRecaptchaenterpriseV1WebKeySettingsChallengeSecurityPreference[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
