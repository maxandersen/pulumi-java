// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.TopologySelectorTerm;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageClass {
    private final @Nullable Boolean allowVolumeExpansion;
    private final @Nullable List<TopologySelectorTerm> allowedTopologies;
    private final @Nullable String apiVersion;
    private final @Nullable String kind;
    private final @Nullable ObjectMeta metadata;
    private final @Nullable List<String> mountOptions;
    private final @Nullable Map<String,String> parameters;
    private final String provisioner;
    private final @Nullable String reclaimPolicy;
    private final @Nullable String volumeBindingMode;

    @OutputCustomType.Constructor({"allowVolumeExpansion","allowedTopologies","apiVersion","kind","metadata","mountOptions","parameters","provisioner","reclaimPolicy","volumeBindingMode"})
    private StorageClass(
        @Nullable Boolean allowVolumeExpansion,
        @Nullable List<TopologySelectorTerm> allowedTopologies,
        @Nullable String apiVersion,
        @Nullable String kind,
        @Nullable ObjectMeta metadata,
        @Nullable List<String> mountOptions,
        @Nullable Map<String,String> parameters,
        String provisioner,
        @Nullable String reclaimPolicy,
        @Nullable String volumeBindingMode) {
        this.allowVolumeExpansion = allowVolumeExpansion;
        this.allowedTopologies = allowedTopologies;
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.mountOptions = mountOptions;
        this.parameters = parameters;
        this.provisioner = Objects.requireNonNull(provisioner);
        this.reclaimPolicy = reclaimPolicy;
        this.volumeBindingMode = volumeBindingMode;
    }

    public Optional<Boolean> getAllowVolumeExpansion() {
        return Optional.ofNullable(this.allowVolumeExpansion);
    }
    public List<TopologySelectorTerm> getAllowedTopologies() {
        return this.allowedTopologies == null ? List.of() : this.allowedTopologies;
    }
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public List<String> getMountOptions() {
        return this.mountOptions == null ? List.of() : this.mountOptions;
    }
    public Map<String,String> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public String getProvisioner() {
        return this.provisioner;
    }
    public Optional<String> getReclaimPolicy() {
        return Optional.ofNullable(this.reclaimPolicy);
    }
    public Optional<String> getVolumeBindingMode() {
        return Optional.ofNullable(this.volumeBindingMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageClass defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowVolumeExpansion;
        private @Nullable List<TopologySelectorTerm> allowedTopologies;
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable List<String> mountOptions;
        private @Nullable Map<String,String> parameters;
        private String provisioner;
        private @Nullable String reclaimPolicy;
        private @Nullable String volumeBindingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageClass defaults) {
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

        public Builder setAllowVolumeExpansion(@Nullable Boolean allowVolumeExpansion) {
            this.allowVolumeExpansion = allowVolumeExpansion;
            return this;
        }

        public Builder setAllowedTopologies(@Nullable List<TopologySelectorTerm> allowedTopologies) {
            this.allowedTopologies = allowedTopologies;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMountOptions(@Nullable List<String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setProvisioner(String provisioner) {
            this.provisioner = Objects.requireNonNull(provisioner);
            return this;
        }

        public Builder setReclaimPolicy(@Nullable String reclaimPolicy) {
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }

        public Builder setVolumeBindingMode(@Nullable String volumeBindingMode) {
            this.volumeBindingMode = volumeBindingMode;
            return this;
        }

        public StorageClass build() {
            return new StorageClass(allowVolumeExpansion, allowedTopologies, apiVersion, kind, metadata, mountOptions, parameters, provisioner, reclaimPolicy, volumeBindingMode);
        }
    }
}
