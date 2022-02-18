// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.TopologySelectorTermArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StorageClassArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageClassArgs Empty = new StorageClassArgs();

    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * 
     */
    @InputImport(name="allowVolumeExpansion")
    private final @Nullable Input<Boolean> allowVolumeExpansion;

    public Input<Boolean> getAllowVolumeExpansion() {
        return this.allowVolumeExpansion == null ? Input.empty() : this.allowVolumeExpansion;
    }

    /**
     * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    @InputImport(name="allowedTopologies")
    private final @Nullable Input<List<TopologySelectorTermArgs>> allowedTopologies;

    public Input<List<TopologySelectorTermArgs>> getAllowedTopologies() {
        return this.allowedTopologies == null ? Input.empty() : this.allowedTopologies;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     * 
     */
    @InputImport(name="mountOptions")
    private final @Nullable Input<List<String>> mountOptions;

    public Input<List<String>> getMountOptions() {
        return this.mountOptions == null ? Input.empty() : this.mountOptions;
    }

    /**
     * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,String>> parameters;

    public Input<Map<String,String>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Provisioner indicates the type of the provisioner.
     * 
     */
    @InputImport(name="provisioner", required=true)
    private final Input<String> provisioner;

    public Input<String> getProvisioner() {
        return this.provisioner;
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
     * 
     */
    @InputImport(name="reclaimPolicy")
    private final @Nullable Input<String> reclaimPolicy;

    public Input<String> getReclaimPolicy() {
        return this.reclaimPolicy == null ? Input.empty() : this.reclaimPolicy;
    }

    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    @InputImport(name="volumeBindingMode")
    private final @Nullable Input<String> volumeBindingMode;

    public Input<String> getVolumeBindingMode() {
        return this.volumeBindingMode == null ? Input.empty() : this.volumeBindingMode;
    }

    public StorageClassArgs(
        @Nullable Input<Boolean> allowVolumeExpansion,
        @Nullable Input<List<TopologySelectorTermArgs>> allowedTopologies,
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<List<String>> mountOptions,
        @Nullable Input<Map<String,String>> parameters,
        Input<String> provisioner,
        @Nullable Input<String> reclaimPolicy,
        @Nullable Input<String> volumeBindingMode) {
        this.allowVolumeExpansion = allowVolumeExpansion;
        this.allowedTopologies = allowedTopologies;
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.mountOptions = mountOptions;
        this.parameters = parameters;
        this.provisioner = Objects.requireNonNull(provisioner, "expected parameter 'provisioner' to be non-null");
        this.reclaimPolicy = reclaimPolicy;
        this.volumeBindingMode = volumeBindingMode;
    }

    private StorageClassArgs() {
        this.allowVolumeExpansion = Input.empty();
        this.allowedTopologies = Input.empty();
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.mountOptions = Input.empty();
        this.parameters = Input.empty();
        this.provisioner = Input.empty();
        this.reclaimPolicy = Input.empty();
        this.volumeBindingMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowVolumeExpansion;
        private @Nullable Input<List<TopologySelectorTermArgs>> allowedTopologies;
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<List<String>> mountOptions;
        private @Nullable Input<Map<String,String>> parameters;
        private Input<String> provisioner;
        private @Nullable Input<String> reclaimPolicy;
        private @Nullable Input<String> volumeBindingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageClassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowVolumeExpansion = defaults.allowVolumeExpansion;
    	      this.allowedTopologies = defaults.allowedTopologies;
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.mountOptions = defaults.mountOptions;
    	      this.parameters = defaults.parameters;
    	      this.provisioner = defaults.provisioner;
    	      this.reclaimPolicy = defaults.reclaimPolicy;
    	      this.volumeBindingMode = defaults.volumeBindingMode;
        }

        public Builder setAllowVolumeExpansion(@Nullable Input<Boolean> allowVolumeExpansion) {
            this.allowVolumeExpansion = allowVolumeExpansion;
            return this;
        }

        public Builder setAllowVolumeExpansion(@Nullable Boolean allowVolumeExpansion) {
            this.allowVolumeExpansion = Input.ofNullable(allowVolumeExpansion);
            return this;
        }

        public Builder setAllowedTopologies(@Nullable Input<List<TopologySelectorTermArgs>> allowedTopologies) {
            this.allowedTopologies = allowedTopologies;
            return this;
        }

        public Builder setAllowedTopologies(@Nullable List<TopologySelectorTermArgs> allowedTopologies) {
            this.allowedTopologies = Input.ofNullable(allowedTopologies);
            return this;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setMountOptions(@Nullable Input<List<String>> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder setMountOptions(@Nullable List<String> mountOptions) {
            this.mountOptions = Input.ofNullable(mountOptions);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setProvisioner(Input<String> provisioner) {
            this.provisioner = Objects.requireNonNull(provisioner);
            return this;
        }

        public Builder setProvisioner(String provisioner) {
            this.provisioner = Input.of(Objects.requireNonNull(provisioner));
            return this;
        }

        public Builder setReclaimPolicy(@Nullable Input<String> reclaimPolicy) {
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }

        public Builder setReclaimPolicy(@Nullable String reclaimPolicy) {
            this.reclaimPolicy = Input.ofNullable(reclaimPolicy);
            return this;
        }

        public Builder setVolumeBindingMode(@Nullable Input<String> volumeBindingMode) {
            this.volumeBindingMode = volumeBindingMode;
            return this;
        }

        public Builder setVolumeBindingMode(@Nullable String volumeBindingMode) {
            this.volumeBindingMode = Input.ofNullable(volumeBindingMode);
            return this;
        }

        public StorageClassArgs build() {
            return new StorageClassArgs(allowVolumeExpansion, allowedTopologies, apiVersion, kind, metadata, mountOptions, parameters, provisioner, reclaimPolicy, volumeBindingMode);
        }
    }
}
