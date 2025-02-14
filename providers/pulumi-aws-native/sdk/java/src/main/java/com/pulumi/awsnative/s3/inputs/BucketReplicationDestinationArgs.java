// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketReplicationDestinationStorageClass;
import com.pulumi.awsnative.s3.inputs.BucketAccessControlTranslationArgs;
import com.pulumi.awsnative.s3.inputs.BucketEncryptionConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketMetricsArgs;
import com.pulumi.awsnative.s3.inputs.BucketReplicationTimeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies which Amazon S3 bucket to store replicated objects in and their storage class.
 * 
 */
public final class BucketReplicationDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationDestinationArgs Empty = new BucketReplicationDestinationArgs();

    @Import(name="accessControlTranslation")
    private @Nullable Output<BucketAccessControlTranslationArgs> accessControlTranslation;

    public Optional<Output<BucketAccessControlTranslationArgs>> accessControlTranslation() {
        return Optional.ofNullable(this.accessControlTranslation);
    }

    @Import(name="account")
    private @Nullable Output<String> account;

    public Optional<Output<String>> account() {
        return Optional.ofNullable(this.account);
    }

    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    @Import(name="encryptionConfiguration")
    private @Nullable Output<BucketEncryptionConfigurationArgs> encryptionConfiguration;

    public Optional<Output<BucketEncryptionConfigurationArgs>> encryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }

    @Import(name="metrics")
    private @Nullable Output<BucketMetricsArgs> metrics;

    public Optional<Output<BucketMetricsArgs>> metrics() {
        return Optional.ofNullable(this.metrics);
    }

    @Import(name="replicationTime")
    private @Nullable Output<BucketReplicationTimeArgs> replicationTime;

    public Optional<Output<BucketReplicationTimeArgs>> replicationTime() {
        return Optional.ofNullable(this.replicationTime);
    }

    /**
     * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy.
     * 
     */
    @Import(name="storageClass")
    private @Nullable Output<BucketReplicationDestinationStorageClass> storageClass;

    /**
     * @return The storage class to use when replicating objects, such as S3 Standard or reduced redundancy.
     * 
     */
    public Optional<Output<BucketReplicationDestinationStorageClass>> storageClass() {
        return Optional.ofNullable(this.storageClass);
    }

    private BucketReplicationDestinationArgs() {}

    private BucketReplicationDestinationArgs(BucketReplicationDestinationArgs $) {
        this.accessControlTranslation = $.accessControlTranslation;
        this.account = $.account;
        this.bucket = $.bucket;
        this.encryptionConfiguration = $.encryptionConfiguration;
        this.metrics = $.metrics;
        this.replicationTime = $.replicationTime;
        this.storageClass = $.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationDestinationArgs $;

        public Builder() {
            $ = new BucketReplicationDestinationArgs();
        }

        public Builder(BucketReplicationDestinationArgs defaults) {
            $ = new BucketReplicationDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessControlTranslation(@Nullable Output<BucketAccessControlTranslationArgs> accessControlTranslation) {
            $.accessControlTranslation = accessControlTranslation;
            return this;
        }

        public Builder accessControlTranslation(BucketAccessControlTranslationArgs accessControlTranslation) {
            return accessControlTranslation(Output.of(accessControlTranslation));
        }

        public Builder account(@Nullable Output<String> account) {
            $.account = account;
            return this;
        }

        public Builder account(String account) {
            return account(Output.of(account));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder encryptionConfiguration(@Nullable Output<BucketEncryptionConfigurationArgs> encryptionConfiguration) {
            $.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder encryptionConfiguration(BucketEncryptionConfigurationArgs encryptionConfiguration) {
            return encryptionConfiguration(Output.of(encryptionConfiguration));
        }

        public Builder metrics(@Nullable Output<BucketMetricsArgs> metrics) {
            $.metrics = metrics;
            return this;
        }

        public Builder metrics(BucketMetricsArgs metrics) {
            return metrics(Output.of(metrics));
        }

        public Builder replicationTime(@Nullable Output<BucketReplicationTimeArgs> replicationTime) {
            $.replicationTime = replicationTime;
            return this;
        }

        public Builder replicationTime(BucketReplicationTimeArgs replicationTime) {
            return replicationTime(Output.of(replicationTime));
        }

        /**
         * @param storageClass The storage class to use when replicating objects, such as S3 Standard or reduced redundancy.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(@Nullable Output<BucketReplicationDestinationStorageClass> storageClass) {
            $.storageClass = storageClass;
            return this;
        }

        /**
         * @param storageClass The storage class to use when replicating objects, such as S3 Standard or reduced redundancy.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(BucketReplicationDestinationStorageClass storageClass) {
            return storageClass(Output.of(storageClass));
        }

        public BucketReplicationDestinationArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
