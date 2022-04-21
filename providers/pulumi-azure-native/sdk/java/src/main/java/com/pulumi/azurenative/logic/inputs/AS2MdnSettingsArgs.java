// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.HashingAlgorithm;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The AS2 agreement mdn settings.
 * 
 */
public final class AS2MdnSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AS2MdnSettingsArgs Empty = new AS2MdnSettingsArgs();

    /**
     * The disposition notification to header value.
     * 
     */
    @Import(name="dispositionNotificationTo")
    private @Nullable Output<String> dispositionNotificationTo;

    public Optional<Output<String>> dispositionNotificationTo() {
        return Optional.ofNullable(this.dispositionNotificationTo);
    }

    /**
     * The MDN text.
     * 
     */
    @Import(name="mdnText")
    private @Nullable Output<String> mdnText;

    public Optional<Output<String>> mdnText() {
        return Optional.ofNullable(this.mdnText);
    }

    /**
     * The signing or hashing algorithm.
     * 
     */
    @Import(name="micHashingAlgorithm", required=true)
    private Output<Either<String,HashingAlgorithm>> micHashingAlgorithm;

    public Output<Either<String,HashingAlgorithm>> micHashingAlgorithm() {
        return this.micHashingAlgorithm;
    }

    /**
     * The value indicating whether to send or request a MDN.
     * 
     */
    @Import(name="needMDN", required=true)
    private Output<Boolean> needMDN;

    public Output<Boolean> needMDN() {
        return this.needMDN;
    }

    /**
     * The receipt delivery URL.
     * 
     */
    @Import(name="receiptDeliveryUrl")
    private @Nullable Output<String> receiptDeliveryUrl;

    public Optional<Output<String>> receiptDeliveryUrl() {
        return Optional.ofNullable(this.receiptDeliveryUrl);
    }

    /**
     * The value indicating whether to send inbound MDN to message box.
     * 
     */
    @Import(name="sendInboundMDNToMessageBox", required=true)
    private Output<Boolean> sendInboundMDNToMessageBox;

    public Output<Boolean> sendInboundMDNToMessageBox() {
        return this.sendInboundMDNToMessageBox;
    }

    /**
     * The value indicating whether to send the asynchronous MDN.
     * 
     */
    @Import(name="sendMDNAsynchronously", required=true)
    private Output<Boolean> sendMDNAsynchronously;

    public Output<Boolean> sendMDNAsynchronously() {
        return this.sendMDNAsynchronously;
    }

    /**
     * The value indicating whether the MDN needs to be signed or not.
     * 
     */
    @Import(name="signMDN", required=true)
    private Output<Boolean> signMDN;

    public Output<Boolean> signMDN() {
        return this.signMDN;
    }

    /**
     * The value indicating whether to sign the outbound MDN if optional.
     * 
     */
    @Import(name="signOutboundMDNIfOptional", required=true)
    private Output<Boolean> signOutboundMDNIfOptional;

    public Output<Boolean> signOutboundMDNIfOptional() {
        return this.signOutboundMDNIfOptional;
    }

    private AS2MdnSettingsArgs() {}

    private AS2MdnSettingsArgs(AS2MdnSettingsArgs $) {
        this.dispositionNotificationTo = $.dispositionNotificationTo;
        this.mdnText = $.mdnText;
        this.micHashingAlgorithm = $.micHashingAlgorithm;
        this.needMDN = $.needMDN;
        this.receiptDeliveryUrl = $.receiptDeliveryUrl;
        this.sendInboundMDNToMessageBox = $.sendInboundMDNToMessageBox;
        this.sendMDNAsynchronously = $.sendMDNAsynchronously;
        this.signMDN = $.signMDN;
        this.signOutboundMDNIfOptional = $.signOutboundMDNIfOptional;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AS2MdnSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2MdnSettingsArgs $;

        public Builder() {
            $ = new AS2MdnSettingsArgs();
        }

        public Builder(AS2MdnSettingsArgs defaults) {
            $ = new AS2MdnSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder dispositionNotificationTo(@Nullable Output<String> dispositionNotificationTo) {
            $.dispositionNotificationTo = dispositionNotificationTo;
            return this;
        }

        public Builder dispositionNotificationTo(String dispositionNotificationTo) {
            return dispositionNotificationTo(Output.of(dispositionNotificationTo));
        }

        public Builder mdnText(@Nullable Output<String> mdnText) {
            $.mdnText = mdnText;
            return this;
        }

        public Builder mdnText(String mdnText) {
            return mdnText(Output.of(mdnText));
        }

        public Builder micHashingAlgorithm(Output<Either<String,HashingAlgorithm>> micHashingAlgorithm) {
            $.micHashingAlgorithm = micHashingAlgorithm;
            return this;
        }

        public Builder micHashingAlgorithm(Either<String,HashingAlgorithm> micHashingAlgorithm) {
            return micHashingAlgorithm(Output.of(micHashingAlgorithm));
        }

        public Builder needMDN(Output<Boolean> needMDN) {
            $.needMDN = needMDN;
            return this;
        }

        public Builder needMDN(Boolean needMDN) {
            return needMDN(Output.of(needMDN));
        }

        public Builder receiptDeliveryUrl(@Nullable Output<String> receiptDeliveryUrl) {
            $.receiptDeliveryUrl = receiptDeliveryUrl;
            return this;
        }

        public Builder receiptDeliveryUrl(String receiptDeliveryUrl) {
            return receiptDeliveryUrl(Output.of(receiptDeliveryUrl));
        }

        public Builder sendInboundMDNToMessageBox(Output<Boolean> sendInboundMDNToMessageBox) {
            $.sendInboundMDNToMessageBox = sendInboundMDNToMessageBox;
            return this;
        }

        public Builder sendInboundMDNToMessageBox(Boolean sendInboundMDNToMessageBox) {
            return sendInboundMDNToMessageBox(Output.of(sendInboundMDNToMessageBox));
        }

        public Builder sendMDNAsynchronously(Output<Boolean> sendMDNAsynchronously) {
            $.sendMDNAsynchronously = sendMDNAsynchronously;
            return this;
        }

        public Builder sendMDNAsynchronously(Boolean sendMDNAsynchronously) {
            return sendMDNAsynchronously(Output.of(sendMDNAsynchronously));
        }

        public Builder signMDN(Output<Boolean> signMDN) {
            $.signMDN = signMDN;
            return this;
        }

        public Builder signMDN(Boolean signMDN) {
            return signMDN(Output.of(signMDN));
        }

        public Builder signOutboundMDNIfOptional(Output<Boolean> signOutboundMDNIfOptional) {
            $.signOutboundMDNIfOptional = signOutboundMDNIfOptional;
            return this;
        }

        public Builder signOutboundMDNIfOptional(Boolean signOutboundMDNIfOptional) {
            return signOutboundMDNIfOptional(Output.of(signOutboundMDNIfOptional));
        }

        public AS2MdnSettingsArgs build() {
            $.micHashingAlgorithm = Objects.requireNonNull($.micHashingAlgorithm, "expected parameter 'micHashingAlgorithm' to be non-null");
            $.needMDN = Objects.requireNonNull($.needMDN, "expected parameter 'needMDN' to be non-null");
            $.sendInboundMDNToMessageBox = Objects.requireNonNull($.sendInboundMDNToMessageBox, "expected parameter 'sendInboundMDNToMessageBox' to be non-null");
            $.sendMDNAsynchronously = Objects.requireNonNull($.sendMDNAsynchronously, "expected parameter 'sendMDNAsynchronously' to be non-null");
            $.signMDN = Objects.requireNonNull($.signMDN, "expected parameter 'signMDN' to be non-null");
            $.signOutboundMDNIfOptional = Objects.requireNonNull($.signOutboundMDNIfOptional, "expected parameter 'signOutboundMDNIfOptional' to be non-null");
            return $;
        }
    }

}
