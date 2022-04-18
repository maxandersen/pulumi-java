// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudiot_v1.outputs.X509CertificateDetailsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PublicKeyCertificateResponse {
    /**
     * The certificate data.
     * 
     */
    private final String certificate;
    /**
     * The certificate format.
     * 
     */
    private final String format;
    /**
     * [Output only] The certificate details. Used only for X.509 certificates.
     * 
     */
    private final X509CertificateDetailsResponse x509Details;

    @CustomType.Constructor
    private PublicKeyCertificateResponse(
        @CustomType.Parameter("certificate") String certificate,
        @CustomType.Parameter("format") String format,
        @CustomType.Parameter("x509Details") X509CertificateDetailsResponse x509Details) {
        this.certificate = certificate;
        this.format = format;
        this.x509Details = x509Details;
    }

    /**
     * The certificate data.
     * 
    */
    public String certificate() {
        return this.certificate;
    }
    /**
     * The certificate format.
     * 
    */
    public String format() {
        return this.format;
    }
    /**
     * [Output only] The certificate details. Used only for X.509 certificates.
     * 
    */
    public X509CertificateDetailsResponse x509Details() {
        return this.x509Details;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicKeyCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private String format;
        private X509CertificateDetailsResponse x509Details;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicKeyCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.format = defaults.format;
    	      this.x509Details = defaults.x509Details;
        }

        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder x509Details(X509CertificateDetailsResponse x509Details) {
            this.x509Details = Objects.requireNonNull(x509Details);
            return this;
        }        public PublicKeyCertificateResponse build() {
            return new PublicKeyCertificateResponse(certificate, format, x509Details);
        }
    }
}
