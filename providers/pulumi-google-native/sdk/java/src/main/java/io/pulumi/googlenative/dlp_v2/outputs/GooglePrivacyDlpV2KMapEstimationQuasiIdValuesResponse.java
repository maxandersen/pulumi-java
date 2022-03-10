// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ValueResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse {
    /**
     * The estimated anonymity for these quasi-identifier values.
     * 
     */
    private final String estimatedAnonymity;
    /**
     * The quasi-identifier values.
     * 
     */
    private final List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues;

    @OutputCustomType.Constructor
    private GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse(
        @OutputCustomType.Parameter("estimatedAnonymity") String estimatedAnonymity,
        @OutputCustomType.Parameter("quasiIdsValues") List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues) {
        this.estimatedAnonymity = estimatedAnonymity;
        this.quasiIdsValues = quasiIdsValues;
    }

    /**
     * The estimated anonymity for these quasi-identifier values.
     * 
    */
    public String getEstimatedAnonymity() {
        return this.estimatedAnonymity;
    }
    /**
     * The quasi-identifier values.
     * 
    */
    public List<GooglePrivacyDlpV2ValueResponse> getQuasiIdsValues() {
        return this.quasiIdsValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String estimatedAnonymity;
        private List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.estimatedAnonymity = defaults.estimatedAnonymity;
    	      this.quasiIdsValues = defaults.quasiIdsValues;
        }

        public Builder setEstimatedAnonymity(String estimatedAnonymity) {
            this.estimatedAnonymity = Objects.requireNonNull(estimatedAnonymity);
            return this;
        }

        public Builder setQuasiIdsValues(List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues) {
            this.quasiIdsValues = Objects.requireNonNull(quasiIdsValues);
            return this;
        }
        public GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse build() {
            return new GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse(estimatedAnonymity, quasiIdsValues);
        }
    }
}
