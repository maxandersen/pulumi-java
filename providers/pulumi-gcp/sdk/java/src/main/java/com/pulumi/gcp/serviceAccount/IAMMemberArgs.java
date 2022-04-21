// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceAccount;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.serviceAccount.inputs.IAMMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IAMMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final IAMMemberArgs Empty = new IAMMemberArgs();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<IAMMemberConditionArgs> condition;

    public Optional<Output<IAMMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.serviceAccount.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    /**
     * The fully-qualified name of the service account to apply policy to.
     * 
     */
    @Import(name="serviceAccountId", required=true)
    private Output<String> serviceAccountId;

    public Output<String> serviceAccountId() {
        return this.serviceAccountId;
    }

    private IAMMemberArgs() {}

    private IAMMemberArgs(IAMMemberArgs $) {
        this.condition = $.condition;
        this.member = $.member;
        this.role = $.role;
        this.serviceAccountId = $.serviceAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMMemberArgs $;

        public Builder() {
            $ = new IAMMemberArgs();
        }

        public Builder(IAMMemberArgs defaults) {
            $ = new IAMMemberArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<IAMMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(IAMMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder member(Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder serviceAccountId(Output<String> serviceAccountId) {
            $.serviceAccountId = serviceAccountId;
            return this;
        }

        public Builder serviceAccountId(String serviceAccountId) {
            return serviceAccountId(Output.of(serviceAccountId));
        }

        public IAMMemberArgs build() {
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.serviceAccountId = Objects.requireNonNull($.serviceAccountId, "expected parameter 'serviceAccountId' to be non-null");
            return $;
        }
    }

}
