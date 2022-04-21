// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmenEncryptionKeyReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption configuration for the integration service environment.
 * 
 */
public final class IntegrationServiceEnvironmenEncryptionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceEnvironmenEncryptionConfigurationArgs Empty = new IntegrationServiceEnvironmenEncryptionConfigurationArgs();

    /**
     * The encryption key reference.
     * 
     */
    @Import(name="encryptionKeyReference")
    private @Nullable Output<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> encryptionKeyReference;

    public Optional<Output<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs>> encryptionKeyReference() {
        return Optional.ofNullable(this.encryptionKeyReference);
    }

    private IntegrationServiceEnvironmenEncryptionConfigurationArgs() {}

    private IntegrationServiceEnvironmenEncryptionConfigurationArgs(IntegrationServiceEnvironmenEncryptionConfigurationArgs $) {
        this.encryptionKeyReference = $.encryptionKeyReference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationServiceEnvironmenEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationServiceEnvironmenEncryptionConfigurationArgs $;

        public Builder() {
            $ = new IntegrationServiceEnvironmenEncryptionConfigurationArgs();
        }

        public Builder(IntegrationServiceEnvironmenEncryptionConfigurationArgs defaults) {
            $ = new IntegrationServiceEnvironmenEncryptionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder encryptionKeyReference(@Nullable Output<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> encryptionKeyReference) {
            $.encryptionKeyReference = encryptionKeyReference;
            return this;
        }

        public Builder encryptionKeyReference(IntegrationServiceEnvironmenEncryptionKeyReferenceArgs encryptionKeyReference) {
            return encryptionKeyReference(Output.of(encryptionKeyReference));
        }

        public IntegrationServiceEnvironmenEncryptionConfigurationArgs build() {
            return $;
        }
    }

}
