// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionResponse {
    /**
     * @return The name of KeyVault key.
     * 
     */
    private final @Nullable String keyName;
    /**
     * @return The encryption keySource (provider). Possible values (case-insensitive):  Default, Microsoft.Keyvault
     * 
     */
    private final @Nullable String keySource;
    /**
     * @return The Uri of KeyVault.
     * 
     */
    private final @Nullable String keyVaultUri;
    /**
     * @return The version of KeyVault key.
     * 
     */
    private final @Nullable String keyVersion;

    @CustomType.Constructor
    private EncryptionResponse(
        @CustomType.Parameter("keyName") @Nullable String keyName,
        @CustomType.Parameter("keySource") @Nullable String keySource,
        @CustomType.Parameter("keyVaultUri") @Nullable String keyVaultUri,
        @CustomType.Parameter("keyVersion") @Nullable String keyVersion) {
        this.keyName = keyName;
        this.keySource = keySource;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    /**
     * @return The name of KeyVault key.
     * 
     */
    public Optional<String> keyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * @return The encryption keySource (provider). Possible values (case-insensitive):  Default, Microsoft.Keyvault
     * 
     */
    public Optional<String> keySource() {
        return Optional.ofNullable(this.keySource);
    }
    /**
     * @return The Uri of KeyVault.
     * 
     */
    public Optional<String> keyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }
    /**
     * @return The version of KeyVault key.
     * 
     */
    public Optional<String> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String keySource;
        private @Nullable String keyVaultUri;
        private @Nullable String keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keySource = defaults.keySource;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keySource(@Nullable String keySource) {
            this.keySource = keySource;
            return this;
        }
        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }
        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }        public EncryptionResponse build() {
            return new EncryptionResponse(keyName, keySource, keyVaultUri, keyVersion);
        }
    }
}
