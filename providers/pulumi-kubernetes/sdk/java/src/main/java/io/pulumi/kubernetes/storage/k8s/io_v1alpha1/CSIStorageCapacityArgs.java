// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CSIStorageCapacityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CSIStorageCapacityArgs Empty = new CSIStorageCapacityArgs();

    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    @InputImport(name="capacity")
    private final @Nullable Input<String> capacity;

    public Input<String> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="maximumVolumeSize")
    private final @Nullable Input<String> maximumVolumeSize;

    public Input<String> getMaximumVolumeSize() {
        return this.maximumVolumeSize == null ? Input.empty() : this.maximumVolumeSize;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="nodeTopology")
    private final @Nullable Input<LabelSelectorArgs> nodeTopology;

    public Input<LabelSelectorArgs> getNodeTopology() {
        return this.nodeTopology == null ? Input.empty() : this.nodeTopology;
    }

    @InputImport(name="storageClassName", required=true)
    private final Input<String> storageClassName;

    public Input<String> getStorageClassName() {
        return this.storageClassName;
    }

    public CSIStorageCapacityArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> capacity,
        @Nullable Input<String> kind,
        @Nullable Input<String> maximumVolumeSize,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<LabelSelectorArgs> nodeTopology,
        Input<String> storageClassName) {
        this.apiVersion = apiVersion;
        this.capacity = capacity;
        this.kind = kind;
        this.maximumVolumeSize = maximumVolumeSize;
        this.metadata = metadata;
        this.nodeTopology = nodeTopology;
        this.storageClassName = Objects.requireNonNull(storageClassName, "expected parameter 'storageClassName' to be non-null");
    }

    private CSIStorageCapacityArgs() {
        this.apiVersion = Input.empty();
        this.capacity = Input.empty();
        this.kind = Input.empty();
        this.maximumVolumeSize = Input.empty();
        this.metadata = Input.empty();
        this.nodeTopology = Input.empty();
        this.storageClassName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIStorageCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> capacity;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> maximumVolumeSize;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<LabelSelectorArgs> nodeTopology;
        private Input<String> storageClassName;

        public Builder() {
    	      // Empty
        }

        public Builder(CSIStorageCapacityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.capacity = defaults.capacity;
    	      this.kind = defaults.kind;
    	      this.maximumVolumeSize = defaults.maximumVolumeSize;
    	      this.metadata = defaults.metadata;
    	      this.nodeTopology = defaults.nodeTopology;
    	      this.storageClassName = defaults.storageClassName;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setCapacity(@Nullable Input<String> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setCapacity(@Nullable String capacity) {
            this.capacity = Input.ofNullable(capacity);
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

        public Builder setMaximumVolumeSize(@Nullable Input<String> maximumVolumeSize) {
            this.maximumVolumeSize = maximumVolumeSize;
            return this;
        }

        public Builder setMaximumVolumeSize(@Nullable String maximumVolumeSize) {
            this.maximumVolumeSize = Input.ofNullable(maximumVolumeSize);
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

        public Builder setNodeTopology(@Nullable Input<LabelSelectorArgs> nodeTopology) {
            this.nodeTopology = nodeTopology;
            return this;
        }

        public Builder setNodeTopology(@Nullable LabelSelectorArgs nodeTopology) {
            this.nodeTopology = Input.ofNullable(nodeTopology);
            return this;
        }

        public Builder setStorageClassName(Input<String> storageClassName) {
            this.storageClassName = Objects.requireNonNull(storageClassName);
            return this;
        }

        public Builder setStorageClassName(String storageClassName) {
            this.storageClassName = Input.of(Objects.requireNonNull(storageClassName));
            return this;
        }

        public CSIStorageCapacityArgs build() {
            return new CSIStorageCapacityArgs(apiVersion, capacity, kind, maximumVolumeSize, metadata, nodeTopology, storageClassName);
        }
    }
}
