// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.IPVersion;
import com.pulumi.azurenative.compute.inputs.ApiEntityReferenceArgs;
import com.pulumi.azurenative.compute.inputs.SubResourceArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetPublicIPAddressConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set network profile&#39;s IP configuration.
 * 
 */
public final class VirtualMachineScaleSetIPConfigurationArgs extends ResourceArgs {

    public static final VirtualMachineScaleSetIPConfigurationArgs Empty = new VirtualMachineScaleSetIPConfigurationArgs();

    /**
     * Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets cannot use the same application gateway.
     * 
     */
    @Import(name="applicationGatewayBackendAddressPools")
    private @Nullable Output<List<SubResourceArgs>> applicationGatewayBackendAddressPools;

    /**
     * @return Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets cannot use the same application gateway.
     * 
     */
    public Optional<Output<List<SubResourceArgs>>> applicationGatewayBackendAddressPools() {
        return Optional.ofNullable(this.applicationGatewayBackendAddressPools);
    }

    /**
     * Specifies an array of references to application security group.
     * 
     */
    @Import(name="applicationSecurityGroups")
    private @Nullable Output<List<SubResourceArgs>> applicationSecurityGroups;

    /**
     * @return Specifies an array of references to application security group.
     * 
     */
    public Optional<Output<List<SubResourceArgs>>> applicationSecurityGroups() {
        return Optional.ofNullable(this.applicationSecurityGroups);
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource Id
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
     */
    @Import(name="loadBalancerBackendAddressPools")
    private @Nullable Output<List<SubResourceArgs>> loadBalancerBackendAddressPools;

    /**
     * @return Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
     */
    public Optional<Output<List<SubResourceArgs>>> loadBalancerBackendAddressPools() {
        return Optional.ofNullable(this.loadBalancerBackendAddressPools);
    }

    /**
     * Specifies an array of references to inbound Nat pools of the load balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
     */
    @Import(name="loadBalancerInboundNatPools")
    private @Nullable Output<List<SubResourceArgs>> loadBalancerInboundNatPools;

    /**
     * @return Specifies an array of references to inbound Nat pools of the load balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
     */
    public Optional<Output<List<SubResourceArgs>>> loadBalancerInboundNatPools() {
        return Optional.ofNullable(this.loadBalancerInboundNatPools);
    }

    /**
     * The IP configuration name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The IP configuration name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    @Import(name="primary")
    private @Nullable Output<Boolean> primary;

    /**
     * @return Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    public Optional<Output<Boolean>> primary() {
        return Optional.ofNullable(this.primary);
    }

    /**
     * Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: &#39;IPv4&#39; and &#39;IPv6&#39;.
     * 
     */
    @Import(name="privateIPAddressVersion")
    private @Nullable Output<Either<String,IPVersion>> privateIPAddressVersion;

    /**
     * @return Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: &#39;IPv4&#39; and &#39;IPv6&#39;.
     * 
     */
    public Optional<Output<Either<String,IPVersion>>> privateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }

    /**
     * The publicIPAddressConfiguration.
     * 
     */
    @Import(name="publicIPAddressConfiguration")
    private @Nullable Output<VirtualMachineScaleSetPublicIPAddressConfigurationArgs> publicIPAddressConfiguration;

    /**
     * @return The publicIPAddressConfiguration.
     * 
     */
    public Optional<Output<VirtualMachineScaleSetPublicIPAddressConfigurationArgs>> publicIPAddressConfiguration() {
        return Optional.ofNullable(this.publicIPAddressConfiguration);
    }

    /**
     * Specifies the identifier of the subnet.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<ApiEntityReferenceArgs> subnet;

    /**
     * @return Specifies the identifier of the subnet.
     * 
     */
    public Optional<Output<ApiEntityReferenceArgs>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private VirtualMachineScaleSetIPConfigurationArgs() {}

    private VirtualMachineScaleSetIPConfigurationArgs(VirtualMachineScaleSetIPConfigurationArgs $) {
        this.applicationGatewayBackendAddressPools = $.applicationGatewayBackendAddressPools;
        this.applicationSecurityGroups = $.applicationSecurityGroups;
        this.id = $.id;
        this.loadBalancerBackendAddressPools = $.loadBalancerBackendAddressPools;
        this.loadBalancerInboundNatPools = $.loadBalancerInboundNatPools;
        this.name = $.name;
        this.primary = $.primary;
        this.privateIPAddressVersion = $.privateIPAddressVersion;
        this.publicIPAddressConfiguration = $.publicIPAddressConfiguration;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetIPConfigurationArgs $;

        public Builder() {
            $ = new VirtualMachineScaleSetIPConfigurationArgs();
        }

        public Builder(VirtualMachineScaleSetIPConfigurationArgs defaults) {
            $ = new VirtualMachineScaleSetIPConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationGatewayBackendAddressPools Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets cannot use the same application gateway.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayBackendAddressPools(@Nullable Output<List<SubResourceArgs>> applicationGatewayBackendAddressPools) {
            $.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
            return this;
        }

        /**
         * @param applicationGatewayBackendAddressPools Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets cannot use the same application gateway.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayBackendAddressPools(List<SubResourceArgs> applicationGatewayBackendAddressPools) {
            return applicationGatewayBackendAddressPools(Output.of(applicationGatewayBackendAddressPools));
        }

        /**
         * @param applicationGatewayBackendAddressPools Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets cannot use the same application gateway.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayBackendAddressPools(SubResourceArgs... applicationGatewayBackendAddressPools) {
            return applicationGatewayBackendAddressPools(List.of(applicationGatewayBackendAddressPools));
        }

        /**
         * @param applicationSecurityGroups Specifies an array of references to application security group.
         * 
         * @return builder
         * 
         */
        public Builder applicationSecurityGroups(@Nullable Output<List<SubResourceArgs>> applicationSecurityGroups) {
            $.applicationSecurityGroups = applicationSecurityGroups;
            return this;
        }

        /**
         * @param applicationSecurityGroups Specifies an array of references to application security group.
         * 
         * @return builder
         * 
         */
        public Builder applicationSecurityGroups(List<SubResourceArgs> applicationSecurityGroups) {
            return applicationSecurityGroups(Output.of(applicationSecurityGroups));
        }

        /**
         * @param applicationSecurityGroups Specifies an array of references to application security group.
         * 
         * @return builder
         * 
         */
        public Builder applicationSecurityGroups(SubResourceArgs... applicationSecurityGroups) {
            return applicationSecurityGroups(List.of(applicationSecurityGroups));
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param loadBalancerBackendAddressPools Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddressPools(@Nullable Output<List<SubResourceArgs>> loadBalancerBackendAddressPools) {
            $.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
            return this;
        }

        /**
         * @param loadBalancerBackendAddressPools Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddressPools(List<SubResourceArgs> loadBalancerBackendAddressPools) {
            return loadBalancerBackendAddressPools(Output.of(loadBalancerBackendAddressPools));
        }

        /**
         * @param loadBalancerBackendAddressPools Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddressPools(SubResourceArgs... loadBalancerBackendAddressPools) {
            return loadBalancerBackendAddressPools(List.of(loadBalancerBackendAddressPools));
        }

        /**
         * @param loadBalancerInboundNatPools Specifies an array of references to inbound Nat pools of the load balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerInboundNatPools(@Nullable Output<List<SubResourceArgs>> loadBalancerInboundNatPools) {
            $.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
            return this;
        }

        /**
         * @param loadBalancerInboundNatPools Specifies an array of references to inbound Nat pools of the load balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerInboundNatPools(List<SubResourceArgs> loadBalancerInboundNatPools) {
            return loadBalancerInboundNatPools(Output.of(loadBalancerInboundNatPools));
        }

        /**
         * @param loadBalancerInboundNatPools Specifies an array of references to inbound Nat pools of the load balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerInboundNatPools(SubResourceArgs... loadBalancerInboundNatPools) {
            return loadBalancerInboundNatPools(List.of(loadBalancerInboundNatPools));
        }

        /**
         * @param name The IP configuration name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The IP configuration name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primary Specifies the primary network interface in case the virtual machine has more than 1 network interface.
         * 
         * @return builder
         * 
         */
        public Builder primary(@Nullable Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary Specifies the primary network interface in case the virtual machine has more than 1 network interface.
         * 
         * @return builder
         * 
         */
        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param privateIPAddressVersion Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: &#39;IPv4&#39; and &#39;IPv6&#39;.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddressVersion(@Nullable Output<Either<String,IPVersion>> privateIPAddressVersion) {
            $.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }

        /**
         * @param privateIPAddressVersion Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: &#39;IPv4&#39; and &#39;IPv6&#39;.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddressVersion(Either<String,IPVersion> privateIPAddressVersion) {
            return privateIPAddressVersion(Output.of(privateIPAddressVersion));
        }

        /**
         * @param privateIPAddressVersion Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: &#39;IPv4&#39; and &#39;IPv6&#39;.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddressVersion(String privateIPAddressVersion) {
            return privateIPAddressVersion(Either.ofLeft(privateIPAddressVersion));
        }

        /**
         * @param privateIPAddressVersion Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: &#39;IPv4&#39; and &#39;IPv6&#39;.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddressVersion(IPVersion privateIPAddressVersion) {
            return privateIPAddressVersion(Either.ofRight(privateIPAddressVersion));
        }

        /**
         * @param publicIPAddressConfiguration The publicIPAddressConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder publicIPAddressConfiguration(@Nullable Output<VirtualMachineScaleSetPublicIPAddressConfigurationArgs> publicIPAddressConfiguration) {
            $.publicIPAddressConfiguration = publicIPAddressConfiguration;
            return this;
        }

        /**
         * @param publicIPAddressConfiguration The publicIPAddressConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder publicIPAddressConfiguration(VirtualMachineScaleSetPublicIPAddressConfigurationArgs publicIPAddressConfiguration) {
            return publicIPAddressConfiguration(Output.of(publicIPAddressConfiguration));
        }

        /**
         * @param subnet Specifies the identifier of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<ApiEntityReferenceArgs> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet Specifies the identifier of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnet(ApiEntityReferenceArgs subnet) {
            return subnet(Output.of(subnet));
        }

        public VirtualMachineScaleSetIPConfigurationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
