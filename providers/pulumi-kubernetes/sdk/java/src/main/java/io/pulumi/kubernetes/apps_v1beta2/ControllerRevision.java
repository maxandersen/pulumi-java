// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2;

import com.google.gson.JsonElement;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.apps_v1beta2.ControllerRevisionArgs;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@Deprecated /* apps/v1beta2/ControllerRevision is deprecated by apps/v1/ControllerRevision and not supported by Kubernetes v1.16+ clusters. */
@ResourceType(type="kubernetes:apps/v1beta2:ControllerRevision")
public class ControllerRevision extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="data", type=JsonElement.class, parameters={})
    private Output</* @Nullable */ JsonElement> data;

    public Output</* @Nullable */ JsonElement> getData() {
        return this.data;
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
    @OutputExport(name="revision", type=Integer.class, parameters={})
    private Output<Integer> revision;

    public Output<Integer> getRevision() {
        return this.revision;
    }

    public ControllerRevision(String name, ControllerRevisionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:ControllerRevision", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ControllerRevision(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:ControllerRevision", name, null, makeResourceOptions(options, id));
    }

    private static ControllerRevisionArgs makeArgs(ControllerRevisionArgs args) {
        var builder = args == null ? ControllerRevisionArgs.builder() : ControllerRevisionArgs.builder(args);
        return builder
            .setApiVersion("apps/v1beta2")
            .setKind("ControllerRevision")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:apps/v1:ControllerRevision").build()),
                Input.of(Alias.builder().setType("kubernetes:apps/v1beta1:ControllerRevision").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ControllerRevision get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ControllerRevision(name, id, options);
    }
}
