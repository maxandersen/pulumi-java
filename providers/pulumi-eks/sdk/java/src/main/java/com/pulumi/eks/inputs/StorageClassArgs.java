// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StorageClass describes the inputs to a single Kubernetes StorageClass provisioned by AWS. Any number of storage classes can be added to a cluster at creation time. One of these storage classes may be configured the default storage class for the cluster.
 * 
 */
public final class StorageClassArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageClassArgs Empty = new StorageClassArgs();

    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand.
     * 
     */
    @Import(name="allowVolumeExpansion")
      private final @Nullable Output<Boolean> allowVolumeExpansion;

    public Output<Boolean> allowVolumeExpansion() {
        return this.allowVolumeExpansion == null ? Codegen.empty() : this.allowVolumeExpansion;
    }

    /**
     * True if this storage class should be a default storage class for the cluster.
     * 
     * Note: As of Kubernetes v1.11+ on EKS, a default `gp2` storage class will always be created automatically for the cluster by the EKS service. See https://docs.aws.amazon.com/eks/latest/userguide/storage-classes.html
     * 
     * Please note that at most one storage class can be marked as default. If two or more of them are marked as default, a PersistentVolumeClaim without `storageClassName` explicitly specified cannot be created. See: https://kubernetes.io/docs/tasks/administer-cluster/change-default-storage-class/#changing-the-default-storageclass
     * 
     */
    @Import(name="default")
      private final @Nullable Output<Boolean> default_;

    public Output<Boolean> default_() {
        return this.default_ == null ? Codegen.empty() : this.default_;
    }

    /**
     * Denotes whether the EBS volume should be encrypted.
     * 
     */
    @Import(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> encrypted() {
        return this.encrypted == null ? Codegen.empty() : this.encrypted;
    }

    /**
     * I/O operations per second per GiB for "io1" volumes. The AWS volume plugin multiplies this with the size of a requested volume to compute IOPS of the volume and caps the result at 20,000 IOPS.
     * 
     */
    @Import(name="iopsPerGb")
      private final @Nullable Output<Integer> iopsPerGb;

    public Output<Integer> iopsPerGb() {
        return this.iopsPerGb == null ? Codegen.empty() : this.iopsPerGb;
    }

    /**
     * The full Amazon Resource Name of the key to use when encrypting the volume. If none is supplied but encrypted is true, a key is generated by AWS.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     * 
     */
    @Import(name="mountOptions")
      private final @Nullable Output<List<String>> mountOptions;

    public Output<List<String>> mountOptions() {
        return this.mountOptions == null ? Codegen.empty() : this.mountOptions;
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
     * 
     */
    @Import(name="reclaimPolicy")
      private final @Nullable Output<String> reclaimPolicy;

    public Output<String> reclaimPolicy() {
        return this.reclaimPolicy == null ? Codegen.empty() : this.reclaimPolicy;
    }

    /**
     * The EBS volume type.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound. When unset, VolumeBindingImmediate is used. This field is alpha-level and is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    @Import(name="volumeBindingMode")
      private final @Nullable Output<String> volumeBindingMode;

    public Output<String> volumeBindingMode() {
        return this.volumeBindingMode == null ? Codegen.empty() : this.volumeBindingMode;
    }

    /**
     * The AWS zone or zones for the EBS volume. If zones is not specified, volumes are generally round-robin-ed across all active zones where Kubernetes cluster has a node. zone and zones parameters must not be used at the same time.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> zones() {
        return this.zones == null ? Codegen.empty() : this.zones;
    }

    public StorageClassArgs(
        @Nullable Output<Boolean> allowVolumeExpansion,
        @Nullable Output<Boolean> default_,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<Integer> iopsPerGb,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<List<String>> mountOptions,
        @Nullable Output<String> reclaimPolicy,
        Output<String> type,
        @Nullable Output<String> volumeBindingMode,
        @Nullable Output<List<String>> zones) {
        this.allowVolumeExpansion = allowVolumeExpansion;
        this.default_ = default_;
        this.encrypted = encrypted;
        this.iopsPerGb = iopsPerGb;
        this.kmsKeyId = kmsKeyId;
        this.metadata = metadata;
        this.mountOptions = mountOptions;
        this.reclaimPolicy = reclaimPolicy;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.volumeBindingMode = volumeBindingMode;
        this.zones = zones;
    }

    private StorageClassArgs() {
        this.allowVolumeExpansion = Codegen.empty();
        this.default_ = Codegen.empty();
        this.encrypted = Codegen.empty();
        this.iopsPerGb = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
        this.metadata = Codegen.empty();
        this.mountOptions = Codegen.empty();
        this.reclaimPolicy = Codegen.empty();
        this.type = Codegen.empty();
        this.volumeBindingMode = Codegen.empty();
        this.zones = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowVolumeExpansion;
        private @Nullable Output<Boolean> default_;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<Integer> iopsPerGb;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<List<String>> mountOptions;
        private @Nullable Output<String> reclaimPolicy;
        private Output<String> type;
        private @Nullable Output<String> volumeBindingMode;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageClassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowVolumeExpansion = defaults.allowVolumeExpansion;
    	      this.default_ = defaults.default_;
    	      this.encrypted = defaults.encrypted;
    	      this.iopsPerGb = defaults.iopsPerGb;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.metadata = defaults.metadata;
    	      this.mountOptions = defaults.mountOptions;
    	      this.reclaimPolicy = defaults.reclaimPolicy;
    	      this.type = defaults.type;
    	      this.volumeBindingMode = defaults.volumeBindingMode;
    	      this.zones = defaults.zones;
        }

        public Builder allowVolumeExpansion(@Nullable Output<Boolean> allowVolumeExpansion) {
            this.allowVolumeExpansion = allowVolumeExpansion;
            return this;
        }
        public Builder allowVolumeExpansion(@Nullable Boolean allowVolumeExpansion) {
            this.allowVolumeExpansion = Codegen.ofNullable(allowVolumeExpansion);
            return this;
        }
        public Builder default_(@Nullable Output<Boolean> default_) {
            this.default_ = default_;
            return this;
        }
        public Builder default_(@Nullable Boolean default_) {
            this.default_ = Codegen.ofNullable(default_);
            return this;
        }
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Codegen.ofNullable(encrypted);
            return this;
        }
        public Builder iopsPerGb(@Nullable Output<Integer> iopsPerGb) {
            this.iopsPerGb = iopsPerGb;
            return this;
        }
        public Builder iopsPerGb(@Nullable Integer iopsPerGb) {
            this.iopsPerGb = Codegen.ofNullable(iopsPerGb);
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
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
        public Builder mountOptions(@Nullable Output<List<String>> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public Builder mountOptions(@Nullable List<String> mountOptions) {
            this.mountOptions = Codegen.ofNullable(mountOptions);
            return this;
        }
        public Builder mountOptions(String... mountOptions) {
            return mountOptions(List.of(mountOptions));
        }
        public Builder reclaimPolicy(@Nullable Output<String> reclaimPolicy) {
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }
        public Builder reclaimPolicy(@Nullable String reclaimPolicy) {
            this.reclaimPolicy = Codegen.ofNullable(reclaimPolicy);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder volumeBindingMode(@Nullable Output<String> volumeBindingMode) {
            this.volumeBindingMode = volumeBindingMode;
            return this;
        }
        public Builder volumeBindingMode(@Nullable String volumeBindingMode) {
            this.volumeBindingMode = Codegen.ofNullable(volumeBindingMode);
            return this;
        }
        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = Codegen.ofNullable(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public StorageClassArgs build() {
            return new StorageClassArgs(allowVolumeExpansion, default_, encrypted, iopsPerGb, kmsKeyId, metadata, mountOptions, reclaimPolicy, type, volumeBindingMode, zones);
        }
    }
}
