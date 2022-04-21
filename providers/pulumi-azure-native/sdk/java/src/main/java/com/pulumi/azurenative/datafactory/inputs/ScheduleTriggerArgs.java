// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ScheduleTriggerRecurrenceArgs;
import com.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger that creates pipeline runs periodically, on schedule.
 * 
 */
public final class ScheduleTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleTriggerArgs Empty = new ScheduleTriggerArgs();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Trigger description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Pipelines that need to be started.
     * 
     */
    @Import(name="pipelines")
    private @Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines;

    public Optional<Output<List<TriggerPipelineReferenceArgs>>> pipelines() {
        return Optional.ofNullable(this.pipelines);
    }

    /**
     * Recurrence schedule configuration.
     * 
     */
    @Import(name="recurrence", required=true)
    private Output<ScheduleTriggerRecurrenceArgs> recurrence;

    public Output<ScheduleTriggerRecurrenceArgs> recurrence() {
        return this.recurrence;
    }

    /**
     * Trigger type.
     * Expected value is &#39;ScheduleTrigger&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ScheduleTriggerArgs() {}

    private ScheduleTriggerArgs(ScheduleTriggerArgs $) {
        this.annotations = $.annotations;
        this.description = $.description;
        this.pipelines = $.pipelines;
        this.recurrence = $.recurrence;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleTriggerArgs $;

        public Builder() {
            $ = new ScheduleTriggerArgs();
        }

        public Builder(ScheduleTriggerArgs defaults) {
            $ = new ScheduleTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder pipelines(@Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines) {
            $.pipelines = pipelines;
            return this;
        }

        public Builder pipelines(List<TriggerPipelineReferenceArgs> pipelines) {
            return pipelines(Output.of(pipelines));
        }

        public Builder pipelines(TriggerPipelineReferenceArgs... pipelines) {
            return pipelines(List.of(pipelines));
        }

        public Builder recurrence(Output<ScheduleTriggerRecurrenceArgs> recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        public Builder recurrence(ScheduleTriggerRecurrenceArgs recurrence) {
            return recurrence(Output.of(recurrence));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ScheduleTriggerArgs build() {
            $.recurrence = Objects.requireNonNull($.recurrence, "expected parameter 'recurrence' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
