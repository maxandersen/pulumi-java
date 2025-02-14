// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GcsDataResponse {
    /**
     * @return Cloud Storage bucket name. Must meet [Bucket Name Requirements](/storage/docs/naming#requirements).
     * 
     */
    private final String bucketName;
    /**
     * @return Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;. The root path value must meet [Object Name Requirements](/storage/docs/naming#objectnames).
     * 
     */
    private final String path;

    @CustomType.Constructor
    private GcsDataResponse(
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("path") String path) {
        this.bucketName = bucketName;
        this.path = path;
    }

    /**
     * @return Cloud Storage bucket name. Must meet [Bucket Name Requirements](/storage/docs/naming#requirements).
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;. The root path value must meet [Object Name Requirements](/storage/docs/naming#objectnames).
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.path = defaults.path;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public GcsDataResponse build() {
            return new GcsDataResponse(bucketName, path);
        }
    }
}
