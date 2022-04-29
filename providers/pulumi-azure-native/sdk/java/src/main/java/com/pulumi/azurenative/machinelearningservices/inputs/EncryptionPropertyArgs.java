// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.enums.EncryptionStatus;
import com.pulumi.azurenative.machinelearningservices.inputs.IdentityForCmkArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.KeyVaultPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionPropertyArgs extends ResourceArgs {

    public static final EncryptionPropertyArgs Empty = new EncryptionPropertyArgs();

    /**
     * The identity that will be used to access the key vault for encryption at rest.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<IdentityForCmkArgs> identity;

    /**
     * @return The identity that will be used to access the key vault for encryption at rest.
     * 
     */
    public Optional<Output<IdentityForCmkArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Customer Key vault properties.
     * 
     */
    @Import(name="keyVaultProperties", required=true)
    private Output<KeyVaultPropertiesArgs> keyVaultProperties;

    /**
     * @return Customer Key vault properties.
     * 
     */
    public Output<KeyVaultPropertiesArgs> keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Indicates whether or not the encryption is enabled for the workspace.
     * 
     */
    @Import(name="status", required=true)
    private Output<Either<String,EncryptionStatus>> status;

    /**
     * @return Indicates whether or not the encryption is enabled for the workspace.
     * 
     */
    public Output<Either<String,EncryptionStatus>> status() {
        return this.status;
    }

    private EncryptionPropertyArgs() {}

    private EncryptionPropertyArgs(EncryptionPropertyArgs $) {
        this.identity = $.identity;
        this.keyVaultProperties = $.keyVaultProperties;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionPropertyArgs $;

        public Builder() {
            $ = new EncryptionPropertyArgs();
        }

        public Builder(EncryptionPropertyArgs defaults) {
            $ = new EncryptionPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identity The identity that will be used to access the key vault for encryption at rest.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<IdentityForCmkArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The identity that will be used to access the key vault for encryption at rest.
         * 
         * @return builder
         * 
         */
        public Builder identity(IdentityForCmkArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param keyVaultProperties Customer Key vault properties.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultProperties(Output<KeyVaultPropertiesArgs> keyVaultProperties) {
            $.keyVaultProperties = keyVaultProperties;
            return this;
        }

        /**
         * @param keyVaultProperties Customer Key vault properties.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultProperties(KeyVaultPropertiesArgs keyVaultProperties) {
            return keyVaultProperties(Output.of(keyVaultProperties));
        }

        /**
         * @param status Indicates whether or not the encryption is enabled for the workspace.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<Either<String,EncryptionStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Indicates whether or not the encryption is enabled for the workspace.
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,EncryptionStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status Indicates whether or not the encryption is enabled for the workspace.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status Indicates whether or not the encryption is enabled for the workspace.
         * 
         * @return builder
         * 
         */
        public Builder status(EncryptionStatus status) {
            return status(Either.ofRight(status));
        }

        public EncryptionPropertyArgs build() {
            $.keyVaultProperties = Objects.requireNonNull($.keyVaultProperties, "expected parameter 'keyVaultProperties' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
