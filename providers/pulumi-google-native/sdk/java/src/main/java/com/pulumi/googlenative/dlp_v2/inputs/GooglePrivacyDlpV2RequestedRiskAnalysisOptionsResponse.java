// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RiskAnalysisJobConfigResponse;
import java.util.Objects;


/**
 * Risk analysis options.
 * 
 */
public final class GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse Empty = new GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse();

    /**
     * The job config for the risk job.
     * 
     */
    @Import(name="jobConfig", required=true)
      private final GooglePrivacyDlpV2RiskAnalysisJobConfigResponse jobConfig;

    public GooglePrivacyDlpV2RiskAnalysisJobConfigResponse jobConfig() {
        return this.jobConfig;
    }

    public GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse(GooglePrivacyDlpV2RiskAnalysisJobConfigResponse jobConfig) {
        this.jobConfig = Objects.requireNonNull(jobConfig, "expected parameter 'jobConfig' to be non-null");
    }

    private GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse() {
        this.jobConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2RiskAnalysisJobConfigResponse jobConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobConfig = defaults.jobConfig;
        }

        public Builder jobConfig(GooglePrivacyDlpV2RiskAnalysisJobConfigResponse jobConfig) {
            this.jobConfig = Objects.requireNonNull(jobConfig);
            return this;
        }        public GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse build() {
            return new GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse(jobConfig);
        }
    }
}
