// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.azure.containerservice.outputs.KubernetesClusterNetworkProfileLoadBalancerProfile;
import com.pulumi.azure.containerservice.outputs.KubernetesClusterNetworkProfileNatGatewayProfile;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterNetworkProfile {
    /**
     * @return IP address within the Kubernetes service address range that will be used by cluster service discovery (kube-dns). Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String dnsServiceIp;
    /**
     * @return IP address (in CIDR notation) used as the Docker bridge IP address on nodes. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String dockerBridgeCidr;
    /**
     * @return Specifies a list of IP versions the Kubernetes Cluster will use to assign IP addresses to its nodes and pods. Possible values are `IPv4` and/or `IPv6`. `IPv4` must always be specified. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable List<String> ipVersions;
    /**
     * @return A `load_balancer_profile` block. This can only be specified when `load_balancer_sku` is set to `standard`.
     * 
     */
    private final @Nullable KubernetesClusterNetworkProfileLoadBalancerProfile loadBalancerProfile;
    /**
     * @return Specifies the SKU of the Load Balancer used for this Kubernetes Cluster. Possible values are `basic` and `standard`. Defaults to `standard`.
     * 
     */
    private final @Nullable String loadBalancerSku;
    /**
     * @return A `nat_gateway_profile` block. This can only be specified when `load_balancer_sku` is set to `standard` and `outbound_type` is set to `managedNATGateway` or `userAssignedNATGateway`.
     * 
     */
    private final @Nullable KubernetesClusterNetworkProfileNatGatewayProfile natGatewayProfile;
    /**
     * @return Network mode to be used with Azure CNI. Possible values are `bridge` and `transparent`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String networkMode;
    /**
     * @return Network plugin to use for networking. Currently supported values are `azure` and `kubenet`. Changing this forces a new resource to be created.
     * 
     */
    private final String networkPlugin;
    /**
     * @return Sets up network policy to be used with Azure CNI. [Network policy allows us to control the traffic flow between pods](https://docs.microsoft.com/en-us/azure/aks/use-network-policies). Currently supported values are `calico` and `azure`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String networkPolicy;
    /**
     * @return The outbound (egress) routing method which should be used for this Kubernetes Cluster. Possible values are `loadBalancer`, `userDefinedRouting`, `managedNATGateway` and `userAssignedNATGateway`. Defaults to `loadBalancer`.
     * 
     */
    private final @Nullable String outboundType;
    /**
     * @return The CIDR to use for pod IP addresses. This field can only be set when `network_plugin` is set to `kubenet`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String podCidr;
    /**
     * @return The Network Range used by the Kubernetes service. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String serviceCidr;

    @CustomType.Constructor
    private KubernetesClusterNetworkProfile(
        @CustomType.Parameter("dnsServiceIp") @Nullable String dnsServiceIp,
        @CustomType.Parameter("dockerBridgeCidr") @Nullable String dockerBridgeCidr,
        @CustomType.Parameter("ipVersions") @Nullable List<String> ipVersions,
        @CustomType.Parameter("loadBalancerProfile") @Nullable KubernetesClusterNetworkProfileLoadBalancerProfile loadBalancerProfile,
        @CustomType.Parameter("loadBalancerSku") @Nullable String loadBalancerSku,
        @CustomType.Parameter("natGatewayProfile") @Nullable KubernetesClusterNetworkProfileNatGatewayProfile natGatewayProfile,
        @CustomType.Parameter("networkMode") @Nullable String networkMode,
        @CustomType.Parameter("networkPlugin") String networkPlugin,
        @CustomType.Parameter("networkPolicy") @Nullable String networkPolicy,
        @CustomType.Parameter("outboundType") @Nullable String outboundType,
        @CustomType.Parameter("podCidr") @Nullable String podCidr,
        @CustomType.Parameter("serviceCidr") @Nullable String serviceCidr) {
        this.dnsServiceIp = dnsServiceIp;
        this.dockerBridgeCidr = dockerBridgeCidr;
        this.ipVersions = ipVersions;
        this.loadBalancerProfile = loadBalancerProfile;
        this.loadBalancerSku = loadBalancerSku;
        this.natGatewayProfile = natGatewayProfile;
        this.networkMode = networkMode;
        this.networkPlugin = networkPlugin;
        this.networkPolicy = networkPolicy;
        this.outboundType = outboundType;
        this.podCidr = podCidr;
        this.serviceCidr = serviceCidr;
    }

    /**
     * @return IP address within the Kubernetes service address range that will be used by cluster service discovery (kube-dns). Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> dnsServiceIp() {
        return Optional.ofNullable(this.dnsServiceIp);
    }
    /**
     * @return IP address (in CIDR notation) used as the Docker bridge IP address on nodes. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> dockerBridgeCidr() {
        return Optional.ofNullable(this.dockerBridgeCidr);
    }
    /**
     * @return Specifies a list of IP versions the Kubernetes Cluster will use to assign IP addresses to its nodes and pods. Possible values are `IPv4` and/or `IPv6`. `IPv4` must always be specified. Changing this forces a new resource to be created.
     * 
     */
    public List<String> ipVersions() {
        return this.ipVersions == null ? List.of() : this.ipVersions;
    }
    /**
     * @return A `load_balancer_profile` block. This can only be specified when `load_balancer_sku` is set to `standard`.
     * 
     */
    public Optional<KubernetesClusterNetworkProfileLoadBalancerProfile> loadBalancerProfile() {
        return Optional.ofNullable(this.loadBalancerProfile);
    }
    /**
     * @return Specifies the SKU of the Load Balancer used for this Kubernetes Cluster. Possible values are `basic` and `standard`. Defaults to `standard`.
     * 
     */
    public Optional<String> loadBalancerSku() {
        return Optional.ofNullable(this.loadBalancerSku);
    }
    /**
     * @return A `nat_gateway_profile` block. This can only be specified when `load_balancer_sku` is set to `standard` and `outbound_type` is set to `managedNATGateway` or `userAssignedNATGateway`.
     * 
     */
    public Optional<KubernetesClusterNetworkProfileNatGatewayProfile> natGatewayProfile() {
        return Optional.ofNullable(this.natGatewayProfile);
    }
    /**
     * @return Network mode to be used with Azure CNI. Possible values are `bridge` and `transparent`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> networkMode() {
        return Optional.ofNullable(this.networkMode);
    }
    /**
     * @return Network plugin to use for networking. Currently supported values are `azure` and `kubenet`. Changing this forces a new resource to be created.
     * 
     */
    public String networkPlugin() {
        return this.networkPlugin;
    }
    /**
     * @return Sets up network policy to be used with Azure CNI. [Network policy allows us to control the traffic flow between pods](https://docs.microsoft.com/en-us/azure/aks/use-network-policies). Currently supported values are `calico` and `azure`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> networkPolicy() {
        return Optional.ofNullable(this.networkPolicy);
    }
    /**
     * @return The outbound (egress) routing method which should be used for this Kubernetes Cluster. Possible values are `loadBalancer`, `userDefinedRouting`, `managedNATGateway` and `userAssignedNATGateway`. Defaults to `loadBalancer`.
     * 
     */
    public Optional<String> outboundType() {
        return Optional.ofNullable(this.outboundType);
    }
    /**
     * @return The CIDR to use for pod IP addresses. This field can only be set when `network_plugin` is set to `kubenet`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> podCidr() {
        return Optional.ofNullable(this.podCidr);
    }
    /**
     * @return The Network Range used by the Kubernetes service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> serviceCidr() {
        return Optional.ofNullable(this.serviceCidr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterNetworkProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsServiceIp;
        private @Nullable String dockerBridgeCidr;
        private @Nullable List<String> ipVersions;
        private @Nullable KubernetesClusterNetworkProfileLoadBalancerProfile loadBalancerProfile;
        private @Nullable String loadBalancerSku;
        private @Nullable KubernetesClusterNetworkProfileNatGatewayProfile natGatewayProfile;
        private @Nullable String networkMode;
        private String networkPlugin;
        private @Nullable String networkPolicy;
        private @Nullable String outboundType;
        private @Nullable String podCidr;
        private @Nullable String serviceCidr;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterNetworkProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServiceIp = defaults.dnsServiceIp;
    	      this.dockerBridgeCidr = defaults.dockerBridgeCidr;
    	      this.ipVersions = defaults.ipVersions;
    	      this.loadBalancerProfile = defaults.loadBalancerProfile;
    	      this.loadBalancerSku = defaults.loadBalancerSku;
    	      this.natGatewayProfile = defaults.natGatewayProfile;
    	      this.networkMode = defaults.networkMode;
    	      this.networkPlugin = defaults.networkPlugin;
    	      this.networkPolicy = defaults.networkPolicy;
    	      this.outboundType = defaults.outboundType;
    	      this.podCidr = defaults.podCidr;
    	      this.serviceCidr = defaults.serviceCidr;
        }

        public Builder dnsServiceIp(@Nullable String dnsServiceIp) {
            this.dnsServiceIp = dnsServiceIp;
            return this;
        }
        public Builder dockerBridgeCidr(@Nullable String dockerBridgeCidr) {
            this.dockerBridgeCidr = dockerBridgeCidr;
            return this;
        }
        public Builder ipVersions(@Nullable List<String> ipVersions) {
            this.ipVersions = ipVersions;
            return this;
        }
        public Builder ipVersions(String... ipVersions) {
            return ipVersions(List.of(ipVersions));
        }
        public Builder loadBalancerProfile(@Nullable KubernetesClusterNetworkProfileLoadBalancerProfile loadBalancerProfile) {
            this.loadBalancerProfile = loadBalancerProfile;
            return this;
        }
        public Builder loadBalancerSku(@Nullable String loadBalancerSku) {
            this.loadBalancerSku = loadBalancerSku;
            return this;
        }
        public Builder natGatewayProfile(@Nullable KubernetesClusterNetworkProfileNatGatewayProfile natGatewayProfile) {
            this.natGatewayProfile = natGatewayProfile;
            return this;
        }
        public Builder networkMode(@Nullable String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public Builder networkPlugin(String networkPlugin) {
            this.networkPlugin = Objects.requireNonNull(networkPlugin);
            return this;
        }
        public Builder networkPolicy(@Nullable String networkPolicy) {
            this.networkPolicy = networkPolicy;
            return this;
        }
        public Builder outboundType(@Nullable String outboundType) {
            this.outboundType = outboundType;
            return this;
        }
        public Builder podCidr(@Nullable String podCidr) {
            this.podCidr = podCidr;
            return this;
        }
        public Builder serviceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }        public KubernetesClusterNetworkProfile build() {
            return new KubernetesClusterNetworkProfile(dnsServiceIp, dockerBridgeCidr, ipVersions, loadBalancerProfile, loadBalancerSku, natGatewayProfile, networkMode, networkPlugin, networkPolicy, outboundType, podCidr, serviceCidr);
        }
    }
}
