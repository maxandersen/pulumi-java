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
    private ObjectMetaResponse metadata;

    public ObjectMetaResponse metadata() {
        return this.metadata;
    }

    /**
     * RevisionSpec holds the desired state of the Revision (from the client).
     * 
     */
    @Import(name="spec", required=true)
    private RevisionSpecResponse spec;

    public RevisionSpecResponse spec() {
        return this.spec;
    }

    private RevisionTemplateResponse() {}

    private RevisionTemplateResponse(RevisionTemplateResponse $) {
        this.metadata = $.metadata;
        this.spec = $.spec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RevisionTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RevisionTemplateResponse $;

        public Builder() {
            $ = new RevisionTemplateResponse();
        }

        public Builder(RevisionTemplateResponse defaults) {
            $ = new RevisionTemplateResponse(Objects.requireNonNull(defaults));
        }

        public Builder metadata(ObjectMetaResponse metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder spec(RevisionSpecResponse spec) {
            $.spec = spec;
            return this;
        }

        public RevisionTemplateResponse build() {
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            $.spec = Objects.requireNonNull($.spec, "expected parameter 'spec' to be non-null");
            return $;
        }
    }

}
