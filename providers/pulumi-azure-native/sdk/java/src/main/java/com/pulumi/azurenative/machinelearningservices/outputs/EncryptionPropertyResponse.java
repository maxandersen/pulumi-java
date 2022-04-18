// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.IdentityForCmkResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.KeyVaultPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionPropertyResponse {
    /**
     * The identity that will be used to access the key vault for encryption at rest.
     * 
     */
    private final @Nullable IdentityForCmkResponse identity;
    /**
     * Customer Key vault properties.
     * 
     */
    private final KeyVaultPropertiesResponse keyVaultProperties;
    /**
     * Indicates whether or not the encryption is enabled for the workspace.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private EncryptionPropertyResponse(
        @CustomType.Parameter("identity") @Nullable IdentityForCmkResponse identity,
        @CustomType.Parameter("keyVaultProperties") KeyVaultPropertiesResponse keyVaultProperties,
        @CustomType.Parameter("status") String status) {
        this.identity = identity;
        this.keyVaultProperties = keyVaultProperties;
        this.status = status;
    }

    /**
     * The identity that will be used to access the key vault for encryption at rest.
     * 
    */
    public Optional<IdentityForCmkResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Customer Key vault properties.
     * 
    */
    public KeyVaultPropertiesResponse keyVaultProperties() {
        return this.keyVaultProperties;
    }
    /**
     * Indicates whether or not the encryption is enabled for the workspace.
     * 
    */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IdentityForCmkResponse identity;
        private KeyVaultPropertiesResponse keyVaultProperties;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.status = defaults.status;
        }

        public Builder identity(@Nullable IdentityForCmkResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder keyVaultProperties(KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = Objects.requireNonNull(keyVaultProperties);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public EncryptionPropertyResponse build() {
            return new EncryptionPropertyResponse(identity, keyVaultProperties, status);
        }
    }
}
