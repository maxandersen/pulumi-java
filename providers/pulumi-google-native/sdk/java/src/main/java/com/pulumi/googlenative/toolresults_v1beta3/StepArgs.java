// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.toolresults_v1beta3.enums.StepState;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.DurationArgs;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.MultiStepArgs;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.OutcomeArgs;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.StepDimensionValueEntryArgs;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.StepLabelsEntryArgs;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.TestExecutionStepArgs;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.TimestampArgs;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.ToolExecutionStepArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StepArgs extends com.pulumi.resources.ResourceArgs {

    public static final StepArgs Empty = new StepArgs();

    /**
     * The time when the step status was set to complete. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
     */
    @Import(name="completionTime")
      private final @Nullable Output<TimestampArgs> completionTime;

    public Output<TimestampArgs> completionTime() {
        return this.completionTime == null ? Codegen.empty() : this.completionTime;
    }

    /**
     * The time when the step was created. - In response: always set - In create/update request: never set
     * 
     */
    @Import(name="creationTime")
      private final @Nullable Output<TimestampArgs> creationTime;

    public Output<TimestampArgs> creationTime() {
        return this.creationTime == null ? Codegen.empty() : this.creationTime;
    }

    /**
     * A description of this tool For example: mvn clean package -D skipTests=true - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * How much the device resource is used to perform the test. This is the device usage used for billing purpose, which is different from the run_duration, for example, infrastructure failure won&#39;t be charged for device usage. PRECONDITION_FAILED will be returned if one attempts to set a device_usage on a step which already has this field set. - In response: present if previously set. - In create request: optional - In update request: optional
     * 
     */
    @Import(name="deviceUsageDuration")
      private final @Nullable Output<DurationArgs> deviceUsageDuration;

    public Output<DurationArgs> deviceUsageDuration() {
        return this.deviceUsageDuration == null ? Codegen.empty() : this.deviceUsageDuration;
    }

    /**
     * If the execution containing this step has any dimension_definition set, then this field allows the child to specify the values of the dimensions. The keys must exactly match the dimension_definition of the execution. For example, if the execution has `dimension_definition = [&#39;attempt&#39;, &#39;device&#39;]` then a step must define values for those dimensions, eg. `dimension_value = [&#39;attempt&#39;: &#39;1&#39;, &#39;device&#39;: &#39;Nexus 6&#39;]` If a step does not participate in one dimension of the matrix, the value for that dimension should be empty string. For example, if one of the tests is executed by a runner which does not support retries, the step could have `dimension_value = [&#39;attempt&#39;: &#39;&#39;, &#39;device&#39;: &#39;Nexus 6&#39;]` If the step does not participate in any dimensions of the matrix, it may leave dimension_value unset. A PRECONDITION_FAILED will be returned if any of the keys do not exist in the dimension_definition of the execution. A PRECONDITION_FAILED will be returned if another step in this execution already has the same name and dimension_value, but differs on other data fields, for example, step field is different. A PRECONDITION_FAILED will be returned if dimension_value is set, and there is a dimension_definition in the execution which is not specified as one of the keys. - In response: present if set by create - In create request: optional - In update request: never set
     * 
     */
    @Import(name="dimensionValue")
      private final @Nullable Output<List<StepDimensionValueEntryArgs>> dimensionValue;

    public Output<List<StepDimensionValueEntryArgs>> dimensionValue() {
        return this.dimensionValue == null ? Codegen.empty() : this.dimensionValue;
    }

    @Import(name="executionId", required=true)
      private final Output<String> executionId;

    public Output<String> executionId() {
        return this.executionId;
    }

    /**
     * Whether any of the outputs of this step are images whose thumbnails can be fetched with ListThumbnails. - In response: always set - In create/update request: never set
     * 
     */
    @Import(name="hasImages")
      private final @Nullable Output<Boolean> hasImages;

    public Output<Boolean> hasImages() {
        return this.hasImages == null ? Codegen.empty() : this.hasImages;
    }

    @Import(name="historyId", required=true)
      private final Output<String> historyId;

    public Output<String> historyId() {
        return this.historyId;
    }

    /**
     * Arbitrary user-supplied key/value pairs that are associated with the step. Users are responsible for managing the key namespace such that keys don&#39;t accidentally collide. An INVALID_ARGUMENT will be returned if the number of labels exceeds 100 or if the length of any of the keys or values exceeds 100 characters. - In response: always set - In create request: optional - In update request: optional; any new key/value pair will be added to the map, and any new value for an existing key will update that key&#39;s value
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<StepLabelsEntryArgs>> labels;

    public Output<List<StepLabelsEntryArgs>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Details when multiple steps are run with the same configuration as a group. These details can be used identify which group this step is part of. It also identifies the groups &#39;primary step&#39; which indexes all the group members. - In response: present if previously set. - In create request: optional, set iff this step was performed more than once. - In update request: optional
     * 
     */
    @Import(name="multiStep")
      private final @Nullable Output<MultiStepArgs> multiStep;

    public Output<MultiStepArgs> multiStep() {
        return this.multiStep == null ? Codegen.empty() : this.multiStep;
    }

    /**
     * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Clean build A PRECONDITION_FAILED will be returned upon creating a new step if it shares its name and dimension_value with an existing step. If two steps represent a similar action, but have different dimension values, they should share the same name. For instance, if the same set of tests is run on two different platforms, the two steps should have the same name. - In response: always set - In create request: always set - In update request: never set
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Classification of the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @Import(name="outcome")
      private final @Nullable Output<OutcomeArgs> outcome;

    public Output<OutcomeArgs> outcome() {
        return this.outcome == null ? Codegen.empty() : this.outcome;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * How long it took for this step to run. If unset, this is set to the difference between creation_time and completion_time when the step is set to the COMPLETE state. In some cases, it is appropriate to set this value separately: For instance, if a step is created, but the operation it represents is queued for a few minutes before it executes, it would be appropriate not to include the time spent queued in its run_duration. PRECONDITION_FAILED will be returned if one attempts to set a run_duration on a step which already has this field set. - In response: present if previously set; always present on COMPLETE step - In create request: optional - In update request: optional
     * 
     */
    @Import(name="runDuration")
      private final @Nullable Output<DurationArgs> runDuration;

    public Output<DurationArgs> runDuration() {
        return this.runDuration == null ? Codegen.empty() : this.runDuration;
    }

    /**
     * The initial state is IN_PROGRESS. The only legal state transitions are * IN_PROGRESS -&gt; COMPLETE A PRECONDITION_FAILED will be returned if an invalid transition is requested. It is valid to create Step with a state set to COMPLETE. The state can only be set to COMPLETE once. A PRECONDITION_FAILED will be returned if the state is set to COMPLETE multiple times. - In response: always set - In create/update request: optional
     * 
     */
    @Import(name="state")
      private final @Nullable Output<StepState> state;

    public Output<StepState> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * A unique identifier within a Execution for this Step. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response: always set - In create/update request: never set
     * 
     */
    @Import(name="stepId")
      private final @Nullable Output<String> stepId;

    public Output<String> stepId() {
        return this.stepId == null ? Codegen.empty() : this.stepId;
    }

    /**
     * An execution of a test runner.
     * 
     */
    @Import(name="testExecutionStep")
      private final @Nullable Output<TestExecutionStepArgs> testExecutionStep;

    public Output<TestExecutionStepArgs> testExecutionStep() {
        return this.testExecutionStep == null ? Codegen.empty() : this.testExecutionStep;
    }

    /**
     * An execution of a tool (used for steps we don&#39;t explicitly support).
     * 
     */
    @Import(name="toolExecutionStep")
      private final @Nullable Output<ToolExecutionStepArgs> toolExecutionStep;

    public Output<ToolExecutionStepArgs> toolExecutionStep() {
        return this.toolExecutionStep == null ? Codegen.empty() : this.toolExecutionStep;
    }

    public StepArgs(
        @Nullable Output<TimestampArgs> completionTime,
        @Nullable Output<TimestampArgs> creationTime,
        @Nullable Output<String> description,
        @Nullable Output<DurationArgs> deviceUsageDuration,
        @Nullable Output<List<StepDimensionValueEntryArgs>> dimensionValue,
        Output<String> executionId,
        @Nullable Output<Boolean> hasImages,
        Output<String> historyId,
        @Nullable Output<List<StepLabelsEntryArgs>> labels,
        @Nullable Output<MultiStepArgs> multiStep,
        @Nullable Output<String> name,
        @Nullable Output<OutcomeArgs> outcome,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<DurationArgs> runDuration,
        @Nullable Output<StepState> state,
        @Nullable Output<String> stepId,
        @Nullable Output<TestExecutionStepArgs> testExecutionStep,
        @Nullable Output<ToolExecutionStepArgs> toolExecutionStep) {
        this.completionTime = completionTime;
        this.creationTime = creationTime;
        this.description = description;
        this.deviceUsageDuration = deviceUsageDuration;
        this.dimensionValue = dimensionValue;
        this.executionId = Objects.requireNonNull(executionId, "expected parameter 'executionId' to be non-null");
        this.hasImages = hasImages;
        this.historyId = Objects.requireNonNull(historyId, "expected parameter 'historyId' to be non-null");
        this.labels = labels;
        this.multiStep = multiStep;
        this.name = name;
        this.outcome = outcome;
        this.project = project;
        this.requestId = requestId;
        this.runDuration = runDuration;
        this.state = state;
        this.stepId = stepId;
        this.testExecutionStep = testExecutionStep;
        this.toolExecutionStep = toolExecutionStep;
    }

    private StepArgs() {
        this.completionTime = Codegen.empty();
        this.creationTime = Codegen.empty();
        this.description = Codegen.empty();
        this.deviceUsageDuration = Codegen.empty();
        this.dimensionValue = Codegen.empty();
        this.executionId = Codegen.empty();
        this.hasImages = Codegen.empty();
        this.historyId = Codegen.empty();
        this.labels = Codegen.empty();
        this.multiStep = Codegen.empty();
        this.name = Codegen.empty();
        this.outcome = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.runDuration = Codegen.empty();
        this.state = Codegen.empty();
        this.stepId = Codegen.empty();
        this.testExecutionStep = Codegen.empty();
        this.toolExecutionStep = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TimestampArgs> completionTime;
        private @Nullable Output<TimestampArgs> creationTime;
        private @Nullable Output<String> description;
        private @Nullable Output<DurationArgs> deviceUsageDuration;
        private @Nullable Output<List<StepDimensionValueEntryArgs>> dimensionValue;
        private Output<String> executionId;
        private @Nullable Output<Boolean> hasImages;
        private Output<String> historyId;
        private @Nullable Output<List<StepLabelsEntryArgs>> labels;
        private @Nullable Output<MultiStepArgs> multiStep;
        private @Nullable Output<String> name;
        private @Nullable Output<OutcomeArgs> outcome;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<DurationArgs> runDuration;
        private @Nullable Output<StepState> state;
        private @Nullable Output<String> stepId;
        private @Nullable Output<TestExecutionStepArgs> testExecutionStep;
        private @Nullable Output<ToolExecutionStepArgs> toolExecutionStep;

        public Builder() {
    	      // Empty
        }

        public Builder(StepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionTime = defaults.completionTime;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.deviceUsageDuration = defaults.deviceUsageDuration;
    	      this.dimensionValue = defaults.dimensionValue;
    	      this.executionId = defaults.executionId;
    	      this.hasImages = defaults.hasImages;
    	      this.historyId = defaults.historyId;
    	      this.labels = defaults.labels;
    	      this.multiStep = defaults.multiStep;
    	      this.name = defaults.name;
    	      this.outcome = defaults.outcome;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.runDuration = defaults.runDuration;
    	      this.state = defaults.state;
    	      this.stepId = defaults.stepId;
    	      this.testExecutionStep = defaults.testExecutionStep;
    	      this.toolExecutionStep = defaults.toolExecutionStep;
        }

        public Builder completionTime(@Nullable Output<TimestampArgs> completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public Builder completionTime(@Nullable TimestampArgs completionTime) {
            this.completionTime = Codegen.ofNullable(completionTime);
            return this;
        }
        public Builder creationTime(@Nullable Output<TimestampArgs> creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder creationTime(@Nullable TimestampArgs creationTime) {
            this.creationTime = Codegen.ofNullable(creationTime);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder deviceUsageDuration(@Nullable Output<DurationArgs> deviceUsageDuration) {
            this.deviceUsageDuration = deviceUsageDuration;
            return this;
        }
        public Builder deviceUsageDuration(@Nullable DurationArgs deviceUsageDuration) {
            this.deviceUsageDuration = Codegen.ofNullable(deviceUsageDuration);
            return this;
        }
        public Builder dimensionValue(@Nullable Output<List<StepDimensionValueEntryArgs>> dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public Builder dimensionValue(@Nullable List<StepDimensionValueEntryArgs> dimensionValue) {
            this.dimensionValue = Codegen.ofNullable(dimensionValue);
            return this;
        }
        public Builder dimensionValue(StepDimensionValueEntryArgs... dimensionValue) {
            return dimensionValue(List.of(dimensionValue));
        }
        public Builder executionId(Output<String> executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }
        public Builder executionId(String executionId) {
            this.executionId = Output.of(Objects.requireNonNull(executionId));
            return this;
        }
        public Builder hasImages(@Nullable Output<Boolean> hasImages) {
            this.hasImages = hasImages;
            return this;
        }
        public Builder hasImages(@Nullable Boolean hasImages) {
            this.hasImages = Codegen.ofNullable(hasImages);
            return this;
        }
        public Builder historyId(Output<String> historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }
        public Builder historyId(String historyId) {
            this.historyId = Output.of(Objects.requireNonNull(historyId));
            return this;
        }
        public Builder labels(@Nullable Output<List<StepLabelsEntryArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<StepLabelsEntryArgs> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder labels(StepLabelsEntryArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder multiStep(@Nullable Output<MultiStepArgs> multiStep) {
            this.multiStep = multiStep;
            return this;
        }
        public Builder multiStep(@Nullable MultiStepArgs multiStep) {
            this.multiStep = Codegen.ofNullable(multiStep);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder outcome(@Nullable Output<OutcomeArgs> outcome) {
            this.outcome = outcome;
            return this;
        }
        public Builder outcome(@Nullable OutcomeArgs outcome) {
            this.outcome = Codegen.ofNullable(outcome);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder runDuration(@Nullable Output<DurationArgs> runDuration) {
            this.runDuration = runDuration;
            return this;
        }
        public Builder runDuration(@Nullable DurationArgs runDuration) {
            this.runDuration = Codegen.ofNullable(runDuration);
            return this;
        }
        public Builder state(@Nullable Output<StepState> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable StepState state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder stepId(@Nullable Output<String> stepId) {
            this.stepId = stepId;
            return this;
        }
        public Builder stepId(@Nullable String stepId) {
            this.stepId = Codegen.ofNullable(stepId);
            return this;
        }
        public Builder testExecutionStep(@Nullable Output<TestExecutionStepArgs> testExecutionStep) {
            this.testExecutionStep = testExecutionStep;
            return this;
        }
        public Builder testExecutionStep(@Nullable TestExecutionStepArgs testExecutionStep) {
            this.testExecutionStep = Codegen.ofNullable(testExecutionStep);
            return this;
        }
        public Builder toolExecutionStep(@Nullable Output<ToolExecutionStepArgs> toolExecutionStep) {
            this.toolExecutionStep = toolExecutionStep;
            return this;
        }
        public Builder toolExecutionStep(@Nullable ToolExecutionStepArgs toolExecutionStep) {
            this.toolExecutionStep = Codegen.ofNullable(toolExecutionStep);
            return this;
        }        public StepArgs build() {
            return new StepArgs(completionTime, creationTime, description, deviceUsageDuration, dimensionValue, executionId, hasImages, historyId, labels, multiStep, name, outcome, project, requestId, runDuration, state, stepId, testExecutionStep, toolExecutionStep);
        }
    }
}
