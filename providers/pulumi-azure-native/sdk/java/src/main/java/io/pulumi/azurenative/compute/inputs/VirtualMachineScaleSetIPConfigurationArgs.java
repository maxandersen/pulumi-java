// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.IPVersion;
import io.pulumi.azurenative.compute.inputs.ApiEntityReferenceArgs;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetPublicIPAddressConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set network profile's IP configuration.
 * 
 */
public final class VirtualMachineScaleSetIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetIPConfigurationArgs Empty = new VirtualMachineScaleSetIPConfigurationArgs();

    /**
     * Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets cannot use the same application gateway.
     * 
     */
    @Import(name="applicationGatewayBackendAddressPools")
      private final @Nullable Output<List<SubResourceArgs>> applicationGatewayBackendAddressPools;

    public Output<List<SubResourceArgs>> applicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools == null ? Codegen.empty() : this.applicationGatewayBackendAddressPools;
    }

    /**
     * Specifies an array of references to application security group.
     * 
     */
    @Import(name="applicationSecurityGroups")
      private final @Nullable Output<List<SubResourceArgs>> applicationSecurityGroups;

    public Output<List<SubResourceArgs>> applicationSecurityGroups() {
        return this.applicationSecurityGroups == null ? Codegen.empty() : this.applicationSecurityGroups;
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
     */
    @Import(name="loadBalancerBackendAddressPools")
      private final @Nullable Output<List<SubResourceArgs>> loadBalancerBackendAddressPools;

    public Output<List<SubResourceArgs>> loadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools == null ? Codegen.empty() : this.loadBalancerBackendAddressPools;
    }

    /**
     * Specifies an array of references to inbound Nat pools of the load balancers. A scale set can reference inbound nat pools of one public and one internal load balancer. Multiple scale sets cannot use the same basic sku load balancer.
     * 
     */
    @Import(name="loadBalancerInboundNatPools")
      private final @Nullable Output<List<SubResourceArgs>> loadBalancerInboundNatPools;

    public Output<List<SubResourceArgs>> loadBalancerInboundNatPools() {
        return this.loadBalancerInboundNatPools == null ? Codegen.empty() : this.loadBalancerInboundNatPools;
    }

    /**
     * The IP configuration name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    @Import(name="primary")
      private final @Nullable Output<Boolean> primary;

    public Output<Boolean> primary() {
        return this.primary == null ? Codegen.empty() : this.primary;
    }

    /**
     * Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: 'IPv4' and 'IPv6'.
     * 
     */
    @Import(name="privateIPAddressVersion")
      private final @Nullable Output<Either<String,IPVersion>> privateIPAddressVersion;

    public Output<Either<String,IPVersion>> privateIPAddressVersion() {
        return this.privateIPAddressVersion == null ? Codegen.empty() : this.privateIPAddressVersion;
    }

    /**
     * The publicIPAddressConfiguration.
     * 
     */
    @Import(name="publicIPAddressConfiguration")
      private final @Nullable Output<VirtualMachineScaleSetPublicIPAddressConfigurationArgs> publicIPAddressConfiguration;

    public Output<VirtualMachineScaleSetPublicIPAddressConfigurationArgs> publicIPAddressConfiguration() {
        return this.publicIPAddressConfiguration == null ? Codegen.empty() : this.publicIPAddressConfiguration;
    }

    /**
     * Specifies the identifier of the subnet.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<ApiEntityReferenceArgs> subnet;

    public Output<ApiEntityReferenceArgs> subnet() {
        return this.subnet == null ? Codegen.empty() : this.subnet;
    }

    public VirtualMachineScaleSetIPConfigurationArgs(
        @Nullable Output<List<SubResourceArgs>> applicationGatewayBackendAddressPools,
        @Nullable Output<List<SubResourceArgs>> applicationSecurityGroups,
        @Nullable Output<String> id,
        @Nullable Output<List<SubResourceArgs>> loadBalancerBackendAddressPools,
        @Nullable Output<List<SubResourceArgs>> loadBalancerInboundNatPools,
        Output<String> name,
        @Nullable Output<Boolean> primary,
        @Nullable Output<Either<String,IPVersion>> privateIPAddressVersion,
        @Nullable Output<VirtualMachineScaleSetPublicIPAddressConfigurationArgs> publicIPAddressConfiguration,
        @Nullable Output<ApiEntityReferenceArgs> subnet) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        this.applicationSecurityGroups = applicationSecurityGroups;
        this.id = id;
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.primary = primary;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.publicIPAddressConfiguration = publicIPAddressConfiguration;
        this.subnet = subnet;
    }

    private VirtualMachineScaleSetIPConfigurationArgs() {
        this.applicationGatewayBackendAddressPools = Codegen.empty();
        this.applicationSecurityGroups = Codegen.empty();
        this.id = Codegen.empty();
        this.loadBalancerBackendAddressPools = Codegen.empty();
        this.loadBalancerInboundNatPools = Codegen.empty();
        this.name = Codegen.empty();
        this.primary = Codegen.empty();
        this.privateIPAddressVersion = Codegen.empty();
        this.publicIPAddressConfiguration = Codegen.empty();
        this.subnet = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SubResourceArgs>> applicationGatewayBackendAddressPools;
        private @Nullable Output<List<SubResourceArgs>> applicationSecurityGroups;
        private @Nullable Output<String> id;
        private @Nullable Output<List<SubResourceArgs>> loadBalancerBackendAddressPools;
        private @Nullable Output<List<SubResourceArgs>> loadBalancerInboundNatPools;
        private Output<String> name;
        private @Nullable Output<Boolean> primary;
        private @Nullable Output<Either<String,IPVersion>> privateIPAddressVersion;
        private @Nullable Output<VirtualMachineScaleSetPublicIPAddressConfigurationArgs> publicIPAddressConfiguration;
        private @Nullable Output<ApiEntityReferenceArgs> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetIPConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGatewayBackendAddressPools = defaults.applicationGatewayBackendAddressPools;
    	      this.applicationSecurityGroups = defaults.applicationSecurityGroups;
    	      this.id = defaults.id;
    	      this.loadBalancerBackendAddressPools = defaults.loadBalancerBackendAddressPools;
    	      this.loadBalancerInboundNatPools = defaults.loadBalancerInboundNatPools;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.publicIPAddressConfiguration = defaults.publicIPAddressConfiguration;
    	      this.subnet = defaults.subnet;
        }

        public Builder applicationGatewayBackendAddressPools(@Nullable Output<List<SubResourceArgs>> applicationGatewayBackendAddressPools) {
            this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
            return this;
        }
        public Builder applicationGatewayBackendAddressPools(@Nullable List<SubResourceArgs> applicationGatewayBackendAddressPools) {
            this.applicationGatewayBackendAddressPools = Codegen.ofNullable(applicationGatewayBackendAddressPools);
            return this;
        }
        public Builder applicationGatewayBackendAddressPools(SubResourceArgs... applicationGatewayBackendAddressPools) {
            return applicationGatewayBackendAddressPools(List.of(applicationGatewayBackendAddressPools));
        }
        public Builder applicationSecurityGroups(@Nullable Output<List<SubResourceArgs>> applicationSecurityGroups) {
            this.applicationSecurityGroups = applicationSecurityGroups;
            return this;
        }
        public Builder applicationSecurityGroups(@Nullable List<SubResourceArgs> applicationSecurityGroups) {
            this.applicationSecurityGroups = Codegen.ofNullable(applicationSecurityGroups);
            return this;
        }
        public Builder applicationSecurityGroups(SubResourceArgs... applicationSecurityGroups) {
            return applicationSecurityGroups(List.of(applicationSecurityGroups));
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder loadBalancerBackendAddressPools(@Nullable Output<List<SubResourceArgs>> loadBalancerBackendAddressPools) {
            this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
            return this;
        }
        public Builder loadBalancerBackendAddressPools(@Nullable List<SubResourceArgs> loadBalancerBackendAddressPools) {
            this.loadBalancerBackendAddressPools = Codegen.ofNullable(loadBalancerBackendAddressPools);
            return this;
        }
        public Builder loadBalancerBackendAddressPools(SubResourceArgs... loadBalancerBackendAddressPools) {
            return loadBalancerBackendAddressPools(List.of(loadBalancerBackendAddressPools));
        }
        public Builder loadBalancerInboundNatPools(@Nullable Output<List<SubResourceArgs>> loadBalancerInboundNatPools) {
            this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
            return this;
        }
        public Builder loadBalancerInboundNatPools(@Nullable List<SubResourceArgs> loadBalancerInboundNatPools) {
            this.loadBalancerInboundNatPools = Codegen.ofNullable(loadBalancerInboundNatPools);
            return this;
        }
        public Builder loadBalancerInboundNatPools(SubResourceArgs... loadBalancerInboundNatPools) {
            return loadBalancerInboundNatPools(List.of(loadBalancerInboundNatPools));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder primary(@Nullable Output<Boolean> primary) {
            this.primary = primary;
            return this;
        }
        public Builder primary(@Nullable Boolean primary) {
            this.primary = Codegen.ofNullable(primary);
            return this;
        }
        public Builder privateIPAddressVersion(@Nullable Output<Either<String,IPVersion>> privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }
        public Builder privateIPAddressVersion(@Nullable Either<String,IPVersion> privateIPAddressVersion) {
            this.privateIPAddressVersion = Codegen.ofNullable(privateIPAddressVersion);
            return this;
        }
        public Builder publicIPAddressConfiguration(@Nullable Output<VirtualMachineScaleSetPublicIPAddressConfigurationArgs> publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = publicIPAddressConfiguration;
            return this;
        }
        public Builder publicIPAddressConfiguration(@Nullable VirtualMachineScaleSetPublicIPAddressConfigurationArgs publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = Codegen.ofNullable(publicIPAddressConfiguration);
            return this;
        }
        public Builder subnet(@Nullable Output<ApiEntityReferenceArgs> subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnet(@Nullable ApiEntityReferenceArgs subnet) {
            this.subnet = Codegen.ofNullable(subnet);
            return this;
        }        public VirtualMachineScaleSetIPConfigurationArgs build() {
            return new VirtualMachineScaleSetIPConfigurationArgs(applicationGatewayBackendAddressPools, applicationSecurityGroups, id, loadBalancerBackendAddressPools, loadBalancerInboundNatPools, name, primary, privateIPAddressVersion, publicIPAddressConfiguration, subnet);
        }
    }
}
