// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configure your SQL virtual machine to be able to connect to the Azure Key Vault service.
 * 
 */
public final class KeyVaultCredentialSettingsArgs extends ResourceArgs {

    public static final KeyVaultCredentialSettingsArgs Empty = new KeyVaultCredentialSettingsArgs();

    /**
     * Azure Key Vault url.
     * 
     */
    @Import(name="azureKeyVaultUrl")
    private @Nullable Output<String> azureKeyVaultUrl;

    /**
     * @return Azure Key Vault url.
     * 
     */
    public Optional<Output<String>> azureKeyVaultUrl() {
        return Optional.ofNullable(this.azureKeyVaultUrl);
    }

    /**
     * Credential name.
     * 
     */
    @Import(name="credentialName")
    private @Nullable Output<String> credentialName;

    /**
     * @return Credential name.
     * 
     */
    public Optional<Output<String>> credentialName() {
        return Optional.ofNullable(this.credentialName);
    }

    /**
     * Enable or disable key vault credential setting.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Enable or disable key vault credential setting.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Service principal name to access key vault.
     * 
     */
    @Import(name="servicePrincipalName")
    private @Nullable Output<String> servicePrincipalName;

    /**
     * @return Service principal name to access key vault.
     * 
     */
    public Optional<Output<String>> servicePrincipalName() {
        return Optional.ofNullable(this.servicePrincipalName);
    }

    /**
     * Service principal name secret to access key vault.
     * 
     */
    @Import(name="servicePrincipalSecret")
    private @Nullable Output<String> servicePrincipalSecret;

    /**
     * @return Service principal name secret to access key vault.
     * 
     */
    public Optional<Output<String>> servicePrincipalSecret() {
        return Optional.ofNullable(this.servicePrincipalSecret);
    }

    private KeyVaultCredentialSettingsArgs() {}

    private KeyVaultCredentialSettingsArgs(KeyVaultCredentialSettingsArgs $) {
        this.azureKeyVaultUrl = $.azureKeyVaultUrl;
        this.credentialName = $.credentialName;
        this.enable = $.enable;
        this.servicePrincipalName = $.servicePrincipalName;
        this.servicePrincipalSecret = $.servicePrincipalSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultCredentialSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultCredentialSettingsArgs $;

        public Builder() {
            $ = new KeyVaultCredentialSettingsArgs();
        }

        public Builder(KeyVaultCredentialSettingsArgs defaults) {
            $ = new KeyVaultCredentialSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureKeyVaultUrl Azure Key Vault url.
         * 
         * @return builder
         * 
         */
        public Builder azureKeyVaultUrl(@Nullable Output<String> azureKeyVaultUrl) {
            $.azureKeyVaultUrl = azureKeyVaultUrl;
            return this;
        }

        /**
         * @param azureKeyVaultUrl Azure Key Vault url.
         * 
         * @return builder
         * 
         */
        public Builder azureKeyVaultUrl(String azureKeyVaultUrl) {
            return azureKeyVaultUrl(Output.of(azureKeyVaultUrl));
        }

        /**
         * @param credentialName Credential name.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(@Nullable Output<String> credentialName) {
            $.credentialName = credentialName;
            return this;
        }

        /**
         * @param credentialName Credential name.
         * 
         * @return builder
         * 
         */
        public Builder credentialName(String credentialName) {
            return credentialName(Output.of(credentialName));
        }

        /**
         * @param enable Enable or disable key vault credential setting.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Enable or disable key vault credential setting.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param servicePrincipalName Service principal name to access key vault.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalName(@Nullable Output<String> servicePrincipalName) {
            $.servicePrincipalName = servicePrincipalName;
            return this;
        }

        /**
         * @param servicePrincipalName Service principal name to access key vault.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalName(String servicePrincipalName) {
            return servicePrincipalName(Output.of(servicePrincipalName));
        }

        /**
         * @param servicePrincipalSecret Service principal name secret to access key vault.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalSecret(@Nullable Output<String> servicePrincipalSecret) {
            $.servicePrincipalSecret = servicePrincipalSecret;
            return this;
        }

        /**
         * @param servicePrincipalSecret Service principal name secret to access key vault.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalSecret(String servicePrincipalSecret) {
            return servicePrincipalSecret(Output.of(servicePrincipalSecret));
        }

        public KeyVaultCredentialSettingsArgs build() {
            return $;
        }
    }

}
