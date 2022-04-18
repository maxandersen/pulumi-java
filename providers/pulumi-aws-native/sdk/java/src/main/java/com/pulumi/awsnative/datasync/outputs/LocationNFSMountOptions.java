// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.outputs;

import com.pulumi.awsnative.datasync.enums.LocationNFSMountOptionsVersion;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LocationNFSMountOptions {
    /**
     * The specific NFS version that you want DataSync to use to mount your NFS share.
     * 
     */
    private final @Nullable LocationNFSMountOptionsVersion version;

    @CustomType.Constructor
    private LocationNFSMountOptions(@CustomType.Parameter("version") @Nullable LocationNFSMountOptionsVersion version) {
        this.version = version;
    }

    /**
     * The specific NFS version that you want DataSync to use to mount your NFS share.
     * 
    */
    public Optional<LocationNFSMountOptionsVersion> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationNFSMountOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LocationNFSMountOptionsVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationNFSMountOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(@Nullable LocationNFSMountOptionsVersion version) {
            this.version = version;
            return this;
        }        public LocationNFSMountOptions build() {
            return new LocationNFSMountOptions(version);
        }
    }
}
