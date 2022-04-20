// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.inputs.PrivateClusterMasterGlobalAccessConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration options for private clusters.
 * 
 */
public final class PrivateClusterConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateClusterConfigResponse Empty = new PrivateClusterConfigResponse();

    /**
     * Whether the master&#39;s internal IP address is used as the cluster endpoint.
     * 
     */
    @Import(name="enablePrivateEndpoint", required=true)
      private final Boolean enablePrivateEndpoint;

    public Boolean enablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }

    /**
     * Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
     * 
     */
    @Import(name="enablePrivateNodes", required=true)
      private final Boolean enablePrivateNodes;

    public Boolean enablePrivateNodes() {
        return this.enablePrivateNodes;
    }

    /**
     * Controls master global access settings.
     * 
     */
    @Import(name="masterGlobalAccessConfig", required=true)
      private final PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig;

    public PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig() {
        return this.masterGlobalAccessConfig;
    }

    /**
     * The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster&#39;s network.
     * 
     */
    @Import(name="masterIpv4CidrBlock", required=true)
      private final String masterIpv4CidrBlock;

    public String masterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }

    /**
     * The peering name in the customer VPC used by this cluster.
     * 
     */
    @Import(name="peeringName", required=true)
      private final String peeringName;

    public String peeringName() {
        return this.peeringName;
    }

    /**
     * The internal IP address of this cluster&#39;s master endpoint.
     * 
     */
    @Import(name="privateEndpoint", required=true)
      private final String privateEndpoint;

    public String privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * The external IP address of this cluster&#39;s master endpoint.
     * 
     */
    @Import(name="publicEndpoint", required=true)
      private final String publicEndpoint;

    public String publicEndpoint() {
        return this.publicEndpoint;
    }

    public PrivateClusterConfigResponse(
        Boolean enablePrivateEndpoint,
        Boolean enablePrivateNodes,
        PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig,
        String masterIpv4CidrBlock,
        String peeringName,
        String privateEndpoint,
        String publicEndpoint) {
        this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint, "expected parameter 'enablePrivateEndpoint' to be non-null");
        this.enablePrivateNodes = Objects.requireNonNull(enablePrivateNodes, "expected parameter 'enablePrivateNodes' to be non-null");
        this.masterGlobalAccessConfig = Objects.requireNonNull(masterGlobalAccessConfig, "expected parameter 'masterGlobalAccessConfig' to be non-null");
        this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock, "expected parameter 'masterIpv4CidrBlock' to be non-null");
        this.peeringName = Objects.requireNonNull(peeringName, "expected parameter 'peeringName' to be non-null");
        this.privateEndpoint = Objects.requireNonNull(privateEndpoint, "expected parameter 'privateEndpoint' to be non-null");
        this.publicEndpoint = Objects.requireNonNull(publicEndpoint, "expected parameter 'publicEndpoint' to be non-null");
    }

    private PrivateClusterConfigResponse() {
        this.enablePrivateEndpoint = null;
        this.enablePrivateNodes = null;
        this.masterGlobalAccessConfig = null;
        this.masterIpv4CidrBlock = null;
        this.peeringName = null;
        this.privateEndpoint = null;
        this.publicEndpoint = null;
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
