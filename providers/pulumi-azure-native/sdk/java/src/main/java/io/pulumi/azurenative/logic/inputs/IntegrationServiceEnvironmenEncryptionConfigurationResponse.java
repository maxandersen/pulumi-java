// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmenEncryptionKeyReferenceResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption configuration for the integration service environment.
 * 
 */
public final class IntegrationServiceEnvironmenEncryptionConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationServiceEnvironmenEncryptionConfigurationResponse Empty = new IntegrationServiceEnvironmenEncryptionConfigurationResponse();

    /**
     * The encryption key reference.
     * 
     */
    @Import(name="encryptionKeyReference")
      private final @Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceResponse encryptionKeyReference;

    public Optional<IntegrationServiceEnvironmenEncryptionKeyReferenceResponse> encryptionKeyReference() {
        return this.encryptionKeyReference == null ? Optional.empty() : Optional.ofNullable(this.encryptionKeyReference);
    }

    public IntegrationServiceEnvironmenEncryptionConfigurationResponse(@Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceResponse encryptionKeyReference) {
        this.encryptionKeyReference = encryptionKeyReference;
    }

    private IntegrationServiceEnvironmenEncryptionConfigurationResponse() {
        this.encryptionKeyReference = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmenEncryptionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceResponse encryptionKeyReference;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmenEncryptionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionKeyReference = defaults.encryptionKeyReference;
        }

        public Builder encryptionKeyReference(@Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceResponse encryptionKeyReference) {
            this.encryptionKeyReference = encryptionKeyReference;
            return this;
        }        public IntegrationServiceEnvironmenEncryptionConfigurationResponse build() {
            return new IntegrationServiceEnvironmenEncryptionConfigurationResponse(encryptionKeyReference);
        }
    }
}
