// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.azurenative.migrate.inputs.LBBackendAddressPoolResourceSettingsArgs;
import com.pulumi.azurenative.migrate.inputs.LBFrontendIPConfigurationResourceSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the load balancer resource settings.
 * 
 */
public final class LoadBalancerResourceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerResourceSettingsArgs Empty = new LoadBalancerResourceSettingsArgs();

    /**
     * Gets or sets the backend address pools of the load balancer.
     * 
     */
    @Import(name="backendAddressPools")
    private @Nullable Output<List<LBBackendAddressPoolResourceSettingsArgs>> backendAddressPools;

    public Optional<Output<List<LBBackendAddressPoolResourceSettingsArgs>>> backendAddressPools() {
        return Optional.ofNullable(this.backendAddressPools);
    }

    /**
     * Gets or sets the frontend IP configurations of the load balancer.
     * 
     */
    @Import(name="frontendIPConfigurations")
    private @Nullable Output<List<LBFrontendIPConfigurationResourceSettingsArgs>> frontendIPConfigurations;

    public Optional<Output<List<LBFrontendIPConfigurationResourceSettingsArgs>>> frontendIPConfigurations() {
        return Optional.ofNullable(this.frontendIPConfigurations);
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Network/loadBalancers&#39;.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets load balancer sku (Basic/Standard).
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @Import(name="targetResourceName", required=true)
    private Output<String> targetResourceName;

    public Output<String> targetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Gets or sets the csv list of zones common for all frontend IP configurations. Note this is given
     *  precedence only if frontend IP configurations settings are not present.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<String> zones;

    public Optional<Output<String>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private LoadBalancerResourceSettingsArgs() {}

    private LoadBalancerResourceSettingsArgs(LoadBalancerResourceSettingsArgs $) {
        this.backendAddressPools = $.backendAddressPools;
        this.frontendIPConfigurations = $.frontendIPConfigurations;
        this.resourceType = $.resourceType;
        this.sku = $.sku;
        this.targetResourceName = $.targetResourceName;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerResourceSettingsArgs $;

        public Builder() {
            $ = new LoadBalancerResourceSettingsArgs();
        }

        public Builder(LoadBalancerResourceSettingsArgs defaults) {
            $ = new LoadBalancerResourceSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendAddressPools(@Nullable Output<List<LBBackendAddressPoolResourceSettingsArgs>> backendAddressPools) {
            $.backendAddressPools = backendAddressPools;
            return this;
        }

        public Builder backendAddressPools(List<LBBackendAddressPoolResourceSettingsArgs> backendAddressPools) {
            return backendAddressPools(Output.of(backendAddressPools));
        }

        public Builder backendAddressPools(LBBackendAddressPoolResourceSettingsArgs... backendAddressPools) {
            return backendAddressPools(List.of(backendAddressPools));
        }

        public Builder frontendIPConfigurations(@Nullable Output<List<LBFrontendIPConfigurationResourceSettingsArgs>> frontendIPConfigurations) {
            $.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        public Builder frontendIPConfigurations(List<LBFrontendIPConfigurationResourceSettingsArgs> frontendIPConfigurations) {
            return frontendIPConfigurations(Output.of(frontendIPConfigurations));
        }

        public Builder frontendIPConfigurations(LBFrontendIPConfigurationResourceSettingsArgs... frontendIPConfigurations) {
            return frontendIPConfigurations(List.of(frontendIPConfigurations));
        }

        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public Builder targetResourceName(Output<String> targetResourceName) {
            $.targetResourceName = targetResourceName;
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            return targetResourceName(Output.of(targetResourceName));
        }

        public Builder zones(@Nullable Output<String> zones) {
            $.zones = zones;
            return this;
        }

        public Builder zones(String zones) {
            return zones(Output.of(zones));
        }

        public LoadBalancerResourceSettingsArgs build() {
            $.resourceType = Codegen.stringProp("resourceType").output().arg($.resourceType).require();
            $.targetResourceName = Objects.requireNonNull($.targetResourceName, "expected parameter 'targetResourceName' to be non-null");
            return $;
        }
    }

}
