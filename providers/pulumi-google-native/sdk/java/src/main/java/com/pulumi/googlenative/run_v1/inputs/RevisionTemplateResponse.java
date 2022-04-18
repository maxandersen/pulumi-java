// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1.inputs.ObjectMetaResponse;
import com.pulumi.googlenative.run_v1.inputs.RevisionSpecResponse;
import java.util.Objects;


/**
 * RevisionTemplateSpec describes the data a revision should have when created from a template. Based on: https://github.com/kubernetes/api/blob/e771f807/core/v1/types.go#L3179-L3190
 * 
 */
public final class RevisionTemplateResponse extends com.pulumi.resources.InvokeArgs {

    public static final RevisionTemplateResponse Empty = new RevisionTemplateResponse();

    /**
     * Optional metadata for this Revision, including labels and annotations. Name will be generated by the Configuration. The following annotation keys set properties of the created revision: * `autoscaling.knative.dev/minScale` sets the minimum number of instances. * `autoscaling.knative.dev/maxScale` sets the maximum number of instances. * `run.googleapis.com/cloudsql-instances` sets Cloud SQL connections. Multiple values should be comma separated. * `run.googleapis.com/vpc-access-connector` sets a Serverless VPC Access connector. * `run.googleapis.com/vpc-access-egress` sets VPC egress. Supported values are `all-traffic`, `all` (deprecated), and `private-ranges-only`. `all-traffic` and `all` provide the same functionality. `all` is deprecated but will continue to be supported. Prefer `all-traffic`.
     * 
     */
    @Import(name="metadata", required=true)
      private final ObjectMetaResponse metadata;

    public ObjectMetaResponse metadata() {
        return this.metadata;
    }

    /**
     * RevisionSpec holds the desired state of the Revision (from the client).
     * 
     */
    @Import(name="spec", required=true)
      private final RevisionSpecResponse spec;

    public RevisionSpecResponse spec() {
        return this.spec;
    }

    public RevisionTemplateResponse(
        ObjectMetaResponse metadata,
        RevisionSpecResponse spec) {
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
    }

    private RevisionTemplateResponse() {
        this.metadata = null;
        this.spec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RevisionTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectMetaResponse metadata;
        private RevisionSpecResponse spec;

        public Builder() {
    	      // Empty
        }

        public Builder(RevisionTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder metadata(ObjectMetaResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder spec(RevisionSpecResponse spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }        public RevisionTemplateResponse build() {
            return new RevisionTemplateResponse(metadata, spec);
        }
    }
}
