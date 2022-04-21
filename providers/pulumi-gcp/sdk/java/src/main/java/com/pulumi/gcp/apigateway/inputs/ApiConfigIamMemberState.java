// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiConfigIamMemberState extends com.pulumi.resources.ResourceArgs {

    public static final ApiConfigIamMemberState Empty = new ApiConfigIamMemberState();

    /**
     * The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="api")
    private @Nullable Output<String> api;

    public Optional<Output<String>> api() {
        return Optional.ofNullable(this.api);
    }

    @Import(name="apiConfig")
    private @Nullable Output<String> apiConfig;

    public Optional<Output<String>> apiConfig() {
        return Optional.ofNullable(this.apiConfig);
    }

    @Import(name="condition")
    private @Nullable Output<ApiConfigIamMemberConditionGetArgs> condition;

    public Optional<Output<ApiConfigIamMemberConditionGetArgs>> condition() {
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
     * The role that should be applied. Only one
     * `gcp.apigateway.ApiConfigIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private ApiConfigIamMemberState() {}

    private ApiConfigIamMemberState(ApiConfigIamMemberState $) {
        this.api = $.api;
        this.apiConfig = $.apiConfig;
        this.condition = $.condition;
        this.etag = $.etag;
        this.member = $.member;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiConfigIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiConfigIamMemberState $;

        public Builder() {
            $ = new ApiConfigIamMemberState();
        }

        public Builder(ApiConfigIamMemberState defaults) {
            $ = new ApiConfigIamMemberState(Objects.requireNonNull(defaults));
        }

        public Builder api(@Nullable Output<String> api) {
            $.api = api;
            return this;
        }

        public Builder api(String api) {
            return api(Output.of(api));
        }

        public Builder apiConfig(@Nullable Output<String> apiConfig) {
            $.apiConfig = apiConfig;
            return this;
        }

        public Builder apiConfig(String apiConfig) {
            return apiConfig(Output.of(apiConfig));
        }

        public Builder condition(@Nullable Output<ApiConfigIamMemberConditionGetArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(ApiConfigIamMemberConditionGetArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
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

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public ApiConfigIamMemberState build() {
            return $;
        }
    }

}
