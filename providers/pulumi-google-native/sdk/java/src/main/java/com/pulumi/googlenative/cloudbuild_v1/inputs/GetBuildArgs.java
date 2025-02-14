// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBuildArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBuildArgs Empty = new GetBuildArgs();

    @Import(name="buildId", required=true)
    private String buildId;

    public String buildId() {
        return this.buildId;
    }

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="projectId", required=true)
    private String projectId;

    public String projectId() {
        return this.projectId;
    }

    private GetBuildArgs() {}

    private GetBuildArgs(GetBuildArgs $) {
        this.buildId = $.buildId;
        this.id = $.id;
        this.location = $.location;
        this.project = $.project;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBuildArgs $;

        public Builder() {
            $ = new GetBuildArgs();
        }

        public Builder(GetBuildArgs defaults) {
            $ = new GetBuildArgs(Objects.requireNonNull(defaults));
        }

        public Builder buildId(String buildId) {
            $.buildId = buildId;
            return this;
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetBuildArgs build() {
            $.buildId = Objects.requireNonNull($.buildId, "expected parameter 'buildId' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
