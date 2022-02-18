// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.scheduling.k8s.io_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import io.pulumi.kubernetes.scheduling.k8s.io_v1beta1.PriorityClassListArgs;
import io.pulumi.kubernetes.scheduling.k8s.io_v1beta1.outputs.PriorityClass;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * PriorityClassList is a collection of priority classes.
 * 
 */
@ResourceType(type="kubernetes:scheduling.k8s.io/v1beta1:PriorityClassList")
public class PriorityClassList extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * items is the list of PriorityClasses
     * 
     */
    @OutputExport(name="items", type=List.class, parameters={PriorityClass.class})
    private Output<List<PriorityClass>> items;

    /**
     * @return items is the list of PriorityClasses
     * 
     */
    public Output<List<PriorityClass>> getItems() {
        return this.items;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @OutputExport(name="metadata", type=ListMeta.class, parameters={})
    private Output</* @Nullable */ ListMeta> metadata;

    /**
     * @return Standard list metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ListMeta> getMetadata() {
        return this.metadata;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PriorityClassList(String name, PriorityClassListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:scheduling.k8s.io/v1beta1:PriorityClassList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PriorityClassList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:scheduling.k8s.io/v1beta1:PriorityClassList", name, null, makeResourceOptions(options, id));
    }

    private static PriorityClassListArgs makeArgs(PriorityClassListArgs args) {
        var builder = args == null ? PriorityClassListArgs.builder() : PriorityClassListArgs.builder(args);
        return builder
            .setApiVersion("scheduling.k8s.io/v1beta1")
            .setKind("PriorityClassList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PriorityClassList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PriorityClassList(name, id, options);
    }
}
