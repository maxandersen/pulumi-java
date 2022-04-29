// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.VirtualNetworkTapArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInterfaceTapConfigurationArgs extends ResourceArgs {

    public static final NetworkInterfaceTapConfigurationArgs Empty = new NetworkInterfaceTapConfigurationArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the network interface.
     * 
     */
    @Import(name="networkInterfaceName", required=true)
    private Output<String> networkInterfaceName;

    /**
     * @return The name of the network interface.
     * 
     */
    public Output<String> networkInterfaceName() {
        return this.networkInterfaceName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the tap configuration.
     * 
     */
    @Import(name="tapConfigurationName")
    private @Nullable Output<String> tapConfigurationName;

    /**
     * @return The name of the tap configuration.
     * 
     */
    public Optional<Output<String>> tapConfigurationName() {
        return Optional.ofNullable(this.tapConfigurationName);
    }

    /**
     * The reference to the Virtual Network Tap resource.
     * 
     */
    @Import(name="virtualNetworkTap")
    private @Nullable Output<VirtualNetworkTapArgs> virtualNetworkTap;

    /**
     * @return The reference to the Virtual Network Tap resource.
     * 
     */
    public Optional<Output<VirtualNetworkTapArgs>> virtualNetworkTap() {
        return Optional.ofNullable(this.virtualNetworkTap);
    }

    private NetworkInterfaceTapConfigurationArgs() {}

    private NetworkInterfaceTapConfigurationArgs(NetworkInterfaceTapConfigurationArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.networkInterfaceName = $.networkInterfaceName;
        this.resourceGroupName = $.resourceGroupName;
        this.tapConfigurationName = $.tapConfigurationName;
        this.virtualNetworkTap = $.virtualNetworkTap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceTapConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceTapConfigurationArgs $;

        public Builder() {
            $ = new NetworkInterfaceTapConfigurationArgs();
        }

        public Builder(NetworkInterfaceTapConfigurationArgs defaults) {
            $ = new NetworkInterfaceTapConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkInterfaceName The name of the network interface.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceName(Output<String> networkInterfaceName) {
            $.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * @param networkInterfaceName The name of the network interface.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            return networkInterfaceName(Output.of(networkInterfaceName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tapConfigurationName The name of the tap configuration.
         * 
         * @return builder
         * 
         */
        public Builder tapConfigurationName(@Nullable Output<String> tapConfigurationName) {
            $.tapConfigurationName = tapConfigurationName;
            return this;
        }

        /**
         * @param tapConfigurationName The name of the tap configuration.
         * 
         * @return builder
         * 
         */
        public Builder tapConfigurationName(String tapConfigurationName) {
            return tapConfigurationName(Output.of(tapConfigurationName));
        }

        /**
         * @param virtualNetworkTap The reference to the Virtual Network Tap resource.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkTap(@Nullable Output<VirtualNetworkTapArgs> virtualNetworkTap) {
            $.virtualNetworkTap = virtualNetworkTap;
            return this;
        }

        /**
         * @param virtualNetworkTap The reference to the Virtual Network Tap resource.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkTap(VirtualNetworkTapArgs virtualNetworkTap) {
            return virtualNetworkTap(Output.of(virtualNetworkTap));
        }

        public NetworkInterfaceTapConfigurationArgs build() {
            $.networkInterfaceName = Objects.requireNonNull($.networkInterfaceName, "expected parameter 'networkInterfaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
