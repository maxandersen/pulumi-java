// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InfoTypeTransformationsResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2PrimitiveTransformationResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2RecordConditionResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2FieldTransformationResponse {
    /**
     * @return Only apply the transformation if the condition evaluates to true for the given `RecordCondition`. The conditions are allowed to reference fields that are not used in the actual transformation. Example Use Cases: - Apply a different bucket transformation to an age column if the zip code column for the same record is within a specific range. - Redact a field if the date of birth field is greater than 85.
     * 
     */
    private final GooglePrivacyDlpV2RecordConditionResponse condition;
    /**
     * @return Input field(s) to apply the transformation to. When you have columns that reference their position within a list, omit the index from the FieldId. FieldId name matching ignores the index. For example, instead of &#34;contact.nums[0].type&#34;, use &#34;contact.nums.type&#34;.
     * 
     */
    private final List<GooglePrivacyDlpV2FieldIdResponse> fields;
    /**
     * @return Treat the contents of the field as free text, and selectively transform content that matches an `InfoType`.
     * 
     */
    private final GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations;
    /**
     * @return Apply the transformation to the entire field.
     * 
     */
    private final GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation;

    @CustomType.Constructor
    private GooglePrivacyDlpV2FieldTransformationResponse(
        @CustomType.Parameter("condition") GooglePrivacyDlpV2RecordConditionResponse condition,
        @CustomType.Parameter("fields") List<GooglePrivacyDlpV2FieldIdResponse> fields,
        @CustomType.Parameter("infoTypeTransformations") GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations,
        @CustomType.Parameter("primitiveTransformation") GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation) {
        this.condition = condition;
        this.fields = fields;
        this.infoTypeTransformations = infoTypeTransformations;
        this.primitiveTransformation = primitiveTransformation;
    }

    /**
     * @return Only apply the transformation if the condition evaluates to true for the given `RecordCondition`. The conditions are allowed to reference fields that are not used in the actual transformation. Example Use Cases: - Apply a different bucket transformation to an age column if the zip code column for the same record is within a specific range. - Redact a field if the date of birth field is greater than 85.
     * 
     */
    public GooglePrivacyDlpV2RecordConditionResponse condition() {
        return this.condition;
    }
    /**
     * @return Input field(s) to apply the transformation to. When you have columns that reference their position within a list, omit the index from the FieldId. FieldId name matching ignores the index. For example, instead of &#34;contact.nums[0].type&#34;, use &#34;contact.nums.type&#34;.
     * 
     */
    public List<GooglePrivacyDlpV2FieldIdResponse> fields() {
        return this.fields;
    }
    /**
     * @return Treat the contents of the field as free text, and selectively transform content that matches an `InfoType`.
     * 
     */
    public GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations() {
        return this.infoTypeTransformations;
    }
    /**
     * @return Apply the transformation to the entire field.
     * 
     */
    public GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation() {
        return this.primitiveTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2FieldTransformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2RecordConditionResponse condition;
        private List<GooglePrivacyDlpV2FieldIdResponse> fields;
        private GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations;
        private GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2FieldTransformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.fields = defaults.fields;
    	      this.infoTypeTransformations = defaults.infoTypeTransformations;
    	      this.primitiveTransformation = defaults.primitiveTransformation;
        }

        public Builder condition(GooglePrivacyDlpV2RecordConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder fields(List<GooglePrivacyDlpV2FieldIdResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder fields(GooglePrivacyDlpV2FieldIdResponse... fields) {
            return fields(List.of(fields));
        }
        public Builder infoTypeTransformations(GooglePrivacyDlpV2InfoTypeTransformationsResponse infoTypeTransformations) {
            this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations);
            return this;
        }
        public Builder primitiveTransformation(GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation) {
            this.primitiveTransformation = Objects.requireNonNull(primitiveTransformation);
            return this;
        }        public GooglePrivacyDlpV2FieldTransformationResponse build() {
            return new GooglePrivacyDlpV2FieldTransformationResponse(condition, fields, infoTypeTransformations, primitiveTransformation);
        }
    }
}
