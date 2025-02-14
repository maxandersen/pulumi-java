// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
 * 
 */
public final class BucketObjectCustomerEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketObjectCustomerEncryptionArgs Empty = new BucketObjectCustomerEncryptionArgs();

    /**
     * The encryption algorithm.
     * 
     */
    @Import(name="encryptionAlgorithm")
    private @Nullable Output<String> encryptionAlgorithm;

    /**
     * @return The encryption algorithm.
     * 
     */
    public Optional<Output<String>> encryptionAlgorithm() {
        return Optional.ofNullable(this.encryptionAlgorithm);
    }

    /**
     * SHA256 hash value of the encryption key.
     * 
     */
    @Import(name="keySha256")
    private @Nullable Output<String> keySha256;

    /**
     * @return SHA256 hash value of the encryption key.
     * 
     */
    public Optional<Output<String>> keySha256() {
        return Optional.ofNullable(this.keySha256);
    }

    private BucketObjectCustomerEncryptionArgs() {}

    private BucketObjectCustomerEncryptionArgs(BucketObjectCustomerEncryptionArgs $) {
        this.encryptionAlgorithm = $.encryptionAlgorithm;
        this.keySha256 = $.keySha256;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketObjectCustomerEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketObjectCustomerEncryptionArgs $;

        public Builder() {
            $ = new BucketObjectCustomerEncryptionArgs();
        }

        public Builder(BucketObjectCustomerEncryptionArgs defaults) {
            $ = new BucketObjectCustomerEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionAlgorithm The encryption algorithm.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAlgorithm(@Nullable Output<String> encryptionAlgorithm) {
            $.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }

        /**
         * @param encryptionAlgorithm The encryption algorithm.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            return encryptionAlgorithm(Output.of(encryptionAlgorithm));
        }

        /**
         * @param keySha256 SHA256 hash value of the encryption key.
         * 
         * @return builder
         * 
         */
        public Builder keySha256(@Nullable Output<String> keySha256) {
            $.keySha256 = keySha256;
            return this;
        }

        /**
         * @param keySha256 SHA256 hash value of the encryption key.
         * 
         * @return builder
         * 
         */
        public Builder keySha256(String keySha256) {
            return keySha256(Output.of(keySha256));
        }

        public BucketObjectCustomerEncryptionArgs build() {
            return $;
        }
    }

}
