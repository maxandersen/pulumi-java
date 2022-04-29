// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs;

import com.pulumi.azurenative.notificationhubs.enums.NamespaceType;
import com.pulumi.azurenative.notificationhubs.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceArgs extends ResourceArgs {

    public static final NamespaceArgs Empty = new NamespaceArgs();

    /**
     * The time the namespace was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The time the namespace was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Whether or not the namespace is set as Critical.
     * 
     */
    @Import(name="critical")
    private @Nullable Output<Boolean> critical;

    /**
     * @return Whether or not the namespace is set as Critical.
     * 
     */
    public Optional<Output<Boolean>> critical() {
        return Optional.ofNullable(this.critical);
    }

    /**
     * Data center for the namespace
     * 
     */
    @Import(name="dataCenter")
    private @Nullable Output<String> dataCenter;

    /**
     * @return Data center for the namespace
     * 
     */
    public Optional<Output<String>> dataCenter() {
        return Optional.ofNullable(this.dataCenter);
    }

    /**
     * Whether or not the namespace is currently enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether or not the namespace is currently enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the namespace.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the namespace.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespace name.
     * 
     */
    @Import(name="namespaceName")
    private @Nullable Output<String> namespaceName;

    /**
     * @return The namespace name.
     * 
     */
    public Optional<Output<String>> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }

    /**
     * The namespace type.
     * 
     */
    @Import(name="namespaceType")
    private @Nullable Output<NamespaceType> namespaceType;

    /**
     * @return The namespace type.
     * 
     */
    public Optional<Output<NamespaceType>> namespaceType() {
        return Optional.ofNullable(this.namespaceType);
    }

    /**
     * Provisioning state of the Namespace.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<String> provisioningState;

    /**
     * @return Provisioning state of the Namespace.
     * 
     */
    public Optional<Output<String>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * Specifies the targeted region in which the namespace should be created. It can be any of the following values: Australia East, Australia Southeast, Central US, East US, East US 2, West US, North Central US, South Central US, East Asia, Southeast Asia, Brazil South, Japan East, Japan West, North Europe, West Europe
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Specifies the targeted region in which the namespace should be created. It can be any of the following values: Australia East, Australia Southeast, Central US, East US, East US 2, West US, North Central US, South Central US, East Asia, Southeast Asia, Brazil South, Japan East, Japan West, North Europe, West Europe
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
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
     * ScaleUnit where the namespace gets created
     * 
     */
    @Import(name="scaleUnit")
    private @Nullable Output<String> scaleUnit;

    /**
     * @return ScaleUnit where the namespace gets created
     * 
     */
    public Optional<Output<String>> scaleUnit() {
        return Optional.ofNullable(this.scaleUnit);
    }

    /**
     * Endpoint you can use to perform NotificationHub operations.
     * 
     */
    @Import(name="serviceBusEndpoint")
    private @Nullable Output<String> serviceBusEndpoint;

    /**
     * @return Endpoint you can use to perform NotificationHub operations.
     * 
     */
    public Optional<Output<String>> serviceBusEndpoint() {
        return Optional.ofNullable(this.serviceBusEndpoint);
    }

    /**
     * The sku of the created namespace
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    /**
     * @return The sku of the created namespace
     * 
     */
    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 = Suspended4 = Deleting
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 = Suspended4 = Deleting
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The Id of the Azure subscription associated with the namespace.
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return The Id of the Azure subscription associated with the namespace.
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The time the namespace was updated.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The time the namespace was updated.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private NamespaceArgs() {}

    private NamespaceArgs(NamespaceArgs $) {
        this.createdAt = $.createdAt;
        this.critical = $.critical;
        this.dataCenter = $.dataCenter;
        this.enabled = $.enabled;
        this.location = $.location;
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.namespaceType = $.namespaceType;
        this.provisioningState = $.provisioningState;
        this.region = $.region;
        this.resourceGroupName = $.resourceGroupName;
        this.scaleUnit = $.scaleUnit;
        this.serviceBusEndpoint = $.serviceBusEndpoint;
        this.sku = $.sku;
        this.status = $.status;
        this.subscriptionId = $.subscriptionId;
        this.tags = $.tags;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceArgs $;

        public Builder() {
            $ = new NamespaceArgs();
        }

        public Builder(NamespaceArgs defaults) {
            $ = new NamespaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The time the namespace was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The time the namespace was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param critical Whether or not the namespace is set as Critical.
         * 
         * @return builder
         * 
         */
        public Builder critical(@Nullable Output<Boolean> critical) {
            $.critical = critical;
            return this;
        }

        /**
         * @param critical Whether or not the namespace is set as Critical.
         * 
         * @return builder
         * 
         */
        public Builder critical(Boolean critical) {
            return critical(Output.of(critical));
        }

        /**
         * @param dataCenter Data center for the namespace
         * 
         * @return builder
         * 
         */
        public Builder dataCenter(@Nullable Output<String> dataCenter) {
            $.dataCenter = dataCenter;
            return this;
        }

        /**
         * @param dataCenter Data center for the namespace
         * 
         * @return builder
         * 
         */
        public Builder dataCenter(String dataCenter) {
            return dataCenter(Output.of(dataCenter));
        }

        /**
         * @param enabled Whether or not the namespace is currently enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not the namespace is currently enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName The namespace name.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(@Nullable Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The namespace name.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param namespaceType The namespace type.
         * 
         * @return builder
         * 
         */
        public Builder namespaceType(@Nullable Output<NamespaceType> namespaceType) {
            $.namespaceType = namespaceType;
            return this;
        }

        /**
         * @param namespaceType The namespace type.
         * 
         * @return builder
         * 
         */
        public Builder namespaceType(NamespaceType namespaceType) {
            return namespaceType(Output.of(namespaceType));
        }

        /**
         * @param provisioningState Provisioning state of the Namespace.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState Provisioning state of the Namespace.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param region Specifies the targeted region in which the namespace should be created. It can be any of the following values: Australia East, Australia Southeast, Central US, East US, East US 2, West US, North Central US, South Central US, East Asia, Southeast Asia, Brazil South, Japan East, Japan West, North Europe, West Europe
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Specifies the targeted region in which the namespace should be created. It can be any of the following values: Australia East, Australia Southeast, Central US, East US, East US 2, West US, North Central US, South Central US, East Asia, Southeast Asia, Brazil South, Japan East, Japan West, North Europe, West Europe
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
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
         * @param scaleUnit ScaleUnit where the namespace gets created
         * 
         * @return builder
         * 
         */
        public Builder scaleUnit(@Nullable Output<String> scaleUnit) {
            $.scaleUnit = scaleUnit;
            return this;
        }

        /**
         * @param scaleUnit ScaleUnit where the namespace gets created
         * 
         * @return builder
         * 
         */
        public Builder scaleUnit(String scaleUnit) {
            return scaleUnit(Output.of(scaleUnit));
        }

        /**
         * @param serviceBusEndpoint Endpoint you can use to perform NotificationHub operations.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusEndpoint(@Nullable Output<String> serviceBusEndpoint) {
            $.serviceBusEndpoint = serviceBusEndpoint;
            return this;
        }

        /**
         * @param serviceBusEndpoint Endpoint you can use to perform NotificationHub operations.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusEndpoint(String serviceBusEndpoint) {
            return serviceBusEndpoint(Output.of(serviceBusEndpoint));
        }

        /**
         * @param sku The sku of the created namespace
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The sku of the created namespace
         * 
         * @return builder
         * 
         */
        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param status Status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 = Suspended4 = Deleting
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 = Suspended4 = Deleting
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param subscriptionId The Id of the Azure subscription associated with the namespace.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId The Id of the Azure subscription associated with the namespace.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param updatedAt The time the namespace was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The time the namespace was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public NamespaceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
