// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configure your SQL virtual machine to be able to connect to the Azure Key Vault service.
 * 
 */
public final class KeyVaultCredentialSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultCredentialSettingsResponse Empty = new KeyVaultCredentialSettingsResponse();

    /**
     * Azure Key Vault url.
     * 
     */
    @Import(name="azureKeyVaultUrl")
      private final @Nullable String azureKeyVaultUrl;

    public Optional<String> azureKeyVaultUrl() {
        return this.azureKeyVaultUrl == null ? Optional.empty() : Optional.ofNullable(this.azureKeyVaultUrl);
    }

    /**
     * Credential name.
     * 
     */
    @Import(name="credentialName")
      private final @Nullable String credentialName;

    public Optional<String> credentialName() {
        return this.credentialName == null ? Optional.empty() : Optional.ofNullable(this.credentialName);
    }

    /**
     * Enable or disable key vault credential setting.
     * 
     */
    @Import(name="enable")
      private final @Nullable Boolean enable;

    public Optional<Boolean> enable() {
        return this.enable == null ? Optional.empty() : Optional.ofNullable(this.enable);
    }

    /**
     * Service principal name to access key vault.
     * 
     */
    @Import(name="servicePrincipalName")
      private final @Nullable String servicePrincipalName;

    public Optional<String> servicePrincipalName() {
        return this.servicePrincipalName == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalName);
    }

    public KeyVaultCredentialSettingsResponse(
        @Nullable String azureKeyVaultUrl,
        @Nullable String credentialName,
        @Nullable Boolean enable,
        @Nullable String servicePrincipalName) {
        this.azureKeyVaultUrl = azureKeyVaultUrl;
        this.credentialName = credentialName;
        this.enable = enable;
        this.servicePrincipalName = servicePrincipalName;
    }

    private KeyVaultCredentialSettingsResponse() {
        this.azureKeyVaultUrl = null;
        this.credentialName = null;
        this.enable = null;
        this.servicePrincipalName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultCredentialSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azureKeyVaultUrl;
        private @Nullable String credentialName;
        private @Nullable Boolean enable;
        private @Nullable String servicePrincipalName;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultCredentialSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureKeyVaultUrl = defaults.azureKeyVaultUrl;
    	      this.credentialName = defaults.credentialName;
    	      this.enable = defaults.enable;
    	      this.servicePrincipalName = defaults.servicePrincipalName;
        }

        public Builder azureKeyVaultUrl(@Nullable String azureKeyVaultUrl) {
            this.azureKeyVaultUrl = azureKeyVaultUrl;
            return this;
        }
        public Builder credentialName(@Nullable String credentialName) {
            this.credentialName = credentialName;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Builder servicePrincipalName(@Nullable String servicePrincipalName) {
            this.servicePrincipalName = servicePrincipalName;
            return this;
        }        public KeyVaultCredentialSettingsResponse build() {
            return new KeyVaultCredentialSettingsResponse(azureKeyVaultUrl, credentialName, enable, servicePrincipalName);
        }
    }
}
