// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.VirtualNetworkPeeringState;
import com.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.azurenative.network.inputs.VirtualNetworkBgpCommunitiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Peerings in a virtual network resource.
 * 
 */
public final class VirtualNetworkPeeringArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkPeeringArgs Empty = new VirtualNetworkPeeringArgs();

    /**
     * Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
     * 
     */
    @Import(name="allowForwardedTraffic")
      private final @Nullable Output<Boolean> allowForwardedTraffic;

    public Output<Boolean> allowForwardedTraffic() {
        return this.allowForwardedTraffic == null ? Codegen.empty() : this.allowForwardedTraffic;
    }

    /**
     * If gateway links can be used in remote virtual networking to link to this virtual network.
     * 
     */
    @Import(name="allowGatewayTransit")
      private final @Nullable Output<Boolean> allowGatewayTransit;

    public Output<Boolean> allowGatewayTransit() {
        return this.allowGatewayTransit == null ? Codegen.empty() : this.allowGatewayTransit;
    }

    /**
     * Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
     * 
     */
    @Import(name="allowVirtualNetworkAccess")
      private final @Nullable Output<Boolean> allowVirtualNetworkAccess;

    public Output<Boolean> allowVirtualNetworkAccess() {
        return this.allowVirtualNetworkAccess == null ? Codegen.empty() : this.allowVirtualNetworkAccess;
    }

    /**
     * If we need to verify the provisioning state of the remote gateway.
     * 
     */
    @Import(name="doNotVerifyRemoteGateways")
      private final @Nullable Output<Boolean> doNotVerifyRemoteGateways;

    public Output<Boolean> doNotVerifyRemoteGateways() {
        return this.doNotVerifyRemoteGateways == null ? Codegen.empty() : this.doNotVerifyRemoteGateways;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The status of the virtual network peering.
     * 
     */
    @Import(name="peeringState")
      private final @Nullable Output<Either<String,VirtualNetworkPeeringState>> peeringState;

    public Output<Either<String,VirtualNetworkPeeringState>> peeringState() {
        return this.peeringState == null ? Codegen.empty() : this.peeringState;
    }

    /**
     * The reference to the remote virtual network address space.
     * 
     */
    @Import(name="remoteAddressSpace")
      private final @Nullable Output<AddressSpaceArgs> remoteAddressSpace;

    public Output<AddressSpaceArgs> remoteAddressSpace() {
        return this.remoteAddressSpace == null ? Codegen.empty() : this.remoteAddressSpace;
    }

    /**
     * The reference to the remote virtual network&#39;s Bgp Communities.
     * 
     */
    @Import(name="remoteBgpCommunities")
      private final @Nullable Output<VirtualNetworkBgpCommunitiesArgs> remoteBgpCommunities;

    public Output<VirtualNetworkBgpCommunitiesArgs> remoteBgpCommunities() {
        return this.remoteBgpCommunities == null ? Codegen.empty() : this.remoteBgpCommunities;
    }

    /**
     * The reference to the remote virtual network. The remote virtual network can be in the same or different region (preview). See here to register for the preview and learn more (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     * 
     */
    @Import(name="remoteVirtualNetwork")
      private final @Nullable Output<SubResourceArgs> remoteVirtualNetwork;

    public Output<SubResourceArgs> remoteVirtualNetwork() {
        return this.remoteVirtualNetwork == null ? Codegen.empty() : this.remoteVirtualNetwork;
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
     * 
     */
    @Import(name="useRemoteGateways")
      private final @Nullable Output<Boolean> useRemoteGateways;

    public Output<Boolean> useRemoteGateways() {
        return this.useRemoteGateways == null ? Codegen.empty() : this.useRemoteGateways;
    }

    public VirtualNetworkPeeringArgs(
        @Nullable Output<Boolean> allowForwardedTraffic,
        @Nullable Output<Boolean> allowGatewayTransit,
        @Nullable Output<Boolean> allowVirtualNetworkAccess,
        @Nullable Output<Boolean> doNotVerifyRemoteGateways,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<Either<String,VirtualNetworkPeeringState>> peeringState,
        @Nullable Output<AddressSpaceArgs> remoteAddressSpace,
        @Nullable Output<VirtualNetworkBgpCommunitiesArgs> remoteBgpCommunities,
        @Nullable Output<SubResourceArgs> remoteVirtualNetwork,
        @Nullable Output<String> type,
        @Nullable Output<Boolean> useRemoteGateways) {
        this.allowForwardedTraffic = allowForwardedTraffic;
        this.allowGatewayTransit = allowGatewayTransit;
        this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
        this.doNotVerifyRemoteGateways = doNotVerifyRemoteGateways;
        this.id = id;
        this.name = name;
        this.peeringState = peeringState;
        this.remoteAddressSpace = remoteAddressSpace;
        this.remoteBgpCommunities = remoteBgpCommunities;
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        this.type = type;
        this.useRemoteGateways = useRemoteGateways;
    }

    private VirtualNetworkPeeringArgs() {
        this.allowForwardedTraffic = Codegen.empty();
        this.allowGatewayTransit = Codegen.empty();
        this.allowVirtualNetworkAccess = Codegen.empty();
        this.doNotVerifyRemoteGateways = Codegen.empty();
        this.id = Codegen.empty();
        this.name = Codegen.empty();
        this.peeringState = Codegen.empty();
        this.remoteAddressSpace = Codegen.empty();
        this.remoteBgpCommunities = Codegen.empty();
        this.remoteVirtualNetwork = Codegen.empty();
        this.type = Codegen.empty();
        this.useRemoteGateways = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowForwardedTraffic;
        private @Nullable Output<Boolean> allowGatewayTransit;
        private @Nullable Output<Boolean> allowVirtualNetworkAccess;
        private @Nullable Output<Boolean> doNotVerifyRemoteGateways;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<Either<String,VirtualNetworkPeeringState>> peeringState;
        private @Nullable Output<AddressSpaceArgs> remoteAddressSpace;
        private @Nullable Output<VirtualNetworkBgpCommunitiesArgs> remoteBgpCommunities;
        private @Nullable Output<SubResourceArgs> remoteVirtualNetwork;
        private @Nullable Output<String> type;
        private @Nullable Output<Boolean> useRemoteGateways;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowForwardedTraffic = defaults.allowForwardedTraffic;
    	      this.allowGatewayTransit = defaults.allowGatewayTransit;
    	      this.allowVirtualNetworkAccess = defaults.allowVirtualNetworkAccess;
    	      this.doNotVerifyRemoteGateways = defaults.doNotVerifyRemoteGateways;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peeringState = defaults.peeringState;
    	      this.remoteAddressSpace = defaults.remoteAddressSpace;
    	      this.remoteBgpCommunities = defaults.remoteBgpCommunities;
    	      this.remoteVirtualNetwork = defaults.remoteVirtualNetwork;
    	      this.type = defaults.type;
    	      this.useRemoteGateways = defaults.useRemoteGateways;
        }

        public Builder allowForwardedTraffic(@Nullable Output<Boolean> allowForwardedTraffic) {
            this.allowForwardedTraffic = allowForwardedTraffic;
            return this;
        }
        public Builder allowForwardedTraffic(@Nullable Boolean allowForwardedTraffic) {
            this.allowForwardedTraffic = Codegen.ofNullable(allowForwardedTraffic);
            return this;
        }
        public Builder allowGatewayTransit(@Nullable Output<Boolean> allowGatewayTransit) {
            this.allowGatewayTransit = allowGatewayTransit;
            return this;
        }
        public Builder allowGatewayTransit(@Nullable Boolean allowGatewayTransit) {
            this.allowGatewayTransit = Codegen.ofNullable(allowGatewayTransit);
            return this;
        }
        public Builder allowVirtualNetworkAccess(@Nullable Output<Boolean> allowVirtualNetworkAccess) {
            this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
            return this;
        }
        public Builder allowVirtualNetworkAccess(@Nullable Boolean allowVirtualNetworkAccess) {
            this.allowVirtualNetworkAccess = Codegen.ofNullable(allowVirtualNetworkAccess);
            return this;
        }
        public Builder doNotVerifyRemoteGateways(@Nullable Output<Boolean> doNotVerifyRemoteGateways) {
            this.doNotVerifyRemoteGateways = doNotVerifyRemoteGateways;
            return this;
        }
        public Builder doNotVerifyRemoteGateways(@Nullable Boolean doNotVerifyRemoteGateways) {
            this.doNotVerifyRemoteGateways = Codegen.ofNullable(doNotVerifyRemoteGateways);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder peeringState(@Nullable Output<Either<String,VirtualNetworkPeeringState>> peeringState) {
            this.peeringState = peeringState;
            return this;
        }
        public Builder peeringState(@Nullable Either<String,VirtualNetworkPeeringState> peeringState) {
            this.peeringState = Codegen.ofNullable(peeringState);
            return this;
        }
        public Builder remoteAddressSpace(@Nullable Output<AddressSpaceArgs> remoteAddressSpace) {
            this.remoteAddressSpace = remoteAddressSpace;
            return this;
        }
        public Builder remoteAddressSpace(@Nullable AddressSpaceArgs remoteAddressSpace) {
            this.remoteAddressSpace = Codegen.ofNullable(remoteAddressSpace);
            return this;
        }
        public Builder remoteBgpCommunities(@Nullable Output<VirtualNetworkBgpCommunitiesArgs> remoteBgpCommunities) {
            this.remoteBgpCommunities = remoteBgpCommunities;
            return this;
        }
        public Builder remoteBgpCommunities(@Nullable VirtualNetworkBgpCommunitiesArgs remoteBgpCommunities) {
            this.remoteBgpCommunities = Codegen.ofNullable(remoteBgpCommunities);
            return this;
        }
        public Builder remoteVirtualNetwork(@Nullable Output<SubResourceArgs> remoteVirtualNetwork) {
            this.remoteVirtualNetwork = remoteVirtualNetwork;
            return this;
        }
        public Builder remoteVirtualNetwork(@Nullable SubResourceArgs remoteVirtualNetwork) {
            this.remoteVirtualNetwork = Codegen.ofNullable(remoteVirtualNetwork);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder useRemoteGateways(@Nullable Output<Boolean> useRemoteGateways) {
            this.useRemoteGateways = useRemoteGateways;
            return this;
        }
        public Builder useRemoteGateways(@Nullable Boolean useRemoteGateways) {
            this.useRemoteGateways = Codegen.ofNullable(useRemoteGateways);
            return this;
        }        public VirtualNetworkPeeringArgs build() {
            return new VirtualNetworkPeeringArgs(allowForwardedTraffic, allowGatewayTransit, allowVirtualNetworkAccess, doNotVerifyRemoteGateways, id, name, peeringState, remoteAddressSpace, remoteBgpCommunities, remoteVirtualNetwork, type, useRemoteGateways);
        }
    }
}
