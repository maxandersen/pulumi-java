// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudbuild_v1.outputs.TimeSpanResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ArtifactObjectsResponse {
    /**
     * @return Cloud Storage bucket and optional object path, in the form &#34;gs://bucket/path/to/somewhere/&#34;. (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Files in the workspace matching any path pattern will be uploaded to Cloud Storage with this location as a prefix.
     * 
     */
    private final String location;
    /**
     * @return Path globs used to match files in the build&#39;s workspace.
     * 
     */
    private final List<String> paths;
    /**
     * @return Stores timing information for pushing all artifact objects.
     * 
     */
    private final TimeSpanResponse timing;

    @CustomType.Constructor
    private ArtifactObjectsResponse(
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("paths") List<String> paths,
        @CustomType.Parameter("timing") TimeSpanResponse timing) {
        this.location = location;
        this.paths = paths;
        this.timing = timing;
    }

    /**
     * @return Cloud Storage bucket and optional object path, in the form &#34;gs://bucket/path/to/somewhere/&#34;. (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Files in the workspace matching any path pattern will be uploaded to Cloud Storage with this location as a prefix.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Path globs used to match files in the build&#39;s workspace.
     * 
     */
    public List<String> paths() {
        return this.paths;
    }
    /**
     * @return Stores timing information for pushing all artifact objects.
     * 
     */
    public TimeSpanResponse timing() {
        return this.timing;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactObjectsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private List<String> paths;
        private TimeSpanResponse timing;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactObjectsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.paths = defaults.paths;
    	      this.timing = defaults.timing;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder paths(List<String> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }
        public Builder timing(TimeSpanResponse timing) {
            this.timing = Objects.requireNonNull(timing);
            return this;
        }        public ArtifactObjectsResponse build() {
            return new ArtifactObjectsResponse(location, paths, timing);
        }
    }
}
