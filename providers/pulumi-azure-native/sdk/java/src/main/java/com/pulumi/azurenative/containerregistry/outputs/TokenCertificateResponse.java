// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TokenCertificateResponse {
    /**
     * Base 64 encoded string of the public certificate1 in PEM format that will be used for authenticating the token.
     * 
     */
    private final @Nullable String encodedPemCertificate;
    /**
     * The expiry datetime of the certificate.
     * 
     */
    private final @Nullable String expiry;
    private final @Nullable String name;
    /**
     * The thumbprint of the certificate.
     * 
     */
    private final @Nullable String thumbprint;

    @CustomType.Constructor
    private TokenCertificateResponse(
        @CustomType.Parameter("encodedPemCertificate") @Nullable String encodedPemCertificate,
        @CustomType.Parameter("expiry") @Nullable String expiry,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("thumbprint") @Nullable String thumbprint) {
        this.encodedPemCertificate = encodedPemCertificate;
        this.expiry = expiry;
        this.name = name;
        this.thumbprint = thumbprint;
    }

    /**
     * Base 64 encoded string of the public certificate1 in PEM format that will be used for authenticating the token.
     * 
    */
    public Optional<String> encodedPemCertificate() {
        return Optional.ofNullable(this.encodedPemCertificate);
    }
    /**
     * The expiry datetime of the certificate.
     * 
    */
    public Optional<String> expiry() {
        return Optional.ofNullable(this.expiry);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The thumbprint of the certificate.
     * 
    */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encodedPemCertificate;
        private @Nullable String expiry;
        private @Nullable String name;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encodedPemCertificate = defaults.encodedPemCertificate;
    	      this.expiry = defaults.expiry;
    	      this.name = defaults.name;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder encodedPemCertificate(@Nullable String encodedPemCertificate) {
            this.encodedPemCertificate = encodedPemCertificate;
            return this;
        }
        public Builder expiry(@Nullable String expiry) {
            this.expiry = expiry;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }        public TokenCertificateResponse build() {
            return new TokenCertificateResponse(encodedPemCertificate, expiry, name, thumbprint);
        }
    }
}
