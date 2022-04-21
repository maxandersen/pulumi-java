// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.apps_v1.inputs.DaemonSetArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ListMetaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DaemonSetListArgs extends com.pulumi.resources.ResourceArgs {

    public static final DaemonSetListArgs Empty = new DaemonSetListArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * A list of daemon sets.
     * 
     */
    @Import(name="items", required=true)
    private Output<List<DaemonSetArgs>> items;

    public Output<List<DaemonSetArgs>> items() {
        return this.items;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ListMetaArgs> metadata;

    public Optional<Output<ListMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    private DaemonSetListArgs() {}

    private DaemonSetListArgs(DaemonSetListArgs $) {
        this.apiVersion = $.apiVersion;
        this.items = $.items;
        this.kind = $.kind;
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DaemonSetListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DaemonSetListArgs $;

        public Builder() {
            $ = new DaemonSetListArgs();
        }

        public Builder(DaemonSetListArgs defaults) {
            $ = new DaemonSetListArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        public Builder items(Output<List<DaemonSetArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<DaemonSetArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(DaemonSetArgs... items) {
            return items(List.of(items));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder metadata(@Nullable Output<ListMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(ListMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        public DaemonSetListArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
