// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.container_v1.inputs.PrivateClusterMasterGlobalAccessConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for private clusters.
 * 
 */
public final class PrivateClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateClusterConfigArgs Empty = new PrivateClusterConfigArgs();

    /**
     * Whether the master&#39;s internal IP address is used as the cluster endpoint.
     * 
     */
    @Import(name="enablePrivateEndpoint")
      private final @Nullable Output<Boolean> enablePrivateEndpoint;

    public Output<Boolean> enablePrivateEndpoint() {
        return this.enablePrivateEndpoint == null ? Codegen.empty() : this.enablePrivateEndpoint;
    }

    /**
     * Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
     * 
     */
    @Import(name="enablePrivateNodes")
      private final @Nullable Output<Boolean> enablePrivateNodes;

    public Output<Boolean> enablePrivateNodes() {
        return this.enablePrivateNodes == null ? Codegen.empty() : this.enablePrivateNodes;
    }

    /**
     * Controls master global access settings.
     * 
     */
    @Import(name="masterGlobalAccessConfig")
      private final @Nullable Output<PrivateClusterMasterGlobalAccessConfigArgs> masterGlobalAccessConfig;

    public Output<PrivateClusterMasterGlobalAccessConfigArgs> masterGlobalAccessConfig() {
        return this.masterGlobalAccessConfig == null ? Codegen.empty() : this.masterGlobalAccessConfig;
    }

    /**
     * The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster&#39;s network.
     * 
     */
    @Import(name="masterIpv4CidrBlock")
      private final @Nullable Output<String> masterIpv4CidrBlock;

    public Output<String> masterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock == null ? Codegen.empty() : this.masterIpv4CidrBlock;
    }

    public PrivateClusterConfigArgs(
        @Nullable Output<Boolean> enablePrivateEndpoint,
        @Nullable Output<Boolean> enablePrivateNodes,
        @Nullable Output<PrivateClusterMasterGlobalAccessConfigArgs> masterGlobalAccessConfig,
        @Nullable Output<String> masterIpv4CidrBlock) {
        this.enablePrivateEndpoint = enablePrivateEndpoint;
        this.enablePrivateNodes = enablePrivateNodes;
        this.masterGlobalAccessConfig = masterGlobalAccessConfig;
        this.masterIpv4CidrBlock = masterIpv4CidrBlock;
    }

    private PrivateClusterConfigArgs() {
        this.enablePrivateEndpoint = Codegen.empty();
        this.enablePrivateNodes = Codegen.empty();
        this.masterGlobalAccessConfig = Codegen.empty();
        this.masterIpv4CidrBlock = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enablePrivateEndpoint;
        private @Nullable Output<Boolean> enablePrivateNodes;
        private @Nullable Output<PrivateClusterMasterGlobalAccessConfigArgs> masterGlobalAccessConfig;
        private @Nullable Output<String> masterIpv4CidrBlock;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.masterGlobalAccessConfig = defaults.masterGlobalAccessConfig;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
        }

        public Builder enablePrivateEndpoint(@Nullable Output<Boolean> enablePrivateEndpoint) {
            this.enablePrivateEndpoint = enablePrivateEndpoint;
            return this;
        }
        public Builder enablePrivateEndpoint(@Nullable Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Codegen.ofNullable(enablePrivateEndpoint);
            return this;
        }
        public Builder enablePrivateNodes(@Nullable Output<Boolean> enablePrivateNodes) {
            this.enablePrivateNodes = enablePrivateNodes;
            return this;
        }
        public Builder enablePrivateNodes(@Nullable Boolean enablePrivateNodes) {
            this.enablePrivateNodes = Codegen.ofNullable(enablePrivateNodes);
            return this;
        }
        public Builder masterGlobalAccessConfig(@Nullable Output<PrivateClusterMasterGlobalAccessConfigArgs> masterGlobalAccessConfig) {
            this.masterGlobalAccessConfig = masterGlobalAccessConfig;
            return this;
        }
        public Builder masterGlobalAccessConfig(@Nullable PrivateClusterMasterGlobalAccessConfigArgs masterGlobalAccessConfig) {
            this.masterGlobalAccessConfig = Codegen.ofNullable(masterGlobalAccessConfig);
            return this;
        }
        public Builder masterIpv4CidrBlock(@Nullable Output<String> masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = masterIpv4CidrBlock;
            return this;
        }
        public Builder masterIpv4CidrBlock(@Nullable String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Codegen.ofNullable(masterIpv4CidrBlock);
            return this;
        }        public PrivateClusterConfigArgs build() {
            return new PrivateClusterConfigArgs(enablePrivateEndpoint, enablePrivateNodes, masterGlobalAccessConfig, masterIpv4CidrBlock);
        }
    }
}
