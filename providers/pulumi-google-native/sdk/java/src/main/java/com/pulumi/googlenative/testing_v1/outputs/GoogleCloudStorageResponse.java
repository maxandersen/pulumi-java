// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudStorageResponse {
    /**
     * The path to a directory in GCS that will eventually contain the results for this test. The requesting user must have write access on the bucket in the supplied path.
     * 
     */
    private final String gcsPath;

    @CustomType.Constructor
    private GoogleCloudStorageResponse(@CustomType.Parameter("gcsPath") String gcsPath) {
        this.gcsPath = gcsPath;
    }

    /**
     * The path to a directory in GCS that will eventually contain the results for this test. The requesting user must have write access on the bucket in the supplied path.
     * 
    */
    public String gcsPath() {
        return this.gcsPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudStorageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcsPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudStorageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsPath = defaults.gcsPath;
        }

        public Builder gcsPath(String gcsPath) {
            this.gcsPath = Objects.requireNonNull(gcsPath);
            return this;
        }        public GoogleCloudStorageResponse build() {
            return new GoogleCloudStorageResponse(gcsPath);
        }
    }
}
