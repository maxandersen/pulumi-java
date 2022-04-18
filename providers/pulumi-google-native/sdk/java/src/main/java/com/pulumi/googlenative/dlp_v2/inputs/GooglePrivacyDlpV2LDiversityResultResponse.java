// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2LDiversityHistogramBucketResponse;
import java.util.List;
import java.util.Objects;


/**
 * Result of the l-diversity computation.
 * 
 */
public final class GooglePrivacyDlpV2LDiversityResultResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2LDiversityResultResponse Empty = new GooglePrivacyDlpV2LDiversityResultResponse();

    /**
     * Histogram of l-diversity equivalence class sensitive value frequencies.
     * 
     */
    @Import(name="sensitiveValueFrequencyHistogramBuckets", required=true)
      private final List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets;

    public List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets() {
        return this.sensitiveValueFrequencyHistogramBuckets;
    }

    public GooglePrivacyDlpV2LDiversityResultResponse(List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets) {
        this.sensitiveValueFrequencyHistogramBuckets = Objects.requireNonNull(sensitiveValueFrequencyHistogramBuckets, "expected parameter 'sensitiveValueFrequencyHistogramBuckets' to be non-null");
    }

    private GooglePrivacyDlpV2LDiversityResultResponse() {
        this.sensitiveValueFrequencyHistogramBuckets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2LDiversityResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2LDiversityResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sensitiveValueFrequencyHistogramBuckets = defaults.sensitiveValueFrequencyHistogramBuckets;
        }

        public Builder sensitiveValueFrequencyHistogramBuckets(List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets) {
            this.sensitiveValueFrequencyHistogramBuckets = Objects.requireNonNull(sensitiveValueFrequencyHistogramBuckets);
            return this;
        }
        public Builder sensitiveValueFrequencyHistogramBuckets(GooglePrivacyDlpV2LDiversityHistogramBucketResponse... sensitiveValueFrequencyHistogramBuckets) {
            return sensitiveValueFrequencyHistogramBuckets(List.of(sensitiveValueFrequencyHistogramBuckets));
        }        public GooglePrivacyDlpV2LDiversityResultResponse build() {
            return new GooglePrivacyDlpV2LDiversityResultResponse(sensitiveValueFrequencyHistogramBuckets);
        }
    }
}
