// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.PoolEndpointConfigurationArgs;
import io.pulumi.azurenative.batch.inputs.PublicIPAddressConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The network configuration for a pool.
 * 
 */
public final class NetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkConfigurationArgs Empty = new NetworkConfigurationArgs();

    /**
     * Pool endpoint configuration is only supported on pools with the virtualMachineConfiguration property.
     * 
     */
    @Import(name="endpointConfiguration")
      private final @Nullable Output<PoolEndpointConfigurationArgs> endpointConfiguration;

    public Output<PoolEndpointConfigurationArgs> endpointConfiguration() {
        return this.endpointConfiguration == null ? Codegen.empty() : this.endpointConfiguration;
    }

    /**
     * This property is only supported on Pools with the virtualMachineConfiguration property.
     * 
     */
    @Import(name="publicIPAddressConfiguration")
      private final @Nullable Output<PublicIPAddressConfigurationArgs> publicIPAddressConfiguration;

    public Output<PublicIPAddressConfigurationArgs> publicIPAddressConfiguration() {
        return this.publicIPAddressConfiguration == null ? Codegen.empty() : this.publicIPAddressConfiguration;
    }

    /**
     * The virtual network must be in the same region and subscription as the Azure Batch account. The specified subnet should have enough free IP addresses to accommodate the number of nodes in the pool. If the subnet doesn't have enough free IP addresses, the pool will partially allocate compute nodes and a resize error will occur. The 'MicrosoftAzureBatch' service principal must have the 'Classic Virtual Machine Contributor' Role-Based Access Control (RBAC) role for the specified VNet. The specified subnet must allow communication from the Azure Batch service to be able to schedule tasks on the compute nodes. This can be verified by checking if the specified VNet has any associated Network Security Groups (NSG). If communication to the compute nodes in the specified subnet is denied by an NSG, then the Batch service will set the state of the compute nodes to unusable. If the specified VNet has any associated Network Security Groups (NSG), then a few reserved system ports must be enabled for inbound communication. For pools created with a virtual machine configuration, enable ports 29876 and 29877, as well as port 22 for Linux and port 3389 for Windows. For pools created with a cloud service configuration, enable ports 10100, 20100, and 30100. Also enable outbound connections to Azure Storage on port 443. For cloudServiceConfiguration pools, only 'classic' VNETs are supported. For more details see: https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    public NetworkConfigurationArgs(
        @Nullable Output<PoolEndpointConfigurationArgs> endpointConfiguration,
        @Nullable Output<PublicIPAddressConfigurationArgs> publicIPAddressConfiguration,
        @Nullable Output<String> subnetId) {
        this.endpointConfiguration = endpointConfiguration;
        this.publicIPAddressConfiguration = publicIPAddressConfiguration;
        this.subnetId = subnetId;
    }

    private NetworkConfigurationArgs() {
        this.endpointConfiguration = Codegen.empty();
        this.publicIPAddressConfiguration = Codegen.empty();
        this.subnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PoolEndpointConfigurationArgs> endpointConfiguration;
        private @Nullable Output<PublicIPAddressConfigurationArgs> publicIPAddressConfiguration;
        private @Nullable Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointConfiguration = defaults.endpointConfiguration;
    	      this.publicIPAddressConfiguration = defaults.publicIPAddressConfiguration;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder endpointConfiguration(@Nullable Output<PoolEndpointConfigurationArgs> endpointConfiguration) {
            this.endpointConfiguration = endpointConfiguration;
            return this;
        }
        public Builder endpointConfiguration(@Nullable PoolEndpointConfigurationArgs endpointConfiguration) {
            this.endpointConfiguration = Codegen.ofNullable(endpointConfiguration);
            return this;
        }
        public Builder publicIPAddressConfiguration(@Nullable Output<PublicIPAddressConfigurationArgs> publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = publicIPAddressConfiguration;
            return this;
        }
        public Builder publicIPAddressConfiguration(@Nullable PublicIPAddressConfigurationArgs publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = Codegen.ofNullable(publicIPAddressConfiguration);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }        public NetworkConfigurationArgs build() {
            return new NetworkConfigurationArgs(endpointConfiguration, publicIPAddressConfiguration, subnetId);
        }
    }
}
