// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceHostnameConfigurationProxy {
    /**
     * @return The Base64 Encoded Certificate.
     * 
     */
    private final @Nullable String certificate;
    /**
     * @return The password associated with the certificate provided above.
     * 
     */
    private final @Nullable String certificatePassword;
    /**
     * @return Is the certificate associated with this Hostname the Default SSL Certificate? This is used when an SNI header isn&#39;t specified by a client. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean defaultSslBinding;
    /**
     * @return The expiration date of the certificate in RFC3339 format: `2000-01-02T03:04:05Z`.
     * 
     */
    private final @Nullable String expiry;
    /**
     * @return The Hostname to use for the Management API.
     * 
     */
    private final String hostName;
    /**
     * @return The ID of the Key Vault Secret containing the SSL Certificate, which must be should be of the type `application/x-pkcs12`.
     * 
     */
    private final @Nullable String keyVaultId;
    /**
     * @return Should Client Certificate Negotiation be enabled for this Hostname? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean negotiateClientCertificate;
    /**
     * @return The Managed Identity Client ID to use to access the Key Vault. This Identity must be specified in the `identity` block to be used.
     * 
     */
    private final @Nullable String sslKeyvaultIdentityClientId;
    /**
     * @return The subject of the certificate.
     * 
     */
    private final @Nullable String subject;
    /**
     * @return The thumbprint of the certificate.
     * 
     */
    private final @Nullable String thumbprint;

    @CustomType.Constructor
    private ServiceHostnameConfigurationProxy(
        @CustomType.Parameter("certificate") @Nullable String certificate,
        @CustomType.Parameter("certificatePassword") @Nullable String certificatePassword,
        @CustomType.Parameter("defaultSslBinding") @Nullable Boolean defaultSslBinding,
        @CustomType.Parameter("expiry") @Nullable String expiry,
        @CustomType.Parameter("hostName") String hostName,
        @CustomType.Parameter("keyVaultId") @Nullable String keyVaultId,
        @CustomType.Parameter("negotiateClientCertificate") @Nullable Boolean negotiateClientCertificate,
        @CustomType.Parameter("sslKeyvaultIdentityClientId") @Nullable String sslKeyvaultIdentityClientId,
        @CustomType.Parameter("subject") @Nullable String subject,
        @CustomType.Parameter("thumbprint") @Nullable String thumbprint) {
        this.certificate = certificate;
        this.certificatePassword = certificatePassword;
        this.defaultSslBinding = defaultSslBinding;
        this.expiry = expiry;
        this.hostName = hostName;
        this.keyVaultId = keyVaultId;
        this.negotiateClientCertificate = negotiateClientCertificate;
        this.sslKeyvaultIdentityClientId = sslKeyvaultIdentityClientId;
        this.subject = subject;
        this.thumbprint = thumbprint;
    }

    /**
     * @return The Base64 Encoded Certificate.
     * 
     */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return The password associated with the certificate provided above.
     * 
     */
    public Optional<String> certificatePassword() {
        return Optional.ofNullable(this.certificatePassword);
    }
    /**
     * @return Is the certificate associated with this Hostname the Default SSL Certificate? This is used when an SNI header isn&#39;t specified by a client. Defaults to `false`.
     * 
     */
    public Optional<Boolean> defaultSslBinding() {
        return Optional.ofNullable(this.defaultSslBinding);
    }
    /**
     * @return The expiration date of the certificate in RFC3339 format: `2000-01-02T03:04:05Z`.
     * 
     */
    public Optional<String> expiry() {
        return Optional.ofNullable(this.expiry);
    }
    /**
     * @return The Hostname to use for the Management API.
     * 
     */
    public String hostName() {
        return this.hostName;
    }
    /**
     * @return The ID of the Key Vault Secret containing the SSL Certificate, which must be should be of the type `application/x-pkcs12`.
     * 
     */
    public Optional<String> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }
    /**
     * @return Should Client Certificate Negotiation be enabled for this Hostname? Defaults to `false`.
     * 
     */
    public Optional<Boolean> negotiateClientCertificate() {
        return Optional.ofNullable(this.negotiateClientCertificate);
    }
    /**
     * @return The Managed Identity Client ID to use to access the Key Vault. This Identity must be specified in the `identity` block to be used.
     * 
     */
    public Optional<String> sslKeyvaultIdentityClientId() {
        return Optional.ofNullable(this.sslKeyvaultIdentityClientId);
    }
    /**
     * @return The subject of the certificate.
     * 
     */
    public Optional<String> subject() {
        return Optional.ofNullable(this.subject);
    }
    /**
     * @return The thumbprint of the certificate.
     * 
     */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHostnameConfigurationProxy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificate;
        private @Nullable String certificatePassword;
        private @Nullable Boolean defaultSslBinding;
        private @Nullable String expiry;
        private String hostName;
        private @Nullable String keyVaultId;
        private @Nullable Boolean negotiateClientCertificate;
        private @Nullable String sslKeyvaultIdentityClientId;
        private @Nullable String subject;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceHostnameConfigurationProxy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificatePassword = defaults.certificatePassword;
    	      this.defaultSslBinding = defaults.defaultSslBinding;
    	      this.expiry = defaults.expiry;
    	      this.hostName = defaults.hostName;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.negotiateClientCertificate = defaults.negotiateClientCertificate;
    	      this.sslKeyvaultIdentityClientId = defaults.sslKeyvaultIdentityClientId;
    	      this.subject = defaults.subject;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder certificatePassword(@Nullable String certificatePassword) {
            this.certificatePassword = certificatePassword;
            return this;
        }
        public Builder defaultSslBinding(@Nullable Boolean defaultSslBinding) {
            this.defaultSslBinding = defaultSslBinding;
            return this;
        }
        public Builder expiry(@Nullable String expiry) {
            this.expiry = expiry;
            return this;
        }
        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }
        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }
        public Builder negotiateClientCertificate(@Nullable Boolean negotiateClientCertificate) {
            this.negotiateClientCertificate = negotiateClientCertificate;
            return this;
        }
        public Builder sslKeyvaultIdentityClientId(@Nullable String sslKeyvaultIdentityClientId) {
            this.sslKeyvaultIdentityClientId = sslKeyvaultIdentityClientId;
            return this;
        }
        public Builder subject(@Nullable String subject) {
            this.subject = subject;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }        public ServiceHostnameConfigurationProxy build() {
            return new ServiceHostnameConfigurationProxy(certificate, certificatePassword, defaultSslBinding, expiry, hostName, keyVaultId, negotiateClientCertificate, sslKeyvaultIdentityClientId, subject, thumbprint);
        }
    }
}
