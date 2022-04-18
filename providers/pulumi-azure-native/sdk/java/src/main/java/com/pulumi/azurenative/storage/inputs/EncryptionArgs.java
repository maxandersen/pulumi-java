// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.enums.KeySource;
import com.pulumi.azurenative.storage.inputs.EncryptionIdentityArgs;
import com.pulumi.azurenative.storage.inputs.EncryptionServicesArgs;
import com.pulumi.azurenative.storage.inputs.KeyVaultPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The encryption settings on the storage account.
 * 
 */
public final class EncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionArgs Empty = new EncryptionArgs();

    /**
     * The identity to be used with service-side encryption at rest.
     * 
     */
    @Import(name="encryptionIdentity")
      private final @Nullable Output<EncryptionIdentityArgs> encryptionIdentity;

    public Output<EncryptionIdentityArgs> encryptionIdentity() {
        return this.encryptionIdentity == null ? Codegen.empty() : this.encryptionIdentity;
    }

    /**
     * The encryption keySource (provider). Possible values (case-insensitive):  Microsoft.Storage, Microsoft.Keyvault
     * 
     */
    @Import(name="keySource", required=true)
      private final Output<Either<String,KeySource>> keySource;

    public Output<Either<String,KeySource>> keySource() {
        return this.keySource;
    }

    /**
     * Properties provided by key vault.
     * 
     */
    @Import(name="keyVaultProperties")
      private final @Nullable Output<KeyVaultPropertiesArgs> keyVaultProperties;

    public Output<KeyVaultPropertiesArgs> keyVaultProperties() {
        return this.keyVaultProperties == null ? Codegen.empty() : this.keyVaultProperties;
    }

    /**
     * A boolean indicating whether or not the service applies a secondary layer of encryption with platform managed keys for data at rest.
     * 
     */
    @Import(name="requireInfrastructureEncryption")
      private final @Nullable Output<Boolean> requireInfrastructureEncryption;

    public Output<Boolean> requireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption == null ? Codegen.empty() : this.requireInfrastructureEncryption;
    }

    /**
     * List of services which support encryption.
     * 
     */
    @Import(name="services")
      private final @Nullable Output<EncryptionServicesArgs> services;

    public Output<EncryptionServicesArgs> services() {
        return this.services == null ? Codegen.empty() : this.services;
    }

    public EncryptionArgs(
        @Nullable Output<EncryptionIdentityArgs> encryptionIdentity,
        Output<Either<String,KeySource>> keySource,
        @Nullable Output<KeyVaultPropertiesArgs> keyVaultProperties,
        @Nullable Output<Boolean> requireInfrastructureEncryption,
        @Nullable Output<EncryptionServicesArgs> services) {
        this.encryptionIdentity = encryptionIdentity;
        this.keySource = keySource == null ? Output.ofLeft("Microsoft.Storage") : Objects.requireNonNull(keySource, "expected parameter 'keySource' to be non-null");
        this.keyVaultProperties = keyVaultProperties;
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        this.services = services;
    }

    private EncryptionArgs() {
        this.encryptionIdentity = Codegen.empty();
        this.keySource = Codegen.empty();
        this.keyVaultProperties = Codegen.empty();
        this.requireInfrastructureEncryption = Codegen.empty();
        this.services = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EncryptionIdentityArgs> encryptionIdentity;
        private Output<Either<String,KeySource>> keySource;
        private @Nullable Output<KeyVaultPropertiesArgs> keyVaultProperties;
        private @Nullable Output<Boolean> requireInfrastructureEncryption;
        private @Nullable Output<EncryptionServicesArgs> services;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionIdentity = defaults.encryptionIdentity;
    	      this.keySource = defaults.keySource;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.requireInfrastructureEncryption = defaults.requireInfrastructureEncryption;
    	      this.services = defaults.services;
        }

        public Builder encryptionIdentity(@Nullable Output<EncryptionIdentityArgs> encryptionIdentity) {
            this.encryptionIdentity = encryptionIdentity;
            return this;
        }
        public Builder encryptionIdentity(@Nullable EncryptionIdentityArgs encryptionIdentity) {
            this.encryptionIdentity = Codegen.ofNullable(encryptionIdentity);
            return this;
        }
        public Builder keySource(Output<Either<String,KeySource>> keySource) {
            this.keySource = Objects.requireNonNull(keySource);
            return this;
        }
        public Builder keySource(Either<String,KeySource> keySource) {
            this.keySource = Output.of(Objects.requireNonNull(keySource));
            return this;
        }
        public Builder keyVaultProperties(@Nullable Output<KeyVaultPropertiesArgs> keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }
        public Builder keyVaultProperties(@Nullable KeyVaultPropertiesArgs keyVaultProperties) {
            this.keyVaultProperties = Codegen.ofNullable(keyVaultProperties);
            return this;
        }
        public Builder requireInfrastructureEncryption(@Nullable Output<Boolean> requireInfrastructureEncryption) {
            this.requireInfrastructureEncryption = requireInfrastructureEncryption;
            return this;
        }
        public Builder requireInfrastructureEncryption(@Nullable Boolean requireInfrastructureEncryption) {
            this.requireInfrastructureEncryption = Codegen.ofNullable(requireInfrastructureEncryption);
            return this;
        }
        public Builder services(@Nullable Output<EncryptionServicesArgs> services) {
            this.services = services;
            return this;
        }
        public Builder services(@Nullable EncryptionServicesArgs services) {
            this.services = Codegen.ofNullable(services);
            return this;
        }        public EncryptionArgs build() {
            return new EncryptionArgs(encryptionIdentity, keySource, keyVaultProperties, requireInfrastructureEncryption, services);
        }
    }
}
