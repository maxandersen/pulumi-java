// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.NetworkApiVersion;
import com.pulumi.azurenative.compute.inputs.NetworkInterfaceReferenceArgs;
import com.pulumi.azurenative.compute.inputs.VirtualMachineNetworkInterfaceConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the network interfaces or the networking configuration of the virtual machine.
 * 
 */
public final class NetworkProfileArgs extends ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations
     * 
     */
    @Import(name="networkApiVersion")
    private @Nullable Output<Either<String,NetworkApiVersion>> networkApiVersion;

    /**
     * @return specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations
     * 
     */
    public Optional<Output<Either<String,NetworkApiVersion>>> networkApiVersion() {
        return Optional.ofNullable(this.networkApiVersion);
    }

    /**
     * Specifies the networking configurations that will be used to create the virtual machine networking resources.
     * 
     */
    @Import(name="networkInterfaceConfigurations")
    private @Nullable Output<List<VirtualMachineNetworkInterfaceConfigurationArgs>> networkInterfaceConfigurations;

    /**
     * @return Specifies the networking configurations that will be used to create the virtual machine networking resources.
     * 
     */
    public Optional<Output<List<VirtualMachineNetworkInterfaceConfigurationArgs>>> networkInterfaceConfigurations() {
        return Optional.ofNullable(this.networkInterfaceConfigurations);
    }

    /**
     * Specifies the list of resource Ids for the network interfaces associated with the virtual machine.
     * 
     */
    @Import(name="networkInterfaces")
    private @Nullable Output<List<NetworkInterfaceReferenceArgs>> networkInterfaces;

    /**
     * @return Specifies the list of resource Ids for the network interfaces associated with the virtual machine.
     * 
     */
    public Optional<Output<List<NetworkInterfaceReferenceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    private NetworkProfileArgs() {}

    private NetworkProfileArgs(NetworkProfileArgs $) {
        this.networkApiVersion = $.networkApiVersion;
        this.networkInterfaceConfigurations = $.networkInterfaceConfigurations;
        this.networkInterfaces = $.networkInterfaces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkProfileArgs $;

        public Builder() {
            $ = new NetworkProfileArgs();
        }

        public Builder(NetworkProfileArgs defaults) {
            $ = new NetworkProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkApiVersion specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations
         * 
         * @return builder
         * 
         */
        public Builder networkApiVersion(@Nullable Output<Either<String,NetworkApiVersion>> networkApiVersion) {
            $.networkApiVersion = networkApiVersion;
            return this;
        }

        /**
         * @param networkApiVersion specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations
         * 
         * @return builder
         * 
         */
        public Builder networkApiVersion(Either<String,NetworkApiVersion> networkApiVersion) {
            return networkApiVersion(Output.of(networkApiVersion));
        }

        /**
         * @param networkApiVersion specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations
         * 
         * @return builder
         * 
         */
        public Builder networkApiVersion(String networkApiVersion) {
            return networkApiVersion(Either.ofLeft(networkApiVersion));
        }

        /**
         * @param networkApiVersion specifies the Microsoft.Network API version used when creating networking resources in the Network Interface Configurations
         * 
         * @return builder
         * 
         */
        public Builder networkApiVersion(NetworkApiVersion networkApiVersion) {
            return networkApiVersion(Either.ofRight(networkApiVersion));
        }

        /**
         * @param networkInterfaceConfigurations Specifies the networking configurations that will be used to create the virtual machine networking resources.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceConfigurations(@Nullable Output<List<VirtualMachineNetworkInterfaceConfigurationArgs>> networkInterfaceConfigurations) {
            $.networkInterfaceConfigurations = networkInterfaceConfigurations;
            return this;
        }

        /**
         * @param networkInterfaceConfigurations Specifies the networking configurations that will be used to create the virtual machine networking resources.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceConfigurations(List<VirtualMachineNetworkInterfaceConfigurationArgs> networkInterfaceConfigurations) {
            return networkInterfaceConfigurations(Output.of(networkInterfaceConfigurations));
        }

        /**
         * @param networkInterfaceConfigurations Specifies the networking configurations that will be used to create the virtual machine networking resources.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceConfigurations(VirtualMachineNetworkInterfaceConfigurationArgs... networkInterfaceConfigurations) {
            return networkInterfaceConfigurations(List.of(networkInterfaceConfigurations));
        }

        /**
         * @param networkInterfaces Specifies the list of resource Ids for the network interfaces associated with the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(@Nullable Output<List<NetworkInterfaceReferenceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        /**
         * @param networkInterfaces Specifies the list of resource Ids for the network interfaces associated with the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(List<NetworkInterfaceReferenceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        /**
         * @param networkInterfaces Specifies the list of resource Ids for the network interfaces associated with the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(NetworkInterfaceReferenceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        public NetworkProfileArgs build() {
            return $;
        }
    }

}
