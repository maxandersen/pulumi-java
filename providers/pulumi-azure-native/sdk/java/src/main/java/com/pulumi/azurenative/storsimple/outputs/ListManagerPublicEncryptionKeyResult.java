// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListManagerPublicEncryptionKeyResult {
    /**
     * The algorithm used to encrypt the &#34;Value&#34;.
     * 
     */
    private final String encryptionAlgorithm;
    /**
     * The value of the secret itself. If the secret is in plaintext or null then EncryptionAlgorithm will be none.
     * 
     */
    private final String value;
    /**
     * The thumbprint of the cert that was used to encrypt &#34;Value&#34;.
     * 
     */
    private final @Nullable String valueCertificateThumbprint;

    @CustomType.Constructor
    private ListManagerPublicEncryptionKeyResult(
        @CustomType.Parameter("encryptionAlgorithm") String encryptionAlgorithm,
        @CustomType.Parameter("value") String value,
        @CustomType.Parameter("valueCertificateThumbprint") @Nullable String valueCertificateThumbprint) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.value = value;
        this.valueCertificateThumbprint = valueCertificateThumbprint;
    }

    /**
     * The algorithm used to encrypt the &#34;Value&#34;.
     * 
    */
    public String encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }
    /**
     * The value of the secret itself. If the secret is in plaintext or null then EncryptionAlgorithm will be none.
     * 
    */
    public String value() {
        return this.value;
    }
    /**
     * The thumbprint of the cert that was used to encrypt &#34;Value&#34;.
     * 
    */
    public Optional<String> valueCertificateThumbprint() {
        return Optional.ofNullable(this.valueCertificateThumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListManagerPublicEncryptionKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionAlgorithm;
        private String value;
        private @Nullable String valueCertificateThumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ListManagerPublicEncryptionKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.value = defaults.value;
    	      this.valueCertificateThumbprint = defaults.valueCertificateThumbprint;
        }

        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder valueCertificateThumbprint(@Nullable String valueCertificateThumbprint) {
            this.valueCertificateThumbprint = valueCertificateThumbprint;
            return this;
        }        public ListManagerPublicEncryptionKeyResult build() {
            return new ListManagerPublicEncryptionKeyResult(encryptionAlgorithm, value, valueCertificateThumbprint);
        }
    }
}
