// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatasetReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatasetReferenceResponse Empty = new DatasetReferenceResponse();

    /**
     * [Required] A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
     * 
     */
    @Import(name="datasetId", required=true)
      private final String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

    /**
     * [Optional] The ID of the project containing this dataset.
     * 
     */
    @Import(name="project", required=true)
      private final String project;

    public String project() {
        return this.project;
    }

    public DatasetReferenceResponse(
        String datasetId,
        String project) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private DatasetReferenceResponse() {
        this.datasetId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.project = defaults.project;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }        public DatasetReferenceResponse build() {
            return new DatasetReferenceResponse(datasetId, project);
        }
    }
}
