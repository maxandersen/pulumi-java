// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdResponse;
import java.util.List;
import java.util.Objects;


/**
 * l-diversity metric, used for analysis of reidentification risk.
 * 
 */
public final class GooglePrivacyDlpV2LDiversityConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2LDiversityConfigResponse Empty = new GooglePrivacyDlpV2LDiversityConfigResponse();

    /**
     * Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite key.
     * 
     */
    @Import(name="quasiIds", required=true)
    private List<GooglePrivacyDlpV2FieldIdResponse> quasiIds;

    public List<GooglePrivacyDlpV2FieldIdResponse> quasiIds() {
        return this.quasiIds;
    }

    /**
     * Sensitive field for computing the l-value.
     * 
     */
    @Import(name="sensitiveAttribute", required=true)
    private GooglePrivacyDlpV2FieldIdResponse sensitiveAttribute;

    public GooglePrivacyDlpV2FieldIdResponse sensitiveAttribute() {
        return this.sensitiveAttribute;
    }

    private GooglePrivacyDlpV2LDiversityConfigResponse() {}

    private GooglePrivacyDlpV2LDiversityConfigResponse(GooglePrivacyDlpV2LDiversityConfigResponse $) {
        this.quasiIds = $.quasiIds;
        this.sensitiveAttribute = $.sensitiveAttribute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2LDiversityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2LDiversityConfigResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2LDiversityConfigResponse();
        }

        public Builder(GooglePrivacyDlpV2LDiversityConfigResponse defaults) {
            $ = new GooglePrivacyDlpV2LDiversityConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder quasiIds(List<GooglePrivacyDlpV2FieldIdResponse> quasiIds) {
            $.quasiIds = quasiIds;
            return this;
        }

        public Builder quasiIds(GooglePrivacyDlpV2FieldIdResponse... quasiIds) {
            return quasiIds(List.of(quasiIds));
        }

        public Builder sensitiveAttribute(GooglePrivacyDlpV2FieldIdResponse sensitiveAttribute) {
            $.sensitiveAttribute = sensitiveAttribute;
            return this;
        }

        public GooglePrivacyDlpV2LDiversityConfigResponse build() {
            $.quasiIds = Objects.requireNonNull($.quasiIds, "expected parameter 'quasiIds' to be non-null");
            $.sensitiveAttribute = Objects.requireNonNull($.sensitiveAttribute, "expected parameter 'sensitiveAttribute' to be non-null");
            return $;
        }
    }

}
