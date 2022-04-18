// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaConditionQueryTermResponse;
import com.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaConditionTimeRangeResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2alphaConditionResponse {
    /**
     * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
     */
    private final List<GoogleCloudRetailV2alphaConditionTimeRangeResponse> activeTimeRange;
    /**
     * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
     */
    private final List<GoogleCloudRetailV2alphaConditionQueryTermResponse> queryTerms;

    @CustomType.Constructor
    private GoogleCloudRetailV2alphaConditionResponse(
        @CustomType.Parameter("activeTimeRange") List<GoogleCloudRetailV2alphaConditionTimeRangeResponse> activeTimeRange,
        @CustomType.Parameter("queryTerms") List<GoogleCloudRetailV2alphaConditionQueryTermResponse> queryTerms) {
        this.activeTimeRange = activeTimeRange;
        this.queryTerms = queryTerms;
    }

    /**
     * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
    */
    public List<GoogleCloudRetailV2alphaConditionTimeRangeResponse> activeTimeRange() {
        return this.activeTimeRange;
    }
    /**
     * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
    */
    public List<GoogleCloudRetailV2alphaConditionQueryTermResponse> queryTerms() {
        return this.queryTerms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudRetailV2alphaConditionTimeRangeResponse> activeTimeRange;
        private List<GoogleCloudRetailV2alphaConditionQueryTermResponse> queryTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeTimeRange = defaults.activeTimeRange;
    	      this.queryTerms = defaults.queryTerms;
        }

        public Builder activeTimeRange(List<GoogleCloudRetailV2alphaConditionTimeRangeResponse> activeTimeRange) {
            this.activeTimeRange = Objects.requireNonNull(activeTimeRange);
            return this;
        }
        public Builder activeTimeRange(GoogleCloudRetailV2alphaConditionTimeRangeResponse... activeTimeRange) {
            return activeTimeRange(List.of(activeTimeRange));
        }
        public Builder queryTerms(List<GoogleCloudRetailV2alphaConditionQueryTermResponse> queryTerms) {
            this.queryTerms = Objects.requireNonNull(queryTerms);
            return this;
        }
        public Builder queryTerms(GoogleCloudRetailV2alphaConditionQueryTermResponse... queryTerms) {
            return queryTerms(List.of(queryTerms));
        }        public GoogleCloudRetailV2alphaConditionResponse build() {
            return new GoogleCloudRetailV2alphaConditionResponse(activeTimeRange, queryTerms);
        }
    }
}
