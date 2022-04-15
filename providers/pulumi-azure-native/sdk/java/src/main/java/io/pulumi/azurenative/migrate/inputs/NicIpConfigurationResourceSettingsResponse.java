// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.LoadBalancerBackendAddressPoolReferenceResponse;
import io.pulumi.azurenative.migrate.inputs.LoadBalancerNatRuleReferenceResponse;
import io.pulumi.azurenative.migrate.inputs.PublicIpReferenceResponse;
import io.pulumi.azurenative.migrate.inputs.SubnetReferenceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines NIC IP configuration properties.
 * 
 */
public final class NicIpConfigurationResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final NicIpConfigurationResourceSettingsResponse Empty = new NicIpConfigurationResourceSettingsResponse();

    /**
     * Gets or sets the references of the load balancer backend address pools.
     * 
     */
    @Import(name="loadBalancerBackendAddressPools")
      private final @Nullable List<LoadBalancerBackendAddressPoolReferenceResponse> loadBalancerBackendAddressPools;

    public List<LoadBalancerBackendAddressPoolReferenceResponse> loadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools == null ? List.of() : this.loadBalancerBackendAddressPools;
    }

    /**
     * Gets or sets the references of the load balancer NAT rules.
     * 
     */
    @Import(name="loadBalancerNatRules")
      private final @Nullable List<LoadBalancerNatRuleReferenceResponse> loadBalancerNatRules;

    public List<LoadBalancerNatRuleReferenceResponse> loadBalancerNatRules() {
        return this.loadBalancerNatRules == null ? List.of() : this.loadBalancerNatRules;
    }

    /**
     * Gets or sets the IP configuration name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Gets or sets a value indicating whether this IP configuration is the primary.
     * 
     */
    @Import(name="primary")
      private final @Nullable Boolean primary;

    public Optional<Boolean> primary() {
        return this.primary == null ? Optional.empty() : Optional.ofNullable(this.primary);
    }

    /**
     * Gets or sets the private IP address of the network interface IP Configuration.
     * 
     */
    @Import(name="privateIpAddress")
      private final @Nullable String privateIpAddress;

    public Optional<String> privateIpAddress() {
        return this.privateIpAddress == null ? Optional.empty() : Optional.ofNullable(this.privateIpAddress);
    }

    /**
     * Gets or sets the private IP address allocation method.
     * 
     */
    @Import(name="privateIpAllocationMethod")
      private final @Nullable String privateIpAllocationMethod;

    public Optional<String> privateIpAllocationMethod() {
        return this.privateIpAllocationMethod == null ? Optional.empty() : Optional.ofNullable(this.privateIpAllocationMethod);
    }

    /**
     * Defines reference to a public IP.
     * 
     */
    @Import(name="publicIp")
      private final @Nullable PublicIpReferenceResponse publicIp;

    public Optional<PublicIpReferenceResponse> publicIp() {
        return this.publicIp == null ? Optional.empty() : Optional.ofNullable(this.publicIp);
    }

    /**
     * Defines reference to subnet.
     * 
     */
    @Import(name="subnet")
      private final @Nullable SubnetReferenceResponse subnet;

    public Optional<SubnetReferenceResponse> subnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    public NicIpConfigurationResourceSettingsResponse(
        @Nullable List<LoadBalancerBackendAddressPoolReferenceResponse> loadBalancerBackendAddressPools,
        @Nullable List<LoadBalancerNatRuleReferenceResponse> loadBalancerNatRules,
        @Nullable String name,
        @Nullable Boolean primary,
        @Nullable String privateIpAddress,
        @Nullable String privateIpAllocationMethod,
        @Nullable PublicIpReferenceResponse publicIp,
        @Nullable SubnetReferenceResponse subnet) {
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        this.loadBalancerNatRules = loadBalancerNatRules;
        this.name = name;
        this.primary = primary;
        this.privateIpAddress = privateIpAddress;
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        this.publicIp = publicIp;
        this.subnet = subnet;
    }

    private NicIpConfigurationResourceSettingsResponse() {
        this.loadBalancerBackendAddressPools = List.of();
        this.loadBalancerNatRules = List.of();
        this.name = null;
        this.primary = null;
        this.privateIpAddress = null;
        this.privateIpAllocationMethod = null;
        this.publicIp = null;
        this.subnet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NicIpConfigurationResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LoadBalancerBackendAddressPoolReferenceResponse> loadBalancerBackendAddressPools;
        private @Nullable List<LoadBalancerNatRuleReferenceResponse> loadBalancerNatRules;
        private @Nullable String name;
        private @Nullable Boolean primary;
        private @Nullable String privateIpAddress;
        private @Nullable String privateIpAllocationMethod;
        private @Nullable PublicIpReferenceResponse publicIp;
        private @Nullable SubnetReferenceResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NicIpConfigurationResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerBackendAddressPools = defaults.loadBalancerBackendAddressPools;
    	      this.loadBalancerNatRules = defaults.loadBalancerNatRules;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.privateIpAllocationMethod = defaults.privateIpAllocationMethod;
    	      this.publicIp = defaults.publicIp;
    	      this.subnet = defaults.subnet;
        }

        public Builder loadBalancerBackendAddressPools(@Nullable List<LoadBalancerBackendAddressPoolReferenceResponse> loadBalancerBackendAddressPools) {
            this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
            return this;
        }
        public Builder loadBalancerBackendAddressPools(LoadBalancerBackendAddressPoolReferenceResponse... loadBalancerBackendAddressPools) {
            return loadBalancerBackendAddressPools(List.of(loadBalancerBackendAddressPools));
        }
        public Builder loadBalancerNatRules(@Nullable List<LoadBalancerNatRuleReferenceResponse> loadBalancerNatRules) {
            this.loadBalancerNatRules = loadBalancerNatRules;
            return this;
        }
        public Builder loadBalancerNatRules(LoadBalancerNatRuleReferenceResponse... loadBalancerNatRules) {
            return loadBalancerNatRules(List.of(loadBalancerNatRules));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder primary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public Builder privateIpAllocationMethod(@Nullable String privateIpAllocationMethod) {
            this.privateIpAllocationMethod = privateIpAllocationMethod;
            return this;
        }
        public Builder publicIp(@Nullable PublicIpReferenceResponse publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public Builder subnet(@Nullable SubnetReferenceResponse subnet) {
            this.subnet = subnet;
            return this;
        }        public NicIpConfigurationResourceSettingsResponse build() {
            return new NicIpConfigurationResourceSettingsResponse(loadBalancerBackendAddressPools, loadBalancerNatRules, name, primary, privateIpAddress, privateIpAllocationMethod, publicIp, subnet);
        }
    }
}
