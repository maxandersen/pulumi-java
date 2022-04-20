// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransferJobTransferSpecGcsDataSource {
    /**
     * S3 Bucket name.
     * 
     */
    private final String bucketName;
    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;.
     * 
     */
    private final @Nullable String path;

    @CustomType.Constructor
    private TransferJobTransferSpecGcsDataSource(
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("path") @Nullable String path) {
        this.bucketName = bucketName;
        this.path = path;
    }

    /**
     * S3 Bucket name.
     * 
    */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;.
     * 
    */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecGcsDataSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecGcsDataSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.path = defaults.path;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }        public TransferJobTransferSpecGcsDataSource build() {
            return new TransferJobTransferSpecGcsDataSource(bucketName, path);
        }
    }
}
