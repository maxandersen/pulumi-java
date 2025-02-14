// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.azurenative.apimanagement.outputs.KeyVaultContractPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCertificateResult {
    /**
     * @return Expiration date of the certificate. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    private final String expirationDate;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return KeyVault location details of the certificate.
     * 
     */
    private final @Nullable KeyVaultContractPropertiesResponse keyVault;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Subject attribute of the certificate.
     * 
     */
    private final String subject;
    /**
     * @return Thumbprint of the certificate.
     * 
     */
    private final String thumbprint;
    /**
     * @return Resource type for API Management resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("expirationDate") String expirationDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keyVault") @Nullable KeyVaultContractPropertiesResponse keyVault,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("subject") String subject,
        @CustomType.Parameter("thumbprint") String thumbprint,
        @CustomType.Parameter("type") String type) {
        this.expirationDate = expirationDate;
        this.id = id;
        this.keyVault = keyVault;
        this.name = name;
        this.subject = subject;
        this.thumbprint = thumbprint;
        this.type = type;
    }

    /**
     * @return Expiration date of the certificate. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    public String expirationDate() {
        return this.expirationDate;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return KeyVault location details of the certificate.
     * 
     */
    public Optional<KeyVaultContractPropertiesResponse> keyVault() {
        return Optional.ofNullable(this.keyVault);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Subject attribute of the certificate.
     * 
     */
    public String subject() {
        return this.subject;
    }
    /**
     * @return Thumbprint of the certificate.
     * 
     */
    public String thumbprint() {
        return this.thumbprint;
    }
    /**
     * @return Resource type for API Management resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationDate;
        private String id;
        private @Nullable KeyVaultContractPropertiesResponse keyVault;
        private String name;
        private String subject;
        private String thumbprint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.id = defaults.id;
    	      this.keyVault = defaults.keyVault;
    	      this.name = defaults.name;
    	      this.subject = defaults.subject;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
        }

        public Builder expirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder keyVault(@Nullable KeyVaultContractPropertiesResponse keyVault) {
            this.keyVault = keyVault;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder subject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetCertificateResult build() {
            return new GetCertificateResult(expirationDate, id, keyVault, name, subject, thumbprint, type);
        }
    }
}
