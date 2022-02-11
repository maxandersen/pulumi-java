// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.RoleBindingArgs;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs.RoleRef;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs.Subject;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:rbac.authorization.k8s.io/v1beta1:RoleBinding")
public class RoleBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="roleRef", type=RoleRef.class, parameters={})
    private Output<RoleRef> roleRef;

    public Output<RoleRef> getRoleRef() {
        return this.roleRef;
    }
    @OutputExport(name="subjects", type=List.class, parameters={Subject.class})
    private Output</* @Nullable */ List<Subject>> subjects;

    public Output</* @Nullable */ List<Subject>> getSubjects() {
        return this.subjects;
    }

    public RoleBinding(String name, RoleBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1beta1:RoleBinding", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private RoleBinding(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1beta1:RoleBinding", name, null, makeResourceOptions(options, id));
    }

    private static RoleBindingArgs makeArgs(RoleBindingArgs args) {
        var builder = args == null ? RoleBindingArgs.builder() : RoleBindingArgs.builder(args);
        return builder
            .setApiVersion("rbac.authorization.k8s.io/v1beta1")
            .setKind("RoleBinding")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:rbac.authorization.k8s.io/v1:RoleBinding").build()),
                Input.of(Alias.builder().setType("kubernetes:rbac.authorization.k8s.io/v1alpha1:RoleBinding").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RoleBinding get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RoleBinding(name, id, options);
    }
}
