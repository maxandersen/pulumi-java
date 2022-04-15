// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NFSMountConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final NFSMountConfigurationResponse Empty = new NFSMountConfigurationResponse();

    /**
     * These are 'net use' options in Windows and 'mount' options in Linux.
     * 
     */
    @Import(name="mountOptions")
      private final @Nullable String mountOptions;

    public Optional<String> mountOptions() {
        return this.mountOptions == null ? Optional.empty() : Optional.ofNullable(this.mountOptions);
    }

    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    @Import(name="relativeMountPath", required=true)
      private final String relativeMountPath;

    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    @Import(name="source", required=true)
      private final String source;

    public String source() {
        return this.source;
    }

    public NFSMountConfigurationResponse(
        @Nullable String mountOptions,
        String relativeMountPath,
        String source) {
        this.mountOptions = mountOptions;
        this.relativeMountPath = Objects.requireNonNull(relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private NFSMountConfigurationResponse() {
        this.mountOptions = null;
        this.relativeMountPath = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NFSMountConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mountOptions;
        private String relativeMountPath;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(NFSMountConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountOptions = defaults.mountOptions;
    	      this.relativeMountPath = defaults.relativeMountPath;
    	      this.source = defaults.source;
        }

        public Builder mountOptions(@Nullable String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public Builder relativeMountPath(String relativeMountPath) {
            this.relativeMountPath = Objects.requireNonNull(relativeMountPath);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }        public NFSMountConfigurationResponse build() {
            return new NFSMountConfigurationResponse(mountOptions, relativeMountPath, source);
        }
    }
}
