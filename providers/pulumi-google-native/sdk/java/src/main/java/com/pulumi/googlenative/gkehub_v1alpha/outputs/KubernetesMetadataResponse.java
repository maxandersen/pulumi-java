// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KubernetesMetadataResponse {
    /**
     * Kubernetes API server version string as reported by `/version`.
     * 
     */
    private final String kubernetesApiServerVersion;
    /**
     * The total memory capacity as reported by the sum of all Kubernetes nodes resources, defined in MB.
     * 
     */
    private final Integer memoryMb;
    /**
     * Node count as reported by Kubernetes nodes resources.
     * 
     */
    private final Integer nodeCount;
    /**
     * Node providerID as reported by the first node in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the node_count will be zero and the node_provider_id will be empty.
     * 
     */
    private final String nodeProviderId;
    /**
     * The time at which these details were last updated. This update_time is different from the Membership-level update_time since EndpointDetails are updated internally for API consumers.
     * 
     */
    private final String updateTime;
    /**
     * vCPU count as reported by Kubernetes nodes resources.
     * 
     */
    private final Integer vcpuCount;

    @CustomType.Constructor
    private KubernetesMetadataResponse(
        @CustomType.Parameter("kubernetesApiServerVersion") String kubernetesApiServerVersion,
        @CustomType.Parameter("memoryMb") Integer memoryMb,
        @CustomType.Parameter("nodeCount") Integer nodeCount,
        @CustomType.Parameter("nodeProviderId") String nodeProviderId,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("vcpuCount") Integer vcpuCount) {
        this.kubernetesApiServerVersion = kubernetesApiServerVersion;
        this.memoryMb = memoryMb;
        this.nodeCount = nodeCount;
        this.nodeProviderId = nodeProviderId;
        this.updateTime = updateTime;
        this.vcpuCount = vcpuCount;
    }

    /**
     * Kubernetes API server version string as reported by `/version`.
     * 
    */
    public String kubernetesApiServerVersion() {
        return this.kubernetesApiServerVersion;
    }
    /**
     * The total memory capacity as reported by the sum of all Kubernetes nodes resources, defined in MB.
     * 
    */
    public Integer memoryMb() {
        return this.memoryMb;
    }
    /**
     * Node count as reported by Kubernetes nodes resources.
     * 
    */
    public Integer nodeCount() {
        return this.nodeCount;
    }
    /**
     * Node providerID as reported by the first node in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the node_count will be zero and the node_provider_id will be empty.
     * 
    */
    public String nodeProviderId() {
        return this.nodeProviderId;
    }
    /**
     * The time at which these details were last updated. This update_time is different from the Membership-level update_time since EndpointDetails are updated internally for API consumers.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * vCPU count as reported by Kubernetes nodes resources.
     * 
    */
    public Integer vcpuCount() {
        return this.vcpuCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kubernetesApiServerVersion;
        private Integer memoryMb;
        private Integer nodeCount;
        private String nodeProviderId;
        private String updateTime;
        private Integer vcpuCount;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubernetesApiServerVersion = defaults.kubernetesApiServerVersion;
    	      this.memoryMb = defaults.memoryMb;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeProviderId = defaults.nodeProviderId;
    	      this.updateTime = defaults.updateTime;
    	      this.vcpuCount = defaults.vcpuCount;
        }

        public Builder kubernetesApiServerVersion(String kubernetesApiServerVersion) {
            this.kubernetesApiServerVersion = Objects.requireNonNull(kubernetesApiServerVersion);
            return this;
        }
        public Builder memoryMb(Integer memoryMb) {
            this.memoryMb = Objects.requireNonNull(memoryMb);
            return this;
        }
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        public Builder nodeProviderId(String nodeProviderId) {
            this.nodeProviderId = Objects.requireNonNull(nodeProviderId);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder vcpuCount(Integer vcpuCount) {
            this.vcpuCount = Objects.requireNonNull(vcpuCount);
            return this;
        }        public KubernetesMetadataResponse build() {
            return new KubernetesMetadataResponse(kubernetesApiServerVersion, memoryMb, nodeCount, nodeProviderId, updateTime, vcpuCount);
        }
    }
}
