// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OnPremClusterResponse {
    /**
     * Immutable. Whether the cluster is an admin cluster.
     * 
     */
    private final Boolean adminCluster;
    /**
     * If cluster_missing is set then it denotes that API(gkeonprem.googleapis.com) resource for this GKE On-Prem cluster no longer exists.
     * 
     */
    private final Boolean clusterMissing;
    /**
     * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For example: //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
     * 
     */
    private final String resourceLink;

    @CustomType.Constructor
    private OnPremClusterResponse(
        @CustomType.Parameter("adminCluster") Boolean adminCluster,
        @CustomType.Parameter("clusterMissing") Boolean clusterMissing,
        @CustomType.Parameter("resourceLink") String resourceLink) {
        this.adminCluster = adminCluster;
        this.clusterMissing = clusterMissing;
        this.resourceLink = resourceLink;
    }

    /**
     * Immutable. Whether the cluster is an admin cluster.
     * 
    */
    public Boolean adminCluster() {
        return this.adminCluster;
    }
    /**
     * If cluster_missing is set then it denotes that API(gkeonprem.googleapis.com) resource for this GKE On-Prem cluster no longer exists.
     * 
    */
    public Boolean clusterMissing() {
        return this.clusterMissing;
    }
    /**
     * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For example: //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
     * 
    */
    public String resourceLink() {
        return this.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean adminCluster;
        private Boolean clusterMissing;
        private String resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminCluster = defaults.adminCluster;
    	      this.clusterMissing = defaults.clusterMissing;
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder adminCluster(Boolean adminCluster) {
            this.adminCluster = Objects.requireNonNull(adminCluster);
            return this;
        }
        public Builder clusterMissing(Boolean clusterMissing) {
            this.clusterMissing = Objects.requireNonNull(clusterMissing);
            return this;
        }
        public Builder resourceLink(String resourceLink) {
            this.resourceLink = Objects.requireNonNull(resourceLink);
            return this;
        }        public OnPremClusterResponse build() {
            return new OnPremClusterResponse(adminCluster, clusterMissing, resourceLink);
        }
    }
}
