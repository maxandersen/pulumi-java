// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NamespacedGkeDeploymentTargetResponse {
    /**
     * Optional. A namespace within the GKE cluster to deploy into.
     * 
     */
    private final String clusterNamespace;
    /**
     * Optional. The target GKE cluster to deploy to. Format: 'projects/{project}/locations/{location}/clusters/{cluster_id}'
     * 
     */
    private final String targetGkeCluster;

    @CustomType.Constructor
    private NamespacedGkeDeploymentTargetResponse(
        @CustomType.Parameter("clusterNamespace") String clusterNamespace,
        @CustomType.Parameter("targetGkeCluster") String targetGkeCluster) {
        this.clusterNamespace = clusterNamespace;
        this.targetGkeCluster = targetGkeCluster;
    }

    /**
     * Optional. A namespace within the GKE cluster to deploy into.
     * 
    */
    public String clusterNamespace() {
        return this.clusterNamespace;
    }
    /**
     * Optional. The target GKE cluster to deploy to. Format: 'projects/{project}/locations/{location}/clusters/{cluster_id}'
     * 
    */
    public String targetGkeCluster() {
        return this.targetGkeCluster;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespacedGkeDeploymentTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterNamespace;
        private String targetGkeCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespacedGkeDeploymentTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterNamespace = defaults.clusterNamespace;
    	      this.targetGkeCluster = defaults.targetGkeCluster;
        }

        public Builder clusterNamespace(String clusterNamespace) {
            this.clusterNamespace = Objects.requireNonNull(clusterNamespace);
            return this;
        }
        public Builder targetGkeCluster(String targetGkeCluster) {
            this.targetGkeCluster = Objects.requireNonNull(targetGkeCluster);
            return this;
        }        public NamespacedGkeDeploymentTargetResponse build() {
            return new NamespacedGkeDeploymentTargetResponse(clusterNamespace, targetGkeCluster);
        }
    }
}
