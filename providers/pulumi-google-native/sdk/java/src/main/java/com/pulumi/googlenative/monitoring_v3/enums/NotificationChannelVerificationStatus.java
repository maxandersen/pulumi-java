// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel operation. To change the value of this field, you must call VerifyNotificationChannel.
     * 
     */
    @EnumType
    public enum NotificationChannelVerificationStatus {
        /**
         * Sentinel value used to indicate that the state is unknown, omitted, or is not applicable (as in the case of channels that neither support nor require verification in order to function).
         * 
         */
        VerificationStatusUnspecified("VERIFICATION_STATUS_UNSPECIFIED"),
        /**
         * The channel has yet to be verified and requires verification to function. Note that this state also applies to the case where the verification process has been initiated by sending a verification code but where the verification code has not been submitted to complete the process.
         * 
         */
        Unverified("UNVERIFIED"),
        /**
         * It has been proven that notifications can be received on this notification channel and that someone on the project has access to messages that are delivered to that channel.
         * 
         */
        Verified("VERIFIED");

        private final String value;

        NotificationChannelVerificationStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NotificationChannelVerificationStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
