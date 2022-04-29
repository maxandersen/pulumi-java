// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.enums.KekType;
import com.pulumi.azurenative.databox.inputs.IdentityPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption key containing details about key to encrypt different keys.
 * 
 */
public final class KeyEncryptionKeyArgs extends ResourceArgs {

    public static final KeyEncryptionKeyArgs Empty = new KeyEncryptionKeyArgs();

    /**
     * Managed identity properties used for key encryption.
     * 
     */
    @Import(name="identityProperties")
    private @Nullable Output<IdentityPropertiesArgs> identityProperties;

    /**
     * @return Managed identity properties used for key encryption.
     * 
     */
    public Optional<Output<IdentityPropertiesArgs>> identityProperties() {
        return Optional.ofNullable(this.identityProperties);
    }

    /**
     * Type of encryption key used for key encryption.
     * 
     */
    @Import(name="kekType", required=true)
    private Output<Either<String,KekType>> kekType;

    /**
     * @return Type of encryption key used for key encryption.
     * 
     */
    public Output<Either<String,KekType>> kekType() {
        return this.kekType;
    }

    /**
     * Key encryption key. It is required in case of Customer managed KekType.
     * 
     */
    @Import(name="kekUrl")
    private @Nullable Output<String> kekUrl;

    /**
     * @return Key encryption key. It is required in case of Customer managed KekType.
     * 
     */
    public Optional<Output<String>> kekUrl() {
        return Optional.ofNullable(this.kekUrl);
    }

    /**
     * Kek vault resource id. It is required in case of Customer managed KekType.
     * 
     */
    @Import(name="kekVaultResourceID")
    private @Nullable Output<String> kekVaultResourceID;

    /**
     * @return Kek vault resource id. It is required in case of Customer managed KekType.
     * 
     */
    public Optional<Output<String>> kekVaultResourceID() {
        return Optional.ofNullable(this.kekVaultResourceID);
    }

    private KeyEncryptionKeyArgs() {}

    private KeyEncryptionKeyArgs(KeyEncryptionKeyArgs $) {
        this.identityProperties = $.identityProperties;
        this.kekType = $.kekType;
        this.kekUrl = $.kekUrl;
        this.kekVaultResourceID = $.kekVaultResourceID;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyEncryptionKeyArgs $;

        public Builder() {
            $ = new KeyEncryptionKeyArgs();
        }

        public Builder(KeyEncryptionKeyArgs defaults) {
            $ = new KeyEncryptionKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityProperties Managed identity properties used for key encryption.
         * 
         * @return builder
         * 
         */
        public Builder identityProperties(@Nullable Output<IdentityPropertiesArgs> identityProperties) {
            $.identityProperties = identityProperties;
            return this;
        }

        /**
         * @param identityProperties Managed identity properties used for key encryption.
         * 
         * @return builder
         * 
         */
        public Builder identityProperties(IdentityPropertiesArgs identityProperties) {
            return identityProperties(Output.of(identityProperties));
        }

        /**
         * @param kekType Type of encryption key used for key encryption.
         * 
         * @return builder
         * 
         */
        public Builder kekType(Output<Either<String,KekType>> kekType) {
            $.kekType = kekType;
            return this;
        }

        /**
         * @param kekType Type of encryption key used for key encryption.
         * 
         * @return builder
         * 
         */
        public Builder kekType(Either<String,KekType> kekType) {
            return kekType(Output.of(kekType));
        }

        /**
         * @param kekType Type of encryption key used for key encryption.
         * 
         * @return builder
         * 
         */
        public Builder kekType(String kekType) {
            return kekType(Either.ofLeft(kekType));
        }

        /**
         * @param kekType Type of encryption key used for key encryption.
         * 
         * @return builder
         * 
         */
        public Builder kekType(KekType kekType) {
            return kekType(Either.ofRight(kekType));
        }

        /**
         * @param kekUrl Key encryption key. It is required in case of Customer managed KekType.
         * 
         * @return builder
         * 
         */
        public Builder kekUrl(@Nullable Output<String> kekUrl) {
            $.kekUrl = kekUrl;
            return this;
        }

        /**
         * @param kekUrl Key encryption key. It is required in case of Customer managed KekType.
         * 
         * @return builder
         * 
         */
        public Builder kekUrl(String kekUrl) {
            return kekUrl(Output.of(kekUrl));
        }

        /**
         * @param kekVaultResourceID Kek vault resource id. It is required in case of Customer managed KekType.
         * 
         * @return builder
         * 
         */
        public Builder kekVaultResourceID(@Nullable Output<String> kekVaultResourceID) {
            $.kekVaultResourceID = kekVaultResourceID;
            return this;
        }

        /**
         * @param kekVaultResourceID Kek vault resource id. It is required in case of Customer managed KekType.
         * 
         * @return builder
         * 
         */
        public Builder kekVaultResourceID(String kekVaultResourceID) {
            return kekVaultResourceID(Output.of(kekVaultResourceID));
        }

        public KeyEncryptionKeyArgs build() {
            $.kekType = Codegen.stringProp("kekType").left(KekType.class).output().arg($.kekType).def("MicrosoftManaged").require();
            return $;
        }
    }

}
