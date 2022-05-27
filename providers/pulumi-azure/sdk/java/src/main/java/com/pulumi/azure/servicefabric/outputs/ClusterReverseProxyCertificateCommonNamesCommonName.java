// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterReverseProxyCertificateCommonNamesCommonName {
    /**
     * @return The common or subject name of the certificate.
     * 
     */
    private final String certificateCommonName;
    /**
     * @return The Issuer Thumbprint of the Certificate.
     * 
     */
    private final @Nullable String certificateIssuerThumbprint;

    @CustomType.Constructor
    private ClusterReverseProxyCertificateCommonNamesCommonName(
        @CustomType.Parameter("certificateCommonName") String certificateCommonName,
        @CustomType.Parameter("certificateIssuerThumbprint") @Nullable String certificateIssuerThumbprint) {
        this.certificateCommonName = certificateCommonName;
        this.certificateIssuerThumbprint = certificateIssuerThumbprint;
    }

    /**
     * @return The common or subject name of the certificate.
     * 
     */
    public String certificateCommonName() {
        return this.certificateCommonName;
    }
    /**
     * @return The Issuer Thumbprint of the Certificate.
     * 
     */
    public Optional<String> certificateIssuerThumbprint() {
        return Optional.ofNullable(this.certificateIssuerThumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterReverseProxyCertificateCommonNamesCommonName defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateCommonName;
        private @Nullable String certificateIssuerThumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterReverseProxyCertificateCommonNamesCommonName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateCommonName = defaults.certificateCommonName;
    	      this.certificateIssuerThumbprint = defaults.certificateIssuerThumbprint;
        }

        public Builder certificateCommonName(String certificateCommonName) {
            this.certificateCommonName = Objects.requireNonNull(certificateCommonName);
            return this;
        }
        public Builder certificateIssuerThumbprint(@Nullable String certificateIssuerThumbprint) {
            this.certificateIssuerThumbprint = certificateIssuerThumbprint;
            return this;
        }        public ClusterReverseProxyCertificateCommonNamesCommonName build() {
            return new ClusterReverseProxyCertificateCommonNamesCommonName(certificateCommonName, certificateIssuerThumbprint);
        }
    }
}
