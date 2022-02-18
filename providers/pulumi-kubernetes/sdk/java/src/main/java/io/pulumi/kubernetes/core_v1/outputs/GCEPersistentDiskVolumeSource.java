// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GCEPersistentDiskVolumeSource {
    /**
     * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    private final @Nullable String fsType;
    /**
     * The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    private final @Nullable Integer partition;
    /**
     * Unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    private final String pdName;
    /**
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    private final @Nullable Boolean readOnly;

    @OutputCustomType.Constructor({"fsType","partition","pdName","readOnly"})
    private GCEPersistentDiskVolumeSource(
        @Nullable String fsType,
        @Nullable Integer partition,
        String pdName,
        @Nullable Boolean readOnly) {
        this.fsType = fsType;
        this.partition = partition;
        this.pdName = Objects.requireNonNull(pdName);
        this.readOnly = readOnly;
    }

    /**
     * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    public Optional<Integer> getPartition() {
        return Optional.ofNullable(this.partition);
    }
    /**
     * Unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    public String getPdName() {
        return this.pdName;
    }
    /**
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GCEPersistentDiskVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable Integer partition;
        private String pdName;
        private @Nullable Boolean readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(GCEPersistentDiskVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.partition = defaults.partition;
    	      this.pdName = defaults.pdName;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setPartition(@Nullable Integer partition) {
            this.partition = partition;
            return this;
        }

        public Builder setPdName(String pdName) {
            this.pdName = Objects.requireNonNull(pdName);
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public GCEPersistentDiskVolumeSource build() {
            return new GCEPersistentDiskVolumeSource(fsType, partition, pdName, readOnly);
        }
    }
}
