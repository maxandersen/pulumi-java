// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.privateca_v1.outputs.SubordinateConfigChainResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SubordinateConfigResponse {
    /**
     * This can refer to a CertificateAuthority that was used to create a subordinate CertificateAuthority. This field is used for information and usability purposes only. The resource name is in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
     */
    private final String certificateAuthority;
    /**
     * Contains the PEM certificate chain for the issuers of this CertificateAuthority, but not pem certificate for this CA itself.
     * 
     */
    private final SubordinateConfigChainResponse pemIssuerChain;

    @CustomType.Constructor
    private SubordinateConfigResponse(
        @CustomType.Parameter("certificateAuthority") String certificateAuthority,
        @CustomType.Parameter("pemIssuerChain") SubordinateConfigChainResponse pemIssuerChain) {
        this.certificateAuthority = certificateAuthority;
        this.pemIssuerChain = pemIssuerChain;
    }

    /**
     * This can refer to a CertificateAuthority that was used to create a subordinate CertificateAuthority. This field is used for information and usability purposes only. The resource name is in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
    */
    public String certificateAuthority() {
        return this.certificateAuthority;
    }
    /**
     * Contains the PEM certificate chain for the issuers of this CertificateAuthority, but not pem certificate for this CA itself.
     * 
    */
    public SubordinateConfigChainResponse pemIssuerChain() {
        return this.pemIssuerChain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubordinateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateAuthority;
        private SubordinateConfigChainResponse pemIssuerChain;

        public Builder() {
    	      // Empty
        }

        public Builder(SubordinateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.pemIssuerChain = defaults.pemIssuerChain;
        }

        public Builder certificateAuthority(String certificateAuthority) {
            this.certificateAuthority = Objects.requireNonNull(certificateAuthority);
            return this;
        }
        public Builder pemIssuerChain(SubordinateConfigChainResponse pemIssuerChain) {
            this.pemIssuerChain = Objects.requireNonNull(pemIssuerChain);
            return this;
        }        public SubordinateConfigResponse build() {
            return new SubordinateConfigResponse(certificateAuthority, pemIssuerChain);
        }
    }
}
