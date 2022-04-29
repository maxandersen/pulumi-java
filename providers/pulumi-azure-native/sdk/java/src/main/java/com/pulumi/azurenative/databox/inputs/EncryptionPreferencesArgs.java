// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.enums.DoubleEncryption;
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
 * Preferences related to the Encryption.
 * 
 */
public final class EncryptionPreferencesArgs extends ResourceArgs {

    public static final EncryptionPreferencesArgs Empty = new EncryptionPreferencesArgs();

    /**
     * Defines secondary layer of software-based encryption enablement.
     * 
     */
    @Import(name="doubleEncryption")
    private @Nullable Output<Either<String,DoubleEncryption>> doubleEncryption;

    /**
     * @return Defines secondary layer of software-based encryption enablement.
     * 
     */
    public Optional<Output<Either<String,DoubleEncryption>>> doubleEncryption() {
        return Optional.ofNullable(this.doubleEncryption);
    }

    private EncryptionPreferencesArgs() {}

    private EncryptionPreferencesArgs(EncryptionPreferencesArgs $) {
        this.doubleEncryption = $.doubleEncryption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionPreferencesArgs $;

        public Builder() {
            $ = new EncryptionPreferencesArgs();
        }

        public Builder(EncryptionPreferencesArgs defaults) {
            $ = new EncryptionPreferencesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param doubleEncryption Defines secondary layer of software-based encryption enablement.
         * 
         * @return builder
         * 
         */
        public Builder doubleEncryption(@Nullable Output<Either<String,DoubleEncryption>> doubleEncryption) {
            $.doubleEncryption = doubleEncryption;
            return this;
        }

        /**
         * @param doubleEncryption Defines secondary layer of software-based encryption enablement.
         * 
         * @return builder
         * 
         */
        public Builder doubleEncryption(Either<String,DoubleEncryption> doubleEncryption) {
            return doubleEncryption(Output.of(doubleEncryption));
        }

        /**
         * @param doubleEncryption Defines secondary layer of software-based encryption enablement.
         * 
         * @return builder
         * 
         */
        public Builder doubleEncryption(String doubleEncryption) {
            return doubleEncryption(Either.ofLeft(doubleEncryption));
        }

        /**
         * @param doubleEncryption Defines secondary layer of software-based encryption enablement.
         * 
         * @return builder
         * 
         */
        public Builder doubleEncryption(DoubleEncryption doubleEncryption) {
            return doubleEncryption(Either.ofRight(doubleEncryption));
        }

        public EncryptionPreferencesArgs build() {
            $.doubleEncryption = Codegen.stringProp("doubleEncryption").left(DoubleEncryption.class).output().arg($.doubleEncryption).def("Disabled").getNullable();
            return $;
        }
    }

}
