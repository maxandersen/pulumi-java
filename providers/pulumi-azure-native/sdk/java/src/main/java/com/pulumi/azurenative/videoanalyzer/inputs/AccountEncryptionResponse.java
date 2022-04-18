// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.azurenative.videoanalyzer.inputs.KeyVaultPropertiesResponse;
import com.pulumi.azurenative.videoanalyzer.inputs.ResourceIdentityResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines how the Video Analyzer account is (optionally) encrypted.
 * 
 */
public final class AccountEncryptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final AccountEncryptionResponse Empty = new AccountEncryptionResponse();

    /**
     * The Key Vault identity.
     * 
     */
    @Import(name="identity")
      private final @Nullable ResourceIdentityResponse identity;

    public Optional<ResourceIdentityResponse> identity() {
        return this.identity == null ? Optional.empty() : Optional.ofNullable(this.identity);
    }

    /**
     * The properties of the key used to encrypt the account.
     * 
     */
    @Import(name="keyVaultProperties")
      private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    public Optional<KeyVaultPropertiesResponse> keyVaultProperties() {
        return this.keyVaultProperties == null ? Optional.empty() : Optional.ofNullable(this.keyVaultProperties);
    }

    /**
     * The current status of the Key Vault mapping.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    /**
     * The type of key used to encrypt the Account Key.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AccountEncryptionResponse(
        @Nullable ResourceIdentityResponse identity,
        @Nullable KeyVaultPropertiesResponse keyVaultProperties,
        String status,
        String type) {
        this.identity = identity;
        this.keyVaultProperties = keyVaultProperties;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AccountEncryptionResponse() {
        this.identity = null;
        this.keyVaultProperties = null;
        this.status = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceIdentityResponse identity;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder identity(@Nullable ResourceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder keyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AccountEncryptionResponse build() {
            return new AccountEncryptionResponse(identity, keyVaultProperties, status, type);
        }
    }
}
