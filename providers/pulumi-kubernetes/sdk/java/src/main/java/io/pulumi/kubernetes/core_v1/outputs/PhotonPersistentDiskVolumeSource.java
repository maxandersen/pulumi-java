// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PhotonPersistentDiskVolumeSource {
    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    private final @Nullable String fsType;
    /**
     * ID that identifies Photon Controller persistent disk
     * 
     */
    private final String pdID;

    @OutputCustomType.Constructor({"fsType","pdID"})
    private PhotonPersistentDiskVolumeSource(
        @Nullable String fsType,
        String pdID) {
        this.fsType = fsType;
        this.pdID = Objects.requireNonNull(pdID);
    }

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * ID that identifies Photon Controller persistent disk
     * 
     */
    public String getPdID() {
        return this.pdID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhotonPersistentDiskVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private String pdID;

        public Builder() {
    	      // Empty
        }

        public Builder(PhotonPersistentDiskVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.pdID = defaults.pdID;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setPdID(String pdID) {
            this.pdID = Objects.requireNonNull(pdID);
            return this;
        }

        public PhotonPersistentDiskVolumeSource build() {
            return new PhotonPersistentDiskVolumeSource(fsType, pdID);
        }
    }
}
