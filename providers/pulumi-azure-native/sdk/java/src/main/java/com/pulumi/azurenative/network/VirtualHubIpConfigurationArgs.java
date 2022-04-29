// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.enums.IPAllocationMethod;
import com.pulumi.azurenative.network.inputs.PublicIPAddressArgs;
import com.pulumi.azurenative.network.inputs.SubnetArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualHubIpConfigurationArgs extends ResourceArgs {

    public static final VirtualHubIpConfigurationArgs Empty = new VirtualHubIpConfigurationArgs();

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
     * The name of the ipconfig.
     * 
     */
    @Import(name="ipConfigName")
    private @Nullable Output<String> ipConfigName;

    /**
     * @return The name of the ipconfig.
     * 
     */
    public Optional<Output<String>> ipConfigName() {
        return Optional.ofNullable(this.ipConfigName);
    }

    /**
     * Name of the Ip Configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Ip Configuration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The private IP address of the IP configuration.
     * 
     */
    @Import(name="privateIPAddress")
    private @Nullable Output<String> privateIPAddress;

    /**
     * @return The private IP address of the IP configuration.
     * 
     */
    public Optional<Output<String>> privateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }

    /**
     * The private IP address allocation method.
     * 
     */
    @Import(name="privateIPAllocationMethod")
    private @Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod;

    /**
     * @return The private IP address allocation method.
     * 
     */
    public Optional<Output<Either<String,IPAllocationMethod>>> privateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }

    /**
     * The reference to the public IP resource.
     * 
     */
    @Import(name="publicIPAddress")
    private @Nullable Output<PublicIPAddressArgs> publicIPAddress;

    /**
     * @return The reference to the public IP resource.
     * 
     */
    public Optional<Output<PublicIPAddressArgs>> publicIPAddress() {
        return Optional.ofNullable(this.publicIPAddress);
    }

    /**
     * The resource group name of the VirtualHub.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name of the VirtualHub.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The reference to the subnet resource.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<SubnetArgs> subnet;

    /**
     * @return The reference to the subnet resource.
     * 
     */
    public Optional<Output<SubnetArgs>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @Import(name="virtualHubName", required=true)
    private Output<String> virtualHubName;

    /**
     * @return The name of the VirtualHub.
     * 
     */
    public Output<String> virtualHubName() {
        return this.virtualHubName;
    }

    private VirtualHubIpConfigurationArgs() {}

    private VirtualHubIpConfigurationArgs(VirtualHubIpConfigurationArgs $) {
        this.id = $.id;
        this.ipConfigName = $.ipConfigName;
        this.name = $.name;
        this.privateIPAddress = $.privateIPAddress;
        this.privateIPAllocationMethod = $.privateIPAllocationMethod;
        this.publicIPAddress = $.publicIPAddress;
        this.resourceGroupName = $.resourceGroupName;
        this.subnet = $.subnet;
        this.virtualHubName = $.virtualHubName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualHubIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualHubIpConfigurationArgs $;

        public Builder() {
            $ = new VirtualHubIpConfigurationArgs();
        }

        public Builder(VirtualHubIpConfigurationArgs defaults) {
            $ = new VirtualHubIpConfigurationArgs(Objects.requireNonNull(defaults));
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
         * @param ipConfigName The name of the ipconfig.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigName(@Nullable Output<String> ipConfigName) {
            $.ipConfigName = ipConfigName;
            return this;
        }

        /**
         * @param ipConfigName The name of the ipconfig.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigName(String ipConfigName) {
            return ipConfigName(Output.of(ipConfigName));
        }

        /**
         * @param name Name of the Ip Configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Ip Configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateIPAddress The private IP address of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddress(@Nullable Output<String> privateIPAddress) {
            $.privateIPAddress = privateIPAddress;
            return this;
        }

        /**
         * @param privateIPAddress The private IP address of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddress(String privateIPAddress) {
            return privateIPAddress(Output.of(privateIPAddress));
        }

        /**
         * @param privateIPAllocationMethod The private IP address allocation method.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAllocationMethod(@Nullable Output<Either<String,IPAllocationMethod>> privateIPAllocationMethod) {
            $.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        /**
         * @param privateIPAllocationMethod The private IP address allocation method.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAllocationMethod(Either<String,IPAllocationMethod> privateIPAllocationMethod) {
            return privateIPAllocationMethod(Output.of(privateIPAllocationMethod));
        }

        /**
         * @param privateIPAllocationMethod The private IP address allocation method.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAllocationMethod(String privateIPAllocationMethod) {
            return privateIPAllocationMethod(Either.ofLeft(privateIPAllocationMethod));
        }

        /**
         * @param privateIPAllocationMethod The private IP address allocation method.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod) {
            return privateIPAllocationMethod(Either.ofRight(privateIPAllocationMethod));
        }

        /**
         * @param publicIPAddress The reference to the public IP resource.
         * 
         * @return builder
         * 
         */
        public Builder publicIPAddress(@Nullable Output<PublicIPAddressArgs> publicIPAddress) {
            $.publicIPAddress = publicIPAddress;
            return this;
        }

        /**
         * @param publicIPAddress The reference to the public IP resource.
         * 
         * @return builder
         * 
         */
        public Builder publicIPAddress(PublicIPAddressArgs publicIPAddress) {
            return publicIPAddress(Output.of(publicIPAddress));
        }

        /**
         * @param resourceGroupName The resource group name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param subnet The reference to the subnet resource.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<SubnetArgs> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet The reference to the subnet resource.
         * 
         * @return builder
         * 
         */
        public Builder subnet(SubnetArgs subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param virtualHubName The name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubName(Output<String> virtualHubName) {
            $.virtualHubName = virtualHubName;
            return this;
        }

        /**
         * @param virtualHubName The name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubName(String virtualHubName) {
            return virtualHubName(Output.of(virtualHubName));
        }

        public VirtualHubIpConfigurationArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualHubName = Objects.requireNonNull($.virtualHubName, "expected parameter 'virtualHubName' to be non-null");
            return $;
        }
    }

}
