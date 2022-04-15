// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmenEncryptionKeyReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The encryption configuration for the integration service environment.
 * 
 */
public final class IntegrationServiceEnvironmenEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceEnvironmenEncryptionConfigurationArgs Empty = new IntegrationServiceEnvironmenEncryptionConfigurationArgs();

    /**
     * The encryption key reference.
     * 
     */
    @Import(name="encryptionKeyReference")
      private final @Nullable Output<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> encryptionKeyReference;

    public Output<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> encryptionKeyReference() {
        return this.encryptionKeyReference == null ? Codegen.empty() : this.encryptionKeyReference;
    }

    public IntegrationServiceEnvironmenEncryptionConfigurationArgs(@Nullable Output<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> encryptionKeyReference) {
        this.encryptionKeyReference = encryptionKeyReference;
    }

    private IntegrationServiceEnvironmenEncryptionConfigurationArgs() {
        this.encryptionKeyReference = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmenEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> encryptionKeyReference;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmenEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionKeyReference = defaults.encryptionKeyReference;
        }

        public Builder encryptionKeyReference(@Nullable Output<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> encryptionKeyReference) {
            this.encryptionKeyReference = encryptionKeyReference;
            return this;
        }
        public Builder encryptionKeyReference(@Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceArgs encryptionKeyReference) {
            this.encryptionKeyReference = Codegen.ofNullable(encryptionKeyReference);
            return this;
        }        public IntegrationServiceEnvironmenEncryptionConfigurationArgs build() {
            return new IntegrationServiceEnvironmenEncryptionConfigurationArgs(encryptionKeyReference);
        }
    }
}
