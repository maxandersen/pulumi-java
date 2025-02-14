// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse {
    /**
     * @return Number of conversations the issue model has analyzed at this point in time.
     * 
     */
    private final String analyzedConversationsCount;
    /**
     * @return Statistics on each issue. Key is the issue&#39;s resource name.
     * 
     */
    private final Map<String,String> issueStats;
    /**
     * @return Number of analyzed conversations for which no issue was applicable at this point in time.
     * 
     */
    private final String unclassifiedConversationsCount;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse(
        @CustomType.Parameter("analyzedConversationsCount") String analyzedConversationsCount,
        @CustomType.Parameter("issueStats") Map<String,String> issueStats,
        @CustomType.Parameter("unclassifiedConversationsCount") String unclassifiedConversationsCount) {
        this.analyzedConversationsCount = analyzedConversationsCount;
        this.issueStats = issueStats;
        this.unclassifiedConversationsCount = unclassifiedConversationsCount;
    }

    /**
     * @return Number of conversations the issue model has analyzed at this point in time.
     * 
     */
    public String analyzedConversationsCount() {
        return this.analyzedConversationsCount;
    }
    /**
     * @return Statistics on each issue. Key is the issue&#39;s resource name.
     * 
     */
    public Map<String,String> issueStats() {
        return this.issueStats;
    }
    /**
     * @return Number of analyzed conversations for which no issue was applicable at this point in time.
     * 
     */
    public String unclassifiedConversationsCount() {
        return this.unclassifiedConversationsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String analyzedConversationsCount;
        private Map<String,String> issueStats;
        private String unclassifiedConversationsCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzedConversationsCount = defaults.analyzedConversationsCount;
    	      this.issueStats = defaults.issueStats;
    	      this.unclassifiedConversationsCount = defaults.unclassifiedConversationsCount;
        }

        public Builder analyzedConversationsCount(String analyzedConversationsCount) {
            this.analyzedConversationsCount = Objects.requireNonNull(analyzedConversationsCount);
            return this;
        }
        public Builder issueStats(Map<String,String> issueStats) {
            this.issueStats = Objects.requireNonNull(issueStats);
            return this;
        }
        public Builder unclassifiedConversationsCount(String unclassifiedConversationsCount) {
            this.unclassifiedConversationsCount = Objects.requireNonNull(unclassifiedConversationsCount);
            return this;
        }        public GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse build() {
            return new GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse(analyzedConversationsCount, issueStats, unclassifiedConversationsCount);
        }
    }
}
