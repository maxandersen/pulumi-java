// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyVaultPropertiesResponse {
    /**
     * The name of the key associated with the Log Analytics cluster.
     * 
     */
    private final @Nullable String keyName;
    /**
     * Selected key minimum required size.
     * 
     */
    private final @Nullable Integer keyRsaSize;
    /**
     * The Key Vault uri which holds they key associated with the Log Analytics cluster.
     * 
     */
    private final @Nullable String keyVaultUri;
    /**
     * The version of the key associated with the Log Analytics cluster.
     * 
     */
    private final @Nullable String keyVersion;

    @CustomType.Constructor
    private KeyVaultPropertiesResponse(
        @CustomType.Parameter("keyName") @Nullable String keyName,
        @CustomType.Parameter("keyRsaSize") @Nullable Integer keyRsaSize,
        @CustomType.Parameter("keyVaultUri") @Nullable String keyVaultUri,
        @CustomType.Parameter("keyVersion") @Nullable String keyVersion) {
        this.keyName = keyName;
        this.keyRsaSize = keyRsaSize;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    /**
     * The name of the key associated with the Log Analytics cluster.
     * 
    */
    public Optional<String> keyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * Selected key minimum required size.
     * 
    */
    public Optional<Integer> keyRsaSize() {
        return Optional.ofNullable(this.keyRsaSize);
    }
    /**
     * The Key Vault uri which holds they key associated with the Log Analytics cluster.
     * 
    */
    public Optional<String> keyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }
    /**
     * The version of the key associated with the Log Analytics cluster.
     * 
    */
    public Optional<String> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable Integer keyRsaSize;
        private @Nullable String keyVaultUri;
        private @Nullable String keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyRsaSize = defaults.keyRsaSize;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keyRsaSize(@Nullable Integer keyRsaSize) {
            this.keyRsaSize = keyRsaSize;
            return this;
        }
        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }
        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(keyName, keyRsaSize, keyVaultUri, keyVersion);
        }
    }
}
