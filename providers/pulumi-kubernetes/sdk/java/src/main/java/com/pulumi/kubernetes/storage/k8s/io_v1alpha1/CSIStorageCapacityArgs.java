// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CSIStorageCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final CSIStorageCapacityArgs Empty = new CSIStorageCapacityArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> apiVersion() {
        return this.apiVersion == null ? Codegen.empty() : this.apiVersion;
    }

    /**
     * Capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * 
     * The semantic is currently (CSI spec 1.2) defined as: The available capacity, in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable and treated like zero capacity.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<String> capacity;

    public Output<String> capacity() {
        return this.capacity == null ? Codegen.empty() : this.capacity;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * MaximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * 
     * This is defined since CSI spec 1.4.0 as the largest size that may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume claim.
     * 
     */
    @Import(name="maximumVolumeSize")
      private final @Nullable Output<String> maximumVolumeSize;

    public Output<String> maximumVolumeSize() {
        return this.maximumVolumeSize == null ? Codegen.empty() : this.maximumVolumeSize;
    }

    /**
     * Standard object&#39;s metadata. The name has no particular meaning. It must be be a DNS subdomain (dots allowed, 253 characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use csisc-&lt;uuid&gt;, a generated name, or a reverse-domain name which ends with the unique CSI driver name.
     * 
     * Objects are namespaced.
     * 
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * NodeTopology defines which nodes have access to the storage for which capacity was reported. If not set, the storage is not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is immutable.
     * 
     */
    @Import(name="nodeTopology")
      private final @Nullable Output<LabelSelectorArgs> nodeTopology;

    public Output<LabelSelectorArgs> nodeTopology() {
        return this.nodeTopology == null ? Codegen.empty() : this.nodeTopology;
    }

    /**
     * The name of the StorageClass that the reported capacity applies to. It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.
     * 
     */
    @Import(name="storageClassName", required=true)
      private final Output<String> storageClassName;

    public Output<String> storageClassName() {
        return this.storageClassName;
    }

    public CSIStorageCapacityArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> capacity,
        @Nullable Output<String> kind,
        @Nullable Output<String> maximumVolumeSize,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<LabelSelectorArgs> nodeTopology,
        Output<String> storageClassName) {
        this.apiVersion = Codegen.stringProp("apiVersion").output().arg(apiVersion).getNullable();
        this.capacity = capacity;
        this.kind = Codegen.stringProp("kind").output().arg(kind).getNullable();
        this.maximumVolumeSize = maximumVolumeSize;
        this.metadata = metadata;
        this.nodeTopology = nodeTopology;
        this.storageClassName = Objects.requireNonNull(storageClassName, "expected parameter 'storageClassName' to be non-null");
    }

    private CSIStorageCapacityArgs() {
        this.apiVersion = Codegen.empty();
        this.capacity = Codegen.empty();
        this.kind = Codegen.empty();
        this.maximumVolumeSize = Codegen.empty();
        this.metadata = Codegen.empty();
        this.nodeTopology = Codegen.empty();
        this.storageClassName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIStorageCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> capacity;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> maximumVolumeSize;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<LabelSelectorArgs> nodeTopology;
        private Output<String> storageClassName;

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

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder capacity(@Nullable Output<String> capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder capacity(@Nullable String capacity) {
            this.capacity = Codegen.ofNullable(capacity);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder maximumVolumeSize(@Nullable Output<String> maximumVolumeSize) {
            this.maximumVolumeSize = maximumVolumeSize;
            return this;
        }
        public Builder maximumVolumeSize(@Nullable String maximumVolumeSize) {
            this.maximumVolumeSize = Codegen.ofNullable(maximumVolumeSize);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder nodeTopology(@Nullable Output<LabelSelectorArgs> nodeTopology) {
            this.nodeTopology = nodeTopology;
            return this;
        }
        public Builder nodeTopology(@Nullable LabelSelectorArgs nodeTopology) {
            this.nodeTopology = Codegen.ofNullable(nodeTopology);
            return this;
        }
        public Builder storageClassName(Output<String> storageClassName) {
            this.storageClassName = Objects.requireNonNull(storageClassName);
            return this;
        }
        public Builder storageClassName(String storageClassName) {
            this.storageClassName = Output.of(Objects.requireNonNull(storageClassName));
            return this;
        }        public CSIStorageCapacityArgs build() {
            return new CSIStorageCapacityArgs(apiVersion, capacity, kind, maximumVolumeSize, metadata, nodeTopology, storageClassName);
        }
    }
}
