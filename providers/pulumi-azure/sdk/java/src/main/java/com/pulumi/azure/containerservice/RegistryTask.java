// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.containerservice.RegistryTaskArgs;
import com.pulumi.azure.containerservice.inputs.RegistryTaskState;
import com.pulumi.azure.containerservice.outputs.RegistryTaskAgentSetting;
import com.pulumi.azure.containerservice.outputs.RegistryTaskBaseImageTrigger;
import com.pulumi.azure.containerservice.outputs.RegistryTaskDockerStep;
import com.pulumi.azure.containerservice.outputs.RegistryTaskEncodedStep;
import com.pulumi.azure.containerservice.outputs.RegistryTaskFileStep;
import com.pulumi.azure.containerservice.outputs.RegistryTaskIdentity;
import com.pulumi.azure.containerservice.outputs.RegistryTaskPlatform;
import com.pulumi.azure.containerservice.outputs.RegistryTaskRegistryCredential;
import com.pulumi.azure.containerservice.outputs.RegistryTaskSourceTrigger;
import com.pulumi.azure.containerservice.outputs.RegistryTaskTimerTrigger;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Container Registry Task.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleRegistry = new Registry(&#34;exampleRegistry&#34;, RegistryArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .sku(&#34;Basic&#34;)
 *             .build());
 * 
 *         var exampleRegistryTask = new RegistryTask(&#34;exampleRegistryTask&#34;, RegistryTaskArgs.builder()        
 *             .containerRegistryId(exampleRegistry.getId())
 *             .platform(RegistryTaskPlatform.builder()
 *                 .os(&#34;Linux&#34;)
 *                 .build())
 *             .dockerStep(RegistryTaskDockerStep.builder()
 *                 .dockerfilePath(&#34;Dockerfile&#34;)
 *                 .contextPath(&#34;https://github.com/&lt;user name&gt;/acr-build-helloworld-node#main&#34;)
 *                 .contextAccessToken(&#34;&lt;github personal access token&gt;&#34;)
 *                 .imageNames(&#34;helloworld:{{.Run.ID}}&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Container Registry Tasks can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:containerservice/registryTask:RegistryTask example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.ContainerRegistry/registries/registry1/tasks/task1
 * ```
 * 
 */
@ResourceType(type="azure:containerservice/registryTask:RegistryTask")
public class RegistryTask extends com.pulumi.resources.CustomResource {
    /**
     * The name of the dedicated Container Registry Agent Pool for this Container Registry Task.
     * 
     */
    @Export(name="agentPoolName", type=String.class, parameters={})
    private Output</* @Nullable */ String> agentPoolName;

    /**
     * @return The name of the dedicated Container Registry Agent Pool for this Container Registry Task.
     * 
     */
    public Output<Optional<String>> agentPoolName() {
        return Codegen.optional(this.agentPoolName);
    }
    /**
     * A `agent_setting` block as defined below.
     * 
     */
    @Export(name="agentSetting", type=RegistryTaskAgentSetting.class, parameters={})
    private Output</* @Nullable */ RegistryTaskAgentSetting> agentSetting;

    /**
     * @return A `agent_setting` block as defined below.
     * 
     */
    public Output<Optional<RegistryTaskAgentSetting>> agentSetting() {
        return Codegen.optional(this.agentSetting);
    }
    /**
     * A `base_image_trigger` block as defined below.
     * 
     */
    @Export(name="baseImageTrigger", type=RegistryTaskBaseImageTrigger.class, parameters={})
    private Output</* @Nullable */ RegistryTaskBaseImageTrigger> baseImageTrigger;

    /**
     * @return A `base_image_trigger` block as defined below.
     * 
     */
    public Output<Optional<RegistryTaskBaseImageTrigger>> baseImageTrigger() {
        return Codegen.optional(this.baseImageTrigger);
    }
    /**
     * The ID of the Container Registry that this Container Registry Task resides in. Changing this forces a new Container Registry Task to be created.
     * 
     */
    @Export(name="containerRegistryId", type=String.class, parameters={})
    private Output<String> containerRegistryId;

    /**
     * @return The ID of the Container Registry that this Container Registry Task resides in. Changing this forces a new Container Registry Task to be created.
     * 
     */
    public Output<String> containerRegistryId() {
        return this.containerRegistryId;
    }
    /**
     * A `docker_step` block as defined below.
     * 
     */
    @Export(name="dockerStep", type=RegistryTaskDockerStep.class, parameters={})
    private Output</* @Nullable */ RegistryTaskDockerStep> dockerStep;

    /**
     * @return A `docker_step` block as defined below.
     * 
     */
    public Output<Optional<RegistryTaskDockerStep>> dockerStep() {
        return Codegen.optional(this.dockerStep);
    }
    /**
     * Should this Container Registry Task be enabled? Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Should this Container Registry Task be enabled? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * A `encoded_step` block as defined below.
     * 
     */
    @Export(name="encodedStep", type=RegistryTaskEncodedStep.class, parameters={})
    private Output</* @Nullable */ RegistryTaskEncodedStep> encodedStep;

    /**
     * @return A `encoded_step` block as defined below.
     * 
     */
    public Output<Optional<RegistryTaskEncodedStep>> encodedStep() {
        return Codegen.optional(this.encodedStep);
    }
    /**
     * A `file_step` block as defined below.
     * 
     */
    @Export(name="fileStep", type=RegistryTaskFileStep.class, parameters={})
    private Output</* @Nullable */ RegistryTaskFileStep> fileStep;

    /**
     * @return A `file_step` block as defined below.
     * 
     */
    public Output<Optional<RegistryTaskFileStep>> fileStep() {
        return Codegen.optional(this.fileStep);
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=RegistryTaskIdentity.class, parameters={})
    private Output</* @Nullable */ RegistryTaskIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<RegistryTaskIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Whether this Container Registry Task is a system task. Changing this forces a new Container Registry Task to be created. Defaults to `false`.
     * 
     */
    @Export(name="isSystemTask", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isSystemTask;

    /**
     * @return Whether this Container Registry Task is a system task. Changing this forces a new Container Registry Task to be created. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> isSystemTask() {
        return Codegen.optional(this.isSystemTask);
    }
    /**
     * The template that describes the run log artifact.
     * 
     */
    @Export(name="logTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> logTemplate;

    /**
     * @return The template that describes the run log artifact.
     * 
     */
    public Output<Optional<String>> logTemplate() {
        return Codegen.optional(this.logTemplate);
    }
    /**
     * The name which should be used for this Container Registry Task. Changing this forces a new Container Registry Task to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Container Registry Task. Changing this forces a new Container Registry Task to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `platform` block as defined below.
     * 
     */
    @Export(name="platform", type=RegistryTaskPlatform.class, parameters={})
    private Output</* @Nullable */ RegistryTaskPlatform> platform;

    /**
     * @return A `platform` block as defined below.
     * 
     */
    public Output<Optional<RegistryTaskPlatform>> platform() {
        return Codegen.optional(this.platform);
    }
    /**
     * One `registry_credential` block as defined below.
     * 
     */
    @Export(name="registryCredential", type=RegistryTaskRegistryCredential.class, parameters={})
    private Output</* @Nullable */ RegistryTaskRegistryCredential> registryCredential;

    /**
     * @return One `registry_credential` block as defined below.
     * 
     */
    public Output<Optional<RegistryTaskRegistryCredential>> registryCredential() {
        return Codegen.optional(this.registryCredential);
    }
    /**
     * One or more `source_trigger` blocks as defined below.
     * 
     */
    @Export(name="sourceTriggers", type=List.class, parameters={RegistryTaskSourceTrigger.class})
    private Output</* @Nullable */ List<RegistryTaskSourceTrigger>> sourceTriggers;

    /**
     * @return One or more `source_trigger` blocks as defined below.
     * 
     */
    public Output<Optional<List<RegistryTaskSourceTrigger>>> sourceTriggers() {
        return Codegen.optional(this.sourceTriggers);
    }
    /**
     * A mapping of tags which should be assigned to the Container Registry Task.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Container Registry Task.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The timeout of this Container Registry Task in seconds. The valid range lies from 300 to 28800. Defaults to 3600.
     * 
     */
    @Export(name="timeoutInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeoutInSeconds;

    /**
     * @return The timeout of this Container Registry Task in seconds. The valid range lies from 300 to 28800. Defaults to 3600.
     * 
     */
    public Output<Optional<Integer>> timeoutInSeconds() {
        return Codegen.optional(this.timeoutInSeconds);
    }
    /**
     * One or more `timer_trigger` blocks as defined below.
     * 
     */
    @Export(name="timerTriggers", type=List.class, parameters={RegistryTaskTimerTrigger.class})
    private Output</* @Nullable */ List<RegistryTaskTimerTrigger>> timerTriggers;

    /**
     * @return One or more `timer_trigger` blocks as defined below.
     * 
     */
    public Output<Optional<List<RegistryTaskTimerTrigger>>> timerTriggers() {
        return Codegen.optional(this.timerTriggers);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryTask(String name) {
        this(name, RegistryTaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryTask(String name, RegistryTaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryTask(String name, RegistryTaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/registryTask:RegistryTask", name, args == null ? RegistryTaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegistryTask(String name, Output<String> id, @Nullable RegistryTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/registryTask:RegistryTask", name, state, makeResourceOptions(options, id));
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
    public static RegistryTask get(String name, Output<String> id, @Nullable RegistryTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegistryTask(name, id, state, options);
    }
}
