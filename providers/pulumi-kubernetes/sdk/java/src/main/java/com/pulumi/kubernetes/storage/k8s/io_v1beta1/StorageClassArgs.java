// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.core_v1.inputs.TopologySelectorTermArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageClassArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageClassArgs Empty = new StorageClassArgs();

    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * 
     */
    @Import(name="allowVolumeExpansion")
    private @Nullable Output<Boolean> allowVolumeExpansion;

    public Optional<Output<Boolean>> allowVolumeExpansion() {
        return Optional.ofNullable(this.allowVolumeExpansion);
    }

    /**
     * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    @Import(name="allowedTopologies")
    private @Nullable Output<List<TopologySelectorTermArgs>> allowedTopologies;

    public Optional<Output<List<TopologySelectorTermArgs>>> allowedTopologies() {
        return Optional.ofNullable(this.allowedTopologies);
    }

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
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. [&#34;ro&#34;, &#34;soft&#34;]. Not validated - mount of the PVs will simply fail if one is invalid.
     * 
     */
    @Import(name="mountOptions")
    private @Nullable Output<List<String>> mountOptions;

    public Optional<Output<List<String>>> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }

    /**
     * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Provisioner indicates the type of the provisioner.
     * 
     */
    @Import(name="provisioner", required=true)
    private Output<String> provisioner;

    public Output<String> provisioner() {
        return this.provisioner;
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
     * 
     */
    @Import(name="reclaimPolicy")
    private @Nullable Output<String> reclaimPolicy;

    public Optional<Output<String>> reclaimPolicy() {
        return Optional.ofNullable(this.reclaimPolicy);
    }

    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    @Import(name="volumeBindingMode")
    private @Nullable Output<String> volumeBindingMode;

    public Optional<Output<String>> volumeBindingMode() {
        return Optional.ofNullable(this.volumeBindingMode);
    }

    private StorageClassArgs() {}

    private StorageClassArgs(StorageClassArgs $) {
        this.allowVolumeExpansion = $.allowVolumeExpansion;
        this.allowedTopologies = $.allowedTopologies;
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.mountOptions = $.mountOptions;
        this.parameters = $.parameters;
        this.provisioner = $.provisioner;
        this.reclaimPolicy = $.reclaimPolicy;
        this.volumeBindingMode = $.volumeBindingMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageClassArgs $;

        public Builder() {
            $ = new StorageClassArgs();
        }

        public Builder(StorageClassArgs defaults) {
            $ = new StorageClassArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowVolumeExpansion(@Nullable Output<Boolean> allowVolumeExpansion) {
            $.allowVolumeExpansion = allowVolumeExpansion;
            return this;
        }

        public Builder allowVolumeExpansion(Boolean allowVolumeExpansion) {
            return allowVolumeExpansion(Output.of(allowVolumeExpansion));
        }

        public Builder allowedTopologies(@Nullable Output<List<TopologySelectorTermArgs>> allowedTopologies) {
            $.allowedTopologies = allowedTopologies;
            return this;
        }

        public Builder allowedTopologies(List<TopologySelectorTermArgs> allowedTopologies) {
            return allowedTopologies(Output.of(allowedTopologies));
        }

        public Builder allowedTopologies(TopologySelectorTermArgs... allowedTopologies) {
            return allowedTopologies(List.of(allowedTopologies));
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder mountOptions(@Nullable Output<List<String>> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        public Builder mountOptions(List<String> mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        public Builder mountOptions(String... mountOptions) {
            return mountOptions(List.of(mountOptions));
        }

        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder provisioner(Output<String> provisioner) {
            $.provisioner = provisioner;
            return this;
        }

        public Builder provisioner(String provisioner) {
            return provisioner(Output.of(provisioner));
        }

        public Builder reclaimPolicy(@Nullable Output<String> reclaimPolicy) {
            $.reclaimPolicy = reclaimPolicy;
            return this;
        }

        public Builder reclaimPolicy(String reclaimPolicy) {
            return reclaimPolicy(Output.of(reclaimPolicy));
        }

        public Builder volumeBindingMode(@Nullable Output<String> volumeBindingMode) {
            $.volumeBindingMode = volumeBindingMode;
            return this;
        }

        public Builder volumeBindingMode(String volumeBindingMode) {
            return volumeBindingMode(Output.of(volumeBindingMode));
        }

        public StorageClassArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            $.provisioner = Objects.requireNonNull($.provisioner, "expected parameter 'provisioner' to be non-null");
            return $;
        }
    }

}
