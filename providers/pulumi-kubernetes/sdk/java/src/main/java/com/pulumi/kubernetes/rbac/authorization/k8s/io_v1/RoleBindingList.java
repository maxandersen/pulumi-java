// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.authorization.k8s.io_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import com.pulumi.kubernetes.rbac.authorization.k8s.io_v1.RoleBindingListArgs;
import com.pulumi.kubernetes.rbac.authorization.k8s.io_v1.outputs.RoleBinding;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * RoleBindingList is a collection of RoleBindings
 * 
 */
@ResourceType(type="kubernetes:rbac.authorization.k8s.io/v1:RoleBindingList")
public class RoleBindingList extends com.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * Items is a list of RoleBindings
     * 
     */
    @Export(name="items", type=List.class, parameters={RoleBinding.class})
    private Output<List<RoleBinding>> items;

    /**
     * @return Items is a list of RoleBindings
     * 
     */
    public Output<List<RoleBinding>> items() {
        return this.items;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * Standard object&#39;s metadata.
     * 
     */
    @Export(name="metadata", type=ListMeta.class, parameters={})
    private Output</* @Nullable */ ListMeta> metadata;

    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    public Output</* @Nullable */ ListMeta> metadata() {
        return this.metadata;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleBindingList(String name) {
        this(name, RoleBindingListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleBindingList(String name, RoleBindingListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleBindingList(String name, RoleBindingListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1:RoleBindingList", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private RoleBindingList(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1:RoleBindingList", name, null, makeResourceOptions(options, id));
    }

    private static RoleBindingListArgs makeArgs(RoleBindingListArgs args) {
        var builder = args == null ? RoleBindingListArgs.builder() : RoleBindingListArgs.builder(args);
        return builder
            .apiVersion("rbac.authorization.k8s.io/v1")
            .kind("RoleBindingList")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RoleBindingList get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoleBindingList(name, id, options);
    }
}
