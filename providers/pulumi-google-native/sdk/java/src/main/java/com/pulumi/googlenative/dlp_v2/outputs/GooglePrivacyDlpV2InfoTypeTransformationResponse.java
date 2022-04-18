// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InfoTypeResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2PrimitiveTransformationResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2InfoTypeTransformationResponse {
    /**
     * InfoTypes to apply the transformation to. An empty list will cause this transformation to apply to all findings that correspond to infoTypes that were requested in `InspectConfig`.
     * 
     */
    private final List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;
    /**
     * Primitive transformation to apply to the infoType.
     * 
     */
    private final GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation;

    @CustomType.Constructor
    private GooglePrivacyDlpV2InfoTypeTransformationResponse(
        @CustomType.Parameter("infoTypes") List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes,
        @CustomType.Parameter("primitiveTransformation") GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation) {
        this.infoTypes = infoTypes;
        this.primitiveTransformation = primitiveTransformation;
    }

    /**
     * InfoTypes to apply the transformation to. An empty list will cause this transformation to apply to all findings that correspond to infoTypes that were requested in `InspectConfig`.
     * 
    */
    public List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes() {
        return this.infoTypes;
    }
    /**
     * Primitive transformation to apply to the infoType.
     * 
    */
    public GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation() {
        return this.primitiveTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InfoTypeTransformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;
        private GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InfoTypeTransformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.primitiveTransformation = defaults.primitiveTransformation;
        }

        public Builder infoTypes(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }
        public Builder infoTypes(GooglePrivacyDlpV2InfoTypeResponse... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }
        public Builder primitiveTransformation(GooglePrivacyDlpV2PrimitiveTransformationResponse primitiveTransformation) {
            this.primitiveTransformation = Objects.requireNonNull(primitiveTransformation);
            return this;
        }        public GooglePrivacyDlpV2InfoTypeTransformationResponse build() {
            return new GooglePrivacyDlpV2InfoTypeTransformationResponse(infoTypes, primitiveTransformation);
        }
    }
}
