// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1.inputs.PublicKeyResponse;
import com.pulumi.googlenative.privateca_v1.inputs.SubjectConfigResponse;
import com.pulumi.googlenative.privateca_v1.inputs.X509ParametersResponse;
import java.util.Objects;


/**
 * A CertificateConfig describes an X.509 certificate or CSR that is to be created, as an alternative to using ASN.1.
 * 
 */
public final class CertificateConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final CertificateConfigResponse Empty = new CertificateConfigResponse();

    /**
     * Optional. The public key that corresponds to this config. This is, for example, used when issuing Certificates, but not when creating a self-signed CertificateAuthority or CertificateAuthority CSR.
     * 
     */
    @Import(name="publicKey", required=true)
      private final PublicKeyResponse publicKey;

    public PublicKeyResponse publicKey() {
        return this.publicKey;
    }

    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * 
     */
    @Import(name="subjectConfig", required=true)
      private final SubjectConfigResponse subjectConfig;

    public SubjectConfigResponse subjectConfig() {
        return this.subjectConfig;
    }

    /**
     * Describes how some of the technical X.509 fields in a certificate should be populated.
     * 
     */
    @Import(name="x509Config", required=true)
      private final X509ParametersResponse x509Config;

    public X509ParametersResponse x509Config() {
        return this.x509Config;
    }

    public CertificateConfigResponse(
        PublicKeyResponse publicKey,
        SubjectConfigResponse subjectConfig,
        X509ParametersResponse x509Config) {
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
        this.subjectConfig = Objects.requireNonNull(subjectConfig, "expected parameter 'subjectConfig' to be non-null");
        this.x509Config = Objects.requireNonNull(x509Config, "expected parameter 'x509Config' to be non-null");
    }

    private CertificateConfigResponse() {
        this.publicKey = null;
        this.subjectConfig = null;
        this.x509Config = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicKeyResponse publicKey;
        private SubjectConfigResponse subjectConfig;
        private X509ParametersResponse x509Config;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKey = defaults.publicKey;
    	      this.subjectConfig = defaults.subjectConfig;
    	      this.x509Config = defaults.x509Config;
        }

        public Builder publicKey(PublicKeyResponse publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        public Builder subjectConfig(SubjectConfigResponse subjectConfig) {
            this.subjectConfig = Objects.requireNonNull(subjectConfig);
            return this;
        }
        public Builder x509Config(X509ParametersResponse x509Config) {
            this.x509Config = Objects.requireNonNull(x509Config);
            return this;
        }        public CertificateConfigResponse build() {
            return new CertificateConfigResponse(publicKey, subjectConfig, x509Config);
        }
    }
}
