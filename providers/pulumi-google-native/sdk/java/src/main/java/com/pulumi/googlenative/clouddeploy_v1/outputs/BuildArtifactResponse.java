// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BuildArtifactResponse {
    /**
     * Image name in Skaffold configuration.
     * 
     */
    private final String image;
    /**
     * Image tag to use. This will generally be the full path to an image, such as &#34;gcr.io/my-project/busybox:1.2.3&#34; or &#34;gcr.io/my-project/busybox@sha256:abc123&#34;.
     * 
     */
    private final String tag;

    @CustomType.Constructor
    private BuildArtifactResponse(
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("tag") String tag) {
        this.image = image;
        this.tag = tag;
    }

    /**
     * Image name in Skaffold configuration.
     * 
    */
    public String image() {
        return this.image;
    }
    /**
     * Image tag to use. This will generally be the full path to an image, such as &#34;gcr.io/my-project/busybox:1.2.3&#34; or &#34;gcr.io/my-project/busybox@sha256:abc123&#34;.
     * 
    */
    public String tag() {
        return this.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String image;
        private String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildArtifactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.tag = defaults.tag;
        }

        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }        public BuildArtifactResponse build() {
            return new BuildArtifactResponse(image, tag);
        }
    }
}
