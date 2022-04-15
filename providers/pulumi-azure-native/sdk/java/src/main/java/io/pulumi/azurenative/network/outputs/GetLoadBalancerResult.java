// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.BackendAddressPoolResponse;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.FrontendIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.InboundNatPoolResponse;
import io.pulumi.azurenative.network.outputs.InboundNatRuleResponse;
import io.pulumi.azurenative.network.outputs.LoadBalancerSkuResponse;
import io.pulumi.azurenative.network.outputs.LoadBalancingRuleResponse;
import io.pulumi.azurenative.network.outputs.OutboundRuleResponse;
import io.pulumi.azurenative.network.outputs.ProbeResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLoadBalancerResult {
    /**
     * Collection of backend address pools used by a load balancer.
     * 
     */
    private final @Nullable List<BackendAddressPoolResponse> backendAddressPools;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The extended location of the load balancer.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Object representing the frontend IPs to be used for the load balancer.
     * 
     */
    private final @Nullable List<FrontendIPConfigurationResponse> frontendIPConfigurations;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Defines an external port range for inbound NAT to a single backend port on NICs associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     */
    private final @Nullable List<InboundNatPoolResponse> inboundNatPools;
    /**
     * Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     */
    private final @Nullable List<InboundNatRuleResponse> inboundNatRules;
    /**
     * Object collection representing the load balancing rules Gets the provisioning.
     * 
     */
    private final @Nullable List<LoadBalancingRuleResponse> loadBalancingRules;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The outbound rules.
     * 
     */
    private final @Nullable List<OutboundRuleResponse> outboundRules;
    /**
     * Collection of probe objects used in the load balancer.
     * 
     */
    private final @Nullable List<ProbeResponse> probes;
    /**
     * The provisioning state of the load balancer resource.
     * 
     */
    private final String provisioningState;
    /**
     * The resource GUID property of the load balancer resource.
     * 
     */
    private final String resourceGuid;
    /**
     * The load balancer SKU.
     * 
     */
    private final @Nullable LoadBalancerSkuResponse sku;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetLoadBalancerResult(
        @CustomType.Parameter("backendAddressPools") @Nullable List<BackendAddressPoolResponse> backendAddressPools,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @CustomType.Parameter("frontendIPConfigurations") @Nullable List<FrontendIPConfigurationResponse> frontendIPConfigurations,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("inboundNatPools") @Nullable List<InboundNatPoolResponse> inboundNatPools,
        @CustomType.Parameter("inboundNatRules") @Nullable List<InboundNatRuleResponse> inboundNatRules,
        @CustomType.Parameter("loadBalancingRules") @Nullable List<LoadBalancingRuleResponse> loadBalancingRules,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outboundRules") @Nullable List<OutboundRuleResponse> outboundRules,
        @CustomType.Parameter("probes") @Nullable List<ProbeResponse> probes,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("sku") @Nullable LoadBalancerSkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.backendAddressPools = backendAddressPools;
        this.etag = etag;
        this.extendedLocation = extendedLocation;
        this.frontendIPConfigurations = frontendIPConfigurations;
        this.id = id;
        this.inboundNatPools = inboundNatPools;
        this.inboundNatRules = inboundNatRules;
        this.loadBalancingRules = loadBalancingRules;
        this.location = location;
        this.name = name;
        this.outboundRules = outboundRules;
        this.probes = probes;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Collection of backend address pools used by a load balancer.
     * 
    */
    public List<BackendAddressPoolResponse> backendAddressPools() {
        return this.backendAddressPools == null ? List.of() : this.backendAddressPools;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * The extended location of the load balancer.
     * 
    */
    public Optional<ExtendedLocationResponse> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Object representing the frontend IPs to be used for the load balancer.
     * 
    */
    public List<FrontendIPConfigurationResponse> frontendIPConfigurations() {
        return this.frontendIPConfigurations == null ? List.of() : this.frontendIPConfigurations;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Defines an external port range for inbound NAT to a single backend port on NICs associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
    */
    public List<InboundNatPoolResponse> inboundNatPools() {
        return this.inboundNatPools == null ? List.of() : this.inboundNatPools;
    }
    /**
     * Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
    */
    public List<InboundNatRuleResponse> inboundNatRules() {
        return this.inboundNatRules == null ? List.of() : this.inboundNatRules;
    }
    /**
     * Object collection representing the load balancing rules Gets the provisioning.
     * 
    */
    public List<LoadBalancingRuleResponse> loadBalancingRules() {
        return this.loadBalancingRules == null ? List.of() : this.loadBalancingRules;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The outbound rules.
     * 
    */
    public List<OutboundRuleResponse> outboundRules() {
        return this.outboundRules == null ? List.of() : this.outboundRules;
    }
    /**
     * Collection of probe objects used in the load balancer.
     * 
    */
    public List<ProbeResponse> probes() {
        return this.probes == null ? List.of() : this.probes;
    }
    /**
     * The provisioning state of the load balancer resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the load balancer resource.
     * 
    */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The load balancer SKU.
     * 
    */
    public Optional<LoadBalancerSkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BackendAddressPoolResponse> backendAddressPools;
        private String etag;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable List<FrontendIPConfigurationResponse> frontendIPConfigurations;
        private @Nullable String id;
        private @Nullable List<InboundNatPoolResponse> inboundNatPools;
        private @Nullable List<InboundNatRuleResponse> inboundNatRules;
        private @Nullable List<LoadBalancingRuleResponse> loadBalancingRules;
        private @Nullable String location;
        private String name;
        private @Nullable List<OutboundRuleResponse> outboundRules;
        private @Nullable List<ProbeResponse> probes;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable LoadBalancerSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPools = defaults.backendAddressPools;
    	      this.etag = defaults.etag;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.id = defaults.id;
    	      this.inboundNatPools = defaults.inboundNatPools;
    	      this.inboundNatRules = defaults.inboundNatRules;
    	      this.loadBalancingRules = defaults.loadBalancingRules;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outboundRules = defaults.outboundRules;
    	      this.probes = defaults.probes;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder backendAddressPools(@Nullable List<BackendAddressPoolResponse> backendAddressPools) {
            this.backendAddressPools = backendAddressPools;
            return this;
        }
        public Builder backendAddressPools(BackendAddressPoolResponse... backendAddressPools) {
            return backendAddressPools(List.of(backendAddressPools));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder frontendIPConfigurations(@Nullable List<FrontendIPConfigurationResponse> frontendIPConfigurations) {
            this.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }
        public Builder frontendIPConfigurations(FrontendIPConfigurationResponse... frontendIPConfigurations) {
            return frontendIPConfigurations(List.of(frontendIPConfigurations));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder inboundNatPools(@Nullable List<InboundNatPoolResponse> inboundNatPools) {
            this.inboundNatPools = inboundNatPools;
            return this;
        }
        public Builder inboundNatPools(InboundNatPoolResponse... inboundNatPools) {
            return inboundNatPools(List.of(inboundNatPools));
        }
        public Builder inboundNatRules(@Nullable List<InboundNatRuleResponse> inboundNatRules) {
            this.inboundNatRules = inboundNatRules;
            return this;
        }
        public Builder inboundNatRules(InboundNatRuleResponse... inboundNatRules) {
            return inboundNatRules(List.of(inboundNatRules));
        }
        public Builder loadBalancingRules(@Nullable List<LoadBalancingRuleResponse> loadBalancingRules) {
            this.loadBalancingRules = loadBalancingRules;
            return this;
        }
        public Builder loadBalancingRules(LoadBalancingRuleResponse... loadBalancingRules) {
            return loadBalancingRules(List.of(loadBalancingRules));
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outboundRules(@Nullable List<OutboundRuleResponse> outboundRules) {
            this.outboundRules = outboundRules;
            return this;
        }
        public Builder outboundRules(OutboundRuleResponse... outboundRules) {
            return outboundRules(List.of(outboundRules));
        }
        public Builder probes(@Nullable List<ProbeResponse> probes) {
            this.probes = probes;
            return this;
        }
        public Builder probes(ProbeResponse... probes) {
            return probes(List.of(probes));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder sku(@Nullable LoadBalancerSkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetLoadBalancerResult build() {
            return new GetLoadBalancerResult(backendAddressPools, etag, extendedLocation, frontendIPConfigurations, id, inboundNatPools, inboundNatRules, loadBalancingRules, location, name, outboundRules, probes, provisioningState, resourceGuid, sku, tags, type);
        }
    }
}
