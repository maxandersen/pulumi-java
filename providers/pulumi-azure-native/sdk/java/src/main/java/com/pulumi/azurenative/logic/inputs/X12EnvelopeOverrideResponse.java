// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The X12 envelope override settings.
 * 
 */
public final class X12EnvelopeOverrideResponse extends com.pulumi.resources.InvokeArgs {

    public static final X12EnvelopeOverrideResponse Empty = new X12EnvelopeOverrideResponse();

    /**
     * The date format.
     * 
     */
    @Import(name="dateFormat", required=true)
    private String dateFormat;

    public String dateFormat() {
        return this.dateFormat;
    }

    /**
     * The functional identifier code.
     * 
     */
    @Import(name="functionalIdentifierCode")
    private @Nullable String functionalIdentifierCode;

    public Optional<String> functionalIdentifierCode() {
        return Optional.ofNullable(this.functionalIdentifierCode);
    }

    /**
     * The header version.
     * 
     */
    @Import(name="headerVersion", required=true)
    private String headerVersion;

    public String headerVersion() {
        return this.headerVersion;
    }

    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    @Import(name="messageId", required=true)
    private String messageId;

    public String messageId() {
        return this.messageId;
    }

    /**
     * The protocol version on which this envelope settings has to be applied.
     * 
     */
    @Import(name="protocolVersion", required=true)
    private String protocolVersion;

    public String protocolVersion() {
        return this.protocolVersion;
    }

    /**
     * The receiver application id.
     * 
     */
    @Import(name="receiverApplicationId", required=true)
    private String receiverApplicationId;

    public String receiverApplicationId() {
        return this.receiverApplicationId;
    }

    /**
     * The responsible agency code.
     * 
     */
    @Import(name="responsibleAgencyCode", required=true)
    private String responsibleAgencyCode;

    public String responsibleAgencyCode() {
        return this.responsibleAgencyCode;
    }

    /**
     * The sender application id.
     * 
     */
    @Import(name="senderApplicationId", required=true)
    private String senderApplicationId;

    public String senderApplicationId() {
        return this.senderApplicationId;
    }

    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
     */
    @Import(name="targetNamespace", required=true)
    private String targetNamespace;

    public String targetNamespace() {
        return this.targetNamespace;
    }

    /**
     * The time format.
     * 
     */
    @Import(name="timeFormat", required=true)
    private String timeFormat;

    public String timeFormat() {
        return this.timeFormat;
    }

    private X12EnvelopeOverrideResponse() {}

    private X12EnvelopeOverrideResponse(X12EnvelopeOverrideResponse $) {
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
    public static Builder builder(X12EnvelopeOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12EnvelopeOverrideResponse $;

        public Builder() {
            $ = new X12EnvelopeOverrideResponse();
        }

        public Builder(X12EnvelopeOverrideResponse defaults) {
            $ = new X12EnvelopeOverrideResponse(Objects.requireNonNull(defaults));
        }

        public Builder dateFormat(String dateFormat) {
            $.dateFormat = dateFormat;
            return this;
        }

        public Builder functionalIdentifierCode(@Nullable String functionalIdentifierCode) {
            $.functionalIdentifierCode = functionalIdentifierCode;
            return this;
        }

        public Builder headerVersion(String headerVersion) {
            $.headerVersion = headerVersion;
            return this;
        }

        public Builder messageId(String messageId) {
            $.messageId = messageId;
            return this;
        }

        public Builder protocolVersion(String protocolVersion) {
            $.protocolVersion = protocolVersion;
            return this;
        }

        public Builder receiverApplicationId(String receiverApplicationId) {
            $.receiverApplicationId = receiverApplicationId;
            return this;
        }

        public Builder responsibleAgencyCode(String responsibleAgencyCode) {
            $.responsibleAgencyCode = responsibleAgencyCode;
            return this;
        }

        public Builder senderApplicationId(String senderApplicationId) {
            $.senderApplicationId = senderApplicationId;
            return this;
        }

        public Builder targetNamespace(String targetNamespace) {
            $.targetNamespace = targetNamespace;
            return this;
        }

        public Builder timeFormat(String timeFormat) {
            $.timeFormat = timeFormat;
            return this;
        }

        public X12EnvelopeOverrideResponse build() {
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
