// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * EdgeCluster contains information specific to Google Edge Clusters.
 * 
 */
public final class EdgeClusterResponse extends com.pulumi.resources.InvokeArgs {

    public static final EdgeClusterResponse Empty = new EdgeClusterResponse();

    /**
     * Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * 
     */
    @Import(name="resourceLink", required=true)
      private final String resourceLink;

    public String resourceLink() {
        return this.resourceLink;
    }

    public EdgeClusterResponse(String resourceLink) {
        this.resourceLink = Objects.requireNonNull(resourceLink, "expected parameter 'resourceLink' to be non-null");
    }

    private EdgeClusterResponse() {
        this.resourceLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder resourceLink(String resourceLink) {
            this.resourceLink = Objects.requireNonNull(resourceLink);
            return this;
        }        public EdgeClusterResponse build() {
            return new EdgeClusterResponse(resourceLink);
        }
    }
}
