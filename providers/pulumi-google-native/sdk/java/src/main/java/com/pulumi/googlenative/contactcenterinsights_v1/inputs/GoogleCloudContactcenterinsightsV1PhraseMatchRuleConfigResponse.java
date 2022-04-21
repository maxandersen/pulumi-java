// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse;
import java.util.Objects;


/**
 * Configuration information of a phrase match rule.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse Empty = new GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse();

    /**
     * The configuration for the exact match rule.
     * 
     */
    @Import(name="exactMatchConfig", required=true)
    private GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig;

    public GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig() {
        return this.exactMatchConfig;
    }

    private GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse() {}

    private GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse(GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse $) {
        this.exactMatchConfig = $.exactMatchConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse();
        }

        public Builder(GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse defaults) {
            $ = new GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder exactMatchConfig(GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig) {
            $.exactMatchConfig = exactMatchConfig;
            return this;
        }

        public GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse build() {
            $.exactMatchConfig = Objects.requireNonNull($.exactMatchConfig, "expected parameter 'exactMatchConfig' to be non-null");
            return $;
        }
    }

}
