// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.spanner.inputs.InstanceIAMMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceIAMMemberState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceIAMMemberState Empty = new InstanceIAMMemberState();

    @Import(name="condition")
    private @Nullable Output<InstanceIAMMemberConditionGetArgs> condition;

    public Optional<Output<InstanceIAMMemberConditionGetArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Computed) The etag of the instance&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The name of the instance.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    @Import(name="member")
    private @Nullable Output<String> member;

    public Optional<Output<String>> member() {
        return Optional.ofNullable(this.member);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.spanner.InstanceIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private InstanceIAMMemberState() {}

    private InstanceIAMMemberState(InstanceIAMMemberState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.instance = $.instance;
        this.member = $.member;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceIAMMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceIAMMemberState $;

        public Builder() {
            $ = new InstanceIAMMemberState();
        }

        public Builder(InstanceIAMMemberState defaults) {
            $ = new InstanceIAMMemberState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<InstanceIAMMemberConditionGetArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(InstanceIAMMemberConditionGetArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        public Builder instance(String instance) {
            return instance(Output.of(instance));
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

        public InstanceIAMMemberState build() {
            return $;
        }
    }

}
