// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecs.TaskSetArgs;
import com.pulumi.aws.ecs.inputs.TaskSetState;
import com.pulumi.aws.ecs.outputs.TaskSetCapacityProviderStrategy;
import com.pulumi.aws.ecs.outputs.TaskSetLoadBalancer;
import com.pulumi.aws.ecs.outputs.TaskSetNetworkConfiguration;
import com.pulumi.aws.ecs.outputs.TaskSetScale;
import com.pulumi.aws.ecs.outputs.TaskSetServiceRegistries;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ECS Task Sets can be imported via the `task_set_id`, `service`, and `cluster` separated by commas (`,`) e.g.
 * 
 * ```sh
 *  $ pulumi import aws:ecs/taskSet:TaskSet example ecs-svc/7177320696926227436,arn:aws:ecs:us-west-2:123456789101:service/example/example-1234567890,arn:aws:ecs:us-west-2:123456789101:cluster/example
 * ```
 * 
 */
@ResourceType(type="aws:ecs/taskSet:TaskSet")
public class TaskSet extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) that identifies the task set.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) that identifies the task set.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The capacity provider strategy to use for the service. Can be one or more.  Defined below.
     * 
     */
    @Export(name="capacityProviderStrategies", type=List.class, parameters={TaskSetCapacityProviderStrategy.class})
    private Output</* @Nullable */ List<TaskSetCapacityProviderStrategy>> capacityProviderStrategies;

    /**
     * @return The capacity provider strategy to use for the service. Can be one or more.  Defined below.
     * 
     */
    public Output</* @Nullable */ List<TaskSetCapacityProviderStrategy>> capacityProviderStrategies() {
        return this.capacityProviderStrategies;
    }
    /**
     * The short name or ARN of the cluster that hosts the service to create the task set in.
     * 
     */
    @Export(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    /**
     * @return The short name or ARN of the cluster that hosts the service to create the task set in.
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }
    /**
     * The external ID associated with the task set.
     * 
     */
    @Export(name="externalId", type=String.class, parameters={})
    private Output<String> externalId;

    /**
     * @return The external ID associated with the task set.
     * 
     */
    public Output<String> externalId() {
        return this.externalId;
    }
    @Export(name="forceDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDelete;

    public Output</* @Nullable */ Boolean> forceDelete() {
        return this.forceDelete;
    }
    /**
     * The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    @Export(name="launchType", type=String.class, parameters={})
    private Output<String> launchType;

    /**
     * @return The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    public Output<String> launchType() {
        return this.launchType;
    }
    /**
     * Details on load balancers that are used with a task set. Detailed below.
     * 
     */
    @Export(name="loadBalancers", type=List.class, parameters={TaskSetLoadBalancer.class})
    private Output</* @Nullable */ List<TaskSetLoadBalancer>> loadBalancers;

    /**
     * @return Details on load balancers that are used with a task set. Detailed below.
     * 
     */
    public Output</* @Nullable */ List<TaskSetLoadBalancer>> loadBalancers() {
        return this.loadBalancers;
    }
    /**
     * The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
     * 
     */
    @Export(name="networkConfiguration", type=TaskSetNetworkConfiguration.class, parameters={})
    private Output</* @Nullable */ TaskSetNetworkConfiguration> networkConfiguration;

    /**
     * @return The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
     * 
     */
    public Output</* @Nullable */ TaskSetNetworkConfiguration> networkConfiguration() {
        return this.networkConfiguration;
    }
    /**
     * The platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    @Export(name="platformVersion", type=String.class, parameters={})
    private Output<String> platformVersion;

    /**
     * @return The platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    public Output<String> platformVersion() {
        return this.platformVersion;
    }
    /**
     * A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
     * 
     */
    @Export(name="scale", type=TaskSetScale.class, parameters={})
    private Output<TaskSetScale> scale;

    /**
     * @return A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
     * 
     */
    public Output<TaskSetScale> scale() {
        return this.scale;
    }
    /**
     * The short name or ARN of the ECS service.
     * 
     */
    @Export(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return The short name or ARN of the ECS service.
     * 
     */
    public Output<String> service() {
        return this.service;
    }
    /**
     * The service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. Detailed below.
     * 
     */
    @Export(name="serviceRegistries", type=TaskSetServiceRegistries.class, parameters={})
    private Output</* @Nullable */ TaskSetServiceRegistries> serviceRegistries;

    /**
     * @return The service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. Detailed below.
     * 
     */
    public Output</* @Nullable */ TaskSetServiceRegistries> serviceRegistries() {
        return this.serviceRegistries;
    }
    /**
     * The stability status. This indicates whether the task set has reached a steady state.
     * 
     */
    @Export(name="stabilityStatus", type=String.class, parameters={})
    private Output<String> stabilityStatus;

    /**
     * @return The stability status. This indicates whether the task set has reached a steady state.
     * 
     */
    public Output<String> stabilityStatus() {
        return this.stabilityStatus;
    }
    /**
     * The status of the task set.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the task set.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
     * 
     */
    @Export(name="taskDefinition", type=String.class, parameters={})
    private Output<String> taskDefinition;

    /**
     * @return The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
     * 
     */
    public Output<String> taskDefinition() {
        return this.taskDefinition;
    }
    /**
     * The ID of the task set.
     * 
     */
    @Export(name="taskSetId", type=String.class, parameters={})
    private Output<String> taskSetId;

    /**
     * @return The ID of the task set.
     * 
     */
    public Output<String> taskSetId() {
        return this.taskSetId;
    }
    @Export(name="waitUntilStable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> waitUntilStable;

    public Output</* @Nullable */ Boolean> waitUntilStable() {
        return this.waitUntilStable;
    }
    /**
     * Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
     * 
     */
    @Export(name="waitUntilStableTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> waitUntilStableTimeout;

    /**
     * @return Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
     * 
     */
    public Output</* @Nullable */ String> waitUntilStableTimeout() {
        return this.waitUntilStableTimeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TaskSet(String name) {
        this(name, TaskSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TaskSet(String name, TaskSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TaskSet(String name, TaskSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/taskSet:TaskSet", name, args == null ? TaskSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TaskSet(String name, Output<String> id, @Nullable TaskSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/taskSet:TaskSet", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TaskSet get(String name, Output<String> id, @Nullable TaskSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TaskSet(name, id, state, options);
    }
}
