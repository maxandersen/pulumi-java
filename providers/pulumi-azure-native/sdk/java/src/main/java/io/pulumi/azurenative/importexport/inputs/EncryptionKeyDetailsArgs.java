// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.azurenative.importexport.enums.EncryptionKekType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the encryption key properties
 * 
 */
public final class EncryptionKeyDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionKeyDetailsArgs Empty = new EncryptionKeyDetailsArgs();

    /**
     * The type of kek encryption key
     * 
     */
    @Import(name="kekType")
      private final @Nullable Output<Either<String,EncryptionKekType>> kekType;

    public Output<Either<String,EncryptionKekType>> kekType() {
        return this.kekType == null ? Codegen.empty() : this.kekType;
    }

    /**
     * Specifies the url for kek encryption key.
     * 
     */
    @Import(name="kekUrl")
      private final @Nullable Output<String> kekUrl;

    public Output<String> kekUrl() {
        return this.kekUrl == null ? Codegen.empty() : this.kekUrl;
    }

    /**
     * Specifies the keyvault resource id for kek encryption key.
     * 
     */
    @Import(name="kekVaultResourceID")
      private final @Nullable Output<String> kekVaultResourceID;

    public Output<String> kekVaultResourceID() {
        return this.kekVaultResourceID == null ? Codegen.empty() : this.kekVaultResourceID;
    }

    public EncryptionKeyDetailsArgs(
        @Nullable Output<Either<String,EncryptionKekType>> kekType,
        @Nullable Output<String> kekUrl,
        @Nullable Output<String> kekVaultResourceID) {
        this.kekType = kekType == null ? Output.ofLeft("MicrosoftManaged") : kekType;
        this.kekUrl = kekUrl;
        this.kekVaultResourceID = kekVaultResourceID;
    }

    private EncryptionKeyDetailsArgs() {
        this.kekType = Codegen.empty();
        this.kekUrl = Codegen.empty();
        this.kekVaultResourceID = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionKeyDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,EncryptionKekType>> kekType;
        private @Nullable Output<String> kekUrl;
        private @Nullable Output<String> kekVaultResourceID;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionKeyDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kekType = defaults.kekType;
    	      this.kekUrl = defaults.kekUrl;
    	      this.kekVaultResourceID = defaults.kekVaultResourceID;
        }

        public Builder kekType(@Nullable Output<Either<String,EncryptionKekType>> kekType) {
            this.kekType = kekType;
            return this;
        }
        public Builder kekType(@Nullable Either<String,EncryptionKekType> kekType) {
            this.kekType = Codegen.ofNullable(kekType);
            return this;
        }
        public Builder kekUrl(@Nullable Output<String> kekUrl) {
            this.kekUrl = kekUrl;
            return this;
        }
        public Builder kekUrl(@Nullable String kekUrl) {
            this.kekUrl = Codegen.ofNullable(kekUrl);
            return this;
        }
        public Builder kekVaultResourceID(@Nullable Output<String> kekVaultResourceID) {
            this.kekVaultResourceID = kekVaultResourceID;
            return this;
        }
        public Builder kekVaultResourceID(@Nullable String kekVaultResourceID) {
            this.kekVaultResourceID = Codegen.ofNullable(kekVaultResourceID);
            return this;
        }        public EncryptionKeyDetailsArgs build() {
            return new EncryptionKeyDetailsArgs(kekType, kekUrl, kekVaultResourceID);
        }
    }
}
