// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.outputs;

import com.pulumi.azurenative.storagecache.outputs.KeyVaultKeyReferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CacheEncryptionSettingsResponse {
    /**
     * Specifies the location of the key encryption key in Key Vault.
     * 
     */
    private final @Nullable KeyVaultKeyReferenceResponse keyEncryptionKey;

    @CustomType.Constructor
    private CacheEncryptionSettingsResponse(@CustomType.Parameter("keyEncryptionKey") @Nullable KeyVaultKeyReferenceResponse keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
    }

    /**
     * Specifies the location of the key encryption key in Key Vault.
     * 
    */
    public Optional<KeyVaultKeyReferenceResponse> keyEncryptionKey() {
        return Optional.ofNullable(this.keyEncryptionKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheEncryptionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultKeyReferenceResponse keyEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheEncryptionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
        }

        public Builder keyEncryptionKey(@Nullable KeyVaultKeyReferenceResponse keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }        public CacheEncryptionSettingsResponse build() {
            return new CacheEncryptionSettingsResponse(keyEncryptionKey);
        }
    }
}
