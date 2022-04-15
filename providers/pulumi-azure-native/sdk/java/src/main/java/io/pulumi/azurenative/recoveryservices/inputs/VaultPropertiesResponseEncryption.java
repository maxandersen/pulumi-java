// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.CmkKekIdentityResponse;
import io.pulumi.azurenative.recoveryservices.inputs.CmkKeyVaultPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Customer Managed Key details of the resource.
 * 
 */
public final class VaultPropertiesResponseEncryption extends io.pulumi.resources.InvokeArgs {

    public static final VaultPropertiesResponseEncryption Empty = new VaultPropertiesResponseEncryption();

    /**
     * Enabling/Disabling the Double Encryption state
     * 
     */
    @Import(name="infrastructureEncryption")
      private final @Nullable String infrastructureEncryption;

    public Optional<String> infrastructureEncryption() {
        return this.infrastructureEncryption == null ? Optional.empty() : Optional.ofNullable(this.infrastructureEncryption);
    }

    /**
     * The details of the identity used for CMK
     * 
     */
    @Import(name="kekIdentity")
      private final @Nullable CmkKekIdentityResponse kekIdentity;

    public Optional<CmkKekIdentityResponse> kekIdentity() {
        return this.kekIdentity == null ? Optional.empty() : Optional.ofNullable(this.kekIdentity);
    }

    /**
     * The properties of the Key Vault which hosts CMK
     * 
     */
    @Import(name="keyVaultProperties")
      private final @Nullable CmkKeyVaultPropertiesResponse keyVaultProperties;

    public Optional<CmkKeyVaultPropertiesResponse> keyVaultProperties() {
        return this.keyVaultProperties == null ? Optional.empty() : Optional.ofNullable(this.keyVaultProperties);
    }

    public VaultPropertiesResponseEncryption(
        @Nullable String infrastructureEncryption,
        @Nullable CmkKekIdentityResponse kekIdentity,
        @Nullable CmkKeyVaultPropertiesResponse keyVaultProperties) {
        this.infrastructureEncryption = infrastructureEncryption;
        this.kekIdentity = kekIdentity;
        this.keyVaultProperties = keyVaultProperties;
    }

    private VaultPropertiesResponseEncryption() {
        this.infrastructureEncryption = null;
        this.kekIdentity = null;
        this.keyVaultProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesResponseEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String infrastructureEncryption;
        private @Nullable CmkKekIdentityResponse kekIdentity;
        private @Nullable CmkKeyVaultPropertiesResponse keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesResponseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infrastructureEncryption = defaults.infrastructureEncryption;
    	      this.kekIdentity = defaults.kekIdentity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder infrastructureEncryption(@Nullable String infrastructureEncryption) {
            this.infrastructureEncryption = infrastructureEncryption;
            return this;
        }
        public Builder kekIdentity(@Nullable CmkKekIdentityResponse kekIdentity) {
            this.kekIdentity = kekIdentity;
            return this;
        }
        public Builder keyVaultProperties(@Nullable CmkKeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }        public VaultPropertiesResponseEncryption build() {
            return new VaultPropertiesResponseEncryption(infrastructureEncryption, kekIdentity, keyVaultProperties);
        }
    }
}
