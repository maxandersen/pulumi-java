// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientCertAuthenticationResponse {
    /**
     * Gets or sets the certificate expiration date.
     * 
     */
    private final @Nullable String certificateExpirationDate;
    /**
     * Gets or sets the certificate subject name.
     * 
     */
    private final @Nullable String certificateSubjectName;
    /**
     * Gets or sets the certificate thumbprint.
     * 
     */
    private final @Nullable String certificateThumbprint;
    /**
     * Gets or sets the certificate password, return value will always be empty.
     * 
     */
    private final @Nullable String password;
    /**
     * Gets or sets the pfx certificate. Accepts certification in base64 encoding, return value will always be empty.
     * 
     */
    private final @Nullable String pfx;
    /**
     * Gets or sets the HTTP authentication type.
     * Expected value is 'ClientCertificate'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ClientCertAuthenticationResponse(
        @CustomType.Parameter("certificateExpirationDate") @Nullable String certificateExpirationDate,
        @CustomType.Parameter("certificateSubjectName") @Nullable String certificateSubjectName,
        @CustomType.Parameter("certificateThumbprint") @Nullable String certificateThumbprint,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("pfx") @Nullable String pfx,
        @CustomType.Parameter("type") String type) {
        this.certificateExpirationDate = certificateExpirationDate;
        this.certificateSubjectName = certificateSubjectName;
        this.certificateThumbprint = certificateThumbprint;
        this.password = password;
        this.pfx = pfx;
        this.type = type;
    }

    /**
     * Gets or sets the certificate expiration date.
     * 
    */
    public Optional<String> certificateExpirationDate() {
        return Optional.ofNullable(this.certificateExpirationDate);
    }
    /**
     * Gets or sets the certificate subject name.
     * 
    */
    public Optional<String> certificateSubjectName() {
        return Optional.ofNullable(this.certificateSubjectName);
    }
    /**
     * Gets or sets the certificate thumbprint.
     * 
    */
    public Optional<String> certificateThumbprint() {
        return Optional.ofNullable(this.certificateThumbprint);
    }
    /**
     * Gets or sets the certificate password, return value will always be empty.
     * 
    */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Gets or sets the pfx certificate. Accepts certification in base64 encoding, return value will always be empty.
     * 
    */
    public Optional<String> pfx() {
        return Optional.ofNullable(this.pfx);
    }
    /**
     * Gets or sets the HTTP authentication type.
     * Expected value is 'ClientCertificate'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateExpirationDate;
        private @Nullable String certificateSubjectName;
        private @Nullable String certificateThumbprint;
        private @Nullable String password;
        private @Nullable String pfx;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateExpirationDate = defaults.certificateExpirationDate;
    	      this.certificateSubjectName = defaults.certificateSubjectName;
    	      this.certificateThumbprint = defaults.certificateThumbprint;
    	      this.password = defaults.password;
    	      this.pfx = defaults.pfx;
    	      this.type = defaults.type;
        }

        public Builder certificateExpirationDate(@Nullable String certificateExpirationDate) {
            this.certificateExpirationDate = certificateExpirationDate;
            return this;
        }
        public Builder certificateSubjectName(@Nullable String certificateSubjectName) {
            this.certificateSubjectName = certificateSubjectName;
            return this;
        }
        public Builder certificateThumbprint(@Nullable String certificateThumbprint) {
            this.certificateThumbprint = certificateThumbprint;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder pfx(@Nullable String pfx) {
            this.pfx = pfx;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ClientCertAuthenticationResponse build() {
            return new ClientCertAuthenticationResponse(certificateExpirationDate, certificateSubjectName, certificateThumbprint, password, pfx, type);
        }
    }
}
