// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Base class for all triggers that support one to many model for trigger to pipeline.
 * 
 */
public final class MultiplePipelineTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultiplePipelineTriggerArgs Empty = new MultiplePipelineTriggerArgs();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * Trigger description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Pipelines that need to be started.
     * 
     */
    @Import(name="pipelines")
      private final @Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines;

    public Output<List<TriggerPipelineReferenceArgs>> pipelines() {
        return this.pipelines == null ? Codegen.empty() : this.pipelines;
    }

    /**
     * Trigger type.
     * Expected value is &#39;MultiplePipelineTrigger&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public MultiplePipelineTriggerArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<String> description,
        @Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines,
        Output<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.pipelines = pipelines;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private MultiplePipelineTriggerArgs() {
        this.annotations = Codegen.empty();
        this.description = Codegen.empty();
        this.pipelines = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiplePipelineTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<String> description;
        private @Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiplePipelineTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.pipelines = defaults.pipelines;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder pipelines(@Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines) {
            this.pipelines = pipelines;
            return this;
        }
        public Builder pipelines(@Nullable List<TriggerPipelineReferenceArgs> pipelines) {
            this.pipelines = Codegen.ofNullable(pipelines);
            return this;
        }
        public Builder pipelines(TriggerPipelineReferenceArgs... pipelines) {
            return pipelines(List.of(pipelines));
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public MultiplePipelineTriggerArgs build() {
            return new MultiplePipelineTriggerArgs(annotations, description, pipelines, type);
        }
    }
}
