// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentIamBindingState extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentIamBindingState Empty = new EnvironmentIamBindingState();

    @Import(name="condition")
    private @Nullable Output<EnvironmentIamBindingConditionGetArgs> condition;

    public Optional<Output<EnvironmentIamBindingConditionGetArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="envId")
    private @Nullable Output<String> envId;

    public Optional<Output<String>> envId() {
        return Optional.ofNullable(this.envId);
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

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.apigee.EnvironmentIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private EnvironmentIamBindingState() {}

    private EnvironmentIamBindingState(EnvironmentIamBindingState $) {
        this.condition = $.condition;
        this.envId = $.envId;
        this.etag = $.etag;
        this.members = $.members;
        this.orgId = $.orgId;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentIamBindingState $;

        public Builder() {
            $ = new EnvironmentIamBindingState();
        }

        public Builder(EnvironmentIamBindingState defaults) {
            $ = new EnvironmentIamBindingState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<EnvironmentIamBindingConditionGetArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(EnvironmentIamBindingConditionGetArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder envId(@Nullable Output<String> envId) {
            $.envId = envId;
            return this;
        }

        public Builder envId(String envId) {
            return envId(Output.of(envId));
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

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public EnvironmentIamBindingState build() {
            return $;
        }
    }

}
