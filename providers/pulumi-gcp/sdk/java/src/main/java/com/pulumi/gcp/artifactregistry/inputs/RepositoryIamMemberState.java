// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryIamMemberState extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryIamMemberState Empty = new RepositoryIamMemberState();

    @Import(name="condition")
    private @Nullable Output<RepositoryIamMemberConditionGetArgs> condition;

    public Optional<Output<RepositoryIamMemberConditionGetArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The name of the location this repository is located in.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="member")
    private @Nullable Output<String> member;

    public Optional<Output<String>> member() {
        return Optional.ofNullable(this.member);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="repository")
    private @Nullable Output<String> repository;

    public Optional<Output<String>> repository() {
        return Optional.ofNullable(this.repository);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.artifactregistry.RepositoryIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private RepositoryIamMemberState() {}

    private RepositoryIamMemberState(RepositoryIamMemberState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.location = $.location;
        this.member = $.member;
        this.project = $.project;
        this.repository = $.repository;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryIamMemberState $;

        public Builder() {
            $ = new RepositoryIamMemberState();
        }

        public Builder(RepositoryIamMemberState defaults) {
            $ = new RepositoryIamMemberState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<RepositoryIamMemberConditionGetArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(RepositoryIamMemberConditionGetArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder member(@Nullable Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder repository(@Nullable Output<String> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public RepositoryIamMemberState build() {
            return $;
        }
    }

}
