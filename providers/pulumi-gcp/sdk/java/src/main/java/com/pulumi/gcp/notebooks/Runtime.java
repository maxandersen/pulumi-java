// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.notebooks.RuntimeArgs;
import com.pulumi.gcp.notebooks.inputs.RuntimeState;
import com.pulumi.gcp.notebooks.outputs.RuntimeAccessConfig;
import com.pulumi.gcp.notebooks.outputs.RuntimeMetric;
import com.pulumi.gcp.notebooks.outputs.RuntimeSoftwareConfig;
import com.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachine;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Cloud AI Platform Notebook runtime.
 * 
 * &gt; **Note:** Due to limitations of the Notebooks Runtime API, many fields
 * in this resource do not properly detect drift. These fields will also not
 * appear in state once imported.
 * 
 * To get more information about Runtime, see:
 * 
 * * [API documentation](https://cloud.google.com/ai-platform/notebooks/docs/reference/rest)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/ai-platform-notebooks)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Runtime can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/runtime:Runtime default projects/{{project}}/locations/{{location}}/runtimes/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/runtime:Runtime default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/runtime:Runtime default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:notebooks/runtime:Runtime")
public class Runtime extends com.pulumi.resources.CustomResource {
    /**
     * The config settings for accessing runtime.
     * Structure is documented below.
     * 
     */
    @Export(name="accessConfig", type=RuntimeAccessConfig.class, parameters={})
    private Output</* @Nullable */ RuntimeAccessConfig> accessConfig;

    /**
     * @return The config settings for accessing runtime.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RuntimeAccessConfig> accessConfig() {
        return this.accessConfig;
    }
    /**
     * The health state of this runtime. For a list of possible output values, see
     * &#39;https://cloud.google.com/vertex-ai/docs/workbench/ reference/rest/v1/projects.locations.runtimes#healthstate&#39;.
     * 
     */
    @Export(name="healthState", type=String.class, parameters={})
    private Output<String> healthState;

    /**
     * @return The health state of this runtime. For a list of possible output values, see
     * &#39;https://cloud.google.com/vertex-ai/docs/workbench/ reference/rest/v1/projects.locations.runtimes#healthstate&#39;.
     * 
     */
    public Output<String> healthState() {
        return this.healthState;
    }
    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return A reference to the zone where the machine resides.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Contains Runtime daemon metrics such as Service status and JupyterLab status
     * 
     */
    @Export(name="metrics", type=List.class, parameters={RuntimeMetric.class})
    private Output<List<RuntimeMetric>> metrics;

    /**
     * @return Contains Runtime daemon metrics such as Service status and JupyterLab status
     * 
     */
    public Output<List<RuntimeMetric>> metrics() {
        return this.metrics;
    }
    /**
     * The name specified for the Notebook instance.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name specified for the Notebook instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The config settings for software inside the runtime.
     * Structure is documented below.
     * 
     */
    @Export(name="softwareConfig", type=RuntimeSoftwareConfig.class, parameters={})
    private Output<RuntimeSoftwareConfig> softwareConfig;

    /**
     * @return The config settings for software inside the runtime.
     * Structure is documented below.
     * 
     */
    public Output<RuntimeSoftwareConfig> softwareConfig() {
        return this.softwareConfig;
    }
    /**
     * The state of this runtime.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of this runtime.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * Structure is documented below.
     * 
     */
    @Export(name="virtualMachine", type=RuntimeVirtualMachine.class, parameters={})
    private Output</* @Nullable */ RuntimeVirtualMachine> virtualMachine;

    /**
     * @return Use a Compute Engine VM image to start the managed notebook instance.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RuntimeVirtualMachine> virtualMachine() {
        return this.virtualMachine;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Runtime(String name) {
        this(name, RuntimeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Runtime(String name, RuntimeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Runtime(String name, RuntimeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/runtime:Runtime", name, args == null ? RuntimeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Runtime(String name, Output<String> id, @Nullable RuntimeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/runtime:Runtime", name, state, makeResourceOptions(options, id));
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
    public static Runtime get(String name, Output<String> id, @Nullable RuntimeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Runtime(name, id, state, options);
    }
}
