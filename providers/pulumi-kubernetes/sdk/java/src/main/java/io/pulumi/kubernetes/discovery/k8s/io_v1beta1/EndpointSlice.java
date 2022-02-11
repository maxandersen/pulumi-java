// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1beta1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.discovery.k8s.io_v1beta1.EndpointSliceArgs;
import io.pulumi.kubernetes.discovery.k8s.io_v1beta1.outputs.Endpoint;
import io.pulumi.kubernetes.discovery.k8s.io_v1beta1.outputs.EndpointPort;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:discovery.k8s.io/v1beta1:EndpointSlice")
public class EndpointSlice extends io.pulumi.resources.CustomResource {
    @OutputExport(name="addressType", type=String.class, parameters={})
    private Output<String> addressType;

    public Output<String> getAddressType() {
        return this.addressType;
    }
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="endpoints", type=List.class, parameters={Endpoint.class})
    private Output<List<Endpoint>> endpoints;

    public Output<List<Endpoint>> getEndpoints() {
        return this.endpoints;
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
    @OutputExport(name="ports", type=List.class, parameters={EndpointPort.class})
    private Output</* @Nullable */ List<EndpointPort>> ports;

    public Output</* @Nullable */ List<EndpointPort>> getPorts() {
        return this.ports;
    }

    public EndpointSlice(String name, EndpointSliceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:discovery.k8s.io/v1beta1:EndpointSlice", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private EndpointSlice(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:discovery.k8s.io/v1beta1:EndpointSlice", name, null, makeResourceOptions(options, id));
    }

    private static EndpointSliceArgs makeArgs(EndpointSliceArgs args) {
        var builder = args == null ? EndpointSliceArgs.builder() : EndpointSliceArgs.builder(args);
        return builder
            .setApiVersion("discovery.k8s.io/v1beta1")
            .setKind("EndpointSlice")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:discovery.k8s.io/v1:EndpointSlice").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static EndpointSlice get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EndpointSlice(name, id, options);
    }
}
