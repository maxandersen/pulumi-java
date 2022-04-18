// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1beta1.inputs.BoundingPolyResponse;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * Image annotation.
 * 
 */
public final class ImageAnnotationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageAnnotationResponse Empty = new ImageAnnotationResponse();

    /**
     * The list of polygons outlining the sensitive regions in the image.
     * 
     */
    @Import(name="boundingPolys", required=true)
      private final List<BoundingPolyResponse> boundingPolys;

    public List<BoundingPolyResponse> boundingPolys() {
        return this.boundingPolys;
    }

    /**
     * 0-based index of the image frame. For example, an image frame in a DICOM instance.
     * 
     */
    @Import(name="frameIndex", required=true)
      private final Integer frameIndex;

    public Integer frameIndex() {
        return this.frameIndex;
    }

    public ImageAnnotationResponse(
        List<BoundingPolyResponse> boundingPolys,
        Integer frameIndex) {
        this.boundingPolys = Objects.requireNonNull(boundingPolys, "expected parameter 'boundingPolys' to be non-null");
        this.frameIndex = Objects.requireNonNull(frameIndex, "expected parameter 'frameIndex' to be non-null");
    }

    private ImageAnnotationResponse() {
        this.boundingPolys = List.of();
        this.frameIndex = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageAnnotationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BoundingPolyResponse> boundingPolys;
        private Integer frameIndex;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageAnnotationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boundingPolys = defaults.boundingPolys;
    	      this.frameIndex = defaults.frameIndex;
        }

        public Builder boundingPolys(List<BoundingPolyResponse> boundingPolys) {
            this.boundingPolys = Objects.requireNonNull(boundingPolys);
            return this;
        }
        public Builder boundingPolys(BoundingPolyResponse... boundingPolys) {
            return boundingPolys(List.of(boundingPolys));
        }
        public Builder frameIndex(Integer frameIndex) {
            this.frameIndex = Objects.requireNonNull(frameIndex);
            return this;
        }        public ImageAnnotationResponse build() {
            return new ImageAnnotationResponse(boundingPolys, frameIndex);
        }
    }
}
