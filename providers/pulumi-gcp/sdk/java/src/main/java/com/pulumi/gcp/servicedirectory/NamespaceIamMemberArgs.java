// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.servicedirectory;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceIamMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceIamMemberArgs Empty = new NamespaceIamMemberArgs();

    @Import(name="condition")
    private @Nullable Output<NamespaceIamMemberConditionArgs> condition;

    public Optional<Output<NamespaceIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.servicedirectory.NamespaceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    private NamespaceIamMemberArgs() {}

    private NamespaceIamMemberArgs(NamespaceIamMemberArgs $) {
        this.condition = $.condition;
        this.member = $.member;
        this.name = $.name;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceIamMemberArgs $;

        public Builder() {
            $ = new NamespaceIamMemberArgs();
        }

        public Builder(NamespaceIamMemberArgs defaults) {
            $ = new NamespaceIamMemberArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<NamespaceIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(NamespaceIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder member(Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public NamespaceIamMemberArgs build() {
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
