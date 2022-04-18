// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The AS2 agreement validation settings.
 * 
 */
public final class AS2ValidationSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AS2ValidationSettingsResponse Empty = new AS2ValidationSettingsResponse();

    /**
     * The value indicating whether to check for certificate revocation list on receive.
     * 
     */
    @Import(name="checkCertificateRevocationListOnReceive", required=true)
      private final Boolean checkCertificateRevocationListOnReceive;

    public Boolean checkCertificateRevocationListOnReceive() {
        return this.checkCertificateRevocationListOnReceive;
    }

    /**
     * The value indicating whether to check for certificate revocation list on send.
     * 
     */
    @Import(name="checkCertificateRevocationListOnSend", required=true)
      private final Boolean checkCertificateRevocationListOnSend;

    public Boolean checkCertificateRevocationListOnSend() {
        return this.checkCertificateRevocationListOnSend;
    }

    /**
     * The value indicating whether to check for duplicate message.
     * 
     */
    @Import(name="checkDuplicateMessage", required=true)
      private final Boolean checkDuplicateMessage;

    public Boolean checkDuplicateMessage() {
        return this.checkDuplicateMessage;
    }

    /**
     * The value indicating whether the message has to be compressed.
     * 
     */
    @Import(name="compressMessage", required=true)
      private final Boolean compressMessage;

    public Boolean compressMessage() {
        return this.compressMessage;
    }

    /**
     * The value indicating whether the message has to be encrypted.
     * 
     */
    @Import(name="encryptMessage", required=true)
      private final Boolean encryptMessage;

    public Boolean encryptMessage() {
        return this.encryptMessage;
    }

    /**
     * The encryption algorithm.
     * 
     */
    @Import(name="encryptionAlgorithm", required=true)
      private final String encryptionAlgorithm;

    public String encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * The number of days to look back for duplicate interchange.
     * 
     */
    @Import(name="interchangeDuplicatesValidityDays", required=true)
      private final Integer interchangeDuplicatesValidityDays;

    public Integer interchangeDuplicatesValidityDays() {
        return this.interchangeDuplicatesValidityDays;
    }

    /**
     * The value indicating whether to override incoming message properties with those in agreement.
     * 
     */
    @Import(name="overrideMessageProperties", required=true)
      private final Boolean overrideMessageProperties;

    public Boolean overrideMessageProperties() {
        return this.overrideMessageProperties;
    }

    /**
     * The value indicating whether the message has to be signed.
     * 
     */
    @Import(name="signMessage", required=true)
      private final Boolean signMessage;

    public Boolean signMessage() {
        return this.signMessage;
    }

    /**
     * The signing algorithm.
     * 
     */
    @Import(name="signingAlgorithm")
      private final @Nullable String signingAlgorithm;

    public Optional<String> signingAlgorithm() {
        return this.signingAlgorithm == null ? Optional.empty() : Optional.ofNullable(this.signingAlgorithm);
    }

    public AS2ValidationSettingsResponse(
        Boolean checkCertificateRevocationListOnReceive,
        Boolean checkCertificateRevocationListOnSend,
        Boolean checkDuplicateMessage,
        Boolean compressMessage,
        Boolean encryptMessage,
        String encryptionAlgorithm,
        Integer interchangeDuplicatesValidityDays,
        Boolean overrideMessageProperties,
        Boolean signMessage,
        @Nullable String signingAlgorithm) {
        this.checkCertificateRevocationListOnReceive = Objects.requireNonNull(checkCertificateRevocationListOnReceive, "expected parameter 'checkCertificateRevocationListOnReceive' to be non-null");
        this.checkCertificateRevocationListOnSend = Objects.requireNonNull(checkCertificateRevocationListOnSend, "expected parameter 'checkCertificateRevocationListOnSend' to be non-null");
        this.checkDuplicateMessage = Objects.requireNonNull(checkDuplicateMessage, "expected parameter 'checkDuplicateMessage' to be non-null");
        this.compressMessage = Objects.requireNonNull(compressMessage, "expected parameter 'compressMessage' to be non-null");
        this.encryptMessage = Objects.requireNonNull(encryptMessage, "expected parameter 'encryptMessage' to be non-null");
        this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm, "expected parameter 'encryptionAlgorithm' to be non-null");
        this.interchangeDuplicatesValidityDays = Objects.requireNonNull(interchangeDuplicatesValidityDays, "expected parameter 'interchangeDuplicatesValidityDays' to be non-null");
        this.overrideMessageProperties = Objects.requireNonNull(overrideMessageProperties, "expected parameter 'overrideMessageProperties' to be non-null");
        this.signMessage = Objects.requireNonNull(signMessage, "expected parameter 'signMessage' to be non-null");
        this.signingAlgorithm = signingAlgorithm;
    }

    private AS2ValidationSettingsResponse() {
        this.checkCertificateRevocationListOnReceive = null;
        this.checkCertificateRevocationListOnSend = null;
        this.checkDuplicateMessage = null;
        this.compressMessage = null;
        this.encryptMessage = null;
        this.encryptionAlgorithm = null;
        this.interchangeDuplicatesValidityDays = null;
        this.overrideMessageProperties = null;
        this.signMessage = null;
        this.signingAlgorithm = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2ValidationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean checkCertificateRevocationListOnReceive;
        private Boolean checkCertificateRevocationListOnSend;
        private Boolean checkDuplicateMessage;
        private Boolean compressMessage;
        private Boolean encryptMessage;
        private String encryptionAlgorithm;
        private Integer interchangeDuplicatesValidityDays;
        private Boolean overrideMessageProperties;
        private Boolean signMessage;
        private @Nullable String signingAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2ValidationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkCertificateRevocationListOnReceive = defaults.checkCertificateRevocationListOnReceive;
    	      this.checkCertificateRevocationListOnSend = defaults.checkCertificateRevocationListOnSend;
    	      this.checkDuplicateMessage = defaults.checkDuplicateMessage;
    	      this.compressMessage = defaults.compressMessage;
    	      this.encryptMessage = defaults.encryptMessage;
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.interchangeDuplicatesValidityDays = defaults.interchangeDuplicatesValidityDays;
    	      this.overrideMessageProperties = defaults.overrideMessageProperties;
    	      this.signMessage = defaults.signMessage;
    	      this.signingAlgorithm = defaults.signingAlgorithm;
        }

        public Builder checkCertificateRevocationListOnReceive(Boolean checkCertificateRevocationListOnReceive) {
            this.checkCertificateRevocationListOnReceive = Objects.requireNonNull(checkCertificateRevocationListOnReceive);
            return this;
        }
        public Builder checkCertificateRevocationListOnSend(Boolean checkCertificateRevocationListOnSend) {
            this.checkCertificateRevocationListOnSend = Objects.requireNonNull(checkCertificateRevocationListOnSend);
            return this;
        }
        public Builder checkDuplicateMessage(Boolean checkDuplicateMessage) {
            this.checkDuplicateMessage = Objects.requireNonNull(checkDuplicateMessage);
            return this;
        }
        public Builder compressMessage(Boolean compressMessage) {
            this.compressMessage = Objects.requireNonNull(compressMessage);
            return this;
        }
        public Builder encryptMessage(Boolean encryptMessage) {
            this.encryptMessage = Objects.requireNonNull(encryptMessage);
            return this;
        }
        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }
        public Builder interchangeDuplicatesValidityDays(Integer interchangeDuplicatesValidityDays) {
            this.interchangeDuplicatesValidityDays = Objects.requireNonNull(interchangeDuplicatesValidityDays);
            return this;
        }
        public Builder overrideMessageProperties(Boolean overrideMessageProperties) {
            this.overrideMessageProperties = Objects.requireNonNull(overrideMessageProperties);
            return this;
        }
        public Builder signMessage(Boolean signMessage) {
            this.signMessage = Objects.requireNonNull(signMessage);
            return this;
        }
        public Builder signingAlgorithm(@Nullable String signingAlgorithm) {
            this.signingAlgorithm = signingAlgorithm;
            return this;
        }        public AS2ValidationSettingsResponse build() {
            return new AS2ValidationSettingsResponse(checkCertificateRevocationListOnReceive, checkCertificateRevocationListOnSend, checkDuplicateMessage, compressMessage, encryptMessage, encryptionAlgorithm, interchangeDuplicatesValidityDays, overrideMessageProperties, signMessage, signingAlgorithm);
        }
    }
}
