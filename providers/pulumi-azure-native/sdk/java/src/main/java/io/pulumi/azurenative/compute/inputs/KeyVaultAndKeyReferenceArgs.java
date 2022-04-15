// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SourceVaultArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Key Vault Key Url and vault id of KeK, KeK is optional and when provided is used to unwrap the encryptionKey
 * 
 */
public final class KeyVaultAndKeyReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultAndKeyReferenceArgs Empty = new KeyVaultAndKeyReferenceArgs();

    /**
     * Url pointing to a key or secret in KeyVault
     * 
     */
    @Import(name="keyUrl", required=true)
      private final Output<String> keyUrl;

    public Output<String> keyUrl() {
        return this.keyUrl;
    }

    /**
     * Resource id of the KeyVault containing the key or secret
     * 
     */
    @Import(name="sourceVault", required=true)
      private final Output<SourceVaultArgs> sourceVault;

    public Output<SourceVaultArgs> sourceVault() {
        return this.sourceVault;
    }

    public KeyVaultAndKeyReferenceArgs(
        Output<String> keyUrl,
        Output<SourceVaultArgs> sourceVault) {
        this.keyUrl = Objects.requireNonNull(keyUrl, "expected parameter 'keyUrl' to be non-null");
        this.sourceVault = Objects.requireNonNull(sourceVault, "expected parameter 'sourceVault' to be non-null");
    }

    private KeyVaultAndKeyReferenceArgs() {
        this.keyUrl = Codegen.empty();
        this.sourceVault = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultAndKeyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyUrl;
        private Output<SourceVaultArgs> sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultAndKeyReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder keyUrl(Output<String> keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }
        public Builder keyUrl(String keyUrl) {
            this.keyUrl = Output.of(Objects.requireNonNull(keyUrl));
            return this;
        }
        public Builder sourceVault(Output<SourceVaultArgs> sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }
        public Builder sourceVault(SourceVaultArgs sourceVault) {
            this.sourceVault = Output.of(Objects.requireNonNull(sourceVault));
            return this;
        }        public KeyVaultAndKeyReferenceArgs build() {
            return new KeyVaultAndKeyReferenceArgs(keyUrl, sourceVault);
        }
    }
}
