// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.SourceVaultArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Key Vault Secret Url and vault id of the encryption key
 * 
 */
public final class KeyVaultAndSecretReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyVaultAndSecretReferenceArgs Empty = new KeyVaultAndSecretReferenceArgs();

    /**
     * Url pointing to a key or secret in KeyVault
     * 
     */
    @Import(name="secretUrl", required=true)
    private Output<String> secretUrl;

    /**
     * @return Url pointing to a key or secret in KeyVault
     * 
     */
    public Output<String> secretUrl() {
        return this.secretUrl;
    }

    /**
     * Resource id of the KeyVault containing the key or secret
     * 
     */
    @Import(name="sourceVault", required=true)
    private Output<SourceVaultArgs> sourceVault;

    /**
     * @return Resource id of the KeyVault containing the key or secret
     * 
     */
    public Output<SourceVaultArgs> sourceVault() {
        return this.sourceVault;
    }

    private KeyVaultAndSecretReferenceArgs() {}

    private KeyVaultAndSecretReferenceArgs(KeyVaultAndSecretReferenceArgs $) {
        this.secretUrl = $.secretUrl;
        this.sourceVault = $.sourceVault;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultAndSecretReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultAndSecretReferenceArgs $;

        public Builder() {
            $ = new KeyVaultAndSecretReferenceArgs();
        }

        public Builder(KeyVaultAndSecretReferenceArgs defaults) {
            $ = new KeyVaultAndSecretReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretUrl Url pointing to a key or secret in KeyVault
         * 
         * @return builder
         * 
         */
        public Builder secretUrl(Output<String> secretUrl) {
            $.secretUrl = secretUrl;
            return this;
        }

        /**
         * @param secretUrl Url pointing to a key or secret in KeyVault
         * 
         * @return builder
         * 
         */
        public Builder secretUrl(String secretUrl) {
            return secretUrl(Output.of(secretUrl));
        }

        /**
         * @param sourceVault Resource id of the KeyVault containing the key or secret
         * 
         * @return builder
         * 
         */
        public Builder sourceVault(Output<SourceVaultArgs> sourceVault) {
            $.sourceVault = sourceVault;
            return this;
        }

        /**
         * @param sourceVault Resource id of the KeyVault containing the key or secret
         * 
         * @return builder
         * 
         */
        public Builder sourceVault(SourceVaultArgs sourceVault) {
            return sourceVault(Output.of(sourceVault));
        }

        public KeyVaultAndSecretReferenceArgs build() {
            $.secretUrl = Objects.requireNonNull($.secretUrl, "expected parameter 'secretUrl' to be non-null");
            $.sourceVault = Objects.requireNonNull($.sourceVault, "expected parameter 'sourceVault' to be non-null");
            return $;
        }
    }

}
