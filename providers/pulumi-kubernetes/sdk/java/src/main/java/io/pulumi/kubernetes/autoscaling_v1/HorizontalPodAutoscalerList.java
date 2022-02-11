// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.autoscaling_v1.HorizontalPodAutoscalerListArgs;
import io.pulumi.kubernetes.autoscaling_v1.outputs.HorizontalPodAutoscaler;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:autoscaling/v1:HorizontalPodAutoscalerList")
public class HorizontalPodAutoscalerList extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="items", type=List.class, parameters={HorizontalPodAutoscaler.class})
    private Output<List<HorizontalPodAutoscaler>> items;

    public Output<List<HorizontalPodAutoscaler>> getItems() {
        return this.items;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=ListMeta.class, parameters={})
    private Output</* @Nullable */ ListMeta> metadata;

    public Output</* @Nullable */ ListMeta> getMetadata() {
        return this.metadata;
    }

    public HorizontalPodAutoscalerList(String name, HorizontalPodAutoscalerListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:autoscaling/v1:HorizontalPodAutoscalerList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private HorizontalPodAutoscalerList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:autoscaling/v1:HorizontalPodAutoscalerList", name, null, makeResourceOptions(options, id));
    }

    private static HorizontalPodAutoscalerListArgs makeArgs(HorizontalPodAutoscalerListArgs args) {
        var builder = args == null ? HorizontalPodAutoscalerListArgs.builder() : HorizontalPodAutoscalerListArgs.builder(args);
        return builder
            .setApiVersion("autoscaling/v1")
            .setKind("HorizontalPodAutoscalerList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static HorizontalPodAutoscalerList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HorizontalPodAutoscalerList(name, id, options);
    }
}
