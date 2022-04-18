// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecretArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretArgs Empty = new GetSecretArgs();

    /**
     * The name of the Resource Group to which the vault belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the secret.
     * 
     */
    @Import(name="secretName", required=true)
      private final String secretName;

    public String secretName() {
        return this.secretName;
    }

    /**
     * The name of the vault.
     * 
     */
    @Import(name="vaultName", required=true)
      private final String vaultName;

    public String vaultName() {
        return this.vaultName;
    }

    public GetSecretArgs(
        String resourceGroupName,
        String secretName,
        String vaultName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private GetSecretArgs() {
        this.resourceGroupName = null;
        this.secretName = null;
        this.vaultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String secretName;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secretName = defaults.secretName;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public Builder vaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }        public GetSecretArgs build() {
            return new GetSecretArgs(resourceGroupName, secretName, vaultName);
        }
    }
}
