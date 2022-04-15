// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1.CutoverJobArgs;
import io.pulumi.googlenative.vmmigration_v1.outputs.ComputeEngineTargetDetailsResponse;
import io.pulumi.googlenative.vmmigration_v1.outputs.StatusResponse;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Initiates a Cutover of a specific migrating VM. The returned LRO is completed when the cutover job resource is created and the job is initiated.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1:CutoverJob")
public class CutoverJob extends io.pulumi.resources.CustomResource {
    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    @Export(name="computeEngineTargetDetails", type=ComputeEngineTargetDetailsResponse.class, parameters={})
    private Output<ComputeEngineTargetDetailsResponse> computeEngineTargetDetails;

    /**
     * @return Details of the target VM in Compute Engine.
     * 
     */
    public Output<ComputeEngineTargetDetailsResponse> computeEngineTargetDetails() {
        return this.computeEngineTargetDetails;
    }
    /**
     * The time the cutover job was created (as an API call, not when it was actually created in the target).
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the cutover job was created (as an API call, not when it was actually created in the target).
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Provides details for the errors that led to the Cutover Job's state.
     * 
     */
    @Export(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return Provides details for the errors that led to the Cutover Job's state.
     * 
     */
    public Output<StatusResponse> error() {
        return this.error;
    }
    /**
     * The name of the cutover job.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the cutover job.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The current progress in percentage of the cutover job.
     * 
     */
    @Export(name="progressPercent", type=Integer.class, parameters={})
    private Output<Integer> progressPercent;

    /**
     * @return The current progress in percentage of the cutover job.
     * 
     */
    public Output<Integer> progressPercent() {
        return this.progressPercent;
    }
    /**
     * State of the cutover job.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the cutover job.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A message providing possible extra details about the current state.
     * 
     */
    @Export(name="stateMessage", type=String.class, parameters={})
    private Output<String> stateMessage;

    /**
     * @return A message providing possible extra details about the current state.
     * 
     */
    public Output<String> stateMessage() {
        return this.stateMessage;
    }
    /**
     * The time the state was last updated.
     * 
     */
    @Export(name="stateTime", type=String.class, parameters={})
    private Output<String> stateTime;

    /**
     * @return The time the state was last updated.
     * 
     */
    public Output<String> stateTime() {
        return this.stateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CutoverJob(String name) {
        this(name, CutoverJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CutoverJob(String name, CutoverJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CutoverJob(String name, CutoverJobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:CutoverJob", name, args == null ? CutoverJobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CutoverJob(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:CutoverJob", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CutoverJob get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CutoverJob(name, id, options);
    }
}
