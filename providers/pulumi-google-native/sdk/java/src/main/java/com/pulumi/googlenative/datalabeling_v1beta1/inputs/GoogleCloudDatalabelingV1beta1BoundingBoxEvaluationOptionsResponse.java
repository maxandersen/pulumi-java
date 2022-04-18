// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * Options regarding evaluation between bounding boxes.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse Empty = new GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse();

    /**
     * Minimum [intersection-over-union (IOU)](/vision/automl/object-detection/docs/evaluate#intersection-over-union) required for 2 bounding boxes to be considered a match. This must be a number between 0 and 1.
     * 
     */
    @Import(name="iouThreshold", required=true)
      private final Double iouThreshold;

    public Double iouThreshold() {
        return this.iouThreshold;
    }

    public GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse(Double iouThreshold) {
        this.iouThreshold = Objects.requireNonNull(iouThreshold, "expected parameter 'iouThreshold' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse() {
        this.iouThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double iouThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iouThreshold = defaults.iouThreshold;
        }

        public Builder iouThreshold(Double iouThreshold) {
            this.iouThreshold = Objects.requireNonNull(iouThreshold);
            return this;
        }        public GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse build() {
            return new GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsResponse(iouThreshold);
        }
    }
}
