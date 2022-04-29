// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualRouterArgs extends ResourceArgs {

    public static final VirtualRouterArgs Empty = new VirtualRouterArgs();

    /**
     * The Gateway on which VirtualRouter is hosted.
     * 
     */
    @Import(name="hostedGateway")
    private @Nullable Output<SubResourceArgs> hostedGateway;

    /**
     * @return The Gateway on which VirtualRouter is hosted.
     * 
     */
    public Optional<Output<SubResourceArgs>> hostedGateway() {
        return Optional.ofNullable(this.hostedGateway);
    }

    /**
     * The Subnet on which VirtualRouter is hosted.
     * 
     */
    @Import(name="hostedSubnet")
    private @Nullable Output<SubResourceArgs> hostedSubnet;

    /**
     * @return The Subnet on which VirtualRouter is hosted.
     * 
     */
    public Optional<Output<SubResourceArgs>> hostedSubnet() {
        return Optional.ofNullable(this.hostedSubnet);
    }

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
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * VirtualRouter ASN.
     * 
     */
    @Import(name="virtualRouterAsn")
    private @Nullable Output<Double> virtualRouterAsn;

    /**
     * @return VirtualRouter ASN.
     * 
     */
    public Optional<Output<Double>> virtualRouterAsn() {
        return Optional.ofNullable(this.virtualRouterAsn);
    }

    /**
     * VirtualRouter IPs.
     * 
     */
    @Import(name="virtualRouterIps")
    private @Nullable Output<List<String>> virtualRouterIps;

    /**
     * @return VirtualRouter IPs.
     * 
     */
    public Optional<Output<List<String>>> virtualRouterIps() {
        return Optional.ofNullable(this.virtualRouterIps);
    }

    /**
     * The name of the Virtual Router.
     * 
     */
    @Import(name="virtualRouterName")
    private @Nullable Output<String> virtualRouterName;

    /**
     * @return The name of the Virtual Router.
     * 
     */
    public Optional<Output<String>> virtualRouterName() {
        return Optional.ofNullable(this.virtualRouterName);
    }

    private VirtualRouterArgs() {}

    private VirtualRouterArgs(VirtualRouterArgs $) {
        this.hostedGateway = $.hostedGateway;
        this.hostedSubnet = $.hostedSubnet;
        this.id = $.id;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.virtualRouterAsn = $.virtualRouterAsn;
        this.virtualRouterIps = $.virtualRouterIps;
        this.virtualRouterName = $.virtualRouterName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualRouterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualRouterArgs $;

        public Builder() {
            $ = new VirtualRouterArgs();
        }

        public Builder(VirtualRouterArgs defaults) {
            $ = new VirtualRouterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostedGateway The Gateway on which VirtualRouter is hosted.
         * 
         * @return builder
         * 
         */
        public Builder hostedGateway(@Nullable Output<SubResourceArgs> hostedGateway) {
            $.hostedGateway = hostedGateway;
            return this;
        }

        /**
         * @param hostedGateway The Gateway on which VirtualRouter is hosted.
         * 
         * @return builder
         * 
         */
        public Builder hostedGateway(SubResourceArgs hostedGateway) {
            return hostedGateway(Output.of(hostedGateway));
        }

        /**
         * @param hostedSubnet The Subnet on which VirtualRouter is hosted.
         * 
         * @return builder
         * 
         */
        public Builder hostedSubnet(@Nullable Output<SubResourceArgs> hostedSubnet) {
            $.hostedSubnet = hostedSubnet;
            return this;
        }

        /**
         * @param hostedSubnet The Subnet on which VirtualRouter is hosted.
         * 
         * @return builder
         * 
         */
        public Builder hostedSubnet(SubResourceArgs hostedSubnet) {
            return hostedSubnet(Output.of(hostedSubnet));
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
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
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
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param virtualRouterAsn VirtualRouter ASN.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterAsn(@Nullable Output<Double> virtualRouterAsn) {
            $.virtualRouterAsn = virtualRouterAsn;
            return this;
        }

        /**
         * @param virtualRouterAsn VirtualRouter ASN.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterAsn(Double virtualRouterAsn) {
            return virtualRouterAsn(Output.of(virtualRouterAsn));
        }

        /**
         * @param virtualRouterIps VirtualRouter IPs.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterIps(@Nullable Output<List<String>> virtualRouterIps) {
            $.virtualRouterIps = virtualRouterIps;
            return this;
        }

        /**
         * @param virtualRouterIps VirtualRouter IPs.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterIps(List<String> virtualRouterIps) {
            return virtualRouterIps(Output.of(virtualRouterIps));
        }

        /**
         * @param virtualRouterIps VirtualRouter IPs.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterIps(String... virtualRouterIps) {
            return virtualRouterIps(List.of(virtualRouterIps));
        }

        /**
         * @param virtualRouterName The name of the Virtual Router.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterName(@Nullable Output<String> virtualRouterName) {
            $.virtualRouterName = virtualRouterName;
            return this;
        }

        /**
         * @param virtualRouterName The name of the Virtual Router.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterName(String virtualRouterName) {
            return virtualRouterName(Output.of(virtualRouterName));
        }

        public VirtualRouterArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
