// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AzureClusterControlPlaneDatabaseEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureClusterControlPlaneDatabaseEncryptionArgs Empty = new AzureClusterControlPlaneDatabaseEncryptionArgs();

    /**
     * The ARM ID of the Azure Key Vault key to encrypt / decrypt data. For example: `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;` Encryption will always take the latest version of the key and hence specific version is not supported.
     * 
     */
    @Import(name="keyId", required=true)
      private final Output<String> keyId;

    public Output<String> keyId() {
        return this.keyId;
    }

    public AzureClusterControlPlaneDatabaseEncryptionArgs(Output<String> keyId) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
    }

    private AzureClusterControlPlaneDatabaseEncryptionArgs() {
        this.keyId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneDatabaseEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterControlPlaneDatabaseEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        public Builder keyId(Output<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder keyId(String keyId) {
            this.keyId = Output.of(Objects.requireNonNull(keyId));
            return this;
        }        public AzureClusterControlPlaneDatabaseEncryptionArgs build() {
            return new AzureClusterControlPlaneDatabaseEncryptionArgs(keyId);
        }
    }
}
