// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NFSMountConfigurationResponse {
    /**
     * These are 'net use' options in Windows and 'mount' options in Linux.
     * 
     */
    private final @Nullable String mountOptions;
    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    private final String relativeMountPath;
    private final String source;

    @CustomType.Constructor
    private NFSMountConfigurationResponse(
        @CustomType.Parameter("mountOptions") @Nullable String mountOptions,
        @CustomType.Parameter("relativeMountPath") String relativeMountPath,
        @CustomType.Parameter("source") String source) {
        this.mountOptions = mountOptions;
        this.relativeMountPath = relativeMountPath;
        this.source = source;
    }

    /**
     * These are 'net use' options in Windows and 'mount' options in Linux.
     * 
    */
    public Optional<String> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }
    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
    */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }
    public String source() {
        return this.source;
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
