// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute;

import com.pulumi.azurenative.machinelearningcompute.enums.ClusterType;
import com.pulumi.azurenative.machinelearningcompute.inputs.AcsClusterPropertiesArgs;
import com.pulumi.azurenative.machinelearningcompute.inputs.AppInsightsPropertiesArgs;
import com.pulumi.azurenative.machinelearningcompute.inputs.ContainerRegistryPropertiesArgs;
import com.pulumi.azurenative.machinelearningcompute.inputs.GlobalServiceConfigurationArgs;
import com.pulumi.azurenative.machinelearningcompute.inputs.StorageAccountPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OperationalizationClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final OperationalizationClusterArgs Empty = new OperationalizationClusterArgs();

    /**
     * AppInsights configuration.
     * 
     */
    @Import(name="appInsights")
    private @Nullable Output<AppInsightsPropertiesArgs> appInsights;

    /**
     * @return AppInsights configuration.
     * 
     */
    public Optional<Output<AppInsightsPropertiesArgs>> appInsights() {
        return Optional.ofNullable(this.appInsights);
    }

    /**
     * The name of the cluster.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return The name of the cluster.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * The cluster type.
     * 
     */
    @Import(name="clusterType", required=true)
    private Output<Either<String,ClusterType>> clusterType;

    /**
     * @return The cluster type.
     * 
     */
    public Output<Either<String,ClusterType>> clusterType() {
        return this.clusterType;
    }

    /**
     * Container Registry properties.
     * 
     */
    @Import(name="containerRegistry")
    private @Nullable Output<ContainerRegistryPropertiesArgs> containerRegistry;

    /**
     * @return Container Registry properties.
     * 
     */
    public Optional<Output<ContainerRegistryPropertiesArgs>> containerRegistry() {
        return Optional.ofNullable(this.containerRegistry);
    }

    /**
     * Parameters for the Azure Container Service cluster.
     * 
     */
    @Import(name="containerService")
    private @Nullable Output<AcsClusterPropertiesArgs> containerService;

    /**
     * @return Parameters for the Azure Container Service cluster.
     * 
     */
    public Optional<Output<AcsClusterPropertiesArgs>> containerService() {
        return Optional.ofNullable(this.containerService);
    }

    /**
     * The description of the cluster.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the cluster.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Contains global configuration for the web services in the cluster.
     * 
     */
    @Import(name="globalServiceConfiguration")
    private @Nullable Output<GlobalServiceConfigurationArgs> globalServiceConfiguration;

    /**
     * @return Contains global configuration for the web services in the cluster.
     * 
     */
    public Optional<Output<GlobalServiceConfigurationArgs>> globalServiceConfiguration() {
        return Optional.ofNullable(this.globalServiceConfiguration);
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the resource group in which the cluster is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group in which the cluster is located.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Storage Account properties.
     * 
     */
    @Import(name="storageAccount")
    private @Nullable Output<StorageAccountPropertiesArgs> storageAccount;

    /**
     * @return Storage Account properties.
     * 
     */
    public Optional<Output<StorageAccountPropertiesArgs>> storageAccount() {
        return Optional.ofNullable(this.storageAccount);
    }

    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Contains resource tags defined as key/value pairs.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private OperationalizationClusterArgs() {}

    private OperationalizationClusterArgs(OperationalizationClusterArgs $) {
        this.appInsights = $.appInsights;
        this.clusterName = $.clusterName;
        this.clusterType = $.clusterType;
        this.containerRegistry = $.containerRegistry;
        this.containerService = $.containerService;
        this.description = $.description;
        this.globalServiceConfiguration = $.globalServiceConfiguration;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.storageAccount = $.storageAccount;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OperationalizationClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OperationalizationClusterArgs $;

        public Builder() {
            $ = new OperationalizationClusterArgs();
        }

        public Builder(OperationalizationClusterArgs defaults) {
            $ = new OperationalizationClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appInsights AppInsights configuration.
         * 
         * @return builder
         * 
         */
        public Builder appInsights(@Nullable Output<AppInsightsPropertiesArgs> appInsights) {
            $.appInsights = appInsights;
            return this;
        }

        /**
         * @param appInsights AppInsights configuration.
         * 
         * @return builder
         * 
         */
        public Builder appInsights(AppInsightsPropertiesArgs appInsights) {
            return appInsights(Output.of(appInsights));
        }

        /**
         * @param clusterName The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param clusterType The cluster type.
         * 
         * @return builder
         * 
         */
        public Builder clusterType(Output<Either<String,ClusterType>> clusterType) {
            $.clusterType = clusterType;
            return this;
        }

        /**
         * @param clusterType The cluster type.
         * 
         * @return builder
         * 
         */
        public Builder clusterType(Either<String,ClusterType> clusterType) {
            return clusterType(Output.of(clusterType));
        }

        /**
         * @param clusterType The cluster type.
         * 
         * @return builder
         * 
         */
        public Builder clusterType(String clusterType) {
            return clusterType(Either.ofLeft(clusterType));
        }

        /**
         * @param clusterType The cluster type.
         * 
         * @return builder
         * 
         */
        public Builder clusterType(ClusterType clusterType) {
            return clusterType(Either.ofRight(clusterType));
        }

        /**
         * @param containerRegistry Container Registry properties.
         * 
         * @return builder
         * 
         */
        public Builder containerRegistry(@Nullable Output<ContainerRegistryPropertiesArgs> containerRegistry) {
            $.containerRegistry = containerRegistry;
            return this;
        }

        /**
         * @param containerRegistry Container Registry properties.
         * 
         * @return builder
         * 
         */
        public Builder containerRegistry(ContainerRegistryPropertiesArgs containerRegistry) {
            return containerRegistry(Output.of(containerRegistry));
        }

        /**
         * @param containerService Parameters for the Azure Container Service cluster.
         * 
         * @return builder
         * 
         */
        public Builder containerService(@Nullable Output<AcsClusterPropertiesArgs> containerService) {
            $.containerService = containerService;
            return this;
        }

        /**
         * @param containerService Parameters for the Azure Container Service cluster.
         * 
         * @return builder
         * 
         */
        public Builder containerService(AcsClusterPropertiesArgs containerService) {
            return containerService(Output.of(containerService));
        }

        /**
         * @param description The description of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param globalServiceConfiguration Contains global configuration for the web services in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder globalServiceConfiguration(@Nullable Output<GlobalServiceConfigurationArgs> globalServiceConfiguration) {
            $.globalServiceConfiguration = globalServiceConfiguration;
            return this;
        }

        /**
         * @param globalServiceConfiguration Contains global configuration for the web services in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder globalServiceConfiguration(GlobalServiceConfigurationArgs globalServiceConfiguration) {
            return globalServiceConfiguration(Output.of(globalServiceConfiguration));
        }

        /**
         * @param location Specifies the location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName Name of the resource group in which the cluster is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group in which the cluster is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageAccount Storage Account properties.
         * 
         * @return builder
         * 
         */
        public Builder storageAccount(@Nullable Output<StorageAccountPropertiesArgs> storageAccount) {
            $.storageAccount = storageAccount;
            return this;
        }

        /**
         * @param storageAccount Storage Account properties.
         * 
         * @return builder
         * 
         */
        public Builder storageAccount(StorageAccountPropertiesArgs storageAccount) {
            return storageAccount(Output.of(storageAccount));
        }

        /**
         * @param tags Contains resource tags defined as key/value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Contains resource tags defined as key/value pairs.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public OperationalizationClusterArgs build() {
            $.clusterType = Objects.requireNonNull($.clusterType, "expected parameter 'clusterType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
