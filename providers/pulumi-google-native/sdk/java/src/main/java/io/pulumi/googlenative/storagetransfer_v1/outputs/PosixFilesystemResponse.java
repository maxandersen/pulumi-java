// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PosixFilesystemResponse {
    /**
     * Root directory path to the filesystem.
     * 
     */
    private final String rootDirectory;

    @OutputCustomType.Constructor
    private PosixFilesystemResponse(@OutputCustomType.Parameter("rootDirectory") String rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    /**
     * Root directory path to the filesystem.
     * 
    */
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PosixFilesystemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String rootDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(PosixFilesystemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rootDirectory = defaults.rootDirectory;
        }

        public Builder setRootDirectory(String rootDirectory) {
            this.rootDirectory = Objects.requireNonNull(rootDirectory);
            return this;
        }
        public PosixFilesystemResponse build() {
            return new PosixFilesystemResponse(rootDirectory);
        }
    }
}
