// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.CSIStorageCapacityArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:storage.k8s.io/v1beta1:CSIStorageCapacity")
public class CSIStorageCapacity extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="capacity", type=String.class, parameters={})
    private Output</* @Nullable */ String> capacity;

    public Output</* @Nullable */ String> getCapacity() {
        return this.capacity;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="maximumVolumeSize", type=String.class, parameters={})
    private Output</* @Nullable */ String> maximumVolumeSize;

    public Output</* @Nullable */ String> getMaximumVolumeSize() {
        return this.maximumVolumeSize;
    }
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="nodeTopology", type=LabelSelector.class, parameters={})
    private Output</* @Nullable */ LabelSelector> nodeTopology;

    public Output</* @Nullable */ LabelSelector> getNodeTopology() {
        return this.nodeTopology;
    }
    @OutputExport(name="storageClassName", type=String.class, parameters={})
    private Output<String> storageClassName;

    public Output<String> getStorageClassName() {
        return this.storageClassName;
    }

    public CSIStorageCapacity(String name, CSIStorageCapacityArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1beta1:CSIStorageCapacity", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private CSIStorageCapacity(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1beta1:CSIStorageCapacity", name, null, makeResourceOptions(options, id));
    }

    private static CSIStorageCapacityArgs makeArgs(CSIStorageCapacityArgs args) {
        var builder = args == null ? CSIStorageCapacityArgs.builder() : CSIStorageCapacityArgs.builder(args);
        return builder
            .setApiVersion("storage.k8s.io/v1beta1")
            .setKind("CSIStorageCapacity")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:storage.k8s.io/v1alpha1:CSIStorageCapacity").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CSIStorageCapacity get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CSIStorageCapacity(name, id, options);
    }
}
