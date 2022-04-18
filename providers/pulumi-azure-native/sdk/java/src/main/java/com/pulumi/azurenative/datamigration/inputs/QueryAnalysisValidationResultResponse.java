// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.QueryExecutionResultResponse;
import com.pulumi.azurenative.datamigration.inputs.ValidationErrorResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Results for query analysis comparison between the source and target
 * 
 */
public final class QueryAnalysisValidationResultResponse extends com.pulumi.resources.InvokeArgs {

    public static final QueryAnalysisValidationResultResponse Empty = new QueryAnalysisValidationResultResponse();

    /**
     * List of queries executed and it's execution results in source and target
     * 
     */
    @Import(name="queryResults", required=true)
      private final QueryExecutionResultResponse queryResults;

    public QueryExecutionResultResponse queryResults() {
        return this.queryResults;
    }

    /**
     * Errors that are part of the execution
     * 
     */
    @Import(name="validationErrors", required=true)
      private final ValidationErrorResponse validationErrors;

    public ValidationErrorResponse validationErrors() {
        return this.validationErrors;
    }

    public QueryAnalysisValidationResultResponse(
        QueryExecutionResultResponse queryResults,
        ValidationErrorResponse validationErrors) {
        this.queryResults = Objects.requireNonNull(queryResults, "expected parameter 'queryResults' to be non-null");
        this.validationErrors = Objects.requireNonNull(validationErrors, "expected parameter 'validationErrors' to be non-null");
    }

    private QueryAnalysisValidationResultResponse() {
        this.queryResults = null;
        this.validationErrors = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryAnalysisValidationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryExecutionResultResponse queryResults;
        private ValidationErrorResponse validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryAnalysisValidationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryResults = defaults.queryResults;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder queryResults(QueryExecutionResultResponse queryResults) {
            this.queryResults = Objects.requireNonNull(queryResults);
            return this;
        }
        public Builder validationErrors(ValidationErrorResponse validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }        public QueryAnalysisValidationResultResponse build() {
            return new QueryAnalysisValidationResultResponse(queryResults, validationErrors);
        }
    }
}
