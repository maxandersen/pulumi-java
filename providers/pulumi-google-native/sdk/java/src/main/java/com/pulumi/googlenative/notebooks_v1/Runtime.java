// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.notebooks_v1.RuntimeArgs;
import com.pulumi.googlenative.notebooks_v1.outputs.RuntimeAccessConfigResponse;
import com.pulumi.googlenative.notebooks_v1.outputs.RuntimeMetricsResponse;
import com.pulumi.googlenative.notebooks_v1.outputs.RuntimeSoftwareConfigResponse;
import com.pulumi.googlenative.notebooks_v1.outputs.VirtualMachineResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new Runtime in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:notebooks/v1:Runtime")
public class Runtime extends com.pulumi.resources.CustomResource {
    /**
     * The config settings for accessing runtime.
     * 
     */
    @Export(name="accessConfig", type=RuntimeAccessConfigResponse.class, parameters={})
    private Output<RuntimeAccessConfigResponse> accessConfig;

    /**
     * @return The config settings for accessing runtime.
     * 
     */
    public Output<RuntimeAccessConfigResponse> accessConfig() {
        return this.accessConfig;
    }
    /**
     * Runtime creation time.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Runtime creation time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Runtime health_state.
     * 
     */
    @Export(name="healthState", type=String.class, parameters={})
    private Output<String> healthState;

    /**
     * @return Runtime health_state.
     * 
     */
    public Output<String> healthState() {
        return this.healthState;
    }
    /**
     * Contains Runtime daemon metrics such as Service status and JupyterLab stats.
     * 
     */
    @Export(name="metrics", type=RuntimeMetricsResponse.class, parameters={})
    private Output<RuntimeMetricsResponse> metrics;

    /**
     * @return Contains Runtime daemon metrics such as Service status and JupyterLab stats.
     * 
     */
    public Output<RuntimeMetricsResponse> metrics() {
        return this.metrics;
    }
    /**
     * The resource name of the runtime. Format: `projects/{project}/locations/{location}/runtimes/{runtimeId}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the runtime. Format: `projects/{project}/locations/{location}/runtimes/{runtimeId}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The config settings for software inside the runtime.
     * 
     */
    @Export(name="softwareConfig", type=RuntimeSoftwareConfigResponse.class, parameters={})
    private Output<RuntimeSoftwareConfigResponse> softwareConfig;

    /**
     * @return The config settings for software inside the runtime.
     * 
     */
    public Output<RuntimeSoftwareConfigResponse> softwareConfig() {
        return this.softwareConfig;
    }
    /**
     * Runtime state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Runtime state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Runtime update time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Runtime update time.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * 
     */
    @Export(name="virtualMachine", type=VirtualMachineResponse.class, parameters={})
    private Output<VirtualMachineResponse> virtualMachine;

    /**
     * @return Use a Compute Engine VM image to start the managed notebook instance.
     * 
     */
    public Output<VirtualMachineResponse> virtualMachine() {
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
        super("google-native:notebooks/v1:Runtime", name, args == null ? RuntimeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Runtime(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:notebooks/v1:Runtime", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Runtime get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Runtime(name, id, options);
    }
}
