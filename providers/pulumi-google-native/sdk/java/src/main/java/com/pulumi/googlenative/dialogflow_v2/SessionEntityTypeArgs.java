// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.enums.SessionEntityTypeEntityOverrideMode;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2EntityTypeEntityArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SessionEntityTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SessionEntityTypeArgs Empty = new SessionEntityTypeArgs();

    /**
     * The collection of entities associated with this session entity type.
     * 
     */
    @Import(name="entities", required=true)
    private Output<List<GoogleCloudDialogflowV2EntityTypeEntityArgs>> entities;

    public Output<List<GoogleCloudDialogflowV2EntityTypeEntityArgs>> entities() {
        return this.entities;
    }

    /**
     * Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
     */
    @Import(name="entityOverrideMode", required=true)
    private Output<SessionEntityTypeEntityOverrideMode> entityOverrideMode;

    public Output<SessionEntityTypeEntityOverrideMode> entityOverrideMode() {
        return this.entityOverrideMode;
    }

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The unique identifier of this session entity type. Format: `projects//agent/sessions//entityTypes/`, or `projects//agent/environments//users//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default &#39;draft&#39; environment. If `User ID` is not specified, we assume default &#39;-&#39; user. `` must be the display name of an existing entity type in the same agent that will be overridden or supplemented.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="sessionId", required=true)
    private Output<String> sessionId;

    public Output<String> sessionId() {
        return this.sessionId;
    }

    @Import(name="userId", required=true)
    private Output<String> userId;

    public Output<String> userId() {
        return this.userId;
    }

    private SessionEntityTypeArgs() {}

    private SessionEntityTypeArgs(SessionEntityTypeArgs $) {
        this.entities = $.entities;
        this.entityOverrideMode = $.entityOverrideMode;
        this.environmentId = $.environmentId;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.sessionId = $.sessionId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SessionEntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SessionEntityTypeArgs $;

        public Builder() {
            $ = new SessionEntityTypeArgs();
        }

        public Builder(SessionEntityTypeArgs defaults) {
            $ = new SessionEntityTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder entities(Output<List<GoogleCloudDialogflowV2EntityTypeEntityArgs>> entities) {
            $.entities = entities;
            return this;
        }

        public Builder entities(List<GoogleCloudDialogflowV2EntityTypeEntityArgs> entities) {
            return entities(Output.of(entities));
        }

        public Builder entities(GoogleCloudDialogflowV2EntityTypeEntityArgs... entities) {
            return entities(List.of(entities));
        }

        public Builder entityOverrideMode(Output<SessionEntityTypeEntityOverrideMode> entityOverrideMode) {
            $.entityOverrideMode = entityOverrideMode;
            return this;
        }

        public Builder entityOverrideMode(SessionEntityTypeEntityOverrideMode entityOverrideMode) {
            return entityOverrideMode(Output.of(entityOverrideMode));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(Output<String> name) {
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

        public Builder sessionId(Output<String> sessionId) {
            $.sessionId = sessionId;
            return this;
        }

        public Builder sessionId(String sessionId) {
            return sessionId(Output.of(sessionId));
        }

        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public SessionEntityTypeArgs build() {
            $.entities = Objects.requireNonNull($.entities, "expected parameter 'entities' to be non-null");
            $.entityOverrideMode = Objects.requireNonNull($.entityOverrideMode, "expected parameter 'entityOverrideMode' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.sessionId = Objects.requireNonNull($.sessionId, "expected parameter 'sessionId' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
