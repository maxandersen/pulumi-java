// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SnapshotImportDiskContainerUserBucketArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotImportDiskContainerUserBucketArgs Empty = new SnapshotImportDiskContainerUserBucketArgs();

    /**
     * The name of the Amazon S3 bucket where the disk image is located.
     * 
     */
    @Import(name="s3Bucket", required=true)
    private Output<String> s3Bucket;

    public Output<String> s3Bucket() {
        return this.s3Bucket;
    }

    /**
     * The file name of the disk image.
     * 
     */
    @Import(name="s3Key", required=true)
    private Output<String> s3Key;

    public Output<String> s3Key() {
        return this.s3Key;
    }

    private SnapshotImportDiskContainerUserBucketArgs() {}

    private SnapshotImportDiskContainerUserBucketArgs(SnapshotImportDiskContainerUserBucketArgs $) {
        this.s3Bucket = $.s3Bucket;
        this.s3Key = $.s3Key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotImportDiskContainerUserBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotImportDiskContainerUserBucketArgs $;

        public Builder() {
            $ = new SnapshotImportDiskContainerUserBucketArgs();
        }

        public Builder(SnapshotImportDiskContainerUserBucketArgs defaults) {
            $ = new SnapshotImportDiskContainerUserBucketArgs(Objects.requireNonNull(defaults));
        }

        public Builder s3Bucket(Output<String> s3Bucket) {
            $.s3Bucket = s3Bucket;
            return this;
        }

        public Builder s3Bucket(String s3Bucket) {
            return s3Bucket(Output.of(s3Bucket));
        }

        public Builder s3Key(Output<String> s3Key) {
            $.s3Key = s3Key;
            return this;
        }

        public Builder s3Key(String s3Key) {
            return s3Key(Output.of(s3Key));
        }

        public SnapshotImportDiskContainerUserBucketArgs build() {
            $.s3Bucket = Objects.requireNonNull($.s3Bucket, "expected parameter 's3Bucket' to be non-null");
            $.s3Key = Objects.requireNonNull($.s3Key, "expected parameter 's3Key' to be non-null");
            return $;
        }
    }

}
