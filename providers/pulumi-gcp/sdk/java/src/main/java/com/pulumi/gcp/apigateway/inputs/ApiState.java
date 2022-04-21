// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiState extends com.pulumi.resources.ResourceArgs {

    public static final ApiState Empty = new ApiState();

    /**
     * Identifier to assign to the API. Must be unique within scope of the parent resource(project)
     * 
     */
    @Import(name="apiId")
    private @Nullable Output<String> apiId;

    public Optional<Output<String>> apiId() {
        return Optional.ofNullable(this.apiId);
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * A user-visible name for the API.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-infrastructure/docs/glossary#managed).
     * If not specified, a new Service will automatically be created in the same project as this API.
     * 
     */
    @Import(name="managedService")
    private @Nullable Output<String> managedService;

    public Optional<Output<String>> managedService() {
        return Optional.ofNullable(this.managedService);
    }

    /**
     * The resource name of the API. Format &#39;projects/{{project}}/locations/global/apis/{{apiId}}&#39;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ApiState() {}

    private ApiState(ApiState $) {
        this.apiId = $.apiId;
        this.createTime = $.createTime;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.managedService = $.managedService;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiState $;

        public Builder() {
            $ = new ApiState();
        }

        public Builder(ApiState defaults) {
            $ = new ApiState(Objects.requireNonNull(defaults));
        }

        public Builder apiId(@Nullable Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder managedService(@Nullable Output<String> managedService) {
            $.managedService = managedService;
            return this;
        }

        public Builder managedService(String managedService) {
            return managedService(Output.of(managedService));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

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

        public ApiState build() {
            return $;
        }
    }

}
