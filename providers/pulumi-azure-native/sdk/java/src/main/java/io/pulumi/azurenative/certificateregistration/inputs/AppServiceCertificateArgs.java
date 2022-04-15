// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Key Vault container for a certificate that is purchased through Azure.
 * 
 */
public final class AppServiceCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppServiceCertificateArgs Empty = new AppServiceCertificateArgs();

    /**
     * Key Vault resource Id.
     * 
     */
    @Import(name="keyVaultId")
      private final @Nullable Output<String> keyVaultId;

    public Output<String> keyVaultId() {
        return this.keyVaultId == null ? Codegen.empty() : this.keyVaultId;
    }

    /**
     * Key Vault secret name.
     * 
     */
    @Import(name="keyVaultSecretName")
      private final @Nullable Output<String> keyVaultSecretName;

    public Output<String> keyVaultSecretName() {
        return this.keyVaultSecretName == null ? Codegen.empty() : this.keyVaultSecretName;
    }

    public AppServiceCertificateArgs(
        @Nullable Output<String> keyVaultId,
        @Nullable Output<String> keyVaultSecretName) {
        this.keyVaultId = keyVaultId;
        this.keyVaultSecretName = keyVaultSecretName;
    }

    private AppServiceCertificateArgs() {
        this.keyVaultId = Codegen.empty();
        this.keyVaultSecretName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppServiceCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyVaultId;
        private @Nullable Output<String> keyVaultSecretName;

        public Builder() {
    	      // Empty
        }

        public Builder(AppServiceCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultSecretName = defaults.keyVaultSecretName;
        }

        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }
        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = Codegen.ofNullable(keyVaultId);
            return this;
        }
        public Builder keyVaultSecretName(@Nullable Output<String> keyVaultSecretName) {
            this.keyVaultSecretName = keyVaultSecretName;
            return this;
        }
        public Builder keyVaultSecretName(@Nullable String keyVaultSecretName) {
            this.keyVaultSecretName = Codegen.ofNullable(keyVaultSecretName);
            return this;
        }        public AppServiceCertificateArgs build() {
            return new AppServiceCertificateArgs(keyVaultId, keyVaultSecretName);
        }
    }
}
