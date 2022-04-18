// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AsymmetricEncryptedSecretResponse {
    /**
     * The algorithm used to encrypt "Value".
     * 
     */
    private final String encryptionAlgorithm;
    /**
     * Thumbprint certificate used to encrypt \"Value\". If the value is unencrypted, it will be null.
     * 
     */
    private final @Nullable String encryptionCertThumbprint;
    /**
     * The value of the secret.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private AsymmetricEncryptedSecretResponse(
        @CustomType.Parameter("encryptionAlgorithm") String encryptionAlgorithm,
        @CustomType.Parameter("encryptionCertThumbprint") @Nullable String encryptionCertThumbprint,
        @CustomType.Parameter("value") String value) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.encryptionCertThumbprint = encryptionCertThumbprint;
        this.value = value;
    }

    /**
     * The algorithm used to encrypt "Value".
     * 
    */
    public String encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }
    /**
     * Thumbprint certificate used to encrypt \"Value\". If the value is unencrypted, it will be null.
     * 
    */
    public Optional<String> encryptionCertThumbprint() {
        return Optional.ofNullable(this.encryptionCertThumbprint);
    }
    /**
     * The value of the secret.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AsymmetricEncryptedSecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionAlgorithm;
        private @Nullable String encryptionCertThumbprint;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AsymmetricEncryptedSecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.encryptionCertThumbprint = defaults.encryptionCertThumbprint;
    	      this.value = defaults.value;
        }

        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }
        public Builder encryptionCertThumbprint(@Nullable String encryptionCertThumbprint) {
            this.encryptionCertThumbprint = encryptionCertThumbprint;
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public AsymmetricEncryptedSecretResponse build() {
            return new AsymmetricEncryptedSecretResponse(encryptionAlgorithm, encryptionCertThumbprint, value);
        }
    }
}
