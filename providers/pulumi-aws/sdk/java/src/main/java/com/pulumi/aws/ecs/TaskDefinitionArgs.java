// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs;

import com.pulumi.aws.ecs.inputs.TaskDefinitionEphemeralStorageArgs;
import com.pulumi.aws.ecs.inputs.TaskDefinitionInferenceAcceleratorArgs;
import com.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs;
import com.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs;
import com.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs;
import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionArgs Empty = new TaskDefinitionArgs();

    /**
     * A list of valid [container definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a single valid JSON document. Please note that you should only provide values that are part of the container definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
     * 
     */
    @Import(name="containerDefinitions", required=true)
    private Output<String> containerDefinitions;

    public Output<String> containerDefinitions() {
        return this.containerDefinitions;
    }

    /**
     * Number of cpu units used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<String> cpu;

    public Optional<Output<String>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     * 
     */
    @Import(name="ephemeralStorage")
    private @Nullable Output<TaskDefinitionEphemeralStorageArgs> ephemeralStorage;

    public Optional<Output<TaskDefinitionEphemeralStorageArgs>> ephemeralStorage() {
        return Optional.ofNullable(this.ephemeralStorage);
    }

    /**
     * ARN of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
     * 
     */
    @Import(name="executionRoleArn")
    private @Nullable Output<String> executionRoleArn;

    public Optional<Output<String>> executionRoleArn() {
        return Optional.ofNullable(this.executionRoleArn);
    }

    /**
     * A unique name for your task definition.
     * 
     */
    @Import(name="family", required=true)
    private Output<String> family;

    public Output<String> family() {
        return this.family;
    }

    /**
     * Configuration block(s) with Inference Accelerators settings. Detailed below.
     * 
     */
    @Import(name="inferenceAccelerators")
    private @Nullable Output<List<TaskDefinitionInferenceAcceleratorArgs>> inferenceAccelerators;

    public Optional<Output<List<TaskDefinitionInferenceAcceleratorArgs>>> inferenceAccelerators() {
        return Optional.ofNullable(this.inferenceAccelerators);
    }

    /**
     * IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
     * 
     */
    @Import(name="ipcMode")
    private @Nullable Output<String> ipcMode;

    public Optional<Output<String>> ipcMode() {
        return Optional.ofNullable(this.ipcMode);
    }

    /**
     * Amount (in MiB) of memory used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    @Import(name="memory")
    private @Nullable Output<String> memory;

    public Optional<Output<String>> memory() {
        return Optional.ofNullable(this.memory);
    }

    /**
     * Docker networking mode to use for the containers in the task. Valid values are `none`, `bridge`, `awsvpc`, and `host`.
     * 
     */
    @Import(name="networkMode")
    private @Nullable Output<String> networkMode;

    public Optional<Output<String>> networkMode() {
        return Optional.ofNullable(this.networkMode);
    }

    /**
     * Process namespace to use for the containers in the task. The valid values are `host` and `task`.
     * 
     */
    @Import(name="pidMode")
    private @Nullable Output<String> pidMode;

    public Optional<Output<String>> pidMode() {
        return Optional.ofNullable(this.pidMode);
    }

    /**
     * Configuration block for rules that are taken into consideration during task placement. Maximum number of `placement_constraints` is `10`. Detailed below.
     * 
     */
    @Import(name="placementConstraints")
    private @Nullable Output<List<TaskDefinitionPlacementConstraintArgs>> placementConstraints;

    public Optional<Output<List<TaskDefinitionPlacementConstraintArgs>>> placementConstraints() {
        return Optional.ofNullable(this.placementConstraints);
    }

    /**
     * Configuration block for the App Mesh proxy. Detailed below.
     * 
     */
    @Import(name="proxyConfiguration")
    private @Nullable Output<TaskDefinitionProxyConfigurationArgs> proxyConfiguration;

    public Optional<Output<TaskDefinitionProxyConfigurationArgs>> proxyConfiguration() {
        return Optional.ofNullable(this.proxyConfiguration);
    }

    /**
     * Set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
     * 
     */
    @Import(name="requiresCompatibilities")
    private @Nullable Output<List<String>> requiresCompatibilities;

    public Optional<Output<List<String>>> requiresCompatibilities() {
        return Optional.ofNullable(this.requiresCompatibilities);
    }

    /**
     * Configuration block for runtime_platform that containers in your task may use.
     * 
     */
    @Import(name="runtimePlatform")
    private @Nullable Output<TaskDefinitionRuntimePlatformArgs> runtimePlatform;

    public Optional<Output<TaskDefinitionRuntimePlatformArgs>> runtimePlatform() {
        return Optional.ofNullable(this.runtimePlatform);
    }

    @Import(name="skipDestroy")
    private @Nullable Output<Boolean> skipDestroy;

    public Optional<Output<Boolean>> skipDestroy() {
        return Optional.ofNullable(this.skipDestroy);
    }

    /**
     * Key-value map of resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
     * 
     */
    @Import(name="taskRoleArn")
    private @Nullable Output<String> taskRoleArn;

    public Optional<Output<String>> taskRoleArn() {
        return Optional.ofNullable(this.taskRoleArn);
    }

    /**
     * Configuration block for volumes that containers in your task may use. Detailed below.
     * 
     */
    @Import(name="volumes")
    private @Nullable Output<List<TaskDefinitionVolumeArgs>> volumes;

    public Optional<Output<List<TaskDefinitionVolumeArgs>>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    private TaskDefinitionArgs() {}

    private TaskDefinitionArgs(TaskDefinitionArgs $) {
        this.containerDefinitions = $.containerDefinitions;
        this.cpu = $.cpu;
        this.ephemeralStorage = $.ephemeralStorage;
        this.executionRoleArn = $.executionRoleArn;
        this.family = $.family;
        this.inferenceAccelerators = $.inferenceAccelerators;
        this.ipcMode = $.ipcMode;
        this.memory = $.memory;
        this.networkMode = $.networkMode;
        this.pidMode = $.pidMode;
        this.placementConstraints = $.placementConstraints;
        this.proxyConfiguration = $.proxyConfiguration;
        this.requiresCompatibilities = $.requiresCompatibilities;
        this.runtimePlatform = $.runtimePlatform;
        this.skipDestroy = $.skipDestroy;
        this.tags = $.tags;
        this.taskRoleArn = $.taskRoleArn;
        this.volumes = $.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionArgs $;

        public Builder() {
            $ = new TaskDefinitionArgs();
        }

        public Builder(TaskDefinitionArgs defaults) {
            $ = new TaskDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerDefinitions(Output<String> containerDefinitions) {
            $.containerDefinitions = containerDefinitions;
            return this;
        }

        public Builder containerDefinitions(String containerDefinitions) {
            return containerDefinitions(Output.of(containerDefinitions));
        }

        public Builder cpu(@Nullable Output<String> cpu) {
            $.cpu = cpu;
            return this;
        }

        public Builder cpu(String cpu) {
            return cpu(Output.of(cpu));
        }

        public Builder ephemeralStorage(@Nullable Output<TaskDefinitionEphemeralStorageArgs> ephemeralStorage) {
            $.ephemeralStorage = ephemeralStorage;
            return this;
        }

        public Builder ephemeralStorage(TaskDefinitionEphemeralStorageArgs ephemeralStorage) {
            return ephemeralStorage(Output.of(ephemeralStorage));
        }

        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            $.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder executionRoleArn(String executionRoleArn) {
            return executionRoleArn(Output.of(executionRoleArn));
        }

        public Builder family(Output<String> family) {
            $.family = family;
            return this;
        }

        public Builder family(String family) {
            return family(Output.of(family));
        }

        public Builder inferenceAccelerators(@Nullable Output<List<TaskDefinitionInferenceAcceleratorArgs>> inferenceAccelerators) {
            $.inferenceAccelerators = inferenceAccelerators;
            return this;
        }

        public Builder inferenceAccelerators(List<TaskDefinitionInferenceAcceleratorArgs> inferenceAccelerators) {
            return inferenceAccelerators(Output.of(inferenceAccelerators));
        }

        public Builder inferenceAccelerators(TaskDefinitionInferenceAcceleratorArgs... inferenceAccelerators) {
            return inferenceAccelerators(List.of(inferenceAccelerators));
        }

        public Builder ipcMode(@Nullable Output<String> ipcMode) {
            $.ipcMode = ipcMode;
            return this;
        }

        public Builder ipcMode(String ipcMode) {
            return ipcMode(Output.of(ipcMode));
        }

        public Builder memory(@Nullable Output<String> memory) {
            $.memory = memory;
            return this;
        }

        public Builder memory(String memory) {
            return memory(Output.of(memory));
        }

        public Builder networkMode(@Nullable Output<String> networkMode) {
            $.networkMode = networkMode;
            return this;
        }

        public Builder networkMode(String networkMode) {
            return networkMode(Output.of(networkMode));
        }

        public Builder pidMode(@Nullable Output<String> pidMode) {
            $.pidMode = pidMode;
            return this;
        }

        public Builder pidMode(String pidMode) {
            return pidMode(Output.of(pidMode));
        }

        public Builder placementConstraints(@Nullable Output<List<TaskDefinitionPlacementConstraintArgs>> placementConstraints) {
            $.placementConstraints = placementConstraints;
            return this;
        }

        public Builder placementConstraints(List<TaskDefinitionPlacementConstraintArgs> placementConstraints) {
            return placementConstraints(Output.of(placementConstraints));
        }

        public Builder placementConstraints(TaskDefinitionPlacementConstraintArgs... placementConstraints) {
            return placementConstraints(List.of(placementConstraints));
        }

        public Builder proxyConfiguration(@Nullable Output<TaskDefinitionProxyConfigurationArgs> proxyConfiguration) {
            $.proxyConfiguration = proxyConfiguration;
            return this;
        }

        public Builder proxyConfiguration(TaskDefinitionProxyConfigurationArgs proxyConfiguration) {
            return proxyConfiguration(Output.of(proxyConfiguration));
        }

        public Builder requiresCompatibilities(@Nullable Output<List<String>> requiresCompatibilities) {
            $.requiresCompatibilities = requiresCompatibilities;
            return this;
        }

        public Builder requiresCompatibilities(List<String> requiresCompatibilities) {
            return requiresCompatibilities(Output.of(requiresCompatibilities));
        }

        public Builder requiresCompatibilities(String... requiresCompatibilities) {
            return requiresCompatibilities(List.of(requiresCompatibilities));
        }

        public Builder runtimePlatform(@Nullable Output<TaskDefinitionRuntimePlatformArgs> runtimePlatform) {
            $.runtimePlatform = runtimePlatform;
            return this;
        }

        public Builder runtimePlatform(TaskDefinitionRuntimePlatformArgs runtimePlatform) {
            return runtimePlatform(Output.of(runtimePlatform));
        }

        public Builder skipDestroy(@Nullable Output<Boolean> skipDestroy) {
            $.skipDestroy = skipDestroy;
            return this;
        }

        public Builder skipDestroy(Boolean skipDestroy) {
            return skipDestroy(Output.of(skipDestroy));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder taskRoleArn(@Nullable Output<String> taskRoleArn) {
            $.taskRoleArn = taskRoleArn;
            return this;
        }

        public Builder taskRoleArn(String taskRoleArn) {
            return taskRoleArn(Output.of(taskRoleArn));
        }

        public Builder volumes(@Nullable Output<List<TaskDefinitionVolumeArgs>> volumes) {
            $.volumes = volumes;
            return this;
        }

        public Builder volumes(List<TaskDefinitionVolumeArgs> volumes) {
            return volumes(Output.of(volumes));
        }

        public Builder volumes(TaskDefinitionVolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }

        public TaskDefinitionArgs build() {
            $.containerDefinitions = Objects.requireNonNull($.containerDefinitions, "expected parameter 'containerDefinitions' to be non-null");
            $.family = Objects.requireNonNull($.family, "expected parameter 'family' to be non-null");
            return $;
        }
    }

}
