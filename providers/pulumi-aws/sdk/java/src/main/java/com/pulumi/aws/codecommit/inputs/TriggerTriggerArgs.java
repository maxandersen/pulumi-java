// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerTriggerArgs Empty = new TriggerTriggerArgs();

    /**
     * The branches that will be included in the trigger configuration. If no branches are specified, the trigger will apply to all branches.
     * 
     */
    @Import(name="branches")
    private @Nullable Output<List<String>> branches;

    public Optional<Output<List<String>>> branches() {
        return Optional.ofNullable(this.branches);
    }

    /**
     * Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.
     * 
     */
    @Import(name="customData")
    private @Nullable Output<String> customData;

    public Optional<Output<String>> customData() {
        return Optional.ofNullable(this.customData);
    }

    /**
     * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).
     * 
     */
    @Import(name="destinationArn", required=true)
    private Output<String> destinationArn;

    public Output<String> destinationArn() {
        return this.destinationArn;
    }

    /**
     * The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). If no events are specified, the trigger will run for all repository events. Event types include: `all`, `updateReference`, `createReference`, `deleteReference`.
     * 
     */
    @Import(name="events", required=true)
    private Output<List<String>> events;

    public Output<List<String>> events() {
        return this.events;
    }

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private TriggerTriggerArgs() {}

    private TriggerTriggerArgs(TriggerTriggerArgs $) {
        this.branches = $.branches;
        this.customData = $.customData;
        this.destinationArn = $.destinationArn;
        this.events = $.events;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerTriggerArgs $;

        public Builder() {
            $ = new TriggerTriggerArgs();
        }

        public Builder(TriggerTriggerArgs defaults) {
            $ = new TriggerTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder branches(@Nullable Output<List<String>> branches) {
            $.branches = branches;
            return this;
        }

        public Builder branches(List<String> branches) {
            return branches(Output.of(branches));
        }

        public Builder branches(String... branches) {
            return branches(List.of(branches));
        }

        public Builder customData(@Nullable Output<String> customData) {
            $.customData = customData;
            return this;
        }

        public Builder customData(String customData) {
            return customData(Output.of(customData));
        }

        public Builder destinationArn(Output<String> destinationArn) {
            $.destinationArn = destinationArn;
            return this;
        }

        public Builder destinationArn(String destinationArn) {
            return destinationArn(Output.of(destinationArn));
        }

        public Builder events(Output<List<String>> events) {
            $.events = events;
            return this;
        }

        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        public Builder events(String... events) {
            return events(List.of(events));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public TriggerTriggerArgs build() {
            $.destinationArn = Objects.requireNonNull($.destinationArn, "expected parameter 'destinationArn' to be non-null");
            $.events = Objects.requireNonNull($.events, "expected parameter 'events' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
