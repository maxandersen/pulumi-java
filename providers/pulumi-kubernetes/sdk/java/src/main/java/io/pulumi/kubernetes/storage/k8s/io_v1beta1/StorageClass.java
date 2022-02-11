// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.core_v1.outputs.TopologySelectorTerm;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.StorageClassArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:storage.k8s.io/v1beta1:StorageClass")
public class StorageClass extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allowVolumeExpansion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowVolumeExpansion;

    public Output</* @Nullable */ Boolean> getAllowVolumeExpansion() {
        return this.allowVolumeExpansion;
    }
    @OutputExport(name="allowedTopologies", type=List.class, parameters={TopologySelectorTerm.class})
    private Output</* @Nullable */ List<TopologySelectorTerm>> allowedTopologies;

    public Output</* @Nullable */ List<TopologySelectorTerm>> getAllowedTopologies() {
        return this.allowedTopologies;
    }
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
    @OutputExport(name="mountOptions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> mountOptions;

    public Output</* @Nullable */ List<String>> getMountOptions() {
        return this.mountOptions;
    }
    @OutputExport(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    public Output</* @Nullable */ Map<String,String>> getParameters() {
        return this.parameters;
    }
    @OutputExport(name="provisioner", type=String.class, parameters={})
    private Output<String> provisioner;

    public Output<String> getProvisioner() {
        return this.provisioner;
    }
    @OutputExport(name="reclaimPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> reclaimPolicy;

    public Output</* @Nullable */ String> getReclaimPolicy() {
        return this.reclaimPolicy;
    }
    @OutputExport(name="volumeBindingMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> volumeBindingMode;

    public Output</* @Nullable */ String> getVolumeBindingMode() {
        return this.volumeBindingMode;
    }

    public StorageClass(String name, StorageClassArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1beta1:StorageClass", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private StorageClass(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1beta1:StorageClass", name, null, makeResourceOptions(options, id));
    }

    private static StorageClassArgs makeArgs(StorageClassArgs args) {
        var builder = args == null ? StorageClassArgs.builder() : StorageClassArgs.builder(args);
        return builder
            .setApiVersion("storage.k8s.io/v1beta1")
            .setKind("StorageClass")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:storage.k8s.io/v1:StorageClass").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static StorageClass get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StorageClass(name, id, options);
    }
}
