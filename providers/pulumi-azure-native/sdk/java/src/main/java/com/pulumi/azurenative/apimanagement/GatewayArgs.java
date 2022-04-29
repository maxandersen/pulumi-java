// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.apimanagement.inputs.ResourceLocationDataContractArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayArgs extends ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * Gateway description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Gateway description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
     * 
     */
    @Import(name="gatewayId")
    private @Nullable Output<String> gatewayId;

    /**
     * @return Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
     * 
     */
    public Optional<Output<String>> gatewayId() {
        return Optional.ofNullable(this.gatewayId);
    }

    /**
     * Gateway location.
     * 
     */
    @Import(name="locationData")
    private @Nullable Output<ResourceLocationDataContractArgs> locationData;

    /**
     * @return Gateway location.
     * 
     */
    public Optional<Output<ResourceLocationDataContractArgs>> locationData() {
        return Optional.ofNullable(this.locationData);
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
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GatewayArgs() {}

    private GatewayArgs(GatewayArgs $) {
        this.description = $.description;
        this.gatewayId = $.gatewayId;
        this.locationData = $.locationData;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayArgs $;

        public Builder() {
            $ = new GatewayArgs();
        }

        public Builder(GatewayArgs defaults) {
            $ = new GatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Gateway description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Gateway description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(@Nullable Output<String> gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        /**
         * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value &#39;managed&#39;
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            return gatewayId(Output.of(gatewayId));
        }

        /**
         * @param locationData Gateway location.
         * 
         * @return builder
         * 
         */
        public Builder locationData(@Nullable Output<ResourceLocationDataContractArgs> locationData) {
            $.locationData = locationData;
            return this;
        }

        /**
         * @param locationData Gateway location.
         * 
         * @return builder
         * 
         */
        public Builder locationData(ResourceLocationDataContractArgs locationData) {
            return locationData(Output.of(locationData));
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
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GatewayArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
