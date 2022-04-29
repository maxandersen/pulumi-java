// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.X12DateFormat;
import com.pulumi.azurenative.logic.enums.X12TimeFormat;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The X12 envelope override settings.
 * 
 */
public final class X12EnvelopeOverrideArgs extends ResourceArgs {

    public static final X12EnvelopeOverrideArgs Empty = new X12EnvelopeOverrideArgs();

    /**
     * The date format.
     * 
     */
    @Import(name="dateFormat", required=true)
    private Output<Either<String,X12DateFormat>> dateFormat;

    /**
     * @return The date format.
     * 
     */
    public Output<Either<String,X12DateFormat>> dateFormat() {
        return this.dateFormat;
    }

    /**
     * The functional identifier code.
     * 
     */
    @Import(name="functionalIdentifierCode")
    private @Nullable Output<String> functionalIdentifierCode;

    /**
     * @return The functional identifier code.
     * 
     */
    public Optional<Output<String>> functionalIdentifierCode() {
        return Optional.ofNullable(this.functionalIdentifierCode);
    }

    /**
     * The header version.
     * 
     */
    @Import(name="headerVersion", required=true)
    private Output<String> headerVersion;

    /**
     * @return The header version.
     * 
     */
    public Output<String> headerVersion() {
        return this.headerVersion;
    }

    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    @Import(name="messageId", required=true)
    private Output<String> messageId;

    /**
     * @return The message id on which this envelope settings has to be applied.
     * 
     */
    public Output<String> messageId() {
        return this.messageId;
    }

    /**
     * The protocol version on which this envelope settings has to be applied.
     * 
     */
    @Import(name="protocolVersion", required=true)
    private Output<String> protocolVersion;

    /**
     * @return The protocol version on which this envelope settings has to be applied.
     * 
     */
    public Output<String> protocolVersion() {
        return this.protocolVersion;
    }

    /**
     * The receiver application id.
     * 
     */
    @Import(name="receiverApplicationId", required=true)
    private Output<String> receiverApplicationId;

    /**
     * @return The receiver application id.
     * 
     */
    public Output<String> receiverApplicationId() {
        return this.receiverApplicationId;
    }

    /**
     * The responsible agency code.
     * 
     */
    @Import(name="responsibleAgencyCode", required=true)
    private Output<String> responsibleAgencyCode;

    /**
     * @return The responsible agency code.
     * 
     */
    public Output<String> responsibleAgencyCode() {
        return this.responsibleAgencyCode;
    }

    /**
     * The sender application id.
     * 
     */
    @Import(name="senderApplicationId", required=true)
    private Output<String> senderApplicationId;

    /**
     * @return The sender application id.
     * 
     */
    public Output<String> senderApplicationId() {
        return this.senderApplicationId;
    }

    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
     */
    @Import(name="targetNamespace", required=true)
    private Output<String> targetNamespace;

    /**
     * @return The target namespace on which this envelope settings has to be applied.
     * 
     */
    public Output<String> targetNamespace() {
        return this.targetNamespace;
    }

    /**
     * The time format.
     * 
     */
    @Import(name="timeFormat", required=true)
    private Output<Either<String,X12TimeFormat>> timeFormat;

    /**
     * @return The time format.
     * 
     */
    public Output<Either<String,X12TimeFormat>> timeFormat() {
        return this.timeFormat;
    }

    private X12EnvelopeOverrideArgs() {}

    private X12EnvelopeOverrideArgs(X12EnvelopeOverrideArgs $) {
        this.dateFormat = $.dateFormat;
        this.functionalIdentifierCode = $.functionalIdentifierCode;
        this.headerVersion = $.headerVersion;
        this.messageId = $.messageId;
        this.protocolVersion = $.protocolVersion;
        this.receiverApplicationId = $.receiverApplicationId;
        this.responsibleAgencyCode = $.responsibleAgencyCode;
        this.senderApplicationId = $.senderApplicationId;
        this.targetNamespace = $.targetNamespace;
        this.timeFormat = $.timeFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X12EnvelopeOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12EnvelopeOverrideArgs $;

        public Builder() {
            $ = new X12EnvelopeOverrideArgs();
        }

        public Builder(X12EnvelopeOverrideArgs defaults) {
            $ = new X12EnvelopeOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dateFormat The date format.
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(Output<Either<String,X12DateFormat>> dateFormat) {
            $.dateFormat = dateFormat;
            return this;
        }

        /**
         * @param dateFormat The date format.
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(Either<String,X12DateFormat> dateFormat) {
            return dateFormat(Output.of(dateFormat));
        }

        /**
         * @param dateFormat The date format.
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(String dateFormat) {
            return dateFormat(Either.ofLeft(dateFormat));
        }

        /**
         * @param dateFormat The date format.
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(X12DateFormat dateFormat) {
            return dateFormat(Either.ofRight(dateFormat));
        }

        /**
         * @param functionalIdentifierCode The functional identifier code.
         * 
         * @return builder
         * 
         */
        public Builder functionalIdentifierCode(@Nullable Output<String> functionalIdentifierCode) {
            $.functionalIdentifierCode = functionalIdentifierCode;
            return this;
        }

        /**
         * @param functionalIdentifierCode The functional identifier code.
         * 
         * @return builder
         * 
         */
        public Builder functionalIdentifierCode(String functionalIdentifierCode) {
            return functionalIdentifierCode(Output.of(functionalIdentifierCode));
        }

        /**
         * @param headerVersion The header version.
         * 
         * @return builder
         * 
         */
        public Builder headerVersion(Output<String> headerVersion) {
            $.headerVersion = headerVersion;
            return this;
        }

        /**
         * @param headerVersion The header version.
         * 
         * @return builder
         * 
         */
        public Builder headerVersion(String headerVersion) {
            return headerVersion(Output.of(headerVersion));
        }

        /**
         * @param messageId The message id on which this envelope settings has to be applied.
         * 
         * @return builder
         * 
         */
        public Builder messageId(Output<String> messageId) {
            $.messageId = messageId;
            return this;
        }

        /**
         * @param messageId The message id on which this envelope settings has to be applied.
         * 
         * @return builder
         * 
         */
        public Builder messageId(String messageId) {
            return messageId(Output.of(messageId));
        }

        /**
         * @param protocolVersion The protocol version on which this envelope settings has to be applied.
         * 
         * @return builder
         * 
         */
        public Builder protocolVersion(Output<String> protocolVersion) {
            $.protocolVersion = protocolVersion;
            return this;
        }

        /**
         * @param protocolVersion The protocol version on which this envelope settings has to be applied.
         * 
         * @return builder
         * 
         */
        public Builder protocolVersion(String protocolVersion) {
            return protocolVersion(Output.of(protocolVersion));
        }

        /**
         * @param receiverApplicationId The receiver application id.
         * 
         * @return builder
         * 
         */
        public Builder receiverApplicationId(Output<String> receiverApplicationId) {
            $.receiverApplicationId = receiverApplicationId;
            return this;
        }

        /**
         * @param receiverApplicationId The receiver application id.
         * 
         * @return builder
         * 
         */
        public Builder receiverApplicationId(String receiverApplicationId) {
            return receiverApplicationId(Output.of(receiverApplicationId));
        }

        /**
         * @param responsibleAgencyCode The responsible agency code.
         * 
         * @return builder
         * 
         */
        public Builder responsibleAgencyCode(Output<String> responsibleAgencyCode) {
            $.responsibleAgencyCode = responsibleAgencyCode;
            return this;
        }

        /**
         * @param responsibleAgencyCode The responsible agency code.
         * 
         * @return builder
         * 
         */
        public Builder responsibleAgencyCode(String responsibleAgencyCode) {
            return responsibleAgencyCode(Output.of(responsibleAgencyCode));
        }

        /**
         * @param senderApplicationId The sender application id.
         * 
         * @return builder
         * 
         */
        public Builder senderApplicationId(Output<String> senderApplicationId) {
            $.senderApplicationId = senderApplicationId;
            return this;
        }

        /**
         * @param senderApplicationId The sender application id.
         * 
         * @return builder
         * 
         */
        public Builder senderApplicationId(String senderApplicationId) {
            return senderApplicationId(Output.of(senderApplicationId));
        }

        /**
         * @param targetNamespace The target namespace on which this envelope settings has to be applied.
         * 
         * @return builder
         * 
         */
        public Builder targetNamespace(Output<String> targetNamespace) {
            $.targetNamespace = targetNamespace;
            return this;
        }

        /**
         * @param targetNamespace The target namespace on which this envelope settings has to be applied.
         * 
         * @return builder
         * 
         */
        public Builder targetNamespace(String targetNamespace) {
            return targetNamespace(Output.of(targetNamespace));
        }

        /**
         * @param timeFormat The time format.
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(Output<Either<String,X12TimeFormat>> timeFormat) {
            $.timeFormat = timeFormat;
            return this;
        }

        /**
         * @param timeFormat The time format.
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(Either<String,X12TimeFormat> timeFormat) {
            return timeFormat(Output.of(timeFormat));
        }

        /**
         * @param timeFormat The time format.
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(String timeFormat) {
            return timeFormat(Either.ofLeft(timeFormat));
        }

        /**
         * @param timeFormat The time format.
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(X12TimeFormat timeFormat) {
            return timeFormat(Either.ofRight(timeFormat));
        }

        public X12EnvelopeOverrideArgs build() {
            $.dateFormat = Objects.requireNonNull($.dateFormat, "expected parameter 'dateFormat' to be non-null");
            $.headerVersion = Objects.requireNonNull($.headerVersion, "expected parameter 'headerVersion' to be non-null");
            $.messageId = Objects.requireNonNull($.messageId, "expected parameter 'messageId' to be non-null");
            $.protocolVersion = Objects.requireNonNull($.protocolVersion, "expected parameter 'protocolVersion' to be non-null");
            $.receiverApplicationId = Objects.requireNonNull($.receiverApplicationId, "expected parameter 'receiverApplicationId' to be non-null");
            $.responsibleAgencyCode = Objects.requireNonNull($.responsibleAgencyCode, "expected parameter 'responsibleAgencyCode' to be non-null");
            $.senderApplicationId = Objects.requireNonNull($.senderApplicationId, "expected parameter 'senderApplicationId' to be non-null");
            $.targetNamespace = Objects.requireNonNull($.targetNamespace, "expected parameter 'targetNamespace' to be non-null");
            $.timeFormat = Objects.requireNonNull($.timeFormat, "expected parameter 'timeFormat' to be non-null");
            return $;
        }
    }

}
