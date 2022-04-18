// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gkehub_v1.inputs.EdgeClusterResponse;
import com.pulumi.googlenative.gkehub_v1.inputs.GkeClusterResponse;
import com.pulumi.googlenative.gkehub_v1.inputs.KubernetesMetadataResponse;
import com.pulumi.googlenative.gkehub_v1.inputs.KubernetesResourceResponse;
import com.pulumi.googlenative.gkehub_v1.inputs.MultiCloudClusterResponse;
import com.pulumi.googlenative.gkehub_v1.inputs.OnPremClusterResponse;
import java.util.Objects;


/**
 * MembershipEndpoint contains information needed to contact a Kubernetes API, endpoint and any additional Kubernetes metadata.
 * 
 */
public final class MembershipEndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final MembershipEndpointResponse Empty = new MembershipEndpointResponse();

    /**
     * Optional. Specific information for a Google Edge cluster.
     * 
     */
    @Import(name="edgeCluster", required=true)
      private final EdgeClusterResponse edgeCluster;

    public EdgeClusterResponse edgeCluster() {
        return this.edgeCluster;
    }

    /**
     * Optional. Specific information for a GKE-on-GCP cluster.
     * 
     */
    @Import(name="gkeCluster", required=true)
      private final GkeClusterResponse gkeCluster;

    public GkeClusterResponse gkeCluster() {
        return this.gkeCluster;
    }

    /**
     * Useful Kubernetes-specific metadata.
     * 
     */
    @Import(name="kubernetesMetadata", required=true)
      private final KubernetesMetadataResponse kubernetesMetadata;

    public KubernetesMetadataResponse kubernetesMetadata() {
        return this.kubernetesMetadata;
    }

    /**
     * Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
     * 
     */
    @Import(name="kubernetesResource", required=true)
      private final KubernetesResourceResponse kubernetesResource;

    public KubernetesResourceResponse kubernetesResource() {
        return this.kubernetesResource;
    }

    /**
     * Optional. Specific information for a GKE Multi-Cloud cluster.
     * 
     */
    @Import(name="multiCloudCluster", required=true)
      private final MultiCloudClusterResponse multiCloudCluster;

    public MultiCloudClusterResponse multiCloudCluster() {
        return this.multiCloudCluster;
    }

    /**
     * Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil "type" instead.
     * 
     */
    @Import(name="onPremCluster", required=true)
      private final OnPremClusterResponse onPremCluster;

    public OnPremClusterResponse onPremCluster() {
        return this.onPremCluster;
    }

    public MembershipEndpointResponse(
        EdgeClusterResponse edgeCluster,
        GkeClusterResponse gkeCluster,
        KubernetesMetadataResponse kubernetesMetadata,
        KubernetesResourceResponse kubernetesResource,
        MultiCloudClusterResponse multiCloudCluster,
        OnPremClusterResponse onPremCluster) {
        this.edgeCluster = Objects.requireNonNull(edgeCluster, "expected parameter 'edgeCluster' to be non-null");
        this.gkeCluster = Objects.requireNonNull(gkeCluster, "expected parameter 'gkeCluster' to be non-null");
        this.kubernetesMetadata = Objects.requireNonNull(kubernetesMetadata, "expected parameter 'kubernetesMetadata' to be non-null");
        this.kubernetesResource = Objects.requireNonNull(kubernetesResource, "expected parameter 'kubernetesResource' to be non-null");
        this.multiCloudCluster = Objects.requireNonNull(multiCloudCluster, "expected parameter 'multiCloudCluster' to be non-null");
        this.onPremCluster = Objects.requireNonNull(onPremCluster, "expected parameter 'onPremCluster' to be non-null");
    }

    private MembershipEndpointResponse() {
        this.edgeCluster = null;
        this.gkeCluster = null;
        this.kubernetesMetadata = null;
        this.kubernetesResource = null;
        this.multiCloudCluster = null;
        this.onPremCluster = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeClusterResponse edgeCluster;
        private GkeClusterResponse gkeCluster;
        private KubernetesMetadataResponse kubernetesMetadata;
        private KubernetesResourceResponse kubernetesResource;
        private MultiCloudClusterResponse multiCloudCluster;
        private OnPremClusterResponse onPremCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edgeCluster = defaults.edgeCluster;
    	      this.gkeCluster = defaults.gkeCluster;
    	      this.kubernetesMetadata = defaults.kubernetesMetadata;
    	      this.kubernetesResource = defaults.kubernetesResource;
    	      this.multiCloudCluster = defaults.multiCloudCluster;
    	      this.onPremCluster = defaults.onPremCluster;
        }

        public Builder edgeCluster(EdgeClusterResponse edgeCluster) {
            this.edgeCluster = Objects.requireNonNull(edgeCluster);
            return this;
        }
        public Builder gkeCluster(GkeClusterResponse gkeCluster) {
            this.gkeCluster = Objects.requireNonNull(gkeCluster);
            return this;
        }
        public Builder kubernetesMetadata(KubernetesMetadataResponse kubernetesMetadata) {
            this.kubernetesMetadata = Objects.requireNonNull(kubernetesMetadata);
            return this;
        }
        public Builder kubernetesResource(KubernetesResourceResponse kubernetesResource) {
            this.kubernetesResource = Objects.requireNonNull(kubernetesResource);
            return this;
        }
        public Builder multiCloudCluster(MultiCloudClusterResponse multiCloudCluster) {
            this.multiCloudCluster = Objects.requireNonNull(multiCloudCluster);
            return this;
        }
        public Builder onPremCluster(OnPremClusterResponse onPremCluster) {
            this.onPremCluster = Objects.requireNonNull(onPremCluster);
            return this;
        }        public MembershipEndpointResponse build() {
            return new MembershipEndpointResponse(edgeCluster, gkeCluster, kubernetesMetadata, kubernetesResource, multiCloudCluster, onPremCluster);
        }
    }
}
