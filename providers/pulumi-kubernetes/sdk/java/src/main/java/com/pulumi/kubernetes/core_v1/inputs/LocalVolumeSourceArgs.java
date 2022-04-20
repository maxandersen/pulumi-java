// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Local represents directly-attached storage with node affinity (Beta feature)
 * 
 */
public final class LocalVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocalVolumeSourceArgs Empty = new LocalVolumeSourceArgs();

    /**
     * Filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. The default value is to auto-select a filesystem if unspecified.
     * 
     */
    @Import(name="fsType")
      private final @Nullable Output<String> fsType;

    public Output<String> fsType() {
        return this.fsType == null ? Codegen.empty() : this.fsType;
    }

    /**
     * The full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    public LocalVolumeSourceArgs(
        @Nullable Output<String> fsType,
        Output<String> path) {
        this.fsType = fsType;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private LocalVolumeSourceArgs() {
        this.fsType = Codegen.empty();
        this.path = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fsType;
        private Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.path = defaults.path;
        }

        public Builder fsType(@Nullable Output<String> fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder fsType(@Nullable String fsType) {
            this.fsType = Codegen.ofNullable(fsType);
            return this;
        }
        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }        public LocalVolumeSourceArgs build() {
            return new LocalVolumeSourceArgs(fsType, path);
        }
    }
}
