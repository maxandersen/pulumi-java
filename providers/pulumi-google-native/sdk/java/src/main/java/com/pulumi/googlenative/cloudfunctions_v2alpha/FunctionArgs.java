// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v2alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudfunctions_v2alpha.enums.FunctionEnvironment;
import com.pulumi.googlenative.cloudfunctions_v2alpha.inputs.BuildConfigArgs;
import com.pulumi.googlenative.cloudfunctions_v2alpha.inputs.EventTriggerArgs;
import com.pulumi.googlenative.cloudfunctions_v2alpha.inputs.ServiceConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

    /**
     * Describes the Build step of the function that builds a container from the given source.
     * 
     */
    @Import(name="buildConfig")
    private @Nullable Output<BuildConfigArgs> buildConfig;

    /**
     * @return Describes the Build step of the function that builds a container from the given source.
     * 
     */
    public Optional<Output<BuildConfigArgs>> buildConfig() {
        return Optional.ofNullable(this.buildConfig);
    }

    /**
     * User-provided description of a function.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User-provided description of a function.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Describe whether the function is gen1 or gen2.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<FunctionEnvironment> environment;

    /**
     * @return Describe whether the function is gen1 or gen2.
     * 
     */
    public Optional<Output<FunctionEnvironment>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * An Eventarc trigger managed by Google Cloud Functions that fires events in response to a condition in another service.
     * 
     */
    @Import(name="eventTrigger")
    private @Nullable Output<EventTriggerArgs> eventTrigger;

    /**
     * @return An Eventarc trigger managed by Google Cloud Functions that fires events in response to a condition in another service.
     * 
     */
    public Optional<Output<EventTriggerArgs>> eventTrigger() {
        return Optional.ofNullable(this.eventTrigger);
    }

    /**
     * The ID to use for the function, which will become the final component of the function&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/.
     * 
     */
    @Import(name="functionId")
    private @Nullable Output<String> functionId;

    /**
     * @return The ID to use for the function, which will become the final component of the function&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/.
     * 
     */
    public Optional<Output<String>> functionId() {
        return Optional.ofNullable(this.functionId);
    }

    /**
     * Labels associated with this Cloud Function.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels associated with this Cloud Function.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A user-defined name of the function. Function names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}functions/*`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A user-defined name of the function. Function names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}functions/*`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Describes the Service being deployed. Currently deploys services to Cloud Run (fully managed).
     * 
     */
    @Import(name="serviceConfig")
    private @Nullable Output<ServiceConfigArgs> serviceConfig;

    /**
     * @return Describes the Service being deployed. Currently deploys services to Cloud Run (fully managed).
     * 
     */
    public Optional<Output<ServiceConfigArgs>> serviceConfig() {
        return Optional.ofNullable(this.serviceConfig);
    }

    private FunctionArgs() {}

    private FunctionArgs(FunctionArgs $) {
        this.buildConfig = $.buildConfig;
        this.description = $.description;
        this.environment = $.environment;
        this.eventTrigger = $.eventTrigger;
        this.functionId = $.functionId;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.serviceConfig = $.serviceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionArgs $;

        public Builder() {
            $ = new FunctionArgs();
        }

        public Builder(FunctionArgs defaults) {
            $ = new FunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildConfig Describes the Build step of the function that builds a container from the given source.
         * 
         * @return builder
         * 
         */
        public Builder buildConfig(@Nullable Output<BuildConfigArgs> buildConfig) {
            $.buildConfig = buildConfig;
            return this;
        }

        /**
         * @param buildConfig Describes the Build step of the function that builds a container from the given source.
         * 
         * @return builder
         * 
         */
        public Builder buildConfig(BuildConfigArgs buildConfig) {
            return buildConfig(Output.of(buildConfig));
        }

        /**
         * @param description User-provided description of a function.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User-provided description of a function.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param environment Describe whether the function is gen1 or gen2.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<FunctionEnvironment> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Describe whether the function is gen1 or gen2.
         * 
         * @return builder
         * 
         */
        public Builder environment(FunctionEnvironment environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param eventTrigger An Eventarc trigger managed by Google Cloud Functions that fires events in response to a condition in another service.
         * 
         * @return builder
         * 
         */
        public Builder eventTrigger(@Nullable Output<EventTriggerArgs> eventTrigger) {
            $.eventTrigger = eventTrigger;
            return this;
        }

        /**
         * @param eventTrigger An Eventarc trigger managed by Google Cloud Functions that fires events in response to a condition in another service.
         * 
         * @return builder
         * 
         */
        public Builder eventTrigger(EventTriggerArgs eventTrigger) {
            return eventTrigger(Output.of(eventTrigger));
        }

        /**
         * @param functionId The ID to use for the function, which will become the final component of the function&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/.
         * 
         * @return builder
         * 
         */
        public Builder functionId(@Nullable Output<String> functionId) {
            $.functionId = functionId;
            return this;
        }

        /**
         * @param functionId The ID to use for the function, which will become the final component of the function&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/.
         * 
         * @return builder
         * 
         */
        public Builder functionId(String functionId) {
            return functionId(Output.of(functionId));
        }

        /**
         * @param labels Labels associated with this Cloud Function.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels associated with this Cloud Function.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name A user-defined name of the function. Function names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}functions/*`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A user-defined name of the function. Function names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}functions/*`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceConfig Describes the Service being deployed. Currently deploys services to Cloud Run (fully managed).
         * 
         * @return builder
         * 
         */
        public Builder serviceConfig(@Nullable Output<ServiceConfigArgs> serviceConfig) {
            $.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * @param serviceConfig Describes the Service being deployed. Currently deploys services to Cloud Run (fully managed).
         * 
         * @return builder
         * 
         */
        public Builder serviceConfig(ServiceConfigArgs serviceConfig) {
            return serviceConfig(Output.of(serviceConfig));
        }

        public FunctionArgs build() {
            return $;
        }
    }

}
