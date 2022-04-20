// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.core_v1.enums.ServiceSpecType;
import com.pulumi.kubernetes.core_v1.inputs.ServicePortArgs;
import com.pulumi.kubernetes.core_v1.inputs.SessionAffinityConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ServiceSpec describes the attributes that a user creates on a service.
 * 
 */
public final class ServiceSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceSpecArgs Empty = new ServiceSpecArgs();

    /**
     * allocateLoadBalancerNodePorts defines if NodePorts will be automatically allocated for services with type LoadBalancer.  Default is &#34;true&#34;. It may be set to &#34;false&#34; if the cluster load-balancer does not rely on NodePorts.  If the caller requests specific NodePorts (by specifying a value), those requests will be respected, regardless of this field. This field may only be set for services with type LoadBalancer and will be cleared if the type is changed to any other type. This field is beta-level and is only honored by servers that enable the ServiceLBNodePortControl feature.
     * 
     */
    @Import(name="allocateLoadBalancerNodePorts")
      private final @Nullable Output<Boolean> allocateLoadBalancerNodePorts;

    public Output<Boolean> allocateLoadBalancerNodePorts() {
        return this.allocateLoadBalancerNodePorts == null ? Codegen.empty() : this.allocateLoadBalancerNodePorts;
    }

    /**
     * clusterIP is the IP address of the service and is usually assigned randomly. If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be blank) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are &#34;None&#34;, empty string (&#34;&#34;), or a valid IP address. Setting this to &#34;None&#34; makes a &#34;headless service&#34; (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     * 
     */
    @Import(name="clusterIP")
      private final @Nullable Output<String> clusterIP;

    public Output<String> clusterIP() {
        return this.clusterIP == null ? Codegen.empty() : this.clusterIP;
    }

    /**
     * ClusterIPs is a list of IP addresses assigned to this service, and are usually assigned randomly.  If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be empty) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are &#34;None&#34;, empty string (&#34;&#34;), or a valid IP address.  Setting this to &#34;None&#34; makes a &#34;headless service&#34; (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName.  If this field is not specified, it will be initialized from the clusterIP field.  If this field is specified, clients must ensure that clusterIPs[0] and clusterIP have the same value.
     * 
     * This field may hold a maximum of two entries (dual-stack IPs, in either order). These IPs must correspond to the values of the ipFamilies field. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     * 
     */
    @Import(name="clusterIPs")
      private final @Nullable Output<List<String>> clusterIPs;

    public Output<List<String>> clusterIPs() {
        return this.clusterIPs == null ? Codegen.empty() : this.clusterIPs;
    }

    /**
     * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
     * 
     */
    @Import(name="externalIPs")
      private final @Nullable Output<List<String>> externalIPs;

    public Output<List<String>> externalIPs() {
        return this.externalIPs == null ? Codegen.empty() : this.externalIPs;
    }

    /**
     * externalName is the external reference that discovery mechanisms will return as an alias for this service (e.g. a DNS CNAME record). No proxying will be involved.  Must be a lowercase RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires `type` to be &#34;ExternalName&#34;.
     * 
     */
    @Import(name="externalName")
      private final @Nullable Output<String> externalName;

    public Output<String> externalName() {
        return this.externalName == null ? Codegen.empty() : this.externalName;
    }

    /**
     * externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints. &#34;Local&#34; preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. &#34;Cluster&#34; obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.
     * 
     * Possible enum values:
     *  - `&#34;Cluster&#34;` specifies node-global (legacy) behavior.
     *  - `&#34;Local&#34;` specifies node-local endpoints behavior.
     * 
     */
    @Import(name="externalTrafficPolicy")
      private final @Nullable Output<String> externalTrafficPolicy;

    public Output<String> externalTrafficPolicy() {
        return this.externalTrafficPolicy == null ? Codegen.empty() : this.externalTrafficPolicy;
    }

    /**
     * healthCheckNodePort specifies the healthcheck nodePort for the service. This only applies when type is set to LoadBalancer and externalTrafficPolicy is set to Local. If a value is specified, is in-range, and is not in use, it will be used.  If not specified, a value will be automatically allocated.  External systems (e.g. load-balancers) can use this port to determine if a given node holds endpoints for this service or not.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type).
     * 
     */
    @Import(name="healthCheckNodePort")
      private final @Nullable Output<Integer> healthCheckNodePort;

    public Output<Integer> healthCheckNodePort() {
        return this.healthCheckNodePort == null ? Codegen.empty() : this.healthCheckNodePort;
    }

    /**
     * InternalTrafficPolicy specifies if the cluster internal traffic should be routed to all endpoints or node-local endpoints only. &#34;Cluster&#34; routes internal traffic to a Service to all endpoints. &#34;Local&#34; routes traffic to node-local endpoints only, traffic is dropped if no node-local endpoints are ready. The default value is &#34;Cluster&#34;.
     * 
     */
    @Import(name="internalTrafficPolicy")
      private final @Nullable Output<String> internalTrafficPolicy;

    public Output<String> internalTrafficPolicy() {
        return this.internalTrafficPolicy == null ? Codegen.empty() : this.internalTrafficPolicy;
    }

    /**
     * IPFamilies is a list of IP families (e.g. IPv4, IPv6) assigned to this service. This field is usually assigned automatically based on cluster configuration and the ipFamilyPolicy field. If this field is specified manually, the requested family is available in the cluster, and ipFamilyPolicy allows it, it will be used; otherwise creation of the service will fail. This field is conditionally mutable: it allows for adding or removing a secondary IP family, but it does not allow changing the primary IP family of the Service. Valid values are &#34;IPv4&#34; and &#34;IPv6&#34;.  This field only applies to Services of types ClusterIP, NodePort, and LoadBalancer, and does apply to &#34;headless&#34; services. This field will be wiped when updating a Service to type ExternalName.
     * 
     * This field may hold a maximum of two entries (dual-stack families, in either order).  These families must correspond to the values of the clusterIPs field, if specified. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field.
     * 
     */
    @Import(name="ipFamilies")
      private final @Nullable Output<List<String>> ipFamilies;

    public Output<List<String>> ipFamilies() {
        return this.ipFamilies == null ? Codegen.empty() : this.ipFamilies;
    }

    /**
     * ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster.  If no IP family is requested, the cluster&#39;s primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family.  Endpoints for this Service will be of this family.  This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.
     * 
     */
    @Import(name="ipFamily")
      private final @Nullable Output<String> ipFamily;

    public Output<String> ipFamily() {
        return this.ipFamily == null ? Codegen.empty() : this.ipFamily;
    }

    /**
     * IPFamilyPolicy represents the dual-stack-ness requested or required by this Service. If there is no value provided, then this field will be set to SingleStack. Services can be &#34;SingleStack&#34; (a single IP family), &#34;PreferDualStack&#34; (two IP families on dual-stack configured clusters or a single IP family on single-stack clusters), or &#34;RequireDualStack&#34; (two IP families on dual-stack configured clusters, otherwise fail). The ipFamilies and clusterIPs fields depend on the value of this field. This field will be wiped when updating a service to type ExternalName.
     * 
     */
    @Import(name="ipFamilyPolicy")
      private final @Nullable Output<String> ipFamilyPolicy;

    public Output<String> ipFamilyPolicy() {
        return this.ipFamilyPolicy == null ? Codegen.empty() : this.ipFamilyPolicy;
    }

    /**
     * loadBalancerClass is the class of the load balancer implementation this Service belongs to. If specified, the value of this field must be a label-style identifier, with an optional prefix, e.g. &#34;internal-vip&#34; or &#34;example.com/internal-vip&#34;. Unprefixed names are reserved for end-users. This field can only be set when the Service type is &#39;LoadBalancer&#39;. If not set, the default load balancer implementation is used, today this is typically done through the cloud provider integration, but should apply for any default implementation. If set, it is assumed that a load balancer implementation is watching for Services with a matching class. Any default load balancer implementation (e.g. cloud providers) should ignore Services that set this field. This field can only be set when creating or updating a Service to type &#39;LoadBalancer&#39;. Once set, it can not be changed. This field will be wiped when a service is updated to a non &#39;LoadBalancer&#39; type.
     * 
     */
    @Import(name="loadBalancerClass")
      private final @Nullable Output<String> loadBalancerClass;

    public Output<String> loadBalancerClass() {
        return this.loadBalancerClass == null ? Codegen.empty() : this.loadBalancerClass;
    }

    /**
     * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
     * 
     */
    @Import(name="loadBalancerIP")
      private final @Nullable Output<String> loadBalancerIP;

    public Output<String> loadBalancerIP() {
        return this.loadBalancerIP == null ? Codegen.empty() : this.loadBalancerIP;
    }

    /**
     * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.&#34; More info: https://kubernetes.io/docs/tasks/access-application-cluster/create-external-load-balancer/
     * 
     */
    @Import(name="loadBalancerSourceRanges")
      private final @Nullable Output<List<String>> loadBalancerSourceRanges;

    public Output<List<String>> loadBalancerSourceRanges() {
        return this.loadBalancerSourceRanges == null ? Codegen.empty() : this.loadBalancerSourceRanges;
    }

    /**
     * The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<ServicePortArgs>> ports;

    public Output<List<ServicePortArgs>> ports() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    /**
     * publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service should disregard any indications of ready/not-ready. The primary use case for setting this field is for a StatefulSet&#39;s Headless Service to propagate SRV DNS records for its Pods for the purpose of peer discovery. The Kubernetes controllers that generate Endpoints and EndpointSlice resources for Services interpret this to mean that all endpoints are considered &#34;ready&#34; even if the Pods themselves are not. Agents which consume only Kubernetes generated endpoints through the Endpoints or EndpointSlice resources can safely assume this behavior.
     * 
     */
    @Import(name="publishNotReadyAddresses")
      private final @Nullable Output<Boolean> publishNotReadyAddresses;

    public Output<Boolean> publishNotReadyAddresses() {
        return this.publishNotReadyAddresses == null ? Codegen.empty() : this.publishNotReadyAddresses;
    }

    /**
     * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
     * 
     */
    @Import(name="selector")
      private final @Nullable Output<Map<String,String>> selector;

    public Output<Map<String,String>> selector() {
        return this.selector == null ? Codegen.empty() : this.selector;
    }

    /**
     * Supports &#34;ClientIP&#34; and &#34;None&#34;. Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     * 
     * Possible enum values:
     *  - `&#34;ClientIP&#34;` is the Client IP based.
     *  - `&#34;None&#34;` - no session affinity.
     * 
     */
    @Import(name="sessionAffinity")
      private final @Nullable Output<String> sessionAffinity;

    public Output<String> sessionAffinity() {
        return this.sessionAffinity == null ? Codegen.empty() : this.sessionAffinity;
    }

    /**
     * sessionAffinityConfig contains the configurations of session affinity.
     * 
     */
    @Import(name="sessionAffinityConfig")
      private final @Nullable Output<SessionAffinityConfigArgs> sessionAffinityConfig;

    public Output<SessionAffinityConfigArgs> sessionAffinityConfig() {
        return this.sessionAffinityConfig == null ? Codegen.empty() : this.sessionAffinityConfig;
    }

    /**
     * topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local. Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value &#34;*&#34; may be used to mean &#34;any topology&#34;. This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.
     * 
     */
    @Import(name="topologyKeys")
      private final @Nullable Output<List<String>> topologyKeys;

    public Output<List<String>> topologyKeys() {
        return this.topologyKeys == null ? Codegen.empty() : this.topologyKeys;
    }

    /**
     * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. &#34;ClusterIP&#34; allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object or EndpointSlice objects. If clusterIP is &#34;None&#34;, no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a virtual IP. &#34;NodePort&#34; builds on ClusterIP and allocates a port on every node which routes to the same endpoints as the clusterIP. &#34;LoadBalancer&#34; builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the same endpoints as the clusterIP. &#34;ExternalName&#34; aliases this service to the specified externalName. Several other fields do not apply to ExternalName services. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
     * 
     * Possible enum values:
     *  - `&#34;ClusterIP&#34;` means a service will only be accessible inside the cluster, via the cluster IP.
     *  - `&#34;ExternalName&#34;` means a service consists of only a reference to an external name that kubedns or equivalent will return as a CNAME record, with no exposing or proxying of any pods involved.
     *  - `&#34;LoadBalancer&#34;` means a service will be exposed via an external load balancer (if the cloud provider supports it), in addition to &#39;NodePort&#39; type.
     *  - `&#34;NodePort&#34;` means a service will be exposed on one port of every node, in addition to &#39;ClusterIP&#39; type.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,ServiceSpecType>> type;

    public Output<Either<String,ServiceSpecType>> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ServiceSpecArgs(
        @Nullable Output<Boolean> allocateLoadBalancerNodePorts,
        @Nullable Output<String> clusterIP,
        @Nullable Output<List<String>> clusterIPs,
        @Nullable Output<List<String>> externalIPs,
        @Nullable Output<String> externalName,
        @Nullable Output<String> externalTrafficPolicy,
        @Nullable Output<Integer> healthCheckNodePort,
        @Nullable Output<String> internalTrafficPolicy,
        @Nullable Output<List<String>> ipFamilies,
        @Nullable Output<String> ipFamily,
        @Nullable Output<String> ipFamilyPolicy,
        @Nullable Output<String> loadBalancerClass,
        @Nullable Output<String> loadBalancerIP,
        @Nullable Output<List<String>> loadBalancerSourceRanges,
        @Nullable Output<List<ServicePortArgs>> ports,
        @Nullable Output<Boolean> publishNotReadyAddresses,
        @Nullable Output<Map<String,String>> selector,
        @Nullable Output<String> sessionAffinity,
        @Nullable Output<SessionAffinityConfigArgs> sessionAffinityConfig,
        @Nullable Output<List<String>> topologyKeys,
        @Nullable Output<Either<String,ServiceSpecType>> type) {
        this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
        this.clusterIP = clusterIP;
        this.clusterIPs = clusterIPs;
        this.externalIPs = externalIPs;
        this.externalName = externalName;
        this.externalTrafficPolicy = externalTrafficPolicy;
        this.healthCheckNodePort = healthCheckNodePort;
        this.internalTrafficPolicy = internalTrafficPolicy;
        this.ipFamilies = ipFamilies;
        this.ipFamily = ipFamily;
        this.ipFamilyPolicy = ipFamilyPolicy;
        this.loadBalancerClass = loadBalancerClass;
        this.loadBalancerIP = loadBalancerIP;
        this.loadBalancerSourceRanges = loadBalancerSourceRanges;
        this.ports = ports;
        this.publishNotReadyAddresses = publishNotReadyAddresses;
        this.selector = selector;
        this.sessionAffinity = sessionAffinity;
        this.sessionAffinityConfig = sessionAffinityConfig;
        this.topologyKeys = topologyKeys;
        this.type = type;
    }

    private ServiceSpecArgs() {
        this.allocateLoadBalancerNodePorts = Codegen.empty();
        this.clusterIP = Codegen.empty();
        this.clusterIPs = Codegen.empty();
        this.externalIPs = Codegen.empty();
        this.externalName = Codegen.empty();
        this.externalTrafficPolicy = Codegen.empty();
        this.healthCheckNodePort = Codegen.empty();
        this.internalTrafficPolicy = Codegen.empty();
        this.ipFamilies = Codegen.empty();
        this.ipFamily = Codegen.empty();
        this.ipFamilyPolicy = Codegen.empty();
        this.loadBalancerClass = Codegen.empty();
        this.loadBalancerIP = Codegen.empty();
        this.loadBalancerSourceRanges = Codegen.empty();
        this.ports = Codegen.empty();
        this.publishNotReadyAddresses = Codegen.empty();
        this.selector = Codegen.empty();
        this.sessionAffinity = Codegen.empty();
        this.sessionAffinityConfig = Codegen.empty();
        this.topologyKeys = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allocateLoadBalancerNodePorts;
        private @Nullable Output<String> clusterIP;
        private @Nullable Output<List<String>> clusterIPs;
        private @Nullable Output<List<String>> externalIPs;
        private @Nullable Output<String> externalName;
        private @Nullable Output<String> externalTrafficPolicy;
        private @Nullable Output<Integer> healthCheckNodePort;
        private @Nullable Output<String> internalTrafficPolicy;
        private @Nullable Output<List<String>> ipFamilies;
        private @Nullable Output<String> ipFamily;
        private @Nullable Output<String> ipFamilyPolicy;
        private @Nullable Output<String> loadBalancerClass;
        private @Nullable Output<String> loadBalancerIP;
        private @Nullable Output<List<String>> loadBalancerSourceRanges;
        private @Nullable Output<List<ServicePortArgs>> ports;
        private @Nullable Output<Boolean> publishNotReadyAddresses;
        private @Nullable Output<Map<String,String>> selector;
        private @Nullable Output<String> sessionAffinity;
        private @Nullable Output<SessionAffinityConfigArgs> sessionAffinityConfig;
        private @Nullable Output<List<String>> topologyKeys;
        private @Nullable Output<Either<String,ServiceSpecType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocateLoadBalancerNodePorts = defaults.allocateLoadBalancerNodePorts;
    	      this.clusterIP = defaults.clusterIP;
    	      this.clusterIPs = defaults.clusterIPs;
    	      this.externalIPs = defaults.externalIPs;
    	      this.externalName = defaults.externalName;
    	      this.externalTrafficPolicy = defaults.externalTrafficPolicy;
    	      this.healthCheckNodePort = defaults.healthCheckNodePort;
    	      this.internalTrafficPolicy = defaults.internalTrafficPolicy;
    	      this.ipFamilies = defaults.ipFamilies;
    	      this.ipFamily = defaults.ipFamily;
    	      this.ipFamilyPolicy = defaults.ipFamilyPolicy;
    	      this.loadBalancerClass = defaults.loadBalancerClass;
    	      this.loadBalancerIP = defaults.loadBalancerIP;
    	      this.loadBalancerSourceRanges = defaults.loadBalancerSourceRanges;
    	      this.ports = defaults.ports;
    	      this.publishNotReadyAddresses = defaults.publishNotReadyAddresses;
    	      this.selector = defaults.selector;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.sessionAffinityConfig = defaults.sessionAffinityConfig;
    	      this.topologyKeys = defaults.topologyKeys;
    	      this.type = defaults.type;
        }

        public Builder allocateLoadBalancerNodePorts(@Nullable Output<Boolean> allocateLoadBalancerNodePorts) {
            this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
            return this;
        }
        public Builder allocateLoadBalancerNodePorts(@Nullable Boolean allocateLoadBalancerNodePorts) {
            this.allocateLoadBalancerNodePorts = Codegen.ofNullable(allocateLoadBalancerNodePorts);
            return this;
        }
        public Builder clusterIP(@Nullable Output<String> clusterIP) {
            this.clusterIP = clusterIP;
            return this;
        }
        public Builder clusterIP(@Nullable String clusterIP) {
            this.clusterIP = Codegen.ofNullable(clusterIP);
            return this;
        }
        public Builder clusterIPs(@Nullable Output<List<String>> clusterIPs) {
            this.clusterIPs = clusterIPs;
            return this;
        }
        public Builder clusterIPs(@Nullable List<String> clusterIPs) {
            this.clusterIPs = Codegen.ofNullable(clusterIPs);
            return this;
        }
        public Builder clusterIPs(String... clusterIPs) {
            return clusterIPs(List.of(clusterIPs));
        }
        public Builder externalIPs(@Nullable Output<List<String>> externalIPs) {
            this.externalIPs = externalIPs;
            return this;
        }
        public Builder externalIPs(@Nullable List<String> externalIPs) {
            this.externalIPs = Codegen.ofNullable(externalIPs);
            return this;
        }
        public Builder externalIPs(String... externalIPs) {
            return externalIPs(List.of(externalIPs));
        }
        public Builder externalName(@Nullable Output<String> externalName) {
            this.externalName = externalName;
            return this;
        }
        public Builder externalName(@Nullable String externalName) {
            this.externalName = Codegen.ofNullable(externalName);
            return this;
        }
        public Builder externalTrafficPolicy(@Nullable Output<String> externalTrafficPolicy) {
            this.externalTrafficPolicy = externalTrafficPolicy;
            return this;
        }
        public Builder externalTrafficPolicy(@Nullable String externalTrafficPolicy) {
            this.externalTrafficPolicy = Codegen.ofNullable(externalTrafficPolicy);
            return this;
        }
        public Builder healthCheckNodePort(@Nullable Output<Integer> healthCheckNodePort) {
            this.healthCheckNodePort = healthCheckNodePort;
            return this;
        }
        public Builder healthCheckNodePort(@Nullable Integer healthCheckNodePort) {
            this.healthCheckNodePort = Codegen.ofNullable(healthCheckNodePort);
            return this;
        }
        public Builder internalTrafficPolicy(@Nullable Output<String> internalTrafficPolicy) {
            this.internalTrafficPolicy = internalTrafficPolicy;
            return this;
        }
        public Builder internalTrafficPolicy(@Nullable String internalTrafficPolicy) {
            this.internalTrafficPolicy = Codegen.ofNullable(internalTrafficPolicy);
            return this;
        }
        public Builder ipFamilies(@Nullable Output<List<String>> ipFamilies) {
            this.ipFamilies = ipFamilies;
            return this;
        }
        public Builder ipFamilies(@Nullable List<String> ipFamilies) {
            this.ipFamilies = Codegen.ofNullable(ipFamilies);
            return this;
        }
        public Builder ipFamilies(String... ipFamilies) {
            return ipFamilies(List.of(ipFamilies));
        }
        public Builder ipFamily(@Nullable Output<String> ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }
        public Builder ipFamily(@Nullable String ipFamily) {
            this.ipFamily = Codegen.ofNullable(ipFamily);
            return this;
        }
        public Builder ipFamilyPolicy(@Nullable Output<String> ipFamilyPolicy) {
            this.ipFamilyPolicy = ipFamilyPolicy;
            return this;
        }
        public Builder ipFamilyPolicy(@Nullable String ipFamilyPolicy) {
            this.ipFamilyPolicy = Codegen.ofNullable(ipFamilyPolicy);
            return this;
        }
        public Builder loadBalancerClass(@Nullable Output<String> loadBalancerClass) {
            this.loadBalancerClass = loadBalancerClass;
            return this;
        }
        public Builder loadBalancerClass(@Nullable String loadBalancerClass) {
            this.loadBalancerClass = Codegen.ofNullable(loadBalancerClass);
            return this;
        }
        public Builder loadBalancerIP(@Nullable Output<String> loadBalancerIP) {
            this.loadBalancerIP = loadBalancerIP;
            return this;
        }
        public Builder loadBalancerIP(@Nullable String loadBalancerIP) {
            this.loadBalancerIP = Codegen.ofNullable(loadBalancerIP);
            return this;
        }
        public Builder loadBalancerSourceRanges(@Nullable Output<List<String>> loadBalancerSourceRanges) {
            this.loadBalancerSourceRanges = loadBalancerSourceRanges;
            return this;
        }
        public Builder loadBalancerSourceRanges(@Nullable List<String> loadBalancerSourceRanges) {
            this.loadBalancerSourceRanges = Codegen.ofNullable(loadBalancerSourceRanges);
            return this;
        }
        public Builder loadBalancerSourceRanges(String... loadBalancerSourceRanges) {
            return loadBalancerSourceRanges(List.of(loadBalancerSourceRanges));
        }
        public Builder ports(@Nullable Output<List<ServicePortArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<ServicePortArgs> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(ServicePortArgs... ports) {
            return ports(List.of(ports));
        }
        public Builder publishNotReadyAddresses(@Nullable Output<Boolean> publishNotReadyAddresses) {
            this.publishNotReadyAddresses = publishNotReadyAddresses;
            return this;
        }
        public Builder publishNotReadyAddresses(@Nullable Boolean publishNotReadyAddresses) {
            this.publishNotReadyAddresses = Codegen.ofNullable(publishNotReadyAddresses);
            return this;
        }
        public Builder selector(@Nullable Output<Map<String,String>> selector) {
            this.selector = selector;
            return this;
        }
        public Builder selector(@Nullable Map<String,String> selector) {
            this.selector = Codegen.ofNullable(selector);
            return this;
        }
        public Builder sessionAffinity(@Nullable Output<String> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        public Builder sessionAffinity(@Nullable String sessionAffinity) {
            this.sessionAffinity = Codegen.ofNullable(sessionAffinity);
            return this;
        }
        public Builder sessionAffinityConfig(@Nullable Output<SessionAffinityConfigArgs> sessionAffinityConfig) {
            this.sessionAffinityConfig = sessionAffinityConfig;
            return this;
        }
        public Builder sessionAffinityConfig(@Nullable SessionAffinityConfigArgs sessionAffinityConfig) {
            this.sessionAffinityConfig = Codegen.ofNullable(sessionAffinityConfig);
            return this;
        }
        public Builder topologyKeys(@Nullable Output<List<String>> topologyKeys) {
            this.topologyKeys = topologyKeys;
            return this;
        }
        public Builder topologyKeys(@Nullable List<String> topologyKeys) {
            this.topologyKeys = Codegen.ofNullable(topologyKeys);
            return this;
        }
        public Builder topologyKeys(String... topologyKeys) {
            return topologyKeys(List.of(topologyKeys));
        }
        public Builder type(@Nullable Output<Either<String,ServiceSpecType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,ServiceSpecType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ServiceSpecArgs build() {
            return new ServiceSpecArgs(allocateLoadBalancerNodePorts, clusterIP, clusterIPs, externalIPs, externalName, externalTrafficPolicy, healthCheckNodePort, internalTrafficPolicy, ipFamilies, ipFamily, ipFamilyPolicy, loadBalancerClass, loadBalancerIP, loadBalancerSourceRanges, ports, publishNotReadyAddresses, selector, sessionAffinity, sessionAffinityConfig, topologyKeys, type);
        }
    }
}
