// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.PipelineReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger that allows the referenced pipeline to depend on other pipeline runs based on runDimension Name/Value pairs. Upstream pipelines should declare the same runDimension Name and their runs should have the values for those runDimensions. The referenced pipeline run would be triggered if the values for the runDimension match for all upstream pipeline runs.
 * 
 */
public final class ChainingTriggerArgs extends ResourceArgs {

    public static final ChainingTriggerArgs Empty = new ChainingTriggerArgs();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    /**
     * @return List of tags that can be used for describing the trigger.
     * 
     */
    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Upstream Pipelines.
     * 
     */
    @Import(name="dependsOn", required=true)
    private Output<List<PipelineReferenceArgs>> dependsOn;

    /**
     * @return Upstream Pipelines.
     * 
     */
    public Output<List<PipelineReferenceArgs>> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Trigger description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Trigger description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Pipeline for which runs are created when all upstream pipelines complete successfully.
     * 
     */
    @Import(name="pipeline", required=true)
    private Output<TriggerPipelineReferenceArgs> pipeline;

    /**
     * @return Pipeline for which runs are created when all upstream pipelines complete successfully.
     * 
     */
    public Output<TriggerPipelineReferenceArgs> pipeline() {
        return this.pipeline;
    }

    /**
     * Run Dimension property that needs to be emitted by upstream pipelines.
     * 
     */
    @Import(name="runDimension", required=true)
    private Output<String> runDimension;

    /**
     * @return Run Dimension property that needs to be emitted by upstream pipelines.
     * 
     */
    public Output<String> runDimension() {
        return this.runDimension;
    }

    /**
     * Trigger type.
     * Expected value is &#39;ChainingTrigger&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Trigger type.
     * Expected value is &#39;ChainingTrigger&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ChainingTriggerArgs() {}

    private ChainingTriggerArgs(ChainingTriggerArgs $) {
        this.annotations = $.annotations;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.pipeline = $.pipeline;
        this.runDimension = $.runDimension;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChainingTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChainingTriggerArgs $;

        public Builder() {
            $ = new ChainingTriggerArgs();
        }

        public Builder(ChainingTriggerArgs defaults) {
            $ = new ChainingTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations List of tags that can be used for describing the trigger.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the trigger.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the trigger.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param dependsOn Upstream Pipelines.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(Output<List<PipelineReferenceArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Upstream Pipelines.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(List<PipelineReferenceArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        /**
         * @param dependsOn Upstream Pipelines.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(PipelineReferenceArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param description Trigger description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Trigger description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param pipeline Pipeline for which runs are created when all upstream pipelines complete successfully.
         * 
         * @return builder
         * 
         */
        public Builder pipeline(Output<TriggerPipelineReferenceArgs> pipeline) {
            $.pipeline = pipeline;
            return this;
        }

        /**
         * @param pipeline Pipeline for which runs are created when all upstream pipelines complete successfully.
         * 
         * @return builder
         * 
         */
        public Builder pipeline(TriggerPipelineReferenceArgs pipeline) {
            return pipeline(Output.of(pipeline));
        }

        /**
         * @param runDimension Run Dimension property that needs to be emitted by upstream pipelines.
         * 
         * @return builder
         * 
         */
        public Builder runDimension(Output<String> runDimension) {
            $.runDimension = runDimension;
            return this;
        }

        /**
         * @param runDimension Run Dimension property that needs to be emitted by upstream pipelines.
         * 
         * @return builder
         * 
         */
        public Builder runDimension(String runDimension) {
            return runDimension(Output.of(runDimension));
        }

        /**
         * @param type Trigger type.
         * Expected value is &#39;ChainingTrigger&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Trigger type.
         * Expected value is &#39;ChainingTrigger&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ChainingTriggerArgs build() {
            $.dependsOn = Objects.requireNonNull($.dependsOn, "expected parameter 'dependsOn' to be non-null");
            $.pipeline = Objects.requireNonNull($.pipeline, "expected parameter 'pipeline' to be non-null");
            $.runDimension = Objects.requireNonNull($.runDimension, "expected parameter 'runDimension' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
