// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb.inputs;

import com.pulumi.azure.lb.inputs.BackendAddressPoolTunnelInterfaceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendAddressPoolState extends com.pulumi.resources.ResourceArgs {

    public static final BackendAddressPoolState Empty = new BackendAddressPoolState();

    /**
     * The Backend IP Configurations associated with this Backend Address Pool.
     * 
     */
    @Import(name="backendIpConfigurations")
    private @Nullable Output<List<String>> backendIpConfigurations;

    /**
     * @return The Backend IP Configurations associated with this Backend Address Pool.
     * 
     */
    public Optional<Output<List<String>>> backendIpConfigurations() {
        return Optional.ofNullable(this.backendIpConfigurations);
    }

    /**
     * The Load Balancing Rules associated with this Backend Address Pool.
     * 
     */
    @Import(name="loadBalancingRules")
    private @Nullable Output<List<String>> loadBalancingRules;

    /**
     * @return The Load Balancing Rules associated with this Backend Address Pool.
     * 
     */
    public Optional<Output<List<String>>> loadBalancingRules() {
        return Optional.ofNullable(this.loadBalancingRules);
    }

    /**
     * The ID of the Load Balancer in which to create the Backend Address Pool.
     * 
     */
    @Import(name="loadbalancerId")
    private @Nullable Output<String> loadbalancerId;

    /**
     * @return The ID of the Load Balancer in which to create the Backend Address Pool.
     * 
     */
    public Optional<Output<String>> loadbalancerId() {
        return Optional.ofNullable(this.loadbalancerId);
    }

    /**
     * Specifies the name of the Backend Address Pool.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Backend Address Pool.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An array of the Load Balancing Outbound Rules associated with this Backend Address Pool.
     * 
     */
    @Import(name="outboundRules")
    private @Nullable Output<List<String>> outboundRules;

    /**
     * @return An array of the Load Balancing Outbound Rules associated with this Backend Address Pool.
     * 
     */
    public Optional<Output<List<String>>> outboundRules() {
        return Optional.ofNullable(this.outboundRules);
    }

    /**
     * One or more `tunnel_interface` blocks as defined below.
     * 
     */
    @Import(name="tunnelInterfaces")
    private @Nullable Output<List<BackendAddressPoolTunnelInterfaceArgs>> tunnelInterfaces;

    /**
     * @return One or more `tunnel_interface` blocks as defined below.
     * 
     */
    public Optional<Output<List<BackendAddressPoolTunnelInterfaceArgs>>> tunnelInterfaces() {
        return Optional.ofNullable(this.tunnelInterfaces);
    }

    private BackendAddressPoolState() {}

    private BackendAddressPoolState(BackendAddressPoolState $) {
        this.backendIpConfigurations = $.backendIpConfigurations;
        this.loadBalancingRules = $.loadBalancingRules;
        this.loadbalancerId = $.loadbalancerId;
        this.name = $.name;
        this.outboundRules = $.outboundRules;
        this.tunnelInterfaces = $.tunnelInterfaces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendAddressPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendAddressPoolState $;

        public Builder() {
            $ = new BackendAddressPoolState();
        }

        public Builder(BackendAddressPoolState defaults) {
            $ = new BackendAddressPoolState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendIpConfigurations The Backend IP Configurations associated with this Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder backendIpConfigurations(@Nullable Output<List<String>> backendIpConfigurations) {
            $.backendIpConfigurations = backendIpConfigurations;
            return this;
        }

        /**
         * @param backendIpConfigurations The Backend IP Configurations associated with this Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder backendIpConfigurations(List<String> backendIpConfigurations) {
            return backendIpConfigurations(Output.of(backendIpConfigurations));
        }

        /**
         * @param backendIpConfigurations The Backend IP Configurations associated with this Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder backendIpConfigurations(String... backendIpConfigurations) {
            return backendIpConfigurations(List.of(backendIpConfigurations));
        }

        /**
         * @param loadBalancingRules The Load Balancing Rules associated with this Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancingRules(@Nullable Output<List<String>> loadBalancingRules) {
            $.loadBalancingRules = loadBalancingRules;
            return this;
        }

        /**
         * @param loadBalancingRules The Load Balancing Rules associated with this Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancingRules(List<String> loadBalancingRules) {
            return loadBalancingRules(Output.of(loadBalancingRules));
        }

        /**
         * @param loadBalancingRules The Load Balancing Rules associated with this Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancingRules(String... loadBalancingRules) {
            return loadBalancingRules(List.of(loadBalancingRules));
        }

        /**
         * @param loadbalancerId The ID of the Load Balancer in which to create the Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(@Nullable Output<String> loadbalancerId) {
            $.loadbalancerId = loadbalancerId;
            return this;
        }

        /**
         * @param loadbalancerId The ID of the Load Balancer in which to create the Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(String loadbalancerId) {
            return loadbalancerId(Output.of(loadbalancerId));
        }

        /**
         * @param name Specifies the name of the Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outboundRules An array of the Load Balancing Outbound Rules associated with this Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder outboundRules(@Nullable Output<List<String>> outboundRules) {
            $.outboundRules = outboundRules;
            return this;
        }

        /**
         * @param outboundRules An array of the Load Balancing Outbound Rules associated with this Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder outboundRules(List<String> outboundRules) {
            return outboundRules(Output.of(outboundRules));
        }

        /**
         * @param outboundRules An array of the Load Balancing Outbound Rules associated with this Backend Address Pool.
         * 
         * @return builder
         * 
         */
        public Builder outboundRules(String... outboundRules) {
            return outboundRules(List.of(outboundRules));
        }

        /**
         * @param tunnelInterfaces One or more `tunnel_interface` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelInterfaces(@Nullable Output<List<BackendAddressPoolTunnelInterfaceArgs>> tunnelInterfaces) {
            $.tunnelInterfaces = tunnelInterfaces;
            return this;
        }

        /**
         * @param tunnelInterfaces One or more `tunnel_interface` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelInterfaces(List<BackendAddressPoolTunnelInterfaceArgs> tunnelInterfaces) {
            return tunnelInterfaces(Output.of(tunnelInterfaces));
        }

        /**
         * @param tunnelInterfaces One or more `tunnel_interface` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder tunnelInterfaces(BackendAddressPoolTunnelInterfaceArgs... tunnelInterfaces) {
            return tunnelInterfaces(List.of(tunnelInterfaces));
        }

        public BackendAddressPoolState build() {
            return $;
        }
    }

}
