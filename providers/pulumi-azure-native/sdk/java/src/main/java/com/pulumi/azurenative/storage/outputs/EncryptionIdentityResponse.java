// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionIdentityResponse {
    /**
     * Resource identifier of the UserAssigned identity to be associated with server-side encryption on the storage account.
     * 
     */
    private final @Nullable String encryptionUserAssignedIdentity;

    @CustomType.Constructor
    private EncryptionIdentityResponse(@CustomType.Parameter("encryptionUserAssignedIdentity") @Nullable String encryptionUserAssignedIdentity) {
        this.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
    }

    /**
     * Resource identifier of the UserAssigned identity to be associated with server-side encryption on the storage account.
     * 
    */
    public Optional<String> encryptionUserAssignedIdentity() {
        return Optional.ofNullable(this.encryptionUserAssignedIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encryptionUserAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionUserAssignedIdentity = defaults.encryptionUserAssignedIdentity;
        }

        public Builder encryptionUserAssignedIdentity(@Nullable String encryptionUserAssignedIdentity) {
            this.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
            return this;
        }        public EncryptionIdentityResponse build() {
            return new EncryptionIdentityResponse(encryptionUserAssignedIdentity);
        }
    }
}
