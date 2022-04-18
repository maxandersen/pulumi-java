// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.inputs;

import com.pulumi.azurenative.machinelearningcompute.inputs.KubernetesClusterPropertiesResponse;
import com.pulumi.azurenative.machinelearningcompute.inputs.SystemServiceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the container service backing the cluster
 * 
 */
public final class AcsClusterPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final AcsClusterPropertiesResponse Empty = new AcsClusterPropertiesResponse();

    /**
     * The number of agent nodes in the Container Service. This can be changed to scale the cluster.
     * 
     */
    @Import(name="agentCount")
      private final @Nullable Integer agentCount;

    public Optional<Integer> agentCount() {
        return this.agentCount == null ? Optional.empty() : Optional.ofNullable(this.agentCount);
    }

    /**
     * The Azure VM size of the agent VM nodes. This cannot be changed once the cluster is created. This list is non exhaustive; refer to https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes for the possible VM sizes.
     * 
     */
    @Import(name="agentVmSize")
      private final @Nullable String agentVmSize;

    public Optional<String> agentVmSize() {
        return this.agentVmSize == null ? Optional.empty() : Optional.ofNullable(this.agentVmSize);
    }

    /**
     * The FQDN of the cluster.
     * 
     */
    @Import(name="clusterFqdn", required=true)
      private final String clusterFqdn;

    public String clusterFqdn() {
        return this.clusterFqdn;
    }

    /**
     * The number of master nodes in the container service.
     * 
     */
    @Import(name="masterCount")
      private final @Nullable Integer masterCount;

    public Optional<Integer> masterCount() {
        return this.masterCount == null ? Optional.empty() : Optional.ofNullable(this.masterCount);
    }

    /**
     * Orchestrator specific properties
     * 
     */
    @Import(name="orchestratorProperties")
      private final @Nullable KubernetesClusterPropertiesResponse orchestratorProperties;

    public Optional<KubernetesClusterPropertiesResponse> orchestratorProperties() {
        return this.orchestratorProperties == null ? Optional.empty() : Optional.ofNullable(this.orchestratorProperties);
    }

    /**
     * Type of orchestrator. It cannot be changed once the cluster is created.
     * 
     */
    @Import(name="orchestratorType", required=true)
      private final String orchestratorType;

    public String orchestratorType() {
        return this.orchestratorType;
    }

    /**
     * The system services deployed to the cluster
     * 
     */
    @Import(name="systemServices")
      private final @Nullable List<SystemServiceResponse> systemServices;

    public List<SystemServiceResponse> systemServices() {
        return this.systemServices == null ? List.of() : this.systemServices;
    }

    public AcsClusterPropertiesResponse(
        @Nullable Integer agentCount,
        @Nullable String agentVmSize,
        String clusterFqdn,
        @Nullable Integer masterCount,
        @Nullable KubernetesClusterPropertiesResponse orchestratorProperties,
        String orchestratorType,
        @Nullable List<SystemServiceResponse> systemServices) {
        this.agentCount = agentCount == null ? 2 : agentCount;
        this.agentVmSize = agentVmSize == null ? "Standard_D3_v2" : agentVmSize;
        this.clusterFqdn = Objects.requireNonNull(clusterFqdn, "expected parameter 'clusterFqdn' to be non-null");
        this.masterCount = masterCount == null ? 1 : masterCount;
        this.orchestratorProperties = orchestratorProperties;
        this.orchestratorType = Objects.requireNonNull(orchestratorType, "expected parameter 'orchestratorType' to be non-null");
        this.systemServices = systemServices;
    }

    private AcsClusterPropertiesResponse() {
        this.agentCount = null;
        this.agentVmSize = null;
        this.clusterFqdn = null;
        this.masterCount = null;
        this.orchestratorProperties = null;
        this.orchestratorType = null;
        this.systemServices = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcsClusterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer agentCount;
        private @Nullable String agentVmSize;
        private String clusterFqdn;
        private @Nullable Integer masterCount;
        private @Nullable KubernetesClusterPropertiesResponse orchestratorProperties;
        private String orchestratorType;
        private @Nullable List<SystemServiceResponse> systemServices;

        public Builder() {
    	      // Empty
        }

        public Builder(AcsClusterPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentCount = defaults.agentCount;
    	      this.agentVmSize = defaults.agentVmSize;
    	      this.clusterFqdn = defaults.clusterFqdn;
    	      this.masterCount = defaults.masterCount;
    	      this.orchestratorProperties = defaults.orchestratorProperties;
    	      this.orchestratorType = defaults.orchestratorType;
    	      this.systemServices = defaults.systemServices;
        }

        public Builder agentCount(@Nullable Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Builder agentVmSize(@Nullable String agentVmSize) {
            this.agentVmSize = agentVmSize;
            return this;
        }
        public Builder clusterFqdn(String clusterFqdn) {
            this.clusterFqdn = Objects.requireNonNull(clusterFqdn);
            return this;
        }
        public Builder masterCount(@Nullable Integer masterCount) {
            this.masterCount = masterCount;
            return this;
        }
        public Builder orchestratorProperties(@Nullable KubernetesClusterPropertiesResponse orchestratorProperties) {
            this.orchestratorProperties = orchestratorProperties;
            return this;
        }
        public Builder orchestratorType(String orchestratorType) {
            this.orchestratorType = Objects.requireNonNull(orchestratorType);
            return this;
        }
        public Builder systemServices(@Nullable List<SystemServiceResponse> systemServices) {
            this.systemServices = systemServices;
            return this;
        }
        public Builder systemServices(SystemServiceResponse... systemServices) {
            return systemServices(List.of(systemServices));
        }        public AcsClusterPropertiesResponse build() {
            return new AcsClusterPropertiesResponse(agentCount, agentVmSize, clusterFqdn, masterCount, orchestratorProperties, orchestratorType, systemServices);
        }
    }
}
