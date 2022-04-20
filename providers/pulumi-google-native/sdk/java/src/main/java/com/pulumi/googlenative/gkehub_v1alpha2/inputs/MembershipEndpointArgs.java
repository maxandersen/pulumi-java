// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.gkehub_v1alpha2.inputs.EdgeClusterArgs;
import com.pulumi.googlenative.gkehub_v1alpha2.inputs.GkeClusterArgs;
import com.pulumi.googlenative.gkehub_v1alpha2.inputs.KubernetesResourceArgs;
import com.pulumi.googlenative.gkehub_v1alpha2.inputs.MultiCloudClusterArgs;
import com.pulumi.googlenative.gkehub_v1alpha2.inputs.OnPremClusterArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MembershipEndpoint contains information needed to contact a Kubernetes API, endpoint and any additional Kubernetes metadata.
 * 
 */
public final class MembershipEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final MembershipEndpointArgs Empty = new MembershipEndpointArgs();

    /**
     * Optional. Specific information for a Google Edge cluster.
     * 
     */
    @Import(name="edgeCluster")
      private final @Nullable Output<EdgeClusterArgs> edgeCluster;

    public Output<EdgeClusterArgs> edgeCluster() {
        return this.edgeCluster == null ? Codegen.empty() : this.edgeCluster;
    }

    /**
     * Optional. Specific information for a GKE-on-GCP cluster.
     * 
     */
    @Import(name="gkeCluster")
      private final @Nullable Output<GkeClusterArgs> gkeCluster;

    public Output<GkeClusterArgs> gkeCluster() {
        return this.gkeCluster == null ? Codegen.empty() : this.gkeCluster;
    }

    /**
     * Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
     * 
     */
    @Import(name="kubernetesResource")
      private final @Nullable Output<KubernetesResourceArgs> kubernetesResource;

    public Output<KubernetesResourceArgs> kubernetesResource() {
        return this.kubernetesResource == null ? Codegen.empty() : this.kubernetesResource;
    }

    /**
     * Optional. Specific information for a GKE Multi-Cloud cluster.
     * 
     */
    @Import(name="multiCloudCluster")
      private final @Nullable Output<MultiCloudClusterArgs> multiCloudCluster;

    public Output<MultiCloudClusterArgs> multiCloudCluster() {
        return this.multiCloudCluster == null ? Codegen.empty() : this.multiCloudCluster;
    }

    /**
     * Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil &#34;type&#34; instead.
     * 
     */
    @Import(name="onPremCluster")
      private final @Nullable Output<OnPremClusterArgs> onPremCluster;

    public Output<OnPremClusterArgs> onPremCluster() {
        return this.onPremCluster == null ? Codegen.empty() : this.onPremCluster;
    }

    public MembershipEndpointArgs(
        @Nullable Output<EdgeClusterArgs> edgeCluster,
        @Nullable Output<GkeClusterArgs> gkeCluster,
        @Nullable Output<KubernetesResourceArgs> kubernetesResource,
        @Nullable Output<MultiCloudClusterArgs> multiCloudCluster,
        @Nullable Output<OnPremClusterArgs> onPremCluster) {
        this.edgeCluster = edgeCluster;
        this.gkeCluster = gkeCluster;
        this.kubernetesResource = kubernetesResource;
        this.multiCloudCluster = multiCloudCluster;
        this.onPremCluster = onPremCluster;
    }

    private MembershipEndpointArgs() {
        this.edgeCluster = Codegen.empty();
        this.gkeCluster = Codegen.empty();
        this.kubernetesResource = Codegen.empty();
        this.multiCloudCluster = Codegen.empty();
        this.onPremCluster = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EdgeClusterArgs> edgeCluster;
        private @Nullable Output<GkeClusterArgs> gkeCluster;
        private @Nullable Output<KubernetesResourceArgs> kubernetesResource;
        private @Nullable Output<MultiCloudClusterArgs> multiCloudCluster;
        private @Nullable Output<OnPremClusterArgs> onPremCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edgeCluster = defaults.edgeCluster;
    	      this.gkeCluster = defaults.gkeCluster;
    	      this.kubernetesResource = defaults.kubernetesResource;
    	      this.multiCloudCluster = defaults.multiCloudCluster;
    	      this.onPremCluster = defaults.onPremCluster;
        }

        public Builder edgeCluster(@Nullable Output<EdgeClusterArgs> edgeCluster) {
            this.edgeCluster = edgeCluster;
            return this;
        }
        public Builder edgeCluster(@Nullable EdgeClusterArgs edgeCluster) {
            this.edgeCluster = Codegen.ofNullable(edgeCluster);
            return this;
        }
        public Builder gkeCluster(@Nullable Output<GkeClusterArgs> gkeCluster) {
            this.gkeCluster = gkeCluster;
            return this;
        }
        public Builder gkeCluster(@Nullable GkeClusterArgs gkeCluster) {
            this.gkeCluster = Codegen.ofNullable(gkeCluster);
            return this;
        }
        public Builder kubernetesResource(@Nullable Output<KubernetesResourceArgs> kubernetesResource) {
            this.kubernetesResource = kubernetesResource;
            return this;
        }
        public Builder kubernetesResource(@Nullable KubernetesResourceArgs kubernetesResource) {
            this.kubernetesResource = Codegen.ofNullable(kubernetesResource);
            return this;
        }
        public Builder multiCloudCluster(@Nullable Output<MultiCloudClusterArgs> multiCloudCluster) {
            this.multiCloudCluster = multiCloudCluster;
            return this;
        }
        public Builder multiCloudCluster(@Nullable MultiCloudClusterArgs multiCloudCluster) {
            this.multiCloudCluster = Codegen.ofNullable(multiCloudCluster);
            return this;
        }
        public Builder onPremCluster(@Nullable Output<OnPremClusterArgs> onPremCluster) {
            this.onPremCluster = onPremCluster;
            return this;
        }
        public Builder onPremCluster(@Nullable OnPremClusterArgs onPremCluster) {
            this.onPremCluster = Codegen.ofNullable(onPremCluster);
            return this;
        }        public MembershipEndpointArgs build() {
            return new MembershipEndpointArgs(edgeCluster, gkeCluster, kubernetesResource, multiCloudCluster, onPremCluster);
        }
    }
}
