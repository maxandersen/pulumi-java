// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.awsnative.datasync.inputs.LocationFSxOpenZFSMountOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * FSx OpenZFS file system NFS protocol information
 * 
 */
public final class LocationFSxOpenZFSNFSArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocationFSxOpenZFSNFSArgs Empty = new LocationFSxOpenZFSNFSArgs();

    @Import(name="mountOptions", required=true)
    private Output<LocationFSxOpenZFSMountOptionsArgs> mountOptions;

    public Output<LocationFSxOpenZFSMountOptionsArgs> mountOptions() {
        return this.mountOptions;
    }

    private LocationFSxOpenZFSNFSArgs() {}

    private LocationFSxOpenZFSNFSArgs(LocationFSxOpenZFSNFSArgs $) {
        this.mountOptions = $.mountOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationFSxOpenZFSNFSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationFSxOpenZFSNFSArgs $;

        public Builder() {
            $ = new LocationFSxOpenZFSNFSArgs();
        }

        public Builder(LocationFSxOpenZFSNFSArgs defaults) {
            $ = new LocationFSxOpenZFSNFSArgs(Objects.requireNonNull(defaults));
        }

        public Builder mountOptions(Output<LocationFSxOpenZFSMountOptionsArgs> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        public Builder mountOptions(LocationFSxOpenZFSMountOptionsArgs mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        public LocationFSxOpenZFSNFSArgs build() {
            $.mountOptions = Objects.requireNonNull($.mountOptions, "expected parameter 'mountOptions' to be non-null");
            return $;
        }
    }

}
