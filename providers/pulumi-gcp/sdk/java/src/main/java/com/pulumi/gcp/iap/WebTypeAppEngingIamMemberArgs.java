// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.iap.inputs.WebTypeAppEngingIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebTypeAppEngingIamMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebTypeAppEngingIamMemberArgs Empty = new WebTypeAppEngingIamMemberArgs();

    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<WebTypeAppEngingIamMemberConditionArgs> condition;

    public Optional<Output<WebTypeAppEngingIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
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
     * `gcp.iap.WebTypeAppEngingIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    private WebTypeAppEngingIamMemberArgs() {}

    private WebTypeAppEngingIamMemberArgs(WebTypeAppEngingIamMemberArgs $) {
        this.appId = $.appId;
        this.condition = $.condition;
        this.member = $.member;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebTypeAppEngingIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebTypeAppEngingIamMemberArgs $;

        public Builder() {
            $ = new WebTypeAppEngingIamMemberArgs();
        }

        public Builder(WebTypeAppEngingIamMemberArgs defaults) {
            $ = new WebTypeAppEngingIamMemberArgs(Objects.requireNonNull(defaults));
        }

        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        public Builder condition(@Nullable Output<WebTypeAppEngingIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(WebTypeAppEngingIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder member(Output<String> member) {
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

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public WebTypeAppEngingIamMemberArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
