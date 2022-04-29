// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a cloud service IP Configuration
 * 
 */
public final class LoadBalancerFrontendIPConfigurationPropertiesArgs extends ResourceArgs {

    public static final LoadBalancerFrontendIPConfigurationPropertiesArgs Empty = new LoadBalancerFrontendIPConfigurationPropertiesArgs();

    /**
     * The virtual network private IP address of the IP configuration.
     * 
     */
    @Import(name="privateIPAddress")
    private @Nullable Output<String> privateIPAddress;

    /**
     * @return The virtual network private IP address of the IP configuration.
     * 
     */
    public Optional<Output<String>> privateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }

    /**
     * The reference to the public ip address resource.
     * 
     */
    @Import(name="publicIPAddress")
    private @Nullable Output<SubResourceArgs> publicIPAddress;

    /**
     * @return The reference to the public ip address resource.
     * 
     */
    public Optional<Output<SubResourceArgs>> publicIPAddress() {
        return Optional.ofNullable(this.publicIPAddress);
    }

    /**
     * The reference to the virtual network subnet resource.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<SubResourceArgs> subnet;

    /**
     * @return The reference to the virtual network subnet resource.
     * 
     */
    public Optional<Output<SubResourceArgs>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private LoadBalancerFrontendIPConfigurationPropertiesArgs() {}

    private LoadBalancerFrontendIPConfigurationPropertiesArgs(LoadBalancerFrontendIPConfigurationPropertiesArgs $) {
        this.privateIPAddress = $.privateIPAddress;
        this.publicIPAddress = $.publicIPAddress;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerFrontendIPConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerFrontendIPConfigurationPropertiesArgs $;

        public Builder() {
            $ = new LoadBalancerFrontendIPConfigurationPropertiesArgs();
        }

        public Builder(LoadBalancerFrontendIPConfigurationPropertiesArgs defaults) {
            $ = new LoadBalancerFrontendIPConfigurationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateIPAddress The virtual network private IP address of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddress(@Nullable Output<String> privateIPAddress) {
            $.privateIPAddress = privateIPAddress;
            return this;
        }

        /**
         * @param privateIPAddress The virtual network private IP address of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder privateIPAddress(String privateIPAddress) {
            return privateIPAddress(Output.of(privateIPAddress));
        }

        /**
         * @param publicIPAddress The reference to the public ip address resource.
         * 
         * @return builder
         * 
         */
        public Builder publicIPAddress(@Nullable Output<SubResourceArgs> publicIPAddress) {
            $.publicIPAddress = publicIPAddress;
            return this;
        }

        /**
         * @param publicIPAddress The reference to the public ip address resource.
         * 
         * @return builder
         * 
         */
        public Builder publicIPAddress(SubResourceArgs publicIPAddress) {
            return publicIPAddress(Output.of(publicIPAddress));
        }

        /**
         * @param subnet The reference to the virtual network subnet resource.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<SubResourceArgs> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet The reference to the virtual network subnet resource.
         * 
         * @return builder
         * 
         */
        public Builder subnet(SubResourceArgs subnet) {
            return subnet(Output.of(subnet));
        }

        public LoadBalancerFrontendIPConfigurationPropertiesArgs build() {
            return $;
        }
    }

}
