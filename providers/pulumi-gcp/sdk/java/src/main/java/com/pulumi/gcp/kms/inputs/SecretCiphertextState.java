// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretCiphertextState extends com.pulumi.resources.ResourceArgs {

    public static final SecretCiphertextState Empty = new SecretCiphertextState();

    /**
     * The additional authenticated data used for integrity checks during encryption and decryption.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="additionalAuthenticatedData")
      private final @Nullable Output<String> additionalAuthenticatedData;

    public Output<String> additionalAuthenticatedData() {
        return this.additionalAuthenticatedData == null ? Codegen.empty() : this.additionalAuthenticatedData;
    }

    /**
     * Contains the result of encrypting the provided plaintext, encoded in base64.
     * 
     */
    @Import(name="ciphertext")
      private final @Nullable Output<String> ciphertext;

    public Output<String> ciphertext() {
        return this.ciphertext == null ? Codegen.empty() : this.ciphertext;
    }

    /**
     * The full name of the CryptoKey that will be used to encrypt the provided plaintext.
     * Format: `&#39;projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}/cryptoKeys/{{cryptoKey}}&#39;`
     * 
     */
    @Import(name="cryptoKey")
      private final @Nullable Output<String> cryptoKey;

    public Output<String> cryptoKey() {
        return this.cryptoKey == null ? Codegen.empty() : this.cryptoKey;
    }

    /**
     * The plaintext to be encrypted.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="plaintext")
      private final @Nullable Output<String> plaintext;

    public Output<String> plaintext() {
        return this.plaintext == null ? Codegen.empty() : this.plaintext;
    }

    public SecretCiphertextState(
        @Nullable Output<String> additionalAuthenticatedData,
        @Nullable Output<String> ciphertext,
        @Nullable Output<String> cryptoKey,
        @Nullable Output<String> plaintext) {
        this.additionalAuthenticatedData = additionalAuthenticatedData;
        this.ciphertext = ciphertext;
        this.cryptoKey = cryptoKey;
        this.plaintext = plaintext;
    }

    private SecretCiphertextState() {
        this.additionalAuthenticatedData = Codegen.empty();
        this.ciphertext = Codegen.empty();
        this.cryptoKey = Codegen.empty();
        this.plaintext = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretCiphertextState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> additionalAuthenticatedData;
        private @Nullable Output<String> ciphertext;
        private @Nullable Output<String> cryptoKey;
        private @Nullable Output<String> plaintext;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretCiphertextState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalAuthenticatedData = defaults.additionalAuthenticatedData;
    	      this.ciphertext = defaults.ciphertext;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.plaintext = defaults.plaintext;
        }

        public Builder additionalAuthenticatedData(@Nullable Output<String> additionalAuthenticatedData) {
            this.additionalAuthenticatedData = additionalAuthenticatedData;
            return this;
        }
        public Builder additionalAuthenticatedData(@Nullable String additionalAuthenticatedData) {
            this.additionalAuthenticatedData = Codegen.ofNullable(additionalAuthenticatedData);
            return this;
        }
        public Builder ciphertext(@Nullable Output<String> ciphertext) {
            this.ciphertext = ciphertext;
            return this;
        }
        public Builder ciphertext(@Nullable String ciphertext) {
            this.ciphertext = Codegen.ofNullable(ciphertext);
            return this;
        }
        public Builder cryptoKey(@Nullable Output<String> cryptoKey) {
            this.cryptoKey = cryptoKey;
            return this;
        }
        public Builder cryptoKey(@Nullable String cryptoKey) {
            this.cryptoKey = Codegen.ofNullable(cryptoKey);
            return this;
        }
        public Builder plaintext(@Nullable Output<String> plaintext) {
            this.plaintext = plaintext;
            return this;
        }
        public Builder plaintext(@Nullable String plaintext) {
            this.plaintext = Codegen.ofNullable(plaintext);
            return this;
        }        public SecretCiphertextState build() {
            return new SecretCiphertextState(additionalAuthenticatedData, ciphertext, cryptoKey, plaintext);
        }
    }
}
