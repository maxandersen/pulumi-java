// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs;

import com.pulumi.awsnative.ecs.enums.ServiceLaunchType;
import com.pulumi.awsnative.ecs.enums.ServicePropagateTags;
import com.pulumi.awsnative.ecs.enums.ServiceSchedulingStrategy;
import com.pulumi.awsnative.ecs.inputs.ServiceCapacityProviderStrategyItemArgs;
import com.pulumi.awsnative.ecs.inputs.ServiceDeploymentConfigurationArgs;
import com.pulumi.awsnative.ecs.inputs.ServiceDeploymentControllerArgs;
import com.pulumi.awsnative.ecs.inputs.ServiceLoadBalancerArgs;
import com.pulumi.awsnative.ecs.inputs.ServiceNetworkConfigurationArgs;
import com.pulumi.awsnative.ecs.inputs.ServicePlacementConstraintArgs;
import com.pulumi.awsnative.ecs.inputs.ServicePlacementStrategyArgs;
import com.pulumi.awsnative.ecs.inputs.ServiceRegistryArgs;
import com.pulumi.awsnative.ecs.inputs.ServiceTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    @Import(name="capacityProviderStrategy")
      private final @Nullable Output<List<ServiceCapacityProviderStrategyItemArgs>> capacityProviderStrategy;

    public Output<List<ServiceCapacityProviderStrategyItemArgs>> capacityProviderStrategy() {
        return this.capacityProviderStrategy == null ? Codegen.empty() : this.capacityProviderStrategy;
    }

    @Import(name="cluster")
      private final @Nullable Output<String> cluster;

    public Output<String> cluster() {
        return this.cluster == null ? Codegen.empty() : this.cluster;
    }

    @Import(name="deploymentConfiguration")
      private final @Nullable Output<ServiceDeploymentConfigurationArgs> deploymentConfiguration;

    public Output<ServiceDeploymentConfigurationArgs> deploymentConfiguration() {
        return this.deploymentConfiguration == null ? Codegen.empty() : this.deploymentConfiguration;
    }

    @Import(name="deploymentController")
      private final @Nullable Output<ServiceDeploymentControllerArgs> deploymentController;

    public Output<ServiceDeploymentControllerArgs> deploymentController() {
        return this.deploymentController == null ? Codegen.empty() : this.deploymentController;
    }

    @Import(name="desiredCount")
      private final @Nullable Output<Integer> desiredCount;

    public Output<Integer> desiredCount() {
        return this.desiredCount == null ? Codegen.empty() : this.desiredCount;
    }

    @Import(name="enableECSManagedTags")
      private final @Nullable Output<Boolean> enableECSManagedTags;

    public Output<Boolean> enableECSManagedTags() {
        return this.enableECSManagedTags == null ? Codegen.empty() : this.enableECSManagedTags;
    }

    @Import(name="enableExecuteCommand")
      private final @Nullable Output<Boolean> enableExecuteCommand;

    public Output<Boolean> enableExecuteCommand() {
        return this.enableExecuteCommand == null ? Codegen.empty() : this.enableExecuteCommand;
    }

    @Import(name="healthCheckGracePeriodSeconds")
      private final @Nullable Output<Integer> healthCheckGracePeriodSeconds;

    public Output<Integer> healthCheckGracePeriodSeconds() {
        return this.healthCheckGracePeriodSeconds == null ? Codegen.empty() : this.healthCheckGracePeriodSeconds;
    }

    @Import(name="launchType")
      private final @Nullable Output<ServiceLaunchType> launchType;

    public Output<ServiceLaunchType> launchType() {
        return this.launchType == null ? Codegen.empty() : this.launchType;
    }

    @Import(name="loadBalancers")
      private final @Nullable Output<List<ServiceLoadBalancerArgs>> loadBalancers;

    public Output<List<ServiceLoadBalancerArgs>> loadBalancers() {
        return this.loadBalancers == null ? Codegen.empty() : this.loadBalancers;
    }

    @Import(name="networkConfiguration")
      private final @Nullable Output<ServiceNetworkConfigurationArgs> networkConfiguration;

    public Output<ServiceNetworkConfigurationArgs> networkConfiguration() {
        return this.networkConfiguration == null ? Codegen.empty() : this.networkConfiguration;
    }

    @Import(name="placementConstraints")
      private final @Nullable Output<List<ServicePlacementConstraintArgs>> placementConstraints;

    public Output<List<ServicePlacementConstraintArgs>> placementConstraints() {
        return this.placementConstraints == null ? Codegen.empty() : this.placementConstraints;
    }

    @Import(name="placementStrategies")
      private final @Nullable Output<List<ServicePlacementStrategyArgs>> placementStrategies;

    public Output<List<ServicePlacementStrategyArgs>> placementStrategies() {
        return this.placementStrategies == null ? Codegen.empty() : this.placementStrategies;
    }

    @Import(name="platformVersion")
      private final @Nullable Output<String> platformVersion;

    public Output<String> platformVersion() {
        return this.platformVersion == null ? Codegen.empty() : this.platformVersion;
    }

    @Import(name="propagateTags")
      private final @Nullable Output<ServicePropagateTags> propagateTags;

    public Output<ServicePropagateTags> propagateTags() {
        return this.propagateTags == null ? Codegen.empty() : this.propagateTags;
    }

    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    @Import(name="schedulingStrategy")
      private final @Nullable Output<ServiceSchedulingStrategy> schedulingStrategy;

    public Output<ServiceSchedulingStrategy> schedulingStrategy() {
        return this.schedulingStrategy == null ? Codegen.empty() : this.schedulingStrategy;
    }

    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName == null ? Codegen.empty() : this.serviceName;
    }

    @Import(name="serviceRegistries")
      private final @Nullable Output<List<ServiceRegistryArgs>> serviceRegistries;

    public Output<List<ServiceRegistryArgs>> serviceRegistries() {
        return this.serviceRegistries == null ? Codegen.empty() : this.serviceRegistries;
    }

    @Import(name="tags")
      private final @Nullable Output<List<ServiceTagArgs>> tags;

    public Output<List<ServiceTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="taskDefinition")
      private final @Nullable Output<String> taskDefinition;

    public Output<String> taskDefinition() {
        return this.taskDefinition == null ? Codegen.empty() : this.taskDefinition;
    }

    public ServiceArgs(
        @Nullable Output<List<ServiceCapacityProviderStrategyItemArgs>> capacityProviderStrategy,
        @Nullable Output<String> cluster,
        @Nullable Output<ServiceDeploymentConfigurationArgs> deploymentConfiguration,
        @Nullable Output<ServiceDeploymentControllerArgs> deploymentController,
        @Nullable Output<Integer> desiredCount,
        @Nullable Output<Boolean> enableECSManagedTags,
        @Nullable Output<Boolean> enableExecuteCommand,
        @Nullable Output<Integer> healthCheckGracePeriodSeconds,
        @Nullable Output<ServiceLaunchType> launchType,
        @Nullable Output<List<ServiceLoadBalancerArgs>> loadBalancers,
        @Nullable Output<ServiceNetworkConfigurationArgs> networkConfiguration,
        @Nullable Output<List<ServicePlacementConstraintArgs>> placementConstraints,
        @Nullable Output<List<ServicePlacementStrategyArgs>> placementStrategies,
        @Nullable Output<String> platformVersion,
        @Nullable Output<ServicePropagateTags> propagateTags,
        @Nullable Output<String> role,
        @Nullable Output<ServiceSchedulingStrategy> schedulingStrategy,
        @Nullable Output<String> serviceName,
        @Nullable Output<List<ServiceRegistryArgs>> serviceRegistries,
        @Nullable Output<List<ServiceTagArgs>> tags,
        @Nullable Output<String> taskDefinition) {
        this.capacityProviderStrategy = capacityProviderStrategy;
        this.cluster = cluster;
        this.deploymentConfiguration = deploymentConfiguration;
        this.deploymentController = deploymentController;
        this.desiredCount = desiredCount;
        this.enableECSManagedTags = enableECSManagedTags;
        this.enableExecuteCommand = enableExecuteCommand;
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
        this.launchType = launchType;
        this.loadBalancers = loadBalancers;
        this.networkConfiguration = networkConfiguration;
        this.placementConstraints = placementConstraints;
        this.placementStrategies = placementStrategies;
        this.platformVersion = platformVersion;
        this.propagateTags = propagateTags;
        this.role = role;
        this.schedulingStrategy = schedulingStrategy;
        this.serviceName = serviceName;
        this.serviceRegistries = serviceRegistries;
        this.tags = tags;
        this.taskDefinition = taskDefinition;
    }

    private ServiceArgs() {
        this.capacityProviderStrategy = Codegen.empty();
        this.cluster = Codegen.empty();
        this.deploymentConfiguration = Codegen.empty();
        this.deploymentController = Codegen.empty();
        this.desiredCount = Codegen.empty();
        this.enableECSManagedTags = Codegen.empty();
        this.enableExecuteCommand = Codegen.empty();
        this.healthCheckGracePeriodSeconds = Codegen.empty();
        this.launchType = Codegen.empty();
        this.loadBalancers = Codegen.empty();
        this.networkConfiguration = Codegen.empty();
        this.placementConstraints = Codegen.empty();
        this.placementStrategies = Codegen.empty();
        this.platformVersion = Codegen.empty();
        this.propagateTags = Codegen.empty();
        this.role = Codegen.empty();
        this.schedulingStrategy = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.serviceRegistries = Codegen.empty();
        this.tags = Codegen.empty();
        this.taskDefinition = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServiceCapacityProviderStrategyItemArgs>> capacityProviderStrategy;
        private @Nullable Output<String> cluster;
        private @Nullable Output<ServiceDeploymentConfigurationArgs> deploymentConfiguration;
        private @Nullable Output<ServiceDeploymentControllerArgs> deploymentController;
        private @Nullable Output<Integer> desiredCount;
        private @Nullable Output<Boolean> enableECSManagedTags;
        private @Nullable Output<Boolean> enableExecuteCommand;
        private @Nullable Output<Integer> healthCheckGracePeriodSeconds;
        private @Nullable Output<ServiceLaunchType> launchType;
        private @Nullable Output<List<ServiceLoadBalancerArgs>> loadBalancers;
        private @Nullable Output<ServiceNetworkConfigurationArgs> networkConfiguration;
        private @Nullable Output<List<ServicePlacementConstraintArgs>> placementConstraints;
        private @Nullable Output<List<ServicePlacementStrategyArgs>> placementStrategies;
        private @Nullable Output<String> platformVersion;
        private @Nullable Output<ServicePropagateTags> propagateTags;
        private @Nullable Output<String> role;
        private @Nullable Output<ServiceSchedulingStrategy> schedulingStrategy;
        private @Nullable Output<String> serviceName;
        private @Nullable Output<List<ServiceRegistryArgs>> serviceRegistries;
        private @Nullable Output<List<ServiceTagArgs>> tags;
        private @Nullable Output<String> taskDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityProviderStrategy = defaults.capacityProviderStrategy;
    	      this.cluster = defaults.cluster;
    	      this.deploymentConfiguration = defaults.deploymentConfiguration;
    	      this.deploymentController = defaults.deploymentController;
    	      this.desiredCount = defaults.desiredCount;
    	      this.enableECSManagedTags = defaults.enableECSManagedTags;
    	      this.enableExecuteCommand = defaults.enableExecuteCommand;
    	      this.healthCheckGracePeriodSeconds = defaults.healthCheckGracePeriodSeconds;
    	      this.launchType = defaults.launchType;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.placementConstraints = defaults.placementConstraints;
    	      this.placementStrategies = defaults.placementStrategies;
    	      this.platformVersion = defaults.platformVersion;
    	      this.propagateTags = defaults.propagateTags;
    	      this.role = defaults.role;
    	      this.schedulingStrategy = defaults.schedulingStrategy;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceRegistries = defaults.serviceRegistries;
    	      this.tags = defaults.tags;
    	      this.taskDefinition = defaults.taskDefinition;
        }

        public Builder capacityProviderStrategy(@Nullable Output<List<ServiceCapacityProviderStrategyItemArgs>> capacityProviderStrategy) {
            this.capacityProviderStrategy = capacityProviderStrategy;
            return this;
        }
        public Builder capacityProviderStrategy(@Nullable List<ServiceCapacityProviderStrategyItemArgs> capacityProviderStrategy) {
            this.capacityProviderStrategy = Codegen.ofNullable(capacityProviderStrategy);
            return this;
        }
        public Builder capacityProviderStrategy(ServiceCapacityProviderStrategyItemArgs... capacityProviderStrategy) {
            return capacityProviderStrategy(List.of(capacityProviderStrategy));
        }
        public Builder cluster(@Nullable Output<String> cluster) {
            this.cluster = cluster;
            return this;
        }
        public Builder cluster(@Nullable String cluster) {
            this.cluster = Codegen.ofNullable(cluster);
            return this;
        }
        public Builder deploymentConfiguration(@Nullable Output<ServiceDeploymentConfigurationArgs> deploymentConfiguration) {
            this.deploymentConfiguration = deploymentConfiguration;
            return this;
        }
        public Builder deploymentConfiguration(@Nullable ServiceDeploymentConfigurationArgs deploymentConfiguration) {
            this.deploymentConfiguration = Codegen.ofNullable(deploymentConfiguration);
            return this;
        }
        public Builder deploymentController(@Nullable Output<ServiceDeploymentControllerArgs> deploymentController) {
            this.deploymentController = deploymentController;
            return this;
        }
        public Builder deploymentController(@Nullable ServiceDeploymentControllerArgs deploymentController) {
            this.deploymentController = Codegen.ofNullable(deploymentController);
            return this;
        }
        public Builder desiredCount(@Nullable Output<Integer> desiredCount) {
            this.desiredCount = desiredCount;
            return this;
        }
        public Builder desiredCount(@Nullable Integer desiredCount) {
            this.desiredCount = Codegen.ofNullable(desiredCount);
            return this;
        }
        public Builder enableECSManagedTags(@Nullable Output<Boolean> enableECSManagedTags) {
            this.enableECSManagedTags = enableECSManagedTags;
            return this;
        }
        public Builder enableECSManagedTags(@Nullable Boolean enableECSManagedTags) {
            this.enableECSManagedTags = Codegen.ofNullable(enableECSManagedTags);
            return this;
        }
        public Builder enableExecuteCommand(@Nullable Output<Boolean> enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }
        public Builder enableExecuteCommand(@Nullable Boolean enableExecuteCommand) {
            this.enableExecuteCommand = Codegen.ofNullable(enableExecuteCommand);
            return this;
        }
        public Builder healthCheckGracePeriodSeconds(@Nullable Output<Integer> healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
            return this;
        }
        public Builder healthCheckGracePeriodSeconds(@Nullable Integer healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = Codegen.ofNullable(healthCheckGracePeriodSeconds);
            return this;
        }
        public Builder launchType(@Nullable Output<ServiceLaunchType> launchType) {
            this.launchType = launchType;
            return this;
        }
        public Builder launchType(@Nullable ServiceLaunchType launchType) {
            this.launchType = Codegen.ofNullable(launchType);
            return this;
        }
        public Builder loadBalancers(@Nullable Output<List<ServiceLoadBalancerArgs>> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }
        public Builder loadBalancers(@Nullable List<ServiceLoadBalancerArgs> loadBalancers) {
            this.loadBalancers = Codegen.ofNullable(loadBalancers);
            return this;
        }
        public Builder loadBalancers(ServiceLoadBalancerArgs... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }
        public Builder networkConfiguration(@Nullable Output<ServiceNetworkConfigurationArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public Builder networkConfiguration(@Nullable ServiceNetworkConfigurationArgs networkConfiguration) {
            this.networkConfiguration = Codegen.ofNullable(networkConfiguration);
            return this;
        }
        public Builder placementConstraints(@Nullable Output<List<ServicePlacementConstraintArgs>> placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }
        public Builder placementConstraints(@Nullable List<ServicePlacementConstraintArgs> placementConstraints) {
            this.placementConstraints = Codegen.ofNullable(placementConstraints);
            return this;
        }
        public Builder placementConstraints(ServicePlacementConstraintArgs... placementConstraints) {
            return placementConstraints(List.of(placementConstraints));
        }
        public Builder placementStrategies(@Nullable Output<List<ServicePlacementStrategyArgs>> placementStrategies) {
            this.placementStrategies = placementStrategies;
            return this;
        }
        public Builder placementStrategies(@Nullable List<ServicePlacementStrategyArgs> placementStrategies) {
            this.placementStrategies = Codegen.ofNullable(placementStrategies);
            return this;
        }
        public Builder placementStrategies(ServicePlacementStrategyArgs... placementStrategies) {
            return placementStrategies(List.of(placementStrategies));
        }
        public Builder platformVersion(@Nullable Output<String> platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }
        public Builder platformVersion(@Nullable String platformVersion) {
            this.platformVersion = Codegen.ofNullable(platformVersion);
            return this;
        }
        public Builder propagateTags(@Nullable Output<ServicePropagateTags> propagateTags) {
            this.propagateTags = propagateTags;
            return this;
        }
        public Builder propagateTags(@Nullable ServicePropagateTags propagateTags) {
            this.propagateTags = Codegen.ofNullable(propagateTags);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder schedulingStrategy(@Nullable Output<ServiceSchedulingStrategy> schedulingStrategy) {
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }
        public Builder schedulingStrategy(@Nullable ServiceSchedulingStrategy schedulingStrategy) {
            this.schedulingStrategy = Codegen.ofNullable(schedulingStrategy);
            return this;
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Codegen.ofNullable(serviceName);
            return this;
        }
        public Builder serviceRegistries(@Nullable Output<List<ServiceRegistryArgs>> serviceRegistries) {
            this.serviceRegistries = serviceRegistries;
            return this;
        }
        public Builder serviceRegistries(@Nullable List<ServiceRegistryArgs> serviceRegistries) {
            this.serviceRegistries = Codegen.ofNullable(serviceRegistries);
            return this;
        }
        public Builder serviceRegistries(ServiceRegistryArgs... serviceRegistries) {
            return serviceRegistries(List.of(serviceRegistries));
        }
        public Builder tags(@Nullable Output<List<ServiceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ServiceTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ServiceTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder taskDefinition(@Nullable Output<String> taskDefinition) {
            this.taskDefinition = taskDefinition;
            return this;
        }
        public Builder taskDefinition(@Nullable String taskDefinition) {
            this.taskDefinition = Codegen.ofNullable(taskDefinition);
            return this;
        }        public ServiceArgs build() {
            return new ServiceArgs(capacityProviderStrategy, cluster, deploymentConfiguration, deploymentController, desiredCount, enableECSManagedTags, enableExecuteCommand, healthCheckGracePeriodSeconds, launchType, loadBalancers, networkConfiguration, placementConstraints, placementStrategies, platformVersion, propagateTags, role, schedulingStrategy, serviceName, serviceRegistries, tags, taskDefinition);
        }
    }
}
