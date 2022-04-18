// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BigQueryModelTrainingResponse {
    /**
     * [Output-only, Beta] Index of current ML training iteration. Updated during create model query job to show job progress.
     * 
     */
    private final Integer currentIteration;
    /**
     * [Output-only, Beta] Expected number of iterations for the create model query job specified as num_iterations in the input query. The actual total number of iterations may be less than this number due to early stop.
     * 
     */
    private final String expectedTotalIterations;

    @CustomType.Constructor
    private BigQueryModelTrainingResponse(
        @CustomType.Parameter("currentIteration") Integer currentIteration,
        @CustomType.Parameter("expectedTotalIterations") String expectedTotalIterations) {
        this.currentIteration = currentIteration;
        this.expectedTotalIterations = expectedTotalIterations;
    }

    /**
     * [Output-only, Beta] Index of current ML training iteration. Updated during create model query job to show job progress.
     * 
    */
    public Integer currentIteration() {
        return this.currentIteration;
    }
    /**
     * [Output-only, Beta] Expected number of iterations for the create model query job specified as num_iterations in the input query. The actual total number of iterations may be less than this number due to early stop.
     * 
    */
    public String expectedTotalIterations() {
        return this.expectedTotalIterations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigQueryModelTrainingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer currentIteration;
        private String expectedTotalIterations;

        public Builder() {
    	      // Empty
        }

        public Builder(BigQueryModelTrainingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentIteration = defaults.currentIteration;
    	      this.expectedTotalIterations = defaults.expectedTotalIterations;
        }

        public Builder currentIteration(Integer currentIteration) {
            this.currentIteration = Objects.requireNonNull(currentIteration);
            return this;
        }
        public Builder expectedTotalIterations(String expectedTotalIterations) {
            this.expectedTotalIterations = Objects.requireNonNull(expectedTotalIterations);
            return this;
        }        public BigQueryModelTrainingResponse build() {
            return new BigQueryModelTrainingResponse(currentIteration, expectedTotalIterations);
        }
    }
}
