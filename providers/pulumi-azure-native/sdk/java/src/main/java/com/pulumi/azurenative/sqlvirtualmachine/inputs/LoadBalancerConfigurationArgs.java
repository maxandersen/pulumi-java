// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.azurenative.sqlvirtualmachine.inputs.PrivateIPAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A load balancer configuration for an availability group listener.
 * 
 */
public final class LoadBalancerConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerConfigurationArgs Empty = new LoadBalancerConfigurationArgs();

    /**
     * Resource id of the load balancer.
     * 
     */
    @Import(name="loadBalancerResourceId")
    private @Nullable Output<String> loadBalancerResourceId;

    public Optional<Output<String>> loadBalancerResourceId() {
        return Optional.ofNullable(this.loadBalancerResourceId);
    }

    /**
     * Private IP address.
     * 
     */
    @Import(name="privateIpAddress")
    private @Nullable Output<PrivateIPAddressArgs> privateIpAddress;

    public Optional<Output<PrivateIPAddressArgs>> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }

    /**
     * Probe port.
     * 
     */
    @Import(name="probePort")
    private @Nullable Output<Integer> probePort;

    public Optional<Output<Integer>> probePort() {
        return Optional.ofNullable(this.probePort);
    }

    /**
     * Resource id of the public IP.
     * 
     */
    @Import(name="publicIpAddressResourceId")
    private @Nullable Output<String> publicIpAddressResourceId;

    public Optional<Output<String>> publicIpAddressResourceId() {
        return Optional.ofNullable(this.publicIpAddressResourceId);
    }

    /**
     * List of the SQL virtual machine instance resource id&#39;s that are enrolled into the availability group listener.
     * 
     */
    @Import(name="sqlVirtualMachineInstances")
    private @Nullable Output<List<String>> sqlVirtualMachineInstances;

    public Optional<Output<List<String>>> sqlVirtualMachineInstances() {
        return Optional.ofNullable(this.sqlVirtualMachineInstances);
    }

    private LoadBalancerConfigurationArgs() {}

    private LoadBalancerConfigurationArgs(LoadBalancerConfigurationArgs $) {
        this.loadBalancerResourceId = $.loadBalancerResourceId;
        this.privateIpAddress = $.privateIpAddress;
        this.probePort = $.probePort;
        this.publicIpAddressResourceId = $.publicIpAddressResourceId;
        this.sqlVirtualMachineInstances = $.sqlVirtualMachineInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerConfigurationArgs $;

        public Builder() {
            $ = new LoadBalancerConfigurationArgs();
        }

        public Builder(LoadBalancerConfigurationArgs defaults) {
            $ = new LoadBalancerConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder loadBalancerResourceId(@Nullable Output<String> loadBalancerResourceId) {
            $.loadBalancerResourceId = loadBalancerResourceId;
            return this;
        }

        public Builder loadBalancerResourceId(String loadBalancerResourceId) {
            return loadBalancerResourceId(Output.of(loadBalancerResourceId));
        }

        public Builder privateIpAddress(@Nullable Output<PrivateIPAddressArgs> privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder privateIpAddress(PrivateIPAddressArgs privateIpAddress) {
            return privateIpAddress(Output.of(privateIpAddress));
        }

        public Builder probePort(@Nullable Output<Integer> probePort) {
            $.probePort = probePort;
            return this;
        }

        public Builder probePort(Integer probePort) {
            return probePort(Output.of(probePort));
        }

        public Builder publicIpAddressResourceId(@Nullable Output<String> publicIpAddressResourceId) {
            $.publicIpAddressResourceId = publicIpAddressResourceId;
            return this;
        }

        public Builder publicIpAddressResourceId(String publicIpAddressResourceId) {
            return publicIpAddressResourceId(Output.of(publicIpAddressResourceId));
        }

        public Builder sqlVirtualMachineInstances(@Nullable Output<List<String>> sqlVirtualMachineInstances) {
            $.sqlVirtualMachineInstances = sqlVirtualMachineInstances;
            return this;
        }

        public Builder sqlVirtualMachineInstances(List<String> sqlVirtualMachineInstances) {
            return sqlVirtualMachineInstances(Output.of(sqlVirtualMachineInstances));
        }

        public Builder sqlVirtualMachineInstances(String... sqlVirtualMachineInstances) {
            return sqlVirtualMachineInstances(List.of(sqlVirtualMachineInstances));
        }

        public LoadBalancerConfigurationArgs build() {
            return $;
        }
    }

}
