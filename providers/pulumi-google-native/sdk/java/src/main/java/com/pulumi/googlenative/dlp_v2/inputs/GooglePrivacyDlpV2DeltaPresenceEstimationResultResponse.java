// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse;
import java.util.List;
import java.util.Objects;


/**
 * Result of the δ-presence computation. Note that these results are an estimation, not exact values.
 * 
 */
public final class GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse Empty = new GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse();

    /**
     * The intervals [min_probability, max_probability) do not overlap. If a value doesn't correspond to any such interval, the associated frequency is zero. For example, the following records: {min_probability: 0, max_probability: 0.1, frequency: 17} {min_probability: 0.2, max_probability: 0.3, frequency: 42} {min_probability: 0.3, max_probability: 0.4, frequency: 99} mean that there are no record with an estimated probability in [0.1, 0.2) nor larger or equal to 0.4.
     * 
     */
    @Import(name="deltaPresenceEstimationHistogram", required=true)
      private final List<GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse> deltaPresenceEstimationHistogram;

    public List<GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse> deltaPresenceEstimationHistogram() {
        return this.deltaPresenceEstimationHistogram;
    }

    public GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse(List<GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse> deltaPresenceEstimationHistogram) {
        this.deltaPresenceEstimationHistogram = Objects.requireNonNull(deltaPresenceEstimationHistogram, "expected parameter 'deltaPresenceEstimationHistogram' to be non-null");
    }

    private GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse() {
        this.deltaPresenceEstimationHistogram = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse> deltaPresenceEstimationHistogram;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaPresenceEstimationHistogram = defaults.deltaPresenceEstimationHistogram;
        }

        public Builder deltaPresenceEstimationHistogram(List<GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse> deltaPresenceEstimationHistogram) {
            this.deltaPresenceEstimationHistogram = Objects.requireNonNull(deltaPresenceEstimationHistogram);
            return this;
        }
        public Builder deltaPresenceEstimationHistogram(GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse... deltaPresenceEstimationHistogram) {
            return deltaPresenceEstimationHistogram(List.of(deltaPresenceEstimationHistogram));
        }        public GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse build() {
            return new GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse(deltaPresenceEstimationHistogram);
        }
    }
}
