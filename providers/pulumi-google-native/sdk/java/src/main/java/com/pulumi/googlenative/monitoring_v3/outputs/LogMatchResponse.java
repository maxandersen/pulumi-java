// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class LogMatchResponse {
    /**
     * A logs-based filter. See Advanced Logs Queries (https://cloud.google.com/logging/docs/view/advanced-queries) for how this filter should be constructed.
     * 
     */
    private final String filter;
    /**
     * Optional. A map from a label key to an extractor expression, which is used to extract the value for this label key. Each entry in this map is a specification for how data should be extracted from log entries that match filter. Each combination of extracted values is treated as a separate rule for the purposes of triggering notifications. Label keys and corresponding values can be used in notifications generated by this condition.Please see the documentation on logs-based metric valueExtractors (https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.metrics#LogMetric.FIELDS.value_extractor) for syntax and examples.
     * 
     */
    private final Map<String,String> labelExtractors;

    @CustomType.Constructor
    private LogMatchResponse(
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("labelExtractors") Map<String,String> labelExtractors) {
        this.filter = filter;
        this.labelExtractors = labelExtractors;
    }

    /**
     * A logs-based filter. See Advanced Logs Queries (https://cloud.google.com/logging/docs/view/advanced-queries) for how this filter should be constructed.
     * 
    */
    public String filter() {
        return this.filter;
    }
    /**
     * Optional. A map from a label key to an extractor expression, which is used to extract the value for this label key. Each entry in this map is a specification for how data should be extracted from log entries that match filter. Each combination of extracted values is treated as a separate rule for the purposes of triggering notifications. Label keys and corresponding values can be used in notifications generated by this condition.Please see the documentation on logs-based metric valueExtractors (https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.metrics#LogMetric.FIELDS.value_extractor) for syntax and examples.
     * 
    */
    public Map<String,String> labelExtractors() {
        return this.labelExtractors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;
        private Map<String,String> labelExtractors;

        public Builder() {
    	      // Empty
        }

        public Builder(LogMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.labelExtractors = defaults.labelExtractors;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder labelExtractors(Map<String,String> labelExtractors) {
            this.labelExtractors = Objects.requireNonNull(labelExtractors);
            return this;
        }        public LogMatchResponse build() {
            return new LogMatchResponse(filter, labelExtractors);
        }
    }
}
