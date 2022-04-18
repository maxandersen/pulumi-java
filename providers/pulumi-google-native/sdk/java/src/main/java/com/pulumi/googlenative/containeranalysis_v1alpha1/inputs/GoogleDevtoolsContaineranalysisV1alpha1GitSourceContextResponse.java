// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A GitSourceContext denotes a particular revision in a third party Git repository (e.g., GitHub).
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse Empty = new GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse();

    /**
     * Git commit hash.
     * 
     */
    @Import(name="revisionId", required=true)
      private final String revisionId;

    public String revisionId() {
        return this.revisionId;
    }

    /**
     * Git repository URL.
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String url() {
        return this.url;
    }

    public GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse(
        String revisionId,
        String url) {
        this.revisionId = Objects.requireNonNull(revisionId, "expected parameter 'revisionId' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse() {
        this.revisionId = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String revisionId;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revisionId = defaults.revisionId;
    	      this.url = defaults.url;
        }

        public Builder revisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse(revisionId, url);
        }
    }
}
