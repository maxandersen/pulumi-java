// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceCustomerManagedKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceCustomerManagedKeyArgs Empty = new NamespaceCustomerManagedKeyArgs();

    /**
     * The ID of the User Assigned Identity that has access to the key.
     * 
     */
    @Import(name="identityId", required=true)
    private Output<String> identityId;

    /**
     * @return The ID of the User Assigned Identity that has access to the key.
     * 
     */
    public Output<String> identityId() {
        return this.identityId;
    }

    /**
     * Used to specify whether enable Infrastructure Encryption (Double Encryption).
     * 
     */
    @Import(name="infrastructureEncryptionEnabled")
    private @Nullable Output<Boolean> infrastructureEncryptionEnabled;

    /**
     * @return Used to specify whether enable Infrastructure Encryption (Double Encryption).
     * 
     */
    public Optional<Output<Boolean>> infrastructureEncryptionEnabled() {
        return Optional.ofNullable(this.infrastructureEncryptionEnabled);
    }

    /**
     * The ID of the Key Vault Key which should be used to Encrypt the data in this ServiceBus Namespace.
     * 
     */
    @Import(name="keyVaultKeyId", required=true)
    private Output<String> keyVaultKeyId;

    /**
     * @return The ID of the Key Vault Key which should be used to Encrypt the data in this ServiceBus Namespace.
     * 
     */
    public Output<String> keyVaultKeyId() {
        return this.keyVaultKeyId;
    }

    private NamespaceCustomerManagedKeyArgs() {}

    private NamespaceCustomerManagedKeyArgs(NamespaceCustomerManagedKeyArgs $) {
        this.identityId = $.identityId;
        this.infrastructureEncryptionEnabled = $.infrastructureEncryptionEnabled;
        this.keyVaultKeyId = $.keyVaultKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceCustomerManagedKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceCustomerManagedKeyArgs $;

        public Builder() {
            $ = new NamespaceCustomerManagedKeyArgs();
        }

        public Builder(NamespaceCustomerManagedKeyArgs defaults) {
            $ = new NamespaceCustomerManagedKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityId The ID of the User Assigned Identity that has access to the key.
         * 
         * @return builder
         * 
         */
        public Builder identityId(Output<String> identityId) {
            $.identityId = identityId;
            return this;
        }

        /**
         * @param identityId The ID of the User Assigned Identity that has access to the key.
         * 
         * @return builder
         * 
         */
        public Builder identityId(String identityId) {
            return identityId(Output.of(identityId));
        }

        /**
         * @param infrastructureEncryptionEnabled Used to specify whether enable Infrastructure Encryption (Double Encryption).
         * 
         * @return builder
         * 
         */
        public Builder infrastructureEncryptionEnabled(@Nullable Output<Boolean> infrastructureEncryptionEnabled) {
            $.infrastructureEncryptionEnabled = infrastructureEncryptionEnabled;
            return this;
        }

        /**
         * @param infrastructureEncryptionEnabled Used to specify whether enable Infrastructure Encryption (Double Encryption).
         * 
         * @return builder
         * 
         */
        public Builder infrastructureEncryptionEnabled(Boolean infrastructureEncryptionEnabled) {
            return infrastructureEncryptionEnabled(Output.of(infrastructureEncryptionEnabled));
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key which should be used to Encrypt the data in this ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(Output<String> keyVaultKeyId) {
            $.keyVaultKeyId = keyVaultKeyId;
            return this;
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key which should be used to Encrypt the data in this ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            return keyVaultKeyId(Output.of(keyVaultKeyId));
        }

        public NamespaceCustomerManagedKeyArgs build() {
            $.identityId = Objects.requireNonNull($.identityId, "expected parameter 'identityId' to be non-null");
            $.keyVaultKeyId = Objects.requireNonNull($.keyVaultKeyId, "expected parameter 'keyVaultKeyId' to be non-null");
            return $;
        }
    }

}
