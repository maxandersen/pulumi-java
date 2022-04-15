// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.privateca_v1beta1.inputs.PublicKeyResponse;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigWrapperResponse;
import io.pulumi.googlenative.privateca_v1beta1.inputs.SubjectConfigResponse;
import java.util.Objects;


/**
 * A CertificateConfig describes an X.509 certificate or CSR that is to be created, as an alternative to using ASN.1.
 * 
 */
public final class CertificateConfigResponse extends io.pulumi.resources.InvokeArgs {

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
     * Describes how some of the technical fields in a certificate should be populated.
     * 
     */
    @Import(name="reusableConfig", required=true)
      private final ReusableConfigWrapperResponse reusableConfig;

    public ReusableConfigWrapperResponse reusableConfig() {
        return this.reusableConfig;
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

    public CertificateConfigResponse(
        PublicKeyResponse publicKey,
        ReusableConfigWrapperResponse reusableConfig,
        SubjectConfigResponse subjectConfig) {
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
        this.reusableConfig = Objects.requireNonNull(reusableConfig, "expected parameter 'reusableConfig' to be non-null");
        this.subjectConfig = Objects.requireNonNull(subjectConfig, "expected parameter 'subjectConfig' to be non-null");
    }

    private CertificateConfigResponse() {
        this.publicKey = null;
        this.reusableConfig = null;
        this.subjectConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicKeyResponse publicKey;
        private ReusableConfigWrapperResponse reusableConfig;
        private SubjectConfigResponse subjectConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKey = defaults.publicKey;
    	      this.reusableConfig = defaults.reusableConfig;
    	      this.subjectConfig = defaults.subjectConfig;
        }

        public Builder publicKey(PublicKeyResponse publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        public Builder reusableConfig(ReusableConfigWrapperResponse reusableConfig) {
            this.reusableConfig = Objects.requireNonNull(reusableConfig);
            return this;
        }
        public Builder subjectConfig(SubjectConfigResponse subjectConfig) {
            this.subjectConfig = Objects.requireNonNull(subjectConfig);
            return this;
        }        public CertificateConfigResponse build() {
            return new CertificateConfigResponse(publicKey, reusableConfig, subjectConfig);
        }
    }
}
