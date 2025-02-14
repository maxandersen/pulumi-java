// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * &lt;p&gt;Amazon S3 manifest file location.&lt;/p&gt;
 * 
 */
public final class DataSourceManifestFileLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceManifestFileLocationArgs Empty = new DataSourceManifestFileLocationArgs();

    /**
     * &lt;p&gt;Amazon S3 bucket.&lt;/p&gt;
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return &lt;p&gt;Amazon S3 bucket.&lt;/p&gt;
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * &lt;p&gt;Amazon S3 key that identifies an object.&lt;/p&gt;
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return &lt;p&gt;Amazon S3 key that identifies an object.&lt;/p&gt;
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    private DataSourceManifestFileLocationArgs() {}

    private DataSourceManifestFileLocationArgs(DataSourceManifestFileLocationArgs $) {
        this.bucket = $.bucket;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceManifestFileLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceManifestFileLocationArgs $;

        public Builder() {
            $ = new DataSourceManifestFileLocationArgs();
        }

        public Builder(DataSourceManifestFileLocationArgs defaults) {
            $ = new DataSourceManifestFileLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket &lt;p&gt;Amazon S3 bucket.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket &lt;p&gt;Amazon S3 bucket.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param key &lt;p&gt;Amazon S3 key that identifies an object.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key &lt;p&gt;Amazon S3 key that identifies an object.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public DataSourceManifestFileLocationArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
