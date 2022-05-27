// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceCustomerManagedKeyState extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceCustomerManagedKeyState Empty = new NamespaceCustomerManagedKeyState();

    /**
     * The ID of the EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="eventhubNamespaceId")
    private @Nullable Output<String> eventhubNamespaceId;

    /**
     * @return The ID of the EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> eventhubNamespaceId() {
        return Optional.ofNullable(this.eventhubNamespaceId);
    }

    /**
     * The list of keys of Key Vault.
     * 
     */
    @Import(name="keyVaultKeyIds")
    private @Nullable Output<List<String>> keyVaultKeyIds;

    /**
     * @return The list of keys of Key Vault.
     * 
     */
    public Optional<Output<List<String>>> keyVaultKeyIds() {
        return Optional.ofNullable(this.keyVaultKeyIds);
    }

    private NamespaceCustomerManagedKeyState() {}

    private NamespaceCustomerManagedKeyState(NamespaceCustomerManagedKeyState $) {
        this.eventhubNamespaceId = $.eventhubNamespaceId;
        this.keyVaultKeyIds = $.keyVaultKeyIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceCustomerManagedKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceCustomerManagedKeyState $;

        public Builder() {
            $ = new NamespaceCustomerManagedKeyState();
        }

        public Builder(NamespaceCustomerManagedKeyState defaults) {
            $ = new NamespaceCustomerManagedKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventhubNamespaceId The ID of the EventHub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventhubNamespaceId(@Nullable Output<String> eventhubNamespaceId) {
            $.eventhubNamespaceId = eventhubNamespaceId;
            return this;
        }

        /**
         * @param eventhubNamespaceId The ID of the EventHub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventhubNamespaceId(String eventhubNamespaceId) {
            return eventhubNamespaceId(Output.of(eventhubNamespaceId));
        }

        /**
         * @param keyVaultKeyIds The list of keys of Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyIds(@Nullable Output<List<String>> keyVaultKeyIds) {
            $.keyVaultKeyIds = keyVaultKeyIds;
            return this;
        }

        /**
         * @param keyVaultKeyIds The list of keys of Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyIds(List<String> keyVaultKeyIds) {
            return keyVaultKeyIds(Output.of(keyVaultKeyIds));
        }

        /**
         * @param keyVaultKeyIds The list of keys of Key Vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyIds(String... keyVaultKeyIds) {
            return keyVaultKeyIds(List.of(keyVaultKeyIds));
        }

        public NamespaceCustomerManagedKeyState build() {
            return $;
        }
    }

}
