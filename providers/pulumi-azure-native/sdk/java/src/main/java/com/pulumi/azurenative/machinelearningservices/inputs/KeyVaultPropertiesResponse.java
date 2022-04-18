// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyVaultPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultPropertiesResponse Empty = new KeyVaultPropertiesResponse();

    /**
     * For future use - The client id of the identity which will be used to access key vault.
     * 
     */
    @Import(name="identityClientId")
      private final @Nullable String identityClientId;

    public Optional<String> identityClientId() {
        return this.identityClientId == null ? Optional.empty() : Optional.ofNullable(this.identityClientId);
    }

    /**
     * Key vault uri to access the encryption key.
     * 
     */
    @Import(name="keyIdentifier", required=true)
      private final String keyIdentifier;

    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * The ArmId of the keyVault where the customer owned encryption key is present.
     * 
     */
    @Import(name="keyVaultArmId", required=true)
      private final String keyVaultArmId;

    public String keyVaultArmId() {
        return this.keyVaultArmId;
    }

    public KeyVaultPropertiesResponse(
        @Nullable String identityClientId,
        String keyIdentifier,
        String keyVaultArmId) {
        this.identityClientId = identityClientId;
        this.keyIdentifier = Objects.requireNonNull(keyIdentifier, "expected parameter 'keyIdentifier' to be non-null");
        this.keyVaultArmId = Objects.requireNonNull(keyVaultArmId, "expected parameter 'keyVaultArmId' to be non-null");
    }

    private KeyVaultPropertiesResponse() {
        this.identityClientId = null;
        this.keyIdentifier = null;
        this.keyVaultArmId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String identityClientId;
        private String keyIdentifier;
        private String keyVaultArmId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityClientId = defaults.identityClientId;
    	      this.keyIdentifier = defaults.keyIdentifier;
    	      this.keyVaultArmId = defaults.keyVaultArmId;
        }

        public Builder identityClientId(@Nullable String identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }
        public Builder keyIdentifier(String keyIdentifier) {
            this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
            return this;
        }
        public Builder keyVaultArmId(String keyVaultArmId) {
            this.keyVaultArmId = Objects.requireNonNull(keyVaultArmId);
            return this;
        }        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(identityClientId, keyIdentifier, keyVaultArmId);
        }
    }
}
