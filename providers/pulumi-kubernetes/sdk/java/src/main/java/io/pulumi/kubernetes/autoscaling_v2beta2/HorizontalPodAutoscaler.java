// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.autoscaling_v2beta2.HorizontalPodAutoscalerArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.HorizontalPodAutoscalerSpec;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.HorizontalPodAutoscalerStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:autoscaling/v2beta2:HorizontalPodAutoscaler")
public class HorizontalPodAutoscaler extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="spec", type=HorizontalPodAutoscalerSpec.class, parameters={})
    private Output</* @Nullable */ HorizontalPodAutoscalerSpec> spec;

    public Output</* @Nullable */ HorizontalPodAutoscalerSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=HorizontalPodAutoscalerStatus.class, parameters={})
    private Output</* @Nullable */ HorizontalPodAutoscalerStatus> status;

    public Output</* @Nullable */ HorizontalPodAutoscalerStatus> getStatus() {
        return this.status;
    }

    public HorizontalPodAutoscaler(String name, @Nullable HorizontalPodAutoscalerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:autoscaling/v2beta2:HorizontalPodAutoscaler", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private HorizontalPodAutoscaler(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:autoscaling/v2beta2:HorizontalPodAutoscaler", name, null, makeResourceOptions(options, id));
    }

    private static HorizontalPodAutoscalerArgs makeArgs(@Nullable HorizontalPodAutoscalerArgs args) {
        var builder = args == null ? HorizontalPodAutoscalerArgs.builder() : HorizontalPodAutoscalerArgs.builder(args);
        return builder
            .setApiVersion("autoscaling/v2beta2")
            .setKind("HorizontalPodAutoscaler")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:autoscaling/v1:HorizontalPodAutoscaler").build()),
                Input.of(Alias.builder().setType("kubernetes:autoscaling/v2:HorizontalPodAutoscaler").build()),
                Input.of(Alias.builder().setType("kubernetes:autoscaling/v2beta1:HorizontalPodAutoscaler").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static HorizontalPodAutoscaler get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HorizontalPodAutoscaler(name, id, options);
    }
}
