// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container_v1beta1.outputs.PrivateClusterMasterGlobalAccessConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivateClusterConfigResponse {
    /**
     * Whether the master&#39;s internal IP address is used as the cluster endpoint.
     * 
     */
    private final Boolean enablePrivateEndpoint;
    /**
     * Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
     * 
     */
    private final Boolean enablePrivateNodes;
    /**
     * Controls master global access settings.
     * 
     */
    private final PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig;
    /**
     * The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster&#39;s network.
     * 
     */
    private final String masterIpv4CidrBlock;
    /**
     * The peering name in the customer VPC used by this cluster.
     * 
     */
    private final String peeringName;
    /**
     * The internal IP address of this cluster&#39;s master endpoint.
     * 
     */
    private final String privateEndpoint;
    /**
     * The external IP address of this cluster&#39;s master endpoint.
     * 
     */
    private final String publicEndpoint;

    @CustomType.Constructor
    private PrivateClusterConfigResponse(
        @CustomType.Parameter("enablePrivateEndpoint") Boolean enablePrivateEndpoint,
        @CustomType.Parameter("enablePrivateNodes") Boolean enablePrivateNodes,
        @CustomType.Parameter("masterGlobalAccessConfig") PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig,
        @CustomType.Parameter("masterIpv4CidrBlock") String masterIpv4CidrBlock,
        @CustomType.Parameter("peeringName") String peeringName,
        @CustomType.Parameter("privateEndpoint") String privateEndpoint,
        @CustomType.Parameter("publicEndpoint") String publicEndpoint) {
        this.enablePrivateEndpoint = enablePrivateEndpoint;
        this.enablePrivateNodes = enablePrivateNodes;
        this.masterGlobalAccessConfig = masterGlobalAccessConfig;
        this.masterIpv4CidrBlock = masterIpv4CidrBlock;
        this.peeringName = peeringName;
        this.privateEndpoint = privateEndpoint;
        this.publicEndpoint = publicEndpoint;
    }

    /**
     * Whether the master&#39;s internal IP address is used as the cluster endpoint.
     * 
    */
    public Boolean enablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }
    /**
     * Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
     * 
    */
    public Boolean enablePrivateNodes() {
        return this.enablePrivateNodes;
    }
    /**
     * Controls master global access settings.
     * 
    */
    public PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig() {
        return this.masterGlobalAccessConfig;
    }
    /**
     * The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster&#39;s network.
     * 
    */
    public String masterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }
    /**
     * The peering name in the customer VPC used by this cluster.
     * 
    */
    public String peeringName() {
        return this.peeringName;
    }
    /**
     * The internal IP address of this cluster&#39;s master endpoint.
     * 
    */
    public String privateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * The external IP address of this cluster&#39;s master endpoint.
     * 
    */
    public String publicEndpoint() {
        return this.publicEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enablePrivateEndpoint;
        private Boolean enablePrivateNodes;
        private PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig;
        private String masterIpv4CidrBlock;
        private String peeringName;
        private String privateEndpoint;
        private String publicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateClusterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.masterGlobalAccessConfig = defaults.masterGlobalAccessConfig;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
    	      this.peeringName = defaults.peeringName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.publicEndpoint = defaults.publicEndpoint;
        }

        public Builder enablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
            return this;
        }
        public Builder enablePrivateNodes(Boolean enablePrivateNodes) {
            this.enablePrivateNodes = Objects.requireNonNull(enablePrivateNodes);
            return this;
        }
        public Builder masterGlobalAccessConfig(PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig) {
            this.masterGlobalAccessConfig = Objects.requireNonNull(masterGlobalAccessConfig);
            return this;
        }
        public Builder masterIpv4CidrBlock(String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
            return this;
        }
        public Builder peeringName(String peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }
        public Builder privateEndpoint(String privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
            return this;
        }
        public Builder publicEndpoint(String publicEndpoint) {
            this.publicEndpoint = Objects.requireNonNull(publicEndpoint);
            return this;
        }        public PrivateClusterConfigResponse build() {
            return new PrivateClusterConfigResponse(enablePrivateEndpoint, enablePrivateNodes, masterGlobalAccessConfig, masterIpv4CidrBlock, peeringName, privateEndpoint, publicEndpoint);
        }
    }
}
