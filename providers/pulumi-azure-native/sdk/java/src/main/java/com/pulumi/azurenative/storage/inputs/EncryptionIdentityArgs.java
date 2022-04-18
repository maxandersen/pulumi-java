// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encryption identity for the storage account.
 * 
 */
public final class EncryptionIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionIdentityArgs Empty = new EncryptionIdentityArgs();

    /**
     * Resource identifier of the UserAssigned identity to be associated with server-side encryption on the storage account.
     * 
     */
    @Import(name="encryptionUserAssignedIdentity")
      private final @Nullable Output<String> encryptionUserAssignedIdentity;

    public Output<String> encryptionUserAssignedIdentity() {
        return this.encryptionUserAssignedIdentity == null ? Codegen.empty() : this.encryptionUserAssignedIdentity;
    }

    public EncryptionIdentityArgs(@Nullable Output<String> encryptionUserAssignedIdentity) {
        this.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
    }

    private EncryptionIdentityArgs() {
        this.encryptionUserAssignedIdentity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> encryptionUserAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionUserAssignedIdentity = defaults.encryptionUserAssignedIdentity;
        }

        public Builder encryptionUserAssignedIdentity(@Nullable Output<String> encryptionUserAssignedIdentity) {
            this.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
            return this;
        }
        public Builder encryptionUserAssignedIdentity(@Nullable String encryptionUserAssignedIdentity) {
            this.encryptionUserAssignedIdentity = Codegen.ofNullable(encryptionUserAssignedIdentity);
            return this;
        }        public EncryptionIdentityArgs build() {
            return new EncryptionIdentityArgs(encryptionUserAssignedIdentity);
        }
    }
}
