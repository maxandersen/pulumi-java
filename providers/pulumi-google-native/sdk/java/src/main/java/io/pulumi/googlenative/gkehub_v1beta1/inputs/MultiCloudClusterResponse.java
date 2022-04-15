// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * MultiCloudCluster contains information specific to GKE Multi-Cloud clusters.
 * 
 */
public final class MultiCloudClusterResponse extends io.pulumi.resources.InvokeArgs {

    public static final MultiCloudClusterResponse Empty = new MultiCloudClusterResponse();

    /**
     * If cluster_missing is set then it denotes that API(gkemulticloud.googleapis.com) resource for this GKE Multi-Cloud cluster no longer exists.
     * 
     */
    @Import(name="clusterMissing", required=true)
      private final Boolean clusterMissing;

    public Boolean clusterMissing() {
        return this.clusterMissing;
    }

    /**
     * Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
     * 
     */
    @Import(name="resourceLink", required=true)
      private final String resourceLink;

    public String resourceLink() {
        return this.resourceLink;
    }

    public MultiCloudClusterResponse(
        Boolean clusterMissing,
        String resourceLink) {
        this.clusterMissing = Objects.requireNonNull(clusterMissing, "expected parameter 'clusterMissing' to be non-null");
        this.resourceLink = Objects.requireNonNull(resourceLink, "expected parameter 'resourceLink' to be non-null");
    }

    private MultiCloudClusterResponse() {
        this.clusterMissing = null;
        this.resourceLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiCloudClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean clusterMissing;
        private String resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiCloudClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterMissing = defaults.clusterMissing;
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder clusterMissing(Boolean clusterMissing) {
            this.clusterMissing = Objects.requireNonNull(clusterMissing);
            return this;
        }
        public Builder resourceLink(String resourceLink) {
            this.resourceLink = Objects.requireNonNull(resourceLink);
            return this;
        }        public MultiCloudClusterResponse build() {
            return new MultiCloudClusterResponse(clusterMissing, resourceLink);
        }
    }
}
