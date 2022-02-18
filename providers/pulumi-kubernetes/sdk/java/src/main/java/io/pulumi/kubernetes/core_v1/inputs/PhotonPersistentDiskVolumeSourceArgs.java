// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Photon Controller persistent disk resource.
 * 
 */
public final class PhotonPersistentDiskVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PhotonPersistentDiskVolumeSourceArgs Empty = new PhotonPersistentDiskVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @InputImport(name="fsType")
    private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    /**
     * ID that identifies Photon Controller persistent disk
     * 
     */
    @InputImport(name="pdID", required=true)
    private final Input<String> pdID;

    public Input<String> getPdID() {
        return this.pdID;
    }

    public PhotonPersistentDiskVolumeSourceArgs(
        @Nullable Input<String> fsType,
        Input<String> pdID) {
        this.fsType = fsType;
        this.pdID = Objects.requireNonNull(pdID, "expected parameter 'pdID' to be non-null");
    }

    private PhotonPersistentDiskVolumeSourceArgs() {
        this.fsType = Input.empty();
        this.pdID = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhotonPersistentDiskVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fsType;
        private Input<String> pdID;

        public Builder() {
    	      // Empty
        }

        public Builder(PhotonPersistentDiskVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.pdID = defaults.pdID;
        }

        public Builder setFsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder setPdID(Input<String> pdID) {
            this.pdID = Objects.requireNonNull(pdID);
            return this;
        }

        public Builder setPdID(String pdID) {
            this.pdID = Input.of(Objects.requireNonNull(pdID));
            return this;
        }

        public PhotonPersistentDiskVolumeSourceArgs build() {
            return new PhotonPersistentDiskVolumeSourceArgs(fsType, pdID);
        }
    }
}
