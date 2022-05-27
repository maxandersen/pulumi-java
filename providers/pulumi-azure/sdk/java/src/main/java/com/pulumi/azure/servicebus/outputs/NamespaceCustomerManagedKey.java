// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NamespaceCustomerManagedKey {
    /**
     * @return The ID of the User Assigned Identity that has access to the key.
     * 
     */
    private final String identityId;
    /**
     * @return Used to specify whether enable Infrastructure Encryption (Double Encryption).
     * 
     */
    private final @Nullable Boolean infrastructureEncryptionEnabled;
    /**
     * @return The ID of the Key Vault Key which should be used to Encrypt the data in this ServiceBus Namespace.
     * 
     */
    private final String keyVaultKeyId;

    @CustomType.Constructor
    private NamespaceCustomerManagedKey(
        @CustomType.Parameter("identityId") String identityId,
        @CustomType.Parameter("infrastructureEncryptionEnabled") @Nullable Boolean infrastructureEncryptionEnabled,
        @CustomType.Parameter("keyVaultKeyId") String keyVaultKeyId) {
        this.identityId = identityId;
        this.infrastructureEncryptionEnabled = infrastructureEncryptionEnabled;
        this.keyVaultKeyId = keyVaultKeyId;
    }

    /**
     * @return The ID of the User Assigned Identity that has access to the key.
     * 
     */
    public String identityId() {
        return this.identityId;
    }
    /**
     * @return Used to specify whether enable Infrastructure Encryption (Double Encryption).
     * 
     */
    public Optional<Boolean> infrastructureEncryptionEnabled() {
        return Optional.ofNullable(this.infrastructureEncryptionEnabled);
    }
    /**
     * @return The ID of the Key Vault Key which should be used to Encrypt the data in this ServiceBus Namespace.
     * 
     */
    public String keyVaultKeyId() {
        return this.keyVaultKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceCustomerManagedKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String identityId;
        private @Nullable Boolean infrastructureEncryptionEnabled;
        private String keyVaultKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceCustomerManagedKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityId = defaults.identityId;
    	      this.infrastructureEncryptionEnabled = defaults.infrastructureEncryptionEnabled;
    	      this.keyVaultKeyId = defaults.keyVaultKeyId;
        }

        public Builder identityId(String identityId) {
            this.identityId = Objects.requireNonNull(identityId);
            return this;
        }
        public Builder infrastructureEncryptionEnabled(@Nullable Boolean infrastructureEncryptionEnabled) {
            this.infrastructureEncryptionEnabled = infrastructureEncryptionEnabled;
            return this;
        }
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            this.keyVaultKeyId = Objects.requireNonNull(keyVaultKeyId);
            return this;
        }        public NamespaceCustomerManagedKey build() {
            return new NamespaceCustomerManagedKey(identityId, infrastructureEncryptionEnabled, keyVaultKeyId);
        }
    }
}
