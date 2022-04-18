// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.inputs;

import com.pulumi.azurenative.databricks.enums.KeySource;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The object that contains details of encryption used on the workspace.
 * 
 */
public final class EncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionArgs Empty = new EncryptionArgs();

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
     * The encryption keySource (provider). Possible values (case-insensitive):  Default, Microsoft.Keyvault
     * 
     */
    @Import(name="keySource")
      private final @Nullable Output<Either<String,KeySource>> keySource;

    public Output<Either<String,KeySource>> keySource() {
        return this.keySource == null ? Codegen.empty() : this.keySource;
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

    public EncryptionArgs(
        @Nullable Output<String> keyName,
        @Nullable Output<Either<String,KeySource>> keySource,
        @Nullable Output<String> keyVaultUri,
        @Nullable Output<String> keyVersion) {
        this.keyName = keyName;
        this.keySource = keySource == null ? Output.ofLeft("Default") : keySource;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    private EncryptionArgs() {
        this.keyName = Codegen.empty();
        this.keySource = Codegen.empty();
        this.keyVaultUri = Codegen.empty();
        this.keyVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyName;
        private @Nullable Output<Either<String,KeySource>> keySource;
        private @Nullable Output<String> keyVaultUri;
        private @Nullable Output<String> keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keySource = defaults.keySource;
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
        public Builder keySource(@Nullable Output<Either<String,KeySource>> keySource) {
            this.keySource = keySource;
            return this;
        }
        public Builder keySource(@Nullable Either<String,KeySource> keySource) {
            this.keySource = Codegen.ofNullable(keySource);
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
        }        public EncryptionArgs build() {
            return new EncryptionArgs(keyName, keySource, keyVaultUri, keyVersion);
        }
    }
}
