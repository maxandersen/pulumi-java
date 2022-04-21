// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.endpoints;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.endpoints.inputs.ServiceIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIamBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIamBindingArgs Empty = new ServiceIamBindingArgs();

    @Import(name="condition")
    private @Nullable Output<ServiceIamBindingConditionArgs> condition;

    public Optional<Output<ServiceIamBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="members", required=true)
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.endpoints.ServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ServiceIamBindingArgs() {}

    private ServiceIamBindingArgs(ServiceIamBindingArgs $) {
        this.condition = $.condition;
        this.members = $.members;
        this.role = $.role;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIamBindingArgs $;

        public Builder() {
            $ = new ServiceIamBindingArgs();
        }

        public Builder(ServiceIamBindingArgs defaults) {
            $ = new ServiceIamBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<ServiceIamBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(ServiceIamBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder members(Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ServiceIamBindingArgs build() {
            $.members = Objects.requireNonNull($.members, "expected parameter 'members' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
