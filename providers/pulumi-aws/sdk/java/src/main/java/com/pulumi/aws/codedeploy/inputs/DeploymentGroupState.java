// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.aws.codedeploy.inputs.DeploymentGroupAlarmConfigurationGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupAutoRollbackConfigurationGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupDeploymentStyleGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagFilterGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupEcsServiceGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupOnPremisesInstanceTagFilterGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupTriggerConfigurationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentGroupState extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupState Empty = new DeploymentGroupState();

    /**
     * Configuration block of alarms associated with the deployment group (documented below).
     * 
     */
    @Import(name="alarmConfiguration")
    private @Nullable Output<DeploymentGroupAlarmConfigurationGetArgs> alarmConfiguration;

    public Optional<Output<DeploymentGroupAlarmConfigurationGetArgs>> alarmConfiguration() {
        return Optional.ofNullable(this.alarmConfiguration);
    }

    /**
     * The name of the application.
     * 
     */
    @Import(name="appName")
    private @Nullable Output<String> appName;

    public Optional<Output<String>> appName() {
        return Optional.ofNullable(this.appName);
    }

    /**
     * The ARN of the CodeDeploy deployment group.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
     * 
     */
    @Import(name="autoRollbackConfiguration")
    private @Nullable Output<DeploymentGroupAutoRollbackConfigurationGetArgs> autoRollbackConfiguration;

    public Optional<Output<DeploymentGroupAutoRollbackConfigurationGetArgs>> autoRollbackConfiguration() {
        return Optional.ofNullable(this.autoRollbackConfiguration);
    }

    /**
     * Autoscaling groups associated with the deployment group.
     * 
     */
    @Import(name="autoscalingGroups")
    private @Nullable Output<List<String>> autoscalingGroups;

    public Optional<Output<List<String>>> autoscalingGroups() {
        return Optional.ofNullable(this.autoscalingGroups);
    }

    /**
     * Configuration block of the blue/green deployment options for a deployment group (documented below).
     * 
     */
    @Import(name="blueGreenDeploymentConfig")
    private @Nullable Output<DeploymentGroupBlueGreenDeploymentConfigGetArgs> blueGreenDeploymentConfig;

    public Optional<Output<DeploymentGroupBlueGreenDeploymentConfigGetArgs>> blueGreenDeploymentConfig() {
        return Optional.ofNullable(this.blueGreenDeploymentConfig);
    }

    /**
     * The destination platform type for the deployment.
     * 
     */
    @Import(name="computePlatform")
    private @Nullable Output<String> computePlatform;

    public Optional<Output<String>> computePlatform() {
        return Optional.ofNullable(this.computePlatform);
    }

    /**
     * The name of the group&#39;s deployment config. The default is &#34;CodeDeployDefault.OneAtATime&#34;.
     * 
     */
    @Import(name="deploymentConfigName")
    private @Nullable Output<String> deploymentConfigName;

    public Optional<Output<String>> deploymentConfigName() {
        return Optional.ofNullable(this.deploymentConfigName);
    }

    /**
     * The ID of the CodeDeploy deployment group.
     * 
     */
    @Import(name="deploymentGroupId")
    private @Nullable Output<String> deploymentGroupId;

    public Optional<Output<String>> deploymentGroupId() {
        return Optional.ofNullable(this.deploymentGroupId);
    }

    /**
     * The name of the deployment group.
     * 
     */
    @Import(name="deploymentGroupName")
    private @Nullable Output<String> deploymentGroupName;

    public Optional<Output<String>> deploymentGroupName() {
        return Optional.ofNullable(this.deploymentGroupName);
    }

    /**
     * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
     * 
     */
    @Import(name="deploymentStyle")
    private @Nullable Output<DeploymentGroupDeploymentStyleGetArgs> deploymentStyle;

    public Optional<Output<DeploymentGroupDeploymentStyleGetArgs>> deploymentStyle() {
        return Optional.ofNullable(this.deploymentStyle);
    }

    /**
     * Tag filters associated with the deployment group. See the AWS docs for details.
     * 
     */
    @Import(name="ec2TagFilters")
    private @Nullable Output<List<DeploymentGroupEc2TagFilterGetArgs>> ec2TagFilters;

    public Optional<Output<List<DeploymentGroupEc2TagFilterGetArgs>>> ec2TagFilters() {
        return Optional.ofNullable(this.ec2TagFilters);
    }

    /**
     * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
     * 
     */
    @Import(name="ec2TagSets")
    private @Nullable Output<List<DeploymentGroupEc2TagSetGetArgs>> ec2TagSets;

    public Optional<Output<List<DeploymentGroupEc2TagSetGetArgs>>> ec2TagSets() {
        return Optional.ofNullable(this.ec2TagSets);
    }

    /**
     * Configuration block(s) of the ECS services for a deployment group (documented below).
     * 
     */
    @Import(name="ecsService")
    private @Nullable Output<DeploymentGroupEcsServiceGetArgs> ecsService;

    public Optional<Output<DeploymentGroupEcsServiceGetArgs>> ecsService() {
        return Optional.ofNullable(this.ecsService);
    }

    /**
     * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
     * 
     */
    @Import(name="loadBalancerInfo")
    private @Nullable Output<DeploymentGroupLoadBalancerInfoGetArgs> loadBalancerInfo;

    public Optional<Output<DeploymentGroupLoadBalancerInfoGetArgs>> loadBalancerInfo() {
        return Optional.ofNullable(this.loadBalancerInfo);
    }

    /**
     * On premise tag filters associated with the group. See the AWS docs for details.
     * 
     */
    @Import(name="onPremisesInstanceTagFilters")
    private @Nullable Output<List<DeploymentGroupOnPremisesInstanceTagFilterGetArgs>> onPremisesInstanceTagFilters;

    public Optional<Output<List<DeploymentGroupOnPremisesInstanceTagFilterGetArgs>>> onPremisesInstanceTagFilters() {
        return Optional.ofNullable(this.onPremisesInstanceTagFilters);
    }

    /**
     * The service role ARN that allows deployments.
     * 
     */
    @Import(name="serviceRoleArn")
    private @Nullable Output<String> serviceRoleArn;

    public Optional<Output<String>> serviceRoleArn() {
        return Optional.ofNullable(this.serviceRoleArn);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Configuration block(s) of the triggers for the deployment group (documented below).
     * 
     */
    @Import(name="triggerConfigurations")
    private @Nullable Output<List<DeploymentGroupTriggerConfigurationGetArgs>> triggerConfigurations;

    public Optional<Output<List<DeploymentGroupTriggerConfigurationGetArgs>>> triggerConfigurations() {
        return Optional.ofNullable(this.triggerConfigurations);
    }

    private DeploymentGroupState() {}

    private DeploymentGroupState(DeploymentGroupState $) {
        this.alarmConfiguration = $.alarmConfiguration;
        this.appName = $.appName;
        this.arn = $.arn;
        this.autoRollbackConfiguration = $.autoRollbackConfiguration;
        this.autoscalingGroups = $.autoscalingGroups;
        this.blueGreenDeploymentConfig = $.blueGreenDeploymentConfig;
        this.computePlatform = $.computePlatform;
        this.deploymentConfigName = $.deploymentConfigName;
        this.deploymentGroupId = $.deploymentGroupId;
        this.deploymentGroupName = $.deploymentGroupName;
        this.deploymentStyle = $.deploymentStyle;
        this.ec2TagFilters = $.ec2TagFilters;
        this.ec2TagSets = $.ec2TagSets;
        this.ecsService = $.ecsService;
        this.loadBalancerInfo = $.loadBalancerInfo;
        this.onPremisesInstanceTagFilters = $.onPremisesInstanceTagFilters;
        this.serviceRoleArn = $.serviceRoleArn;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.triggerConfigurations = $.triggerConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupState $;

        public Builder() {
            $ = new DeploymentGroupState();
        }

        public Builder(DeploymentGroupState defaults) {
            $ = new DeploymentGroupState(Objects.requireNonNull(defaults));
        }

        public Builder alarmConfiguration(@Nullable Output<DeploymentGroupAlarmConfigurationGetArgs> alarmConfiguration) {
            $.alarmConfiguration = alarmConfiguration;
            return this;
        }

        public Builder alarmConfiguration(DeploymentGroupAlarmConfigurationGetArgs alarmConfiguration) {
            return alarmConfiguration(Output.of(alarmConfiguration));
        }

        public Builder appName(@Nullable Output<String> appName) {
            $.appName = appName;
            return this;
        }

        public Builder appName(String appName) {
            return appName(Output.of(appName));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder autoRollbackConfiguration(@Nullable Output<DeploymentGroupAutoRollbackConfigurationGetArgs> autoRollbackConfiguration) {
            $.autoRollbackConfiguration = autoRollbackConfiguration;
            return this;
        }

        public Builder autoRollbackConfiguration(DeploymentGroupAutoRollbackConfigurationGetArgs autoRollbackConfiguration) {
            return autoRollbackConfiguration(Output.of(autoRollbackConfiguration));
        }

        public Builder autoscalingGroups(@Nullable Output<List<String>> autoscalingGroups) {
            $.autoscalingGroups = autoscalingGroups;
            return this;
        }

        public Builder autoscalingGroups(List<String> autoscalingGroups) {
            return autoscalingGroups(Output.of(autoscalingGroups));
        }

        public Builder autoscalingGroups(String... autoscalingGroups) {
            return autoscalingGroups(List.of(autoscalingGroups));
        }

        public Builder blueGreenDeploymentConfig(@Nullable Output<DeploymentGroupBlueGreenDeploymentConfigGetArgs> blueGreenDeploymentConfig) {
            $.blueGreenDeploymentConfig = blueGreenDeploymentConfig;
            return this;
        }

        public Builder blueGreenDeploymentConfig(DeploymentGroupBlueGreenDeploymentConfigGetArgs blueGreenDeploymentConfig) {
            return blueGreenDeploymentConfig(Output.of(blueGreenDeploymentConfig));
        }

        public Builder computePlatform(@Nullable Output<String> computePlatform) {
            $.computePlatform = computePlatform;
            return this;
        }

        public Builder computePlatform(String computePlatform) {
            return computePlatform(Output.of(computePlatform));
        }

        public Builder deploymentConfigName(@Nullable Output<String> deploymentConfigName) {
            $.deploymentConfigName = deploymentConfigName;
            return this;
        }

        public Builder deploymentConfigName(String deploymentConfigName) {
            return deploymentConfigName(Output.of(deploymentConfigName));
        }

        public Builder deploymentGroupId(@Nullable Output<String> deploymentGroupId) {
            $.deploymentGroupId = deploymentGroupId;
            return this;
        }

        public Builder deploymentGroupId(String deploymentGroupId) {
            return deploymentGroupId(Output.of(deploymentGroupId));
        }

        public Builder deploymentGroupName(@Nullable Output<String> deploymentGroupName) {
            $.deploymentGroupName = deploymentGroupName;
            return this;
        }

        public Builder deploymentGroupName(String deploymentGroupName) {
            return deploymentGroupName(Output.of(deploymentGroupName));
        }

        public Builder deploymentStyle(@Nullable Output<DeploymentGroupDeploymentStyleGetArgs> deploymentStyle) {
            $.deploymentStyle = deploymentStyle;
            return this;
        }

        public Builder deploymentStyle(DeploymentGroupDeploymentStyleGetArgs deploymentStyle) {
            return deploymentStyle(Output.of(deploymentStyle));
        }

        public Builder ec2TagFilters(@Nullable Output<List<DeploymentGroupEc2TagFilterGetArgs>> ec2TagFilters) {
            $.ec2TagFilters = ec2TagFilters;
            return this;
        }

        public Builder ec2TagFilters(List<DeploymentGroupEc2TagFilterGetArgs> ec2TagFilters) {
            return ec2TagFilters(Output.of(ec2TagFilters));
        }

        public Builder ec2TagFilters(DeploymentGroupEc2TagFilterGetArgs... ec2TagFilters) {
            return ec2TagFilters(List.of(ec2TagFilters));
        }

        public Builder ec2TagSets(@Nullable Output<List<DeploymentGroupEc2TagSetGetArgs>> ec2TagSets) {
            $.ec2TagSets = ec2TagSets;
            return this;
        }

        public Builder ec2TagSets(List<DeploymentGroupEc2TagSetGetArgs> ec2TagSets) {
            return ec2TagSets(Output.of(ec2TagSets));
        }

        public Builder ec2TagSets(DeploymentGroupEc2TagSetGetArgs... ec2TagSets) {
            return ec2TagSets(List.of(ec2TagSets));
        }

        public Builder ecsService(@Nullable Output<DeploymentGroupEcsServiceGetArgs> ecsService) {
            $.ecsService = ecsService;
            return this;
        }

        public Builder ecsService(DeploymentGroupEcsServiceGetArgs ecsService) {
            return ecsService(Output.of(ecsService));
        }

        public Builder loadBalancerInfo(@Nullable Output<DeploymentGroupLoadBalancerInfoGetArgs> loadBalancerInfo) {
            $.loadBalancerInfo = loadBalancerInfo;
            return this;
        }

        public Builder loadBalancerInfo(DeploymentGroupLoadBalancerInfoGetArgs loadBalancerInfo) {
            return loadBalancerInfo(Output.of(loadBalancerInfo));
        }

        public Builder onPremisesInstanceTagFilters(@Nullable Output<List<DeploymentGroupOnPremisesInstanceTagFilterGetArgs>> onPremisesInstanceTagFilters) {
            $.onPremisesInstanceTagFilters = onPremisesInstanceTagFilters;
            return this;
        }

        public Builder onPremisesInstanceTagFilters(List<DeploymentGroupOnPremisesInstanceTagFilterGetArgs> onPremisesInstanceTagFilters) {
            return onPremisesInstanceTagFilters(Output.of(onPremisesInstanceTagFilters));
        }

        public Builder onPremisesInstanceTagFilters(DeploymentGroupOnPremisesInstanceTagFilterGetArgs... onPremisesInstanceTagFilters) {
            return onPremisesInstanceTagFilters(List.of(onPremisesInstanceTagFilters));
        }

        public Builder serviceRoleArn(@Nullable Output<String> serviceRoleArn) {
            $.serviceRoleArn = serviceRoleArn;
            return this;
        }

        public Builder serviceRoleArn(String serviceRoleArn) {
            return serviceRoleArn(Output.of(serviceRoleArn));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder triggerConfigurations(@Nullable Output<List<DeploymentGroupTriggerConfigurationGetArgs>> triggerConfigurations) {
            $.triggerConfigurations = triggerConfigurations;
            return this;
        }

        public Builder triggerConfigurations(List<DeploymentGroupTriggerConfigurationGetArgs> triggerConfigurations) {
            return triggerConfigurations(Output.of(triggerConfigurations));
        }

        public Builder triggerConfigurations(DeploymentGroupTriggerConfigurationGetArgs... triggerConfigurations) {
            return triggerConfigurations(List.of(triggerConfigurations));
        }

        public DeploymentGroupState build() {
            return $;
        }
    }

}
