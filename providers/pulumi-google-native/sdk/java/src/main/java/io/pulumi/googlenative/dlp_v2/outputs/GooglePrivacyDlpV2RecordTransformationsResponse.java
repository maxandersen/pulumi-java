// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldTransformationResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2RecordSuppressionResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2RecordTransformationsResponse {
    /**
     * Transform the record by applying various field transformations.
     * 
     */
    private final List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations;
    /**
     * Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
     * 
     */
    private final List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions;

    @OutputCustomType.Constructor
    private GooglePrivacyDlpV2RecordTransformationsResponse(
        @OutputCustomType.Parameter("fieldTransformations") List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations,
        @OutputCustomType.Parameter("recordSuppressions") List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions) {
        this.fieldTransformations = fieldTransformations;
        this.recordSuppressions = recordSuppressions;
    }

    /**
     * Transform the record by applying various field transformations.
     * 
    */
    public List<GooglePrivacyDlpV2FieldTransformationResponse> getFieldTransformations() {
        return this.fieldTransformations;
    }
    /**
     * Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
     * 
    */
    public List<GooglePrivacyDlpV2RecordSuppressionResponse> getRecordSuppressions() {
        return this.recordSuppressions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RecordTransformationsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations;
        private List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RecordTransformationsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldTransformations = defaults.fieldTransformations;
    	      this.recordSuppressions = defaults.recordSuppressions;
        }

        public Builder setFieldTransformations(List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations) {
            this.fieldTransformations = Objects.requireNonNull(fieldTransformations);
            return this;
        }

        public Builder setRecordSuppressions(List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions) {
            this.recordSuppressions = Objects.requireNonNull(recordSuppressions);
            return this;
        }
        public GooglePrivacyDlpV2RecordTransformationsResponse build() {
            return new GooglePrivacyDlpV2RecordTransformationsResponse(fieldTransformations, recordSuppressions);
        }
    }
}
