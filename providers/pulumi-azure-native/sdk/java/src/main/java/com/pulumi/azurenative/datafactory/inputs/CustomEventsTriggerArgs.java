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
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger that runs every time a custom event is received.
 * 
 */
public final class CustomEventsTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomEventsTriggerArgs Empty = new CustomEventsTriggerArgs();

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
     * The list of event types that cause this trigger to fire.
     * 
     */
    @Import(name="events", required=true)
    private Output<List<Object>> events;

    public Output<List<Object>> events() {
        return this.events;
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
     * The ARM resource ID of the Azure Event Grid Topic.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    /**
     * The event subject must begin with the pattern provided for trigger to fire. At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     * 
     */
    @Import(name="subjectBeginsWith")
    private @Nullable Output<String> subjectBeginsWith;

    public Optional<Output<String>> subjectBeginsWith() {
        return Optional.ofNullable(this.subjectBeginsWith);
    }

    /**
     * The event subject must end with the pattern provided for trigger to fire. At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     * 
     */
    @Import(name="subjectEndsWith")
    private @Nullable Output<String> subjectEndsWith;

    public Optional<Output<String>> subjectEndsWith() {
        return Optional.ofNullable(this.subjectEndsWith);
    }

    /**
     * Trigger type.
     * Expected value is &#39;CustomEventsTrigger&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private CustomEventsTriggerArgs() {}

    private CustomEventsTriggerArgs(CustomEventsTriggerArgs $) {
        this.annotations = $.annotations;
        this.description = $.description;
        this.events = $.events;
        this.pipelines = $.pipelines;
        this.scope = $.scope;
        this.subjectBeginsWith = $.subjectBeginsWith;
        this.subjectEndsWith = $.subjectEndsWith;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomEventsTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomEventsTriggerArgs $;

        public Builder() {
            $ = new CustomEventsTriggerArgs();
        }

        public Builder(CustomEventsTriggerArgs defaults) {
            $ = new CustomEventsTriggerArgs(Objects.requireNonNull(defaults));
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

        public Builder events(Output<List<Object>> events) {
            $.events = events;
            return this;
        }

        public Builder events(List<Object> events) {
            return events(Output.of(events));
        }

        public Builder events(Object... events) {
            return events(List.of(events));
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

        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public Builder subjectBeginsWith(@Nullable Output<String> subjectBeginsWith) {
            $.subjectBeginsWith = subjectBeginsWith;
            return this;
        }

        public Builder subjectBeginsWith(String subjectBeginsWith) {
            return subjectBeginsWith(Output.of(subjectBeginsWith));
        }

        public Builder subjectEndsWith(@Nullable Output<String> subjectEndsWith) {
            $.subjectEndsWith = subjectEndsWith;
            return this;
        }

        public Builder subjectEndsWith(String subjectEndsWith) {
            return subjectEndsWith(Output.of(subjectEndsWith));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CustomEventsTriggerArgs build() {
            $.events = Objects.requireNonNull($.events, "expected parameter 'events' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
