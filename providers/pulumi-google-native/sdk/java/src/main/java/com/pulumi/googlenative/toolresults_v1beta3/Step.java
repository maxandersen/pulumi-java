// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.toolresults_v1beta3.StepArgs;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.DurationResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.MultiStepResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.OutcomeResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.StepDimensionValueEntryResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.StepLabelsEntryResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.TestExecutionStepResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.TimestampResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.ToolExecutionStepResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a Step. The returned Step will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the step is too large (more than 10Mib) - NOT_FOUND - if the containing Execution does not exist
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:toolresults/v1beta3:Step")
public class Step extends com.pulumi.resources.CustomResource {
    /**
     * The time when the step status was set to complete. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
     */
    @Export(name="completionTime", type=TimestampResponse.class, parameters={})
    private Output<TimestampResponse> completionTime;

    /**
     * @return The time when the step status was set to complete. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
     */
    public Output<TimestampResponse> completionTime() {
        return this.completionTime;
    }
    /**
     * The time when the step was created. - In response: always set - In create/update request: never set
     * 
     */
    @Export(name="creationTime", type=TimestampResponse.class, parameters={})
    private Output<TimestampResponse> creationTime;

    /**
     * @return The time when the step was created. - In response: always set - In create/update request: never set
     * 
     */
    public Output<TimestampResponse> creationTime() {
        return this.creationTime;
    }
    /**
     * A description of this tool For example: mvn clean package -D skipTests=true - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description of this tool For example: mvn clean package -D skipTests=true - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * How much the device resource is used to perform the test. This is the device usage used for billing purpose, which is different from the run_duration, for example, infrastructure failure won&#39;t be charged for device usage. PRECONDITION_FAILED will be returned if one attempts to set a device_usage on a step which already has this field set. - In response: present if previously set. - In create request: optional - In update request: optional
     * 
     */
    @Export(name="deviceUsageDuration", type=DurationResponse.class, parameters={})
    private Output<DurationResponse> deviceUsageDuration;

    /**
     * @return How much the device resource is used to perform the test. This is the device usage used for billing purpose, which is different from the run_duration, for example, infrastructure failure won&#39;t be charged for device usage. PRECONDITION_FAILED will be returned if one attempts to set a device_usage on a step which already has this field set. - In response: present if previously set. - In create request: optional - In update request: optional
     * 
     */
    public Output<DurationResponse> deviceUsageDuration() {
        return this.deviceUsageDuration;
    }
    /**
     * If the execution containing this step has any dimension_definition set, then this field allows the child to specify the values of the dimensions. The keys must exactly match the dimension_definition of the execution. For example, if the execution has `dimension_definition = [&#39;attempt&#39;, &#39;device&#39;]` then a step must define values for those dimensions, eg. `dimension_value = [&#39;attempt&#39;: &#39;1&#39;, &#39;device&#39;: &#39;Nexus 6&#39;]` If a step does not participate in one dimension of the matrix, the value for that dimension should be empty string. For example, if one of the tests is executed by a runner which does not support retries, the step could have `dimension_value = [&#39;attempt&#39;: &#39;&#39;, &#39;device&#39;: &#39;Nexus 6&#39;]` If the step does not participate in any dimensions of the matrix, it may leave dimension_value unset. A PRECONDITION_FAILED will be returned if any of the keys do not exist in the dimension_definition of the execution. A PRECONDITION_FAILED will be returned if another step in this execution already has the same name and dimension_value, but differs on other data fields, for example, step field is different. A PRECONDITION_FAILED will be returned if dimension_value is set, and there is a dimension_definition in the execution which is not specified as one of the keys. - In response: present if set by create - In create request: optional - In update request: never set
     * 
     */
    @Export(name="dimensionValue", type=List.class, parameters={StepDimensionValueEntryResponse.class})
    private Output<List<StepDimensionValueEntryResponse>> dimensionValue;

    /**
     * @return If the execution containing this step has any dimension_definition set, then this field allows the child to specify the values of the dimensions. The keys must exactly match the dimension_definition of the execution. For example, if the execution has `dimension_definition = [&#39;attempt&#39;, &#39;device&#39;]` then a step must define values for those dimensions, eg. `dimension_value = [&#39;attempt&#39;: &#39;1&#39;, &#39;device&#39;: &#39;Nexus 6&#39;]` If a step does not participate in one dimension of the matrix, the value for that dimension should be empty string. For example, if one of the tests is executed by a runner which does not support retries, the step could have `dimension_value = [&#39;attempt&#39;: &#39;&#39;, &#39;device&#39;: &#39;Nexus 6&#39;]` If the step does not participate in any dimensions of the matrix, it may leave dimension_value unset. A PRECONDITION_FAILED will be returned if any of the keys do not exist in the dimension_definition of the execution. A PRECONDITION_FAILED will be returned if another step in this execution already has the same name and dimension_value, but differs on other data fields, for example, step field is different. A PRECONDITION_FAILED will be returned if dimension_value is set, and there is a dimension_definition in the execution which is not specified as one of the keys. - In response: present if set by create - In create request: optional - In update request: never set
     * 
     */
    public Output<List<StepDimensionValueEntryResponse>> dimensionValue() {
        return this.dimensionValue;
    }
    /**
     * Whether any of the outputs of this step are images whose thumbnails can be fetched with ListThumbnails. - In response: always set - In create/update request: never set
     * 
     */
    @Export(name="hasImages", type=Boolean.class, parameters={})
    private Output<Boolean> hasImages;

    /**
     * @return Whether any of the outputs of this step are images whose thumbnails can be fetched with ListThumbnails. - In response: always set - In create/update request: never set
     * 
     */
    public Output<Boolean> hasImages() {
        return this.hasImages;
    }
    /**
     * Arbitrary user-supplied key/value pairs that are associated with the step. Users are responsible for managing the key namespace such that keys don&#39;t accidentally collide. An INVALID_ARGUMENT will be returned if the number of labels exceeds 100 or if the length of any of the keys or values exceeds 100 characters. - In response: always set - In create request: optional - In update request: optional; any new key/value pair will be added to the map, and any new value for an existing key will update that key&#39;s value
     * 
     */
    @Export(name="labels", type=List.class, parameters={StepLabelsEntryResponse.class})
    private Output<List<StepLabelsEntryResponse>> labels;

    /**
     * @return Arbitrary user-supplied key/value pairs that are associated with the step. Users are responsible for managing the key namespace such that keys don&#39;t accidentally collide. An INVALID_ARGUMENT will be returned if the number of labels exceeds 100 or if the length of any of the keys or values exceeds 100 characters. - In response: always set - In create request: optional - In update request: optional; any new key/value pair will be added to the map, and any new value for an existing key will update that key&#39;s value
     * 
     */
    public Output<List<StepLabelsEntryResponse>> labels() {
        return this.labels;
    }
    /**
     * Details when multiple steps are run with the same configuration as a group. These details can be used identify which group this step is part of. It also identifies the groups &#39;primary step&#39; which indexes all the group members. - In response: present if previously set. - In create request: optional, set iff this step was performed more than once. - In update request: optional
     * 
     */
    @Export(name="multiStep", type=MultiStepResponse.class, parameters={})
    private Output<MultiStepResponse> multiStep;

    /**
     * @return Details when multiple steps are run with the same configuration as a group. These details can be used identify which group this step is part of. It also identifies the groups &#39;primary step&#39; which indexes all the group members. - In response: present if previously set. - In create request: optional, set iff this step was performed more than once. - In update request: optional
     * 
     */
    public Output<MultiStepResponse> multiStep() {
        return this.multiStep;
    }
    /**
     * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Clean build A PRECONDITION_FAILED will be returned upon creating a new step if it shares its name and dimension_value with an existing step. If two steps represent a similar action, but have different dimension values, they should share the same name. For instance, if the same set of tests is run on two different platforms, the two steps should have the same name. - In response: always set - In create request: always set - In update request: never set
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A short human-readable name to display in the UI. Maximum of 100 characters. For example: Clean build A PRECONDITION_FAILED will be returned upon creating a new step if it shares its name and dimension_value with an existing step. If two steps represent a similar action, but have different dimension values, they should share the same name. For instance, if the same set of tests is run on two different platforms, the two steps should have the same name. - In response: always set - In create request: always set - In update request: never set
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Classification of the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @Export(name="outcome", type=OutcomeResponse.class, parameters={})
    private Output<OutcomeResponse> outcome;

    /**
     * @return Classification of the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    public Output<OutcomeResponse> outcome() {
        return this.outcome;
    }
    /**
     * How long it took for this step to run. If unset, this is set to the difference between creation_time and completion_time when the step is set to the COMPLETE state. In some cases, it is appropriate to set this value separately: For instance, if a step is created, but the operation it represents is queued for a few minutes before it executes, it would be appropriate not to include the time spent queued in its run_duration. PRECONDITION_FAILED will be returned if one attempts to set a run_duration on a step which already has this field set. - In response: present if previously set; always present on COMPLETE step - In create request: optional - In update request: optional
     * 
     */
    @Export(name="runDuration", type=DurationResponse.class, parameters={})
    private Output<DurationResponse> runDuration;

    /**
     * @return How long it took for this step to run. If unset, this is set to the difference between creation_time and completion_time when the step is set to the COMPLETE state. In some cases, it is appropriate to set this value separately: For instance, if a step is created, but the operation it represents is queued for a few minutes before it executes, it would be appropriate not to include the time spent queued in its run_duration. PRECONDITION_FAILED will be returned if one attempts to set a run_duration on a step which already has this field set. - In response: present if previously set; always present on COMPLETE step - In create request: optional - In update request: optional
     * 
     */
    public Output<DurationResponse> runDuration() {
        return this.runDuration;
    }
    /**
     * The initial state is IN_PROGRESS. The only legal state transitions are * IN_PROGRESS -&gt; COMPLETE A PRECONDITION_FAILED will be returned if an invalid transition is requested. It is valid to create Step with a state set to COMPLETE. The state can only be set to COMPLETE once. A PRECONDITION_FAILED will be returned if the state is set to COMPLETE multiple times. - In response: always set - In create/update request: optional
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The initial state is IN_PROGRESS. The only legal state transitions are * IN_PROGRESS -&gt; COMPLETE A PRECONDITION_FAILED will be returned if an invalid transition is requested. It is valid to create Step with a state set to COMPLETE. The state can only be set to COMPLETE once. A PRECONDITION_FAILED will be returned if the state is set to COMPLETE multiple times. - In response: always set - In create/update request: optional
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A unique identifier within a Execution for this Step. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response: always set - In create/update request: never set
     * 
     */
    @Export(name="stepId", type=String.class, parameters={})
    private Output<String> stepId;

    /**
     * @return A unique identifier within a Execution for this Step. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response: always set - In create/update request: never set
     * 
     */
    public Output<String> stepId() {
        return this.stepId;
    }
    /**
     * An execution of a test runner.
     * 
     */
    @Export(name="testExecutionStep", type=TestExecutionStepResponse.class, parameters={})
    private Output<TestExecutionStepResponse> testExecutionStep;

    /**
     * @return An execution of a test runner.
     * 
     */
    public Output<TestExecutionStepResponse> testExecutionStep() {
        return this.testExecutionStep;
    }
    /**
     * An execution of a tool (used for steps we don&#39;t explicitly support).
     * 
     */
    @Export(name="toolExecutionStep", type=ToolExecutionStepResponse.class, parameters={})
    private Output<ToolExecutionStepResponse> toolExecutionStep;

    /**
     * @return An execution of a tool (used for steps we don&#39;t explicitly support).
     * 
     */
    public Output<ToolExecutionStepResponse> toolExecutionStep() {
        return this.toolExecutionStep;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Step(String name) {
        this(name, StepArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Step(String name, StepArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Step(String name, StepArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:toolresults/v1beta3:Step", name, args == null ? StepArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Step(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:toolresults/v1beta3:Step", name, null, makeResourceOptions(options, id));
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
    public static Step get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Step(name, id, options);
    }
}
