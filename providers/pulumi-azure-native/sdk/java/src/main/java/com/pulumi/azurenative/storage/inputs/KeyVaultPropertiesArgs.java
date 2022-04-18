// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of key vault.
 * 
 */
public final class KeyVaultPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyVaultPropertiesArgs Empty = new KeyVaultPropertiesArgs();

    /**
     * The name of KeyVault key.
     * 
     */
    @Import(name="keyName")
      private final @Nullable Output<String> keyName;

    public Output<String> keyName() {
        return this.keyName == null ? Codegen.empty() : this.keyName;
    }

    /**
     * The Uri of KeyVault.
     * 
     */
    @Import(name="keyVaultUri")
      private final @Nullable Output<String> keyVaultUri;

    public Output<String> keyVaultUri() {
        return this.keyVaultUri == null ? Codegen.empty() : this.keyVaultUri;
    }

    /**
     * The version of KeyVault key.
     * 
     */
    @Import(name="keyVersion")
      private final @Nullable Output<String> keyVersion;

    public Output<String> keyVersion() {
        return this.keyVersion == null ? Codegen.empty() : this.keyVersion;
    }

    public KeyVaultPropertiesArgs(
        @Nullable Output<String> keyName,
        @Nullable Output<String> keyVaultUri,
        @Nullable Output<String> keyVersion) {
        this.keyName = keyName;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    private KeyVaultPropertiesArgs() {
        this.keyName = Codegen.empty();
        this.keyVaultUri = Codegen.empty();
        this.keyVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyName;
        private @Nullable Output<String> keyVaultUri;
        private @Nullable Output<String> keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder keyName(@Nullable Output<String> keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keyName(@Nullable String keyName) {
            this.keyName = Codegen.ofNullable(keyName);
            return this;
        }
        public Builder keyVaultUri(@Nullable Output<String> keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }
        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = Codegen.ofNullable(keyVaultUri);
            return this;
        }
        public Builder keyVersion(@Nullable Output<String> keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }
        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = Codegen.ofNullable(keyVersion);
            return this;
        }        public KeyVaultPropertiesArgs build() {
            return new KeyVaultPropertiesArgs(keyName, keyVaultUri, keyVersion);
        }
    }
}
