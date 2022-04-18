// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InfoTypeResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InspectionRuleResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2InspectionRuleSetResponse {
    /**
     * List of infoTypes this rule set is applied to.
     * 
     */
    private final List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;
    /**
     * Set of rules to be applied to infoTypes. The rules are applied in order.
     * 
     */
    private final List<GooglePrivacyDlpV2InspectionRuleResponse> rules;

    @CustomType.Constructor
    private GooglePrivacyDlpV2InspectionRuleSetResponse(
        @CustomType.Parameter("infoTypes") List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes,
        @CustomType.Parameter("rules") List<GooglePrivacyDlpV2InspectionRuleResponse> rules) {
        this.infoTypes = infoTypes;
        this.rules = rules;
    }

    /**
     * List of infoTypes this rule set is applied to.
     * 
    */
    public List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes() {
        return this.infoTypes;
    }
    /**
     * Set of rules to be applied to infoTypes. The rules are applied in order.
     * 
    */
    public List<GooglePrivacyDlpV2InspectionRuleResponse> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectionRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;
        private List<GooglePrivacyDlpV2InspectionRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectionRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.rules = defaults.rules;
        }

        public Builder infoTypes(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }
        public Builder infoTypes(GooglePrivacyDlpV2InfoTypeResponse... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }
        public Builder rules(List<GooglePrivacyDlpV2InspectionRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GooglePrivacyDlpV2InspectionRuleResponse... rules) {
            return rules(List.of(rules));
        }        public GooglePrivacyDlpV2InspectionRuleSetResponse build() {
            return new GooglePrivacyDlpV2InspectionRuleSetResponse(infoTypes, rules);
        }
    }
}
