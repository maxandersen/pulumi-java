// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.enums.ServiceSpecType;
import io.pulumi.kubernetes.core_v1.inputs.ServicePortArgs;
import io.pulumi.kubernetes.core_v1.inputs.SessionAffinityConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceSpecArgs Empty = new ServiceSpecArgs();

    @InputImport(name="allocateLoadBalancerNodePorts")
    private final @Nullable Input<Boolean> allocateLoadBalancerNodePorts;

    public Input<Boolean> getAllocateLoadBalancerNodePorts() {
        return this.allocateLoadBalancerNodePorts == null ? Input.empty() : this.allocateLoadBalancerNodePorts;
    }

    @InputImport(name="clusterIP")
    private final @Nullable Input<String> clusterIP;

    public Input<String> getClusterIP() {
        return this.clusterIP == null ? Input.empty() : this.clusterIP;
    }

    @InputImport(name="clusterIPs")
    private final @Nullable Input<List<String>> clusterIPs;

    public Input<List<String>> getClusterIPs() {
        return this.clusterIPs == null ? Input.empty() : this.clusterIPs;
    }

    @InputImport(name="externalIPs")
    private final @Nullable Input<List<String>> externalIPs;

    public Input<List<String>> getExternalIPs() {
        return this.externalIPs == null ? Input.empty() : this.externalIPs;
    }

    @InputImport(name="externalName")
    private final @Nullable Input<String> externalName;

    public Input<String> getExternalName() {
        return this.externalName == null ? Input.empty() : this.externalName;
    }

    @InputImport(name="externalTrafficPolicy")
    private final @Nullable Input<String> externalTrafficPolicy;

    public Input<String> getExternalTrafficPolicy() {
        return this.externalTrafficPolicy == null ? Input.empty() : this.externalTrafficPolicy;
    }

    @InputImport(name="healthCheckNodePort")
    private final @Nullable Input<Integer> healthCheckNodePort;

    public Input<Integer> getHealthCheckNodePort() {
        return this.healthCheckNodePort == null ? Input.empty() : this.healthCheckNodePort;
    }

    @InputImport(name="internalTrafficPolicy")
    private final @Nullable Input<String> internalTrafficPolicy;

    public Input<String> getInternalTrafficPolicy() {
        return this.internalTrafficPolicy == null ? Input.empty() : this.internalTrafficPolicy;
    }

    @InputImport(name="ipFamilies")
    private final @Nullable Input<List<String>> ipFamilies;

    public Input<List<String>> getIpFamilies() {
        return this.ipFamilies == null ? Input.empty() : this.ipFamilies;
    }

    @InputImport(name="ipFamily")
    private final @Nullable Input<String> ipFamily;

    public Input<String> getIpFamily() {
        return this.ipFamily == null ? Input.empty() : this.ipFamily;
    }

    @InputImport(name="ipFamilyPolicy")
    private final @Nullable Input<String> ipFamilyPolicy;

    public Input<String> getIpFamilyPolicy() {
        return this.ipFamilyPolicy == null ? Input.empty() : this.ipFamilyPolicy;
    }

    @InputImport(name="loadBalancerClass")
    private final @Nullable Input<String> loadBalancerClass;

    public Input<String> getLoadBalancerClass() {
        return this.loadBalancerClass == null ? Input.empty() : this.loadBalancerClass;
    }

    @InputImport(name="loadBalancerIP")
    private final @Nullable Input<String> loadBalancerIP;

    public Input<String> getLoadBalancerIP() {
        return this.loadBalancerIP == null ? Input.empty() : this.loadBalancerIP;
    }

    @InputImport(name="loadBalancerSourceRanges")
    private final @Nullable Input<List<String>> loadBalancerSourceRanges;

    public Input<List<String>> getLoadBalancerSourceRanges() {
        return this.loadBalancerSourceRanges == null ? Input.empty() : this.loadBalancerSourceRanges;
    }

    @InputImport(name="ports")
    private final @Nullable Input<List<ServicePortArgs>> ports;

    public Input<List<ServicePortArgs>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    @InputImport(name="publishNotReadyAddresses")
    private final @Nullable Input<Boolean> publishNotReadyAddresses;

    public Input<Boolean> getPublishNotReadyAddresses() {
        return this.publishNotReadyAddresses == null ? Input.empty() : this.publishNotReadyAddresses;
    }

    @InputImport(name="selector")
    private final @Nullable Input<Map<String,String>> selector;

    public Input<Map<String,String>> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    @InputImport(name="sessionAffinity")
    private final @Nullable Input<String> sessionAffinity;

    public Input<String> getSessionAffinity() {
        return this.sessionAffinity == null ? Input.empty() : this.sessionAffinity;
    }

    @InputImport(name="sessionAffinityConfig")
    private final @Nullable Input<SessionAffinityConfigArgs> sessionAffinityConfig;

    public Input<SessionAffinityConfigArgs> getSessionAffinityConfig() {
        return this.sessionAffinityConfig == null ? Input.empty() : this.sessionAffinityConfig;
    }

    @InputImport(name="topologyKeys")
    private final @Nullable Input<List<String>> topologyKeys;

    public Input<List<String>> getTopologyKeys() {
        return this.topologyKeys == null ? Input.empty() : this.topologyKeys;
    }

    @InputImport(name="type")
    private final @Nullable Input<Either<String,ServiceSpecType>> type;

    public Input<Either<String,ServiceSpecType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ServiceSpecArgs(
        @Nullable Input<Boolean> allocateLoadBalancerNodePorts,
        @Nullable Input<String> clusterIP,
        @Nullable Input<List<String>> clusterIPs,
        @Nullable Input<List<String>> externalIPs,
        @Nullable Input<String> externalName,
        @Nullable Input<String> externalTrafficPolicy,
        @Nullable Input<Integer> healthCheckNodePort,
        @Nullable Input<String> internalTrafficPolicy,
        @Nullable Input<List<String>> ipFamilies,
        @Nullable Input<String> ipFamily,
        @Nullable Input<String> ipFamilyPolicy,
        @Nullable Input<String> loadBalancerClass,
        @Nullable Input<String> loadBalancerIP,
        @Nullable Input<List<String>> loadBalancerSourceRanges,
        @Nullable Input<List<ServicePortArgs>> ports,
        @Nullable Input<Boolean> publishNotReadyAddresses,
        @Nullable Input<Map<String,String>> selector,
        @Nullable Input<String> sessionAffinity,
        @Nullable Input<SessionAffinityConfigArgs> sessionAffinityConfig,
        @Nullable Input<List<String>> topologyKeys,
        @Nullable Input<Either<String,ServiceSpecType>> type) {
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
        this.allocateLoadBalancerNodePorts = Input.empty();
        this.clusterIP = Input.empty();
        this.clusterIPs = Input.empty();
        this.externalIPs = Input.empty();
        this.externalName = Input.empty();
        this.externalTrafficPolicy = Input.empty();
        this.healthCheckNodePort = Input.empty();
        this.internalTrafficPolicy = Input.empty();
        this.ipFamilies = Input.empty();
        this.ipFamily = Input.empty();
        this.ipFamilyPolicy = Input.empty();
        this.loadBalancerClass = Input.empty();
        this.loadBalancerIP = Input.empty();
        this.loadBalancerSourceRanges = Input.empty();
        this.ports = Input.empty();
        this.publishNotReadyAddresses = Input.empty();
        this.selector = Input.empty();
        this.sessionAffinity = Input.empty();
        this.sessionAffinityConfig = Input.empty();
        this.topologyKeys = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allocateLoadBalancerNodePorts;
        private @Nullable Input<String> clusterIP;
        private @Nullable Input<List<String>> clusterIPs;
        private @Nullable Input<List<String>> externalIPs;
        private @Nullable Input<String> externalName;
        private @Nullable Input<String> externalTrafficPolicy;
        private @Nullable Input<Integer> healthCheckNodePort;
        private @Nullable Input<String> internalTrafficPolicy;
        private @Nullable Input<List<String>> ipFamilies;
        private @Nullable Input<String> ipFamily;
        private @Nullable Input<String> ipFamilyPolicy;
        private @Nullable Input<String> loadBalancerClass;
        private @Nullable Input<String> loadBalancerIP;
        private @Nullable Input<List<String>> loadBalancerSourceRanges;
        private @Nullable Input<List<ServicePortArgs>> ports;
        private @Nullable Input<Boolean> publishNotReadyAddresses;
        private @Nullable Input<Map<String,String>> selector;
        private @Nullable Input<String> sessionAffinity;
        private @Nullable Input<SessionAffinityConfigArgs> sessionAffinityConfig;
        private @Nullable Input<List<String>> topologyKeys;
        private @Nullable Input<Either<String,ServiceSpecType>> type;

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

        public Builder setAllocateLoadBalancerNodePorts(@Nullable Input<Boolean> allocateLoadBalancerNodePorts) {
            this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
            return this;
        }

        public Builder setAllocateLoadBalancerNodePorts(@Nullable Boolean allocateLoadBalancerNodePorts) {
            this.allocateLoadBalancerNodePorts = Input.ofNullable(allocateLoadBalancerNodePorts);
            return this;
        }

        public Builder setClusterIP(@Nullable Input<String> clusterIP) {
            this.clusterIP = clusterIP;
            return this;
        }

        public Builder setClusterIP(@Nullable String clusterIP) {
            this.clusterIP = Input.ofNullable(clusterIP);
            return this;
        }

        public Builder setClusterIPs(@Nullable Input<List<String>> clusterIPs) {
            this.clusterIPs = clusterIPs;
            return this;
        }

        public Builder setClusterIPs(@Nullable List<String> clusterIPs) {
            this.clusterIPs = Input.ofNullable(clusterIPs);
            return this;
        }

        public Builder setExternalIPs(@Nullable Input<List<String>> externalIPs) {
            this.externalIPs = externalIPs;
            return this;
        }

        public Builder setExternalIPs(@Nullable List<String> externalIPs) {
            this.externalIPs = Input.ofNullable(externalIPs);
            return this;
        }

        public Builder setExternalName(@Nullable Input<String> externalName) {
            this.externalName = externalName;
            return this;
        }

        public Builder setExternalName(@Nullable String externalName) {
            this.externalName = Input.ofNullable(externalName);
            return this;
        }

        public Builder setExternalTrafficPolicy(@Nullable Input<String> externalTrafficPolicy) {
            this.externalTrafficPolicy = externalTrafficPolicy;
            return this;
        }

        public Builder setExternalTrafficPolicy(@Nullable String externalTrafficPolicy) {
            this.externalTrafficPolicy = Input.ofNullable(externalTrafficPolicy);
            return this;
        }

        public Builder setHealthCheckNodePort(@Nullable Input<Integer> healthCheckNodePort) {
            this.healthCheckNodePort = healthCheckNodePort;
            return this;
        }

        public Builder setHealthCheckNodePort(@Nullable Integer healthCheckNodePort) {
            this.healthCheckNodePort = Input.ofNullable(healthCheckNodePort);
            return this;
        }

        public Builder setInternalTrafficPolicy(@Nullable Input<String> internalTrafficPolicy) {
            this.internalTrafficPolicy = internalTrafficPolicy;
            return this;
        }

        public Builder setInternalTrafficPolicy(@Nullable String internalTrafficPolicy) {
            this.internalTrafficPolicy = Input.ofNullable(internalTrafficPolicy);
            return this;
        }

        public Builder setIpFamilies(@Nullable Input<List<String>> ipFamilies) {
            this.ipFamilies = ipFamilies;
            return this;
        }

        public Builder setIpFamilies(@Nullable List<String> ipFamilies) {
            this.ipFamilies = Input.ofNullable(ipFamilies);
            return this;
        }

        public Builder setIpFamily(@Nullable Input<String> ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }

        public Builder setIpFamily(@Nullable String ipFamily) {
            this.ipFamily = Input.ofNullable(ipFamily);
            return this;
        }

        public Builder setIpFamilyPolicy(@Nullable Input<String> ipFamilyPolicy) {
            this.ipFamilyPolicy = ipFamilyPolicy;
            return this;
        }

        public Builder setIpFamilyPolicy(@Nullable String ipFamilyPolicy) {
            this.ipFamilyPolicy = Input.ofNullable(ipFamilyPolicy);
            return this;
        }

        public Builder setLoadBalancerClass(@Nullable Input<String> loadBalancerClass) {
            this.loadBalancerClass = loadBalancerClass;
            return this;
        }

        public Builder setLoadBalancerClass(@Nullable String loadBalancerClass) {
            this.loadBalancerClass = Input.ofNullable(loadBalancerClass);
            return this;
        }

        public Builder setLoadBalancerIP(@Nullable Input<String> loadBalancerIP) {
            this.loadBalancerIP = loadBalancerIP;
            return this;
        }

        public Builder setLoadBalancerIP(@Nullable String loadBalancerIP) {
            this.loadBalancerIP = Input.ofNullable(loadBalancerIP);
            return this;
        }

        public Builder setLoadBalancerSourceRanges(@Nullable Input<List<String>> loadBalancerSourceRanges) {
            this.loadBalancerSourceRanges = loadBalancerSourceRanges;
            return this;
        }

        public Builder setLoadBalancerSourceRanges(@Nullable List<String> loadBalancerSourceRanges) {
            this.loadBalancerSourceRanges = Input.ofNullable(loadBalancerSourceRanges);
            return this;
        }

        public Builder setPorts(@Nullable Input<List<ServicePortArgs>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<ServicePortArgs> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public Builder setPublishNotReadyAddresses(@Nullable Input<Boolean> publishNotReadyAddresses) {
            this.publishNotReadyAddresses = publishNotReadyAddresses;
            return this;
        }

        public Builder setPublishNotReadyAddresses(@Nullable Boolean publishNotReadyAddresses) {
            this.publishNotReadyAddresses = Input.ofNullable(publishNotReadyAddresses);
            return this;
        }

        public Builder setSelector(@Nullable Input<Map<String,String>> selector) {
            this.selector = selector;
            return this;
        }

        public Builder setSelector(@Nullable Map<String,String> selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }

        public Builder setSessionAffinity(@Nullable Input<String> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        public Builder setSessionAffinity(@Nullable String sessionAffinity) {
            this.sessionAffinity = Input.ofNullable(sessionAffinity);
            return this;
        }

        public Builder setSessionAffinityConfig(@Nullable Input<SessionAffinityConfigArgs> sessionAffinityConfig) {
            this.sessionAffinityConfig = sessionAffinityConfig;
            return this;
        }

        public Builder setSessionAffinityConfig(@Nullable SessionAffinityConfigArgs sessionAffinityConfig) {
            this.sessionAffinityConfig = Input.ofNullable(sessionAffinityConfig);
            return this;
        }

        public Builder setTopologyKeys(@Nullable Input<List<String>> topologyKeys) {
            this.topologyKeys = topologyKeys;
            return this;
        }

        public Builder setTopologyKeys(@Nullable List<String> topologyKeys) {
            this.topologyKeys = Input.ofNullable(topologyKeys);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,ServiceSpecType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,ServiceSpecType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public ServiceSpecArgs build() {
            return new ServiceSpecArgs(allocateLoadBalancerNodePorts, clusterIP, clusterIPs, externalIPs, externalName, externalTrafficPolicy, healthCheckNodePort, internalTrafficPolicy, ipFamilies, ipFamily, ipFamilyPolicy, loadBalancerClass, loadBalancerIP, loadBalancerSourceRanges, ports, publishNotReadyAddresses, selector, sessionAffinity, sessionAffinityConfig, topologyKeys, type);
        }
    }
}
