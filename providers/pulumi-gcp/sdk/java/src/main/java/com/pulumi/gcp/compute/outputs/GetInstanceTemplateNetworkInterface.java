// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetInstanceTemplateNetworkInterfaceAccessConfig;
import com.pulumi.gcp.compute.outputs.GetInstanceTemplateNetworkInterfaceAliasIpRange;
import com.pulumi.gcp.compute.outputs.GetInstanceTemplateNetworkInterfaceIpv6AccessConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceTemplateNetworkInterface {
    /**
     * Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Omit to ensure that the instance
     * is not accessible from the Internet (this means that ssh provisioners will
     * not work unless you are running the prvovider can send traffic to the instance&#39;s
     * network (e.g. via tunnel or because it is running on another cloud instance
     * on that network). This block can be repeated multiple times. Structure documented below.
     * 
     */
    private final List<GetInstanceTemplateNetworkInterfaceAccessConfig> accessConfigs;
    /**
     * An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * 
     */
    private final List<GetInstanceTemplateNetworkInterfaceAliasIpRange> aliasIpRanges;
    private final List<GetInstanceTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs;
    private final String ipv6AccessType;
    /**
     * The name of the instance template. One of `name` or `filter` must be provided.
     * 
     */
    private final String name;
    /**
     * The name or self_link of the network to attach this interface to.
     * Use `network` attribute for Legacy or Auto subnetted networks and
     * `subnetwork` for custom subnetted networks.
     * 
     */
    private final String network;
    /**
     * The private IP address to assign to the instance. If
     * empty, the address will be automatically assigned.
     * 
     */
    private final String networkIp;
    private final String nicType;
    private final Integer queueCount;
    private final String stackType;
    /**
     * the name of the subnetwork to attach this interface
     * to. The subnetwork must exist in the same `region` this instance will be
     * created in. Either `network` or `subnetwork` must be provided.
     * 
     */
    private final String subnetwork;
    /**
     * The ID of the project in which the subnetwork belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    private final String subnetworkProject;

    @CustomType.Constructor
    private GetInstanceTemplateNetworkInterface(
        @CustomType.Parameter("accessConfigs") List<GetInstanceTemplateNetworkInterfaceAccessConfig> accessConfigs,
        @CustomType.Parameter("aliasIpRanges") List<GetInstanceTemplateNetworkInterfaceAliasIpRange> aliasIpRanges,
        @CustomType.Parameter("ipv6AccessConfigs") List<GetInstanceTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs,
        @CustomType.Parameter("ipv6AccessType") String ipv6AccessType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("networkIp") String networkIp,
        @CustomType.Parameter("nicType") String nicType,
        @CustomType.Parameter("queueCount") Integer queueCount,
        @CustomType.Parameter("stackType") String stackType,
        @CustomType.Parameter("subnetwork") String subnetwork,
        @CustomType.Parameter("subnetworkProject") String subnetworkProject) {
        this.accessConfigs = accessConfigs;
        this.aliasIpRanges = aliasIpRanges;
        this.ipv6AccessConfigs = ipv6AccessConfigs;
        this.ipv6AccessType = ipv6AccessType;
        this.name = name;
        this.network = network;
        this.networkIp = networkIp;
        this.nicType = nicType;
        this.queueCount = queueCount;
        this.stackType = stackType;
        this.subnetwork = subnetwork;
        this.subnetworkProject = subnetworkProject;
    }

    /**
     * Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Omit to ensure that the instance
     * is not accessible from the Internet (this means that ssh provisioners will
     * not work unless you are running the prvovider can send traffic to the instance&#39;s
     * network (e.g. via tunnel or because it is running on another cloud instance
     * on that network). This block can be repeated multiple times. Structure documented below.
     * 
    */
    public List<GetInstanceTemplateNetworkInterfaceAccessConfig> accessConfigs() {
        return this.accessConfigs;
    }
    /**
     * An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * 
    */
    public List<GetInstanceTemplateNetworkInterfaceAliasIpRange> aliasIpRanges() {
        return this.aliasIpRanges;
    }
    public List<GetInstanceTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs() {
        return this.ipv6AccessConfigs;
    }
    public String ipv6AccessType() {
        return this.ipv6AccessType;
    }
    /**
     * The name of the instance template. One of `name` or `filter` must be provided.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The name or self_link of the network to attach this interface to.
     * Use `network` attribute for Legacy or Auto subnetted networks and
     * `subnetwork` for custom subnetted networks.
     * 
    */
    public String network() {
        return this.network;
    }
    /**
     * The private IP address to assign to the instance. If
     * empty, the address will be automatically assigned.
     * 
    */
    public String networkIp() {
        return this.networkIp;
    }
    public String nicType() {
        return this.nicType;
    }
    public Integer queueCount() {
        return this.queueCount;
    }
    public String stackType() {
        return this.stackType;
    }
    /**
     * the name of the subnetwork to attach this interface
     * to. The subnetwork must exist in the same `region` this instance will be
     * created in. Either `network` or `subnetwork` must be provided.
     * 
    */
    public String subnetwork() {
        return this.subnetwork;
    }
    /**
     * The ID of the project in which the subnetwork belongs.
     * If it is not provided, the provider project is used.
     * 
    */
    public String subnetworkProject() {
        return this.subnetworkProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetInstanceTemplateNetworkInterfaceAccessConfig> accessConfigs;
        private List<GetInstanceTemplateNetworkInterfaceAliasIpRange> aliasIpRanges;
        private List<GetInstanceTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs;
        private String ipv6AccessType;
        private String name;
        private String network;
        private String networkIp;
        private String nicType;
        private Integer queueCount;
        private String stackType;
        private String subnetwork;
        private String subnetworkProject;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkIp = defaults.networkIp;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subnetwork = defaults.subnetwork;
    	      this.subnetworkProject = defaults.subnetworkProject;
        }

        public Builder accessConfigs(List<GetInstanceTemplateNetworkInterfaceAccessConfig> accessConfigs) {
            this.accessConfigs = Objects.requireNonNull(accessConfigs);
            return this;
        }
        public Builder accessConfigs(GetInstanceTemplateNetworkInterfaceAccessConfig... accessConfigs) {
            return accessConfigs(List.of(accessConfigs));
        }
        public Builder aliasIpRanges(List<GetInstanceTemplateNetworkInterfaceAliasIpRange> aliasIpRanges) {
            this.aliasIpRanges = Objects.requireNonNull(aliasIpRanges);
            return this;
        }
        public Builder aliasIpRanges(GetInstanceTemplateNetworkInterfaceAliasIpRange... aliasIpRanges) {
            return aliasIpRanges(List.of(aliasIpRanges));
        }
        public Builder ipv6AccessConfigs(List<GetInstanceTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Objects.requireNonNull(ipv6AccessConfigs);
            return this;
        }
        public Builder ipv6AccessConfigs(GetInstanceTemplateNetworkInterfaceIpv6AccessConfig... ipv6AccessConfigs) {
            return ipv6AccessConfigs(List.of(ipv6AccessConfigs));
        }
        public Builder ipv6AccessType(String ipv6AccessType) {
            this.ipv6AccessType = Objects.requireNonNull(ipv6AccessType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder networkIp(String networkIp) {
            this.networkIp = Objects.requireNonNull(networkIp);
            return this;
        }
        public Builder nicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }
        public Builder queueCount(Integer queueCount) {
            this.queueCount = Objects.requireNonNull(queueCount);
            return this;
        }
        public Builder stackType(String stackType) {
            this.stackType = Objects.requireNonNull(stackType);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder subnetworkProject(String subnetworkProject) {
            this.subnetworkProject = Objects.requireNonNull(subnetworkProject);
            return this;
        }        public GetInstanceTemplateNetworkInterface build() {
            return new GetInstanceTemplateNetworkInterface(accessConfigs, aliasIpRanges, ipv6AccessConfigs, ipv6AccessType, name, network, networkIp, nicType, queueCount, stackType, subnetwork, subnetworkProject);
        }
    }
}
