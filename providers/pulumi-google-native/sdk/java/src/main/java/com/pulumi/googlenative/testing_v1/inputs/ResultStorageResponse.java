// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.GoogleCloudStorageResponse;
import com.pulumi.googlenative.testing_v1.inputs.ToolResultsExecutionResponse;
import com.pulumi.googlenative.testing_v1.inputs.ToolResultsHistoryResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Locations where the results of running the test are stored.
 * 
 */
public final class ResultStorageResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResultStorageResponse Empty = new ResultStorageResponse();

    /**
     * Required.
     * 
     */
    @Import(name="googleCloudStorage", required=true)
      private final GoogleCloudStorageResponse googleCloudStorage;

    public GoogleCloudStorageResponse googleCloudStorage() {
        return this.googleCloudStorage;
    }

    /**
     * URL to the results in the Firebase Web Console.
     * 
     */
    @Import(name="resultsUrl", required=true)
      private final String resultsUrl;

    public String resultsUrl() {
        return this.resultsUrl;
    }

    /**
     * The tool results execution that results are written to.
     * 
     */
    @Import(name="toolResultsExecution", required=true)
      private final ToolResultsExecutionResponse toolResultsExecution;

    public ToolResultsExecutionResponse toolResultsExecution() {
        return this.toolResultsExecution;
    }

    /**
     * The tool results history that contains the tool results execution that results are written to. If not provided, the service will choose an appropriate value.
     * 
     */
    @Import(name="toolResultsHistory", required=true)
      private final ToolResultsHistoryResponse toolResultsHistory;

    public ToolResultsHistoryResponse toolResultsHistory() {
        return this.toolResultsHistory;
    }

    public ResultStorageResponse(
        GoogleCloudStorageResponse googleCloudStorage,
        String resultsUrl,
        ToolResultsExecutionResponse toolResultsExecution,
        ToolResultsHistoryResponse toolResultsHistory) {
        this.googleCloudStorage = Objects.requireNonNull(googleCloudStorage, "expected parameter 'googleCloudStorage' to be non-null");
        this.resultsUrl = Objects.requireNonNull(resultsUrl, "expected parameter 'resultsUrl' to be non-null");
        this.toolResultsExecution = Objects.requireNonNull(toolResultsExecution, "expected parameter 'toolResultsExecution' to be non-null");
        this.toolResultsHistory = Objects.requireNonNull(toolResultsHistory, "expected parameter 'toolResultsHistory' to be non-null");
    }

    private ResultStorageResponse() {
        this.googleCloudStorage = null;
        this.resultsUrl = null;
        this.toolResultsExecution = null;
        this.toolResultsHistory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResultStorageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudStorageResponse googleCloudStorage;
        private String resultsUrl;
        private ToolResultsExecutionResponse toolResultsExecution;
        private ToolResultsHistoryResponse toolResultsHistory;

        public Builder() {
    	      // Empty
        }

        public Builder(ResultStorageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.googleCloudStorage = defaults.googleCloudStorage;
    	      this.resultsUrl = defaults.resultsUrl;
    	      this.toolResultsExecution = defaults.toolResultsExecution;
    	      this.toolResultsHistory = defaults.toolResultsHistory;
        }

        public Builder googleCloudStorage(GoogleCloudStorageResponse googleCloudStorage) {
            this.googleCloudStorage = Objects.requireNonNull(googleCloudStorage);
            return this;
        }
        public Builder resultsUrl(String resultsUrl) {
            this.resultsUrl = Objects.requireNonNull(resultsUrl);
            return this;
        }
        public Builder toolResultsExecution(ToolResultsExecutionResponse toolResultsExecution) {
            this.toolResultsExecution = Objects.requireNonNull(toolResultsExecution);
            return this;
        }
        public Builder toolResultsHistory(ToolResultsHistoryResponse toolResultsHistory) {
            this.toolResultsHistory = Objects.requireNonNull(toolResultsHistory);
            return this;
        }        public ResultStorageResponse build() {
            return new ResultStorageResponse(googleCloudStorage, resultsUrl, toolResultsExecution, toolResultsHistory);
        }
    }
}
