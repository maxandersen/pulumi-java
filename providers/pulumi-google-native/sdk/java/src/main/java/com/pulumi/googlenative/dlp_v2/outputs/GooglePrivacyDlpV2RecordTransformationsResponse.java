// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldTransformationResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2RecordSuppressionResponse;
import java.util.List;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private GooglePrivacyDlpV2RecordTransformationsResponse(
        @CustomType.Parameter("fieldTransformations") List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations,
        @CustomType.Parameter("recordSuppressions") List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions) {
        this.fieldTransformations = fieldTransformations;
        this.recordSuppressions = recordSuppressions;
    }

    /**
     * Transform the record by applying various field transformations.
     * 
    */
    public List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations() {
        return this.fieldTransformations;
    }
    /**
     * Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
     * 
    */
    public List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions() {
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

        public Builder fieldTransformations(List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations) {
            this.fieldTransformations = Objects.requireNonNull(fieldTransformations);
            return this;
        }
        public Builder fieldTransformations(GooglePrivacyDlpV2FieldTransformationResponse... fieldTransformations) {
            return fieldTransformations(List.of(fieldTransformations));
        }
        public Builder recordSuppressions(List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions) {
            this.recordSuppressions = Objects.requireNonNull(recordSuppressions);
            return this;
        }
        public Builder recordSuppressions(GooglePrivacyDlpV2RecordSuppressionResponse... recordSuppressions) {
            return recordSuppressions(List.of(recordSuppressions));
        }        public GooglePrivacyDlpV2RecordTransformationsResponse build() {
            return new GooglePrivacyDlpV2RecordTransformationsResponse(fieldTransformations, recordSuppressions);
        }
    }
}
