// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1.outputs.AllowedKeyTypeResponse;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateExtensionConstraintsResponse;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateIdentityConstraintsResponse;
import io.pulumi.googlenative.privateca_v1.outputs.IssuanceModesResponse;
import io.pulumi.googlenative.privateca_v1.outputs.X509ParametersResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class IssuancePolicyResponse {
    /**
     * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
     * 
     */
    private final IssuanceModesResponse allowedIssuanceModes;
    /**
     * Optional. If any AllowedKeyType is specified, then the certificate request's public key must match one of the key types listed here. Otherwise, any key may be used.
     * 
     */
    private final List<AllowedKeyTypeResponse> allowedKeyTypes;
    /**
     * Optional. A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If a certificate request uses a CertificateTemplate that defines conflicting predefined_values for the same properties, the certificate issuance request will fail.
     * 
     */
    private final X509ParametersResponse baselineValues;
    /**
     * Optional. Describes constraints on identities that may appear in Certificates issued through this CaPool. If this is omitted, then this CaPool will not add restrictions on a certificate's identity.
     * 
     */
    private final CertificateIdentityConstraintsResponse identityConstraints;
    /**
     * Optional. The maximum lifetime allowed for issued Certificates. Note that if the issuing CertificateAuthority expires before a Certificate's requested maximum_lifetime, the effective lifetime will be explicitly truncated to match it.
     * 
     */
    private final String maximumLifetime;
    /**
     * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued through this CaPool. If a certificate request sets extensions that don't appear in the passthrough_extensions, those extensions will be dropped. If a certificate request uses a CertificateTemplate with predefined_values that don't appear here, the certificate issuance request will fail. If this is omitted, then this CaPool will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this CaPool's baseline_values.
     * 
     */
    private final CertificateExtensionConstraintsResponse passthroughExtensions;

    @OutputCustomType.Constructor
    private IssuancePolicyResponse(
        @OutputCustomType.Parameter("allowedIssuanceModes") IssuanceModesResponse allowedIssuanceModes,
        @OutputCustomType.Parameter("allowedKeyTypes") List<AllowedKeyTypeResponse> allowedKeyTypes,
        @OutputCustomType.Parameter("baselineValues") X509ParametersResponse baselineValues,
        @OutputCustomType.Parameter("identityConstraints") CertificateIdentityConstraintsResponse identityConstraints,
        @OutputCustomType.Parameter("maximumLifetime") String maximumLifetime,
        @OutputCustomType.Parameter("passthroughExtensions") CertificateExtensionConstraintsResponse passthroughExtensions) {
        this.allowedIssuanceModes = allowedIssuanceModes;
        this.allowedKeyTypes = allowedKeyTypes;
        this.baselineValues = baselineValues;
        this.identityConstraints = identityConstraints;
        this.maximumLifetime = maximumLifetime;
        this.passthroughExtensions = passthroughExtensions;
    }

    /**
     * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
     * 
    */
    public IssuanceModesResponse getAllowedIssuanceModes() {
        return this.allowedIssuanceModes;
    }
    /**
     * Optional. If any AllowedKeyType is specified, then the certificate request's public key must match one of the key types listed here. Otherwise, any key may be used.
     * 
    */
    public List<AllowedKeyTypeResponse> getAllowedKeyTypes() {
        return this.allowedKeyTypes;
    }
    /**
     * Optional. A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If a certificate request uses a CertificateTemplate that defines conflicting predefined_values for the same properties, the certificate issuance request will fail.
     * 
    */
    public X509ParametersResponse getBaselineValues() {
        return this.baselineValues;
    }
    /**
     * Optional. Describes constraints on identities that may appear in Certificates issued through this CaPool. If this is omitted, then this CaPool will not add restrictions on a certificate's identity.
     * 
    */
    public CertificateIdentityConstraintsResponse getIdentityConstraints() {
        return this.identityConstraints;
    }
    /**
     * Optional. The maximum lifetime allowed for issued Certificates. Note that if the issuing CertificateAuthority expires before a Certificate's requested maximum_lifetime, the effective lifetime will be explicitly truncated to match it.
     * 
    */
    public String getMaximumLifetime() {
        return this.maximumLifetime;
    }
    /**
     * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued through this CaPool. If a certificate request sets extensions that don't appear in the passthrough_extensions, those extensions will be dropped. If a certificate request uses a CertificateTemplate with predefined_values that don't appear here, the certificate issuance request will fail. If this is omitted, then this CaPool will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this CaPool's baseline_values.
     * 
    */
    public CertificateExtensionConstraintsResponse getPassthroughExtensions() {
        return this.passthroughExtensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IssuancePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IssuanceModesResponse allowedIssuanceModes;
        private List<AllowedKeyTypeResponse> allowedKeyTypes;
        private X509ParametersResponse baselineValues;
        private CertificateIdentityConstraintsResponse identityConstraints;
        private String maximumLifetime;
        private CertificateExtensionConstraintsResponse passthroughExtensions;

        public Builder() {
    	      // Empty
        }

        public Builder(IssuancePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIssuanceModes = defaults.allowedIssuanceModes;
    	      this.allowedKeyTypes = defaults.allowedKeyTypes;
    	      this.baselineValues = defaults.baselineValues;
    	      this.identityConstraints = defaults.identityConstraints;
    	      this.maximumLifetime = defaults.maximumLifetime;
    	      this.passthroughExtensions = defaults.passthroughExtensions;
        }

        public Builder setAllowedIssuanceModes(IssuanceModesResponse allowedIssuanceModes) {
            this.allowedIssuanceModes = Objects.requireNonNull(allowedIssuanceModes);
            return this;
        }

        public Builder setAllowedKeyTypes(List<AllowedKeyTypeResponse> allowedKeyTypes) {
            this.allowedKeyTypes = Objects.requireNonNull(allowedKeyTypes);
            return this;
        }

        public Builder setBaselineValues(X509ParametersResponse baselineValues) {
            this.baselineValues = Objects.requireNonNull(baselineValues);
            return this;
        }

        public Builder setIdentityConstraints(CertificateIdentityConstraintsResponse identityConstraints) {
            this.identityConstraints = Objects.requireNonNull(identityConstraints);
            return this;
        }

        public Builder setMaximumLifetime(String maximumLifetime) {
            this.maximumLifetime = Objects.requireNonNull(maximumLifetime);
            return this;
        }

        public Builder setPassthroughExtensions(CertificateExtensionConstraintsResponse passthroughExtensions) {
            this.passthroughExtensions = Objects.requireNonNull(passthroughExtensions);
            return this;
        }
        public IssuancePolicyResponse build() {
            return new IssuancePolicyResponse(allowedIssuanceModes, allowedKeyTypes, baselineValues, identityConstraints, maximumLifetime, passthroughExtensions);
        }
    }
}
