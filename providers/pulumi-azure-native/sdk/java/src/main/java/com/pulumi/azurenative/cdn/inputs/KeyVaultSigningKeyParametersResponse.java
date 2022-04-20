// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the parameters for using a user&#39;s KeyVault for URL Signing Key.
 * 
 */
public final class KeyVaultSigningKeyParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultSigningKeyParametersResponse Empty = new KeyVaultSigningKeyParametersResponse();

    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * Resource group of the user&#39;s Key Vault containing the secret
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of secret in Key Vault.
     * 
     */
    @Import(name="secretName", required=true)
      private final String secretName;

    public String secretName() {
        return this.secretName;
    }

    /**
     * The version(GUID) of secret in Key Vault.
     * 
     */
    @Import(name="secretVersion", required=true)
      private final String secretVersion;

    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Subscription Id of the user&#39;s Key Vault containing the secret
     * 
     */
    @Import(name="subscriptionId", required=true)
      private final String subscriptionId;

    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The name of the user&#39;s Key Vault containing the secret
     * 
     */
    @Import(name="vaultName", required=true)
      private final String vaultName;

    public String vaultName() {
        return this.vaultName;
    }

    public KeyVaultSigningKeyParametersResponse(
        String odataType,
        String resourceGroupName,
        String secretName,
        String secretVersion,
        String subscriptionId,
        String vaultName) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
        this.secretVersion = Objects.requireNonNull(secretVersion, "expected parameter 'secretVersion' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private KeyVaultSigningKeyParametersResponse() {
        this.odataType = null;
        this.resourceGroupName = null;
        this.secretName = null;
        this.secretVersion = null;
        this.subscriptionId = null;
        this.vaultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultSigningKeyParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String resourceGroupName;
        private String secretName;
        private String secretVersion;
        private String subscriptionId;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultSigningKeyParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public Builder secretVersion(String secretVersion) {
            this.secretVersion = Objects.requireNonNull(secretVersion);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder vaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }        public KeyVaultSigningKeyParametersResponse build() {
            return new KeyVaultSigningKeyParametersResponse(odataType, resourceGroupName, secretName, secretVersion, subscriptionId, vaultName);
        }
    }
}
