// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.identityplatform.outputs.InboundSamlConfigIdpConfigIdpCertificate;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InboundSamlConfigIdpConfig {
    /**
     * The IdP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    private final List<InboundSamlConfigIdpConfigIdpCertificate> idpCertificates;
    /**
     * Unique identifier for all SAML entities
     * 
     */
    private final String idpEntityId;
    /**
     * Indicates if outbounding SAMLRequest should be signed.
     * 
     */
    private final @Nullable Boolean signRequest;
    /**
     * URL to send Authentication request to.
     * 
     */
    private final String ssoUrl;

    @CustomType.Constructor
    private InboundSamlConfigIdpConfig(
        @CustomType.Parameter("idpCertificates") List<InboundSamlConfigIdpConfigIdpCertificate> idpCertificates,
        @CustomType.Parameter("idpEntityId") String idpEntityId,
        @CustomType.Parameter("signRequest") @Nullable Boolean signRequest,
        @CustomType.Parameter("ssoUrl") String ssoUrl) {
        this.idpCertificates = idpCertificates;
        this.idpEntityId = idpEntityId;
        this.signRequest = signRequest;
        this.ssoUrl = ssoUrl;
    }

    /**
     * The IdP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
    */
    public List<InboundSamlConfigIdpConfigIdpCertificate> idpCertificates() {
        return this.idpCertificates;
    }
    /**
     * Unique identifier for all SAML entities
     * 
    */
    public String idpEntityId() {
        return this.idpEntityId;
    }
    /**
     * Indicates if outbounding SAMLRequest should be signed.
     * 
    */
    public Optional<Boolean> signRequest() {
        return Optional.ofNullable(this.signRequest);
    }
    /**
     * URL to send Authentication request to.
     * 
    */
    public String ssoUrl() {
        return this.ssoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundSamlConfigIdpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<InboundSamlConfigIdpConfigIdpCertificate> idpCertificates;
        private String idpEntityId;
        private @Nullable Boolean signRequest;
        private String ssoUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundSamlConfigIdpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idpCertificates = defaults.idpCertificates;
    	      this.idpEntityId = defaults.idpEntityId;
    	      this.signRequest = defaults.signRequest;
    	      this.ssoUrl = defaults.ssoUrl;
        }

        public Builder idpCertificates(List<InboundSamlConfigIdpConfigIdpCertificate> idpCertificates) {
            this.idpCertificates = Objects.requireNonNull(idpCertificates);
            return this;
        }
        public Builder idpCertificates(InboundSamlConfigIdpConfigIdpCertificate... idpCertificates) {
            return idpCertificates(List.of(idpCertificates));
        }
        public Builder idpEntityId(String idpEntityId) {
            this.idpEntityId = Objects.requireNonNull(idpEntityId);
            return this;
        }
        public Builder signRequest(@Nullable Boolean signRequest) {
            this.signRequest = signRequest;
            return this;
        }
        public Builder ssoUrl(String ssoUrl) {
            this.ssoUrl = Objects.requireNonNull(ssoUrl);
            return this;
        }        public InboundSamlConfigIdpConfig build() {
            return new InboundSamlConfigIdpConfig(idpCertificates, idpEntityId, signRequest, ssoUrl);
        }
    }
}
