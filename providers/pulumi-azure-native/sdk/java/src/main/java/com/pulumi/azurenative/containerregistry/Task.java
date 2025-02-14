// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.containerregistry.TaskArgs;
import com.pulumi.azurenative.containerregistry.outputs.AgentPropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.CredentialsResponse;
import com.pulumi.azurenative.containerregistry.outputs.DockerBuildStepResponse;
import com.pulumi.azurenative.containerregistry.outputs.EncodedTaskStepResponse;
import com.pulumi.azurenative.containerregistry.outputs.FileTaskStepResponse;
import com.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.PlatformPropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import com.pulumi.azurenative.containerregistry.outputs.TriggerPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The task that has the ARM resource and task properties.
 * The task will have all information to schedule a run against it.
 * API Version: 2019-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerregistry:Task myTask /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/tasks/myTask 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerregistry:Task")
public class Task extends com.pulumi.resources.CustomResource {
    /**
     * The machine configuration of the run agent.
     * 
     */
    @Export(name="agentConfiguration", type=AgentPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ AgentPropertiesResponse> agentConfiguration;

    /**
     * @return The machine configuration of the run agent.
     * 
     */
    public Output<Optional<AgentPropertiesResponse>> agentConfiguration() {
        return Codegen.optional(this.agentConfiguration);
    }
    /**
     * The dedicated agent pool for the task.
     * 
     */
    @Export(name="agentPoolName", type=String.class, parameters={})
    private Output</* @Nullable */ String> agentPoolName;

    /**
     * @return The dedicated agent pool for the task.
     * 
     */
    public Output<Optional<String>> agentPoolName() {
        return Codegen.optional(this.agentPoolName);
    }
    /**
     * The creation date of task.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The creation date of task.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    @Export(name="credentials", type=CredentialsResponse.class, parameters={})
    private Output</* @Nullable */ CredentialsResponse> credentials;

    /**
     * @return The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    public Output<Optional<CredentialsResponse>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * Identity for the resource.
     * 
     */
    @Export(name="identity", type=IdentityPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ IdentityPropertiesResponse> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Output<Optional<IdentityPropertiesResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The value of this property indicates whether the task resource is system task or not.
     * 
     */
    @Export(name="isSystemTask", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isSystemTask;

    /**
     * @return The value of this property indicates whether the task resource is system task or not.
     * 
     */
    public Output<Optional<Boolean>> isSystemTask() {
        return Codegen.optional(this.isSystemTask);
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    @Export(name="logTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> logTemplate;

    /**
     * @return The template that describes the repository and tag information for run log artifact.
     * 
     */
    public Output<Optional<String>> logTemplate() {
        return Codegen.optional(this.logTemplate);
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The platform properties against which the run has to happen.
     * 
     */
    @Export(name="platform", type=PlatformPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ PlatformPropertiesResponse> platform;

    /**
     * @return The platform properties against which the run has to happen.
     * 
     */
    public Output<Optional<PlatformPropertiesResponse>> platform() {
        return Codegen.optional(this.platform);
    }
    /**
     * The provisioning state of the task.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the task.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The current status of task.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The current status of task.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * The properties of a task step.
     * 
     */
    @Export(name="step", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> step;

    /**
     * @return The properties of a task step.
     * 
     */
    public Output<Optional<Object>> step() {
        return Codegen.optional(this.step);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Run timeout in seconds.
     * 
     */
    @Export(name="timeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeout;

    /**
     * @return Run timeout in seconds.
     * 
     */
    public Output<Optional<Integer>> timeout() {
        return Codegen.optional(this.timeout);
    }
    /**
     * The properties that describe all triggers for the task.
     * 
     */
    @Export(name="trigger", type=TriggerPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ TriggerPropertiesResponse> trigger;

    /**
     * @return The properties that describe all triggers for the task.
     * 
     */
    public Output<Optional<TriggerPropertiesResponse>> trigger() {
        return Codegen.optional(this.trigger);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Task(String name) {
        this(name, TaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Task(String name, TaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Task(String name, TaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:Task", name, args == null ? TaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Task(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:Task", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:containerregistry/v20180201preview:Task").build()),
                Output.of(Alias.builder().type("azure-native:containerregistry/v20180901:Task").build()),
                Output.of(Alias.builder().type("azure-native:containerregistry/v20190401:Task").build()),
                Output.of(Alias.builder().type("azure-native:containerregistry/v20190601preview:Task").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Task get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Task(name, id, options);
    }
}
