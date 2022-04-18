// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Set the scoring configuration. This allows modifying the ranking of results for a source.
 * 
 */
public final class SourceScoringConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SourceScoringConfigResponse Empty = new SourceScoringConfigResponse();

    /**
     * Importance of the source.
     * 
     */
    @Import(name="sourceImportance", required=true)
      private final String sourceImportance;

    public String sourceImportance() {
        return this.sourceImportance;
    }

    public SourceScoringConfigResponse(String sourceImportance) {
        this.sourceImportance = Objects.requireNonNull(sourceImportance, "expected parameter 'sourceImportance' to be non-null");
    }

    private SourceScoringConfigResponse() {
        this.sourceImportance = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceScoringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceImportance;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceScoringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceImportance = defaults.sourceImportance;
        }

        public Builder sourceImportance(String sourceImportance) {
            this.sourceImportance = Objects.requireNonNull(sourceImportance);
            return this;
        }        public SourceScoringConfigResponse build() {
            return new SourceScoringConfigResponse(sourceImportance);
        }
    }
}
