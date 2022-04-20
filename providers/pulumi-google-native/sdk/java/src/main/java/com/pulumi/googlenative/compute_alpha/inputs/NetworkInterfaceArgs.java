// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.NetworkInterfaceNicType;
import com.pulumi.googlenative.compute_alpha.enums.NetworkInterfaceStackType;
import com.pulumi.googlenative.compute_alpha.inputs.AccessConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.AliasIpRangeArgs;
import com.pulumi.googlenative.compute_alpha.inputs.NetworkInterfaceSubInterfaceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A network interface resource attached to an instance.
 * 
 */
public final class NetworkInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    /**
     * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
     * 
     */
    @Import(name="accessConfigs")
      private final @Nullable Output<List<AccessConfigArgs>> accessConfigs;

    public Output<List<AccessConfigArgs>> accessConfigs() {
        return this.accessConfigs == null ? Codegen.empty() : this.accessConfigs;
    }

    /**
     * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
     * 
     */
    @Import(name="aliasIpRanges")
      private final @Nullable Output<List<AliasIpRangeArgs>> aliasIpRanges;

    public Output<List<AliasIpRangeArgs>> aliasIpRanges() {
        return this.aliasIpRanges == null ? Codegen.empty() : this.aliasIpRanges;
    }

    /**
     * The prefix length of the primary internal IPv6 range.
     * 
     */
    @Import(name="internalIpv6PrefixLength")
      private final @Nullable Output<Integer> internalIpv6PrefixLength;

    public Output<Integer> internalIpv6PrefixLength() {
        return this.internalIpv6PrefixLength == null ? Codegen.empty() : this.internalIpv6PrefixLength;
    }

    /**
     * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * 
     */
    @Import(name="ipv6AccessConfigs")
      private final @Nullable Output<List<AccessConfigArgs>> ipv6AccessConfigs;

    public Output<List<AccessConfigArgs>> ipv6AccessConfigs() {
        return this.ipv6AccessConfigs == null ? Codegen.empty() : this.ipv6AccessConfigs;
    }

    /**
     * An IPv6 internal network address for this network interface.
     * 
     */
    @Import(name="ipv6Address")
      private final @Nullable Output<String> ipv6Address;

    public Output<String> ipv6Address() {
        return this.ipv6Address == null ? Codegen.empty() : this.ipv6Address;
    }

    /**
     * URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn&#39;t have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
     * 
     */
    @Import(name="networkIP")
      private final @Nullable Output<String> networkIP;

    public Output<String> networkIP() {
        return this.networkIP == null ? Codegen.empty() : this.networkIP;
    }

    /**
     * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    @Import(name="nicType")
      private final @Nullable Output<NetworkInterfaceNicType> nicType;

    public Output<NetworkInterfaceNicType> nicType() {
        return this.nicType == null ? Codegen.empty() : this.nicType;
    }

    /**
     * The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It&#39;ll be empty if not specified by the users.
     * 
     */
    @Import(name="queueCount")
      private final @Nullable Output<Integer> queueCount;

    public Output<Integer> queueCount() {
        return this.queueCount == null ? Codegen.empty() : this.queueCount;
    }

    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
     * 
     */
    @Import(name="stackType")
      private final @Nullable Output<NetworkInterfaceStackType> stackType;

    public Output<NetworkInterfaceStackType> stackType() {
        return this.stackType == null ? Codegen.empty() : this.stackType;
    }

    /**
     * SubInterfaces help enable L2 communication for the instance over subnetworks that support L2. Every network interface will get a default untagged (vlan not specified) subinterface. Users can specify additional tagged subinterfaces which are sub-fields to the Network Interface.
     * 
     */
    @Import(name="subinterfaces")
      private final @Nullable Output<List<NetworkInterfaceSubInterfaceArgs>> subinterfaces;

    public Output<List<NetworkInterfaceSubInterfaceArgs>> subinterfaces() {
        return this.subinterfaces == null ? Codegen.empty() : this.subinterfaces;
    }

    /**
     * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> subnetwork() {
        return this.subnetwork == null ? Codegen.empty() : this.subnetwork;
    }

    public NetworkInterfaceArgs(
        @Nullable Output<List<AccessConfigArgs>> accessConfigs,
        @Nullable Output<List<AliasIpRangeArgs>> aliasIpRanges,
        @Nullable Output<Integer> internalIpv6PrefixLength,
        @Nullable Output<List<AccessConfigArgs>> ipv6AccessConfigs,
        @Nullable Output<String> ipv6Address,
        @Nullable Output<String> network,
        @Nullable Output<String> networkIP,
        @Nullable Output<NetworkInterfaceNicType> nicType,
        @Nullable Output<Integer> queueCount,
        @Nullable Output<NetworkInterfaceStackType> stackType,
        @Nullable Output<List<NetworkInterfaceSubInterfaceArgs>> subinterfaces,
        @Nullable Output<String> subnetwork) {
        this.accessConfigs = accessConfigs;
        this.aliasIpRanges = aliasIpRanges;
        this.internalIpv6PrefixLength = internalIpv6PrefixLength;
        this.ipv6AccessConfigs = ipv6AccessConfigs;
        this.ipv6Address = ipv6Address;
        this.network = network;
        this.networkIP = networkIP;
        this.nicType = nicType;
        this.queueCount = queueCount;
        this.stackType = stackType;
        this.subinterfaces = subinterfaces;
        this.subnetwork = subnetwork;
    }

    private NetworkInterfaceArgs() {
        this.accessConfigs = Codegen.empty();
        this.aliasIpRanges = Codegen.empty();
        this.internalIpv6PrefixLength = Codegen.empty();
        this.ipv6AccessConfigs = Codegen.empty();
        this.ipv6Address = Codegen.empty();
        this.network = Codegen.empty();
        this.networkIP = Codegen.empty();
        this.nicType = Codegen.empty();
        this.queueCount = Codegen.empty();
        this.stackType = Codegen.empty();
        this.subinterfaces = Codegen.empty();
        this.subnetwork = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AccessConfigArgs>> accessConfigs;
        private @Nullable Output<List<AliasIpRangeArgs>> aliasIpRanges;
        private @Nullable Output<Integer> internalIpv6PrefixLength;
        private @Nullable Output<List<AccessConfigArgs>> ipv6AccessConfigs;
        private @Nullable Output<String> ipv6Address;
        private @Nullable Output<String> network;
        private @Nullable Output<String> networkIP;
        private @Nullable Output<NetworkInterfaceNicType> nicType;
        private @Nullable Output<Integer> queueCount;
        private @Nullable Output<NetworkInterfaceStackType> stackType;
        private @Nullable Output<List<NetworkInterfaceSubInterfaceArgs>> subinterfaces;
        private @Nullable Output<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.internalIpv6PrefixLength = defaults.internalIpv6PrefixLength;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.network = defaults.network;
    	      this.networkIP = defaults.networkIP;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subinterfaces = defaults.subinterfaces;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder accessConfigs(@Nullable Output<List<AccessConfigArgs>> accessConfigs) {
            this.accessConfigs = accessConfigs;
            return this;
        }
        public Builder accessConfigs(@Nullable List<AccessConfigArgs> accessConfigs) {
            this.accessConfigs = Codegen.ofNullable(accessConfigs);
            return this;
        }
        public Builder accessConfigs(AccessConfigArgs... accessConfigs) {
            return accessConfigs(List.of(accessConfigs));
        }
        public Builder aliasIpRanges(@Nullable Output<List<AliasIpRangeArgs>> aliasIpRanges) {
            this.aliasIpRanges = aliasIpRanges;
            return this;
        }
        public Builder aliasIpRanges(@Nullable List<AliasIpRangeArgs> aliasIpRanges) {
            this.aliasIpRanges = Codegen.ofNullable(aliasIpRanges);
            return this;
        }
        public Builder aliasIpRanges(AliasIpRangeArgs... aliasIpRanges) {
            return aliasIpRanges(List.of(aliasIpRanges));
        }
        public Builder internalIpv6PrefixLength(@Nullable Output<Integer> internalIpv6PrefixLength) {
            this.internalIpv6PrefixLength = internalIpv6PrefixLength;
            return this;
        }
        public Builder internalIpv6PrefixLength(@Nullable Integer internalIpv6PrefixLength) {
            this.internalIpv6PrefixLength = Codegen.ofNullable(internalIpv6PrefixLength);
            return this;
        }
        public Builder ipv6AccessConfigs(@Nullable Output<List<AccessConfigArgs>> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = ipv6AccessConfigs;
            return this;
        }
        public Builder ipv6AccessConfigs(@Nullable List<AccessConfigArgs> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Codegen.ofNullable(ipv6AccessConfigs);
            return this;
        }
        public Builder ipv6AccessConfigs(AccessConfigArgs... ipv6AccessConfigs) {
            return ipv6AccessConfigs(List.of(ipv6AccessConfigs));
        }
        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public Builder ipv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = Codegen.ofNullable(ipv6Address);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder networkIP(@Nullable Output<String> networkIP) {
            this.networkIP = networkIP;
            return this;
        }
        public Builder networkIP(@Nullable String networkIP) {
            this.networkIP = Codegen.ofNullable(networkIP);
            return this;
        }
        public Builder nicType(@Nullable Output<NetworkInterfaceNicType> nicType) {
            this.nicType = nicType;
            return this;
        }
        public Builder nicType(@Nullable NetworkInterfaceNicType nicType) {
            this.nicType = Codegen.ofNullable(nicType);
            return this;
        }
        public Builder queueCount(@Nullable Output<Integer> queueCount) {
            this.queueCount = queueCount;
            return this;
        }
        public Builder queueCount(@Nullable Integer queueCount) {
            this.queueCount = Codegen.ofNullable(queueCount);
            return this;
        }
        public Builder stackType(@Nullable Output<NetworkInterfaceStackType> stackType) {
            this.stackType = stackType;
            return this;
        }
        public Builder stackType(@Nullable NetworkInterfaceStackType stackType) {
            this.stackType = Codegen.ofNullable(stackType);
            return this;
        }
        public Builder subinterfaces(@Nullable Output<List<NetworkInterfaceSubInterfaceArgs>> subinterfaces) {
            this.subinterfaces = subinterfaces;
            return this;
        }
        public Builder subinterfaces(@Nullable List<NetworkInterfaceSubInterfaceArgs> subinterfaces) {
            this.subinterfaces = Codegen.ofNullable(subinterfaces);
            return this;
        }
        public Builder subinterfaces(NetworkInterfaceSubInterfaceArgs... subinterfaces) {
            return subinterfaces(List.of(subinterfaces));
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Codegen.ofNullable(subnetwork);
            return this;
        }        public NetworkInterfaceArgs build() {
            return new NetworkInterfaceArgs(accessConfigs, aliasIpRanges, internalIpv6PrefixLength, ipv6AccessConfigs, ipv6Address, network, networkIP, nicType, queueCount, stackType, subinterfaces, subnetwork);
        }
    }
}
