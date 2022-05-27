// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceCustomerManagedKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceCustomerManagedKeyArgs Empty = new WorkspaceCustomerManagedKeyArgs();

    /**
     * An identifier for the key. Name needs to match the name of the key used with the `azure.synapse.WorkspaceKey` resource. Defaults to &#34;cmk&#34; if not specified.
     * 
     */
    @Import(name="keyName")
    private @Nullable Output<String> keyName;

    /**
     * @return An identifier for the key. Name needs to match the name of the key used with the `azure.synapse.WorkspaceKey` resource. Defaults to &#34;cmk&#34; if not specified.
     * 
     */
    public Optional<Output<String>> keyName() {
        return Optional.ofNullable(this.keyName);
    }

    /**
     * The Azure Key Vault Key Versionless ID to be used as the Customer Managed Key (CMK) for double encryption (e.g. `https://example-keyvault.vault.azure.net/type/cmk/`).
     * 
     */
    @Import(name="keyVersionlessId", required=true)
    private Output<String> keyVersionlessId;

    /**
     * @return The Azure Key Vault Key Versionless ID to be used as the Customer Managed Key (CMK) for double encryption (e.g. `https://example-keyvault.vault.azure.net/type/cmk/`).
     * 
     */
    public Output<String> keyVersionlessId() {
        return this.keyVersionlessId;
    }

    private WorkspaceCustomerManagedKeyArgs() {}

    private WorkspaceCustomerManagedKeyArgs(WorkspaceCustomerManagedKeyArgs $) {
        this.keyName = $.keyName;
        this.keyVersionlessId = $.keyVersionlessId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceCustomerManagedKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceCustomerManagedKeyArgs $;

        public Builder() {
            $ = new WorkspaceCustomerManagedKeyArgs();
        }

        public Builder(WorkspaceCustomerManagedKeyArgs defaults) {
            $ = new WorkspaceCustomerManagedKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyName An identifier for the key. Name needs to match the name of the key used with the `azure.synapse.WorkspaceKey` resource. Defaults to &#34;cmk&#34; if not specified.
         * 
         * @return builder
         * 
         */
        public Builder keyName(@Nullable Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName An identifier for the key. Name needs to match the name of the key used with the `azure.synapse.WorkspaceKey` resource. Defaults to &#34;cmk&#34; if not specified.
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        /**
         * @param keyVersionlessId The Azure Key Vault Key Versionless ID to be used as the Customer Managed Key (CMK) for double encryption (e.g. `https://example-keyvault.vault.azure.net/type/cmk/`).
         * 
         * @return builder
         * 
         */
        public Builder keyVersionlessId(Output<String> keyVersionlessId) {
            $.keyVersionlessId = keyVersionlessId;
            return this;
        }

        /**
         * @param keyVersionlessId The Azure Key Vault Key Versionless ID to be used as the Customer Managed Key (CMK) for double encryption (e.g. `https://example-keyvault.vault.azure.net/type/cmk/`).
         * 
         * @return builder
         * 
         */
        public Builder keyVersionlessId(String keyVersionlessId) {
            return keyVersionlessId(Output.of(keyVersionlessId));
        }

        public WorkspaceCustomerManagedKeyArgs build() {
            $.keyVersionlessId = Objects.requireNonNull($.keyVersionlessId, "expected parameter 'keyVersionlessId' to be non-null");
            return $;
        }
    }

}
