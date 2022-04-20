// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_beta.enums.RouterBgpPeerAdvertiseMode;
import com.pulumi.googlenative.compute_beta.enums.RouterBgpPeerAdvertisedGroupsItem;
import com.pulumi.googlenative.compute_beta.enums.RouterBgpPeerEnable;
import com.pulumi.googlenative.compute_beta.inputs.RouterAdvertisedIpRangeArgs;
import com.pulumi.googlenative.compute_beta.inputs.RouterBgpPeerBfdArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterBgpPeerArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouterBgpPeerArgs Empty = new RouterBgpPeerArgs();

    /**
     * User-specified flag to indicate which mode to use for advertisement.
     * 
     */
    @Import(name="advertiseMode")
      private final @Nullable Output<RouterBgpPeerAdvertiseMode> advertiseMode;

    public Output<RouterBgpPeerAdvertiseMode> advertiseMode() {
        return this.advertiseMode == null ? Codegen.empty() : this.advertiseMode;
    }

    /**
     * User-specified list of prefix groups to advertise in custom mode, which can take one of the following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets. - ALL_VPC_SUBNETS: Advertises the router&#39;s own VPC subnets. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the &#34;bgp&#34; message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
     * 
     */
    @Import(name="advertisedGroups")
      private final @Nullable Output<List<RouterBgpPeerAdvertisedGroupsItem>> advertisedGroups;

    public Output<List<RouterBgpPeerAdvertisedGroupsItem>> advertisedGroups() {
        return this.advertisedGroups == null ? Codegen.empty() : this.advertisedGroups;
    }

    /**
     * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the &#34;bgp&#34; message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
     * 
     */
    @Import(name="advertisedIpRanges")
      private final @Nullable Output<List<RouterAdvertisedIpRangeArgs>> advertisedIpRanges;

    public Output<List<RouterAdvertisedIpRangeArgs>> advertisedIpRanges() {
        return this.advertisedIpRanges == null ? Codegen.empty() : this.advertisedIpRanges;
    }

    /**
     * The priority of routes advertised to this BGP peer. Where there is more than one matching route of maximum length, the routes with the lowest priority value win.
     * 
     */
    @Import(name="advertisedRoutePriority")
      private final @Nullable Output<Integer> advertisedRoutePriority;

    public Output<Integer> advertisedRoutePriority() {
        return this.advertisedRoutePriority == null ? Codegen.empty() : this.advertisedRoutePriority;
    }

    /**
     * BFD configuration for the BGP peering.
     * 
     */
    @Import(name="bfd")
      private final @Nullable Output<RouterBgpPeerBfdArgs> bfd;

    public Output<RouterBgpPeerBfdArgs> bfd() {
        return this.bfd == null ? Codegen.empty() : this.bfd;
    }

    /**
     * The status of the BGP peer connection. If set to FALSE, any active session with the peer is terminated and all associated routing information is removed. If set to TRUE, the peer connection can be established with routing information. The default is TRUE.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<RouterBgpPeerEnable> enable;

    public Output<RouterBgpPeerEnable> enable() {
        return this.enable == null ? Codegen.empty() : this.enable;
    }

    /**
     * Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
     * 
     */
    @Import(name="enableIpv6")
      private final @Nullable Output<Boolean> enableIpv6;

    public Output<Boolean> enableIpv6() {
        return this.enableIpv6 == null ? Codegen.empty() : this.enableIpv6;
    }

    /**
     * Name of the interface the BGP peer is associated with.
     * 
     */
    @Import(name="interfaceName")
      private final @Nullable Output<String> interfaceName;

    public Output<String> interfaceName() {
        return this.interfaceName == null ? Codegen.empty() : this.interfaceName;
    }

    /**
     * IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> ipAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    /**
     * IPv6 address of the interface inside Google Cloud Platform.
     * 
     */
    @Import(name="ipv6NexthopAddress")
      private final @Nullable Output<String> ipv6NexthopAddress;

    public Output<String> ipv6NexthopAddress() {
        return this.ipv6NexthopAddress == null ? Codegen.empty() : this.ipv6NexthopAddress;
    }

    /**
     * Name of this BGP peer. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.
     * 
     */
    @Import(name="peerAsn")
      private final @Nullable Output<Integer> peerAsn;

    public Output<Integer> peerAsn() {
        return this.peerAsn == null ? Codegen.empty() : this.peerAsn;
    }

    /**
     * IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.
     * 
     */
    @Import(name="peerIpAddress")
      private final @Nullable Output<String> peerIpAddress;

    public Output<String> peerIpAddress() {
        return this.peerIpAddress == null ? Codegen.empty() : this.peerIpAddress;
    }

    /**
     * IPv6 address of the BGP interface outside Google Cloud Platform.
     * 
     */
    @Import(name="peerIpv6NexthopAddress")
      private final @Nullable Output<String> peerIpv6NexthopAddress;

    public Output<String> peerIpv6NexthopAddress() {
        return this.peerIpv6NexthopAddress == null ? Codegen.empty() : this.peerIpv6NexthopAddress;
    }

    /**
     * URI of the VM instance that is used as third-party router appliances such as Next Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance must be located in zones contained in the same region as this Cloud Router. The VM instance is the peer side of the BGP session.
     * 
     */
    @Import(name="routerApplianceInstance")
      private final @Nullable Output<String> routerApplianceInstance;

    public Output<String> routerApplianceInstance() {
        return this.routerApplianceInstance == null ? Codegen.empty() : this.routerApplianceInstance;
    }

    public RouterBgpPeerArgs(
        @Nullable Output<RouterBgpPeerAdvertiseMode> advertiseMode,
        @Nullable Output<List<RouterBgpPeerAdvertisedGroupsItem>> advertisedGroups,
        @Nullable Output<List<RouterAdvertisedIpRangeArgs>> advertisedIpRanges,
        @Nullable Output<Integer> advertisedRoutePriority,
        @Nullable Output<RouterBgpPeerBfdArgs> bfd,
        @Nullable Output<RouterBgpPeerEnable> enable,
        @Nullable Output<Boolean> enableIpv6,
        @Nullable Output<String> interfaceName,
        @Nullable Output<String> ipAddress,
        @Nullable Output<String> ipv6NexthopAddress,
        @Nullable Output<String> name,
        @Nullable Output<Integer> peerAsn,
        @Nullable Output<String> peerIpAddress,
        @Nullable Output<String> peerIpv6NexthopAddress,
        @Nullable Output<String> routerApplianceInstance) {
        this.advertiseMode = advertiseMode;
        this.advertisedGroups = advertisedGroups;
        this.advertisedIpRanges = advertisedIpRanges;
        this.advertisedRoutePriority = advertisedRoutePriority;
        this.bfd = bfd;
        this.enable = enable;
        this.enableIpv6 = enableIpv6;
        this.interfaceName = interfaceName;
        this.ipAddress = ipAddress;
        this.ipv6NexthopAddress = ipv6NexthopAddress;
        this.name = name;
        this.peerAsn = peerAsn;
        this.peerIpAddress = peerIpAddress;
        this.peerIpv6NexthopAddress = peerIpv6NexthopAddress;
        this.routerApplianceInstance = routerApplianceInstance;
    }

    private RouterBgpPeerArgs() {
        this.advertiseMode = Codegen.empty();
        this.advertisedGroups = Codegen.empty();
        this.advertisedIpRanges = Codegen.empty();
        this.advertisedRoutePriority = Codegen.empty();
        this.bfd = Codegen.empty();
        this.enable = Codegen.empty();
        this.enableIpv6 = Codegen.empty();
        this.interfaceName = Codegen.empty();
        this.ipAddress = Codegen.empty();
        this.ipv6NexthopAddress = Codegen.empty();
        this.name = Codegen.empty();
        this.peerAsn = Codegen.empty();
        this.peerIpAddress = Codegen.empty();
        this.peerIpv6NexthopAddress = Codegen.empty();
        this.routerApplianceInstance = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpPeerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RouterBgpPeerAdvertiseMode> advertiseMode;
        private @Nullable Output<List<RouterBgpPeerAdvertisedGroupsItem>> advertisedGroups;
        private @Nullable Output<List<RouterAdvertisedIpRangeArgs>> advertisedIpRanges;
        private @Nullable Output<Integer> advertisedRoutePriority;
        private @Nullable Output<RouterBgpPeerBfdArgs> bfd;
        private @Nullable Output<RouterBgpPeerEnable> enable;
        private @Nullable Output<Boolean> enableIpv6;
        private @Nullable Output<String> interfaceName;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<String> ipv6NexthopAddress;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> peerAsn;
        private @Nullable Output<String> peerIpAddress;
        private @Nullable Output<String> peerIpv6NexthopAddress;
        private @Nullable Output<String> routerApplianceInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpPeerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.advertisedRoutePriority = defaults.advertisedRoutePriority;
    	      this.bfd = defaults.bfd;
    	      this.enable = defaults.enable;
    	      this.enableIpv6 = defaults.enableIpv6;
    	      this.interfaceName = defaults.interfaceName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipv6NexthopAddress = defaults.ipv6NexthopAddress;
    	      this.name = defaults.name;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerIpAddress = defaults.peerIpAddress;
    	      this.peerIpv6NexthopAddress = defaults.peerIpv6NexthopAddress;
    	      this.routerApplianceInstance = defaults.routerApplianceInstance;
        }

        public Builder advertiseMode(@Nullable Output<RouterBgpPeerAdvertiseMode> advertiseMode) {
            this.advertiseMode = advertiseMode;
            return this;
        }
        public Builder advertiseMode(@Nullable RouterBgpPeerAdvertiseMode advertiseMode) {
            this.advertiseMode = Codegen.ofNullable(advertiseMode);
            return this;
        }
        public Builder advertisedGroups(@Nullable Output<List<RouterBgpPeerAdvertisedGroupsItem>> advertisedGroups) {
            this.advertisedGroups = advertisedGroups;
            return this;
        }
        public Builder advertisedGroups(@Nullable List<RouterBgpPeerAdvertisedGroupsItem> advertisedGroups) {
            this.advertisedGroups = Codegen.ofNullable(advertisedGroups);
            return this;
        }
        public Builder advertisedGroups(RouterBgpPeerAdvertisedGroupsItem... advertisedGroups) {
            return advertisedGroups(List.of(advertisedGroups));
        }
        public Builder advertisedIpRanges(@Nullable Output<List<RouterAdvertisedIpRangeArgs>> advertisedIpRanges) {
            this.advertisedIpRanges = advertisedIpRanges;
            return this;
        }
        public Builder advertisedIpRanges(@Nullable List<RouterAdvertisedIpRangeArgs> advertisedIpRanges) {
            this.advertisedIpRanges = Codegen.ofNullable(advertisedIpRanges);
            return this;
        }
        public Builder advertisedIpRanges(RouterAdvertisedIpRangeArgs... advertisedIpRanges) {
            return advertisedIpRanges(List.of(advertisedIpRanges));
        }
        public Builder advertisedRoutePriority(@Nullable Output<Integer> advertisedRoutePriority) {
            this.advertisedRoutePriority = advertisedRoutePriority;
            return this;
        }
        public Builder advertisedRoutePriority(@Nullable Integer advertisedRoutePriority) {
            this.advertisedRoutePriority = Codegen.ofNullable(advertisedRoutePriority);
            return this;
        }
        public Builder bfd(@Nullable Output<RouterBgpPeerBfdArgs> bfd) {
            this.bfd = bfd;
            return this;
        }
        public Builder bfd(@Nullable RouterBgpPeerBfdArgs bfd) {
            this.bfd = Codegen.ofNullable(bfd);
            return this;
        }
        public Builder enable(@Nullable Output<RouterBgpPeerEnable> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable RouterBgpPeerEnable enable) {
            this.enable = Codegen.ofNullable(enable);
            return this;
        }
        public Builder enableIpv6(@Nullable Output<Boolean> enableIpv6) {
            this.enableIpv6 = enableIpv6;
            return this;
        }
        public Builder enableIpv6(@Nullable Boolean enableIpv6) {
            this.enableIpv6 = Codegen.ofNullable(enableIpv6);
            return this;
        }
        public Builder interfaceName(@Nullable Output<String> interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }
        public Builder interfaceName(@Nullable String interfaceName) {
            this.interfaceName = Codegen.ofNullable(interfaceName);
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }
        public Builder ipv6NexthopAddress(@Nullable Output<String> ipv6NexthopAddress) {
            this.ipv6NexthopAddress = ipv6NexthopAddress;
            return this;
        }
        public Builder ipv6NexthopAddress(@Nullable String ipv6NexthopAddress) {
            this.ipv6NexthopAddress = Codegen.ofNullable(ipv6NexthopAddress);
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
        public Builder peerAsn(@Nullable Output<Integer> peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public Builder peerAsn(@Nullable Integer peerAsn) {
            this.peerAsn = Codegen.ofNullable(peerAsn);
            return this;
        }
        public Builder peerIpAddress(@Nullable Output<String> peerIpAddress) {
            this.peerIpAddress = peerIpAddress;
            return this;
        }
        public Builder peerIpAddress(@Nullable String peerIpAddress) {
            this.peerIpAddress = Codegen.ofNullable(peerIpAddress);
            return this;
        }
        public Builder peerIpv6NexthopAddress(@Nullable Output<String> peerIpv6NexthopAddress) {
            this.peerIpv6NexthopAddress = peerIpv6NexthopAddress;
            return this;
        }
        public Builder peerIpv6NexthopAddress(@Nullable String peerIpv6NexthopAddress) {
            this.peerIpv6NexthopAddress = Codegen.ofNullable(peerIpv6NexthopAddress);
            return this;
        }
        public Builder routerApplianceInstance(@Nullable Output<String> routerApplianceInstance) {
            this.routerApplianceInstance = routerApplianceInstance;
            return this;
        }
        public Builder routerApplianceInstance(@Nullable String routerApplianceInstance) {
            this.routerApplianceInstance = Codegen.ofNullable(routerApplianceInstance);
            return this;
        }        public RouterBgpPeerArgs build() {
            return new RouterBgpPeerArgs(advertiseMode, advertisedGroups, advertisedIpRanges, advertisedRoutePriority, bfd, enable, enableIpv6, interfaceName, ipAddress, ipv6NexthopAddress, name, peerAsn, peerIpAddress, peerIpv6NexthopAddress, routerApplianceInstance);
        }
    }
}
