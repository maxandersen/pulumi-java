// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.CMKIdentityDefinitionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of CMK for the factory.
 * 
 */
public final class EncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigurationArgs Empty = new EncryptionConfigurationArgs();

    /**
     * User assigned identity to use to authenticate to customer's key vault. If not provided Managed Service Identity will be used.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<CMKIdentityDefinitionArgs> identity;

    public Output<CMKIdentityDefinitionArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The name of the key in Azure Key Vault to use as Customer Managed Key.
     * 
     */
    @Import(name="keyName", required=true)
      private final Output<String> keyName;

    public Output<String> keyName() {
        return this.keyName;
    }

    /**
     * The version of the key used for CMK. If not provided, latest version will be used.
     * 
     */
    @Import(name="keyVersion")
      private final @Nullable Output<String> keyVersion;

    public Output<String> keyVersion() {
        return this.keyVersion == null ? Codegen.empty() : this.keyVersion;
    }

    /**
     * The url of the Azure Key Vault used for CMK.
     * 
     */
    @Import(name="vaultBaseUrl", required=true)
      private final Output<String> vaultBaseUrl;

    public Output<String> vaultBaseUrl() {
        return this.vaultBaseUrl;
    }

    public EncryptionConfigurationArgs(
        @Nullable Output<CMKIdentityDefinitionArgs> identity,
        Output<String> keyName,
        @Nullable Output<String> keyVersion,
        Output<String> vaultBaseUrl) {
        this.identity = identity;
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.keyVersion = keyVersion;
        this.vaultBaseUrl = Objects.requireNonNull(vaultBaseUrl, "expected parameter 'vaultBaseUrl' to be non-null");
    }

    private EncryptionConfigurationArgs() {
        this.identity = Codegen.empty();
        this.keyName = Codegen.empty();
        this.keyVersion = Codegen.empty();
        this.vaultBaseUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CMKIdentityDefinitionArgs> identity;
        private Output<String> keyName;
        private @Nullable Output<String> keyVersion;
        private Output<String> vaultBaseUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keyName = defaults.keyName;
    	      this.keyVersion = defaults.keyVersion;
    	      this.vaultBaseUrl = defaults.vaultBaseUrl;
        }

        public Builder identity(@Nullable Output<CMKIdentityDefinitionArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable CMKIdentityDefinitionArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder keyName(Output<String> keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder keyName(String keyName) {
            this.keyName = Output.of(Objects.requireNonNull(keyName));
            return this;
        }
        public Builder keyVersion(@Nullable Output<String> keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }
        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = Codegen.ofNullable(keyVersion);
            return this;
        }
        public Builder vaultBaseUrl(Output<String> vaultBaseUrl) {
            this.vaultBaseUrl = Objects.requireNonNull(vaultBaseUrl);
            return this;
        }
        public Builder vaultBaseUrl(String vaultBaseUrl) {
            this.vaultBaseUrl = Output.of(Objects.requireNonNull(vaultBaseUrl));
            return this;
        }        public EncryptionConfigurationArgs build() {
            return new EncryptionConfigurationArgs(identity, keyName, keyVersion, vaultBaseUrl);
        }
    }
}
