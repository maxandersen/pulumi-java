// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Metadata information used by account encryption.
 * 
 */
public final class KeyVaultMetaInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultMetaInfoArgs Empty = new KeyVaultMetaInfoArgs();

    /**
     * The name of the user managed encryption key.
     * 
     */
    @Import(name="encryptionKeyName", required=true)
      private final Output<String> encryptionKeyName;

    public Output<String> encryptionKeyName() {
        return this.encryptionKeyName;
    }

    /**
     * The version of the user managed encryption key.
     * 
     */
    @Import(name="encryptionKeyVersion", required=true)
      private final Output<String> encryptionKeyVersion;

    public Output<String> encryptionKeyVersion() {
        return this.encryptionKeyVersion;
    }

    /**
     * The resource identifier for the user managed Key Vault being used to encrypt.
     * 
     */
    @Import(name="keyVaultResourceId", required=true)
      private final Output<String> keyVaultResourceId;

    public Output<String> keyVaultResourceId() {
        return this.keyVaultResourceId;
    }

    public KeyVaultMetaInfoArgs(
        Output<String> encryptionKeyName,
        Output<String> encryptionKeyVersion,
        Output<String> keyVaultResourceId) {
        this.encryptionKeyName = Objects.requireNonNull(encryptionKeyName, "expected parameter 'encryptionKeyName' to be non-null");
        this.encryptionKeyVersion = Objects.requireNonNull(encryptionKeyVersion, "expected parameter 'encryptionKeyVersion' to be non-null");
        this.keyVaultResourceId = Objects.requireNonNull(keyVaultResourceId, "expected parameter 'keyVaultResourceId' to be non-null");
    }

    private KeyVaultMetaInfoArgs() {
        this.encryptionKeyName = Codegen.empty();
        this.encryptionKeyVersion = Codegen.empty();
        this.keyVaultResourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultMetaInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> encryptionKeyName;
        private Output<String> encryptionKeyVersion;
        private Output<String> keyVaultResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultMetaInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionKeyName = defaults.encryptionKeyName;
    	      this.encryptionKeyVersion = defaults.encryptionKeyVersion;
    	      this.keyVaultResourceId = defaults.keyVaultResourceId;
        }

        public Builder encryptionKeyName(Output<String> encryptionKeyName) {
            this.encryptionKeyName = Objects.requireNonNull(encryptionKeyName);
            return this;
        }
        public Builder encryptionKeyName(String encryptionKeyName) {
            this.encryptionKeyName = Output.of(Objects.requireNonNull(encryptionKeyName));
            return this;
        }
        public Builder encryptionKeyVersion(Output<String> encryptionKeyVersion) {
            this.encryptionKeyVersion = Objects.requireNonNull(encryptionKeyVersion);
            return this;
        }
        public Builder encryptionKeyVersion(String encryptionKeyVersion) {
            this.encryptionKeyVersion = Output.of(Objects.requireNonNull(encryptionKeyVersion));
            return this;
        }
        public Builder keyVaultResourceId(Output<String> keyVaultResourceId) {
            this.keyVaultResourceId = Objects.requireNonNull(keyVaultResourceId);
            return this;
        }
        public Builder keyVaultResourceId(String keyVaultResourceId) {
            this.keyVaultResourceId = Output.of(Objects.requireNonNull(keyVaultResourceId));
            return this;
        }        public KeyVaultMetaInfoArgs build() {
            return new KeyVaultMetaInfoArgs(encryptionKeyName, encryptionKeyVersion, keyVaultResourceId);
        }
    }
}
