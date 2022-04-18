// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificatePropertiesResponse {
    /**
     * The activate date of certificate.
     * 
     */
    private final String activateDate;
    /**
     * The certificate version of key vault.
     * 
     */
    private final @Nullable String certVersion;
    /**
     * The domain list of certificate.
     * 
     */
    private final List<String> dnsNames;
    /**
     * The expiration date of certificate.
     * 
     */
    private final String expirationDate;
    /**
     * The issue date of certificate.
     * 
     */
    private final String issuedDate;
    /**
     * The issuer of certificate.
     * 
     */
    private final String issuer;
    /**
     * The certificate name of key vault.
     * 
     */
    private final String keyVaultCertName;
    /**
     * The subject name of certificate.
     * 
     */
    private final String subjectName;
    /**
     * The thumbprint of certificate.
     * 
     */
    private final String thumbprint;
    /**
     * The vault uri of user key vault.
     * 
     */
    private final String vaultUri;

    @CustomType.Constructor
    private CertificatePropertiesResponse(
        @CustomType.Parameter("activateDate") String activateDate,
        @CustomType.Parameter("certVersion") @Nullable String certVersion,
        @CustomType.Parameter("dnsNames") List<String> dnsNames,
        @CustomType.Parameter("expirationDate") String expirationDate,
        @CustomType.Parameter("issuedDate") String issuedDate,
        @CustomType.Parameter("issuer") String issuer,
        @CustomType.Parameter("keyVaultCertName") String keyVaultCertName,
        @CustomType.Parameter("subjectName") String subjectName,
        @CustomType.Parameter("thumbprint") String thumbprint,
        @CustomType.Parameter("vaultUri") String vaultUri) {
        this.activateDate = activateDate;
        this.certVersion = certVersion;
        this.dnsNames = dnsNames;
        this.expirationDate = expirationDate;
        this.issuedDate = issuedDate;
        this.issuer = issuer;
        this.keyVaultCertName = keyVaultCertName;
        this.subjectName = subjectName;
        this.thumbprint = thumbprint;
        this.vaultUri = vaultUri;
    }

    /**
     * The activate date of certificate.
     * 
    */
    public String activateDate() {
        return this.activateDate;
    }
    /**
     * The certificate version of key vault.
     * 
    */
    public Optional<String> certVersion() {
        return Optional.ofNullable(this.certVersion);
    }
    /**
     * The domain list of certificate.
     * 
    */
    public List<String> dnsNames() {
        return this.dnsNames;
    }
    /**
     * The expiration date of certificate.
     * 
    */
    public String expirationDate() {
        return this.expirationDate;
    }
    /**
     * The issue date of certificate.
     * 
    */
    public String issuedDate() {
        return this.issuedDate;
    }
    /**
     * The issuer of certificate.
     * 
    */
    public String issuer() {
        return this.issuer;
    }
    /**
     * The certificate name of key vault.
     * 
    */
    public String keyVaultCertName() {
        return this.keyVaultCertName;
    }
    /**
     * The subject name of certificate.
     * 
    */
    public String subjectName() {
        return this.subjectName;
    }
    /**
     * The thumbprint of certificate.
     * 
    */
    public String thumbprint() {
        return this.thumbprint;
    }
    /**
     * The vault uri of user key vault.
     * 
    */
    public String vaultUri() {
        return this.vaultUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificatePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activateDate;
        private @Nullable String certVersion;
        private List<String> dnsNames;
        private String expirationDate;
        private String issuedDate;
        private String issuer;
        private String keyVaultCertName;
        private String subjectName;
        private String thumbprint;
        private String vaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificatePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activateDate = defaults.activateDate;
    	      this.certVersion = defaults.certVersion;
    	      this.dnsNames = defaults.dnsNames;
    	      this.expirationDate = defaults.expirationDate;
    	      this.issuedDate = defaults.issuedDate;
    	      this.issuer = defaults.issuer;
    	      this.keyVaultCertName = defaults.keyVaultCertName;
    	      this.subjectName = defaults.subjectName;
    	      this.thumbprint = defaults.thumbprint;
    	      this.vaultUri = defaults.vaultUri;
        }

        public Builder activateDate(String activateDate) {
            this.activateDate = Objects.requireNonNull(activateDate);
            return this;
        }
        public Builder certVersion(@Nullable String certVersion) {
            this.certVersion = certVersion;
            return this;
        }
        public Builder dnsNames(List<String> dnsNames) {
            this.dnsNames = Objects.requireNonNull(dnsNames);
            return this;
        }
        public Builder dnsNames(String... dnsNames) {
            return dnsNames(List.of(dnsNames));
        }
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }
        public Builder issuedDate(String issuedDate) {
            this.issuedDate = Objects.requireNonNull(issuedDate);
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder keyVaultCertName(String keyVaultCertName) {
            this.keyVaultCertName = Objects.requireNonNull(keyVaultCertName);
            return this;
        }
        public Builder subjectName(String subjectName) {
            this.subjectName = Objects.requireNonNull(subjectName);
            return this;
        }
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        public Builder vaultUri(String vaultUri) {
            this.vaultUri = Objects.requireNonNull(vaultUri);
            return this;
        }        public CertificatePropertiesResponse build() {
            return new CertificatePropertiesResponse(activateDate, certVersion, dnsNames, expirationDate, issuedDate, issuer, keyVaultCertName, subjectName, thumbprint, vaultUri);
        }
    }
}
