// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.servicedirectory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceIamBindingState extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceIamBindingState Empty = new NamespaceIamBindingState();

    @Import(name="condition")
    private @Nullable Output<NamespaceIamBindingConditionGetArgs> condition;

    public Optional<Output<NamespaceIamBindingConditionGetArgs>> condition() {
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

    @Import(name="members")
    private @Nullable Output<List<String>> members;

    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
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
    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private NamespaceIamBindingState() {}

    private NamespaceIamBindingState(NamespaceIamBindingState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.members = $.members;
        this.name = $.name;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceIamBindingState $;

        public Builder() {
            $ = new NamespaceIamBindingState();
        }

        public Builder(NamespaceIamBindingState defaults) {
            $ = new NamespaceIamBindingState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<NamespaceIamBindingConditionGetArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(NamespaceIamBindingConditionGetArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public NamespaceIamBindingState build() {
            return $;
        }
    }

}
