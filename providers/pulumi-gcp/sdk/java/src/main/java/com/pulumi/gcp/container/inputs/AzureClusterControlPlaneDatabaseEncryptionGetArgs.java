// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AzureClusterControlPlaneDatabaseEncryptionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureClusterControlPlaneDatabaseEncryptionGetArgs Empty = new AzureClusterControlPlaneDatabaseEncryptionGetArgs();

    /**
     * The ARM ID of the Azure Key Vault key to encrypt / decrypt data. For example: `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;` Encryption will always take the latest version of the key and hence specific version is not supported.
     * 
     */
    @Import(name="keyId", required=true)
    private Output<String> keyId;

    public Output<String> keyId() {
        return this.keyId;
    }

    private AzureClusterControlPlaneDatabaseEncryptionGetArgs() {}

    private AzureClusterControlPlaneDatabaseEncryptionGetArgs(AzureClusterControlPlaneDatabaseEncryptionGetArgs $) {
        this.keyId = $.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureClusterControlPlaneDatabaseEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureClusterControlPlaneDatabaseEncryptionGetArgs $;

        public Builder() {
            $ = new AzureClusterControlPlaneDatabaseEncryptionGetArgs();
        }

        public Builder(AzureClusterControlPlaneDatabaseEncryptionGetArgs defaults) {
            $ = new AzureClusterControlPlaneDatabaseEncryptionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyId(Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        public AzureClusterControlPlaneDatabaseEncryptionGetArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            return $;
        }
    }

}
