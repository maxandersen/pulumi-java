// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.KeyVaultCertificateSourceParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the certificate source parameters using user&#39;s keyvault certificate for enabling SSL.
 * 
 */
public final class UserManagedHttpsParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserManagedHttpsParametersResponse Empty = new UserManagedHttpsParametersResponse();

    /**
     * Defines the source of the SSL certificate.
     * Expected value is &#39;AzureKeyVault&#39;.
     * 
     */
    @Import(name="certificateSource", required=true)
      private final String certificateSource;

    public String certificateSource() {
        return this.certificateSource;
    }

    /**
     * Defines the certificate source parameters using user&#39;s keyvault certificate for enabling SSL.
     * 
     */
    @Import(name="certificateSourceParameters", required=true)
      private final KeyVaultCertificateSourceParametersResponse certificateSourceParameters;

    public KeyVaultCertificateSourceParametersResponse certificateSourceParameters() {
        return this.certificateSourceParameters;
    }

    /**
     * TLS protocol version that will be used for Https
     * 
     */
    @Import(name="minimumTlsVersion")
      private final @Nullable String minimumTlsVersion;

    public Optional<String> minimumTlsVersion() {
        return this.minimumTlsVersion == null ? Optional.empty() : Optional.ofNullable(this.minimumTlsVersion);
    }

    /**
     * Defines the TLS extension protocol that is used for secure delivery.
     * 
     */
    @Import(name="protocolType", required=true)
      private final String protocolType;

    public String protocolType() {
        return this.protocolType;
    }

    public UserManagedHttpsParametersResponse(
        String certificateSource,
        KeyVaultCertificateSourceParametersResponse certificateSourceParameters,
        @Nullable String minimumTlsVersion,
        String protocolType) {
        this.certificateSource = Codegen.stringProp("certificateSource").arg(certificateSource).require();
        this.certificateSourceParameters = Objects.requireNonNull(certificateSourceParameters, "expected parameter 'certificateSourceParameters' to be non-null");
        this.minimumTlsVersion = minimumTlsVersion;
        this.protocolType = Objects.requireNonNull(protocolType, "expected parameter 'protocolType' to be non-null");
    }

    private UserManagedHttpsParametersResponse() {
        this.certificateSource = null;
        this.certificateSourceParameters = null;
        this.minimumTlsVersion = null;
        this.protocolType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserManagedHttpsParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateSource;
        private KeyVaultCertificateSourceParametersResponse certificateSourceParameters;
        private @Nullable String minimumTlsVersion;
        private String protocolType;

        public Builder() {
    	      // Empty
        }

        public Builder(UserManagedHttpsParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateSource = defaults.certificateSource;
    	      this.certificateSourceParameters = defaults.certificateSourceParameters;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.protocolType = defaults.protocolType;
        }

        public Builder certificateSource(String certificateSource) {
            this.certificateSource = Objects.requireNonNull(certificateSource);
            return this;
        }
        public Builder certificateSourceParameters(KeyVaultCertificateSourceParametersResponse certificateSourceParameters) {
            this.certificateSourceParameters = Objects.requireNonNull(certificateSourceParameters);
            return this;
        }
        public Builder minimumTlsVersion(@Nullable String minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }
        public Builder protocolType(String protocolType) {
            this.protocolType = Objects.requireNonNull(protocolType);
            return this;
        }        public UserManagedHttpsParametersResponse build() {
            return new UserManagedHttpsParametersResponse(certificateSource, certificateSourceParameters, minimumTlsVersion, protocolType);
        }
    }
}
