// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2OutputStorageConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2SaveFindingsResponse {
    /**
     * Location to store findings outside of DLP.
     * 
     */
    private final GooglePrivacyDlpV2OutputStorageConfigResponse outputConfig;

    @OutputCustomType.Constructor
    private GooglePrivacyDlpV2SaveFindingsResponse(@OutputCustomType.Parameter("outputConfig") GooglePrivacyDlpV2OutputStorageConfigResponse outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * Location to store findings outside of DLP.
     * 
    */
    public GooglePrivacyDlpV2OutputStorageConfigResponse getOutputConfig() {
        return this.outputConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2SaveFindingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2OutputStorageConfigResponse outputConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2SaveFindingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputConfig = defaults.outputConfig;
        }

        public Builder setOutputConfig(GooglePrivacyDlpV2OutputStorageConfigResponse outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }
        public GooglePrivacyDlpV2SaveFindingsResponse build() {
            return new GooglePrivacyDlpV2SaveFindingsResponse(outputConfig);
        }
    }
}
