// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * OnPremCluster contains information specific to GKE On-Prem clusters.
 * 
 */
public final class OnPremClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnPremClusterArgs Empty = new OnPremClusterArgs();

    /**
     * Immutable. Whether the cluster is an admin cluster.
     * 
     */
    @Import(name="adminCluster")
      private final @Nullable Output<Boolean> adminCluster;

    public Output<Boolean> adminCluster() {
        return this.adminCluster == null ? Codegen.empty() : this.adminCluster;
    }

    /**
     * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For example: //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
     * 
     */
    @Import(name="resourceLink")
      private final @Nullable Output<String> resourceLink;

    public Output<String> resourceLink() {
        return this.resourceLink == null ? Codegen.empty() : this.resourceLink;
    }

    public OnPremClusterArgs(
        @Nullable Output<Boolean> adminCluster,
        @Nullable Output<String> resourceLink) {
        this.adminCluster = adminCluster;
        this.resourceLink = resourceLink;
    }

    private OnPremClusterArgs() {
        this.adminCluster = Codegen.empty();
        this.resourceLink = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> adminCluster;
        private @Nullable Output<String> resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminCluster = defaults.adminCluster;
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder adminCluster(@Nullable Output<Boolean> adminCluster) {
            this.adminCluster = adminCluster;
            return this;
        }
        public Builder adminCluster(@Nullable Boolean adminCluster) {
            this.adminCluster = Codegen.ofNullable(adminCluster);
            return this;
        }
        public Builder resourceLink(@Nullable Output<String> resourceLink) {
            this.resourceLink = resourceLink;
            return this;
        }
        public Builder resourceLink(@Nullable String resourceLink) {
            this.resourceLink = Codegen.ofNullable(resourceLink);
            return this;
        }        public OnPremClusterArgs build() {
            return new OnPremClusterArgs(adminCluster, resourceLink);
        }
    }
}
