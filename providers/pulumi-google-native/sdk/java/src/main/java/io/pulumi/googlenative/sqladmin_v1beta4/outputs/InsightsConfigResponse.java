// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class InsightsConfigResponse {
    /**
     * Whether Query Insights feature is enabled.
     * 
     */
    private final Boolean queryInsightsEnabled;
    /**
     * Number of query execution plans captured by Insights per minute for all queries combined. Default is 5.
     * 
     */
    private final Integer queryPlansPerMinute;
    /**
     * Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query length more than this field value will be truncated to this value. When unset, query length will be the default value. Changing query length will restart the database.
     * 
     */
    private final Integer queryStringLength;
    /**
     * Whether Query Insights will record application tags from query when enabled.
     * 
     */
    private final Boolean recordApplicationTags;
    /**
     * Whether Query Insights will record client address when enabled.
     * 
     */
    private final Boolean recordClientAddress;

    @OutputCustomType.Constructor
    private InsightsConfigResponse(
        @OutputCustomType.Parameter("queryInsightsEnabled") Boolean queryInsightsEnabled,
        @OutputCustomType.Parameter("queryPlansPerMinute") Integer queryPlansPerMinute,
        @OutputCustomType.Parameter("queryStringLength") Integer queryStringLength,
        @OutputCustomType.Parameter("recordApplicationTags") Boolean recordApplicationTags,
        @OutputCustomType.Parameter("recordClientAddress") Boolean recordClientAddress) {
        this.queryInsightsEnabled = queryInsightsEnabled;
        this.queryPlansPerMinute = queryPlansPerMinute;
        this.queryStringLength = queryStringLength;
        this.recordApplicationTags = recordApplicationTags;
        this.recordClientAddress = recordClientAddress;
    }

    /**
     * Whether Query Insights feature is enabled.
     * 
    */
    public Boolean getQueryInsightsEnabled() {
        return this.queryInsightsEnabled;
    }
    /**
     * Number of query execution plans captured by Insights per minute for all queries combined. Default is 5.
     * 
    */
    public Integer getQueryPlansPerMinute() {
        return this.queryPlansPerMinute;
    }
    /**
     * Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query length more than this field value will be truncated to this value. When unset, query length will be the default value. Changing query length will restart the database.
     * 
    */
    public Integer getQueryStringLength() {
        return this.queryStringLength;
    }
    /**
     * Whether Query Insights will record application tags from query when enabled.
     * 
    */
    public Boolean getRecordApplicationTags() {
        return this.recordApplicationTags;
    }
    /**
     * Whether Query Insights will record client address when enabled.
     * 
    */
    public Boolean getRecordClientAddress() {
        return this.recordClientAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean queryInsightsEnabled;
        private Integer queryPlansPerMinute;
        private Integer queryStringLength;
        private Boolean recordApplicationTags;
        private Boolean recordClientAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryInsightsEnabled = defaults.queryInsightsEnabled;
    	      this.queryPlansPerMinute = defaults.queryPlansPerMinute;
    	      this.queryStringLength = defaults.queryStringLength;
    	      this.recordApplicationTags = defaults.recordApplicationTags;
    	      this.recordClientAddress = defaults.recordClientAddress;
        }

        public Builder setQueryInsightsEnabled(Boolean queryInsightsEnabled) {
            this.queryInsightsEnabled = Objects.requireNonNull(queryInsightsEnabled);
            return this;
        }

        public Builder setQueryPlansPerMinute(Integer queryPlansPerMinute) {
            this.queryPlansPerMinute = Objects.requireNonNull(queryPlansPerMinute);
            return this;
        }

        public Builder setQueryStringLength(Integer queryStringLength) {
            this.queryStringLength = Objects.requireNonNull(queryStringLength);
            return this;
        }

        public Builder setRecordApplicationTags(Boolean recordApplicationTags) {
            this.recordApplicationTags = Objects.requireNonNull(recordApplicationTags);
            return this;
        }

        public Builder setRecordClientAddress(Boolean recordClientAddress) {
            this.recordClientAddress = Objects.requireNonNull(recordClientAddress);
            return this;
        }
        public InsightsConfigResponse build() {
            return new InsightsConfigResponse(queryInsightsEnabled, queryPlansPerMinute, queryStringLength, recordApplicationTags, recordClientAddress);
        }
    }
}
