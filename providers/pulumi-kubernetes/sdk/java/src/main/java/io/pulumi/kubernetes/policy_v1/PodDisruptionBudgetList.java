// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import io.pulumi.kubernetes.policy_v1.PodDisruptionBudgetListArgs;
import io.pulumi.kubernetes.policy_v1.outputs.PodDisruptionBudget;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:policy/v1:PodDisruptionBudgetList")
public class PodDisruptionBudgetList extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="items", type=List.class, parameters={PodDisruptionBudget.class})
    private Output<List<PodDisruptionBudget>> items;

    public Output<List<PodDisruptionBudget>> getItems() {
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

    public PodDisruptionBudgetList(String name, PodDisruptionBudgetListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:policy/v1:PodDisruptionBudgetList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PodDisruptionBudgetList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:policy/v1:PodDisruptionBudgetList", name, null, makeResourceOptions(options, id));
    }

    private static PodDisruptionBudgetListArgs makeArgs(PodDisruptionBudgetListArgs args) {
        var builder = args == null ? PodDisruptionBudgetListArgs.builder() : PodDisruptionBudgetListArgs.builder(args);
        return builder
            .setApiVersion("policy/v1")
            .setKind("PodDisruptionBudgetList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PodDisruptionBudgetList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PodDisruptionBudgetList(name, id, options);
    }
}
