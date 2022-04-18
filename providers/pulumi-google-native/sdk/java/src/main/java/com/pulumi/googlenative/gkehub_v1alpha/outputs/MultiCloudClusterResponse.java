// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MultiCloudClusterResponse {
    /**
     * If cluster_missing is set then it denotes that API(gkemulticloud.googleapis.com) resource for this GKE Multi-Cloud cluster no longer exists.
     * 
     */
    private final Boolean clusterMissing;
    /**
     * Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
     * 
     */
    private final String resourceLink;

    @CustomType.Constructor
    private MultiCloudClusterResponse(
        @CustomType.Parameter("clusterMissing") Boolean clusterMissing,
        @CustomType.Parameter("resourceLink") String resourceLink) {
        this.clusterMissing = clusterMissing;
        this.resourceLink = resourceLink;
    }

    /**
     * If cluster_missing is set then it denotes that API(gkemulticloud.googleapis.com) resource for this GKE Multi-Cloud cluster no longer exists.
     * 
    */
    public Boolean clusterMissing() {
        return this.clusterMissing;
    }
    /**
     * Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
     * 
    */
    public String resourceLink() {
        return this.resourceLink;
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
