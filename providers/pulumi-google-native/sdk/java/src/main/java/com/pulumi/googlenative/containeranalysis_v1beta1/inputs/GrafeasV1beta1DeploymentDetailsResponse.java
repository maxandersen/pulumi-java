// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.DeploymentResponse;
import java.util.Objects;


/**
 * Details of a deployment occurrence.
 * 
 */
public final class GrafeasV1beta1DeploymentDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GrafeasV1beta1DeploymentDetailsResponse Empty = new GrafeasV1beta1DeploymentDetailsResponse();

    /**
     * Deployment history for the resource.
     * 
     */
    @Import(name="deployment", required=true)
      private final DeploymentResponse deployment;

    public DeploymentResponse deployment() {
        return this.deployment;
    }

    public GrafeasV1beta1DeploymentDetailsResponse(DeploymentResponse deployment) {
        this.deployment = Objects.requireNonNull(deployment, "expected parameter 'deployment' to be non-null");
    }

    private GrafeasV1beta1DeploymentDetailsResponse() {
        this.deployment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1DeploymentDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentResponse deployment;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1DeploymentDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployment = defaults.deployment;
        }

        public Builder deployment(DeploymentResponse deployment) {
            this.deployment = Objects.requireNonNull(deployment);
            return this;
        }        public GrafeasV1beta1DeploymentDetailsResponse build() {
            return new GrafeasV1beta1DeploymentDetailsResponse(deployment);
        }
    }
}
