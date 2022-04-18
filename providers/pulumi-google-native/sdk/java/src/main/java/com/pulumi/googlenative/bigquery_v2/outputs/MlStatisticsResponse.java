// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery_v2.outputs.IterationResultResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MlStatisticsResponse {
    /**
     * Results for all completed iterations.
     * 
     */
    private final List<IterationResultResponse> iterationResults;
    /**
     * Maximum number of iterations specified as max_iterations in the 'CREATE MODEL' query. The actual number of iterations may be less than this number due to early stop.
     * 
     */
    private final String maxIterations;

    @CustomType.Constructor
    private MlStatisticsResponse(
        @CustomType.Parameter("iterationResults") List<IterationResultResponse> iterationResults,
        @CustomType.Parameter("maxIterations") String maxIterations) {
        this.iterationResults = iterationResults;
        this.maxIterations = maxIterations;
    }

    /**
     * Results for all completed iterations.
     * 
    */
    public List<IterationResultResponse> iterationResults() {
        return this.iterationResults;
    }
    /**
     * Maximum number of iterations specified as max_iterations in the 'CREATE MODEL' query. The actual number of iterations may be less than this number due to early stop.
     * 
    */
    public String maxIterations() {
        return this.maxIterations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MlStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<IterationResultResponse> iterationResults;
        private String maxIterations;

        public Builder() {
    	      // Empty
        }

        public Builder(MlStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iterationResults = defaults.iterationResults;
    	      this.maxIterations = defaults.maxIterations;
        }

        public Builder iterationResults(List<IterationResultResponse> iterationResults) {
            this.iterationResults = Objects.requireNonNull(iterationResults);
            return this;
        }
        public Builder iterationResults(IterationResultResponse... iterationResults) {
            return iterationResults(List.of(iterationResults));
        }
        public Builder maxIterations(String maxIterations) {
            this.maxIterations = Objects.requireNonNull(maxIterations);
            return this;
        }        public MlStatisticsResponse build() {
            return new MlStatisticsResponse(iterationResults, maxIterations);
        }
    }
}
