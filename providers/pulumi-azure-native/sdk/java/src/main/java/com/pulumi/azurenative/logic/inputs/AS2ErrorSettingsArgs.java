// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The AS2 agreement error settings.
 * 
 */
public final class AS2ErrorSettingsArgs extends ResourceArgs {

    public static final AS2ErrorSettingsArgs Empty = new AS2ErrorSettingsArgs();

    /**
     * The value indicating whether to resend message If MDN is not received.
     * 
     */
    @Import(name="resendIfMDNNotReceived", required=true)
    private Output<Boolean> resendIfMDNNotReceived;

    /**
     * @return The value indicating whether to resend message If MDN is not received.
     * 
     */
    public Output<Boolean> resendIfMDNNotReceived() {
        return this.resendIfMDNNotReceived;
    }

    /**
     * The value indicating whether to suspend duplicate message.
     * 
     */
    @Import(name="suspendDuplicateMessage", required=true)
    private Output<Boolean> suspendDuplicateMessage;

    /**
     * @return The value indicating whether to suspend duplicate message.
     * 
     */
    public Output<Boolean> suspendDuplicateMessage() {
        return this.suspendDuplicateMessage;
    }

    private AS2ErrorSettingsArgs() {}

    private AS2ErrorSettingsArgs(AS2ErrorSettingsArgs $) {
        this.resendIfMDNNotReceived = $.resendIfMDNNotReceived;
        this.suspendDuplicateMessage = $.suspendDuplicateMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AS2ErrorSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2ErrorSettingsArgs $;

        public Builder() {
            $ = new AS2ErrorSettingsArgs();
        }

        public Builder(AS2ErrorSettingsArgs defaults) {
            $ = new AS2ErrorSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resendIfMDNNotReceived The value indicating whether to resend message If MDN is not received.
         * 
         * @return builder
         * 
         */
        public Builder resendIfMDNNotReceived(Output<Boolean> resendIfMDNNotReceived) {
            $.resendIfMDNNotReceived = resendIfMDNNotReceived;
            return this;
        }

        /**
         * @param resendIfMDNNotReceived The value indicating whether to resend message If MDN is not received.
         * 
         * @return builder
         * 
         */
        public Builder resendIfMDNNotReceived(Boolean resendIfMDNNotReceived) {
            return resendIfMDNNotReceived(Output.of(resendIfMDNNotReceived));
        }

        /**
         * @param suspendDuplicateMessage The value indicating whether to suspend duplicate message.
         * 
         * @return builder
         * 
         */
        public Builder suspendDuplicateMessage(Output<Boolean> suspendDuplicateMessage) {
            $.suspendDuplicateMessage = suspendDuplicateMessage;
            return this;
        }

        /**
         * @param suspendDuplicateMessage The value indicating whether to suspend duplicate message.
         * 
         * @return builder
         * 
         */
        public Builder suspendDuplicateMessage(Boolean suspendDuplicateMessage) {
            return suspendDuplicateMessage(Output.of(suspendDuplicateMessage));
        }

        public AS2ErrorSettingsArgs build() {
            $.resendIfMDNNotReceived = Objects.requireNonNull($.resendIfMDNNotReceived, "expected parameter 'resendIfMDNNotReceived' to be non-null");
            $.suspendDuplicateMessage = Objects.requireNonNull($.suspendDuplicateMessage, "expected parameter 'suspendDuplicateMessage' to be non-null");
            return $;
        }
    }

}
