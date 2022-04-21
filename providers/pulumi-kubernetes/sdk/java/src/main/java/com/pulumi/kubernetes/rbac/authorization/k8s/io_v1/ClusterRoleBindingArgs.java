// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.authorization.k8s.io_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import com.pulumi.kubernetes.rbac.authorization.k8s.io_v1.inputs.RoleRefArgs;
import com.pulumi.kubernetes.rbac.authorization.k8s.io_v1.inputs.SubjectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterRoleBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterRoleBindingArgs Empty = new ClusterRoleBindingArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Standard object&#39;s metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
     * 
     */
    @Import(name="roleRef", required=true)
    private Output<RoleRefArgs> roleRef;

    public Output<RoleRefArgs> roleRef() {
        return this.roleRef;
    }

    /**
     * Subjects holds references to the objects the role applies to.
     * 
     */
    @Import(name="subjects")
    private @Nullable Output<List<SubjectArgs>> subjects;

    public Optional<Output<List<SubjectArgs>>> subjects() {
        return Optional.ofNullable(this.subjects);
    }

    private ClusterRoleBindingArgs() {}

    private ClusterRoleBindingArgs(ClusterRoleBindingArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.roleRef = $.roleRef;
        this.subjects = $.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterRoleBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterRoleBindingArgs $;

        public Builder() {
            $ = new ClusterRoleBindingArgs();
        }

        public Builder(ClusterRoleBindingArgs defaults) {
            $ = new ClusterRoleBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder roleRef(Output<RoleRefArgs> roleRef) {
            $.roleRef = roleRef;
            return this;
        }

        public Builder roleRef(RoleRefArgs roleRef) {
            return roleRef(Output.of(roleRef));
        }

        public Builder subjects(@Nullable Output<List<SubjectArgs>> subjects) {
            $.subjects = subjects;
            return this;
        }

        public Builder subjects(List<SubjectArgs> subjects) {
            return subjects(Output.of(subjects));
        }

        public Builder subjects(SubjectArgs... subjects) {
            return subjects(List.of(subjects));
        }

        public ClusterRoleBindingArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            $.roleRef = Objects.requireNonNull($.roleRef, "expected parameter 'roleRef' to be non-null");
            return $;
        }
    }

}
