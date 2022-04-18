// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Catalog item thumbnail/detail image.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1ImageResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecommendationengineV1beta1ImageResponse Empty = new GoogleCloudRecommendationengineV1beta1ImageResponse();

    /**
     * Optional. Height of the image in number of pixels.
     * 
     */
    @Import(name="height", required=true)
      private final Integer height;

    public Integer height() {
        return this.height;
    }

    /**
     * URL of the image with a length limit of 5 KiB.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String uri() {
        return this.uri;
    }

    /**
     * Optional. Width of the image in number of pixels.
     * 
     */
    @Import(name="width", required=true)
      private final Integer width;

    public Integer width() {
        return this.width;
    }

    public GoogleCloudRecommendationengineV1beta1ImageResponse(
        Integer height,
        String uri,
        Integer width) {
        this.height = Objects.requireNonNull(height, "expected parameter 'height' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.width = Objects.requireNonNull(width, "expected parameter 'width' to be non-null");
    }

    private GoogleCloudRecommendationengineV1beta1ImageResponse() {
        this.height = null;
        this.uri = null;
        this.width = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1ImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer height;
        private String uri;
        private Integer width;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.uri = defaults.uri;
    	      this.width = defaults.width;
        }

        public Builder height(Integer height) {
            this.height = Objects.requireNonNull(height);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder width(Integer width) {
            this.width = Objects.requireNonNull(width);
            return this;
        }        public GoogleCloudRecommendationengineV1beta1ImageResponse build() {
            return new GoogleCloudRecommendationengineV1beta1ImageResponse(height, uri, width);
        }
    }
}
